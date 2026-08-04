package com.gamericefishpro.space.kh;

import android.os.Build;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.fc.i;
import com.gamericefishpro.space.fc.j;
import com.gamericefishpro.space.jh.e;
import com.gamericefishpro.space.jh.g;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.oh.k;
import com.gamericefishpro.space.ph.g0;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.jh.b, com.gamericefishpro.space.fc.d, com.gamericefishpro.space.rg.a {
    private final f _applicationService;
    private final com.gamericefishpro.space.rg.b _sessionService;
    private final e _subscriptionModelStore;
    private final com.gamericefishpro.space.dc.b events;
    private com.gamericefishpro.space.jh.c subscriptions;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.mh.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.gamericefishpro.space.mh.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.jh.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.jh.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSubscriptionAdded(this.$subscription);
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.kh.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0031b extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.mh.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0031b(com.gamericefishpro.space.mh.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((com.gamericefishpro.space.mh.c) null);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.mh.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            new com.gamericefishpro.space.mh.f(((com.gamericefishpro.space.ug.b) this.$subscription).getSavedState(), ((com.gamericefishpro.space.ug.b) this.$subscription).refreshState());
            it.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends l implements Function1 {
        final /* synthetic */ j $args;
        final /* synthetic */ com.gamericefishpro.space.mh.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.gamericefishpro.space.mh.e eVar, j jVar) {
            super(1);
            this.$subscription = eVar;
            this.$args = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.jh.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.jh.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSubscriptionChanged(this.$subscription, this.$args);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.mh.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.gamericefishpro.space.mh.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.jh.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.jh.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSubscriptionRemoved(this.$subscription);
        }
    }

    public b(f _applicationService, com.gamericefishpro.space.rg.b _sessionService, e _subscriptionModelStore) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.events = new com.gamericefishpro.space.dc.b();
        this.subscriptions = new com.gamericefishpro.space.jh.c(g0.d, new com.gamericefishpro.space.ug.e());
        Iterator<i> it = _subscriptionModelStore.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((com.gamericefishpro.space.jh.d) it.next());
        }
        this._subscriptionModelStore.subscribe((com.gamericefishpro.space.fc.d) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(g gVar, String str, com.gamericefishpro.space.jh.f fVar) {
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "SubscriptionManager.addSubscription(type: " + gVar + ", address: " + str + ')');
        com.gamericefishpro.space.jh.d dVar = new com.gamericefishpro.space.jh.d();
        dVar.setId(com.gamericefishpro.space.yb.c.INSTANCE.createLocalId());
        dVar.setOptedIn(true);
        dVar.setType(gVar);
        dVar.setAddress(str);
        if (fVar == null) {
            fVar = com.gamericefishpro.space.jh.f.SUBSCRIBED;
        }
        dVar.setStatus(fVar);
        com.gamericefishpro.space.fc.b.add$default(this._subscriptionModelStore, dVar, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(b bVar, g gVar, String str, com.gamericefishpro.space.jh.f fVar, int i, Object obj) {
        if ((i & 4) != 0) {
            fVar = null;
        }
        bVar.addSubscriptionToModels(gVar, str, fVar);
    }

    private final void createSubscriptionAndAddToSubscriptionList(com.gamericefishpro.space.jh.d dVar) {
        com.gamericefishpro.space.mh.e eVarCreateSubscriptionFromModel = createSubscriptionFromModel(dVar);
        ArrayList arrayListM = CollectionsKt.M(getSubscriptions().getCollection());
        if (dVar.getType() == g.PUSH) {
            com.gamericefishpro.space.mh.b push = getSubscriptions().getPush();
            Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            com.gamericefishpro.space.ug.b bVar = (com.gamericefishpro.space.ug.b) push;
            Intrinsics.c(eVarCreateSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((com.gamericefishpro.space.ug.b) eVarCreateSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(bVar.getChangeHandlersNotifier());
            arrayListM.remove(bVar);
        }
        arrayListM.add(eVarCreateSubscriptionFromModel);
        setSubscriptions(new com.gamericefishpro.space.jh.c(arrayListM, new com.gamericefishpro.space.ug.e()));
        this.events.fire(new a(eVarCreateSubscriptionFromModel));
    }

    private final com.gamericefishpro.space.mh.e createSubscriptionFromModel(com.gamericefishpro.space.jh.d dVar) {
        int i = com.gamericefishpro.space.kh.a.$EnumSwitchMapping$0[dVar.getType().ordinal()];
        if (i == 1) {
            return new com.gamericefishpro.space.ug.c(dVar);
        }
        if (i == 2) {
            return new com.gamericefishpro.space.ug.a(dVar);
        }
        if (i == 3) {
            return new com.gamericefishpro.space.ug.b(dVar);
        }
        throw new k();
    }

    private final void refreshPushSubscriptionState() {
        Object push = getSubscriptions().getPush();
        if (push instanceof com.gamericefishpro.space.ug.e) {
            return;
        }
        Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        com.gamericefishpro.space.jh.d model = ((com.gamericefishpro.space.ug.d) push).getModel();
        model.setSdk(com.gamericefishpro.space.yb.g.INSTANCE.getSdkVersion());
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        model.setDeviceOS(RELEASE);
        String carrierName = com.gamericefishpro.space.yb.b.INSTANCE.getCarrierName(this._applicationService.getAppContext());
        if (carrierName != null) {
            model.setCarrier(carrierName);
        }
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext());
        if (appVersion != null) {
            model.setAppVersion(appVersion);
        }
    }

    private final void removeSubscriptionFromModels(com.gamericefishpro.space.mh.e eVar) {
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + eVar + ')');
        com.gamericefishpro.space.fc.b.remove$default(this._subscriptionModelStore, eVar.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(com.gamericefishpro.space.mh.e eVar) {
        ArrayList arrayListM = CollectionsKt.M(getSubscriptions().getCollection());
        arrayListM.remove(eVar);
        setSubscriptions(new com.gamericefishpro.space.jh.c(arrayListM, new com.gamericefishpro.space.ug.e()));
        this.events.fire(new d(eVar));
    }

    @Override // com.gamericefishpro.space.jh.b
    public void addEmailSubscription(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        addSubscriptionToModels$default(this, g.EMAIL, email, null, 4, null);
    }

    @Override // com.gamericefishpro.space.jh.b
    public void addOrUpdatePushSubscriptionToken(String str, com.gamericefishpro.space.jh.f pushTokenStatus) {
        Intrinsics.checkNotNullParameter(pushTokenStatus, "pushTokenStatus");
        Object push = getSubscriptions().getPush();
        if (push instanceof com.gamericefishpro.space.ug.e) {
            g gVar = g.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(gVar, str, pushTokenStatus);
            return;
        }
        Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        com.gamericefishpro.space.jh.d model = ((com.gamericefishpro.space.ug.d) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        model.setStatus(pushTokenStatus);
    }

    @Override // com.gamericefishpro.space.jh.b
    public void addSmsSubscription(String sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        addSubscriptionToModels$default(this, g.SMS, sms, null, 4, null);
    }

    @Override // com.gamericefishpro.space.jh.b, com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.gamericefishpro.space.jh.b
    public com.gamericefishpro.space.jh.d getPushSubscriptionModel() {
        com.gamericefishpro.space.mh.b push = getSubscriptions().getPush();
        Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((com.gamericefishpro.space.ug.b) push).getModel();
    }

    @Override // com.gamericefishpro.space.jh.b
    public com.gamericefishpro.space.jh.c getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.gamericefishpro.space.fc.d
    public void onModelUpdated(j args, String tag) {
        Object next;
        com.gamericefishpro.space.mh.e eVar;
        i model;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            eVar = (com.gamericefishpro.space.mh.e) next;
            model = args.getModel();
            Intrinsics.c(eVar, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        } while (!Intrinsics.a(model, ((com.gamericefishpro.space.ug.d) eVar).getModel()));
        com.gamericefishpro.space.mh.e eVar2 = (com.gamericefishpro.space.mh.e) next;
        if (eVar2 == null) {
            i model2 = args.getModel();
            Intrinsics.c(model2, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((com.gamericefishpro.space.jh.d) model2);
        } else {
            if (eVar2 instanceof com.gamericefishpro.space.ug.b) {
                ((com.gamericefishpro.space.ug.b) eVar2).getChangeHandlersNotifier().fireOnMain(new C0031b(eVar2));
            }
            this.events.fire(new c(eVar2, args));
        }
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    @Override // com.gamericefishpro.space.jh.b
    public void removeEmailSubscription(String email) {
        Object next;
        Intrinsics.checkNotNullParameter(email, "email");
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            com.gamericefishpro.space.mh.a aVar = (com.gamericefishpro.space.mh.a) next;
            if ((aVar instanceof com.gamericefishpro.space.ug.a) && Intrinsics.a(aVar.getEmail(), email)) {
                break;
            }
        }
        com.gamericefishpro.space.mh.a aVar2 = (com.gamericefishpro.space.mh.a) next;
        if (aVar2 != null) {
            removeSubscriptionFromModels(aVar2);
        }
    }

    @Override // com.gamericefishpro.space.jh.b
    public void removeSmsSubscription(String sms) {
        Object next;
        Intrinsics.checkNotNullParameter(sms, "sms");
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            com.gamericefishpro.space.mh.d dVar = (com.gamericefishpro.space.mh.d) next;
            if ((dVar instanceof com.gamericefishpro.space.ug.c) && Intrinsics.a(dVar.getNumber(), sms)) {
                break;
            }
        }
        com.gamericefishpro.space.mh.d dVar2 = (com.gamericefishpro.space.mh.d) next;
        if (dVar2 != null) {
            removeSubscriptionFromModels(dVar2);
        }
    }

    @Override // com.gamericefishpro.space.jh.b
    public void setSubscriptions(com.gamericefishpro.space.jh.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.subscriptions = cVar;
    }

    @Override // com.gamericefishpro.space.fc.d
    public void onModelAdded(com.gamericefishpro.space.jh.d model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        createSubscriptionAndAddToSubscriptionList(model);
    }

    @Override // com.gamericefishpro.space.fc.d
    public void onModelRemoved(com.gamericefishpro.space.jh.d model, String tag) {
        Object next;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (model.getType() == g.PUSH) {
            return;
        }
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.a(((com.gamericefishpro.space.mh.e) next).getId(), model.getId()));
        com.gamericefishpro.space.mh.e eVar = (com.gamericefishpro.space.mh.e) next;
        if (eVar != null) {
            removeSubscriptionFromSubscriptionList(eVar);
        }
    }

    @Override // com.gamericefishpro.space.jh.b, com.gamericefishpro.space.dc.d
    public void subscribe(com.gamericefishpro.space.jh.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.gamericefishpro.space.jh.b, com.gamericefishpro.space.dc.d
    public void unsubscribe(com.gamericefishpro.space.jh.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.unsubscribe(handler);
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionActive() {
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionEnded(long j) {
    }
}
