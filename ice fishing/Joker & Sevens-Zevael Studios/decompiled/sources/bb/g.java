package bb;

import bc.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements ab.a, eb.a {
    private final q8.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final eb.b _sessionService;
    private final f dataRepository;
    private final ConcurrentHashMap<String, a> trackers;

    public g(eb.b bVar, q8.f fVar, com.onesignal.core.internal.config.b bVar2, c9.b bVar3, e9.a aVar) {
        j.e(bVar, "_sessionService");
        j.e(fVar, "_applicationService");
        j.e(bVar2, "_configModelStore");
        j.e(bVar3, "preferences");
        j.e(aVar, "timeProvider");
        this._sessionService = bVar;
        this._applicationService = fVar;
        this._configModelStore = bVar2;
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        this.trackers = concurrentHashMap;
        f fVar2 = new f(bVar3, bVar2);
        this.dataRepository = fVar2;
        e eVar = e.INSTANCE;
        concurrentHashMap.put(eVar.getIAM_TAG(), new d(fVar2, aVar));
        concurrentHashMap.put(eVar.getNOTIFICATION_TAG(), new h(fVar2, aVar));
        bVar.subscribe(this);
        Collection<a> values = concurrentHashMap.values();
        j.d(values, "trackers.values");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((a) it.next()).initInfluencedTypeFromCache();
        }
    }

    private final void attemptSessionUpgrade(q8.b bVar, String str) {
        boolean z10;
        ab.b bVar2;
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade(entryAction: " + bVar + ", directId: " + str + ')', null, 2, null);
        b channelByEntryAction = getChannelByEntryAction(bVar);
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        if (channelByEntryAction != null) {
            bVar2 = channelByEntryAction.getCurrentSessionInfluence();
            ab.d dVar = ab.d.DIRECT;
            if (str == null) {
                str = channelByEntryAction.getDirectId();
            }
            z10 = setSessionTracker(channelByEntryAction, dVar, str, null);
        } else {
            z10 = false;
            bVar2 = null;
        }
        if (z10) {
            com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: channel updated, search for ending direct influences on channels: " + channelsToResetByEntryAction, null, 2, null);
            j.b(bVar2);
            arrayList.add(bVar2);
            for (b bVar3 : channelsToResetByEntryAction) {
                ab.d influenceType = bVar3.getInfluenceType();
                if (influenceType != null && influenceType.isDirect()) {
                    arrayList.add(bVar3.getCurrentSessionInfluence());
                    bVar3.resetAndInitInfluence();
                }
            }
        }
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: try UNATTRIBUTED to INDIRECT upgrade", null, 2, null);
        for (b bVar4 : channelsToResetByEntryAction) {
            ab.d influenceType2 = bVar4.getInfluenceType();
            if (influenceType2 != null && influenceType2.isUnattributed()) {
                JSONArray lastReceivedIds = bVar4.getLastReceivedIds();
                if (lastReceivedIds.length() > 0 && !bVar.isAppClose()) {
                    ab.b currentSessionInfluence = bVar4.getCurrentSessionInfluence();
                    if (setSessionTracker(bVar4, ab.d.INDIRECT, null, lastReceivedIds)) {
                        arrayList.add(currentSessionInfluence);
                    }
                }
            }
        }
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.attemptSessionUpgrade: Trackers after update attempt: " + getChannels(), null, 2, null);
    }

    public static /* synthetic */ void attemptSessionUpgrade$default(g gVar, q8.b bVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        gVar.attemptSessionUpgrade(bVar, str);
    }

    private final b getChannelByEntryAction(q8.b bVar) {
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

    private final List<b> getChannelsToResetByEntryAction(q8.b bVar) {
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
        j.b(aVar);
        return aVar;
    }

    private final b getNotificationChannelTracker() {
        a aVar = this.trackers.get(e.INSTANCE.getNOTIFICATION_TAG());
        j.b(aVar);
        return aVar;
    }

    private final void restartSessionTrackersIfNeeded(q8.b bVar) {
        List<b> channelsToResetByEntryAction = getChannelsToResetByEntryAction(bVar);
        ArrayList arrayList = new ArrayList();
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.restartSessionIfNeeded(entryAction: " + bVar + "):\n channelTrackers: " + channelsToResetByEntryAction, null, 2, null);
        for (b bVar2 : channelsToResetByEntryAction) {
            JSONArray lastReceivedIds = bVar2.getLastReceivedIds();
            com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.restartSessionIfNeeded: lastIds: " + lastReceivedIds, null, 2, null);
            ab.b currentSessionInfluence = bVar2.getCurrentSessionInfluence();
            if (lastReceivedIds.length() > 0 ? setSessionTracker(bVar2, ab.d.INDIRECT, null, lastReceivedIds) : setSessionTracker(bVar2, ab.d.UNATTRIBUTED, null, null)) {
                arrayList.add(currentSessionInfluence);
            }
        }
    }

    private final boolean setSessionTracker(b bVar, ab.d dVar, String str, JSONArray jSONArray) {
        if (!willChangeSessionTracker(bVar, dVar, str, jSONArray)) {
            return false;
        }
        com.onesignal.debug.internal.logging.b.debug$default(xc.c.m("\n            ChannelTracker changed: " + bVar.getIdTag() + "\n            from:\n            influenceType: " + bVar.getInfluenceType() + ", directNotificationId: " + bVar.getDirectId() + ", indirectNotificationIds: " + bVar.getIndirectIds() + "\n            to:\n            influenceType: " + dVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray + "\n            "), null, 2, null);
        bVar.setInfluenceType(dVar);
        bVar.setDirectId(str);
        bVar.setIndirectIds(jSONArray);
        bVar.cacheState();
        StringBuilder sb = new StringBuilder("InfluenceManager.setSessionTracker: Trackers changed to: ");
        sb.append(getChannels());
        com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
        return true;
    }

    private final boolean willChangeSessionTracker(b bVar, ab.d dVar, String str, JSONArray jSONArray) {
        if (dVar != bVar.getInfluenceType()) {
            return true;
        }
        ab.d influenceType = bVar.getInfluenceType();
        if (influenceType != null && influenceType.isDirect() && bVar.getDirectId() != null && !j.a(bVar.getDirectId(), str)) {
            return true;
        }
        if (influenceType == null || !influenceType.isIndirect() || bVar.getIndirectIds() == null) {
            return false;
        }
        JSONArray indirectIds = bVar.getIndirectIds();
        j.b(indirectIds);
        return indirectIds.length() > 0 && !com.onesignal.common.g.INSTANCE.compareJSONArrays(bVar.getIndirectIds(), jSONArray);
    }

    @Override // ab.a
    public List<ab.b> getInfluences() {
        Collection<a> values = this.trackers.values();
        j.d(values, "trackers.values");
        Collection<a> collection = values;
        ArrayList arrayList = new ArrayList(o.O(collection));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).getCurrentSessionInfluence());
        }
        return arrayList;
    }

    @Override // ab.a
    public void onDirectInfluenceFromIAM(String str) {
        j.e(str, "messageId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onDirectInfluenceFromIAM(messageId: " + str + ')', null, 2, null);
        setSessionTracker(getIAMChannelTracker(), ab.d.DIRECT, str, null);
    }

    @Override // ab.a
    public void onDirectInfluenceFromNotification(String str) {
        j.e(str, "notificationId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onDirectInfluenceFromNotification(notificationId: " + str + ')', null, 2, null);
        if (str.length() == 0) {
            return;
        }
        attemptSessionUpgrade(q8.b.NOTIFICATION_CLICK, str);
    }

    @Override // ab.a
    public void onInAppMessageDismissed() {
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onInAppMessageDismissed()", null, 2, null);
        getIAMChannelTracker().resetAndInitInfluence();
    }

    @Override // ab.a
    public void onInAppMessageDisplayed(String str) {
        j.e(str, "messageId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onInAppMessageReceived(messageId: " + str + ')', null, 2, null);
        b iAMChannelTracker = getIAMChannelTracker();
        iAMChannelTracker.saveLastId(str);
        iAMChannelTracker.resetAndInitInfluence();
    }

    @Override // ab.a
    public void onNotificationReceived(String str) {
        j.e(str, "notificationId");
        com.onesignal.debug.internal.logging.b.debug$default("InfluenceManager.onNotificationReceived(notificationId: " + str + ')', null, 2, null);
        if (str.length() == 0) {
            return;
        }
        getNotificationChannelTracker().saveLastId(str);
    }

    @Override // eb.a
    public void onSessionActive() {
        attemptSessionUpgrade$default(this, this._applicationService.getEntryState(), null, 2, null);
    }

    @Override // eb.a
    public void onSessionStarted() {
        restartSessionTrackersIfNeeded(this._applicationService.getEntryState());
    }

    @Override // eb.a
    public void onSessionEnded(long j3) {
    }
}
