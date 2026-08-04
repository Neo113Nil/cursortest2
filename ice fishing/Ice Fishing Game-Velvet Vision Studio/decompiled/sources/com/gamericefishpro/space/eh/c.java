package com.gamericefishpro.space.eh;

import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.x;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.bd.d {
    public static final a Companion = new a(null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final com.gamericefishpro.space.xg.a _buildUserService;
    private final com.gamericefishpro.space.vg.b _identityBackend;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.gh.a _newRecordState;

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
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.execute(null, this);
        }
    }

    public c(com.gamericefishpro.space.vg.b _identityBackend, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.xg.a _buildUserService, com.gamericefishpro.space.gh.a _newRecordState) {
        Intrinsics.checkNotNullParameter(_identityBackend, "_identityBackend");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        this._identityBackend = _identityBackend;
        this._identityModelStore = _identityModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x026f A[Catch: a -> 0x0040, TRY_LEAVE, TryCatch #3 {a -> 0x0040, blocks: (B:14:0x003b, B:104:0x0256, B:106:0x026f), top: B:138:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x02df  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:127:0x0304  */
    /* JADX WARN: Code duplicated, block: B:128:0x0313  */
    /* JADX WARN: Code duplicated, block: B:69:0x014d A[Catch: a -> 0x005a, TRY_LEAVE, TryCatch #2 {a -> 0x005a, blocks: (B:21:0x0055, B:67:0x0134, B:69:0x014d), top: B:136:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x018d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x020a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0219  */
    @Override // com.gamericefishpro.space.bd.d
    public Object execute(List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar) throws Exception {
        b bVar;
        c cVar;
        com.gamericefishpro.space.bd.g gVar;
        c cVar2;
        com.gamericefishpro.space.bd.g gVar2;
        int i;
        int i2;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i3 = bVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.label = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i4 = bVar2.label;
        if (i4 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.od.b.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
            if (list == null || !list.isEmpty()) {
                for (com.gamericefishpro.space.bd.g gVar3 : list) {
                    if (!(gVar3 instanceof com.gamericefishpro.space.dh.i) && !(gVar3 instanceof com.gamericefishpro.space.dh.b)) {
                        throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                    }
                }
            }
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((com.gamericefishpro.space.bd.g) it.next()) instanceof com.gamericefishpro.space.dh.i) {
                        if (list != null && list.isEmpty()) {
                            break;
                        }
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((com.gamericefishpro.space.bd.g) it2.next()) instanceof com.gamericefishpro.space.dh.b) {
                                throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                            }
                        }
                        break;
                    }
                }
            }
            com.gamericefishpro.space.bd.g gVar4 = (com.gamericefishpro.space.bd.g) CollectionsKt.B(list);
            if (gVar4 instanceof com.gamericefishpro.space.dh.i) {
                try {
                    com.gamericefishpro.space.vg.b bVar3 = this._identityBackend;
                    String appId = ((com.gamericefishpro.space.dh.i) gVar4).getAppId();
                    String onesignalId = ((com.gamericefishpro.space.dh.i) gVar4).getOnesignalId();
                    Map<String, String> mapB = l0.b(new Pair(((com.gamericefishpro.space.dh.i) gVar4).getLabel(), ((com.gamericefishpro.space.dh.i) gVar4).getValue()));
                    bVar2.L$0 = this;
                    bVar2.L$1 = gVar4;
                    bVar2.label = 1;
                    if (bVar3.setAlias(appId, "onesignal_id", onesignalId, mapB, bVar2) != aVar2) {
                        cVar = this;
                        gVar = gVar4;
                        if (Intrinsics.a(((com.gamericefishpro.space.bh.a) cVar._identityModelStore.getModel()).getOnesignalId(), ((com.gamericefishpro.space.dh.i) gVar).getOnesignalId())) {
                            com.gamericefishpro.space.fc.i.setStringProperty$default(cVar._identityModelStore.getModel(), ((com.gamericefishpro.space.dh.i) gVar).getLabel(), ((com.gamericefishpro.space.dh.i) gVar).getValue(), "HYDRATE", false, 8, null);
                        }
                    }
                } catch (com.gamericefishpro.space.ec.a e) {
                    e = e;
                    cVar = this;
                    gVar = gVar4;
                    i = d.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i != 1) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i != 2) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i != 3) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i != 4) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i == 5) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    if (e.getStatusCode() != 404 && cVar._newRecordState.isInMissingRetryWindow(((com.gamericefishpro.space.dh.i) gVar).getOnesignalId())) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    com.gamericefishpro.space.dh.i iVar = (com.gamericefishpro.space.dh.i) gVar;
                    List<com.gamericefishpro.space.bd.g> rebuildOperationsIfCurrentUser = cVar._buildUserService.getRebuildOperationsIfCurrentUser(iVar.getAppId(), iVar.getOnesignalId());
                    if (rebuildOperationsIfCurrentUser == null) {
                    }
                }
            } else if (gVar4 instanceof com.gamericefishpro.space.dh.b) {
                try {
                    com.gamericefishpro.space.vg.b bVar4 = this._identityBackend;
                    String appId2 = ((com.gamericefishpro.space.dh.b) gVar4).getAppId();
                    String onesignalId2 = ((com.gamericefishpro.space.dh.b) gVar4).getOnesignalId();
                    String label = ((com.gamericefishpro.space.dh.b) gVar4).getLabel();
                    bVar2.L$0 = this;
                    bVar2.L$1 = gVar4;
                    bVar2.label = 2;
                    if (bVar4.deleteAlias(appId2, "onesignal_id", onesignalId2, label, bVar2) != aVar2) {
                        cVar2 = this;
                        gVar2 = gVar4;
                        if (Intrinsics.a(((com.gamericefishpro.space.bh.a) cVar2._identityModelStore.getModel()).getOnesignalId(), ((com.gamericefishpro.space.dh.b) gVar2).getOnesignalId())) {
                            com.gamericefishpro.space.fc.i.setOptStringProperty$default(cVar2._identityModelStore.getModel(), ((com.gamericefishpro.space.dh.b) gVar2).getLabel(), null, "HYDRATE", false, 8, null);
                        }
                    }
                } catch (com.gamericefishpro.space.ec.a e2) {
                    e = e2;
                    cVar2 = this;
                    gVar2 = gVar4;
                    i2 = d.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i2 != 1) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i2 != 2) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i2 != 3) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
                    }
                    if (i2 != 4) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i2 == 5) {
                        return (e.getStatusCode() == 404 || !cVar2._newRecordState.isInMissingRetryWindow(((com.gamericefishpro.space.dh.b) gVar2).getOnesignalId())) ? new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null) : new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    throw new com.gamericefishpro.space.oh.k();
                }
            }
            return aVar2;
        }
        if (i4 == 1) {
            gVar = (com.gamericefishpro.space.bd.g) bVar2.L$1;
            cVar = (c) bVar2.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
                if (Intrinsics.a(((com.gamericefishpro.space.bh.a) cVar._identityModelStore.getModel()).getOnesignalId(), ((com.gamericefishpro.space.dh.i) gVar).getOnesignalId())) {
                    com.gamericefishpro.space.fc.i.setStringProperty$default(cVar._identityModelStore.getModel(), ((com.gamericefishpro.space.dh.i) gVar).getLabel(), ((com.gamericefishpro.space.dh.i) gVar).getValue(), "HYDRATE", false, 8, null);
                }
            } catch (com.gamericefishpro.space.ec.a e3) {
                e = e3;
                i = d.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 2) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (i != 3) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 4) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i == 5) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                if (e.getStatusCode() != 404) {
                }
                com.gamericefishpro.space.dh.i iVar2 = (com.gamericefishpro.space.dh.i) gVar;
                List<com.gamericefishpro.space.bd.g> rebuildOperationsIfCurrentUser2 = cVar._buildUserService.getRebuildOperationsIfCurrentUser(iVar2.getAppId(), iVar2.getOnesignalId());
                return rebuildOperationsIfCurrentUser2 == null ? new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null) : new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser2, e.getRetryAfterSeconds(), 2, null);
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar2 = (com.gamericefishpro.space.bd.g) bVar2.L$1;
            cVar2 = (c) bVar2.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
                if (Intrinsics.a(((com.gamericefishpro.space.bh.a) cVar2._identityModelStore.getModel()).getOnesignalId(), ((com.gamericefishpro.space.dh.b) gVar2).getOnesignalId())) {
                    com.gamericefishpro.space.fc.i.setOptStringProperty$default(cVar2._identityModelStore.getModel(), ((com.gamericefishpro.space.dh.b) gVar2).getLabel(), null, "HYDRATE", false, 8, null);
                }
            } catch (com.gamericefishpro.space.ec.a e4) {
                e = e4;
                i2 = d.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i2 != 1) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i2 != 2) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (i2 != 3) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
                }
                if (i2 != 4) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i2 == 5) {
                    if (e.getStatusCode() == 404) {
                    }
                }
                throw new com.gamericefishpro.space.oh.k();
            }
        }
        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
    }

    @Override // com.gamericefishpro.space.bd.d
    public List<String> getOperations() {
        return x.f(SET_ALIAS, DELETE_ALIAS);
    }
}
