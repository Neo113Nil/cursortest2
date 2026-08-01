package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.u;
import q4.C4926b;
import r4.EnumC4958a;
import t4.C5040a;
import u7.C5089g;
import v7.AbstractC5129j;
import v7.AbstractC5131l;
import v7.C5135p;
import v7.t;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class i implements H4.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER = "login-user";
    private final x4.f _application;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final s4.c _consistencyManager;
    private final C4.c _deviceService;
    private final U5.b _identityModelStore;
    private final d _identityOperationExecutor;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final F4.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final Z5.e _subscriptionsModelStore;
    private final Q5.d _userBackend;

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
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.createUser(null, null, this);
        }
    }

    public static final class c extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.loginUser(null, null, this);
        }
    }

    public i(d _identityOperationExecutor, x4.f _application, C4.c _deviceService, Q5.d _userBackend, U5.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, Z5.e _subscriptionsModelStore, com.onesignal.core.internal.config.c _configModelStore, F4.a _languageContext, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService, s4.c _consistencyManager) {
        kotlin.jvm.internal.h.e(_identityOperationExecutor, "_identityOperationExecutor");
        kotlin.jvm.internal.h.e(_application, "_application");
        kotlin.jvm.internal.h.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.h.e(_userBackend, "_userBackend");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.h.e(_subscriptionsModelStore, "_subscriptionsModelStore");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_languageContext, "_languageContext");
        kotlin.jvm.internal.h.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.h.e(_identityVerificationService, "_identityVerificationService");
        kotlin.jvm.internal.h.e(_consistencyManager, "_consistencyManager");
        this._identityOperationExecutor = _identityOperationExecutor;
        this._application = _application;
        this._deviceService = _deviceService;
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._languageContext = _languageContext;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this._consistencyManager = _consistencyManager;
    }

    private final Map<String, Q5.h> createSubscriptionsFromOperation(V5.p pVar, Map<String, Q5.h> map) {
        LinkedHashMap V8 = t.V(map);
        if (!V8.containsKey(pVar.getSubscriptionId())) {
            V8.put(pVar.getSubscriptionId(), new Q5.h(pVar.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
            return V8;
        }
        String subscriptionId = pVar.getSubscriptionId();
        String subscriptionId2 = pVar.getSubscriptionId();
        Q5.h hVar = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar);
        Q5.j type = hVar.getType();
        Q5.h hVar2 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar2);
        String token = hVar2.getToken();
        Q5.h hVar3 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar3);
        Boolean enabled = hVar3.getEnabled();
        Q5.h hVar4 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar4);
        Integer notificationTypes = hVar4.getNotificationTypes();
        Q5.h hVar5 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar5);
        String sdk = hVar5.getSdk();
        Q5.h hVar6 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar6);
        String deviceModel = hVar6.getDeviceModel();
        Q5.h hVar7 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar7);
        String deviceOS = hVar7.getDeviceOS();
        Q5.h hVar8 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar8);
        Boolean rooted = hVar8.getRooted();
        Q5.h hVar9 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar9);
        Integer netType = hVar9.getNetType();
        Q5.h hVar10 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar10);
        String carrier = hVar10.getCarrier();
        Q5.h hVar11 = map.get(pVar.getSubscriptionId());
        kotlin.jvm.internal.h.b(hVar11);
        V8.put(subscriptionId, new Q5.h(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar11.getAppVersion()));
        return V8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02f5 A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02ef, B:18:0x02f5, B:19:0x030b, B:27:0x005f, B:29:0x013d, B:31:0x0179, B:32:0x018b, B:34:0x0199, B:35:0x01ac, B:36:0x01b8, B:38:0x01be, B:39:0x01c8, B:41:0x01ce, B:46:0x01e6, B:48:0x01ea, B:49:0x01ee, B:51:0x01f4, B:53:0x020d, B:55:0x0213, B:58:0x021d, B:66:0x0222, B:67:0x0226, B:69:0x022c, B:73:0x0243, B:78:0x0248, B:80:0x0266, B:81:0x0275, B:83:0x0283, B:86:0x02b3, B:87:0x0299, B:92:0x02be, B:94:0x02c7, B:96:0x02cd, B:136:0x00f5, B:137:0x0116, B:139:0x011c, B:141:0x012a), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0179 A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02ef, B:18:0x02f5, B:19:0x030b, B:27:0x005f, B:29:0x013d, B:31:0x0179, B:32:0x018b, B:34:0x0199, B:35:0x01ac, B:36:0x01b8, B:38:0x01be, B:39:0x01c8, B:41:0x01ce, B:46:0x01e6, B:48:0x01ea, B:49:0x01ee, B:51:0x01f4, B:53:0x020d, B:55:0x0213, B:58:0x021d, B:66:0x0222, B:67:0x0226, B:69:0x022c, B:73:0x0243, B:78:0x0248, B:80:0x0266, B:81:0x0275, B:83:0x0283, B:86:0x02b3, B:87:0x0299, B:92:0x02be, B:94:0x02c7, B:96:0x02cd, B:136:0x00f5, B:137:0x0116, B:139:0x011c, B:141:0x012a), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0199 A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02ef, B:18:0x02f5, B:19:0x030b, B:27:0x005f, B:29:0x013d, B:31:0x0179, B:32:0x018b, B:34:0x0199, B:35:0x01ac, B:36:0x01b8, B:38:0x01be, B:39:0x01c8, B:41:0x01ce, B:46:0x01e6, B:48:0x01ea, B:49:0x01ee, B:51:0x01f4, B:53:0x020d, B:55:0x0213, B:58:0x021d, B:66:0x0222, B:67:0x0226, B:69:0x022c, B:73:0x0243, B:78:0x0248, B:80:0x0266, B:81:0x0275, B:83:0x0283, B:86:0x02b3, B:87:0x0299, B:92:0x02be, B:94:0x02c7, B:96:0x02cd, B:136:0x00f5, B:137:0x0116, B:139:0x011c, B:141:0x012a), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01be A[Catch: a -> 0x0044, TryCatch #0 {a -> 0x0044, blocks: (B:13:0x003e, B:16:0x02ef, B:18:0x02f5, B:19:0x030b, B:27:0x005f, B:29:0x013d, B:31:0x0179, B:32:0x018b, B:34:0x0199, B:35:0x01ac, B:36:0x01b8, B:38:0x01be, B:39:0x01c8, B:41:0x01ce, B:46:0x01e6, B:48:0x01ea, B:49:0x01ee, B:51:0x01f4, B:53:0x020d, B:55:0x0213, B:58:0x021d, B:66:0x0222, B:67:0x0226, B:69:0x022c, B:73:0x0243, B:78:0x0248, B:80:0x0266, B:81:0x0275, B:83:0x0283, B:86:0x02b3, B:87:0x0299, B:92:0x02be, B:94:0x02c7, B:96:0x02cd, B:136:0x00f5, B:137:0x0116, B:139:0x011c, B:141:0x012a), top: B:8:0x0028 }] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createUser(V5.f fVar, List<? extends H4.g> list, InterfaceC5267d interfaceC5267d) {
        b bVar;
        int i;
        Map<String, Q5.h> map;
        List<C5089g> S8;
        Object createUser;
        i iVar;
        LinkedHashMap linkedHashMap;
        U5.a aVar;
        com.onesignal.user.internal.properties.a aVar2;
        String str;
        String str2;
        List list2;
        LinkedHashMap linkedHashMap2;
        C4926b rywData;
        V5.f fVar2;
        Map<String, Q5.h> map2;
        LinkedHashMap linkedHashMap3;
        String str3;
        Object obj;
        Q5.h hVar;
        Q5.h hVar2;
        String token;
        V5.f fVar3 = fVar;
        try {
            if (interfaceC5267d instanceof b) {
                bVar = (b) interfaceC5267d;
                int i6 = bVar.label;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i6 - Integer.MIN_VALUE;
                    b bVar2 = bVar;
                    Object obj2 = bVar2.result;
                    A7.a aVar3 = A7.a.f58n;
                    i = bVar2.label;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj2);
                        Map<String, Q5.h> map3 = v7.q.f41443n;
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        linkedHashMap4.put("timezone_id", com.onesignal.common.l.INSTANCE.getTimeZoneId());
                        linkedHashMap4.put("language", this._languageContext.getLanguage());
                        if (fVar3.getExternalId() != null) {
                            LinkedHashMap V8 = t.V(map3);
                            String externalId = fVar3.getExternalId();
                            kotlin.jvm.internal.h.b(externalId);
                            V8.put("external_id", externalId);
                            map = V8;
                        } else {
                            map = map3;
                        }
                        for (H4.g gVar : list) {
                            if (gVar instanceof V5.a) {
                                map3 = createSubscriptionsFromOperation((V5.a) gVar, map3);
                            } else if (gVar instanceof V5.p) {
                                map3 = createSubscriptionsFromOperation((V5.p) gVar, map3);
                            } else if (gVar instanceof V5.q) {
                                map3 = createSubscriptionsFromOperation((V5.q) gVar, map3);
                            } else {
                                if (!(gVar instanceof V5.c)) {
                                    throw new Exception("Unrecognized operation: " + gVar);
                                }
                                map3 = createSubscriptionsFromOperation((V5.c) gVar, map3);
                            }
                        }
                        S8 = t.S(map3);
                        String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(fVar3, this._jwtTokenStore, this._identityVerificationService);
                        Q5.d dVar = this._userBackend;
                        String appId = fVar3.getAppId();
                        ArrayList arrayList = new ArrayList(AbstractC5131l.y(S8, 10));
                        Iterator it = S8.iterator();
                        while (it.hasNext()) {
                            arrayList.add((Q5.h) ((C5089g) it.next()).f41333u);
                        }
                        bVar2.L$0 = this;
                        bVar2.L$1 = fVar3;
                        bVar2.L$2 = map;
                        bVar2.L$3 = S8;
                        bVar2.label = 1;
                        createUser = dVar.createUser(appId, map, arrayList, linkedHashMap4, resolveJwt, bVar2);
                        if (createUser == aVar3) {
                            return aVar3;
                        }
                        iVar = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str3 = (String) bVar2.L$3;
                            ?? r32 = (Map) bVar2.L$2;
                            map2 = (Map) bVar2.L$1;
                            fVar2 = (V5.f) bVar2.L$0;
                            com.bumptech.glide.d.k(obj2);
                            list2 = null;
                            linkedHashMap3 = r32;
                            str2 = str3;
                            linkedHashMap2 = linkedHashMap3;
                            map = map2;
                            fVar3 = fVar2;
                            return new H4.a(H4.b.SUCCESS, linkedHashMap2, map.isEmpty() ? d6.c.k(new V5.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
                        }
                        List list3 = (List) bVar2.L$3;
                        Map<String, Q5.h> map4 = (Map) bVar2.L$2;
                        V5.f fVar4 = (V5.f) bVar2.L$1;
                        i iVar2 = (i) bVar2.L$0;
                        com.bumptech.glide.d.k(obj2);
                        S8 = list3;
                        fVar3 = fVar4;
                        iVar = iVar2;
                        map = map4;
                        createUser = obj2;
                    }
                    Q5.a aVar4 = (Q5.a) createUser;
                    linkedHashMap = new LinkedHashMap();
                    String str4 = aVar4.getIdentities().get("onesignal_id");
                    kotlin.jvm.internal.h.b(str4);
                    String str5 = str4;
                    linkedHashMap.put(fVar3.getOnesignalId(), str5);
                    aVar = (U5.a) iVar._identityModelStore.getModel();
                    aVar2 = (com.onesignal.user.internal.properties.a) iVar._propertiesModelStore.getModel();
                    if (kotlin.jvm.internal.h.a(aVar.getOnesignalId(), fVar3.getOnesignalId())) {
                        str = str5;
                    } else {
                        str = str5;
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar, "onesignal_id", str, "HYDRATE", false, 8, null);
                    }
                    if (kotlin.jvm.internal.h.a(aVar2.getOnesignalId(), fVar3.getOnesignalId())) {
                        str2 = str;
                    } else {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar2, "onesignalId", str, "HYDRATE", false, 8, null);
                        str2 = str;
                    }
                    Set O8 = AbstractC5129j.O(aVar4.getSubscriptions());
                    for (C5089g c5089g : S8) {
                        Iterator it2 = O8.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (kotlin.jvm.internal.h.a(((Q5.h) obj).getId(), c5089g.f41332n)) {
                                break;
                            }
                        }
                        Q5.h hVar3 = (Q5.h) obj;
                        if (hVar3 == null) {
                            Iterator it3 = O8.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    hVar2 = 0;
                                    break;
                                }
                                hVar2 = it3.next();
                                Q5.h hVar4 = (Q5.h) hVar2;
                                if (kotlin.jvm.internal.h.a(hVar4.getToken(), ((Q5.h) c5089g.f41333u).getToken()) && (token = hVar4.getToken()) != null && !Q7.j.c0(token)) {
                                    break;
                                }
                            }
                            hVar3 = hVar2;
                        }
                        if (hVar3 == null) {
                            Iterator it4 = O8.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    hVar = null;
                                    break;
                                }
                                ?? next = it4.next();
                                if (((Q5.h) next).getType() == ((Q5.h) c5089g.f41333u).getType()) {
                                    hVar = next;
                                    break;
                                }
                            }
                            hVar3 = hVar;
                        }
                        if (hVar3 != null) {
                            Object obj3 = c5089g.f41332n;
                            String id = hVar3.getId();
                            kotlin.jvm.internal.h.b(id);
                            linkedHashMap.put(obj3, id);
                            if (kotlin.jvm.internal.h.a(((com.onesignal.core.internal.config.b) iVar._configModelStore.getModel()).getPushSubscriptionId(), obj3)) {
                                ((com.onesignal.core.internal.config.b) iVar._configModelStore.getModel()).setPushSubscriptionId(hVar3.getId());
                            }
                            Z5.d dVar2 = (Z5.d) iVar._subscriptionsModelStore.get((String) obj3);
                            if (dVar2 != null) {
                                String id2 = hVar3.getId();
                                kotlin.jvm.internal.h.b(id2);
                                com.onesignal.common.modeling.i.setStringProperty$default(dVar2, "id", id2, "HYDRATE", false, 8, null);
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.error$default("LoginUserOperationExecutor.createUser response is missing subscription data for " + ((String) c5089g.f41332n), null, 2, null);
                        }
                        u.a(O8);
                        O8.remove(hVar3);
                    }
                    list2 = null;
                    if (iVar._identityVerificationService.getNewCodePathsRun() || (rywData = aVar4.getRywData()) == null) {
                        linkedHashMap2 = linkedHashMap;
                        return new H4.a(H4.b.SUCCESS, linkedHashMap2, map.isEmpty() ? d6.c.k(new V5.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
                    }
                    s4.c cVar = iVar._consistencyManager;
                    EnumC4958a enumC4958a = EnumC4958a.USER;
                    bVar2.L$0 = fVar3;
                    bVar2.L$1 = map;
                    bVar2.L$2 = linkedHashMap;
                    bVar2.L$3 = str2;
                    bVar2.label = 2;
                    if (cVar.setRywData(str2, enumC4958a, rywData, bVar2) != aVar3) {
                        fVar2 = fVar3;
                        map2 = map;
                        linkedHashMap3 = linkedHashMap;
                        str3 = str2;
                        str2 = str3;
                        linkedHashMap2 = linkedHashMap3;
                        map = map2;
                        fVar3 = fVar2;
                        return new H4.a(H4.b.SUCCESS, linkedHashMap2, map.isEmpty() ? d6.c.k(new V5.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
                    }
                    return aVar3;
                }
            }
            if (i != 0) {
            }
            Q5.a aVar42 = (Q5.a) createUser;
            linkedHashMap = new LinkedHashMap();
            String str42 = aVar42.getIdentities().get("onesignal_id");
            kotlin.jvm.internal.h.b(str42);
            String str52 = str42;
            linkedHashMap.put(fVar3.getOnesignalId(), str52);
            aVar = (U5.a) iVar._identityModelStore.getModel();
            aVar2 = (com.onesignal.user.internal.properties.a) iVar._propertiesModelStore.getModel();
            if (kotlin.jvm.internal.h.a(aVar.getOnesignalId(), fVar3.getOnesignalId())) {
            }
            if (kotlin.jvm.internal.h.a(aVar2.getOnesignalId(), fVar3.getOnesignalId())) {
            }
            Set O82 = AbstractC5129j.O(aVar42.getSubscriptions());
            while (r2.hasNext()) {
            }
            list2 = null;
            if (iVar._identityVerificationService.getNewCodePathsRun()) {
            }
            linkedHashMap2 = linkedHashMap;
            return new H4.a(H4.b.SUCCESS, linkedHashMap2, map.isEmpty() ? d6.c.k(new V5.h(fVar3.getAppId(), str2, fVar3.getExternalId())) : list2, null, 8, null);
        } catch (C5040a e9) {
            int i9 = j.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e9.getStatusCode()).ordinal()];
            return i9 != 1 ? i9 != 2 ? new H4.a(H4.b.FAIL_PAUSE_OPREPO, null, null, null, 14, null) : new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, e9.getRetryAfterSeconds(), 6, null) : new H4.a(H4.b.FAIL_RETRY, null, null, e9.getRetryAfterSeconds(), 6, null);
        }
        bVar = new b(interfaceC5267d);
        b bVar22 = bVar;
        Object obj22 = bVar22.result;
        A7.a aVar32 = A7.a.f58n;
        i = bVar22.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(V5.f fVar, List<? extends H4.g> list, InterfaceC5267d interfaceC5267d) {
        c cVar;
        int i;
        i iVar;
        int i6;
        String str;
        V5.f fVar2 = fVar;
        List<? extends H4.g> list2 = list;
        if (interfaceC5267d instanceof c) {
            cVar = (c) interfaceC5267d;
            int i9 = cVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cVar.label = i9 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                A7.a aVar = A7.a.f58n;
                i = cVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    if (list2 == null || !list2.isEmpty()) {
                        for (H4.g gVar : list2) {
                            if ((gVar instanceof V5.a) || (gVar instanceof V5.p)) {
                                break;
                            }
                        }
                    }
                    if (fVar2.getExternalId() == null) {
                        return new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (fVar2.getExistingOnesignalId() == null || fVar2.getExternalId() == null || this._identityVerificationService.getIvBehaviorActive()) {
                        cVar.label = 1;
                        Object createUser = createUser(fVar2, list2, cVar);
                        if (createUser != aVar) {
                            return createUser;
                        }
                    } else {
                        d dVar = this._identityOperationExecutor;
                        String appId = fVar2.getAppId();
                        String existingOnesignalId = fVar2.getExistingOnesignalId();
                        kotlin.jvm.internal.h.b(existingOnesignalId);
                        String externalId = fVar2.getExternalId();
                        String externalId2 = fVar2.getExternalId();
                        kotlin.jvm.internal.h.b(externalId2);
                        List<? extends H4.g> k9 = d6.c.k(new V5.i(appId, existingOnesignalId, externalId, "external_id", externalId2));
                        cVar.L$0 = this;
                        cVar.L$1 = fVar2;
                        cVar.L$2 = list2;
                        cVar.label = 2;
                        obj = dVar.execute(k9, cVar);
                        if (obj != aVar) {
                            iVar = this;
                        }
                    }
                    return aVar;
                }
                if (i == 1) {
                    com.bumptech.glide.d.k(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        com.bumptech.glide.d.k(obj);
                        return obj;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                    return obj;
                }
                List<? extends H4.g> list3 = (List) cVar.L$2;
                V5.f fVar3 = (V5.f) cVar.L$1;
                iVar = (i) cVar.L$0;
                com.bumptech.glide.d.k(obj);
                list2 = list3;
                fVar2 = fVar3;
                H4.a aVar2 = (H4.a) obj;
                i6 = j.$EnumSwitchMapping$0[aVar2.getResult().ordinal()];
                if (i6 != 1) {
                    String existingOnesignalId2 = fVar2.getExistingOnesignalId();
                    kotlin.jvm.internal.h.b(existingOnesignalId2);
                    if (kotlin.jvm.internal.h.a(((U5.a) iVar._identityModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                        str = existingOnesignalId2;
                        com.onesignal.common.modeling.i.setStringProperty$default(iVar._identityModelStore.getModel(), "onesignal_id", str, "HYDRATE", false, 8, null);
                    } else {
                        str = existingOnesignalId2;
                    }
                    if (kotlin.jvm.internal.h.a(((com.onesignal.user.internal.properties.a) iVar._propertiesModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                        String str2 = str;
                        com.onesignal.common.modeling.i.setStringProperty$default(iVar._propertiesModelStore.getModel(), "onesignalId", str2, "HYDRATE", false, 8, null);
                        str = str2;
                    }
                    return new H4.a(H4.b.SUCCESS_STARTING_ONLY, t.Q(new C5089g(fVar2.getOnesignalId(), str)), null, null, 12, null);
                }
                if (i6 == 2) {
                    com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 3;
                    Object createUser2 = iVar.createUser(fVar2, list2, cVar);
                    if (createUser2 != aVar) {
                        return createUser2;
                    }
                } else {
                    if (i6 != 3) {
                        return new H4.a(aVar2.getResult(), null, null, null, 14, null);
                    }
                    com.onesignal.debug.internal.logging.b.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 4;
                    Object createUser3 = iVar.createUser(fVar2, list2, cVar);
                    if (createUser3 != aVar) {
                        return createUser3;
                    }
                }
                return aVar;
            }
        }
        cVar = new c(interfaceC5267d);
        Object obj2 = cVar.result;
        A7.a aVar3 = A7.a.f58n;
        i = cVar.label;
        if (i != 0) {
        }
        H4.a aVar22 = (H4.a) obj2;
        i6 = j.$EnumSwitchMapping$0[aVar22.getResult().ordinal()];
        if (i6 != 1) {
        }
    }

    @Override // H4.d
    public Object execute(List<? extends H4.g> list, InterfaceC5267d interfaceC5267d) {
        List<? extends H4.g> list2;
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        H4.g gVar = (H4.g) AbstractC5129j.A(list);
        if (!(gVar instanceof V5.f)) {
            throw new Exception("Unrecognized operation: " + gVar);
        }
        V5.f fVar = (V5.f) gVar;
        int size = list.size() - 1;
        if (size <= 0) {
            list2 = C5135p.f41442n;
        } else if (size == 1) {
            list2 = d6.c.k(AbstractC5129j.F(list));
        } else {
            ArrayList arrayList = new ArrayList(size);
            if (list instanceof RandomAccess) {
                int size2 = list.size();
                for (int i = 1; i < size2; i++) {
                    arrayList.add(list.get(i));
                }
            } else {
                ListIterator<? extends H4.g> listIterator = list.listIterator(1);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            list2 = arrayList;
        }
        return loginUser(fVar, list2, interfaceC5267d);
    }

    @Override // H4.d
    public List<String> getOperations() {
        return d6.c.k(LOGIN_USER);
    }

    private final Map<String, Q5.h> createSubscriptionsFromOperation(V5.a aVar, Map<String, Q5.h> map) {
        Q5.j jVar;
        LinkedHashMap V8 = t.V(map);
        int i = j.$EnumSwitchMapping$2[aVar.getType().ordinal()];
        if (i == 1) {
            jVar = Q5.j.SMS;
        } else if (i != 2) {
            jVar = Q5.j.Companion.fromDeviceType(this._deviceService.getDeviceType());
        } else {
            jVar = Q5.j.EMAIL;
        }
        Q5.j jVar2 = jVar;
        String subscriptionId = !com.onesignal.common.d.INSTANCE.isLocalId(aVar.getSubscriptionId()) ? aVar.getSubscriptionId() : null;
        String subscriptionId2 = aVar.getSubscriptionId();
        String address = aVar.getAddress();
        Boolean valueOf = Boolean.valueOf(aVar.getEnabled());
        Integer valueOf2 = Integer.valueOf(aVar.getStatus().getValue());
        String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        Boolean valueOf3 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
        com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
        V8.put(subscriptionId2, new Q5.h(subscriptionId, jVar2, address, valueOf, valueOf2, sdkVersion, str, str2, valueOf3, cVar.getNetType(this._application.getAppContext()), cVar.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return V8;
    }

    private final Map<String, Q5.h> createSubscriptionsFromOperation(V5.q qVar, Map<String, Q5.h> map) {
        LinkedHashMap V8 = t.V(map);
        if (V8.containsKey(qVar.getSubscriptionId())) {
            String subscriptionId = qVar.getSubscriptionId();
            Q5.h hVar = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.h.b(hVar);
            String id = hVar.getId();
            Q5.h hVar2 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.h.b(hVar2);
            Q5.j type = hVar2.getType();
            String address = qVar.getAddress();
            Boolean valueOf = Boolean.valueOf(qVar.getEnabled());
            Integer valueOf2 = Integer.valueOf(qVar.getStatus().getValue());
            Q5.h hVar3 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.h.b(hVar3);
            String sdk = hVar3.getSdk();
            Q5.h hVar4 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.h.b(hVar4);
            String deviceModel = hVar4.getDeviceModel();
            Q5.h hVar5 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.h.b(hVar5);
            String deviceOS = hVar5.getDeviceOS();
            Q5.h hVar6 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.h.b(hVar6);
            Boolean rooted = hVar6.getRooted();
            Q5.h hVar7 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.h.b(hVar7);
            Integer netType = hVar7.getNetType();
            Q5.h hVar8 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.h.b(hVar8);
            String carrier = hVar8.getCarrier();
            Q5.h hVar9 = map.get(qVar.getSubscriptionId());
            kotlin.jvm.internal.h.b(hVar9);
            V8.put(subscriptionId, new Q5.h(id, type, address, valueOf, valueOf2, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar9.getAppVersion()));
        }
        return V8;
    }

    private final Map<String, Q5.h> createSubscriptionsFromOperation(V5.c cVar, Map<String, Q5.h> map) {
        LinkedHashMap V8 = t.V(map);
        V8.remove(cVar.getSubscriptionId());
        return V8;
    }
}
