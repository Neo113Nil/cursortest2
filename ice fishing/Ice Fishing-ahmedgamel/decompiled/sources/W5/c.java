package W5;

import H4.g;
import V5.q;
import Z5.d;
import Z5.f;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import u7.C5081g;

/* loaded from: classes2.dex */
public final class c extends I4.a {
    public static final a Companion = new a(null);
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final U5.b _identityModelStore;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final C5081g getSubscriptionEnabledAndStatus(d model) {
            f status;
            boolean z6;
            h.e(model, "model");
            if (model.isDisabledInternally()) {
                return new C5081g(Boolean.FALSE, f.UNSUBSCRIBE);
            }
            if (model.getOptedIn()) {
                f status2 = model.getStatus();
                status = f.SUBSCRIBED;
                if (status2 == status && model.getAddress().length() > 0) {
                    z6 = true;
                    return new C5081g(Boolean.valueOf(z6), status);
                }
            }
            status = !model.getOptedIn() ? f.UNSUBSCRIBE : model.getStatus();
            z6 = false;
            return new C5081g(Boolean.valueOf(z6), status);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Z5.e store, H4.f opRepo, U5.b _identityModelStore, com.onesignal.core.internal.config.c _configModelStore) {
        super(store, opRepo);
        h.e(store, "store");
        h.e(opRepo, "opRepo");
        h.e(_identityModelStore, "_identityModelStore");
        h.e(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // I4.a
    public g getAddOperation(d model) {
        h.e(model, "model");
        C5081g subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new V5.a(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((U5.a) this._identityModelStore.getModel()).getOnesignalId(), ((U5.a) this._identityModelStore.getModel()).getExternalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.f41052n).booleanValue(), model.getAddress(), (f) subscriptionEnabledAndStatus.f41053u);
    }

    @Override // I4.a
    public g getRemoveOperation(d model) {
        h.e(model, "model");
        return new V5.c(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((U5.a) this._identityModelStore.getModel()).getOnesignalId(), ((U5.a) this._identityModelStore.getModel()).getExternalId(), model.getId());
    }

    @Override // I4.a
    public g getUpdateOperation(d model, String path, String property, Object obj, Object obj2) {
        h.e(model, "model");
        h.e(path, "path");
        h.e(property, "property");
        C5081g subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new q(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((U5.a) this._identityModelStore.getModel()).getOnesignalId(), ((U5.a) this._identityModelStore.getModel()).getExternalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.f41052n).booleanValue(), model.getAddress(), (f) subscriptionEnabledAndStatus.f41053u);
    }
}
