package com.onesignal.user.internal.operations.impl.executors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements z8.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final jb.b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final gb.c _subscriptionBackend;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.loginUser(null, this);
        }
    }

    public c(gb.c cVar, jb.b bVar, com.onesignal.user.internal.properties.b bVar2) {
        pc.j.e(cVar, "_subscriptionBackend");
        pc.j.e(bVar, "_identityModelStore");
        pc.j.e(bVar2, "_propertiesModelStore");
        this._subscriptionBackend = cVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: a -> 0x0034, TryCatch #0 {a -> 0x0034, blocks: (B:11:0x0030, B:12:0x005f, B:14:0x006d, B:17:0x0093, B:19:0x00be, B:20:0x00c9, B:22:0x00d7, B:23:0x00e3, B:28:0x0042), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: a -> 0x0034, TryCatch #0 {a -> 0x0034, blocks: (B:11:0x0030, B:12:0x005f, B:14:0x006d, B:17:0x0093, B:19:0x00be, B:20:0x00c9, B:22:0x00d7, B:23:0x00e3, B:28:0x0042), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(kb.e eVar, fc.d dVar) {
        b bVar;
        int i10;
        c cVar;
        kb.e eVar2;
        String str;
        try {
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i11 = bVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i11 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    i10 = bVar.label;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        gb.c cVar2 = this._subscriptionBackend;
                        String appId = eVar.getAppId();
                        String subscriptionId = eVar.getSubscriptionId();
                        bVar.L$0 = this;
                        bVar.L$1 = eVar;
                        bVar.label = 1;
                        obj = cVar2.getIdentityFromSubscription(appId, subscriptionId, bVar);
                        gc.a aVar = gc.a.f2559g;
                        if (obj == aVar) {
                            return aVar;
                        }
                        cVar = this;
                        eVar2 = eVar;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eVar2 = (kb.e) bVar.L$1;
                        cVar = (c) bVar.L$0;
                        v6.a.W(obj);
                    }
                    str = (String) ((Map) obj).getOrDefault("onesignal_id", null);
                    if (str != null) {
                        com.onesignal.debug.internal.logging.b.warn$default("Subscription " + eVar2.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                        return new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(eVar2.getOnesignalId(), str);
                    jb.a aVar2 = (jb.a) cVar._identityModelStore.getModel();
                    com.onesignal.user.internal.properties.a aVar3 = (com.onesignal.user.internal.properties.a) cVar._propertiesModelStore.getModel();
                    if (pc.j.a(aVar2.getOnesignalId(), eVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar2, "onesignal_id", str, "HYDRATE", false, 8, null);
                    }
                    if (pc.j.a(aVar3.getOnesignalId(), eVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar3, "onesignalId", str, "HYDRATE", false, 8, null);
                    }
                    return new z8.a(z8.b.SUCCESS, linkedHashMap, i7.b.z(new kb.h(eVar2.getAppId(), str)), null, 8, null);
                }
            }
            if (i10 != 0) {
            }
            str = (String) ((Map) obj).getOrDefault("onesignal_id", null);
            if (str != null) {
            }
        } catch (l8.a e10) {
            int i12 = d.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(e10.getStatusCode()).ordinal()];
            return i12 != 1 ? i12 != 2 ? new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null) : new z8.a(z8.b.FAIL_UNAUTHORIZED, null, null, null, 14, null) : new z8.a(z8.b.FAIL_RETRY, null, null, null, 14, null);
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        i10 = bVar.label;
    }

    @Override // z8.d
    public Object execute(List<? extends z8.g> list, fc.d dVar) {
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        z8.g gVar = (z8.g) bc.m.T(list);
        if (gVar instanceof kb.e) {
            return loginUser((kb.e) gVar, dVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // z8.d
    public List<String> getOperations() {
        return i7.b.z(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
