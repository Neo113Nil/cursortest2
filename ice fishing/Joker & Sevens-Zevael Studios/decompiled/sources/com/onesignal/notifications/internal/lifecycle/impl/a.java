package com.onesignal.notifications.internal.lifecycle.impl;

import ac.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import bc.k;
import ca.l;
import ca.m;
import com.onesignal.common.AndroidUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements ra.b, com.onesignal.notifications.internal.a {
    private final da.a _analyticsTracker;
    private final q8.f _applicationService;
    private final fa.a _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final v8.c _deviceService;
    private final ab.a _influenceManager;
    private final va.b _receiveReceiptWorkManager;
    private final ob.b _subscriptionManager;
    private final e9.a _time;
    private final com.onesignal.common.events.b extOpenedCallback;
    private final com.onesignal.common.events.a extRemoteReceivedCallback;
    private final com.onesignal.common.events.b extWillShowInForegroundCallback;
    private final com.onesignal.common.events.a intLifecycleCallback;
    private final Set<String> postedOpenedNotifIds;
    private final k unprocessedOpenedNotifs;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0054a extends pc.k implements oc.c {
        final /* synthetic */ com.onesignal.notifications.internal.d $openedResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0054a(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openedResult = dVar;
        }

        @Override // oc.c
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((ca.h) null);
            return o.f277a;
        }

        public final void invoke(ca.h hVar) {
            pc.j.e(hVar, "it");
            hVar.a();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.j implements oc.e {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ pc.o $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pc.o oVar, Activity activity, JSONObject jSONObject, fc.d dVar) {
            super(2, dVar);
            this.$canOpen = oVar;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            c cVar = new c(this.$canOpen, this.$activity, this.$data, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            pc.o oVar;
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                ra.a aVar = (ra.a) this.L$0;
                oVar = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = oVar;
                this.label = 1;
                obj = aVar.canOpenNotification(activity, jSONObject, this);
                gc.a aVar2 = gc.a.f2559g;
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = (pc.o) this.L$0;
                v6.a.W(obj);
            }
            oVar.f5679g = ((Boolean) obj).booleanValue();
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(ra.a aVar, fc.d dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.j implements oc.e {
        final /* synthetic */ pc.o $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pc.o oVar, JSONObject jSONObject, fc.d dVar) {
            super(2, dVar);
            this.$canReceive = oVar;
            this.$jsonPayload = jSONObject;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            e eVar = new e(this.$canReceive, this.$jsonPayload, dVar);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            pc.o oVar;
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                ra.a aVar = (ra.a) this.L$0;
                oVar = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = oVar;
                this.label = 1;
                obj = aVar.canReceiveNotification(jSONObject, this);
                gc.a aVar2 = gc.a.f2559g;
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = (pc.o) this.L$0;
                v6.a.W(obj);
            }
            oVar.f5679g = ((Boolean) obj).booleanValue();
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(ra.a aVar, fc.d dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends pc.k implements oc.c {
        final /* synthetic */ m $willDisplayEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m mVar) {
            super(1);
            this.$willDisplayEvent = mVar;
        }

        @Override // oc.c
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((ca.j) null);
            return o.f277a;
        }

        public final void invoke(ca.j jVar) {
            pc.j.e(jVar, "it");
            jVar.a();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends pc.k implements oc.c {
        final /* synthetic */ ca.k $notificationReceivedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ca.k kVar) {
            super(1);
            this.$notificationReceivedEvent = kVar;
        }

        @Override // oc.c
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((l) null);
            return o.f277a;
        }

        public final void invoke(l lVar) {
            pc.j.e(lVar, "it");
            lVar.a();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.notificationOpened(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class i extends hc.j implements oc.c {
        final /* synthetic */ String $appId;
        final /* synthetic */ v8.a $deviceType;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ String $subscriptionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, String str3, v8.a aVar, fc.d dVar) {
            super(1, dVar);
            this.$appId = str;
            this.$notificationId = str2;
            this.$subscriptionId = str3;
            this.$deviceType = aVar;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return a.this.new i(this.$appId, this.$notificationId, this.$subscriptionId, this.$deviceType, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((i) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    v6.a.W(obj);
                    fa.a aVar = a.this._backend;
                    String str = this.$appId;
                    String str2 = this.$notificationId;
                    String str3 = this.$subscriptionId;
                    v8.a aVar2 = this.$deviceType;
                    this.label = 1;
                    Object updateNotificationAsOpened = aVar.updateNotificationAsOpened(str, str2, str3, aVar2, this);
                    gc.a aVar3 = gc.a.f2559g;
                    if (updateNotificationAsOpened == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
            } catch (l8.a e10) {
                com.onesignal.debug.internal.logging.b.error$default("Notification opened confirmation failed with statusCode: " + e10.getStatusCode() + " response: " + e10.getResponse(), null, 2, null);
            }
            return o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class j extends pc.k implements oc.c {
        final /* synthetic */ com.onesignal.notifications.internal.d $openResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openResult = dVar;
        }

        @Override // oc.c
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((ca.h) null);
            return o.f277a;
        }

        public final void invoke(ca.h hVar) {
            pc.j.e(hVar, "it");
            hVar.a();
        }
    }

    public a(q8.f fVar, e9.a aVar, com.onesignal.core.internal.config.b bVar, ab.a aVar2, ob.b bVar2, v8.c cVar, fa.a aVar3, va.b bVar3, da.a aVar4) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(aVar, "_time");
        pc.j.e(bVar, "_configModelStore");
        pc.j.e(aVar2, "_influenceManager");
        pc.j.e(bVar2, "_subscriptionManager");
        pc.j.e(cVar, "_deviceService");
        pc.j.e(aVar3, "_backend");
        pc.j.e(bVar3, "_receiveReceiptWorkManager");
        pc.j.e(aVar4, "_analyticsTracker");
        this._applicationService = fVar;
        this._time = aVar;
        this._configModelStore = bVar;
        this._influenceManager = aVar2;
        this._subscriptionManager = bVar2;
        this._deviceService = cVar;
        this._backend = aVar3;
        this._receiveReceiptWorkManager = bVar3;
        this._analyticsTracker = aVar4;
        this.intLifecycleCallback = new com.onesignal.common.events.a();
        this.extRemoteReceivedCallback = new com.onesignal.common.events.a();
        this.extWillShowInForegroundCallback = new com.onesignal.common.events.b();
        this.extOpenedCallback = new com.onesignal.common.events.b();
        this.unprocessedOpenedNotifs = new k();
        this.postedOpenedNotifIds = new LinkedHashSet();
        setupNotificationServiceExtension(fVar.getAppContext());
    }

    private final String getLatestNotificationId(JSONArray jSONArray) {
        JSONObject jSONObject;
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            pc.j.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return na.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return na.f.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    @Override // ra.b
    public void addExternalClickListener(ca.h hVar) {
        pc.j.e(hVar, "callback");
        this.extOpenedCallback.subscribe(hVar);
        if (this.extOpenedCallback.getHasSubscribers()) {
            k kVar = this.unprocessedOpenedNotifs;
            pc.j.e(kVar, "<this>");
            if (kVar.isEmpty()) {
                return;
            }
            Iterator<E> it = this.unprocessedOpenedNotifs.iterator();
            while (it.hasNext()) {
                this.extOpenedCallback.fireOnMain(new C0054a(na.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
            }
        }
    }

    @Override // ra.b
    public void addExternalForegroundLifecycleListener(ca.j jVar) {
        pc.j.e(jVar, "listener");
        this.extWillShowInForegroundCallback.subscribe(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // ra.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, fc.d dVar) {
        b bVar;
        int i10;
        pc.o oVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                i10 = bVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    pc.o oVar2 = new pc.o();
                    oVar2.f5679g = true;
                    com.onesignal.common.events.a aVar = this.intLifecycleCallback;
                    c cVar = new c(oVar2, activity, jSONObject, null);
                    bVar.L$0 = oVar2;
                    bVar.label = 1;
                    Object suspendingFire = aVar.suspendingFire(cVar, bVar);
                    gc.a aVar2 = gc.a.f2559g;
                    if (suspendingFire == aVar2) {
                        return aVar2;
                    }
                    oVar = oVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = (pc.o) bVar.L$0;
                    v6.a.W(obj);
                }
                return Boolean.valueOf(oVar.f5679g);
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        i10 = bVar.label;
        if (i10 != 0) {
        }
        return Boolean.valueOf(oVar.f5679g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // ra.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, fc.d dVar) {
        d dVar2;
        int i10;
        pc.o oVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i11 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                i10 = dVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    pc.o oVar2 = new pc.o();
                    oVar2.f5679g = true;
                    com.onesignal.common.events.a aVar = this.intLifecycleCallback;
                    e eVar = new e(oVar2, jSONObject, null);
                    dVar2.L$0 = oVar2;
                    dVar2.label = 1;
                    Object suspendingFire = aVar.suspendingFire(eVar, dVar2);
                    gc.a aVar2 = gc.a.f2559g;
                    if (suspendingFire == aVar2) {
                        return aVar2;
                    }
                    oVar = oVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = (pc.o) dVar2.L$0;
                    v6.a.W(obj);
                }
                return Boolean.valueOf(oVar.f5679g);
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.result;
        i10 = dVar2.label;
        if (i10 != 0) {
        }
        return Boolean.valueOf(oVar.f5679g);
    }

    @Override // ra.b
    public void externalNotificationWillShowInForeground(m mVar) {
        pc.j.e(mVar, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new f(mVar));
    }

    @Override // ra.b
    public void externalRemoteNotificationReceived(ca.k kVar) {
        pc.j.e(kVar, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new g(kVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // ra.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notificationOpened(Activity activity, JSONArray jSONArray, fc.d dVar) {
        h hVar;
        int i10;
        a aVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i11 = hVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.label = i11 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                i10 = hVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                    if (appId == null) {
                        appId = "";
                    }
                    String str = appId;
                    String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
                    v8.a deviceType = this._deviceService.getDeviceType();
                    int length = jSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        String oSNotificationIdFromJson = na.c.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i12));
                        if (oSNotificationIdFromJson != null && !this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                            this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                            com.onesignal.common.threading.a.INSTANCE.execute(new i(str, oSNotificationIdFromJson, id2, deviceType, null));
                        }
                    }
                    na.e eVar = na.e.INSTANCE;
                    com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
                    da.a aVar2 = this._analyticsTracker;
                    String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
                    pc.j.b(notificationId);
                    aVar2.trackOpenedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
                    String latestNotificationId = getLatestNotificationId(jSONArray);
                    if (shouldInitDirectSessionFromNotificationOpen(activity)) {
                        this._applicationService.setEntryState(q8.b.NOTIFICATION_CLICK);
                        if (latestNotificationId != null) {
                            this._influenceManager.onDirectInfluenceFromNotification(latestNotificationId);
                        }
                    }
                    hVar.L$0 = this;
                    hVar.L$1 = jSONArray;
                    hVar.label = 1;
                    Object openDestinationActivity = openDestinationActivity(activity, jSONArray, hVar);
                    gc.a aVar3 = gc.a.f2559g;
                    if (openDestinationActivity == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray = (JSONArray) hVar.L$1;
                    aVar = (a) hVar.L$0;
                    v6.a.W(obj);
                }
                if (aVar.extOpenedCallback.getHasSubscribers()) {
                    aVar.unprocessedOpenedNotifs.addLast(jSONArray);
                } else {
                    aVar.extOpenedCallback.fireOnMain(new j(na.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, aVar._time)));
                }
                return o.f277a;
            }
        }
        hVar = new h(dVar);
        Object obj2 = hVar.result;
        i10 = hVar.label;
        if (i10 != 0) {
        }
        if (aVar.extOpenedCallback.getHasSubscribers()) {
        }
        return o.f277a;
    }

    @Override // ra.b
    public Object notificationReceived(na.d dVar, fc.d dVar2) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(dVar.getApiNotificationId());
        this._influenceManager.onNotificationReceived(dVar.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(dVar.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", dVar.getAndroidId());
            na.e eVar = na.e.INSTANCE;
            com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(com.onesignal.common.g.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            da.a aVar = this._analyticsTracker;
            String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            pc.j.b(notificationId);
            aVar.trackReceivedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return o.f277a;
    }

    @Override // com.onesignal.notifications.internal.a
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, fc.d dVar) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            na.b bVar = na.b.INSTANCE;
            pc.j.d(jSONObject, "firstPayloadItem");
            Intent intentVisible = bVar.create(activity, jSONObject).getIntentVisible();
            if (intentVisible != null) {
                com.onesignal.debug.internal.logging.b.info$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                activity.startActivity(intentVisible);
            } else {
                com.onesignal.debug.internal.logging.b.info$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return o.f277a;
    }

    @Override // ra.b
    public void removeExternalClickListener(ca.h hVar) {
        pc.j.e(hVar, "listener");
        this.extOpenedCallback.unsubscribe(hVar);
    }

    @Override // ra.b
    public void removeExternalForegroundLifecycleListener(ca.j jVar) {
        pc.j.e(jVar, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(jVar);
    }

    @Override // ra.b
    public void setInternalNotificationLifecycleCallback(ra.a aVar) {
        this.intLifecycleCallback.set(aVar);
    }

    public final void setupNotificationServiceExtension(Context context) {
        pc.j.e(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationServiceExtension");
        if (manifestMeta == null) {
            com.onesignal.debug.internal.logging.b.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.verbose$default(a4.d.j("Found class: ", manifestMeta, ", attempting to call constructor"), null, 2, null);
        try {
            Class.forName(manifestMeta).newInstance();
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        } catch (InstantiationException e12) {
            e12.printStackTrace();
        }
    }
}
