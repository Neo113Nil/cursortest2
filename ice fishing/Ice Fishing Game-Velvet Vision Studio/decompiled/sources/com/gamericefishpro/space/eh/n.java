package com.gamericefishpro.space.eh;

import com.gamericefishpro.space.ph.x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements com.gamericefishpro.space.bd.d {
    public static final a Companion = new a(null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final com.gamericefishpro.space.xg.a _buildUserService;
    private final com.gamericefishpro.space.cc.c _consistencyManager;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.gh.a _newRecordState;
    private final com.gamericefishpro.space.hh.b _propertiesModelStore;
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
            return n.this.execute(null, this);
        }
    }

    public n(com.gamericefishpro.space.vg.d _userBackend, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.hh.b _propertiesModelStore, com.gamericefishpro.space.xg.a _buildUserService, com.gamericefishpro.space.gh.a _newRecordState, com.gamericefishpro.space.cc.c _consistencyManager) {
        Intrinsics.checkNotNullParameter(_userBackend, "_userBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02bb A[Catch: a -> 0x0048, TryCatch #0 {a -> 0x0048, blocks: (B:15:0x0043, B:97:0x029f, B:99:0x02b1, B:100:0x02b5, B:102:0x02bb, B:104:0x02c5, B:105:0x02e8, B:107:0x02ec, B:108:0x0309, B:110:0x030d), top: B:138:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0343  */
    /* JADX WARN: Code duplicated, block: B:118:0x0346  */
    /* JADX WARN: Code duplicated, block: B:120:0x0349  */
    /* JADX WARN: Code duplicated, block: B:121:0x0357  */
    /* JADX WARN: Code duplicated, block: B:123:0x035f  */
    /* JADX WARN: Code duplicated, block: B:129:0x037f  */
    /* JADX WARN: Code duplicated, block: B:131:0x038d  */
    /* JADX WARN: Code duplicated, block: B:133:0x039c  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x026f A[Catch: a -> 0x006a, TryCatch #2 {a -> 0x006a, blocks: (B:22:0x0065, B:88:0x026b, B:90:0x026f, B:94:0x0289), top: B:142:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0284  */
    /* JADX WARN: Code duplicated, block: B:94:0x0289 A[Catch: a -> 0x006a, TRY_LEAVE, TryCatch #2 {a -> 0x006a, blocks: (B:22:0x0065, B:88:0x026b, B:90:0x026f, B:94:0x0289), top: B:142:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02b1 A[Catch: a -> 0x0048, TryCatch #0 {a -> 0x0048, blocks: (B:15:0x0043, B:97:0x029f, B:99:0x02b1, B:100:0x02b5, B:102:0x02bb, B:104:0x02c5, B:105:0x02e8, B:107:0x02ec, B:108:0x0309, B:110:0x030d), top: B:138:0x0043 }] */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x029c, code lost:
    
        if (r2.resolveConditionsWithID(com.gamericefishpro.space.zb.a.ID, r11) == r3) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.gamericefishpro.space.bd.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar) throws Exception {
        b bVar;
        String appId;
        String str;
        String str2;
        n nVar;
        n nVar2;
        String str3;
        int iIntValue;
        long sessionTime;
        BigDecimal amountSpent;
        ArrayList arrayList;
        com.gamericefishpro.space.zb.b bVar2;
        com.gamericefishpro.space.cc.c cVar;
        com.gamericefishpro.space.ac.a aVar2;
        int i;
        List<? extends com.gamericefishpro.space.bd.g> list2 = list;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        b bVar3 = bVar;
        Object objUpdateUser = bVar3.result;
        Object obj = com.gamericefishpro.space.uh.a.d;
        int i3 = bVar3.label;
        int i4 = 1;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(objUpdateUser);
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "UpdateUserOperationExecutor(operation: " + list2 + ')');
            com.gamericefishpro.space.vg.f fVar = new com.gamericefishpro.space.vg.f(null, null, null, null, null, null, 63, null);
            appId = null;
            com.gamericefishpro.space.vg.e eVar = new com.gamericefishpro.space.vg.e(null, null, null, null, 15, null);
            Iterator<? extends com.gamericefishpro.space.bd.g> it = list2.iterator();
            com.gamericefishpro.space.vg.e eVar2 = eVar;
            String onesignalId = null;
            boolean z = 0;
            com.gamericefishpro.space.vg.f fVarCreatePropertiesFromOperation = fVar;
            while (it.hasNext()) {
                com.gamericefishpro.space.bd.g next = it.next();
                if (next instanceof com.gamericefishpro.space.dh.k) {
                    if (appId == null) {
                        com.gamericefishpro.space.dh.k kVar = (com.gamericefishpro.space.dh.k) next;
                        String appId2 = kVar.getAppId();
                        onesignalId = kVar.getOnesignalId();
                        appId = appId2;
                    }
                    fVarCreatePropertiesFromOperation = i.INSTANCE.createPropertiesFromOperation((com.gamericefishpro.space.dh.k) next, fVarCreatePropertiesFromOperation);
                } else if (next instanceof com.gamericefishpro.space.dh.d) {
                    if (appId == null) {
                        com.gamericefishpro.space.dh.d dVar = (com.gamericefishpro.space.dh.d) next;
                        String appId3 = dVar.getAppId();
                        onesignalId = dVar.getOnesignalId();
                        appId = appId3;
                    }
                    fVarCreatePropertiesFromOperation = i.INSTANCE.createPropertiesFromOperation((com.gamericefishpro.space.dh.d) next, fVarCreatePropertiesFromOperation);
                } else if (next instanceof com.gamericefishpro.space.dh.j) {
                    if (appId == null) {
                        com.gamericefishpro.space.dh.j jVar = (com.gamericefishpro.space.dh.j) next;
                        String appId4 = jVar.getAppId();
                        onesignalId = jVar.getOnesignalId();
                        appId = appId4;
                    }
                    fVarCreatePropertiesFromOperation = i.INSTANCE.createPropertiesFromOperation((com.gamericefishpro.space.dh.j) next, fVarCreatePropertiesFromOperation);
                } else if (next instanceof com.gamericefishpro.space.dh.o) {
                    if (appId == null) {
                        com.gamericefishpro.space.dh.o oVar = (com.gamericefishpro.space.dh.o) next;
                        appId = oVar.getAppId();
                        onesignalId = oVar.getOnesignalId();
                    }
                    if (eVar2.getSessionCount() != null) {
                        Integer sessionCount = eVar2.getSessionCount();
                        Intrinsics.b(sessionCount);
                        iIntValue = sessionCount.intValue() + i4;
                    } else {
                        iIntValue = i4;
                    }
                    eVar2 = new com.gamericefishpro.space.vg.e(eVar2.getSessionTime(), new Integer(iIntValue), eVar2.getAmountSpent(), eVar2.getPurchases());
                    z = i4;
                } else if (next instanceof com.gamericefishpro.space.dh.n) {
                    if (appId == null) {
                        com.gamericefishpro.space.dh.n nVar3 = (com.gamericefishpro.space.dh.n) next;
                        String appId5 = nVar3.getAppId();
                        onesignalId = nVar3.getOnesignalId();
                        appId = appId5;
                    }
                    if (eVar2.getSessionTime() != null) {
                        Long sessionTime2 = eVar2.getSessionTime();
                        Intrinsics.b(sessionTime2);
                        sessionTime = ((com.gamericefishpro.space.dh.n) next).getSessionTime() + sessionTime2.longValue();
                    } else {
                        sessionTime = ((com.gamericefishpro.space.dh.n) next).getSessionTime();
                    }
                    eVar2 = new com.gamericefishpro.space.vg.e(new Long(sessionTime), eVar2.getSessionCount(), eVar2.getAmountSpent(), eVar2.getPurchases());
                } else {
                    if (!(next instanceof com.gamericefishpro.space.dh.m)) {
                        throw new Exception("Unrecognized operation: " + next);
                    }
                    if (appId == null) {
                        com.gamericefishpro.space.dh.m mVar = (com.gamericefishpro.space.dh.m) next;
                        String appId6 = mVar.getAppId();
                        onesignalId = mVar.getOnesignalId();
                        appId = appId6;
                    }
                    if (eVar2.getAmountSpent() != null) {
                        BigDecimal amountSpent2 = eVar2.getAmountSpent();
                        Intrinsics.b(amountSpent2);
                        amountSpent = amountSpent2.add(((com.gamericefishpro.space.dh.m) next).getAmountSpent());
                        Intrinsics.checkNotNullExpressionValue(amountSpent, "add(...)");
                    } else {
                        amountSpent = ((com.gamericefishpro.space.dh.m) next).getAmountSpent();
                    }
                    if (eVar2.getPurchases() != null) {
                        List<com.gamericefishpro.space.vg.g> purchases = eVar2.getPurchases();
                        Intrinsics.b(purchases);
                        arrayList = CollectionsKt.M(purchases);
                    } else {
                        arrayList = new ArrayList();
                    }
                    for (com.gamericefishpro.space.dh.g gVar : ((com.gamericefishpro.space.dh.m) next).getPurchases()) {
                        arrayList.add(new com.gamericefishpro.space.vg.g(gVar.getSku(), gVar.getIso(), gVar.getAmount()));
                        it = it;
                    }
                    eVar2 = new com.gamericefishpro.space.vg.e(eVar2.getSessionTime(), eVar2.getSessionCount(), amountSpent, arrayList);
                    it = it;
                    i4 = 1;
                }
            }
            if (appId != null && onesignalId != null) {
                try {
                    com.gamericefishpro.space.vg.d dVar2 = this._userBackend;
                    bVar3.L$0 = this;
                    bVar3.L$1 = list2;
                    bVar3.L$2 = appId;
                    bVar3.L$3 = onesignalId;
                    bVar3.label = 1;
                    objUpdateUser = dVar2.updateUser(appId, "onesignal_id", onesignalId, fVarCreatePropertiesFromOperation, z, eVar2, bVar3);
                    if (objUpdateUser != obj) {
                        nVar2 = this;
                        str3 = onesignalId;
                        bVar2 = (com.gamericefishpro.space.zb.b) objUpdateUser;
                        if (bVar2 != null) {
                            cVar = nVar2._consistencyManager;
                            aVar2 = com.gamericefishpro.space.ac.a.USER;
                            bVar3.L$0 = nVar2;
                            bVar3.L$1 = list2;
                            bVar3.L$2 = appId;
                            bVar3.L$3 = str3;
                            bVar3.label = 2;
                            if (cVar.setRywData(str3, aVar2, bVar2, bVar3) == obj) {
                            }
                            str2 = str3;
                            str = appId;
                            nVar = nVar2;
                        } else {
                            com.gamericefishpro.space.cc.c cVar2 = nVar2._consistencyManager;
                            bVar3.L$0 = nVar2;
                            bVar3.L$1 = list2;
                            bVar3.L$2 = appId;
                            bVar3.L$3 = str3;
                            bVar3.label = 3;
                        }
                        if (Intrinsics.a(((com.gamericefishpro.space.bh.a) nVar._identityModelStore.getModel()).getOnesignalId(), str2)) {
                            for (com.gamericefishpro.space.bd.g gVar2 : list2) {
                                if (gVar2 instanceof com.gamericefishpro.space.dh.k) {
                                    com.gamericefishpro.space.fc.i.setStringProperty$default(((com.gamericefishpro.space.hh.a) nVar._propertiesModelStore.getModel()).getTags(), ((com.gamericefishpro.space.dh.k) gVar2).getKey(), ((com.gamericefishpro.space.dh.k) gVar2).getValue(), "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof com.gamericefishpro.space.dh.d) {
                                    com.gamericefishpro.space.fc.i.setOptStringProperty$default(((com.gamericefishpro.space.hh.a) nVar._propertiesModelStore.getModel()).getTags(), ((com.gamericefishpro.space.dh.d) gVar2).getKey(), null, "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof com.gamericefishpro.space.dh.j) {
                                    com.gamericefishpro.space.fc.i.setOptAnyProperty$default(nVar._propertiesModelStore.getModel(), ((com.gamericefishpro.space.dh.j) gVar2).getProperty(), ((com.gamericefishpro.space.dh.j) gVar2).getValue(), "HYDRATE", false, 8, null);
                                }
                            }
                        }
                    }
                    return obj;
                } catch (com.gamericefishpro.space.ec.a e) {
                    e = e;
                    str = appId;
                    str2 = onesignalId;
                    nVar = this;
                    i = o.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i == 1) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i == 2) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i != 3) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (e.getStatusCode() != 404) {
                    }
                    List<com.gamericefishpro.space.bd.g> rebuildOperationsIfCurrentUser = nVar._buildUserService.getRebuildOperationsIfCurrentUser(str, str2);
                    if (rebuildOperationsIfCurrentUser == null) {
                    }
                }
            }
        } else if (i3 == 1) {
            str3 = (String) bVar3.L$3;
            appId = (String) bVar3.L$2;
            list2 = (List) bVar3.L$1;
            nVar2 = (n) bVar3.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(objUpdateUser);
                bVar2 = (com.gamericefishpro.space.zb.b) objUpdateUser;
                if (bVar2 != null) {
                    cVar = nVar2._consistencyManager;
                    aVar2 = com.gamericefishpro.space.ac.a.USER;
                    bVar3.L$0 = nVar2;
                    bVar3.L$1 = list2;
                    bVar3.L$2 = appId;
                    bVar3.L$3 = str3;
                    bVar3.label = 2;
                    if (cVar.setRywData(str3, aVar2, bVar2, bVar3) == obj) {
                        return obj;
                    }
                    str2 = str3;
                    str = appId;
                    nVar = nVar2;
                } else {
                    com.gamericefishpro.space.cc.c cVar3 = nVar2._consistencyManager;
                    bVar3.L$0 = nVar2;
                    bVar3.L$1 = list2;
                    bVar3.L$2 = appId;
                    bVar3.L$3 = str3;
                    bVar3.label = 3;
                }
                if (Intrinsics.a(((com.gamericefishpro.space.bh.a) nVar._identityModelStore.getModel()).getOnesignalId(), str2)) {
                    while (r0.hasNext()) {
                        if (gVar2 instanceof com.gamericefishpro.space.dh.k) {
                            com.gamericefishpro.space.fc.i.setStringProperty$default(((com.gamericefishpro.space.hh.a) nVar._propertiesModelStore.getModel()).getTags(), ((com.gamericefishpro.space.dh.k) gVar2).getKey(), ((com.gamericefishpro.space.dh.k) gVar2).getValue(), "HYDRATE", false, 8, null);
                        } else if (gVar2 instanceof com.gamericefishpro.space.dh.d) {
                            com.gamericefishpro.space.fc.i.setOptStringProperty$default(((com.gamericefishpro.space.hh.a) nVar._propertiesModelStore.getModel()).getTags(), ((com.gamericefishpro.space.dh.d) gVar2).getKey(), null, "HYDRATE", false, 8, null);
                        } else if (gVar2 instanceof com.gamericefishpro.space.dh.j) {
                            com.gamericefishpro.space.fc.i.setOptAnyProperty$default(nVar._propertiesModelStore.getModel(), ((com.gamericefishpro.space.dh.j) gVar2).getProperty(), ((com.gamericefishpro.space.dh.j) gVar2).getValue(), "HYDRATE", false, 8, null);
                        }
                    }
                }
            } catch (com.gamericefishpro.space.ec.a e2) {
                e = e2;
                str2 = str3;
                str = appId;
                nVar = nVar2;
                i = o.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i == 1) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i == 2) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 3) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (e.getStatusCode() != 404) {
                }
                List<com.gamericefishpro.space.bd.g> rebuildOperationsIfCurrentUser2 = nVar._buildUserService.getRebuildOperationsIfCurrentUser(str, str2);
                if (rebuildOperationsIfCurrentUser2 == null) {
                }
            }
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) bVar3.L$3;
            str = (String) bVar3.L$2;
            list2 = (List) bVar3.L$1;
            nVar = (n) bVar3.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(objUpdateUser);
                if (Intrinsics.a(((com.gamericefishpro.space.bh.a) nVar._identityModelStore.getModel()).getOnesignalId(), str2)) {
                    while (r0.hasNext()) {
                        if (gVar2 instanceof com.gamericefishpro.space.dh.k) {
                            com.gamericefishpro.space.fc.i.setStringProperty$default(((com.gamericefishpro.space.hh.a) nVar._propertiesModelStore.getModel()).getTags(), ((com.gamericefishpro.space.dh.k) gVar2).getKey(), ((com.gamericefishpro.space.dh.k) gVar2).getValue(), "HYDRATE", false, 8, null);
                        } else if (gVar2 instanceof com.gamericefishpro.space.dh.d) {
                            com.gamericefishpro.space.fc.i.setOptStringProperty$default(((com.gamericefishpro.space.hh.a) nVar._propertiesModelStore.getModel()).getTags(), ((com.gamericefishpro.space.dh.d) gVar2).getKey(), null, "HYDRATE", false, 8, null);
                        } else if (gVar2 instanceof com.gamericefishpro.space.dh.j) {
                            com.gamericefishpro.space.fc.i.setOptAnyProperty$default(nVar._propertiesModelStore.getModel(), ((com.gamericefishpro.space.dh.j) gVar2).getProperty(), ((com.gamericefishpro.space.dh.j) gVar2).getValue(), "HYDRATE", false, 8, null);
                        }
                    }
                }
            } catch (com.gamericefishpro.space.ec.a e3) {
                e = e3;
                i = o.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i == 1) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i == 2) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 3) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (e.getStatusCode() != 404 && nVar._newRecordState.isInMissingRetryWindow(str2)) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                List<com.gamericefishpro.space.bd.g> rebuildOperationsIfCurrentUser3 = nVar._buildUserService.getRebuildOperationsIfCurrentUser(str, str2);
                return rebuildOperationsIfCurrentUser3 == null ? new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null) : new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser3, e.getRetryAfterSeconds(), 2, null);
            }
        }
        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // com.gamericefishpro.space.bd.d
    public List<String> getOperations() {
        return x.f(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
