package com.onesignal.user.internal.subscriptions.impl;

import I7.l;
import Z5.e;
import android.os.Build;
import b6.InterfaceC0527a;
import b6.InterfaceC0528b;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.modeling.j;
import com.onesignal.user.internal.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import u7.v;
import v7.AbstractC5119j;
import v7.C5125p;
import x4.f;

/* loaded from: classes2.dex */
public final class b implements Z5.b, com.onesignal.common.modeling.d, O5.a {
    private final f _applicationService;
    private final O5.b _sessionService;
    private final e _subscriptionModelStore;
    private final com.onesignal.common.events.b events;
    private Z5.c subscriptions;

    public static final class a extends i implements l {
        final /* synthetic */ b6.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b6.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Z5.a) obj);
            return v.f41073a;
        }

        public final void invoke(Z5.a it) {
            h.e(it, "it");
            it.onSubscriptionAdded(this.$subscription);
        }
    }

    /* renamed from: com.onesignal.user.internal.subscriptions.impl.b$b, reason: collision with other inner class name */
    public static final class C0254b extends i implements l {
        final /* synthetic */ b6.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0254b(b6.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // I7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((b6.c) null);
            return v.f41073a;
        }

        public final void invoke(b6.c it) {
            h.e(it, "it");
            new b6.f(((g) this.$subscription).getSavedState(), ((g) this.$subscription).refreshState());
            it.a();
        }
    }

    public static final class c extends i implements l {
        final /* synthetic */ j $args;
        final /* synthetic */ b6.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b6.e eVar, j jVar) {
            super(1);
            this.$subscription = eVar;
            this.$args = jVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Z5.a) obj);
            return v.f41073a;
        }

        public final void invoke(Z5.a it) {
            h.e(it, "it");
            it.onSubscriptionChanged(this.$subscription, this.$args);
        }
    }

    public static final class d extends i implements l {
        final /* synthetic */ b6.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b6.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Z5.a) obj);
            return v.f41073a;
        }

        public final void invoke(Z5.a it) {
            h.e(it, "it");
            it.onSubscriptionRemoved(this.$subscription);
        }
    }

    public b(f _applicationService, O5.b _sessionService, e _subscriptionModelStore) {
        h.e(_applicationService, "_applicationService");
        h.e(_sessionService, "_sessionService");
        h.e(_subscriptionModelStore, "_subscriptionModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.events = new com.onesignal.common.events.b();
        this.subscriptions = new Z5.c(C5125p.f41221n, new com.onesignal.user.internal.j());
        Iterator<com.onesignal.common.modeling.i> it = _subscriptionModelStore.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((Z5.d) it.next());
        }
        this._subscriptionModelStore.subscribe((com.onesignal.common.modeling.d) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(Z5.g gVar, String str, Z5.f fVar) {
        String hash = gVar != Z5.g.PUSH ? com.onesignal.common.j.INSTANCE.hash(str) : str;
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "SubscriptionManager.addSubscription(type: " + gVar + ", address: " + hash + ')');
        Z5.d dVar = new Z5.d();
        dVar.setId(com.onesignal.common.d.INSTANCE.createLocalId());
        dVar.setOptedIn(true);
        dVar.setType(gVar);
        dVar.setAddress(str);
        if (fVar == null) {
            fVar = Z5.f.SUBSCRIBED;
        }
        dVar.setStatus(fVar);
        com.onesignal.common.modeling.b.add$default(this._subscriptionModelStore, dVar, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(b bVar, Z5.g gVar, String str, Z5.f fVar, int i, Object obj) {
        if ((i & 4) != 0) {
            fVar = null;
        }
        bVar.addSubscriptionToModels(gVar, str, fVar);
    }

    private final void createSubscriptionAndAddToSubscriptionList(Z5.d dVar) {
        b6.e createSubscriptionFromModel = createSubscriptionFromModel(dVar);
        ArrayList K7 = AbstractC5119j.K(getSubscriptions().getCollection());
        if (dVar.getType() == Z5.g.PUSH) {
            InterfaceC0528b push = getSubscriptions().getPush();
            h.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            g gVar = (g) push;
            h.c(createSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((g) createSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(gVar.getChangeHandlersNotifier());
            K7.remove(gVar);
        }
        K7.add(createSubscriptionFromModel);
        setSubscriptions(new Z5.c(K7, new com.onesignal.user.internal.j()));
        this.events.fire(new a(createSubscriptionFromModel));
    }

    private final b6.e createSubscriptionFromModel(Z5.d dVar) {
        int i = com.onesignal.user.internal.subscriptions.impl.a.$EnumSwitchMapping$0[dVar.getType().ordinal()];
        if (i == 1) {
            return new com.onesignal.user.internal.h(dVar);
        }
        if (i == 2) {
            return new com.onesignal.user.internal.c(dVar);
        }
        if (i == 3) {
            return new g(dVar);
        }
        throw new B0.c();
    }

    private final void refreshPushSubscriptionState() {
        b6.e push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.j) {
            return;
        }
        h.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        Z5.d model = ((com.onesignal.user.internal.i) push).getModel();
        model.setSdk(com.onesignal.common.h.INSTANCE.getSdkVersion());
        String RELEASE = Build.VERSION.RELEASE;
        h.d(RELEASE, "RELEASE");
        model.setDeviceOS(RELEASE);
        String carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(this._applicationService.getAppContext());
        if (carrierName != null) {
            model.setCarrier(carrierName);
        }
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext());
        if (appVersion != null) {
            model.setAppVersion(appVersion);
        }
    }

    private final void removeSubscriptionFromModels(b6.e eVar) {
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + eVar + ')');
        com.onesignal.common.modeling.b.remove$default(this._subscriptionModelStore, eVar.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(b6.e eVar) {
        ArrayList K7 = AbstractC5119j.K(getSubscriptions().getCollection());
        K7.remove(eVar);
        setSubscriptions(new Z5.c(K7, new com.onesignal.user.internal.j()));
        this.events.fire(new d(eVar));
    }

    @Override // Z5.b
    public void addEmailSubscription(String email) {
        h.e(email, "email");
        addSubscriptionToModels$default(this, Z5.g.EMAIL, email, null, 4, null);
    }

    @Override // Z5.b
    public void addOrUpdatePushSubscriptionToken(String str, Z5.f pushTokenStatus) {
        h.e(pushTokenStatus, "pushTokenStatus");
        b6.e push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.j) {
            Z5.g gVar = Z5.g.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(gVar, str, pushTokenStatus);
            return;
        }
        h.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        Z5.d model = ((com.onesignal.user.internal.i) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        model.setStatus(pushTokenStatus);
    }

    @Override // Z5.b
    public void addSmsSubscription(String sms) {
        h.e(sms, "sms");
        addSubscriptionToModels$default(this, Z5.g.SMS, sms, null, 4, null);
    }

    @Override // Z5.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // Z5.b
    public Z5.d getPushSubscriptionModel() {
        InterfaceC0528b push = getSubscriptions().getPush();
        h.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((g) push).getModel();
    }

    @Override // Z5.b
    public Z5.c getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j args, String tag) {
        Object obj;
        h.e(args, "args");
        h.e(tag, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            b6.e eVar = (b6.e) obj;
            com.onesignal.common.modeling.i model = args.getModel();
            h.c(eVar, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            if (h.a(model, ((com.onesignal.user.internal.i) eVar).getModel())) {
                break;
            }
        }
        b6.e eVar2 = (b6.e) obj;
        if (eVar2 == null) {
            com.onesignal.common.modeling.i model2 = args.getModel();
            h.c(model2, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((Z5.d) model2);
        } else {
            if (eVar2 instanceof g) {
                ((g) eVar2).getChangeHandlersNotifier().fireOnMain(new C0254b(eVar2));
            }
            this.events.fire(new c(eVar2, args));
        }
    }

    @Override // O5.a
    public void onSessionActive() {
    }

    @Override // O5.a
    public void onSessionEnded(long j6) {
    }

    @Override // O5.a
    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    @Override // Z5.b
    public void removeEmailSubscription(String email) {
        Object obj;
        h.e(email, "email");
        String hash = com.onesignal.common.j.INSTANCE.hash(email);
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            InterfaceC0527a interfaceC0527a = (InterfaceC0527a) obj;
            if (interfaceC0527a instanceof com.onesignal.user.internal.c) {
                com.onesignal.user.internal.c cVar = (com.onesignal.user.internal.c) interfaceC0527a;
                if (h.a(cVar.getModel().getAddress(), email) || h.a(cVar.getModel().getAddress(), hash)) {
                    break;
                }
            }
        }
        InterfaceC0527a interfaceC0527a2 = (InterfaceC0527a) obj;
        if (interfaceC0527a2 != null) {
            removeSubscriptionFromModels(interfaceC0527a2);
        }
    }

    @Override // Z5.b
    public void removeSmsSubscription(String sms) {
        Object obj;
        h.e(sms, "sms");
        String hash = com.onesignal.common.j.INSTANCE.hash(sms);
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            b6.d dVar = (b6.d) obj;
            if (dVar instanceof com.onesignal.user.internal.h) {
                com.onesignal.user.internal.h hVar = (com.onesignal.user.internal.h) dVar;
                if (h.a(hVar.getModel().getAddress(), sms) || h.a(hVar.getModel().getAddress(), hash)) {
                    break;
                }
            }
        }
        b6.d dVar2 = (b6.d) obj;
        if (dVar2 != null) {
            removeSubscriptionFromModels(dVar2);
        }
    }

    @Override // Z5.b
    public void setSubscriptions(Z5.c cVar) {
        h.e(cVar, "<set-?>");
        this.subscriptions = cVar;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(Z5.d model, String tag) {
        h.e(model, "model");
        h.e(tag, "tag");
        createSubscriptionAndAddToSubscriptionList(model);
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(Z5.d model, String tag) {
        Object obj;
        h.e(model, "model");
        h.e(tag, "tag");
        if (model.getType() == Z5.g.PUSH) {
            return;
        }
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (h.a(((b6.e) obj).getId(), model.getId())) {
                    break;
                }
            }
        }
        b6.e eVar = (b6.e) obj;
        if (eVar != null) {
            removeSubscriptionFromSubscriptionList(eVar);
        }
    }

    @Override // Z5.b, com.onesignal.common.events.d
    public void subscribe(Z5.a handler) {
        h.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // Z5.b, com.onesignal.common.events.d
    public void unsubscribe(Z5.a handler) {
        h.e(handler, "handler");
        this.events.unsubscribe(handler);
    }
}
