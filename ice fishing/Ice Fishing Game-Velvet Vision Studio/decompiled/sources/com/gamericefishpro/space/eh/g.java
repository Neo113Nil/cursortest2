package com.gamericefishpro.space.eh;

import android.os.Build;
import com.gamericefishpro.space.dh.p;
import com.gamericefishpro.space.dh.q;
import com.gamericefishpro.space.ei.e0;
import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.ph.o0;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.ph.y;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.gamericefishpro.space.bd.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER = "login-user";
    private final com.gamericefishpro.space.lc.f _application;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.vc.c _deviceService;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.eh.c _identityOperationExecutor;
    private final com.gamericefishpro.space.zc.a _languageContext;
    private final com.gamericefishpro.space.hh.b _propertiesModelStore;
    private final com.gamericefishpro.space.jh.e _subscriptionsModelStore;
    private final com.gamericefishpro.space.vg.d _userBackend;

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
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.createUser(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.loginUser(null, null, this);
        }
    }

    public g(com.gamericefishpro.space.eh.c _identityOperationExecutor, com.gamericefishpro.space.lc.f _application, com.gamericefishpro.space.vc.c _deviceService, com.gamericefishpro.space.vg.d _userBackend, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.hh.b _propertiesModelStore, com.gamericefishpro.space.jh.e _subscriptionsModelStore, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.zc.a _languageContext) {
        Intrinsics.checkNotNullParameter(_identityOperationExecutor, "_identityOperationExecutor");
        Intrinsics.checkNotNullParameter(_application, "_application");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionsModelStore, "_subscriptionsModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        this._identityOperationExecutor = _identityOperationExecutor;
        this._application = _application;
        this._deviceService = _deviceService;
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._languageContext = _languageContext;
    }

    private final Map<String, com.gamericefishpro.space.vg.h> createSubscriptionsFromOperation(p pVar, Map<String, com.gamericefishpro.space.vg.h> map) {
        LinkedHashMap linkedHashMapI = m0.i(map);
        if (!linkedHashMapI.containsKey(pVar.getSubscriptionId())) {
            linkedHashMapI.put(pVar.getSubscriptionId(), new com.gamericefishpro.space.vg.h(pVar.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
            return linkedHashMapI;
        }
        String subscriptionId = pVar.getSubscriptionId();
        String subscriptionId2 = pVar.getSubscriptionId();
        com.gamericefishpro.space.vg.h hVar = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar);
        com.gamericefishpro.space.vg.j type = hVar.getType();
        com.gamericefishpro.space.vg.h hVar2 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar2);
        String token = hVar2.getToken();
        com.gamericefishpro.space.vg.h hVar3 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar3);
        Boolean enabled = hVar3.getEnabled();
        com.gamericefishpro.space.vg.h hVar4 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar4);
        Integer notificationTypes = hVar4.getNotificationTypes();
        com.gamericefishpro.space.vg.h hVar5 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar5);
        String sdk = hVar5.getSdk();
        com.gamericefishpro.space.vg.h hVar6 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar6);
        String deviceModel = hVar6.getDeviceModel();
        com.gamericefishpro.space.vg.h hVar7 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar7);
        String deviceOS = hVar7.getDeviceOS();
        com.gamericefishpro.space.vg.h hVar8 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar8);
        Boolean rooted = hVar8.getRooted();
        com.gamericefishpro.space.vg.h hVar9 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar9);
        Integer netType = hVar9.getNetType();
        com.gamericefishpro.space.vg.h hVar10 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar10);
        String carrier = hVar10.getCarrier();
        com.gamericefishpro.space.vg.h hVar11 = map.get(pVar.getSubscriptionId());
        Intrinsics.b(hVar11);
        linkedHashMapI.put(subscriptionId, new com.gamericefishpro.space.vg.h(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar11.getAppVersion()));
        return linkedHashMapI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object createUser(com.gamericefishpro.space.dh.f fVar, List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar) throws Exception {
        b bVar;
        List list2;
        Map<String, String> map;
        com.gamericefishpro.space.dh.f fVar2;
        g gVar;
        String str;
        Object next;
        Object next2;
        Object next3;
        String token;
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
        b bVar2 = bVar;
        Object obj = bVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar2.label;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                Map<String, String> mapC = m0.c();
                Map<String, com.gamericefishpro.space.vg.h> mapC2 = m0.c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("timezone_id", com.gamericefishpro.space.yb.j.INSTANCE.getTimeZoneId());
                linkedHashMap.put("language", this._languageContext.getLanguage());
                if (fVar.getExternalId() != null) {
                    mapC = m0.i(mapC);
                    String externalId = fVar.getExternalId();
                    Intrinsics.b(externalId);
                    mapC.put("external_id", externalId);
                }
                Map<String, String> map2 = mapC;
                for (com.gamericefishpro.space.bd.g gVar2 : list) {
                    if (gVar2 instanceof com.gamericefishpro.space.dh.a) {
                        mapC2 = createSubscriptionsFromOperation((com.gamericefishpro.space.dh.a) gVar2, mapC2);
                    } else if (gVar2 instanceof p) {
                        mapC2 = createSubscriptionsFromOperation((p) gVar2, mapC2);
                    } else if (gVar2 instanceof q) {
                        mapC2 = createSubscriptionsFromOperation((q) gVar2, mapC2);
                    } else {
                        if (!(gVar2 instanceof com.gamericefishpro.space.dh.c)) {
                            throw new Exception("Unrecognized operation: " + gVar2);
                        }
                        mapC2 = createSubscriptionsFromOperation((com.gamericefishpro.space.dh.c) gVar2, mapC2);
                    }
                }
                List listJ = o0.j(mapC2);
                com.gamericefishpro.space.vg.d dVar = this._userBackend;
                String appId = fVar.getAppId();
                ArrayList arrayList = new ArrayList(y.j(listJ, 10));
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    arrayList.add((com.gamericefishpro.space.vg.h) ((Pair) it.next()).e);
                }
                bVar2.L$0 = this;
                bVar2.L$1 = fVar;
                bVar2.L$2 = map2;
                bVar2.L$3 = listJ;
                bVar2.label = 1;
                Object objCreateUser = dVar.createUser(appId, map2, arrayList, linkedHashMap, bVar2);
                if (objCreateUser == aVar2) {
                    return aVar2;
                }
                list2 = listJ;
                obj = objCreateUser;
                map = map2;
                fVar2 = fVar;
                gVar = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) bVar2.L$3;
                map = (Map) bVar2.L$2;
                fVar2 = (com.gamericefishpro.space.dh.f) bVar2.L$1;
                gVar = (g) bVar2.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            com.gamericefishpro.space.vg.a aVar3 = (com.gamericefishpro.space.vg.a) obj;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str2 = aVar3.getIdentities().get("onesignal_id");
            Intrinsics.b(str2);
            String str3 = str2;
            linkedHashMap2.put(fVar2.getOnesignalId(), str3);
            com.gamericefishpro.space.bh.a aVar4 = (com.gamericefishpro.space.bh.a) gVar._identityModelStore.getModel();
            com.gamericefishpro.space.hh.a aVar5 = (com.gamericefishpro.space.hh.a) gVar._propertiesModelStore.getModel();
            if (Intrinsics.a(aVar4.getOnesignalId(), fVar2.getOnesignalId())) {
                str = str3;
                com.gamericefishpro.space.fc.i.setStringProperty$default(aVar4, "onesignal_id", str, "HYDRATE", false, 8, null);
            } else {
                str = str3;
            }
            if (Intrinsics.a(aVar5.getOnesignalId(), fVar2.getOnesignalId())) {
                com.gamericefishpro.space.fc.i.setStringProperty$default(aVar5, "onesignalId", str, "HYDRATE", false, 8, null);
            }
            LinkedHashSet linkedHashSetN = CollectionsKt.N(aVar3.getSubscriptions());
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it2.next();
                Iterator it3 = linkedHashSetN.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!Intrinsics.a(((com.gamericefishpro.space.vg.h) next).getId(), pair.d));
                com.gamericefishpro.space.vg.h hVar = (com.gamericefishpro.space.vg.h) next;
                if (hVar == null) {
                    Iterator it4 = linkedHashSetN.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it4.next();
                        com.gamericefishpro.space.vg.h hVar2 = (com.gamericefishpro.space.vg.h) next3;
                        if (Intrinsics.a(hVar2.getToken(), ((com.gamericefishpro.space.vg.h) pair.e).getToken()) && (token = hVar2.getToken()) != null && !StringsKt.u(token)) {
                            break;
                        }
                    }
                    hVar = (com.gamericefishpro.space.vg.h) next3;
                }
                if (hVar == null) {
                    Iterator it5 = linkedHashSetN.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it5.next();
                    } while (((com.gamericefishpro.space.vg.h) next2).getType() != ((com.gamericefishpro.space.vg.h) pair.e).getType());
                    hVar = (com.gamericefishpro.space.vg.h) next2;
                }
                if (hVar != null) {
                    Object obj2 = pair.d;
                    String id = hVar.getId();
                    Intrinsics.b(id);
                    linkedHashMap2.put(obj2, id);
                    if (Intrinsics.a(((com.gamericefishpro.space.rc.a) gVar._configModelStore.getModel()).getPushSubscriptionId(), obj2)) {
                        ((com.gamericefishpro.space.rc.a) gVar._configModelStore.getModel()).setPushSubscriptionId(hVar.getId());
                    }
                    com.gamericefishpro.space.jh.d dVar2 = (com.gamericefishpro.space.jh.d) gVar._subscriptionsModelStore.get((String) obj2);
                    if (dVar2 != null) {
                        String id2 = hVar.getId();
                        Intrinsics.b(id2);
                        com.gamericefishpro.space.fc.i.setStringProperty$default(dVar2, "id", id2, "HYDRATE", false, 8, null);
                    }
                } else {
                    com.gamericefishpro.space.od.b.error$default("LoginUserOperationExecutor.createUser response is missing subscription data for " + ((String) pair.d), null, 2, null);
                }
                e0.a(linkedHashSetN).remove(hVar);
            }
            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, linkedHashMap2, map.isEmpty() ? null : w.c(new com.gamericefishpro.space.dh.h(fVar2.getAppId(), str)), null, 8, null);
        } catch (com.gamericefishpro.space.ec.a e) {
            int i3 = h.$EnumSwitchMapping$1[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i3 != 1) {
                return i3 != 2 ? new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_PAUSE_OPREPO, null, null, null, 14, null) : new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object loginUser(com.gamericefishpro.space.dh.f fVar, List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar) throws Exception {
        c cVar;
        g gVar;
        String str;
        com.gamericefishpro.space.dh.f fVar2 = fVar;
        List<? extends com.gamericefishpro.space.bd.g> list2 = list;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(aVar);
            }
        } else {
            cVar = new c(aVar);
        }
        Object objExecute = cVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objExecute);
            if (list2 == null || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.gamericefishpro.space.bd.g gVar2 = (com.gamericefishpro.space.bd.g) it.next();
                        if ((gVar2 instanceof com.gamericefishpro.space.dh.a) || (gVar2 instanceof p)) {
                        }
                    } else if (fVar2.getExternalId() == null) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                }
            } else if (fVar2.getExternalId() == null) {
                return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
            }
            if (fVar2.getExistingOnesignalId() == null || fVar2.getExternalId() == null) {
                cVar.label = 1;
                Object objCreateUser = createUser(fVar2, list2, cVar);
                if (objCreateUser != aVar2) {
                    return objCreateUser;
                }
            } else {
                com.gamericefishpro.space.eh.c cVar2 = this._identityOperationExecutor;
                String appId = fVar2.getAppId();
                String existingOnesignalId = fVar2.getExistingOnesignalId();
                Intrinsics.b(existingOnesignalId);
                String externalId = fVar2.getExternalId();
                Intrinsics.b(externalId);
                List<? extends com.gamericefishpro.space.bd.g> listC = w.c(new com.gamericefishpro.space.dh.i(appId, existingOnesignalId, "external_id", externalId));
                cVar.L$0 = this;
                cVar.L$1 = fVar2;
                cVar.L$2 = list2;
                cVar.label = 2;
                objExecute = cVar2.execute(listC, cVar);
                if (objExecute != aVar2) {
                    gVar = this;
                }
            }
            return aVar2;
        }
        if (i2 == 1) {
            com.gamericefishpro.space.wa.b.P(objExecute);
            return objExecute;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                com.gamericefishpro.space.wa.b.P(objExecute);
                return objExecute;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objExecute);
            return objExecute;
        }
        List<? extends com.gamericefishpro.space.bd.g> list3 = (List) cVar.L$2;
        com.gamericefishpro.space.dh.f fVar3 = (com.gamericefishpro.space.dh.f) cVar.L$1;
        gVar = (g) cVar.L$0;
        com.gamericefishpro.space.wa.b.P(objExecute);
        list2 = list3;
        fVar2 = fVar3;
        com.gamericefishpro.space.bd.a aVar3 = (com.gamericefishpro.space.bd.a) objExecute;
        int i3 = h.$EnumSwitchMapping$0[aVar3.getResult().ordinal()];
        if (i3 == 1) {
            String existingOnesignalId2 = fVar2.getExistingOnesignalId();
            Intrinsics.b(existingOnesignalId2);
            if (Intrinsics.a(((com.gamericefishpro.space.bh.a) gVar._identityModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                str = existingOnesignalId2;
                com.gamericefishpro.space.fc.i.setStringProperty$default(gVar._identityModelStore.getModel(), "onesignal_id", str, "HYDRATE", false, 8, null);
            } else {
                str = existingOnesignalId2;
            }
            if (Intrinsics.a(((com.gamericefishpro.space.hh.a) gVar._propertiesModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                String str2 = str;
                com.gamericefishpro.space.fc.i.setStringProperty$default(gVar._propertiesModelStore.getModel(), "onesignalId", str2, "HYDRATE", false, 8, null);
                str = str2;
            }
            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS_STARTING_ONLY, l0.b(new Pair(fVar2.getOnesignalId(), str)), null, null, 12, null);
        }
        if (i3 == 2) {
            com.gamericefishpro.space.od.b.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
            cVar.L$0 = null;
            cVar.L$1 = null;
            cVar.L$2 = null;
            cVar.label = 3;
            Object objCreateUser2 = gVar.createUser(fVar2, list2, cVar);
            if (objCreateUser2 != aVar2) {
                return objCreateUser2;
            }
        } else {
            if (i3 != 3) {
                return new com.gamericefishpro.space.bd.a(aVar3.getResult(), null, null, null, 14, null);
            }
            com.gamericefishpro.space.od.b.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
            cVar.L$0 = null;
            cVar.L$1 = null;
            cVar.L$2 = null;
            cVar.label = 4;
            Object objCreateUser3 = gVar.createUser(fVar2, list2, cVar);
            if (objCreateUser3 != aVar2) {
                return objCreateUser3;
            }
        }
        return aVar2;
    }

    @Override // com.gamericefishpro.space.bd.d
    public Object execute(List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar) throws Exception {
        com.gamericefishpro.space.od.b.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        com.gamericefishpro.space.bd.g gVar = (com.gamericefishpro.space.bd.g) CollectionsKt.w(list);
        if (gVar instanceof com.gamericefishpro.space.dh.f) {
            return loginUser((com.gamericefishpro.space.dh.f) gVar, CollectionsKt.u(list), aVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // com.gamericefishpro.space.bd.d
    public List<String> getOperations() {
        return w.c(LOGIN_USER);
    }

    private final Map<String, com.gamericefishpro.space.vg.h> createSubscriptionsFromOperation(com.gamericefishpro.space.dh.a aVar, Map<String, com.gamericefishpro.space.vg.h> map) {
        com.gamericefishpro.space.vg.j jVarFromDeviceType;
        LinkedHashMap linkedHashMapI = m0.i(map);
        int i = h.$EnumSwitchMapping$2[aVar.getType().ordinal()];
        if (i == 1) {
            jVarFromDeviceType = com.gamericefishpro.space.vg.j.SMS;
        } else if (i != 2) {
            jVarFromDeviceType = com.gamericefishpro.space.vg.j.Companion.fromDeviceType(this._deviceService.getDeviceType());
        } else {
            jVarFromDeviceType = com.gamericefishpro.space.vg.j.EMAIL;
        }
        com.gamericefishpro.space.vg.j jVar = jVarFromDeviceType;
        String subscriptionId = !com.gamericefishpro.space.yb.c.INSTANCE.isLocalId(aVar.getSubscriptionId()) ? aVar.getSubscriptionId() : null;
        String subscriptionId2 = aVar.getSubscriptionId();
        String address = aVar.getAddress();
        Boolean boolValueOf = Boolean.valueOf(aVar.getEnabled());
        Integer numValueOf = Integer.valueOf(aVar.getStatus().getValue());
        String sdkVersion = com.gamericefishpro.space.yb.g.INSTANCE.getSdkVersion();
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        Boolean boolValueOf2 = Boolean.valueOf(com.gamericefishpro.space.yb.i.INSTANCE.isRooted());
        com.gamericefishpro.space.yb.b bVar = com.gamericefishpro.space.yb.b.INSTANCE;
        linkedHashMapI.put(subscriptionId2, new com.gamericefishpro.space.vg.h(subscriptionId, jVar, address, boolValueOf, numValueOf, sdkVersion, str, str2, boolValueOf2, bVar.getNetType(this._application.getAppContext()), bVar.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return linkedHashMapI;
    }

    private final Map<String, com.gamericefishpro.space.vg.h> createSubscriptionsFromOperation(q qVar, Map<String, com.gamericefishpro.space.vg.h> map) {
        LinkedHashMap linkedHashMapI = m0.i(map);
        if (linkedHashMapI.containsKey(qVar.getSubscriptionId())) {
            String subscriptionId = qVar.getSubscriptionId();
            com.gamericefishpro.space.vg.h hVar = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar);
            String id = hVar.getId();
            com.gamericefishpro.space.vg.h hVar2 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar2);
            com.gamericefishpro.space.vg.j type = hVar2.getType();
            String address = qVar.getAddress();
            Boolean boolValueOf = Boolean.valueOf(qVar.getEnabled());
            Integer numValueOf = Integer.valueOf(qVar.getStatus().getValue());
            com.gamericefishpro.space.vg.h hVar3 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar3);
            String sdk = hVar3.getSdk();
            com.gamericefishpro.space.vg.h hVar4 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar4);
            String deviceModel = hVar4.getDeviceModel();
            com.gamericefishpro.space.vg.h hVar5 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar5);
            String deviceOS = hVar5.getDeviceOS();
            com.gamericefishpro.space.vg.h hVar6 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar6);
            Boolean rooted = hVar6.getRooted();
            com.gamericefishpro.space.vg.h hVar7 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar7);
            Integer netType = hVar7.getNetType();
            com.gamericefishpro.space.vg.h hVar8 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar8);
            String carrier = hVar8.getCarrier();
            com.gamericefishpro.space.vg.h hVar9 = map.get(qVar.getSubscriptionId());
            Intrinsics.b(hVar9);
            linkedHashMapI.put(subscriptionId, new com.gamericefishpro.space.vg.h(id, type, address, boolValueOf, numValueOf, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar9.getAppVersion()));
        }
        return linkedHashMapI;
    }

    private final Map<String, com.gamericefishpro.space.vg.h> createSubscriptionsFromOperation(com.gamericefishpro.space.dh.c cVar, Map<String, com.gamericefishpro.space.vg.h> map) {
        LinkedHashMap linkedHashMapI = m0.i(map);
        linkedHashMapI.remove(cVar.getSubscriptionId());
        return linkedHashMapI;
    }
}
