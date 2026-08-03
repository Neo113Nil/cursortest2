package com.onesignal.user.internal.operations.impl.executors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kb.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements z8.d {
    public static final a Companion = new a(null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final hb.a _buildUserService;
    private final k8.c _consistencyManager;
    private final jb.b _identityModelStore;
    private final mb.a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
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
            return l.this.execute(null, this);
        }
    }

    public l(gb.d dVar, jb.b bVar, com.onesignal.user.internal.properties.b bVar2, hb.a aVar, mb.a aVar2, k8.c cVar) {
        pc.j.e(dVar, "_userBackend");
        pc.j.e(bVar, "_identityModelStore");
        pc.j.e(bVar2, "_propertiesModelStore");
        pc.j.e(aVar, "_buildUserService");
        pc.j.e(aVar2, "_newRecordState");
        pc.j.e(cVar, "_consistencyManager");
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
        this._consistencyManager = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x028d, code lost:
    
        if (r2.resolveConditionsWithID(i8.a.ID, r11) == r15) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02a2 A[Catch: a -> 0x0048, TryCatch #1 {a -> 0x0048, blocks: (B:17:0x0043, B:18:0x0290, B:20:0x02a2, B:21:0x02a6, B:23:0x02ac, B:40:0x02b6, B:26:0x02d9, B:37:0x02dd, B:29:0x02fa, B:32:0x02fe, B:47:0x0065, B:48:0x0260, B:50:0x0264, B:54:0x027a), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0264 A[Catch: a -> 0x0048, TryCatch #1 {a -> 0x0048, blocks: (B:17:0x0043, B:18:0x0290, B:20:0x02a2, B:21:0x02a6, B:23:0x02ac, B:40:0x02b6, B:26:0x02d9, B:37:0x02dd, B:29:0x02fa, B:32:0x02fe, B:47:0x0065, B:48:0x0260, B:50:0x0264, B:54:0x027a), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027a A[Catch: a -> 0x0048, TryCatch #1 {a -> 0x0048, blocks: (B:17:0x0043, B:18:0x0290, B:20:0x02a2, B:21:0x02a6, B:23:0x02ac, B:40:0x02b6, B:26:0x02d9, B:37:0x02dd, B:29:0x02fa, B:32:0x02fe, B:47:0x0065, B:48:0x0260, B:50:0x0264, B:54:0x027a), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006a  */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25, types: [com.onesignal.user.internal.operations.impl.executors.l] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // z8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends z8.g> list, fc.d dVar) {
        b bVar;
        String str;
        String str2;
        String str3;
        String str4;
        l lVar;
        int i10;
        long sessionTime;
        BigDecimal amountSpent;
        ArrayList arrayList;
        i8.b bVar2;
        int i11;
        List<? extends z8.g> list2 = list;
        try {
            if (dVar instanceof b) {
                bVar = (b) dVar;
                i11 = bVar.label;
                l lVar2 = -2147483648;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    int i12 = i11 - Integer.MIN_VALUE;
                    bVar.label = i12;
                    str = i12;
                    b bVar3 = bVar;
                    Object obj = bVar3.result;
                    str2 = bVar3.label;
                    int i13 = 1;
                    Object obj2 = gc.a.f2559g;
                    if (str2 != 0) {
                        v6.a.W(obj);
                        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "UpdateUserOperationExecutor(operation: " + list2 + ')');
                        gb.f fVar = new gb.f(null, null, null, null, null, null, 63, null);
                        gb.e eVar = new gb.e(null, null, null, null, 15, null);
                        gb.e eVar2 = eVar;
                        String str5 = null;
                        boolean z10 = 0;
                        gb.f fVar2 = fVar;
                        String str6 = null;
                        for (z8.g gVar : list2) {
                            if (gVar instanceof kb.k) {
                                if (str6 == null) {
                                    kb.k kVar = (kb.k) gVar;
                                    str6 = kVar.getAppId();
                                    str5 = kVar.getOnesignalId();
                                }
                                fVar2 = g.INSTANCE.createPropertiesFromOperation((kb.k) gVar, fVar2);
                            } else if (gVar instanceof kb.d) {
                                if (str6 == null) {
                                    kb.d dVar2 = (kb.d) gVar;
                                    str6 = dVar2.getAppId();
                                    str5 = dVar2.getOnesignalId();
                                }
                                fVar2 = g.INSTANCE.createPropertiesFromOperation((kb.d) gVar, fVar2);
                            } else if (gVar instanceof kb.j) {
                                if (str6 == null) {
                                    kb.j jVar = (kb.j) gVar;
                                    str6 = jVar.getAppId();
                                    str5 = jVar.getOnesignalId();
                                }
                                fVar2 = g.INSTANCE.createPropertiesFromOperation((kb.j) gVar, fVar2);
                            } else if (gVar instanceof n) {
                                if (str6 == null) {
                                    n nVar = (n) gVar;
                                    String appId = nVar.getAppId();
                                    str5 = nVar.getOnesignalId();
                                    str6 = appId;
                                }
                                if (eVar2.getSessionCount() != null) {
                                    Integer sessionCount = eVar2.getSessionCount();
                                    pc.j.b(sessionCount);
                                    i10 = sessionCount.intValue() + i13;
                                } else {
                                    i10 = i13;
                                }
                                eVar2 = new gb.e(eVar2.getSessionTime(), new Integer(i10), eVar2.getAmountSpent(), eVar2.getPurchases());
                                z10 = i13;
                            } else if (gVar instanceof kb.m) {
                                if (str6 == null) {
                                    kb.m mVar = (kb.m) gVar;
                                    str6 = mVar.getAppId();
                                    str5 = mVar.getOnesignalId();
                                }
                                if (eVar2.getSessionTime() != null) {
                                    Long sessionTime2 = eVar2.getSessionTime();
                                    pc.j.b(sessionTime2);
                                    sessionTime = ((kb.m) gVar).getSessionTime() + sessionTime2.longValue();
                                } else {
                                    sessionTime = ((kb.m) gVar).getSessionTime();
                                }
                                eVar2 = new gb.e(new Long(sessionTime), eVar2.getSessionCount(), eVar2.getAmountSpent(), eVar2.getPurchases());
                            } else {
                                if (!(gVar instanceof kb.l)) {
                                    throw new Exception("Unrecognized operation: " + gVar);
                                }
                                if (str6 == null) {
                                    kb.l lVar3 = (kb.l) gVar;
                                    str6 = lVar3.getAppId();
                                    str5 = lVar3.getOnesignalId();
                                }
                                if (eVar2.getAmountSpent() != null) {
                                    BigDecimal amountSpent2 = eVar2.getAmountSpent();
                                    pc.j.b(amountSpent2);
                                    amountSpent = amountSpent2.add(((kb.l) gVar).getAmountSpent());
                                    pc.j.d(amountSpent, "this.add(other)");
                                } else {
                                    amountSpent = ((kb.l) gVar).getAmountSpent();
                                }
                                if (eVar2.getPurchases() != null) {
                                    List<gb.g> purchases = eVar2.getPurchases();
                                    pc.j.b(purchases);
                                    arrayList = bc.m.f0(purchases);
                                } else {
                                    arrayList = new ArrayList();
                                }
                                for (Iterator<kb.g> it = ((kb.l) gVar).getPurchases().iterator(); it.hasNext(); it = it) {
                                    kb.g next = it.next();
                                    arrayList.add(new gb.g(next.getSku(), next.getIso(), next.getAmount()));
                                }
                                eVar2 = new gb.e(eVar2.getSessionTime(), eVar2.getSessionCount(), amountSpent, arrayList);
                                i13 = 1;
                            }
                        }
                        if (str6 != null && str5 != null) {
                            try {
                                gb.d dVar3 = this._userBackend;
                                bVar3.L$0 = this;
                                bVar3.L$1 = list2;
                                bVar3.L$2 = str6;
                                bVar3.L$3 = str5;
                                bVar3.label = 1;
                                obj = dVar3.updateUser(str6, "onesignal_id", str5, fVar2, z10, eVar2, bVar3);
                                if (obj != obj2) {
                                    str3 = str6;
                                    str4 = str5;
                                    lVar = this;
                                }
                                return obj2;
                            } catch (l8.a e10) {
                                e = e10;
                                str = str6;
                                str2 = str5;
                                lVar2 = this;
                                int i14 = m.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i14 == 1) {
                                    return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i14 == 2) {
                                    return new z8.a(z8.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i14 != 3) {
                                    return new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null);
                                }
                                if (e.getStatusCode() == 404 && lVar2._newRecordState.isInMissingRetryWindow(str2)) {
                                    return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                List<z8.g> rebuildOperationsIfCurrentUser = lVar2._buildUserService.getRebuildOperationsIfCurrentUser(str, str2);
                                return rebuildOperationsIfCurrentUser == null ? new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null) : new z8.a(z8.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                            }
                        }
                        return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                    }
                    if (str2 != 1) {
                        if (str2 != 2 && str2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str7 = (String) bVar3.L$3;
                        String str8 = (String) bVar3.L$2;
                        list2 = (List) bVar3.L$1;
                        l lVar4 = (l) bVar3.L$0;
                        v6.a.W(obj);
                        str2 = str7;
                        str = str8;
                        lVar2 = lVar4;
                        if (pc.j.a(((jb.a) lVar2._identityModelStore.getModel()).getOnesignalId(), str2)) {
                            for (z8.g gVar2 : list2) {
                                if (gVar2 instanceof kb.k) {
                                    com.onesignal.common.modeling.i.setStringProperty$default(((com.onesignal.user.internal.properties.a) lVar2._propertiesModelStore.getModel()).getTags(), ((kb.k) gVar2).getKey(), ((kb.k) gVar2).getValue(), "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof kb.d) {
                                    com.onesignal.common.modeling.i.setOptStringProperty$default(((com.onesignal.user.internal.properties.a) lVar2._propertiesModelStore.getModel()).getTags(), ((kb.d) gVar2).getKey(), null, "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof kb.j) {
                                    com.onesignal.common.modeling.i.setOptAnyProperty$default(lVar2._propertiesModelStore.getModel(), ((kb.j) gVar2).getProperty(), ((kb.j) gVar2).getValue(), "HYDRATE", false, 8, null);
                                }
                            }
                        }
                        return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                    }
                    String str9 = (String) bVar3.L$3;
                    String str10 = (String) bVar3.L$2;
                    list2 = (List) bVar3.L$1;
                    l lVar5 = (l) bVar3.L$0;
                    v6.a.W(obj);
                    str4 = str9;
                    str3 = str10;
                    lVar = lVar5;
                    bVar2 = (i8.b) obj;
                    if (bVar2 == null) {
                        k8.c cVar = lVar._consistencyManager;
                        j8.a aVar = j8.a.USER;
                        bVar3.L$0 = lVar;
                        bVar3.L$1 = list2;
                        bVar3.L$2 = str3;
                        bVar3.L$3 = str4;
                        bVar3.label = 2;
                        Object rywData = cVar.setRywData(str4, aVar, bVar2, bVar3);
                        str2 = str4;
                        str = str3;
                        lVar2 = lVar;
                        if (rywData == obj2) {
                            return obj2;
                        }
                        if (pc.j.a(((jb.a) lVar2._identityModelStore.getModel()).getOnesignalId(), str2)) {
                        }
                        return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                    }
                    k8.c cVar2 = lVar._consistencyManager;
                    bVar3.L$0 = lVar;
                    bVar3.L$1 = list2;
                    bVar3.L$2 = str3;
                    bVar3.L$3 = str4;
                    bVar3.label = 3;
                    str2 = str4;
                    str = str3;
                    lVar2 = lVar;
                }
            }
            if (str2 != 0) {
            }
            bVar2 = (i8.b) obj;
            if (bVar2 == null) {
            }
        } catch (l8.a e11) {
            e = e11;
        }
        bVar = new b(dVar);
        str = i11;
        b bVar32 = bVar;
        Object obj3 = bVar32.result;
        str2 = bVar32.label;
        int i132 = 1;
        Object obj22 = gc.a.f2559g;
    }

    @Override // z8.d
    public List<String> getOperations() {
        return bc.n.L(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
