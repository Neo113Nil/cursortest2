package com.gamericefishpro.space.ch;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.jh.e;
import com.gamericefishpro.space.jh.g;
import com.gamericefishpro.space.oh.h;
import com.gamericefishpro.space.oh.i;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final e _subscriptionModelStore;
    private final h activePushSubscription$delegate;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.gamericefishpro.space.jh.d invoke() {
            Object next;
            Iterator<T> it = c.this._subscriptionModelStore.list().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((com.gamericefishpro.space.jh.d) next).getType() == g.PUSH) {
                    return (com.gamericefishpro.space.jh.d) next;
                }
            }
            next = null;
            return (com.gamericefishpro.space.jh.d) next;
        }
    }

    public c(com.gamericefishpro.space.rc.b _configModelStore, e _subscriptionModelStore) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        this._configModelStore = _configModelStore;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.activePushSubscription$delegate = i.b(new a());
    }

    public final com.gamericefishpro.space.jh.d getActivePushSubscription() {
        return (com.gamericefishpro.space.jh.d) this.activePushSubscription$delegate.getValue();
    }

    @Override // com.gamericefishpro.space.ch.b, com.gamericefishpro.space.ch.a
    public boolean isInBadState() {
        return ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getPushSubscriptionId() == null && getActivePushSubscription() != null;
    }

    @Override // com.gamericefishpro.space.ch.b, com.gamericefishpro.space.ch.a
    public void recover() {
        com.gamericefishpro.space.rc.a aVar = (com.gamericefishpro.space.rc.a) this._configModelStore.getModel();
        com.gamericefishpro.space.jh.d activePushSubscription = getActivePushSubscription();
        aVar.setPushSubscriptionId(activePushSubscription != null ? activePushSubscription.getId() : null);
    }

    @Override // com.gamericefishpro.space.ch.b, com.gamericefishpro.space.ch.a
    public String recoveryMessage() {
        return "Recovering missing push subscription ID in the config model store.";
    }
}
