package com.gamericefishpro.space.uf;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.ph.r;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.ve.k;
import com.gamericefishpro.space.ve.m;
import com.onesignal.common.AndroidUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.tf.b, com.gamericefishpro.space.ye.a {
    private final com.gamericefishpro.space.ze.a _analyticsTracker;
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.bf.a _backend;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.vc.c _deviceService;
    private final com.gamericefishpro.space.mg.a _influenceManager;
    private final com.gamericefishpro.space.cg.b _receiveReceiptWorkManager;
    private final com.gamericefishpro.space.jh.b _subscriptionManager;
    private final com.gamericefishpro.space.kd.a _time;
    private final com.gamericefishpro.space.dc.b extOpenedCallback;
    private final com.gamericefishpro.space.dc.a extRemoteReceivedCallback;
    private final com.gamericefishpro.space.dc.b extWillShowInForegroundCallback;
    private final com.gamericefishpro.space.dc.a intLifecycleCallback;
    private final Set<String> postedOpenedNotifIds;
    private final r unprocessedOpenedNotifs;

    /* JADX INFO: renamed from: com.gamericefishpro.space.uf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0061a extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.ye.d $openedResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0061a(com.gamericefishpro.space.ye.d dVar) {
            super(1);
            this.$openedResult = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((com.gamericefishpro.space.ve.h) null);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.ve.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ w $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w wVar, Activity activity, JSONObject jSONObject, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$canOpen = wVar;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            c cVar = new c(this.$canOpen, this.$activity, this.$data, aVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.gamericefishpro.space.tf.a aVar, com.gamericefishpro.space.th.a aVar2) {
            return ((c) create(aVar, aVar2)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            w wVar;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.tf.a aVar2 = (com.gamericefishpro.space.tf.a) this.L$0;
                w wVar2 = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = wVar2;
                this.label = 1;
                obj = aVar2.canOpenNotification(activity, jSONObject, this);
                if (obj == aVar) {
                    return aVar;
                }
                wVar = wVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = (w) this.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            wVar.d = ((Boolean) obj).booleanValue();
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ w $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w wVar, JSONObject jSONObject, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$canReceive = wVar;
            this.$jsonPayload = jSONObject;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            e eVar = new e(this.$canReceive, this.$jsonPayload, aVar);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.gamericefishpro.space.tf.a aVar, com.gamericefishpro.space.th.a aVar2) {
            return ((e) create(aVar, aVar2)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            w wVar;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.tf.a aVar2 = (com.gamericefishpro.space.tf.a) this.L$0;
                w wVar2 = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = wVar2;
                this.label = 1;
                obj = aVar2.canReceiveNotification(jSONObject, this);
                if (obj == aVar) {
                    return aVar;
                }
                wVar = wVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = (w) this.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            wVar.d = ((Boolean) obj).booleanValue();
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends l implements Function1 {
        final /* synthetic */ m $willDisplayEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m mVar) {
            super(1);
            this.$willDisplayEvent = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((com.gamericefishpro.space.ve.j) null);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.ve.j it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends l implements Function1 {
        final /* synthetic */ k $notificationReceivedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k kVar) {
            super(1);
            this.$notificationReceivedEvent = kVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((com.gamericefishpro.space.ve.l) null);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.ve.l it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.notificationOpened(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class i extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ String $appId;
        final /* synthetic */ com.gamericefishpro.space.vc.a $deviceType;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ String $subscriptionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, String str3, com.gamericefishpro.space.vc.a aVar, com.gamericefishpro.space.th.a aVar2) {
            super(1, aVar2);
            this.$appId = str;
            this.$notificationId = str2;
            this.$subscriptionId = str3;
            this.$deviceType = aVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return a.this.new i(this.$appId, this.$notificationId, this.$subscriptionId, this.$deviceType, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((i) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            try {
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.bf.a aVar2 = a.this._backend;
                    String str = this.$appId;
                    String str2 = this.$notificationId;
                    String str3 = this.$subscriptionId;
                    com.gamericefishpro.space.vc.a aVar3 = this.$deviceType;
                    this.label = 1;
                    if (aVar2.updateNotificationAsOpened(str, str2, str3, aVar3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
            } catch (com.gamericefishpro.space.ec.a e) {
                com.gamericefishpro.space.od.b.error$default("Notification opened confirmation failed with statusCode: " + e.getStatusCode() + " response: " + e.getResponse(), null, 2, null);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class j extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.ye.d $openResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.gamericefishpro.space.ye.d dVar) {
            super(1);
            this.$openResult = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((com.gamericefishpro.space.ve.h) null);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.ve.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.a();
        }
    }

    public a(com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.kd.a _time, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.mg.a _influenceManager, com.gamericefishpro.space.jh.b _subscriptionManager, com.gamericefishpro.space.vc.c _deviceService, com.gamericefishpro.space.bf.a _backend, com.gamericefishpro.space.cg.b _receiveReceiptWorkManager, com.gamericefishpro.space.ze.a _analyticsTracker) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_receiveReceiptWorkManager, "_receiveReceiptWorkManager");
        Intrinsics.checkNotNullParameter(_analyticsTracker, "_analyticsTracker");
        this._applicationService = _applicationService;
        this._time = _time;
        this._configModelStore = _configModelStore;
        this._influenceManager = _influenceManager;
        this._subscriptionManager = _subscriptionManager;
        this._deviceService = _deviceService;
        this._backend = _backend;
        this._receiveReceiptWorkManager = _receiveReceiptWorkManager;
        this._analyticsTracker = _analyticsTracker;
        this.intLifecycleCallback = new com.gamericefishpro.space.dc.a();
        this.extRemoteReceivedCallback = new com.gamericefishpro.space.dc.a();
        this.extWillShowInForegroundCallback = new com.gamericefishpro.space.dc.b();
        this.extOpenedCallback = new com.gamericefishpro.space.dc.b();
        this.unprocessedOpenedNotifs = new r();
        this.postedOpenedNotifIds = new LinkedHashSet();
        setupNotificationServiceExtension(_applicationService.getAppContext());
    }

    private final String getLatestNotificationId(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject;
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            Intrinsics.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return com.gamericefishpro.space.mf.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return com.gamericefishpro.space.mf.f.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    @Override // com.gamericefishpro.space.tf.b
    public void addExternalClickListener(com.gamericefishpro.space.ve.h callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.extOpenedCallback.subscribe(callback);
        if (this.extOpenedCallback.getHasSubscribers()) {
            r rVar = this.unprocessedOpenedNotifs;
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            if (rVar != null ? !rVar.isEmpty() : rVar.iterator().hasNext()) {
                Iterator<E> it = this.unprocessedOpenedNotifs.iterator();
                while (it.hasNext()) {
                    this.extOpenedCallback.fireOnMain(new C0061a(com.gamericefishpro.space.mf.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.tf.b
    public void addExternalForegroundLifecycleListener(com.gamericefishpro.space.ve.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extWillShowInForegroundCallback.subscribe(listener);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.tf.b
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, com.gamericefishpro.space.th.a aVar) {
        b bVar;
        w wVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object obj = bVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = bVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            w wVar2 = new w();
            wVar2.d = true;
            com.gamericefishpro.space.dc.a aVar3 = this.intLifecycleCallback;
            c cVar = new c(wVar2, activity, jSONObject, null);
            bVar.L$0 = wVar2;
            bVar.label = 1;
            if (aVar3.suspendingFire(cVar, bVar) == aVar2) {
                return aVar2;
            }
            wVar = wVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (w) bVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Boolean.valueOf(wVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.tf.b
    public Object canReceiveNotification(JSONObject jSONObject, com.gamericefishpro.space.th.a aVar) {
        d dVar;
        w wVar;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        Object obj = dVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = dVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            w wVar2 = new w();
            wVar2.d = true;
            com.gamericefishpro.space.dc.a aVar3 = this.intLifecycleCallback;
            e eVar = new e(wVar2, jSONObject, null);
            dVar.L$0 = wVar2;
            dVar.label = 1;
            if (aVar3.suspendingFire(eVar, dVar) == aVar2) {
                return aVar2;
            }
            wVar = wVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (w) dVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Boolean.valueOf(wVar.d);
    }

    @Override // com.gamericefishpro.space.tf.b
    public void externalNotificationWillShowInForeground(m willDisplayEvent) {
        Intrinsics.checkNotNullParameter(willDisplayEvent, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new f(willDisplayEvent));
    }

    @Override // com.gamericefishpro.space.tf.b
    public void externalRemoteNotificationReceived(k notificationReceivedEvent) {
        Intrinsics.checkNotNullParameter(notificationReceivedEvent, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new g(notificationReceivedEvent));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.tf.b
    public Object notificationOpened(Activity activity, JSONArray jSONArray, com.gamericefishpro.space.th.a aVar) throws JSONException {
        h hVar;
        a aVar2;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(aVar);
            }
        } else {
            hVar = new h(aVar);
        }
        Object obj = hVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = hVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            String appId = ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId();
            if (appId == null) {
                appId = "";
            }
            String str = appId;
            String id = this._subscriptionManager.getSubscriptions().getPush().getId();
            com.gamericefishpro.space.vc.a deviceType = this._deviceService.getDeviceType();
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                String oSNotificationIdFromJson = com.gamericefishpro.space.mf.c.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i4));
                if (oSNotificationIdFromJson != null && !this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                    this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                    com.gamericefishpro.space.ic.a.INSTANCE.execute(new i(str, oSNotificationIdFromJson, id, deviceType, null));
                }
            }
            com.gamericefishpro.space.mf.e eVar = com.gamericefishpro.space.mf.e.INSTANCE;
            com.gamericefishpro.space.ye.d dVarGenerateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
            com.gamericefishpro.space.ze.a aVar4 = this._analyticsTracker;
            String notificationId = dVarGenerateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            Intrinsics.b(notificationId);
            aVar4.trackOpenedEvent(notificationId, eVar.getCampaignNameFromNotification(dVarGenerateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
            String latestNotificationId = getLatestNotificationId(jSONArray);
            if (shouldInitDirectSessionFromNotificationOpen(activity)) {
                this._applicationService.setEntryState(com.gamericefishpro.space.lc.b.NOTIFICATION_CLICK);
                if (latestNotificationId != null) {
                    this._influenceManager.onDirectInfluenceFromNotification(latestNotificationId);
                }
            }
            hVar.L$0 = this;
            hVar.L$1 = jSONArray;
            hVar.label = 1;
            if (openDestinationActivity(activity, jSONArray, hVar) == aVar3) {
                return aVar3;
            }
            aVar2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONArray = (JSONArray) hVar.L$1;
            aVar2 = (a) hVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        if (aVar2.extOpenedCallback.getHasSubscribers()) {
            aVar2.extOpenedCallback.fireOnMain(new j(com.gamericefishpro.space.mf.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, aVar2._time)));
        } else {
            aVar2.unprocessedOpenedNotifs.addLast(jSONArray);
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.tf.b
    public Object notificationReceived(com.gamericefishpro.space.mf.d dVar, com.gamericefishpro.space.th.a aVar) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(dVar.getApiNotificationId());
        this._influenceManager.onNotificationReceived(dVar.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(dVar.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", dVar.getAndroidId());
            com.gamericefishpro.space.mf.e eVar = com.gamericefishpro.space.mf.e.INSTANCE;
            com.gamericefishpro.space.ye.d dVarGenerateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(com.gamericefishpro.space.yb.e.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            com.gamericefishpro.space.ze.a aVar2 = this._analyticsTracker;
            String notificationId = dVarGenerateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            Intrinsics.b(notificationId);
            aVar2.trackReceivedEvent(notificationId, eVar.getCampaignNameFromNotification(dVarGenerateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.ye.a
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, com.gamericefishpro.space.th.a aVar) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            com.gamericefishpro.space.mf.b bVar = com.gamericefishpro.space.mf.b.INSTANCE;
            Intrinsics.b(jSONObject);
            Intent intentVisible = bVar.create(activity, jSONObject).getIntentVisible();
            if (intentVisible != null) {
                com.gamericefishpro.space.od.b.info$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                activity.startActivity(intentVisible);
            } else {
                com.gamericefishpro.space.od.b.info$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
            }
        } catch (ActivityNotFoundException e2) {
            com.gamericefishpro.space.od.b.error$default("No activity found to handle notification open intent.", null, 2, null);
            e2.printStackTrace();
        } catch (JSONException e3) {
            com.gamericefishpro.space.od.b.error$default("Could not parse JSON to open notification activity.", null, 2, null);
            e3.printStackTrace();
        } catch (Exception e4) {
            com.gamericefishpro.space.od.b.error$default("Could not open notification activity.", null, 2, null);
            e4.printStackTrace();
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.tf.b
    public void removeExternalClickListener(com.gamericefishpro.space.ve.h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extOpenedCallback.unsubscribe(listener);
    }

    @Override // com.gamericefishpro.space.tf.b
    public void removeExternalForegroundLifecycleListener(com.gamericefishpro.space.ve.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(listener);
    }

    @Override // com.gamericefishpro.space.tf.b
    public void setInternalNotificationLifecycleCallback(com.gamericefishpro.space.tf.a aVar) {
        this.intLifecycleCallback.set(aVar);
    }

    public final void setupNotificationServiceExtension(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationServiceExtension");
        if (manifestMeta == null) {
            com.gamericefishpro.space.od.b.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        com.gamericefishpro.space.od.b.verbose$default(y0.g("Found class: ", manifestMeta, ", attempting to call constructor"), null, 2, null);
        try {
            Class.forName(manifestMeta).newInstance();
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InstantiationException e4) {
            e4.printStackTrace();
        }
    }
}
