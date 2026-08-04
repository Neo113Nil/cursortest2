package com.gamericefishpro.space.ng;

import com.gamericefishpro.space.ph.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.gamericefishpro.space.mg.a, com.gamericefishpro.space.rg.a {
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.rg.b _sessionService;
    private final f dataRepository;
    private final ConcurrentHashMap<String, a> trackers;

    public g(com.gamericefishpro.space.rg.b _sessionService, com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.gd.b preferences, com.gamericefishpro.space.kd.a timeProvider) {
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this._sessionService = _sessionService;
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        this.trackers = concurrentHashMap;
        f fVar = new f(preferences, _configModelStore);
        this.dataRepository = fVar;
        e eVar = e.INSTANCE;
        concurrentHashMap.put(eVar.getIAM_TAG(), new d(fVar, timeProvider));
        concurrentHashMap.put(eVar.getNOTIFICATION_TAG(), new h(fVar, timeProvider));
        _sessionService.subscribe(this);
        Collection<a> collectionValues = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((a) it.next()).initInfluencedTypeFromCache();
        }
    }

    private final void attemptSessionUpgrade(com.gamericefishpro.space.lc.b bVar, String str) {
        boolean sessionTracker;
        com.gamericefishpro.space.mg.b currentSessionInfluence;
        com.gamericefishpro.space.od.b.debug$default("InfluenceManager.attemptSessionUpgrade(entryAction: " + bVar + ", directId: " + str + ')', null, 2, null);
        b channelByEntryAction = getChannelByEntryAction(bVar);
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        if (channelByEntryAction != null) {
            currentSessionInfluence = channelByEntryAction.getCurrentSessionInfluence();
            com.gamericefishpro.space.mg.d dVar = com.gamericefishpro.space.mg.d.DIRECT;
            if (str == null) {
                str = channelByEntryAction.getDirectId();
            }
            sessionTracker = setSessionTracker(channelByEntryAction, dVar, str, null);
        } else {
            sessionTracker = false;
            currentSessionInfluence = null;
        }
        if (sessionTracker) {
            com.gamericefishpro.space.od.b.debug$default("InfluenceManager.attemptSessionUpgrade: channel updated, search for ending direct influences on channels: " + channelsToResetByEntryAction, null, 2, null);
            Intrinsics.b(currentSessionInfluence);
            arrayList.add(currentSessionInfluence);
            for (b bVar2 : channelsToResetByEntryAction) {
                com.gamericefishpro.space.mg.d influenceType = bVar2.getInfluenceType();
                if (influenceType != null && influenceType.isDirect()) {
                    arrayList.add(bVar2.getCurrentSessionInfluence());
                    bVar2.resetAndInitInfluence();
                }
            }
        }
        com.gamericefishpro.space.od.b.debug$default("InfluenceManager.attemptSessionUpgrade: try UNATTRIBUTED to INDIRECT upgrade", null, 2, null);
        for (b bVar3 : channelsToResetByEntryAction) {
            com.gamericefishpro.space.mg.d influenceType2 = bVar3.getInfluenceType();
            if (influenceType2 != null && influenceType2.isUnattributed()) {
                JSONArray lastReceivedIds = bVar3.getLastReceivedIds();
                if (lastReceivedIds.length() > 0 && !bVar.isAppClose()) {
                    com.gamericefishpro.space.mg.b currentSessionInfluence2 = bVar3.getCurrentSessionInfluence();
                    if (setSessionTracker(bVar3, com.gamericefishpro.space.mg.d.INDIRECT, null, lastReceivedIds)) {
                        arrayList.add(currentSessionInfluence2);
                    }
                }
            }
        }
        com.gamericefishpro.space.od.b.debug$default("InfluenceManager.attemptSessionUpgrade: Trackers after update attempt: " + getChannels(), null, 2, null);
    }

    public static /* synthetic */ void attemptSessionUpgrade$default(g gVar, com.gamericefishpro.space.lc.b bVar, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        gVar.attemptSessionUpgrade(bVar, str);
    }

    private final b getChannelByEntryAction(com.gamericefishpro.space.lc.b bVar) {
        if (bVar.isNotificationClick()) {
            return getNotificationChannelTracker();
        }
        return null;
    }

    private final List<b> getChannels() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getNotificationChannelTracker());
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    private final List<b> getChannelsToResetByEntryAction(com.gamericefishpro.space.lc.b bVar) {
        ArrayList arrayList = new ArrayList();
        if (bVar.isAppClose()) {
            return arrayList;
        }
        b notificationChannelTracker = bVar.isAppOpen() ? getNotificationChannelTracker() : null;
        if (notificationChannelTracker != null) {
            arrayList.add(notificationChannelTracker);
        }
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    private final b getIAMChannelTracker() {
        a aVar = this.trackers.get(e.INSTANCE.getIAM_TAG());
        Intrinsics.b(aVar);
        return aVar;
    }

    private final b getNotificationChannelTracker() {
        a aVar = this.trackers.get(e.INSTANCE.getNOTIFICATION_TAG());
        Intrinsics.b(aVar);
        return aVar;
    }

    private final void restartSessionTrackersIfNeeded(com.gamericefishpro.space.lc.b bVar) {
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        com.gamericefishpro.space.od.b.debug$default("InfluenceManager.restartSessionIfNeeded(entryAction: " + bVar + "):\n channelTrackers: " + channelsToResetByEntryAction, null, 2, null);
        for (b bVar2 : channelsToResetByEntryAction) {
            JSONArray lastReceivedIds = bVar2.getLastReceivedIds();
            com.gamericefishpro.space.od.b.debug$default("InfluenceManager.restartSessionIfNeeded: lastIds: " + lastReceivedIds, null, 2, null);
            com.gamericefishpro.space.mg.b currentSessionInfluence = bVar2.getCurrentSessionInfluence();
            if (lastReceivedIds.length() > 0 ? setSessionTracker(bVar2, com.gamericefishpro.space.mg.d.INDIRECT, null, lastReceivedIds) : setSessionTracker(bVar2, com.gamericefishpro.space.mg.d.UNATTRIBUTED, null, null)) {
                arrayList.add(currentSessionInfluence);
            }
        }
    }

    private final boolean setSessionTracker(b bVar, com.gamericefishpro.space.mg.d dVar, String str, JSONArray jSONArray) {
        if (!willChangeSessionTracker(bVar, dVar, str, jSONArray)) {
            return false;
        }
        com.gamericefishpro.space.od.b.debug$default(com.gamericefishpro.space.mi.h.c("\n            ChannelTracker changed: " + bVar.getIdTag() + "\n            from:\n            influenceType: " + bVar.getInfluenceType() + ", directNotificationId: " + bVar.getDirectId() + ", indirectNotificationIds: " + bVar.getIndirectIds() + "\n            to:\n            influenceType: " + dVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray + "\n            "), null, 2, null);
        bVar.setInfluenceType(dVar);
        bVar.setDirectId(str);
        bVar.setIndirectIds(jSONArray);
        bVar.cacheState();
        StringBuilder sb = new StringBuilder("InfluenceManager.setSessionTracker: Trackers changed to: ");
        sb.append(getChannels());
        com.gamericefishpro.space.od.b.debug$default(sb.toString(), null, 2, null);
        return true;
    }

    private final boolean willChangeSessionTracker(b bVar, com.gamericefishpro.space.mg.d dVar, String str, JSONArray jSONArray) {
        if (dVar != bVar.getInfluenceType()) {
            return true;
        }
        com.gamericefishpro.space.mg.d influenceType = bVar.getInfluenceType();
        if (influenceType != null && influenceType.isDirect() && bVar.getDirectId() != null && !Intrinsics.a(bVar.getDirectId(), str)) {
            return true;
        }
        if (influenceType == null || !influenceType.isIndirect() || bVar.getIndirectIds() == null) {
            return false;
        }
        JSONArray indirectIds = bVar.getIndirectIds();
        Intrinsics.b(indirectIds);
        return indirectIds.length() > 0 && !com.gamericefishpro.space.yb.e.INSTANCE.compareJSONArrays(bVar.getIndirectIds(), jSONArray);
    }

    @Override // com.gamericefishpro.space.mg.a
    public List<com.gamericefishpro.space.mg.b> getInfluences() {
        Collection<a> collectionValues = this.trackers.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Collection<a> collection = collectionValues;
        ArrayList arrayList = new ArrayList(y.j(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).getCurrentSessionInfluence());
        }
        return arrayList;
    }

    @Override // com.gamericefishpro.space.mg.a
    public void onDirectInfluenceFromIAM(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        com.gamericefishpro.space.od.b.debug$default("InfluenceManager.onDirectInfluenceFromIAM(messageId: " + messageId + ')', null, 2, null);
        setSessionTracker(getIAMChannelTracker(), com.gamericefishpro.space.mg.d.DIRECT, messageId, null);
    }

    @Override // com.gamericefishpro.space.mg.a
    public void onDirectInfluenceFromNotification(String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        com.gamericefishpro.space.od.b.debug$default("InfluenceManager.onDirectInfluenceFromNotification(notificationId: " + notificationId + ')', null, 2, null);
        if (notificationId.length() == 0) {
            return;
        }
        attemptSessionUpgrade(com.gamericefishpro.space.lc.b.NOTIFICATION_CLICK, notificationId);
    }

    @Override // com.gamericefishpro.space.mg.a
    public void onInAppMessageDismissed() {
        com.gamericefishpro.space.od.b.debug$default("InfluenceManager.onInAppMessageDismissed()", null, 2, null);
        getIAMChannelTracker().resetAndInitInfluence();
    }

    @Override // com.gamericefishpro.space.mg.a
    public void onInAppMessageDisplayed(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        com.gamericefishpro.space.od.b.debug$default("InfluenceManager.onInAppMessageReceived(messageId: " + messageId + ')', null, 2, null);
        b iAMChannelTracker = getIAMChannelTracker();
        iAMChannelTracker.saveLastId(messageId);
        iAMChannelTracker.resetAndInitInfluence();
    }

    @Override // com.gamericefishpro.space.mg.a
    public void onNotificationReceived(String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        com.gamericefishpro.space.od.b.debug$default("InfluenceManager.onNotificationReceived(notificationId: " + notificationId + ')', null, 2, null);
        if (notificationId.length() == 0) {
            return;
        }
        getNotificationChannelTracker().saveLastId(notificationId);
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionActive() {
        attemptSessionUpgrade$default(this, this._applicationService.getEntryState(), null, 2, null);
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionStarted() {
        restartSessionTrackersIfNeeded(this._applicationService.getEntryState());
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionEnded(long j) {
    }
}
