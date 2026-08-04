package com.gamericefishpro.space.fh;

import com.gamericefishpro.space.bd.g;
import com.gamericefishpro.space.dh.q;
import com.gamericefishpro.space.jh.d;
import com.gamericefishpro.space.jh.e;
import com.gamericefishpro.space.jh.f;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.gamericefishpro.space.dd.a {
    public static final a Companion = new a(null);
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.bh.b _identityModelStore;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX WARN: Code duplicated, block: B:13:0x0029  */
        /* JADX WARN: Code duplicated, block: B:9:0x001f  */
        public final Pair<Boolean, f> getSubscriptionEnabledAndStatus(d model) {
            f status;
            f fVar;
            boolean z;
            Intrinsics.checkNotNullParameter(model, "model");
            if (model.getOptedIn()) {
                f status2 = model.getStatus();
                fVar = f.SUBSCRIBED;
                if (status2 != fVar || model.getAddress().length() <= 0) {
                    if (model.getOptedIn()) {
                        status = model.getStatus();
                    } else {
                        status = f.UNSUBSCRIBE;
                    }
                    fVar = status;
                    z = false;
                } else {
                    z = true;
                }
            } else {
                if (model.getOptedIn()) {
                    status = f.UNSUBSCRIBE;
                } else {
                    status = model.getStatus();
                }
                fVar = status;
                z = false;
            }
            return new Pair<>(Boolean.valueOf(z), fVar);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e store, com.gamericefishpro.space.bd.f opRepo, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.rc.b _configModelStore) {
        super(store, opRepo);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // com.gamericefishpro.space.dd.a
    public g getAddOperation(d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Pair<Boolean, f> subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new com.gamericefishpro.space.dh.a(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId(), ((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.d).booleanValue(), model.getAddress(), (f) subscriptionEnabledAndStatus.e);
    }

    @Override // com.gamericefishpro.space.dd.a
    public g getRemoveOperation(d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new com.gamericefishpro.space.dh.c(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId(), ((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId(), model.getId());
    }

    @Override // com.gamericefishpro.space.dd.a
    public g getUpdateOperation(d model, String path, String property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(property, "property");
        Pair<Boolean, f> subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new q(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId(), ((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.d).booleanValue(), model.getAddress(), (f) subscriptionEnabledAndStatus.e);
    }
}
