package com.onesignal.user.internal.operations.impl.executors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q4.C4875b;
import r4.EnumC4908a;
import t4.C5041a;
import v7.AbstractC5119j;
import v7.AbstractC5120k;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class p implements H4.d {
    public static final a Companion = new a(null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final R5.a _buildUserService;
    private final s4.c _consistencyManager;
    private final U5.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final X5.a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
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

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return p.this.execute(null, this);
        }
    }

    public p(Q5.d _userBackend, U5.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, R5.a _buildUserService, X5.a _newRecordState, s4.c _consistencyManager, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.h.e(_userBackend, "_userBackend");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.h.e(_buildUserService, "_buildUserService");
        kotlin.jvm.internal.h.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.h.e(_consistencyManager, "_consistencyManager");
        kotlin.jvm.internal.h.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.h.e(_identityVerificationService, "_identityVerificationService");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ca, code lost:
    
        if (r2.resolveConditionsWithID(q4.C4874a.ID, r12) == r3) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02df A[Catch: a -> 0x0048, TryCatch #3 {a -> 0x0048, blocks: (B:14:0x0043, B:15:0x02cd, B:17:0x02df, B:18:0x02e3, B:20:0x02e9, B:37:0x02f3, B:23:0x0316, B:34:0x031a, B:26:0x0337, B:29:0x033b), top: B:13:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029d A[Catch: a -> 0x007d, TryCatch #1 {a -> 0x007d, blocks: (B:74:0x0078, B:75:0x0299, B:77:0x029d, B:82:0x02b7), top: B:73:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b7 A[Catch: a -> 0x007d, TRY_LEAVE, TryCatch #1 {a -> 0x007d, blocks: (B:74:0x0078, B:75:0x0299, B:77:0x029d, B:82:0x02b7), top: B:73:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // H4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends H4.g> list, InterfaceC5240d interfaceC5240d) {
        b bVar;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        p pVar;
        Q5.d dVar;
        String aliasLabel;
        String aliasValue;
        String jwt;
        String str5;
        p pVar2;
        int i4;
        long sessionTime;
        BigDecimal amountSpent;
        ArrayList arrayList;
        C4875b c4875b;
        int i6;
        List<? extends H4.g> list2 = list;
        if (interfaceC5240d instanceof b) {
            bVar = (b) interfaceC5240d;
            int i9 = bVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.label = i9 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                Object obj2 = A7.a.f215n;
                i = bVar2.label;
                int i10 = 1;
                if (i != 0) {
                    Q3.b.s(obj);
                    com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "UpdateUserOperationExecutor(operation: " + list2 + ')');
                    Q5.f fVar = new Q5.f(null, null, null, null, null, null, 63, null);
                    Q5.e eVar = new Q5.e(null, null, null, null, 15, null);
                    Iterator<? extends H4.g> it = list2.iterator();
                    Q5.e eVar2 = eVar;
                    boolean z6 = 0;
                    String str6 = null;
                    str = null;
                    Q5.f fVar2 = fVar;
                    while (it.hasNext()) {
                        H4.g next = it.next();
                        if (next instanceof V5.k) {
                            if (str == null) {
                                V5.k kVar = (V5.k) next;
                                str = kVar.getAppId();
                                str6 = kVar.getOnesignalId();
                            }
                            fVar2 = k.INSTANCE.createPropertiesFromOperation((V5.k) next, fVar2);
                        } else if (next instanceof V5.d) {
                            if (str == null) {
                                V5.d dVar2 = (V5.d) next;
                                str = dVar2.getAppId();
                                str6 = dVar2.getOnesignalId();
                            }
                            fVar2 = k.INSTANCE.createPropertiesFromOperation((V5.d) next, fVar2);
                        } else if (next instanceof V5.j) {
                            if (str == null) {
                                V5.j jVar = (V5.j) next;
                                str = jVar.getAppId();
                                str6 = jVar.getOnesignalId();
                            }
                            fVar2 = k.INSTANCE.createPropertiesFromOperation((V5.j) next, fVar2);
                        } else if (next instanceof V5.o) {
                            if (str == null) {
                                V5.o oVar = (V5.o) next;
                                str = oVar.getAppId();
                                str6 = oVar.getOnesignalId();
                            }
                            if (eVar2.getSessionCount() != null) {
                                Integer sessionCount = eVar2.getSessionCount();
                                kotlin.jvm.internal.h.b(sessionCount);
                                i4 = sessionCount.intValue() + i10;
                            } else {
                                i4 = i10;
                            }
                            eVar2 = new Q5.e(eVar2.getSessionTime(), new Integer(i4), eVar2.getAmountSpent(), eVar2.getPurchases());
                            z6 = i10;
                        } else if (next instanceof V5.n) {
                            if (str == null) {
                                V5.n nVar = (V5.n) next;
                                str = nVar.getAppId();
                                str6 = nVar.getOnesignalId();
                            }
                            if (eVar2.getSessionTime() != null) {
                                Long sessionTime2 = eVar2.getSessionTime();
                                kotlin.jvm.internal.h.b(sessionTime2);
                                sessionTime = ((V5.n) next).getSessionTime() + sessionTime2.longValue();
                            } else {
                                sessionTime = ((V5.n) next).getSessionTime();
                            }
                            eVar2 = new Q5.e(new Long(sessionTime), eVar2.getSessionCount(), eVar2.getAmountSpent(), eVar2.getPurchases());
                        } else {
                            if (!(next instanceof V5.m)) {
                                throw new Exception("Unrecognized operation: " + next);
                            }
                            if (str == null) {
                                V5.m mVar = (V5.m) next;
                                str = mVar.getAppId();
                                str6 = mVar.getOnesignalId();
                            }
                            if (eVar2.getAmountSpent() != null) {
                                BigDecimal amountSpent2 = eVar2.getAmountSpent();
                                kotlin.jvm.internal.h.b(amountSpent2);
                                amountSpent = amountSpent2.add(((V5.m) next).getAmountSpent());
                                kotlin.jvm.internal.h.d(amountSpent, "add(...)");
                            } else {
                                amountSpent = ((V5.m) next).getAmountSpent();
                            }
                            if (eVar2.getPurchases() != null) {
                                List<Q5.g> purchases = eVar2.getPurchases();
                                kotlin.jvm.internal.h.b(purchases);
                                arrayList = AbstractC5119j.K(purchases);
                            } else {
                                arrayList = new ArrayList();
                            }
                            for (V5.g gVar : ((V5.m) next).getPurchases()) {
                                arrayList.add(new Q5.g(gVar.getSku(), gVar.getIso(), gVar.getAmount()));
                                it = it;
                            }
                            eVar2 = new Q5.e(eVar2.getSessionTime(), eVar2.getSessionCount(), amountSpent, arrayList);
                            it = it;
                            i10 = 1;
                        }
                    }
                    if (str != null && str6 != null) {
                        f resolveBackendParams = c.resolveBackendParams((H4.g) AbstractC5119j.y(list2), str6, this._jwtTokenStore, this._identityVerificationService);
                        try {
                            dVar = this._userBackend;
                            aliasLabel = resolveBackendParams.getAliasLabel();
                            aliasValue = resolveBackendParams.getAliasValue();
                            jwt = resolveBackendParams.getJwt();
                            bVar2.L$0 = this;
                            bVar2.L$1 = list2;
                            bVar2.L$2 = str;
                            bVar2.L$3 = str6;
                            bVar2.label = 1;
                            str2 = str6;
                        } catch (C5041a e9) {
                            e = e9;
                            str2 = str6;
                        }
                        try {
                            Object updateUser = dVar.updateUser(str, aliasLabel, aliasValue, fVar2, z6, eVar2, jwt, bVar2);
                            if (updateUser != obj2) {
                                str5 = str2;
                                obj = updateUser;
                                pVar2 = this;
                            }
                            return obj2;
                        } catch (C5041a e10) {
                            e = e10;
                            str3 = str2;
                            str4 = str;
                            pVar = this;
                            i6 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i6 == 1) {
                            }
                        }
                    }
                    return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                }
                if (i != 1) {
                    if (i == 2) {
                        str3 = (String) bVar2.L$3;
                        str4 = (String) bVar2.L$2;
                        list2 = (List) bVar2.L$1;
                        pVar = (p) bVar2.L$0;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = (String) bVar2.L$3;
                        str4 = (String) bVar2.L$2;
                        list2 = (List) bVar2.L$1;
                        pVar = (p) bVar2.L$0;
                    }
                    try {
                        Q3.b.s(obj);
                        if (kotlin.jvm.internal.h.a(((U5.a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
                            for (H4.g gVar2 : list2) {
                                if (gVar2 instanceof V5.k) {
                                    com.onesignal.common.modeling.i.setStringProperty$default(((com.onesignal.user.internal.properties.a) pVar._propertiesModelStore.getModel()).getTags(), ((V5.k) gVar2).getKey(), ((V5.k) gVar2).getValue(), "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof V5.d) {
                                    com.onesignal.common.modeling.i.setOptStringProperty$default(((com.onesignal.user.internal.properties.a) pVar._propertiesModelStore.getModel()).getTags(), ((V5.d) gVar2).getKey(), null, "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof V5.j) {
                                    com.onesignal.common.modeling.i.setOptAnyProperty$default(pVar._propertiesModelStore.getModel(), ((V5.j) gVar2).getProperty(), ((V5.j) gVar2).getValue(), "HYDRATE", false, 8, null);
                                }
                            }
                        }
                        return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                    } catch (C5041a e11) {
                        e = e11;
                        i6 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i6 == 1) {
                        }
                    }
                } else {
                    str5 = (String) bVar2.L$3;
                    str = (String) bVar2.L$2;
                    list2 = (List) bVar2.L$1;
                    pVar2 = (p) bVar2.L$0;
                    try {
                        Q3.b.s(obj);
                    } catch (C5041a e12) {
                        e = e12;
                        str3 = str5;
                        str4 = str;
                        pVar = pVar2;
                        i6 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i6 == 1) {
                            return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i6 == 2) {
                            return new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i6 != 3) {
                            return new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404 && pVar._newRecordState.isInMissingRetryWindow(str3)) {
                            return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        List<H4.g> rebuildOperationsIfCurrentUser = pVar._buildUserService.getRebuildOperationsIfCurrentUser(str4, str3);
                        return rebuildOperationsIfCurrentUser == null ? new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null) : new H4.a(H4.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                }
                c4875b = (C4875b) obj;
                if (c4875b == null) {
                    s4.c cVar = pVar2._consistencyManager;
                    EnumC4908a enumC4908a = EnumC4908a.USER;
                    bVar2.L$0 = pVar2;
                    bVar2.L$1 = list2;
                    bVar2.L$2 = str;
                    bVar2.L$3 = str5;
                    bVar2.label = 2;
                    if (cVar.setRywData(str5, enumC4908a, c4875b, bVar2) == obj2) {
                        return obj2;
                    }
                    str3 = str5;
                    str4 = str;
                    pVar = pVar2;
                } else {
                    s4.c cVar2 = pVar2._consistencyManager;
                    bVar2.L$0 = pVar2;
                    bVar2.L$1 = list2;
                    bVar2.L$2 = str;
                    bVar2.L$3 = str5;
                    bVar2.label = 3;
                }
                if (kotlin.jvm.internal.h.a(((U5.a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
                }
                return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar = new b(interfaceC5240d);
        b bVar22 = bVar;
        Object obj3 = bVar22.result;
        Object obj22 = A7.a.f215n;
        i = bVar22.label;
        int i102 = 1;
        if (i != 0) {
        }
        c4875b = (C4875b) obj3;
        if (c4875b == null) {
        }
        if (kotlin.jvm.internal.h.a(((U5.a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
        }
        return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // H4.d
    public List<String> getOperations() {
        return AbstractC5120k.t(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
