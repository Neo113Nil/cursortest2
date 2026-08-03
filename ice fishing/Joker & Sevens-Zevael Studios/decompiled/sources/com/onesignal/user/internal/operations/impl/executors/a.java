package com.onesignal.user.internal.operations.impl.executors;

import bc.a0;
import bc.n;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements z8.d {
    public static final C0068a Companion = new C0068a(null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final hb.a _buildUserService;
    private final gb.b _identityBackend;
    private final jb.b _identityModelStore;
    private final mb.a _newRecordState;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.a$a, reason: collision with other inner class name */
    public static final class C0068a {
        public /* synthetic */ C0068a(pc.f fVar) {
            this();
        }

        private C0068a() {
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
            return a.this.execute(null, this);
        }
    }

    public a(gb.b bVar, jb.b bVar2, hb.a aVar, mb.a aVar2) {
        pc.j.e(bVar, "_identityBackend");
        pc.j.e(bVar2, "_identityModelStore");
        pc.j.e(aVar, "_buildUserService");
        pc.j.e(aVar2, "_newRecordState");
        this._identityBackend = bVar;
        this._identityModelStore = bVar2;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x026c A[Catch: a -> 0x003e, TRY_LEAVE, TryCatch #3 {a -> 0x003e, blocks: (B:13:0x0039, B:14:0x0253, B:16:0x026c), top: B:12:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c A[Catch: a -> 0x0058, TRY_LEAVE, TryCatch #1 {a -> 0x0058, blocks: (B:50:0x0053, B:51:0x0133, B:53:0x014c), top: B:49:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // z8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends z8.g> list, fc.d dVar) {
        b bVar;
        int i10;
        z8.g gVar;
        a aVar;
        a aVar2;
        int i11;
        int i12;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i13 = bVar.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.label = i13 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                i10 = bVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
                    if (list == null || !list.isEmpty()) {
                        for (z8.g gVar2 : list) {
                            if (!(gVar2 instanceof kb.i) && !(gVar2 instanceof kb.b)) {
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
                            if (((z8.g) it.next()) instanceof kb.i) {
                                if (list == null || !list.isEmpty()) {
                                    Iterator<T> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (((z8.g) it2.next()) instanceof kb.b) {
                                            throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    gVar = (z8.g) bc.m.X(list);
                    boolean z10 = gVar instanceof kb.i;
                    gc.a aVar3 = gc.a.f2559g;
                    if (!z10) {
                        if (gVar instanceof kb.b) {
                            try {
                                gb.b bVar3 = this._identityBackend;
                                String appId = ((kb.b) gVar).getAppId();
                                String onesignalId = ((kb.b) gVar).getOnesignalId();
                                String label = ((kb.b) gVar).getLabel();
                                bVar2.L$0 = this;
                                bVar2.L$1 = gVar;
                                bVar2.label = 2;
                                if (bVar3.deleteAlias(appId, "onesignal_id", onesignalId, label, bVar2) != aVar3) {
                                    aVar2 = this;
                                    if (pc.j.a(((jb.a) aVar2._identityModelStore.getModel()).getOnesignalId(), ((kb.b) gVar).getOnesignalId())) {
                                    }
                                }
                            } catch (l8.a e10) {
                                e = e10;
                                aVar2 = this;
                                i12 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i12 != 1) {
                                    return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i12 == 2) {
                                    return new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null);
                                }
                                if (i12 == 3) {
                                    return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                                }
                                if (i12 == 4) {
                                    return new z8.a(z8.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                                if (i12 == 5) {
                                    return (e.getStatusCode() == 404 && aVar2._newRecordState.isInMissingRetryWindow(((kb.b) gVar).getOnesignalId())) ? new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null) : new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                                }
                                throw new ac.d();
                            }
                        }
                        return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                    }
                    try {
                        gb.b bVar4 = this._identityBackend;
                        String appId2 = ((kb.i) gVar).getAppId();
                        String onesignalId2 = ((kb.i) gVar).getOnesignalId();
                        Map<String, String> C = a0.C(new ac.i(((kb.i) gVar).getLabel(), ((kb.i) gVar).getValue()));
                        bVar2.L$0 = this;
                        bVar2.L$1 = gVar;
                        bVar2.label = 1;
                        if (bVar4.setAlias(appId2, "onesignal_id", onesignalId2, C, bVar2) != aVar3) {
                            aVar = this;
                            if (pc.j.a(((jb.a) aVar._identityModelStore.getModel()).getOnesignalId(), ((kb.i) gVar).getOnesignalId())) {
                            }
                            return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                        }
                    } catch (l8.a e11) {
                        e = e11;
                        aVar = this;
                        i11 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i11 != 1) {
                        }
                    }
                    return aVar3;
                }
                if (i10 == 1) {
                    gVar = (z8.g) bVar2.L$1;
                    aVar = (a) bVar2.L$0;
                    try {
                        v6.a.W(obj);
                        if (pc.j.a(((jb.a) aVar._identityModelStore.getModel()).getOnesignalId(), ((kb.i) gVar).getOnesignalId())) {
                            com.onesignal.common.modeling.i.setStringProperty$default(aVar._identityModelStore.getModel(), ((kb.i) gVar).getLabel(), ((kb.i) gVar).getValue(), "HYDRATE", false, 8, null);
                        }
                        return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                    } catch (l8.a e12) {
                        e = e12;
                        i11 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i11 != 1) {
                            return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i11 == 2) {
                            return new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (i11 == 3) {
                            return new z8.a(z8.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i11 == 4) {
                            return new z8.a(z8.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i11 != 5) {
                            throw new ac.d();
                        }
                        if (e.getStatusCode() == 404 && aVar._newRecordState.isInMissingRetryWindow(((kb.i) gVar).getOnesignalId())) {
                            return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        kb.i iVar = (kb.i) gVar;
                        List<z8.g> rebuildOperationsIfCurrentUser = aVar._buildUserService.getRebuildOperationsIfCurrentUser(iVar.getAppId(), iVar.getOnesignalId());
                        return rebuildOperationsIfCurrentUser == null ? new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null) : new z8.a(z8.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (z8.g) bVar2.L$1;
                aVar2 = (a) bVar2.L$0;
                try {
                    v6.a.W(obj);
                    if (pc.j.a(((jb.a) aVar2._identityModelStore.getModel()).getOnesignalId(), ((kb.b) gVar).getOnesignalId())) {
                        com.onesignal.common.modeling.i.setOptStringProperty$default(aVar2._identityModelStore.getModel(), ((kb.b) gVar).getLabel(), null, "HYDRATE", false, 8, null);
                    }
                    return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                } catch (l8.a e13) {
                    e = e13;
                    i12 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i12 != 1) {
                    }
                }
            }
        }
        bVar = new b(dVar);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        i10 = bVar22.label;
        if (i10 != 0) {
        }
    }

    @Override // z8.d
    public List<String> getOperations() {
        return n.L(SET_ALIAS, DELETE_ALIAS);
    }
}
