package com.onesignal.user.internal.subscriptions.impl;

import ac.o;
import android.os.Build;
import bc.m;
import bc.v;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.modeling.i;
import java.util.ArrayList;
import java.util.Iterator;
import ob.e;
import ob.g;
import pc.j;
import pc.k;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements ob.b, com.onesignal.common.modeling.d, eb.a {
    private final f _applicationService;
    private final eb.b _sessionService;
    private final e _subscriptionModelStore;
    private final com.onesignal.common.events.b events;
    private ob.c subscriptions;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.c {
        final /* synthetic */ qb.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ob.a) obj);
            return o.f277a;
        }

        public final void invoke(ob.a aVar) {
            j.e(aVar, "it");
            aVar.onSubscriptionAdded(this.$subscription);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.user.internal.subscriptions.impl.b$b, reason: collision with other inner class name */
    public static final class C0070b extends k implements oc.c {
        final /* synthetic */ qb.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0070b(qb.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // oc.c
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((qb.c) null);
            return o.f277a;
        }

        public final void invoke(qb.c cVar) {
            j.e(cVar, "it");
            new qb.f(((com.onesignal.user.internal.b) this.$subscription).getSavedState(), ((com.onesignal.user.internal.b) this.$subscription).refreshState());
            cVar.a();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends k implements oc.c {
        final /* synthetic */ com.onesignal.common.modeling.j $args;
        final /* synthetic */ qb.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qb.e eVar, com.onesignal.common.modeling.j jVar) {
            super(1);
            this.$subscription = eVar;
            this.$args = jVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ob.a) obj);
            return o.f277a;
        }

        public final void invoke(ob.a aVar) {
            j.e(aVar, "it");
            aVar.onSubscriptionChanged(this.$subscription, this.$args);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends k implements oc.c {
        final /* synthetic */ qb.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(qb.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ob.a) obj);
            return o.f277a;
        }

        public final void invoke(ob.a aVar) {
            j.e(aVar, "it");
            aVar.onSubscriptionRemoved(this.$subscription);
        }
    }

    public b(f fVar, eb.b bVar, e eVar) {
        j.e(fVar, "_applicationService");
        j.e(bVar, "_sessionService");
        j.e(eVar, "_subscriptionModelStore");
        this._applicationService = fVar;
        this._sessionService = bVar;
        this._subscriptionModelStore = eVar;
        this.events = new com.onesignal.common.events.b();
        this.subscriptions = new ob.c(v.f1067g, new com.onesignal.user.internal.e());
        Iterator<i> it = eVar.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((ob.d) it.next());
        }
        this._subscriptionModelStore.subscribe((com.onesignal.common.modeling.d) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(g gVar, String str, ob.f fVar) {
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "SubscriptionManager.addSubscription(type: " + gVar + ", address: " + str + ')');
        ob.d dVar = new ob.d();
        dVar.setId(com.onesignal.common.e.INSTANCE.createLocalId());
        dVar.setOptedIn(true);
        dVar.setType(gVar);
        dVar.setAddress(str);
        if (fVar == null) {
            fVar = ob.f.SUBSCRIBED;
        }
        dVar.setStatus(fVar);
        com.onesignal.common.modeling.b.add$default(this._subscriptionModelStore, dVar, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(b bVar, g gVar, String str, ob.f fVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            fVar = null;
        }
        bVar.addSubscriptionToModels(gVar, str, fVar);
    }

    private final void createSubscriptionAndAddToSubscriptionList(ob.d dVar) {
        qb.e createSubscriptionFromModel = createSubscriptionFromModel(dVar);
        ArrayList f02 = m.f0(getSubscriptions().getCollection());
        if (dVar.getType() == g.PUSH) {
            qb.b push = getSubscriptions().getPush();
            j.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            com.onesignal.user.internal.b bVar = (com.onesignal.user.internal.b) push;
            j.c(createSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((com.onesignal.user.internal.b) createSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(bVar.getChangeHandlersNotifier());
            f02.remove(bVar);
        }
        f02.add(createSubscriptionFromModel);
        setSubscriptions(new ob.c(f02, new com.onesignal.user.internal.e()));
        this.events.fire(new a(createSubscriptionFromModel));
    }

    private final qb.e createSubscriptionFromModel(ob.d dVar) {
        int i10 = com.onesignal.user.internal.subscriptions.impl.a.$EnumSwitchMapping$0[dVar.getType().ordinal()];
        if (i10 == 1) {
            return new com.onesignal.user.internal.c(dVar);
        }
        if (i10 == 2) {
            return new com.onesignal.user.internal.a(dVar);
        }
        if (i10 == 3) {
            return new com.onesignal.user.internal.b(dVar);
        }
        throw new ac.d();
    }

    private final void refreshPushSubscriptionState() {
        Object push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.e) {
            return;
        }
        j.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        ob.d model = ((com.onesignal.user.internal.d) push).getModel();
        model.setSdk(com.onesignal.common.i.SDK_VERSION);
        String str = Build.VERSION.RELEASE;
        j.d(str, "RELEASE");
        model.setDeviceOS(str);
        String carrierName = com.onesignal.common.d.INSTANCE.getCarrierName(this._applicationService.getAppContext());
        if (carrierName != null) {
            model.setCarrier(carrierName);
        }
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext());
        if (appVersion != null) {
            model.setAppVersion(appVersion);
        }
    }

    private final void removeSubscriptionFromModels(qb.e eVar) {
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + eVar + ')');
        com.onesignal.common.modeling.b.remove$default(this._subscriptionModelStore, eVar.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(qb.e eVar) {
        ArrayList f02 = m.f0(getSubscriptions().getCollection());
        f02.remove(eVar);
        setSubscriptions(new ob.c(f02, new com.onesignal.user.internal.e()));
        this.events.fire(new d(eVar));
    }

    @Override // ob.b
    public void addEmailSubscription(String str) {
        j.e(str, "email");
        addSubscriptionToModels$default(this, g.EMAIL, str, null, 4, null);
    }

    @Override // ob.b
    public void addOrUpdatePushSubscriptionToken(String str, ob.f fVar) {
        j.e(fVar, "pushTokenStatus");
        Object push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.e) {
            g gVar = g.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(gVar, str, fVar);
            return;
        }
        j.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        ob.d model = ((com.onesignal.user.internal.d) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        model.setStatus(fVar);
    }

    @Override // ob.b
    public void addSmsSubscription(String str) {
        j.e(str, "sms");
        addSubscriptionToModels$default(this, g.SMS, str, null, 4, null);
    }

    @Override // ob.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // ob.b
    public ob.d getPushSubscriptionModel() {
        qb.b push = getSubscriptions().getPush();
        j.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((com.onesignal.user.internal.b) push).getModel();
    }

    @Override // ob.b
    public ob.c getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        Object obj;
        j.e(jVar, "args");
        j.e(str, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qb.e eVar = (qb.e) obj;
            i model = jVar.getModel();
            j.c(eVar, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            if (j.a(model, ((com.onesignal.user.internal.d) eVar).getModel())) {
                break;
            }
        }
        qb.e eVar2 = (qb.e) obj;
        if (eVar2 == null) {
            i model2 = jVar.getModel();
            j.c(model2, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((ob.d) model2);
        } else {
            if (eVar2 instanceof com.onesignal.user.internal.b) {
                ((com.onesignal.user.internal.b) eVar2).getChangeHandlersNotifier().fireOnMain(new C0070b(eVar2));
            }
            this.events.fire(new c(eVar2, jVar));
        }
    }

    @Override // eb.a
    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    @Override // ob.b
    public void removeEmailSubscription(String str) {
        Object obj;
        j.e(str, "email");
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qb.a aVar = (qb.a) obj;
            if ((aVar instanceof com.onesignal.user.internal.a) && j.a(aVar.getEmail(), str)) {
                break;
            }
        }
        qb.a aVar2 = (qb.a) obj;
        if (aVar2 != null) {
            removeSubscriptionFromModels(aVar2);
        }
    }

    @Override // ob.b
    public void removeSmsSubscription(String str) {
        Object obj;
        j.e(str, "sms");
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qb.d dVar = (qb.d) obj;
            if ((dVar instanceof com.onesignal.user.internal.c) && j.a(dVar.getNumber(), str)) {
                break;
            }
        }
        qb.d dVar2 = (qb.d) obj;
        if (dVar2 != null) {
            removeSubscriptionFromModels(dVar2);
        }
    }

    @Override // ob.b
    public void setSubscriptions(ob.c cVar) {
        j.e(cVar, "<set-?>");
        this.subscriptions = cVar;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(ob.d dVar, String str) {
        j.e(dVar, "model");
        j.e(str, "tag");
        createSubscriptionAndAddToSubscriptionList(dVar);
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(ob.d dVar, String str) {
        Object obj;
        j.e(dVar, "model");
        j.e(str, "tag");
        if (dVar.getType() == g.PUSH) {
            return;
        }
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (j.a(((qb.e) obj).getId(), dVar.getId())) {
                    break;
                }
            }
        }
        qb.e eVar = (qb.e) obj;
        if (eVar != null) {
            removeSubscriptionFromSubscriptionList(eVar);
        }
    }

    @Override // ob.b, com.onesignal.common.events.d
    public void subscribe(ob.a aVar) {
        j.e(aVar, "handler");
        this.events.subscribe(aVar);
    }

    @Override // ob.b, com.onesignal.common.events.d
    public void unsubscribe(ob.a aVar) {
        j.e(aVar, "handler");
        this.events.unsubscribe(aVar);
    }

    @Override // eb.a
    public void onSessionActive() {
    }

    @Override // eb.a
    public void onSessionEnded(long j3) {
    }
}
