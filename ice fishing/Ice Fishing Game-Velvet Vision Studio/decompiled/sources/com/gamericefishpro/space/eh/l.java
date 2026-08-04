package com.gamericefishpro.space.eh;

import android.os.Build;
import com.gamericefishpro.space.dh.p;
import com.gamericefishpro.space.dh.q;
import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.ph.x;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements com.gamericefishpro.space.bd.d {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final a Companion = new a(null);
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.xg.a _buildUserService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.cc.c _consistencyManager;
    private final com.gamericefishpro.space.vc.c _deviceService;
    private final com.gamericefishpro.space.gh.a _newRecordState;
    private final com.gamericefishpro.space.vg.c _subscriptionBackend;
    private final com.gamericefishpro.space.jh.e _subscriptionModelStore;

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
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.createSubscription(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.deleteSubscription(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.transferSubscription(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.updateSubscription(null, null, this);
        }
    }

    public l(com.gamericefishpro.space.vg.c _subscriptionBackend, com.gamericefishpro.space.vc.c _deviceService, com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.jh.e _subscriptionModelStore, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.xg.a _buildUserService, com.gamericefishpro.space.gh.a _newRecordState, com.gamericefishpro.space.cc.c _consistencyManager) {
        Intrinsics.checkNotNullParameter(_subscriptionBackend, "_subscriptionBackend");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_buildUserService, "_buildUserService");
        Intrinsics.checkNotNullParameter(_newRecordState, "_newRecordState");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        this._subscriptionBackend = _subscriptionBackend;
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
    }

    private final com.gamericefishpro.space.vg.j convert(com.gamericefishpro.space.jh.g gVar) {
        int i = m.$EnumSwitchMapping$1[gVar.ordinal()];
        if (i != 1) {
            return i != 2 ? com.gamericefishpro.space.vg.j.Companion.fromDeviceType(this._deviceService.getDeviceType()) : com.gamericefishpro.space.vg.j.EMAIL;
        }
        return com.gamericefishpro.space.vg.j.SMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x022e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:72:0x016d A[Catch: a -> 0x017e, TryCatch #1 {a -> 0x017e, blocks: (B:70:0x0169, B:72:0x016d, B:76:0x0181, B:78:0x018b, B:83:0x01a6), top: B:126:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0181 A[Catch: a -> 0x017e, TryCatch #1 {a -> 0x017e, blocks: (B:70:0x0169, B:72:0x016d, B:76:0x0181, B:78:0x018b, B:83:0x01a6), top: B:126:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x018b A[Catch: a -> 0x017e, TryCatch #1 {a -> 0x017e, blocks: (B:70:0x0169, B:72:0x016d, B:76:0x0181, B:78:0x018b, B:83:0x01a6), top: B:126:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a6 A[Catch: a -> 0x017e, TRY_LEAVE, TryCatch #1 {a -> 0x017e, blocks: (B:70:0x0169, B:72:0x016d, B:76:0x0181, B:78:0x018b, B:83:0x01a6), top: B:126:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8 A[Catch: a -> 0x0042, TryCatch #4 {a -> 0x0042, blocks: (B:15:0x003d, B:86:0x01b9, B:88:0x01c8, B:89:0x01d5, B:91:0x01eb, B:92:0x01f6), top: B:131:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01eb A[Catch: a -> 0x0042, TryCatch #4 {a -> 0x0042, blocks: (B:15:0x003d, B:86:0x01b9, B:88:0x01c8, B:89:0x01d5, B:91:0x01eb, B:92:0x01f6), top: B:131:0x003d }] */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
    
        if (r0.resolveConditionsWithID(com.gamericefishpro.space.zb.a.ID, r9) == r3) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSubscription(com.gamericefishpro.space.dh.a aVar, List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar2) {
        b bVar;
        com.gamericefishpro.space.bd.g gVarPrevious;
        String address;
        com.gamericefishpro.space.jh.f status;
        com.gamericefishpro.space.dh.a aVar3;
        l lVar;
        Object objCreateSubscription;
        Pair pair;
        String str;
        com.gamericefishpro.space.zb.b bVar2;
        com.gamericefishpro.space.dh.a aVar4;
        String str2;
        com.gamericefishpro.space.cc.c cVar;
        String onesignalId;
        com.gamericefishpro.space.ac.a aVar5;
        int i;
        String str3;
        com.gamericefishpro.space.jh.d dVar;
        if (aVar2 instanceof b) {
            bVar = (b) aVar2;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar2);
            }
        } else {
            bVar = new b(aVar2);
        }
        b bVar3 = bVar;
        Object obj = bVar3.result;
        com.gamericefishpro.space.uh.a aVar6 = com.gamericefishpro.space.uh.a.d;
        int i3 = bVar3.label;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) bVar3.L$2;
                aVar4 = (com.gamericefishpro.space.dh.a) bVar3.L$1;
                lVar = (l) bVar3.L$0;
                try {
                    com.gamericefishpro.space.wa.b.P(obj);
                    str3 = str2;
                    dVar = (com.gamericefishpro.space.jh.d) lVar._subscriptionModelStore.get(aVar4.getSubscriptionId());
                    if (dVar != null) {
                        com.gamericefishpro.space.fc.i.setStringProperty$default(dVar, "id", str3, "HYDRATE", false, 8, null);
                    }
                    if (Intrinsics.a(((com.gamericefishpro.space.rc.a) lVar._configModelStore.getModel()).getPushSubscriptionId(), aVar4.getSubscriptionId())) {
                        ((com.gamericefishpro.space.rc.a) lVar._configModelStore.getModel()).setPushSubscriptionId(str3);
                    }
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, l0.b(new Pair(aVar4.getSubscriptionId(), str3)), null, null, 12, null);
                } catch (com.gamericefishpro.space.ec.a e2) {
                    e = e2;
                    aVar3 = aVar4;
                    i = m.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i != 1) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i != 2) {
                    }
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
            }
            com.gamericefishpro.space.dh.a aVar7 = (com.gamericefishpro.space.dh.a) bVar3.L$1;
            l lVar2 = (l) bVar3.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
                objCreateSubscription = obj;
                aVar3 = aVar7;
                lVar = lVar2;
                try {
                    pair = (Pair) objCreateSubscription;
                    if (pair == null) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
                    }
                    str = (String) pair.d;
                    bVar2 = (com.gamericefishpro.space.zb.b) pair.e;
                    if (bVar2 != null) {
                        cVar = lVar._consistencyManager;
                        onesignalId = aVar3.getOnesignalId();
                        aVar5 = com.gamericefishpro.space.ac.a.SUBSCRIPTION;
                        bVar3.L$0 = lVar;
                        bVar3.L$1 = aVar3;
                        bVar3.L$2 = str;
                        bVar3.label = 2;
                        if (cVar.setRywData(onesignalId, aVar5, bVar2, bVar3) == aVar6) {
                            return aVar6;
                        }
                        aVar4 = aVar3;
                        str2 = str;
                    } else {
                        com.gamericefishpro.space.cc.c cVar2 = lVar._consistencyManager;
                        bVar3.L$0 = lVar;
                        bVar3.L$1 = aVar3;
                        bVar3.L$2 = str;
                        bVar3.label = 3;
                    }
                    str3 = str2;
                    dVar = (com.gamericefishpro.space.jh.d) lVar._subscriptionModelStore.get(aVar4.getSubscriptionId());
                    if (dVar != null) {
                        com.gamericefishpro.space.fc.i.setStringProperty$default(dVar, "id", str3, "HYDRATE", false, 8, null);
                    }
                    if (Intrinsics.a(((com.gamericefishpro.space.rc.a) lVar._configModelStore.getModel()).getPushSubscriptionId(), aVar4.getSubscriptionId())) {
                        ((com.gamericefishpro.space.rc.a) lVar._configModelStore.getModel()).setPushSubscriptionId(str3);
                    }
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, l0.b(new Pair(aVar4.getSubscriptionId(), str3)), null, null, 12, null);
                } catch (com.gamericefishpro.space.ec.a e3) {
                    e = e3;
                    i = m.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i != 1) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i != 2) {
                    }
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
            } catch (com.gamericefishpro.space.ec.a e4) {
                e = e4;
                aVar3 = aVar7;
                lVar = lVar2;
                i = m.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 2 || i == 3) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (i == 4) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 5) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                if (e.getStatusCode() == 404 && lVar._newRecordState.isInMissingRetryWindow(aVar3.getOnesignalId())) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                List<com.gamericefishpro.space.bd.g> rebuildOperationsIfCurrentUser = lVar._buildUserService.getRebuildOperationsIfCurrentUser(aVar3.getAppId(), aVar3.getOnesignalId());
                return rebuildOperationsIfCurrentUser == null ? new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null) : new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
            }
        }
        com.gamericefishpro.space.wa.b.P(obj);
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((com.gamericefishpro.space.bd.g) it.next()) instanceof com.gamericefishpro.space.dh.c) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
                }
            }
        }
        ListIterator<? extends com.gamericefishpro.space.bd.g> listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                gVarPrevious = null;
                break;
            }
            gVarPrevious = listIterator.previous();
        } while (!(gVarPrevious instanceof q));
        q qVar = (q) gVarPrevious;
        boolean enabled = qVar != null ? qVar.getEnabled() : aVar.getEnabled();
        if (qVar == null || (address = qVar.getAddress()) == null) {
            address = aVar.getAddress();
        }
        String str4 = address;
        if (qVar == null || (status = qVar.getStatus()) == null) {
            status = aVar.getStatus();
        }
        String subscriptionId = com.gamericefishpro.space.yb.c.INSTANCE.isLocalId(aVar.getSubscriptionId()) ? null : aVar.getSubscriptionId();
        try {
            com.gamericefishpro.space.vg.j jVarConvert = convert(aVar.getType());
            Boolean boolValueOf = Boolean.valueOf(enabled);
            Integer num = new Integer(status.getValue());
            String sdkVersion = com.gamericefishpro.space.yb.g.INSTANCE.getSdkVersion();
            String str5 = Build.MODEL;
            String str6 = Build.VERSION.RELEASE;
            Boolean boolValueOf2 = Boolean.valueOf(com.gamericefishpro.space.yb.i.INSTANCE.isRooted());
            com.gamericefishpro.space.yb.b bVar4 = com.gamericefishpro.space.yb.b.INSTANCE;
            com.gamericefishpro.space.vg.h hVar = new com.gamericefishpro.space.vg.h(subscriptionId, jVarConvert, str4, boolValueOf, num, sdkVersion, str5, str6, boolValueOf2, bVar4.getNetType(this._applicationService.getAppContext()), bVar4.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
            com.gamericefishpro.space.vg.c cVar3 = this._subscriptionBackend;
            String appId = aVar.getAppId();
            String onesignalId2 = aVar.getOnesignalId();
            bVar3.L$0 = this;
            aVar3 = aVar;
            try {
                bVar3.L$1 = aVar3;
                bVar3.label = 1;
                objCreateSubscription = cVar3.createSubscription(appId, "onesignal_id", onesignalId2, hVar, bVar3);
                if (objCreateSubscription != aVar6) {
                    lVar = this;
                    pair = (Pair) objCreateSubscription;
                    if (pair == null) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
                    }
                    str = (String) pair.d;
                    bVar2 = (com.gamericefishpro.space.zb.b) pair.e;
                    if (bVar2 != null) {
                        cVar = lVar._consistencyManager;
                        onesignalId = aVar3.getOnesignalId();
                        aVar5 = com.gamericefishpro.space.ac.a.SUBSCRIPTION;
                        bVar3.L$0 = lVar;
                        bVar3.L$1 = aVar3;
                        bVar3.L$2 = str;
                        bVar3.label = 2;
                        if (cVar.setRywData(onesignalId, aVar5, bVar2, bVar3) == aVar6) {
                        }
                        aVar4 = aVar3;
                        str2 = str;
                    } else {
                        com.gamericefishpro.space.cc.c cVar4 = lVar._consistencyManager;
                        bVar3.L$0 = lVar;
                        bVar3.L$1 = aVar3;
                        bVar3.L$2 = str;
                        bVar3.label = 3;
                    }
                    str3 = str2;
                    dVar = (com.gamericefishpro.space.jh.d) lVar._subscriptionModelStore.get(aVar4.getSubscriptionId());
                    if (dVar != null) {
                        com.gamericefishpro.space.fc.i.setStringProperty$default(dVar, "id", str3, "HYDRATE", false, 8, null);
                    }
                    if (Intrinsics.a(((com.gamericefishpro.space.rc.a) lVar._configModelStore.getModel()).getPushSubscriptionId(), aVar4.getSubscriptionId())) {
                        ((com.gamericefishpro.space.rc.a) lVar._configModelStore.getModel()).setPushSubscriptionId(str3);
                    }
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, l0.b(new Pair(aVar4.getSubscriptionId(), str3)), null, null, 12, null);
                }
                return aVar6;
            } catch (com.gamericefishpro.space.ec.a e5) {
                e = e5;
                lVar = this;
                i = m.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i != 2) {
                }
                return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
            }
        } catch (com.gamericefishpro.space.ec.a e6) {
            e = e6;
            aVar3 = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:0: B:41:0x00bc->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object deleteSubscription(com.gamericefishpro.space.dh.c cVar, com.gamericefishpro.space.th.a aVar) {
        c cVar2;
        com.gamericefishpro.space.ec.a aVar2;
        l lVar;
        int i;
        List listF;
        Iterator it;
        if (aVar instanceof c) {
            cVar2 = (c) aVar;
            int i2 = cVar2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.label = i2 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(aVar);
            }
        } else {
            cVar2 = new c(aVar);
        }
        Object obj = cVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i3 = cVar2.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            try {
                com.gamericefishpro.space.vg.c cVar3 = this._subscriptionBackend;
                String appId = cVar.getAppId();
                String subscriptionId = cVar.getSubscriptionId();
                cVar2.L$0 = this;
                cVar2.L$1 = cVar;
                cVar2.label = 1;
                if (cVar3.deleteSubscription(appId, subscriptionId, cVar2) == aVar3) {
                    return aVar3;
                }
                lVar = this;
            } catch (com.gamericefishpro.space.ec.a e2) {
                aVar2 = e2;
                lVar = this;
                i = m.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(aVar2.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, aVar2.getRetryAfterSeconds(), 6, null);
                }
                if (i != 5) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (aVar2.getStatusCode() == 404 && ((listF = x.f(cVar.getOnesignalId(), cVar.getSubscriptionId())) == null || !listF.isEmpty())) {
                    it = listF.iterator();
                    while (it.hasNext()) {
                        if (lVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, aVar2.getRetryAfterSeconds(), 6, null);
                        }
                    }
                }
                return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (com.gamericefishpro.space.dh.c) cVar2.L$1;
            lVar = (l) cVar2.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
            } catch (com.gamericefishpro.space.ec.a e3) {
                aVar2 = e3;
                i = m.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(aVar2.getStatusCode()).ordinal()];
                if (i != 1) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, aVar2.getRetryAfterSeconds(), 6, null);
                }
                if (i != 5) {
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (aVar2.getStatusCode() == 404) {
                    it = listF.iterator();
                    while (it.hasNext()) {
                        if (lVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, aVar2.getRetryAfterSeconds(), 6, null);
                        }
                    }
                }
                return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
            }
        }
        lVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object transferSubscription(p pVar, com.gamericefishpro.space.th.a aVar) {
        d dVar;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        d dVar2 = dVar;
        Object obj = dVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = dVar2.label;
        int i3 = 1;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.vg.c cVar = this._subscriptionBackend;
                String appId = pVar.getAppId();
                String subscriptionId = pVar.getSubscriptionId();
                String onesignalId = pVar.getOnesignalId();
                dVar2.label = 1;
                if (cVar.transferSubscription(appId, subscriptionId, "onesignal_id", onesignalId, dVar2) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            i3 = 0;
            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
        } catch (com.gamericefishpro.space.ec.a e2) {
            return m.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e2.getStatusCode()).ordinal()] == i3 ? new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e2.getRetryAfterSeconds(), 6, null) : new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00e9 A[Catch: a -> 0x0056, TryCatch #1 {a -> 0x0056, blocks: (B:21:0x0051, B:30:0x00e4, B:32:0x00e9, B:35:0x0100), top: B:66:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:35:0x0100 A[Catch: a -> 0x0056, TRY_LEAVE, TryCatch #1 {a -> 0x0056, blocks: (B:21:0x0051, B:30:0x00e4, B:32:0x00e9, B:35:0x0100), top: B:66:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0110, code lost:
    
        if (r0.resolveConditionsWithID(com.gamericefishpro.space.zb.a.ID, r2) == r3) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSubscription(q qVar, List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar) {
        e eVar;
        q qVar2;
        l lVar;
        q qVar3;
        l lVar2;
        q qVar4;
        com.gamericefishpro.space.zb.b bVar;
        com.gamericefishpro.space.cc.c cVar;
        String onesignalId;
        com.gamericefishpro.space.ac.a aVar2;
        List listF;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i = eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.label = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(aVar);
            }
        } else {
            eVar = new e(aVar);
        }
        Object objUpdateSubscription = eVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = eVar.label;
        if (i2 != 0) {
            if (i2 == 1) {
                qVar2 = (q) eVar.L$2;
                qVar4 = (q) eVar.L$1;
                lVar2 = (l) eVar.L$0;
                try {
                    com.gamericefishpro.space.wa.b.P(objUpdateSubscription);
                    bVar = (com.gamericefishpro.space.zb.b) objUpdateSubscription;
                    if (bVar != null) {
                        cVar = lVar2._consistencyManager;
                        onesignalId = qVar4.getOnesignalId();
                        aVar2 = com.gamericefishpro.space.ac.a.SUBSCRIPTION;
                        eVar.L$0 = lVar2;
                        eVar.L$1 = qVar2;
                        eVar.L$2 = null;
                        eVar.label = 2;
                        if (cVar.setRywData(onesignalId, aVar2, bVar, eVar) == aVar3) {
                            return aVar3;
                        }
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
                    }
                    com.gamericefishpro.space.cc.c cVar2 = lVar2._consistencyManager;
                    eVar.L$0 = lVar2;
                    eVar.L$1 = qVar2;
                    eVar.L$2 = null;
                    eVar.label = 3;
                } catch (com.gamericefishpro.space.ec.a e2) {
                    e = e2;
                    qVar3 = qVar2;
                    lVar = lVar2;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar3 = (q) eVar.L$1;
                lVar = (l) eVar.L$0;
                try {
                    com.gamericefishpro.space.wa.b.P(objUpdateSubscription);
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
                } catch (com.gamericefishpro.space.ec.a e3) {
                    e = e3;
                }
            }
            int i3 = m.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i3 == 1) {
                return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            if (i3 != 5) {
                return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
            }
            if (e.getStatusCode() == 404 && ((listF = x.f(qVar3.getOnesignalId(), qVar3.getSubscriptionId())) == null || !listF.isEmpty())) {
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    if (lVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                        return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                }
            }
            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, w.c(new com.gamericefishpro.space.dh.a(qVar3.getAppId(), qVar3.getOnesignalId(), qVar3.getSubscriptionId(), qVar3.getType(), qVar3.getEnabled(), qVar3.getAddress(), qVar3.getStatus())), null, 10, null);
        }
        com.gamericefishpro.space.wa.b.P(objUpdateSubscription);
        Object objB = CollectionsKt.B(list);
        Intrinsics.c(objB, "null cannot be cast to non-null type com.onesignal.user.internal.operations.UpdateSubscriptionOperation");
        qVar2 = (q) objB;
        try {
            com.gamericefishpro.space.vg.j jVarConvert = convert(qVar2.getType());
            String address = qVar2.getAddress();
            Boolean boolValueOf = Boolean.valueOf(qVar2.getEnabled());
            Integer num = new Integer(qVar2.getStatus().getValue());
            String sdkVersion = com.gamericefishpro.space.yb.g.INSTANCE.getSdkVersion();
            String str = Build.MODEL;
            String str2 = Build.VERSION.RELEASE;
            Boolean boolValueOf2 = Boolean.valueOf(com.gamericefishpro.space.yb.i.INSTANCE.isRooted());
            com.gamericefishpro.space.yb.b bVar2 = com.gamericefishpro.space.yb.b.INSTANCE;
            com.gamericefishpro.space.vg.h hVar = new com.gamericefishpro.space.vg.h(null, jVarConvert, address, boolValueOf, num, sdkVersion, str, str2, boolValueOf2, bVar2.getNetType(this._applicationService.getAppContext()), bVar2.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
            com.gamericefishpro.space.vg.c cVar3 = this._subscriptionBackend;
            String appId = qVar2.getAppId();
            String subscriptionId = qVar2.getSubscriptionId();
            eVar.L$0 = this;
            eVar.L$1 = qVar;
            eVar.L$2 = qVar2;
            eVar.label = 1;
            objUpdateSubscription = cVar3.updateSubscription(appId, subscriptionId, hVar, eVar);
            if (objUpdateSubscription != aVar3) {
                lVar2 = this;
                qVar4 = qVar;
                bVar = (com.gamericefishpro.space.zb.b) objUpdateSubscription;
                if (bVar != null) {
                    cVar = lVar2._consistencyManager;
                    onesignalId = qVar4.getOnesignalId();
                    aVar2 = com.gamericefishpro.space.ac.a.SUBSCRIPTION;
                    eVar.L$0 = lVar2;
                    eVar.L$1 = qVar2;
                    eVar.L$2 = null;
                    eVar.label = 2;
                    if (cVar.setRywData(onesignalId, aVar2, bVar, eVar) == aVar3) {
                    }
                    return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
                }
                com.gamericefishpro.space.cc.c cVar4 = lVar2._consistencyManager;
                eVar.L$0 = lVar2;
                eVar.L$1 = qVar2;
                eVar.L$2 = null;
                eVar.label = 3;
            }
            return aVar3;
        } catch (com.gamericefishpro.space.ec.a e4) {
            e = e4;
            lVar = this;
            qVar3 = qVar2;
        }
    }

    @Override // com.gamericefishpro.space.bd.d
    public Object execute(List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar) throws Exception {
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        com.gamericefishpro.space.bd.g gVar = (com.gamericefishpro.space.bd.g) CollectionsKt.w(list);
        if (gVar instanceof com.gamericefishpro.space.dh.a) {
            return createSubscription((com.gamericefishpro.space.dh.a) gVar, list, aVar);
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((com.gamericefishpro.space.bd.g) it.next()) instanceof com.gamericefishpro.space.dh.c) {
                    if (list.size() > 1) {
                        throw new Exception("Only supports one operation! Attempted operations:\n" + list);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof com.gamericefishpro.space.dh.c) {
                            arrayList.add(obj);
                        }
                    }
                    return deleteSubscription((com.gamericefishpro.space.dh.c) CollectionsKt.w(arrayList), aVar);
                }
            }
        }
        if (gVar instanceof q) {
            return updateSubscription((q) gVar, list, aVar);
        }
        if (!(gVar instanceof p)) {
            throw new Exception("Unrecognized operation: " + gVar);
        }
        if (list.size() <= 1) {
            return transferSubscription((p) gVar, aVar);
        }
        throw new Exception("TransferSubscriptionOperation only supports one operation! Attempted operations:\n" + list);
    }

    @Override // com.gamericefishpro.space.bd.d
    public List<String> getOperations() {
        return x.f(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
    }
}
