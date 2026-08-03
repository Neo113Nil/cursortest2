package com.onesignal.notifications.internal.listeners;

import ca.n;
import ca.o;
import com.onesignal.common.modeling.g;
import fc.d;
import hc.j;
import ob.f;
import oc.c;
import qb.e;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class DeviceRegistrationListener implements d9.b, g, o, ob.a {
    private final la.a _channelManager;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final n _notificationsManager;
    private final com.onesignal.notifications.internal.pushtoken.a _pushTokenManager;
    private final ob.b _subscriptionManager;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends j implements c {
        int label;

        public a(d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final d create(d dVar) {
            return DeviceRegistrationListener.this.new a(dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((a) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                n nVar = DeviceRegistrationListener.this._notificationsManager;
                this.label = 1;
                Object requestPermission = nVar.requestPermission(true, this);
                gc.a aVar = gc.a.f2559g;
                if (requestPermission == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements c {
        int label;

        public b(d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final d create(d dVar) {
            return DeviceRegistrationListener.this.new b(dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                com.onesignal.notifications.internal.pushtoken.a aVar = DeviceRegistrationListener.this._pushTokenManager;
                this.label = 1;
                obj = aVar.retrievePushToken(this);
                gc.a aVar2 = gc.a.f2559g;
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            com.onesignal.notifications.internal.pushtoken.d dVar = (com.onesignal.notifications.internal.pushtoken.d) obj;
            DeviceRegistrationListener.this._subscriptionManager.addOrUpdatePushSubscriptionToken(dVar.getToken(), DeviceRegistrationListener.this._notificationsManager.mo31getPermission() ? dVar.getStatus() : f.NO_PERMISSION);
            return ac.o.f277a;
        }
    }

    public DeviceRegistrationListener(com.onesignal.core.internal.config.b bVar, la.a aVar, com.onesignal.notifications.internal.pushtoken.a aVar2, n nVar, ob.b bVar2) {
        pc.j.e(bVar, "_configModelStore");
        pc.j.e(aVar, "_channelManager");
        pc.j.e(aVar2, "_pushTokenManager");
        pc.j.e(nVar, "_notificationsManager");
        pc.j.e(bVar2, "_subscriptionManager");
        this._configModelStore = bVar;
        this._channelManager = aVar;
        this._pushTokenManager = aVar2;
        this._notificationsManager = nVar;
        this._subscriptionManager = bVar2;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(null), 1, null);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        pc.j.e(jVar, "args");
        pc.j.e(str, "tag");
    }

    @Override // ca.o
    public void onNotificationPermissionChange(boolean z10) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // ob.a
    public void onSubscriptionAdded(e eVar) {
        pc.j.e(eVar, "subscription");
    }

    @Override // ob.a
    public void onSubscriptionChanged(e eVar, com.onesignal.common.modeling.j jVar) {
        pc.j.e(eVar, "subscription");
        pc.j.e(jVar, "args");
        if (pc.j.a(jVar.getPath(), "optedIn") && pc.j.a(jVar.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo31getPermission()) {
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(null), 1, null);
        }
    }

    @Override // ob.a
    public void onSubscriptionRemoved(e eVar) {
        pc.j.e(eVar, "subscription");
    }

    @Override // d9.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        this._notificationsManager.mo28addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        pc.j.e(aVar, "model");
        pc.j.e(str, "tag");
        if (str.equals("HYDRATE")) {
            this._channelManager.processChannelList(aVar.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
