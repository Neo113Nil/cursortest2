package com.gamericefishpro.space.eh;

import com.gamericefishpro.space.ph.w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.bd.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.hh.b _propertiesModelStore;
    private final com.gamericefishpro.space.vg.c _subscriptionBackend;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.loginUser(null, this);
        }
    }

    public e(com.gamericefishpro.space.vg.c _subscriptionBackend, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.hh.b _propertiesModelStore) {
        Intrinsics.checkNotNullParameter(_subscriptionBackend, "_subscriptionBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        this._subscriptionBackend = _subscriptionBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object loginUser(com.gamericefishpro.space.dh.e eVar, com.gamericefishpro.space.th.a aVar) {
        b bVar;
        e eVar2;
        com.gamericefishpro.space.dh.e eVar3;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object identityFromSubscription = bVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar.label;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(identityFromSubscription);
                com.gamericefishpro.space.vg.c cVar = this._subscriptionBackend;
                String appId = eVar.getAppId();
                String subscriptionId = eVar.getSubscriptionId();
                bVar.L$0 = this;
                bVar.L$1 = eVar;
                bVar.label = 1;
                identityFromSubscription = cVar.getIdentityFromSubscription(appId, subscriptionId, bVar);
                if (identityFromSubscription == aVar2) {
                    return aVar2;
                }
                eVar2 = this;
                eVar3 = eVar;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar3 = (com.gamericefishpro.space.dh.e) bVar.L$1;
                eVar2 = (e) bVar.L$0;
                com.gamericefishpro.space.wa.b.P(identityFromSubscription);
            }
            String str = (String) ((Map) identityFromSubscription).getOrDefault("onesignal_id", null);
            if (str == null) {
                com.gamericefishpro.space.od.b.warn$default("Subscription " + eVar3.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(eVar3.getOnesignalId(), str);
            com.gamericefishpro.space.bh.a aVar3 = (com.gamericefishpro.space.bh.a) eVar2._identityModelStore.getModel();
            com.gamericefishpro.space.hh.a aVar4 = (com.gamericefishpro.space.hh.a) eVar2._propertiesModelStore.getModel();
            if (Intrinsics.a(aVar3.getOnesignalId(), eVar3.getOnesignalId())) {
                com.gamericefishpro.space.fc.i.setStringProperty$default(aVar3, "onesignal_id", str, "HYDRATE", false, 8, null);
            }
            if (Intrinsics.a(aVar4.getOnesignalId(), eVar3.getOnesignalId())) {
                com.gamericefishpro.space.fc.i.setStringProperty$default(aVar4, "onesignalId", str, "HYDRATE", false, 8, null);
            }
            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, linkedHashMap, w.c(new com.gamericefishpro.space.dh.h(eVar3.getAppId(), str)), null, 8, null);
        } catch (com.gamericefishpro.space.ec.a e) {
            int i3 = f.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i3 != 1) {
                return i3 != 2 ? new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null) : new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
            }
            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, null, 14, null);
        }
    }

    @Override // com.gamericefishpro.space.bd.d
    public Object execute(List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar) throws Exception {
        com.gamericefishpro.space.od.b.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        com.gamericefishpro.space.bd.g gVar = (com.gamericefishpro.space.bd.g) CollectionsKt.w(list);
        if (gVar instanceof com.gamericefishpro.space.dh.e) {
            return loginUser((com.gamericefishpro.space.dh.e) gVar, aVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // com.gamericefishpro.space.bd.d
    public List<String> getOperations() {
        return w.c(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
