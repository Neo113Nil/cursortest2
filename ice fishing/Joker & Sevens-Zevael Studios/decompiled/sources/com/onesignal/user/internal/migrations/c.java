package com.onesignal.user.internal.migrations;

import ac.f;
import bc.a0;
import java.util.Iterator;
import ob.e;
import ob.g;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends b {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final e _subscriptionModelStore;
    private final f activePushSubscription$delegate;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.a {
        public a() {
            super(0);
        }

        @Override // oc.a
        public final ob.d invoke() {
            Object obj;
            Iterator<T> it = c.this._subscriptionModelStore.list().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ob.d) obj).getType() == g.PUSH) {
                    break;
                }
            }
            return (ob.d) obj;
        }
    }

    public c(com.onesignal.core.internal.config.b bVar, e eVar) {
        j.e(bVar, "_configModelStore");
        j.e(eVar, "_subscriptionModelStore");
        this._configModelStore = bVar;
        this._subscriptionModelStore = eVar;
        this.activePushSubscription$delegate = a0.y(new a());
    }

    public final ob.d getActivePushSubscription() {
        return (ob.d) this.activePushSubscription$delegate.getValue();
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public boolean isInBadState() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getPushSubscriptionId() == null && getActivePushSubscription() != null;
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public void recover() {
        com.onesignal.core.internal.config.a aVar = (com.onesignal.core.internal.config.a) this._configModelStore.getModel();
        ob.d activePushSubscription = getActivePushSubscription();
        aVar.setPushSubscriptionId(activePushSubscription != null ? activePushSubscription.getId() : null);
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public String recoveryMessage() {
        return "Recovering missing push subscription ID in the config model store.";
    }
}
