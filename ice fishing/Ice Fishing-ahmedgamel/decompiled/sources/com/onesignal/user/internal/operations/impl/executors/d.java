package com.onesignal.user.internal.operations.impl.executors;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t4.C5041a;
import u7.C5081g;
import v7.AbstractC5119j;
import v7.AbstractC5120k;
import v7.t;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class d implements H4.d {
    public static final a Companion = new a(null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final R5.a _buildUserService;
    private final Q5.b _identityBackend;
    private final U5.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final X5.a _newRecordState;

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

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.execute(null, this);
        }
    }

    public d(Q5.b _identityBackend, U5.b _identityModelStore, R5.a _buildUserService, X5.a _newRecordState, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.h.e(_identityBackend, "_identityBackend");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_buildUserService, "_buildUserService");
        kotlin.jvm.internal.h.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.h.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.h.e(_identityVerificationService, "_identityVerificationService");
        this._identityBackend = _identityBackend;
        this._identityModelStore = _identityModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x02ac A[Catch: a -> 0x02c8, TRY_LEAVE, TryCatch #8 {a -> 0x02c8, blocks: (B:16:0x0293, B:18:0x02ac), top: B:15:0x0293 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168 A[Catch: a -> 0x0189, TRY_LEAVE, TryCatch #2 {a -> 0x0189, blocks: (B:58:0x014f, B:60:0x0168), top: B:57:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // H4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends H4.g> list, InterfaceC5240d interfaceC5240d) {
        b bVar;
        int i;
        int i4;
        d dVar;
        H4.g gVar;
        int i6;
        d dVar2;
        H4.g gVar2;
        int i9;
        int i10;
        if (interfaceC5240d instanceof b) {
            bVar = (b) interfaceC5240d;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                A7.a aVar = A7.a.f215n;
                i = bVar2.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
                    if (list == null || !list.isEmpty()) {
                        for (H4.g gVar3 : list) {
                            if (!(gVar3 instanceof V5.i) && !(gVar3 instanceof V5.b)) {
                                throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                            }
                        }
                    }
                    if (list == null || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((H4.g) it.next()) instanceof V5.i) {
                                if (list == null || !list.isEmpty()) {
                                    Iterator<T> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (((H4.g) it2.next()) instanceof V5.b) {
                                            throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    H4.g gVar4 = (H4.g) AbstractC5119j.D(list);
                    if (gVar4 instanceof V5.i) {
                        f resolveBackendParams = c.resolveBackendParams(gVar4, ((V5.i) gVar4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        try {
                            Q5.b bVar3 = this._identityBackend;
                            String appId = ((V5.i) gVar4).getAppId();
                            try {
                                String aliasLabel = resolveBackendParams.getAliasLabel();
                                try {
                                    String aliasValue = resolveBackendParams.getAliasValue();
                                    try {
                                        Map<String, String> u6 = t.u(new C5081g(((V5.i) gVar4).getLabel(), ((V5.i) gVar4).getValue()));
                                        String jwt = resolveBackendParams.getJwt();
                                        bVar2.L$0 = this;
                                        bVar2.L$1 = gVar4;
                                        bVar2.label = 1;
                                        i6 = 2;
                                        try {
                                            if (bVar3.setAlias(appId, aliasLabel, aliasValue, u6, jwt, bVar2) != aVar) {
                                                dVar2 = this;
                                                gVar2 = gVar4;
                                                if (kotlin.jvm.internal.h.a(((U5.a) dVar2._identityModelStore.getModel()).getOnesignalId(), ((V5.i) gVar2).getOnesignalId())) {
                                                }
                                            }
                                        } catch (C5041a e9) {
                                            e = e9;
                                            dVar2 = this;
                                            gVar2 = gVar4;
                                            i9 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                            if (i9 == 1) {
                                                return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            if (i9 == i6) {
                                                return new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null);
                                            }
                                            if (i9 == 3) {
                                                return new H4.a(H4.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            if (i9 == 4) {
                                                return new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            if (i9 != 5) {
                                                throw new B0.c();
                                            }
                                            if (e.getStatusCode() == 404 && dVar2._newRecordState.isInMissingRetryWindow(((V5.i) gVar2).getOnesignalId())) {
                                                return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                            }
                                            V5.i iVar = (V5.i) gVar2;
                                            List<H4.g> rebuildOperationsIfCurrentUser = dVar2._buildUserService.getRebuildOperationsIfCurrentUser(iVar.getAppId(), iVar.getOnesignalId());
                                            return rebuildOperationsIfCurrentUser == null ? new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null) : new H4.a(H4.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                                        }
                                    } catch (C5041a e10) {
                                        e = e10;
                                        i6 = 2;
                                    }
                                } catch (C5041a e11) {
                                    e = e11;
                                    i6 = 2;
                                }
                            } catch (C5041a e12) {
                                e = e12;
                                i6 = 2;
                            }
                        } catch (C5041a e13) {
                            e = e13;
                            i6 = 2;
                        }
                    } else {
                        i4 = 2;
                        if (gVar4 instanceof V5.b) {
                            f resolveBackendParams2 = c.resolveBackendParams(gVar4, ((V5.b) gVar4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                            try {
                                Q5.b bVar4 = this._identityBackend;
                                String appId2 = ((V5.b) gVar4).getAppId();
                                String aliasLabel2 = resolveBackendParams2.getAliasLabel();
                                String aliasValue2 = resolveBackendParams2.getAliasValue();
                                String label = ((V5.b) gVar4).getLabel();
                                String jwt2 = resolveBackendParams2.getJwt();
                                bVar2.L$0 = this;
                                bVar2.L$1 = gVar4;
                                bVar2.label = 2;
                                if (bVar4.deleteAlias(appId2, aliasLabel2, aliasValue2, label, jwt2, bVar2) != aVar) {
                                    dVar = this;
                                    gVar = gVar4;
                                    if (kotlin.jvm.internal.h.a(((U5.a) dVar._identityModelStore.getModel()).getOnesignalId(), ((V5.b) gVar).getOnesignalId())) {
                                    }
                                }
                            } catch (C5041a e14) {
                                e = e14;
                                dVar = this;
                                gVar = gVar4;
                                i10 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i10 == 1) {
                                    return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i10 == i4) {
                                    return new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null);
                                }
                                if (i10 == 3) {
                                    return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                                }
                                if (i10 == 4) {
                                    return new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i10 == 5) {
                                    return (e.getStatusCode() == 404 && dVar._newRecordState.isInMissingRetryWindow(((V5.b) gVar).getOnesignalId())) ? new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null) : new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                                }
                                throw new B0.c();
                            }
                        }
                    }
                    return aVar;
                }
                if (i == 1) {
                    gVar2 = (H4.g) bVar2.L$1;
                    dVar2 = (d) bVar2.L$0;
                    try {
                        Q3.b.s(obj);
                        i6 = 2;
                        try {
                            if (kotlin.jvm.internal.h.a(((U5.a) dVar2._identityModelStore.getModel()).getOnesignalId(), ((V5.i) gVar2).getOnesignalId())) {
                                com.onesignal.common.modeling.i.setStringProperty$default(dVar2._identityModelStore.getModel(), ((V5.i) gVar2).getLabel(), ((V5.i) gVar2).getValue(), "HYDRATE", false, 8, null);
                            }
                        } catch (C5041a e15) {
                            e = e15;
                            i9 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                            if (i9 == 1) {
                            }
                        }
                    } catch (C5041a e16) {
                        e = e16;
                        i6 = 2;
                        i9 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i9 == 1) {
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = (H4.g) bVar2.L$1;
                    dVar = (d) bVar2.L$0;
                    try {
                        Q3.b.s(obj);
                        i4 = 2;
                    } catch (C5041a e17) {
                        e = e17;
                        i4 = 2;
                        i10 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i10 == 1) {
                        }
                    }
                    try {
                        if (kotlin.jvm.internal.h.a(((U5.a) dVar._identityModelStore.getModel()).getOnesignalId(), ((V5.b) gVar).getOnesignalId())) {
                            com.onesignal.common.modeling.i.setOptStringProperty$default(dVar._identityModelStore.getModel(), ((V5.b) gVar).getLabel(), null, "HYDRATE", false, 8, null);
                        }
                    } catch (C5041a e18) {
                        e = e18;
                        i10 = e.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i10 == 1) {
                        }
                    }
                }
                return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar = new b(interfaceC5240d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        A7.a aVar2 = A7.a.f215n;
        i = bVar22.label;
        if (i != 0) {
        }
        return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // H4.d
    public List<String> getOperations() {
        return AbstractC5120k.t(SET_ALIAS, DELETE_ALIAS);
    }
}
