package com.onesignal.user.internal.operations.impl.executors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t4.C5040a;
import v7.AbstractC5129j;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class g implements H4.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final U5.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final Q5.c _subscriptionBackend;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.loginUser(null, this);
        }
    }

    public g(Q5.c _subscriptionBackend, U5.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.h.e(_subscriptionBackend, "_subscriptionBackend");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.h.e(_identityVerificationService, "_identityVerificationService");
        this._subscriptionBackend = _subscriptionBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: a -> 0x0036, TryCatch #0 {a -> 0x0036, blocks: (B:11:0x0032, B:12:0x005f, B:16:0x0071, B:19:0x0097, B:21:0x00c2, B:22:0x00cd, B:24:0x00db, B:25:0x00e7, B:31:0x0044), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097 A[Catch: a -> 0x0036, TryCatch #0 {a -> 0x0036, blocks: (B:11:0x0032, B:12:0x005f, B:16:0x0071, B:19:0x0097, B:21:0x00c2, B:22:0x00cd, B:24:0x00db, B:25:0x00e7, B:31:0x0044), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(V5.e eVar, InterfaceC5267d interfaceC5267d) {
        b bVar;
        int i;
        g gVar;
        V5.e eVar2;
        String str;
        try {
            if (interfaceC5267d instanceof b) {
                bVar = (b) interfaceC5267d;
                int i6 = bVar.label;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i6 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    A7.a aVar = A7.a.f58n;
                    i = bVar.label;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj);
                        Q5.c cVar = this._subscriptionBackend;
                        String appId = eVar.getAppId();
                        String subscriptionId = eVar.getSubscriptionId();
                        bVar.L$0 = this;
                        bVar.L$1 = eVar;
                        bVar.label = 1;
                        obj = cVar.getIdentityFromSubscription(appId, subscriptionId, bVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        gVar = this;
                        eVar2 = eVar;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eVar2 = (V5.e) bVar.L$1;
                        gVar = (g) bVar.L$0;
                        com.bumptech.glide.d.k(obj);
                    }
                    String str2 = (String) ((Map) obj).get("onesignal_id");
                    str = str2 != null ? null : str2;
                    if (str != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("Subscription " + eVar2.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                        return new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(eVar2.getOnesignalId(), str);
                    U5.a aVar2 = (U5.a) gVar._identityModelStore.getModel();
                    com.onesignal.user.internal.properties.a aVar3 = (com.onesignal.user.internal.properties.a) gVar._propertiesModelStore.getModel();
                    if (kotlin.jvm.internal.h.a(aVar2.getOnesignalId(), eVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar2, "onesignal_id", str, "HYDRATE", false, 8, null);
                    }
                    if (kotlin.jvm.internal.h.a(aVar3.getOnesignalId(), eVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar3, "onesignalId", str, "HYDRATE", false, 8, null);
                    }
                    return new H4.a(H4.b.SUCCESS, linkedHashMap, d6.c.k(new V5.h(eVar2.getAppId(), str, eVar2.getExternalId())), null, 8, null);
                }
            }
            if (i != 0) {
            }
            String str22 = (String) ((Map) obj).get("onesignal_id");
            if (str22 != null) {
            }
            if (str != null) {
            }
        } catch (C5040a e9) {
            int i9 = h.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e9.getStatusCode()).ordinal()];
            return i9 != 1 ? i9 != 2 ? new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null) : new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, null, 14, null) : new H4.a(H4.b.FAIL_RETRY, null, null, null, 14, null);
        }
        bVar = new b(interfaceC5267d);
        Object obj2 = bVar.result;
        A7.a aVar4 = A7.a.f58n;
        i = bVar.label;
    }

    @Override // H4.d
    public Object execute(List<? extends H4.g> list, InterfaceC5267d interfaceC5267d) {
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (this._identityVerificationService.getNewCodePathsRun() && c.shouldFailLoginUserFromSubscription(this._identityVerificationService.getIvBehaviorActive())) {
            com.onesignal.debug.internal.logging.b.warn$default("LoginUserFromSubscriptionOperation is not supported when identity verification is enabled. Dropping.", null, 2, null);
            return new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null);
        }
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        H4.g gVar = (H4.g) AbstractC5129j.A(list);
        if (gVar instanceof V5.e) {
            return loginUser((V5.e) gVar, interfaceC5267d);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // H4.d
    public List<String> getOperations() {
        return d6.c.k(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
