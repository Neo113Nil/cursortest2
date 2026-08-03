package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import bc.a0;
import bc.w;
import bc.z;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kb.o;
import kb.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements z8.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER = "login-user";
    private final q8.f _application;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final v8.c _deviceService;
    private final jb.b _identityModelStore;
    private final com.onesignal.user.internal.operations.impl.executors.a _identityOperationExecutor;
    private final x8.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final ob.e _subscriptionsModelStore;
    private final gb.d _userBackend;

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
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.createUser(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.loginUser(null, null, this);
        }
    }

    public e(com.onesignal.user.internal.operations.impl.executors.a aVar, q8.f fVar, v8.c cVar, gb.d dVar, jb.b bVar, com.onesignal.user.internal.properties.b bVar2, ob.e eVar, com.onesignal.core.internal.config.b bVar3, x8.a aVar2) {
        pc.j.e(aVar, "_identityOperationExecutor");
        pc.j.e(fVar, "_application");
        pc.j.e(cVar, "_deviceService");
        pc.j.e(dVar, "_userBackend");
        pc.j.e(bVar, "_identityModelStore");
        pc.j.e(bVar2, "_propertiesModelStore");
        pc.j.e(eVar, "_subscriptionsModelStore");
        pc.j.e(bVar3, "_configModelStore");
        pc.j.e(aVar2, "_languageContext");
        this._identityOperationExecutor = aVar;
        this._application = fVar;
        this._deviceService = cVar;
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
        this._languageContext = aVar2;
    }

    private final Map<String, gb.h> createSubscriptionsFromOperation(o oVar, Map<String, gb.h> map) {
        LinkedHashMap S = z.S(map);
        if (!S.containsKey(oVar.getSubscriptionId())) {
            S.put(oVar.getSubscriptionId(), new gb.h(oVar.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
            return S;
        }
        String subscriptionId = oVar.getSubscriptionId();
        String subscriptionId2 = oVar.getSubscriptionId();
        gb.h hVar = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar);
        gb.j type = hVar.getType();
        gb.h hVar2 = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar2);
        String token = hVar2.getToken();
        gb.h hVar3 = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar3);
        Boolean enabled = hVar3.getEnabled();
        gb.h hVar4 = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar4);
        Integer notificationTypes = hVar4.getNotificationTypes();
        gb.h hVar5 = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar5);
        String sdk = hVar5.getSdk();
        gb.h hVar6 = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar6);
        String deviceModel = hVar6.getDeviceModel();
        gb.h hVar7 = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar7);
        String deviceOS = hVar7.getDeviceOS();
        gb.h hVar8 = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar8);
        Boolean rooted = hVar8.getRooted();
        gb.h hVar9 = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar9);
        Integer netType = hVar9.getNetType();
        gb.h hVar10 = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar10);
        String carrier = hVar10.getCarrier();
        gb.h hVar11 = map.get(oVar.getSubscriptionId());
        pc.j.b(hVar11);
        S.put(subscriptionId, new gb.h(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar11.getAppVersion()));
        return S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0158 A[Catch: a -> 0x0043, TryCatch #0 {a -> 0x0043, blocks: (B:12:0x0037, B:14:0x011b, B:16:0x0158, B:17:0x0165, B:19:0x0173, B:20:0x0181, B:22:0x0188, B:24:0x0193, B:26:0x01c9, B:27:0x01d8, B:29:0x01ee, B:31:0x01ff, B:35:0x0202, B:37:0x0208, B:39:0x0219, B:80:0x00da, B:81:0x00f1, B:83:0x00f7, B:85:0x0105), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0173 A[Catch: a -> 0x0043, TryCatch #0 {a -> 0x0043, blocks: (B:12:0x0037, B:14:0x011b, B:16:0x0158, B:17:0x0165, B:19:0x0173, B:20:0x0181, B:22:0x0188, B:24:0x0193, B:26:0x01c9, B:27:0x01d8, B:29:0x01ee, B:31:0x01ff, B:35:0x0202, B:37:0x0208, B:39:0x0219, B:80:0x00da, B:81:0x00f1, B:83:0x00f7, B:85:0x0105), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c9 A[Catch: a -> 0x0043, TryCatch #0 {a -> 0x0043, blocks: (B:12:0x0037, B:14:0x011b, B:16:0x0158, B:17:0x0165, B:19:0x0173, B:20:0x0181, B:22:0x0188, B:24:0x0193, B:26:0x01c9, B:27:0x01d8, B:29:0x01ee, B:31:0x01ff, B:35:0x0202, B:37:0x0208, B:39:0x0219, B:80:0x00da, B:81:0x00f1, B:83:0x00f7, B:85:0x0105), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ee A[Catch: a -> 0x0043, TryCatch #0 {a -> 0x0043, blocks: (B:12:0x0037, B:14:0x011b, B:16:0x0158, B:17:0x0165, B:19:0x0173, B:20:0x0181, B:22:0x0188, B:24:0x0193, B:26:0x01c9, B:27:0x01d8, B:29:0x01ee, B:31:0x01ff, B:35:0x0202, B:37:0x0208, B:39:0x0219, B:80:0x00da, B:81:0x00f1, B:83:0x00f7, B:85:0x0105), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0208 A[Catch: a -> 0x0043, TryCatch #0 {a -> 0x0043, blocks: (B:12:0x0037, B:14:0x011b, B:16:0x0158, B:17:0x0165, B:19:0x0173, B:20:0x0181, B:22:0x0188, B:24:0x0193, B:26:0x01c9, B:27:0x01d8, B:29:0x01ee, B:31:0x01ff, B:35:0x0202, B:37:0x0208, B:39:0x0219, B:80:0x00da, B:81:0x00f1, B:83:0x00f7, B:85:0x0105), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createUser(kb.f fVar, List<? extends z8.g> list, fc.d dVar) {
        b bVar;
        int i10;
        Map<String, gb.h> map;
        List P;
        kb.f fVar2;
        Object createUser;
        e eVar;
        gb.a aVar;
        LinkedHashMap linkedHashMap;
        jb.a aVar2;
        com.onesignal.user.internal.properties.a aVar3;
        int size;
        int i11;
        ob.d dVar2;
        try {
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i12 = bVar.label;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i12 - Integer.MIN_VALUE;
                    b bVar2 = bVar;
                    Object obj = bVar2.result;
                    i10 = bVar2.label;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        String timeZoneId = com.onesignal.common.l.INSTANCE.getTimeZoneId();
                        pc.j.b(timeZoneId);
                        linkedHashMap2.put("timezone_id", timeZoneId);
                        linkedHashMap2.put("language", this._languageContext.getLanguage());
                        String externalId = fVar.getExternalId();
                        Map<String, gb.h> map2 = w.f1068g;
                        if (externalId != null) {
                            LinkedHashMap S = z.S(map2);
                            String externalId2 = fVar.getExternalId();
                            pc.j.b(externalId2);
                            S.put("external_id", externalId2);
                            map = S;
                        } else {
                            map = map2;
                        }
                        for (z8.g gVar : list) {
                            if (gVar instanceof kb.a) {
                                map2 = createSubscriptionsFromOperation((kb.a) gVar, map2);
                            } else if (gVar instanceof o) {
                                map2 = createSubscriptionsFromOperation((o) gVar, map2);
                            } else if (gVar instanceof p) {
                                map2 = createSubscriptionsFromOperation((p) gVar, map2);
                            } else {
                                if (!(gVar instanceof kb.c)) {
                                    throw new Exception("Unrecognized operation: " + gVar);
                                }
                                map2 = createSubscriptionsFromOperation((kb.c) gVar, map2);
                            }
                        }
                        P = z.P(map2);
                        gb.d dVar3 = this._userBackend;
                        String appId = fVar.getAppId();
                        ArrayList arrayList = new ArrayList(bc.o.O(P));
                        Iterator it = P.iterator();
                        while (it.hasNext()) {
                            arrayList.add((gb.h) ((ac.i) it.next()).f271h);
                        }
                        bVar2.L$0 = this;
                        fVar2 = fVar;
                        bVar2.L$1 = fVar2;
                        bVar2.L$2 = map;
                        bVar2.L$3 = P;
                        bVar2.label = 1;
                        createUser = dVar3.createUser(appId, map, arrayList, linkedHashMap2, bVar2);
                        gc.a aVar4 = gc.a.f2559g;
                        if (createUser == aVar4) {
                            return aVar4;
                        }
                        eVar = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        P = (List) bVar2.L$3;
                        Map<String, gb.h> map3 = (Map) bVar2.L$2;
                        kb.f fVar3 = (kb.f) bVar2.L$1;
                        e eVar2 = (e) bVar2.L$0;
                        v6.a.W(obj);
                        createUser = obj;
                        fVar2 = fVar3;
                        eVar = eVar2;
                        map = map3;
                    }
                    aVar = (gb.a) createUser;
                    linkedHashMap = new LinkedHashMap();
                    String str = aVar.getIdentities().get("onesignal_id");
                    pc.j.b(str);
                    String str2 = str;
                    linkedHashMap.put(fVar2.getOnesignalId(), str2);
                    aVar2 = (jb.a) eVar._identityModelStore.getModel();
                    aVar3 = (com.onesignal.user.internal.properties.a) eVar._propertiesModelStore.getModel();
                    if (pc.j.a(aVar2.getOnesignalId(), fVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar2, "onesignal_id", str2, "HYDRATE", false, 8, null);
                    }
                    if (pc.j.a(aVar3.getOnesignalId(), fVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar3, "onesignalId", str2, "HYDRATE", false, 8, null);
                    }
                    size = P.size();
                    for (i11 = 0; i11 < size && i11 < aVar.getSubscriptions().size(); i11++) {
                        gb.h hVar = aVar.getSubscriptions().get(i11);
                        Object obj2 = ((ac.i) P.get(i11)).f270g;
                        String id2 = hVar.getId();
                        pc.j.b(id2);
                        linkedHashMap.put(obj2, id2);
                        if (pc.j.a(((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).getPushSubscriptionId(), ((ac.i) P.get(i11)).f270g)) {
                            ((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).setPushSubscriptionId(hVar.getId());
                        }
                        dVar2 = (ob.d) eVar._subscriptionsModelStore.get((String) ((ac.i) P.get(i11)).f270g);
                        if (dVar2 == null) {
                            com.onesignal.common.modeling.i.setStringProperty$default(dVar2, "id", hVar.getId(), "HYDRATE", false, 8, null);
                        }
                    }
                    return new z8.a(z8.b.SUCCESS, linkedHashMap, map.isEmpty() ? i7.b.z(new kb.h(fVar2.getAppId(), str2)) : null, null, 8, null);
                }
            }
            if (i10 != 0) {
            }
            aVar = (gb.a) createUser;
            linkedHashMap = new LinkedHashMap();
            String str3 = aVar.getIdentities().get("onesignal_id");
            pc.j.b(str3);
            String str22 = str3;
            linkedHashMap.put(fVar2.getOnesignalId(), str22);
            aVar2 = (jb.a) eVar._identityModelStore.getModel();
            aVar3 = (com.onesignal.user.internal.properties.a) eVar._propertiesModelStore.getModel();
            if (pc.j.a(aVar2.getOnesignalId(), fVar2.getOnesignalId())) {
            }
            if (pc.j.a(aVar3.getOnesignalId(), fVar2.getOnesignalId())) {
            }
            size = P.size();
            while (i11 < size) {
                gb.h hVar2 = aVar.getSubscriptions().get(i11);
                Object obj22 = ((ac.i) P.get(i11)).f270g;
                String id22 = hVar2.getId();
                pc.j.b(id22);
                linkedHashMap.put(obj22, id22);
                if (pc.j.a(((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).getPushSubscriptionId(), ((ac.i) P.get(i11)).f270g)) {
                }
                dVar2 = (ob.d) eVar._subscriptionsModelStore.get((String) ((ac.i) P.get(i11)).f270g);
                if (dVar2 == null) {
                }
            }
            return new z8.a(z8.b.SUCCESS, linkedHashMap, map.isEmpty() ? i7.b.z(new kb.h(fVar2.getAppId(), str22)) : null, null, 8, null);
        } catch (l8.a e10) {
            int i13 = f.$EnumSwitchMapping$1[com.onesignal.common.h.INSTANCE.getResponseStatusType(e10.getStatusCode()).ordinal()];
            return i13 != 1 ? i13 != 2 ? new z8.a(z8.b.FAIL_PAUSE_OPREPO, null, null, null, 14, null) : new z8.a(z8.b.FAIL_UNAUTHORIZED, null, null, e10.getRetryAfterSeconds(), 6, null) : new z8.a(z8.b.FAIL_RETRY, null, null, e10.getRetryAfterSeconds(), 6, null);
        }
        bVar = new b(dVar);
        b bVar22 = bVar;
        Object obj3 = bVar22.result;
        i10 = bVar22.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(kb.f fVar, List<? extends z8.g> list, fc.d dVar) {
        c cVar;
        int i10;
        e eVar;
        int i11;
        kb.f fVar2 = fVar;
        List<? extends z8.g> list2 = list;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i12 = cVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.label = i12 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                i10 = cVar.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    if (list2 == null || !list2.isEmpty()) {
                        for (z8.g gVar : list2) {
                            if ((gVar instanceof kb.a) || (gVar instanceof o)) {
                                break;
                            }
                        }
                    }
                    if (fVar2.getExternalId() == null) {
                        return new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (fVar2.getExistingOnesignalId() == null || fVar2.getExternalId() == null) {
                        cVar.label = 1;
                        Object createUser = createUser(fVar2, list2, cVar);
                        if (createUser != aVar) {
                            return createUser;
                        }
                    } else {
                        com.onesignal.user.internal.operations.impl.executors.a aVar2 = this._identityOperationExecutor;
                        String appId = fVar2.getAppId();
                        String existingOnesignalId = fVar2.getExistingOnesignalId();
                        pc.j.b(existingOnesignalId);
                        String externalId = fVar2.getExternalId();
                        pc.j.b(externalId);
                        List<? extends z8.g> z10 = i7.b.z(new kb.i(appId, existingOnesignalId, "external_id", externalId));
                        cVar.L$0 = this;
                        cVar.L$1 = fVar2;
                        cVar.L$2 = list2;
                        cVar.label = 2;
                        obj = aVar2.execute(z10, cVar);
                        if (obj != aVar) {
                            eVar = this;
                        }
                    }
                    return aVar;
                }
                if (i10 == 1) {
                    v6.a.W(obj);
                    return obj;
                }
                if (i10 != 2) {
                    if (i10 == 3) {
                        v6.a.W(obj);
                        return obj;
                    }
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return obj;
                }
                List<? extends z8.g> list3 = (List) cVar.L$2;
                kb.f fVar3 = (kb.f) cVar.L$1;
                eVar = (e) cVar.L$0;
                v6.a.W(obj);
                list2 = list3;
                fVar2 = fVar3;
                z8.a aVar3 = (z8.a) obj;
                i11 = f.$EnumSwitchMapping$0[aVar3.getResult().ordinal()];
                if (i11 != 1) {
                    String existingOnesignalId2 = fVar2.getExistingOnesignalId();
                    pc.j.b(existingOnesignalId2);
                    if (pc.j.a(((jb.a) eVar._identityModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(eVar._identityModelStore.getModel(), "onesignal_id", existingOnesignalId2, "HYDRATE", false, 8, null);
                    }
                    if (pc.j.a(((com.onesignal.user.internal.properties.a) eVar._propertiesModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(eVar._propertiesModelStore.getModel(), "onesignalId", existingOnesignalId2, "HYDRATE", false, 8, null);
                    }
                    return new z8.a(z8.b.SUCCESS_STARTING_ONLY, a0.C(new ac.i(fVar2.getOnesignalId(), existingOnesignalId2)), null, null, 12, null);
                }
                if (i11 == 2) {
                    com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 3;
                    Object createUser2 = eVar.createUser(fVar2, list2, cVar);
                    if (createUser2 != aVar) {
                        return createUser2;
                    }
                } else {
                    if (i11 != 3) {
                        return new z8.a(aVar3.getResult(), null, null, null, 14, null);
                    }
                    com.onesignal.debug.internal.logging.b.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 4;
                    Object createUser3 = eVar.createUser(fVar2, list2, cVar);
                    if (createUser3 != aVar) {
                        return createUser3;
                    }
                }
                return aVar;
            }
        }
        cVar = new c(dVar);
        Object obj2 = cVar.result;
        i10 = cVar.label;
        gc.a aVar4 = gc.a.f2559g;
        if (i10 != 0) {
        }
        z8.a aVar32 = (z8.a) obj2;
        i11 = f.$EnumSwitchMapping$0[aVar32.getResult().ordinal()];
        if (i11 != 1) {
        }
    }

    @Override // z8.d
    public Object execute(List<? extends z8.g> list, fc.d dVar) {
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        z8.g gVar = (z8.g) bc.m.T(list);
        if (gVar instanceof kb.f) {
            return loginUser((kb.f) gVar, bc.m.S(list), dVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // z8.d
    public List<String> getOperations() {
        return i7.b.z(LOGIN_USER);
    }

    private final Map<String, gb.h> createSubscriptionsFromOperation(kb.a aVar, Map<String, gb.h> map) {
        gb.j jVar;
        LinkedHashMap S = z.S(map);
        int i10 = f.$EnumSwitchMapping$2[aVar.getType().ordinal()];
        if (i10 == 1) {
            jVar = gb.j.SMS;
        } else if (i10 != 2) {
            jVar = gb.j.Companion.fromDeviceType(this._deviceService.getDeviceType());
        } else {
            jVar = gb.j.EMAIL;
        }
        gb.j jVar2 = jVar;
        String subscriptionId = aVar.getSubscriptionId();
        String address = aVar.getAddress();
        Boolean valueOf = Boolean.valueOf(aVar.getEnabled());
        Integer valueOf2 = Integer.valueOf(aVar.getStatus().getValue());
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        Boolean valueOf3 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
        com.onesignal.common.d dVar = com.onesignal.common.d.INSTANCE;
        S.put(subscriptionId, new gb.h(null, jVar2, address, valueOf, valueOf2, com.onesignal.common.i.SDK_VERSION, str, str2, valueOf3, dVar.getNetType(this._application.getAppContext()), dVar.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return S;
    }

    private final Map<String, gb.h> createSubscriptionsFromOperation(p pVar, Map<String, gb.h> map) {
        LinkedHashMap S = z.S(map);
        if (S.containsKey(pVar.getSubscriptionId())) {
            String subscriptionId = pVar.getSubscriptionId();
            gb.h hVar = map.get(pVar.getSubscriptionId());
            pc.j.b(hVar);
            String id2 = hVar.getId();
            gb.h hVar2 = map.get(pVar.getSubscriptionId());
            pc.j.b(hVar2);
            gb.j type = hVar2.getType();
            String address = pVar.getAddress();
            Boolean valueOf = Boolean.valueOf(pVar.getEnabled());
            Integer valueOf2 = Integer.valueOf(pVar.getStatus().getValue());
            gb.h hVar3 = map.get(pVar.getSubscriptionId());
            pc.j.b(hVar3);
            String sdk = hVar3.getSdk();
            gb.h hVar4 = map.get(pVar.getSubscriptionId());
            pc.j.b(hVar4);
            String deviceModel = hVar4.getDeviceModel();
            gb.h hVar5 = map.get(pVar.getSubscriptionId());
            pc.j.b(hVar5);
            String deviceOS = hVar5.getDeviceOS();
            gb.h hVar6 = map.get(pVar.getSubscriptionId());
            pc.j.b(hVar6);
            Boolean rooted = hVar6.getRooted();
            gb.h hVar7 = map.get(pVar.getSubscriptionId());
            pc.j.b(hVar7);
            Integer netType = hVar7.getNetType();
            gb.h hVar8 = map.get(pVar.getSubscriptionId());
            pc.j.b(hVar8);
            String carrier = hVar8.getCarrier();
            gb.h hVar9 = map.get(pVar.getSubscriptionId());
            pc.j.b(hVar9);
            S.put(subscriptionId, new gb.h(id2, type, address, valueOf, valueOf2, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar9.getAppVersion()));
        }
        return S;
    }

    private final Map<String, gb.h> createSubscriptionsFromOperation(kb.c cVar, Map<String, gb.h> map) {
        LinkedHashMap S = z.S(map);
        S.remove(cVar.getSubscriptionId());
        return S;
    }
}
