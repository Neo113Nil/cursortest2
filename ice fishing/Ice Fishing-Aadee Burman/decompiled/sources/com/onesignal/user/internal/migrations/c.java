package com.onesignal.user.internal.migrations;

import Z5.e;
import Z5.g;
import a.AbstractC0422a;
import java.util.Iterator;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import u7.InterfaceC5087e;

/* loaded from: classes2.dex */
public final class c extends b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final e _subscriptionModelStore;
    private final InterfaceC5087e activePushSubscription$delegate;

    public static final class a extends i implements I7.a {
        public a() {
            super(0);
        }

        @Override // I7.a
        public final Z5.d invoke() {
            Object obj;
            Iterator<T> it = c.this._subscriptionModelStore.list().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Z5.d) obj).getType() == g.PUSH) {
                    break;
                }
            }
            return (Z5.d) obj;
        }
    }

    public c(com.onesignal.core.internal.config.c _configModelStore, e _subscriptionModelStore) {
        h.e(_configModelStore, "_configModelStore");
        h.e(_subscriptionModelStore, "_subscriptionModelStore");
        this._configModelStore = _configModelStore;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.activePushSubscription$delegate = AbstractC0422a.q(new a());
    }

    public final Z5.d getActivePushSubscription() {
        return (Z5.d) this.activePushSubscription$delegate.getValue();
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public boolean isInBadState() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getPushSubscriptionId() == null && getActivePushSubscription() != null;
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public void recover() {
        com.onesignal.core.internal.config.b bVar = (com.onesignal.core.internal.config.b) this._configModelStore.getModel();
        Z5.d activePushSubscription = getActivePushSubscription();
        bVar.setPushSubscriptionId(activePushSubscription != null ? activePushSubscription.getId() : null);
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public String recoveryMessage() {
        return "Recovering missing push subscription ID in the config model store.";
    }
}
