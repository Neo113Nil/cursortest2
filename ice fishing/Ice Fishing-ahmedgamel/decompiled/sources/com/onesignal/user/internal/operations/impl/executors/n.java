package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import q4.C4926b;
import r4.EnumC4958a;
import t4.C5040a;
import u7.C5089g;
import v7.AbstractC5129j;
import v7.AbstractC5130k;
import v7.t;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class n implements H4.d {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final a Companion = new a(null);
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final x4.f _applicationService;
    private final R5.a _buildUserService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final s4.c _consistencyManager;
    private final C4.c _deviceService;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final X5.a _newRecordState;
    private final Q5.c _subscriptionBackend;
    private final Z5.e _subscriptionModelStore;

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
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.createSubscription(null, null, this);
        }
    }

    public static final class c extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.deleteSubscription(null, this);
        }
    }

    public static final class d extends B7.c {
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.transferSubscription(null, this);
        }
    }

    public static final class e extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.updateSubscription(null, null, this);
        }
    }

    public n(Q5.c _subscriptionBackend, C4.c _deviceService, x4.f _applicationService, Z5.e _subscriptionModelStore, com.onesignal.core.internal.config.c _configModelStore, R5.a _buildUserService, X5.a _newRecordState, s4.c _consistencyManager, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.h.e(_subscriptionBackend, "_subscriptionBackend");
        kotlin.jvm.internal.h.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_subscriptionModelStore, "_subscriptionModelStore");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_buildUserService, "_buildUserService");
        kotlin.jvm.internal.h.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.h.e(_consistencyManager, "_consistencyManager");
        kotlin.jvm.internal.h.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.h.e(_identityVerificationService, "_identityVerificationService");
        this._subscriptionBackend = _subscriptionBackend;
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    private final Q5.j convert(Z5.g gVar) {
        int i = o.$EnumSwitchMapping$1[gVar.ordinal()];
        return i != 1 ? i != 2 ? Q5.j.Companion.fromDeviceType(this._deviceService.getDeviceType()) : Q5.j.EMAIL : Q5.j.SMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b2, code lost:
    
        if (r3.resolveConditionsWithID(q4.C4925a.ID, r11) == r4) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c4 A[Catch: a -> 0x01d0, TryCatch #1 {a -> 0x01d0, blocks: (B:17:0x01b5, B:19:0x01c4, B:20:0x01d3, B:22:0x01e9, B:23:0x01f4), top: B:16:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e9 A[Catch: a -> 0x01d0, TryCatch #1 {a -> 0x01d0, blocks: (B:17:0x01b5, B:19:0x01c4, B:20:0x01d3, B:22:0x01e9, B:23:0x01f4), top: B:16:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b A[Catch: a -> 0x006b, TryCatch #0 {a -> 0x006b, blocks: (B:64:0x0066, B:65:0x0167, B:67:0x016b, B:69:0x017d, B:71:0x0187, B:76:0x01a2), top: B:63:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d A[Catch: a -> 0x006b, TryCatch #0 {a -> 0x006b, blocks: (B:64:0x0066, B:65:0x0167, B:67:0x016b, B:69:0x017d, B:71:0x0187, B:76:0x01a2), top: B:63:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSubscription(V5.a aVar, List<? extends H4.g> list, InterfaceC5267d interfaceC5267d) {
        b bVar;
        int i;
        H4.g gVar;
        String address;
        Z5.f status;
        n nVar;
        n nVar2;
        C5089g c5089g;
        String str;
        String str2;
        n nVar3;
        Z5.d dVar;
        V5.a aVar2 = aVar;
        if (interfaceC5267d instanceof b) {
            bVar = (b) interfaceC5267d;
            int i6 = bVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.label = i6 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                A7.a aVar3 = A7.a.f58n;
                i = bVar2.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            str = (String) bVar2.L$2;
                            aVar2 = (V5.a) bVar2.L$1;
                            nVar = (n) bVar2.L$0;
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = (String) bVar2.L$2;
                            aVar2 = (V5.a) bVar2.L$1;
                            nVar = (n) bVar2.L$0;
                        }
                        try {
                            com.bumptech.glide.d.k(obj);
                            str2 = str;
                            nVar3 = nVar;
                            try {
                                dVar = (Z5.d) nVar3._subscriptionModelStore.get(aVar2.getSubscriptionId());
                                if (dVar != null) {
                                    com.onesignal.common.modeling.i.setStringProperty$default(dVar, "id", str2, "HYDRATE", false, 8, null);
                                }
                                if (kotlin.jvm.internal.h.a(((com.onesignal.core.internal.config.b) nVar3._configModelStore.getModel()).getPushSubscriptionId(), aVar2.getSubscriptionId())) {
                                    ((com.onesignal.core.internal.config.b) nVar3._configModelStore.getModel()).setPushSubscriptionId(str2);
                                }
                                return new H4.a(H4.b.SUCCESS, t.Q(new C5089g(aVar2.getSubscriptionId(), str2)), null, null, 12, null);
                            } catch (C5040a e9) {
                                e = e9;
                                nVar = nVar3;
                            }
                        } catch (C5040a e10) {
                            e = e10;
                        }
                    } else {
                        aVar2 = (V5.a) bVar2.L$1;
                        nVar2 = (n) bVar2.L$0;
                        try {
                            com.bumptech.glide.d.k(obj);
                        } catch (C5040a e11) {
                            e = e11;
                            nVar = nVar2;
                        }
                    }
                    int i9 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i9 == 1) {
                        return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i9 == 2 || i9 == 3) {
                        return new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i9 == 4) {
                        return new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i9 != 5) {
                        throw new B0.c();
                    }
                    if (e.getStatusCode() == 404 && nVar._newRecordState.isInMissingRetryWindow(aVar2.getOnesignalId())) {
                        return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    List<H4.g> rebuildOperationsIfCurrentUser = nVar._buildUserService.getRebuildOperationsIfCurrentUser(aVar2.getAppId(), aVar2.getOnesignalId());
                    return rebuildOperationsIfCurrentUser == null ? new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null) : new H4.a(H4.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                }
                com.bumptech.glide.d.k(obj);
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((H4.g) it.next()) instanceof V5.c) {
                            return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                        }
                    }
                }
                ListIterator<? extends H4.g> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        gVar = null;
                        break;
                    }
                    gVar = listIterator.previous();
                    if (gVar instanceof V5.q) {
                        break;
                    }
                }
                V5.q qVar = (V5.q) gVar;
                boolean enabled = qVar != null ? qVar.getEnabled() : aVar2.getEnabled();
                if (qVar == null || (address = qVar.getAddress()) == null) {
                    address = aVar2.getAddress();
                }
                String str3 = address;
                if (qVar == null || (status = qVar.getStatus()) == null) {
                    status = aVar2.getStatus();
                }
                try {
                    Q5.j convert = convert(aVar2.getType());
                    Boolean valueOf = Boolean.valueOf(enabled);
                    Integer num = new Integer(status.getValue());
                    String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
                    String str4 = Build.MODEL;
                    String str5 = Build.VERSION.RELEASE;
                    Boolean valueOf2 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
                    com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
                    Q5.h hVar = new Q5.h(null, convert, str3, valueOf, num, sdkVersion, str4, str5, valueOf2, cVar.getNetType(this._applicationService.getAppContext()), cVar.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    f resolveBackendParams = com.onesignal.user.internal.operations.impl.executors.c.resolveBackendParams(aVar2, aVar2.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                    Q5.c cVar2 = this._subscriptionBackend;
                    String appId = aVar2.getAppId();
                    String aliasLabel = resolveBackendParams.getAliasLabel();
                    String aliasValue = resolveBackendParams.getAliasValue();
                    String jwt = resolveBackendParams.getJwt();
                    bVar2.L$0 = this;
                    bVar2.L$1 = aVar2;
                    bVar2.label = 1;
                    obj = cVar2.createSubscription(appId, aliasLabel, aliasValue, hVar, jwt, bVar2);
                    if (obj != aVar3) {
                        nVar2 = this;
                    }
                    return aVar3;
                } catch (C5040a e12) {
                    e = e12;
                    nVar = this;
                }
                c5089g = (C5089g) obj;
                if (c5089g != null) {
                    return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                }
                str = (String) c5089g.f41332n;
                C4926b c4926b = (C4926b) c5089g.f41333u;
                if (c4926b != null) {
                    s4.c cVar3 = nVar2._consistencyManager;
                    String onesignalId = aVar2.getOnesignalId();
                    EnumC4958a enumC4958a = EnumC4958a.SUBSCRIPTION;
                    bVar2.L$0 = nVar2;
                    bVar2.L$1 = aVar2;
                    bVar2.L$2 = str;
                    bVar2.label = 2;
                    if (cVar3.setRywData(onesignalId, enumC4958a, c4926b, bVar2) == aVar3) {
                        return aVar3;
                    }
                    nVar = nVar2;
                } else {
                    s4.c cVar4 = nVar2._consistencyManager;
                    bVar2.L$0 = nVar2;
                    bVar2.L$1 = aVar2;
                    bVar2.L$2 = str;
                    bVar2.label = 3;
                }
                str2 = str;
                nVar3 = nVar;
                dVar = (Z5.d) nVar3._subscriptionModelStore.get(aVar2.getSubscriptionId());
                if (dVar != null) {
                }
                if (kotlin.jvm.internal.h.a(((com.onesignal.core.internal.config.b) nVar3._configModelStore.getModel()).getPushSubscriptionId(), aVar2.getSubscriptionId())) {
                }
                return new H4.a(H4.b.SUCCESS, t.Q(new C5089g(aVar2.getSubscriptionId(), str2)), null, null, 12, null);
            }
        }
        bVar = new b(interfaceC5267d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        A7.a aVar32 = A7.a.f58n;
        i = bVar22.label;
        if (i == 0) {
        }
        c5089g = (C5089g) obj2;
        if (c5089g != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteSubscription(V5.c cVar, InterfaceC5267d interfaceC5267d) {
        c cVar2;
        int i;
        C5040a c5040a;
        n nVar;
        int i6;
        if (interfaceC5267d instanceof c) {
            cVar2 = (c) interfaceC5267d;
            int i9 = cVar2.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cVar2.label = i9 - Integer.MIN_VALUE;
                Object obj = cVar2.result;
                A7.a aVar = A7.a.f58n;
                i = cVar2.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(cVar, this._jwtTokenStore, this._identityVerificationService);
                    try {
                        Q5.c cVar3 = this._subscriptionBackend;
                        String appId = cVar.getAppId();
                        String subscriptionId = cVar.getSubscriptionId();
                        cVar2.L$0 = this;
                        cVar2.L$1 = cVar;
                        cVar2.label = 1;
                        if (cVar3.deleteSubscription(appId, subscriptionId, resolveJwt, cVar2) == aVar) {
                            return aVar;
                        }
                        nVar = this;
                    } catch (C5040a e9) {
                        c5040a = e9;
                        nVar = this;
                        i6 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(c5040a.getStatusCode()).ordinal()];
                        if (i6 != 1) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (V5.c) cVar2.L$1;
                    nVar = (n) cVar2.L$0;
                    try {
                        com.bumptech.glide.d.k(obj);
                    } catch (C5040a e10) {
                        c5040a = e10;
                        i6 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(c5040a.getStatusCode()).ordinal()];
                        if (i6 != 1) {
                            return new H4.a(H4.b.FAIL_RETRY, null, null, c5040a.getRetryAfterSeconds(), 6, null);
                        }
                        if (i6 == 4) {
                            return new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, c5040a.getRetryAfterSeconds(), 6, null);
                        }
                        if (i6 != 5) {
                            return new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (c5040a.getStatusCode() == 404) {
                            List v9 = AbstractC5130k.v(cVar.getOnesignalId(), cVar.getSubscriptionId());
                            if (!v9.isEmpty()) {
                                Iterator it = v9.iterator();
                                while (it.hasNext()) {
                                    if (nVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                        return new H4.a(H4.b.FAIL_RETRY, null, null, c5040a.getRetryAfterSeconds(), 6, null);
                                    }
                                }
                            }
                        }
                        return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                    }
                }
                nVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
                return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
            }
        }
        cVar2 = new c(interfaceC5267d);
        Object obj2 = cVar2.result;
        A7.a aVar2 = A7.a.f58n;
        i = cVar2.label;
        if (i != 0) {
        }
        nVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
        return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transferSubscription(V5.p pVar, InterfaceC5267d interfaceC5267d) {
        d dVar;
        int i;
        try {
            if (interfaceC5267d instanceof d) {
                dVar = (d) interfaceC5267d;
                int i6 = dVar.label;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    dVar.label = i6 - Integer.MIN_VALUE;
                    d dVar2 = dVar;
                    Object obj = dVar2.result;
                    A7.a aVar = A7.a.f58n;
                    i = dVar2.label;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj);
                        f resolveBackendParams = com.onesignal.user.internal.operations.impl.executors.c.resolveBackendParams(pVar, pVar.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        Q5.c cVar = this._subscriptionBackend;
                        String appId = pVar.getAppId();
                        String subscriptionId = pVar.getSubscriptionId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        dVar2.label = 1;
                        if (cVar.transferSubscription(appId, subscriptionId, aliasLabel, aliasValue, jwt, dVar2) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.d.k(obj);
                    }
                    return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i != 0) {
            }
            return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
        } catch (C5040a e9) {
            int i9 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e9.getStatusCode()).ordinal()];
            return i9 != 1 ? i9 != 4 ? new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null) : new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, e9.getRetryAfterSeconds(), 6, null) : new H4.a(H4.b.FAIL_RETRY, null, null, e9.getRetryAfterSeconds(), 6, null);
        }
        dVar = new d(interfaceC5267d);
        d dVar22 = dVar;
        Object obj2 = dVar22.result;
        A7.a aVar2 = A7.a.f58n;
        i = dVar22.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateExistingSubscriptionFromCreate(V5.a aVar, List<? extends H4.g> list, InterfaceC5267d interfaceC5267d) {
        H4.g gVar;
        String address;
        Z5.f status;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((H4.g) it.next()) instanceof V5.c) {
                    return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                }
            }
        }
        ListIterator<? extends H4.g> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                gVar = null;
                break;
            }
            gVar = listIterator.previous();
            if (gVar instanceof V5.q) {
                break;
            }
        }
        V5.q qVar = (V5.q) gVar;
        String appId = aVar.getAppId();
        String onesignalId = aVar.getOnesignalId();
        String externalId = aVar.getExternalId();
        String subscriptionId = aVar.getSubscriptionId();
        Z5.g type = aVar.getType();
        boolean enabled = qVar != null ? qVar.getEnabled() : aVar.getEnabled();
        if (qVar == null || (address = qVar.getAddress()) == null) {
            address = aVar.getAddress();
        }
        String str = address;
        if (qVar == null || (status = qVar.getStatus()) == null) {
            status = aVar.getStatus();
        }
        V5.q qVar2 = new V5.q(appId, onesignalId, externalId, subscriptionId, type, enabled, str, status);
        return updateSubscription(qVar2, d6.c.k(qVar2), interfaceC5267d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(3:(5:(1:(1:12)(2:54|55))(1:56)|13|14|15|16)(4:57|58|59|60)|20|(2:22|(2:24|(2:26|27)(8:28|(2:30|(3:32|(3:35|(3:37|38|39)(1:40)|33)|41))|42|(1:44)|45|(1:47)|48|49))(2:50|51))(2:52|53))(5:76|77|78|(1:80)|67)|61|62|(4:64|(2:66|67)|15|16)(1:68)))|84|6|7|(0)(0)|61|62|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012c, code lost:
    
        if (r0.resolveConditionsWithID(q4.C4925a.ID, r8) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101 A[Catch: a -> 0x0118, TryCatch #3 {a -> 0x0118, blocks: (B:62:0x00fc, B:64:0x0101, B:68:0x011c), top: B:61:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c A[Catch: a -> 0x0118, TRY_LEAVE, TryCatch #3 {a -> 0x0118, blocks: (B:62:0x00fc, B:64:0x0101, B:68:0x011c), top: B:61:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSubscription(V5.q qVar, List<? extends H4.g> list, InterfaceC5267d interfaceC5267d) {
        e eVar;
        int i;
        V5.q qVar2;
        n nVar;
        V5.q qVar3;
        Object updateSubscription;
        n nVar2;
        V5.q qVar4;
        C4926b c4926b;
        int i6;
        if (interfaceC5267d instanceof e) {
            eVar = (e) interfaceC5267d;
            int i9 = eVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                eVar.label = i9 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.result;
                A7.a aVar = A7.a.f58n;
                i = eVar2.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            qVar4 = (V5.q) eVar2.L$1;
                            nVar = (n) eVar2.L$0;
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            qVar4 = (V5.q) eVar2.L$1;
                            nVar = (n) eVar2.L$0;
                        }
                        try {
                            com.bumptech.glide.d.k(obj);
                            return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                        } catch (C5040a e9) {
                            e = e9;
                        }
                    } else {
                        V5.q qVar5 = (V5.q) eVar2.L$2;
                        V5.q qVar6 = (V5.q) eVar2.L$1;
                        nVar2 = (n) eVar2.L$0;
                        try {
                            com.bumptech.glide.d.k(obj);
                            qVar2 = qVar5;
                            updateSubscription = obj;
                            qVar3 = qVar6;
                        } catch (C5040a e10) {
                            e = e10;
                            qVar4 = qVar5;
                            nVar = nVar2;
                        }
                    }
                    i6 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i6 == 1) {
                        return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i6 == 4) {
                        return new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i6 != 5) {
                        return new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (e.getStatusCode() == 404) {
                        List v9 = AbstractC5130k.v(qVar4.getOnesignalId(), qVar4.getSubscriptionId());
                        if (!v9.isEmpty()) {
                            Iterator it = v9.iterator();
                            while (it.hasNext()) {
                                if (nVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                    return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                }
                            }
                        }
                    }
                    String createLocalId = com.onesignal.common.d.INSTANCE.createLocalId();
                    String subscriptionId = qVar4.getSubscriptionId();
                    Z5.d dVar = (Z5.d) nVar._subscriptionModelStore.get(subscriptionId);
                    if (dVar != null) {
                        com.onesignal.common.modeling.i.setStringProperty$default(dVar, "id", createLocalId, "HYDRATE", false, 8, null);
                    }
                    if (kotlin.jvm.internal.h.a(((com.onesignal.core.internal.config.b) nVar._configModelStore.getModel()).getPushSubscriptionId(), subscriptionId)) {
                        ((com.onesignal.core.internal.config.b) nVar._configModelStore.getModel()).setPushSubscriptionId(createLocalId);
                    }
                    return new H4.a(H4.b.FAIL_NORETRY, null, d6.c.k(new V5.a(qVar4.getAppId(), qVar4.getOnesignalId(), qVar4.getExternalId(), createLocalId, qVar4.getType(), qVar4.getEnabled(), qVar4.getAddress(), qVar4.getStatus())), null, 10, null);
                }
                com.bumptech.glide.d.k(obj);
                Object F8 = AbstractC5129j.F(list);
                kotlin.jvm.internal.h.c(F8, "null cannot be cast to non-null type com.onesignal.user.internal.operations.UpdateSubscriptionOperation");
                qVar2 = (V5.q) F8;
                try {
                    Q5.j convert = convert(qVar2.getType());
                    String address = qVar2.getAddress();
                    Boolean valueOf = Boolean.valueOf(qVar2.getEnabled());
                    Integer num = new Integer(qVar2.getStatus().getValue());
                    String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
                    String str = Build.MODEL;
                    String str2 = Build.VERSION.RELEASE;
                    Boolean valueOf2 = Boolean.valueOf(com.onesignal.common.k.INSTANCE.isRooted());
                    com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
                    Q5.h hVar = new Q5.h(null, convert, address, valueOf, num, sdkVersion, str, str2, valueOf2, cVar.getNetType(this._applicationService.getAppContext()), cVar.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(qVar2, this._jwtTokenStore, this._identityVerificationService);
                    Q5.c cVar2 = this._subscriptionBackend;
                    String appId = qVar2.getAppId();
                    String subscriptionId2 = qVar2.getSubscriptionId();
                    eVar2.L$0 = this;
                    qVar3 = qVar;
                    eVar2.L$1 = qVar3;
                    eVar2.L$2 = qVar2;
                    eVar2.label = 1;
                    updateSubscription = cVar2.updateSubscription(appId, subscriptionId2, hVar, resolveJwt, eVar2);
                    if (updateSubscription != aVar) {
                        nVar2 = this;
                    }
                    return aVar;
                } catch (C5040a e11) {
                    e = e11;
                    nVar = this;
                    qVar4 = qVar2;
                    i6 = o.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i6 == 1) {
                    }
                }
                c4926b = (C4926b) updateSubscription;
                if (c4926b == null) {
                    s4.c cVar3 = nVar2._consistencyManager;
                    String onesignalId = qVar3.getOnesignalId();
                    EnumC4958a enumC4958a = EnumC4958a.SUBSCRIPTION;
                    eVar2.L$0 = nVar2;
                    eVar2.L$1 = qVar2;
                    eVar2.L$2 = null;
                    eVar2.label = 2;
                    if (cVar3.setRywData(onesignalId, enumC4958a, c4926b, eVar2) == aVar) {
                        return aVar;
                    }
                    return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                }
                s4.c cVar4 = nVar2._consistencyManager;
                eVar2.L$0 = nVar2;
                eVar2.L$1 = qVar2;
                eVar2.L$2 = null;
                eVar2.label = 3;
            }
        }
        eVar = new e(interfaceC5267d);
        e eVar22 = eVar;
        Object obj2 = eVar22.result;
        A7.a aVar2 = A7.a.f58n;
        i = eVar22.label;
        if (i == 0) {
        }
        c4926b = (C4926b) updateSubscription;
        if (c4926b == null) {
        }
    }

    @Override // H4.d
    public Object execute(List<? extends H4.g> list, InterfaceC5267d interfaceC5267d) {
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        H4.g gVar = (H4.g) AbstractC5129j.A(list);
        if (gVar instanceof V5.a) {
            V5.a aVar = (V5.a) gVar;
            return !com.onesignal.common.d.INSTANCE.isLocalId(aVar.getSubscriptionId()) ? updateExistingSubscriptionFromCreate(aVar, list, interfaceC5267d) : createSubscription(aVar, list, interfaceC5267d);
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((H4.g) it.next()) instanceof V5.c) {
                    if (list.size() > 1) {
                        throw new Exception("Only supports one operation! Attempted operations:\n" + list);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof V5.c) {
                            arrayList.add(obj);
                        }
                    }
                    return deleteSubscription((V5.c) AbstractC5129j.A(arrayList), interfaceC5267d);
                }
            }
        }
        if (gVar instanceof V5.q) {
            return updateSubscription((V5.q) gVar, list, interfaceC5267d);
        }
        if (!(gVar instanceof V5.p)) {
            throw new Exception("Unrecognized operation: " + gVar);
        }
        if (list.size() <= 1) {
            return transferSubscription((V5.p) gVar, interfaceC5267d);
        }
        throw new Exception("TransferSubscriptionOperation only supports one operation! Attempted operations:\n" + list);
    }

    @Override // H4.d
    public List<String> getOperations() {
        return AbstractC5130k.v(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
    }
}
