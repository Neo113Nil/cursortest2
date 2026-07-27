package com.onesignal.user.internal.operations.impl.executors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m4.C4781b;
import n4.EnumC4812a;
import p4.C4860a;
import r7.AbstractC4979j;
import r7.AbstractC4980k;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class p implements D4.d {
    public static final a Companion = new a(null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final N5.a _buildUserService;
    private final o4.c _consistencyManager;
    private final Q5.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final T5.a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final M5.d _userBackend;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return p.this.execute(null, this);
        }
    }

    public p(M5.d _userBackend, Q5.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, N5.a _buildUserService, T5.a _newRecordState, o4.c _consistencyManager, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
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
    
        if (r2.resolveConditionsWithID(m4.C4780a.ID, r12) == r3) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02df A[Catch: a -> 0x0048, TryCatch #1 {a -> 0x0048, blocks: (B:14:0x0043, B:15:0x02cd, B:17:0x02df, B:18:0x02e3, B:20:0x02e9, B:37:0x02f3, B:23:0x0316, B:34:0x031a, B:26:0x0337, B:29:0x033b), top: B:13:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029d A[Catch: a -> 0x007d, TryCatch #3 {a -> 0x007d, blocks: (B:74:0x0078, B:75:0x0299, B:77:0x029d, B:82:0x02b7), top: B:73:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b7 A[Catch: a -> 0x007d, TRY_LEAVE, TryCatch #3 {a -> 0x007d, blocks: (B:74:0x0078, B:75:0x0299, B:77:0x029d, B:82:0x02b7), top: B:73:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // D4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends D4.g> list, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        p pVar;
        String str5;
        p pVar2;
        int i4;
        long sessionTime;
        BigDecimal amountSpent;
        ArrayList arrayList;
        C4781b c4781b;
        int i9;
        List<? extends D4.g> list2 = list;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                Object obj2 = EnumC5179a.f41704n;
                i = bVar2.label;
                int i11 = 1;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "UpdateUserOperationExecutor(operation: " + list2 + ')');
                    M5.f fVar = new M5.f(null, null, null, null, null, null, 63, null);
                    M5.e eVar = new M5.e(null, null, null, null, 15, null);
                    Iterator<? extends D4.g> it = list2.iterator();
                    M5.e eVar2 = eVar;
                    boolean z8 = 0;
                    String str6 = null;
                    str = null;
                    M5.f fVar2 = fVar;
                    while (it.hasNext()) {
                        D4.g next = it.next();
                        if (next instanceof R5.k) {
                            if (str == null) {
                                R5.k kVar = (R5.k) next;
                                str = kVar.getAppId();
                                str6 = kVar.getOnesignalId();
                            }
                            fVar2 = k.INSTANCE.createPropertiesFromOperation((R5.k) next, fVar2);
                        } else if (next instanceof R5.d) {
                            if (str == null) {
                                R5.d dVar = (R5.d) next;
                                str = dVar.getAppId();
                                str6 = dVar.getOnesignalId();
                            }
                            fVar2 = k.INSTANCE.createPropertiesFromOperation((R5.d) next, fVar2);
                        } else if (next instanceof R5.j) {
                            if (str == null) {
                                R5.j jVar = (R5.j) next;
                                str = jVar.getAppId();
                                str6 = jVar.getOnesignalId();
                            }
                            fVar2 = k.INSTANCE.createPropertiesFromOperation((R5.j) next, fVar2);
                        } else if (next instanceof R5.o) {
                            if (str == null) {
                                R5.o oVar = (R5.o) next;
                                str = oVar.getAppId();
                                str6 = oVar.getOnesignalId();
                            }
                            if (eVar2.getSessionCount() != null) {
                                Integer sessionCount = eVar2.getSessionCount();
                                kotlin.jvm.internal.h.b(sessionCount);
                                i4 = sessionCount.intValue() + i11;
                            } else {
                                i4 = i11;
                            }
                            eVar2 = new M5.e(eVar2.getSessionTime(), new Integer(i4), eVar2.getAmountSpent(), eVar2.getPurchases());
                            z8 = i11;
                        } else if (next instanceof R5.n) {
                            if (str == null) {
                                R5.n nVar = (R5.n) next;
                                str = nVar.getAppId();
                                str6 = nVar.getOnesignalId();
                            }
                            if (eVar2.getSessionTime() != null) {
                                Long sessionTime2 = eVar2.getSessionTime();
                                kotlin.jvm.internal.h.b(sessionTime2);
                                sessionTime = ((R5.n) next).getSessionTime() + sessionTime2.longValue();
                            } else {
                                sessionTime = ((R5.n) next).getSessionTime();
                            }
                            eVar2 = new M5.e(new Long(sessionTime), eVar2.getSessionCount(), eVar2.getAmountSpent(), eVar2.getPurchases());
                        } else {
                            if (!(next instanceof R5.m)) {
                                throw new Exception("Unrecognized operation: " + next);
                            }
                            if (str == null) {
                                R5.m mVar = (R5.m) next;
                                str = mVar.getAppId();
                                str6 = mVar.getOnesignalId();
                            }
                            if (eVar2.getAmountSpent() != null) {
                                BigDecimal amountSpent2 = eVar2.getAmountSpent();
                                kotlin.jvm.internal.h.b(amountSpent2);
                                amountSpent = amountSpent2.add(((R5.m) next).getAmountSpent());
                                kotlin.jvm.internal.h.d(amountSpent, "add(...)");
                            } else {
                                amountSpent = ((R5.m) next).getAmountSpent();
                            }
                            if (eVar2.getPurchases() != null) {
                                List<M5.g> purchases = eVar2.getPurchases();
                                kotlin.jvm.internal.h.b(purchases);
                                arrayList = AbstractC4979j.S(purchases);
                            } else {
                                arrayList = new ArrayList();
                            }
                            for (R5.g gVar : ((R5.m) next).getPurchases()) {
                                arrayList.add(new M5.g(gVar.getSku(), gVar.getIso(), gVar.getAmount()));
                                it = it;
                            }
                            eVar2 = new M5.e(eVar2.getSessionTime(), eVar2.getSessionCount(), amountSpent, arrayList);
                            it = it;
                            i11 = 1;
                        }
                    }
                    if (str != null && str6 != null) {
                        f resolveBackendParams = c.resolveBackendParams((D4.g) AbstractC4979j.G(list2), str6, this._jwtTokenStore, this._identityVerificationService);
                        try {
                            M5.d dVar2 = this._userBackend;
                            String aliasLabel = resolveBackendParams.getAliasLabel();
                            String aliasValue = resolveBackendParams.getAliasValue();
                            String jwt = resolveBackendParams.getJwt();
                            bVar2.L$0 = this;
                            bVar2.L$1 = list2;
                            bVar2.L$2 = str;
                            bVar2.L$3 = str6;
                            bVar2.label = 1;
                            str2 = str6;
                            try {
                                Object updateUser = dVar2.updateUser(str, aliasLabel, aliasValue, fVar2, z8, eVar2, jwt, bVar2);
                                if (updateUser != obj2) {
                                    str5 = str2;
                                    obj = updateUser;
                                    pVar2 = this;
                                }
                                return obj2;
                            } catch (C4860a e6) {
                                e = e6;
                                str3 = str2;
                                str4 = str;
                                pVar = this;
                                i9 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i9 == 1) {
                                    return new D4.a(D4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i9 == 2) {
                                    return new D4.a(D4.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i9 != 3) {
                                    return new D4.a(D4.b.FAIL_NORETRY, null, null, null, 14, null);
                                }
                                if (e.getStatusCode() == 404 && pVar._newRecordState.isInMissingRetryWindow(str3)) {
                                    return new D4.a(D4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                List<D4.g> rebuildOperationsIfCurrentUser = pVar._buildUserService.getRebuildOperationsIfCurrentUser(str4, str3);
                                return rebuildOperationsIfCurrentUser == null ? new D4.a(D4.b.FAIL_NORETRY, null, null, null, 14, null) : new D4.a(D4.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                            }
                        } catch (C4860a e9) {
                            e = e9;
                            str2 = str6;
                        }
                    }
                    return new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
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
                        com.bumptech.glide.f.r(obj);
                        if (kotlin.jvm.internal.h.a(((Q5.a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
                            for (D4.g gVar2 : list2) {
                                if (gVar2 instanceof R5.k) {
                                    com.onesignal.common.modeling.i.setStringProperty$default(((com.onesignal.user.internal.properties.a) pVar._propertiesModelStore.getModel()).getTags(), ((R5.k) gVar2).getKey(), ((R5.k) gVar2).getValue(), "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof R5.d) {
                                    com.onesignal.common.modeling.i.setOptStringProperty$default(((com.onesignal.user.internal.properties.a) pVar._propertiesModelStore.getModel()).getTags(), ((R5.d) gVar2).getKey(), null, "HYDRATE", false, 8, null);
                                } else if (gVar2 instanceof R5.j) {
                                    com.onesignal.common.modeling.i.setOptAnyProperty$default(pVar._propertiesModelStore.getModel(), ((R5.j) gVar2).getProperty(), ((R5.j) gVar2).getValue(), "HYDRATE", false, 8, null);
                                }
                            }
                        }
                        return new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
                    } catch (C4860a e10) {
                        e = e10;
                        i9 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i9 == 1) {
                        }
                    }
                } else {
                    str5 = (String) bVar2.L$3;
                    str = (String) bVar2.L$2;
                    list2 = (List) bVar2.L$1;
                    pVar2 = (p) bVar2.L$0;
                    try {
                        com.bumptech.glide.f.r(obj);
                    } catch (C4860a e11) {
                        e = e11;
                        str3 = str5;
                        str4 = str;
                        pVar = pVar2;
                        i9 = q.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i9 == 1) {
                        }
                    }
                }
                c4781b = (C4781b) obj;
                if (c4781b == null) {
                    o4.c cVar = pVar2._consistencyManager;
                    EnumC4812a enumC4812a = EnumC4812a.USER;
                    bVar2.L$0 = pVar2;
                    bVar2.L$1 = list2;
                    bVar2.L$2 = str;
                    bVar2.L$3 = str5;
                    bVar2.label = 2;
                    if (cVar.setRywData(str5, enumC4812a, c4781b, bVar2) == obj2) {
                        return obj2;
                    }
                    str3 = str5;
                    str4 = str;
                    pVar = pVar2;
                } else {
                    o4.c cVar2 = pVar2._consistencyManager;
                    bVar2.L$0 = pVar2;
                    bVar2.L$1 = list2;
                    bVar2.L$2 = str;
                    bVar2.L$3 = str5;
                    bVar2.label = 3;
                }
                if (kotlin.jvm.internal.h.a(((Q5.a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
                }
                return new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar = new b(interfaceC5133d);
        b bVar22 = bVar;
        Object obj3 = bVar22.result;
        Object obj22 = EnumC5179a.f41704n;
        i = bVar22.label;
        int i112 = 1;
        if (i != 0) {
        }
        c4781b = (C4781b) obj3;
        if (c4781b == null) {
        }
        if (kotlin.jvm.internal.h.a(((Q5.a) pVar._identityModelStore.getModel()).getOnesignalId(), str3)) {
        }
        return new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // D4.d
    public List<String> getOperations() {
        return AbstractC4980k.B(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
