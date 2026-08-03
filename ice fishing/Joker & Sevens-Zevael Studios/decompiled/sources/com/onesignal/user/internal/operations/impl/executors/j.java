package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import bc.a0;
import bc.n;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kb.o;
import kb.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements z8.d {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final a Companion = new a(null);
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final q8.f _applicationService;
    private final hb.a _buildUserService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final k8.c _consistencyManager;
    private final v8.c _deviceService;
    private final mb.a _newRecordState;
    private final gb.c _subscriptionBackend;
    private final ob.e _subscriptionModelStore;

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
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.createSubscription(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.deleteSubscription(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.transferSubscription(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public e(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.updateSubscription(null, null, this);
        }
    }

    public j(gb.c cVar, v8.c cVar2, q8.f fVar, ob.e eVar, com.onesignal.core.internal.config.b bVar, hb.a aVar, mb.a aVar2, k8.c cVar3) {
        pc.j.e(cVar, "_subscriptionBackend");
        pc.j.e(cVar2, "_deviceService");
        pc.j.e(fVar, "_applicationService");
        pc.j.e(eVar, "_subscriptionModelStore");
        pc.j.e(bVar, "_configModelStore");
        pc.j.e(aVar, "_buildUserService");
        pc.j.e(aVar2, "_newRecordState");
        pc.j.e(cVar3, "_consistencyManager");
        this._subscriptionBackend = cVar;
        this._deviceService = cVar2;
        this._applicationService = fVar;
        this._subscriptionModelStore = eVar;
        this._configModelStore = bVar;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
        this._consistencyManager = cVar3;
    }

    private final gb.j convert(ob.g gVar) {
        int i10 = k.$EnumSwitchMapping$1[gVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? gb.j.Companion.fromDeviceType(this._deviceService.getDeviceType()) : gb.j.EMAIL : gb.j.SMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019d, code lost:
    
        if (r0.resolveConditionsWithID(i8.a.ID, r9) == r13) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01af A[Catch: a -> 0x0042, TryCatch #2 {a -> 0x0042, blocks: (B:14:0x003d, B:16:0x01a0, B:18:0x01af, B:19:0x01bc, B:21:0x01d2, B:22:0x01dd, B:30:0x0065), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d2 A[Catch: a -> 0x0042, TryCatch #2 {a -> 0x0042, blocks: (B:14:0x003d, B:16:0x01a0, B:18:0x01af, B:19:0x01bc, B:21:0x01d2, B:22:0x01dd, B:30:0x0065), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0153 A[Catch: a -> 0x0165, TryCatch #1 {a -> 0x0165, blocks: (B:33:0x014f, B:35:0x0153, B:37:0x0168, B:39:0x0172, B:44:0x018d), top: B:32:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168 A[Catch: a -> 0x0165, TryCatch #1 {a -> 0x0165, blocks: (B:33:0x014f, B:35:0x0153, B:37:0x0168, B:39:0x0172, B:44:0x018d), top: B:32:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006c  */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35, types: [kb.a] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r4v20, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSubscription(kb.a aVar, List<? extends z8.g> list, fc.d dVar) {
        b bVar;
        j jVar;
        ?? r32;
        kb.a aVar2;
        j jVar2;
        int i10;
        z8.g gVar;
        String address;
        ob.f status;
        Object createSubscription;
        j jVar3;
        ac.i iVar;
        String str;
        ob.d dVar2;
        j jVar4;
        kb.a aVar3;
        ?? r42;
        try {
            try {
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    r42 = bVar.label;
                    if ((r42 & Integer.MIN_VALUE) != 0) {
                        ?? r43 = r42 - Integer.MIN_VALUE;
                        bVar.label = r43;
                        jVar = r43;
                        b bVar2 = bVar;
                        Object obj = bVar2.result;
                        r32 = bVar2.label;
                        gc.a aVar4 = gc.a.f2559g;
                        if (r32 != 0) {
                            v6.a.W(obj);
                            if (list == null || !list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    if (((z8.g) it.next()) instanceof kb.c) {
                                        return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                                    }
                                }
                            }
                            ListIterator<? extends z8.g> listIterator = list.listIterator(list.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    gVar = null;
                                    break;
                                }
                                gVar = listIterator.previous();
                                if (gVar instanceof p) {
                                    break;
                                }
                            }
                            p pVar = (p) gVar;
                            boolean enabled = pVar != null ? pVar.getEnabled() : aVar.getEnabled();
                            if (pVar == null || (address = pVar.getAddress()) == null) {
                                address = aVar.getAddress();
                            }
                            String str2 = address;
                            if (pVar == null || (status = pVar.getStatus()) == null) {
                                status = aVar.getStatus();
                            }
                            try {
                                gb.j convert = convert(aVar.getType());
                                Boolean valueOf = Boolean.valueOf(enabled);
                                Integer num = new Integer(status.getValue());
                                String str3 = Build.MODEL;
                                String str4 = Build.VERSION.RELEASE;
                                Boolean valueOf2 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
                                com.onesignal.common.d dVar3 = com.onesignal.common.d.INSTANCE;
                                gb.h hVar = new gb.h(null, convert, str2, valueOf, num, com.onesignal.common.i.SDK_VERSION, str3, str4, valueOf2, dVar3.getNetType(this._applicationService.getAppContext()), dVar3.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                                gb.c cVar = this._subscriptionBackend;
                                String appId = aVar.getAppId();
                                String onesignalId = aVar.getOnesignalId();
                                bVar2.L$0 = this;
                                aVar2 = aVar;
                                try {
                                    bVar2.L$1 = aVar2;
                                    bVar2.label = 1;
                                    createSubscription = cVar.createSubscription(appId, "onesignal_id", onesignalId, hVar, bVar2);
                                    if (createSubscription != aVar4) {
                                        jVar3 = this;
                                    }
                                    return aVar4;
                                } catch (l8.a e10) {
                                    e = e10;
                                    jVar2 = this;
                                    i10 = k.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                    if (i10 != 1) {
                                        return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                    }
                                    if (i10 == 2 || i10 == 3) {
                                        return new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null);
                                    }
                                    if (i10 == 4) {
                                        return new z8.a(z8.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                                    }
                                    if (i10 != 5) {
                                        throw new ac.d();
                                    }
                                    if (e.getStatusCode() == 404 && jVar2._newRecordState.isInMissingRetryWindow(aVar2.getOnesignalId())) {
                                        return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                    }
                                    List<z8.g> rebuildOperationsIfCurrentUser = jVar2._buildUserService.getRebuildOperationsIfCurrentUser(aVar2.getAppId(), aVar2.getOnesignalId());
                                    return rebuildOperationsIfCurrentUser == null ? new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null) : new z8.a(z8.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                                }
                            } catch (l8.a e11) {
                                e = e11;
                                aVar2 = aVar;
                            }
                        } else {
                            if (r32 != 1) {
                                if (r32 == 2) {
                                    str = (String) bVar2.L$2;
                                    aVar3 = (kb.a) bVar2.L$1;
                                    jVar4 = (j) bVar2.L$0;
                                } else {
                                    if (r32 != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    str = (String) bVar2.L$2;
                                    aVar3 = (kb.a) bVar2.L$1;
                                    jVar4 = (j) bVar2.L$0;
                                }
                                v6.a.W(obj);
                                r32 = aVar3;
                                jVar = jVar4;
                                String str5 = str;
                                dVar2 = (ob.d) jVar._subscriptionModelStore.get(r32.getSubscriptionId());
                                if (dVar2 != null) {
                                    com.onesignal.common.modeling.i.setStringProperty$default(dVar2, "id", str5, "HYDRATE", false, 8, null);
                                }
                                if (pc.j.a(((com.onesignal.core.internal.config.a) jVar._configModelStore.getModel()).getPushSubscriptionId(), r32.getSubscriptionId())) {
                                    ((com.onesignal.core.internal.config.a) jVar._configModelStore.getModel()).setPushSubscriptionId(str5);
                                }
                                return new z8.a(z8.b.SUCCESS, a0.C(new ac.i(r32.getSubscriptionId(), str5)), null, null, 12, null);
                            }
                            kb.a aVar5 = (kb.a) bVar2.L$1;
                            j jVar5 = (j) bVar2.L$0;
                            v6.a.W(obj);
                            createSubscription = obj;
                            aVar2 = aVar5;
                            jVar3 = jVar5;
                        }
                        iVar = (ac.i) createSubscription;
                        if (iVar != null) {
                            return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                        }
                        String str6 = (String) iVar.f270g;
                        i8.b bVar3 = (i8.b) iVar.f271h;
                        if (bVar3 != null) {
                            k8.c cVar2 = jVar3._consistencyManager;
                            String onesignalId2 = aVar2.getOnesignalId();
                            j8.a aVar6 = j8.a.SUBSCRIPTION;
                            bVar2.L$0 = jVar3;
                            bVar2.L$1 = aVar2;
                            bVar2.L$2 = str6;
                            bVar2.label = 2;
                            if (cVar2.setRywData(onesignalId2, aVar6, bVar3, bVar2) == aVar4) {
                                return aVar4;
                            }
                            str = str6;
                            r32 = aVar2;
                            jVar = jVar3;
                        } else {
                            k8.c cVar3 = jVar3._consistencyManager;
                            bVar2.L$0 = jVar3;
                            bVar2.L$1 = aVar2;
                            bVar2.L$2 = str6;
                            bVar2.label = 3;
                        }
                        String str52 = str;
                        dVar2 = (ob.d) jVar._subscriptionModelStore.get(r32.getSubscriptionId());
                        if (dVar2 != null) {
                        }
                        if (pc.j.a(((com.onesignal.core.internal.config.a) jVar._configModelStore.getModel()).getPushSubscriptionId(), r32.getSubscriptionId())) {
                        }
                        return new z8.a(z8.b.SUCCESS, a0.C(new ac.i(r32.getSubscriptionId(), str52)), null, null, 12, null);
                    }
                }
                iVar = (ac.i) createSubscription;
                if (iVar != null) {
                }
            } catch (l8.a e12) {
                e = e12;
                jVar2 = jVar3;
                i10 = k.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i10 != 1) {
                }
            }
            if (r32 != 0) {
            }
        } catch (l8.a e13) {
            e = e13;
            aVar2 = r32;
            jVar2 = jVar;
        }
        bVar = new b(dVar);
        jVar = r42;
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        r32 = bVar22.label;
        gc.a aVar42 = gc.a.f2559g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteSubscription(kb.c cVar, fc.d dVar) {
        c cVar2;
        int i10;
        l8.a aVar;
        j jVar;
        int i11;
        if (dVar instanceof c) {
            cVar2 = (c) dVar;
            int i12 = cVar2.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar2.label = i12 - Integer.MIN_VALUE;
                Object obj = cVar2.result;
                i10 = cVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    try {
                        gb.c cVar3 = this._subscriptionBackend;
                        String appId = cVar.getAppId();
                        String subscriptionId = cVar.getSubscriptionId();
                        cVar2.L$0 = this;
                        cVar2.L$1 = cVar;
                        cVar2.label = 1;
                        Object deleteSubscription = cVar3.deleteSubscription(appId, subscriptionId, cVar2);
                        gc.a aVar2 = gc.a.f2559g;
                        if (deleteSubscription == aVar2) {
                            return aVar2;
                        }
                        jVar = this;
                    } catch (l8.a e10) {
                        aVar = e10;
                        jVar = this;
                        i11 = k.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(aVar.getStatusCode()).ordinal()];
                        if (i11 != 1) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (kb.c) cVar2.L$1;
                    jVar = (j) cVar2.L$0;
                    try {
                        v6.a.W(obj);
                    } catch (l8.a e11) {
                        aVar = e11;
                        i11 = k.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(aVar.getStatusCode()).ordinal()];
                        if (i11 != 1) {
                            return new z8.a(z8.b.FAIL_RETRY, null, null, aVar.getRetryAfterSeconds(), 6, null);
                        }
                        if (i11 != 5) {
                            return new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (aVar.getStatusCode() == 404) {
                            List L = n.L(cVar.getOnesignalId(), cVar.getSubscriptionId());
                            if (!L.isEmpty()) {
                                Iterator it = L.iterator();
                                while (it.hasNext()) {
                                    if (jVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                        return new z8.a(z8.b.FAIL_RETRY, null, null, aVar.getRetryAfterSeconds(), 6, null);
                                    }
                                }
                            }
                        }
                        return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                    }
                }
                jVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
                return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
            }
        }
        cVar2 = new c(dVar);
        Object obj2 = cVar2.result;
        i10 = cVar2.label;
        if (i10 != 0) {
        }
        jVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
        return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transferSubscription(o oVar, fc.d dVar) {
        d dVar2;
        int i10;
        try {
            if (dVar instanceof d) {
                dVar2 = (d) dVar;
                int i11 = dVar2.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dVar2.label = i11 - Integer.MIN_VALUE;
                    d dVar3 = dVar2;
                    Object obj = dVar3.result;
                    i10 = dVar3.label;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        gb.c cVar = this._subscriptionBackend;
                        String appId = oVar.getAppId();
                        String subscriptionId = oVar.getSubscriptionId();
                        String onesignalId = oVar.getOnesignalId();
                        dVar3.label = 1;
                        Object transferSubscription = cVar.transferSubscription(appId, subscriptionId, "onesignal_id", onesignalId, dVar3);
                        gc.a aVar = gc.a.f2559g;
                        if (transferSubscription == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                    }
                    return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i10 != 0) {
            }
            return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
        } catch (l8.a e10) {
            return k.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(e10.getStatusCode()).ordinal()] == 1 ? new z8.a(z8.b.FAIL_RETRY, null, null, e10.getRetryAfterSeconds(), 6, null) : new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null);
        }
        dVar2 = new d(dVar);
        d dVar32 = dVar2;
        Object obj2 = dVar32.result;
        i10 = dVar32.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
    
        if (r0.resolveConditionsWithID(i8.a.ID, r2) == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4 A[Catch: a -> 0x0056, TryCatch #2 {a -> 0x0056, blocks: (B:47:0x0051, B:48:0x00df, B:50:0x00e4, B:54:0x00fb), top: B:46:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb A[Catch: a -> 0x0056, TRY_LEAVE, TryCatch #2 {a -> 0x0056, blocks: (B:47:0x0051, B:48:0x00df, B:50:0x00e4, B:54:0x00fb), top: B:46:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSubscription(p pVar, List<? extends z8.g> list, fc.d dVar) {
        e eVar;
        int i10;
        p pVar2;
        j jVar;
        j jVar2;
        p pVar3;
        i8.b bVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.label = i11 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                i10 = eVar.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 == 0) {
                    if (i10 == 1) {
                        pVar2 = (p) eVar.L$2;
                        pVar3 = (p) eVar.L$1;
                        jVar2 = (j) eVar.L$0;
                        try {
                            v6.a.W(obj);
                        } catch (l8.a e10) {
                            e = e10;
                            jVar = jVar2;
                        }
                    } else {
                        if (i10 != 2 && i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pVar2 = (p) eVar.L$1;
                        jVar = (j) eVar.L$0;
                        try {
                            v6.a.W(obj);
                            return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                        } catch (l8.a e11) {
                            e = e11;
                        }
                    }
                    int i12 = k.$EnumSwitchMapping$0[com.onesignal.common.h.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i12 == 1) {
                        return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i12 != 5) {
                        return new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (e.getStatusCode() == 404) {
                        List L = n.L(pVar2.getOnesignalId(), pVar2.getSubscriptionId());
                        if (!L.isEmpty()) {
                            Iterator it = L.iterator();
                            while (it.hasNext()) {
                                if (jVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                    return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                            }
                        }
                    }
                    return new z8.a(z8.b.FAIL_NORETRY, null, i7.b.z(new kb.a(pVar2.getAppId(), pVar2.getOnesignalId(), pVar2.getSubscriptionId(), pVar2.getType(), pVar2.getEnabled(), pVar2.getAddress(), pVar2.getStatus())), null, 10, null);
                }
                v6.a.W(obj);
                Object X = bc.m.X(list);
                pc.j.c(X, "null cannot be cast to non-null type com.onesignal.user.internal.operations.UpdateSubscriptionOperation");
                pVar2 = (p) X;
                try {
                    gb.j convert = convert(pVar2.getType());
                    String address = pVar2.getAddress();
                    Boolean valueOf = Boolean.valueOf(pVar2.getEnabled());
                    Integer num = new Integer(pVar2.getStatus().getValue());
                    String str = Build.MODEL;
                    String str2 = Build.VERSION.RELEASE;
                    Boolean valueOf2 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
                    com.onesignal.common.d dVar2 = com.onesignal.common.d.INSTANCE;
                    gb.h hVar = new gb.h(null, convert, address, valueOf, num, com.onesignal.common.i.SDK_VERSION, str, str2, valueOf2, dVar2.getNetType(this._applicationService.getAppContext()), dVar2.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    gb.c cVar = this._subscriptionBackend;
                    String appId = pVar2.getAppId();
                    String subscriptionId = pVar2.getSubscriptionId();
                    eVar.L$0 = this;
                    eVar.L$1 = pVar;
                    eVar.L$2 = pVar2;
                    eVar.label = 1;
                    obj = cVar.updateSubscription(appId, subscriptionId, hVar, eVar);
                    if (obj != aVar) {
                        jVar2 = this;
                        pVar3 = pVar;
                    }
                    return aVar;
                } catch (l8.a e12) {
                    e = e12;
                    jVar = this;
                }
                bVar = (i8.b) obj;
                if (bVar == null) {
                    k8.c cVar2 = jVar2._consistencyManager;
                    String onesignalId = pVar3.getOnesignalId();
                    j8.a aVar2 = j8.a.SUBSCRIPTION;
                    eVar.L$0 = jVar2;
                    eVar.L$1 = pVar2;
                    eVar.L$2 = null;
                    eVar.label = 2;
                    if (cVar2.setRywData(onesignalId, aVar2, bVar, eVar) == aVar) {
                        return aVar;
                    }
                    return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                }
                k8.c cVar3 = jVar2._consistencyManager;
                eVar.L$0 = jVar2;
                eVar.L$1 = pVar2;
                eVar.L$2 = null;
                eVar.label = 3;
            }
        }
        eVar = new e(dVar);
        Object obj2 = eVar.result;
        i10 = eVar.label;
        gc.a aVar3 = gc.a.f2559g;
        if (i10 == 0) {
        }
        bVar = (i8.b) obj2;
        if (bVar == null) {
        }
    }

    @Override // z8.d
    public Object execute(List<? extends z8.g> list, fc.d dVar) {
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        z8.g gVar = (z8.g) bc.m.T(list);
        if (gVar instanceof kb.a) {
            return createSubscription((kb.a) gVar, list, dVar);
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((z8.g) it.next()) instanceof kb.c) {
                    if (list.size() > 1) {
                        throw new Exception("Only supports one operation! Attempted operations:\n" + list);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof kb.c) {
                            arrayList.add(obj);
                        }
                    }
                    return deleteSubscription((kb.c) bc.m.T(arrayList), dVar);
                }
            }
        }
        if (gVar instanceof p) {
            return updateSubscription((p) gVar, list, dVar);
        }
        if (!(gVar instanceof o)) {
            throw new Exception("Unrecognized operation: " + gVar);
        }
        if (list.size() <= 1) {
            return transferSubscription((o) gVar, dVar);
        }
        throw new Exception("TransferSubscriptionOperation only supports one operation! Attempted operations:\n" + list);
    }

    @Override // z8.d
    public List<String> getOperations() {
        return n.L(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
    }
}
