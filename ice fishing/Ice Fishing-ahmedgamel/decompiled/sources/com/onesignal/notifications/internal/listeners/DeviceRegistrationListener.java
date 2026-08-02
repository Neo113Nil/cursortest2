package com.onesignal.notifications.internal.listeners;

import B7.h;
import I7.l;
import Z5.f;
import b6.e;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import com.onesignal.core.internal.config.c;
import com.onesignal.notifications.internal.pushtoken.d;
import i5.n;
import i5.o;
import r5.InterfaceC4909a;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class DeviceRegistrationListener implements com.onesignal.core.internal.startup.b, g, o, Z5.a {
    private final InterfaceC4909a _channelManager;
    private final c _configModelStore;
    private final n _notificationsManager;
    private final com.onesignal.notifications.internal.pushtoken.a _pushTokenManager;
    private final Z5.b _subscriptionManager;

    public static final class a extends h implements l {
        int label;

        public a(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return DeviceRegistrationListener.this.new a(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                n nVar = DeviceRegistrationListener.this._notificationsManager;
                this.label = 1;
                if (nVar.requestPermission(true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class b extends h implements l {
        int label;

        public b(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return DeviceRegistrationListener.this.new b(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                com.onesignal.notifications.internal.pushtoken.a aVar2 = DeviceRegistrationListener.this._pushTokenManager;
                this.label = 1;
                obj = aVar2.retrievePushToken(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            d dVar = (d) obj;
            DeviceRegistrationListener.this._subscriptionManager.addOrUpdatePushSubscriptionToken(dVar.getToken(), DeviceRegistrationListener.this._notificationsManager.mo34getPermission() ? dVar.getStatus() : f.NO_PERMISSION);
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public DeviceRegistrationListener(c _configModelStore, InterfaceC4909a _channelManager, com.onesignal.notifications.internal.pushtoken.a _pushTokenManager, n _notificationsManager, Z5.b _subscriptionManager) {
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_channelManager, "_channelManager");
        kotlin.jvm.internal.h.e(_pushTokenManager, "_pushTokenManager");
        kotlin.jvm.internal.h.e(_notificationsManager, "_notificationsManager");
        kotlin.jvm.internal.h.e(_subscriptionManager, "_subscriptionManager");
        this._configModelStore = _configModelStore;
        this._channelManager = _channelManager;
        this._pushTokenManager = _pushTokenManager;
        this._notificationsManager = _notificationsManager;
        this._subscriptionManager = _subscriptionManager;
    }

    private final boolean needsPushTokenRefresh() {
        Z5.d pushSubscriptionModel = this._subscriptionManager.getPushSubscriptionModel();
        return pushSubscriptionModel.getId().length() == 0 || pushSubscriptionModel.getStatus() != f.SUBSCRIBED;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        com.onesignal.common.threading.c.suspendifyOnIO(new b(null));
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
    }

    @Override // i5.o
    public void onNotificationPermissionChange(boolean z6) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // Z5.a
    public void onSubscriptionAdded(e subscription) {
        kotlin.jvm.internal.h.e(subscription, "subscription");
    }

    @Override // Z5.a
    public void onSubscriptionChanged(e subscription, j args) {
        kotlin.jvm.internal.h.e(subscription, "subscription");
        kotlin.jvm.internal.h.e(args, "args");
        if (kotlin.jvm.internal.h.a(args.getPath(), "optedIn") && kotlin.jvm.internal.h.a(args.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo34getPermission()) {
            com.onesignal.common.threading.c.suspendifyOnIO(new a(null));
        }
    }

    @Override // Z5.a
    public void onSubscriptionRemoved(e subscription) {
        kotlin.jvm.internal.h.e(subscription, "subscription");
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        this._notificationsManager.mo31addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
        if (this._notificationsManager.mo34getPermission() && needsPushTokenRefresh()) {
            retrievePushTokenAndUpdateSubscription();
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (tag.equals("HYDRATE")) {
            this._channelManager.processChannelList(model.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
