package com.onesignal.user.internal.operations.impl.executors;

import Z5.f;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t4.C5041a;
import u7.C5081g;
import v7.AbstractC5119j;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class l implements H4.d {
    public static final a Companion = new a(null);
    public static final String REFRESH_USER = "refresh-user";
    private final R5.a _buildUserService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final U5.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final X5.a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final Z5.e _subscriptionsModelStore;
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
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getUser(null, this);
        }
    }

    public l(Q5.d _userBackend, U5.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, Z5.e _subscriptionsModelStore, com.onesignal.core.internal.config.c _configModelStore, R5.a _buildUserService, X5.a _newRecordState, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.h.e(_userBackend, "_userBackend");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.h.e(_subscriptionsModelStore, "_subscriptionsModelStore");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_buildUserService, "_buildUserService");
        kotlin.jvm.internal.h.e(_newRecordState, "_newRecordState");
        kotlin.jvm.internal.h.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.h.e(_identityVerificationService, "_identityVerificationService");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final V5.q buildPushSelfHealOperationForStuckSubscription(V5.h hVar, Q5.h hVar2, String str) {
        boolean z6;
        Z5.d dVar = (Z5.d) this._subscriptionsModelStore.get(str);
        if (dVar != null && dVar.getType() == Z5.g.PUSH) {
            C5081g subscriptionEnabledAndStatus = W5.c.Companion.getSubscriptionEnabledAndStatus(dVar);
            boolean booleanValue = ((Boolean) subscriptionEnabledAndStatus.f41052n).booleanValue();
            Z5.f fVar = (Z5.f) subscriptionEnabledAndStatus.f41053u;
            if (kotlin.jvm.internal.h.a(hVar2.getEnabled(), Boolean.TRUE)) {
                Integer notificationTypes = hVar2.getNotificationTypes();
                if ((notificationTypes != null ? notificationTypes.intValue() : 0) > 0) {
                    z6 = true;
                    if ((booleanValue || z6) ? false : true) {
                        StringBuilder l9 = Wv.l("RefreshUserOperationExecutor: push subscription ", str, " diverged from server (server enabled=");
                        l9.append(hVar2.getEnabled());
                        l9.append(" notificationTypes=");
                        l9.append(hVar2.getNotificationTypes());
                        l9.append("; local opted-in and SUBSCRIBED). Enqueuing follow-up update-subscription op to re-assert local truth via PATCH /subscriptions/{id}.");
                        com.onesignal.debug.internal.logging.b.info$default(l9.toString(), null, 2, null);
                        return new V5.q(hVar.getAppId(), hVar.getOnesignalId(), ((U5.a) this._identityModelStore.getModel()).getExternalId(), str, dVar.getType(), booleanValue, dVar.getAddress(), fVar);
                    }
                }
            }
            z6 = false;
            if ((booleanValue || z6) ? false : true) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[Catch: a -> 0x003a, TryCatch #0 {a -> 0x003a, blocks: (B:12:0x0036, B:13:0x0074, B:15:0x008c, B:18:0x009d, B:19:0x00ae, B:21:0x00b4, B:23:0x00c6, B:25:0x00dc, B:26:0x00e7, B:28:0x00f1, B:29:0x00fc, B:31:0x0106, B:32:0x0116, B:34:0x011c, B:37:0x0128, B:42:0x013b, B:43:0x015e, B:45:0x0164, B:49:0x0183, B:51:0x018e, B:53:0x019c, B:55:0x01a2, B:56:0x01a4, B:59:0x01ba, B:60:0x01c2, B:62:0x01cd, B:65:0x01d8, B:68:0x01e3, B:71:0x01ee, B:74:0x01f9, B:77:0x0204, B:91:0x020f, B:80:0x0214, B:85:0x0220, B:94:0x01bd, B:95:0x01c0, B:96:0x0195, B:99:0x0228, B:101:0x0232, B:102:0x0235, B:104:0x0248, B:105:0x0251), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d A[Catch: a -> 0x003a, TryCatch #0 {a -> 0x003a, blocks: (B:12:0x0036, B:13:0x0074, B:15:0x008c, B:18:0x009d, B:19:0x00ae, B:21:0x00b4, B:23:0x00c6, B:25:0x00dc, B:26:0x00e7, B:28:0x00f1, B:29:0x00fc, B:31:0x0106, B:32:0x0116, B:34:0x011c, B:37:0x0128, B:42:0x013b, B:43:0x015e, B:45:0x0164, B:49:0x0183, B:51:0x018e, B:53:0x019c, B:55:0x01a2, B:56:0x01a4, B:59:0x01ba, B:60:0x01c2, B:62:0x01cd, B:65:0x01d8, B:68:0x01e3, B:71:0x01ee, B:74:0x01f9, B:77:0x0204, B:91:0x020f, B:80:0x0214, B:85:0x0220, B:94:0x01bd, B:95:0x01c0, B:96:0x0195, B:99:0x0228, B:101:0x0232, B:102:0x0235, B:104:0x0248, B:105:0x0251), top: B:11:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUser(V5.h hVar, InterfaceC5240d interfaceC5240d) {
        b bVar;
        int i;
        l lVar;
        int i4;
        Z5.d dVar;
        V5.h hVar2 = hVar;
        if (interfaceC5240d instanceof b) {
            bVar = (b) interfaceC5240d;
            int i6 = bVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.label = i6 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                A7.a aVar = A7.a.f215n;
                i = bVar2.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    f resolveBackendParams = c.resolveBackendParams(hVar2, hVar2.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                    try {
                        Q5.d dVar2 = this._userBackend;
                        String appId = hVar2.getAppId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        bVar2.L$0 = this;
                        bVar2.L$1 = hVar2;
                        bVar2.label = 1;
                        obj = dVar2.getUser(appId, aliasLabel, aliasValue, jwt, bVar2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        lVar = this;
                    } catch (C5041a e9) {
                        e = e9;
                        lVar = this;
                        i4 = m.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i4 != 1) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar2 = (V5.h) bVar2.L$1;
                    lVar = (l) bVar2.L$0;
                    try {
                        Q3.b.s(obj);
                    } catch (C5041a e10) {
                        e = e10;
                        i4 = m.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i4 != 1) {
                            return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i4 == 2) {
                            return new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i4 != 3) {
                            return new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404 && lVar._newRecordState.isInMissingRetryWindow(hVar2.getOnesignalId())) {
                            return new H4.a(H4.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        List<H4.g> rebuildOperationsIfCurrentUser = lVar._buildUserService.getRebuildOperationsIfCurrentUser(hVar2.getAppId(), hVar2.getOnesignalId());
                        return rebuildOperationsIfCurrentUser == null ? new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null) : new H4.a(H4.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                }
                Q5.a aVar2 = (Q5.a) obj;
                if (kotlin.jvm.internal.h.a(hVar2.getOnesignalId(), ((U5.a) lVar._identityModelStore.getModel()).getOnesignalId())) {
                    return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                }
                U5.a aVar3 = new U5.a();
                for (Map.Entry<String, String> entry : aVar2.getIdentities().entrySet()) {
                    aVar3.put((U5.a) entry.getKey(), entry.getValue());
                }
                com.onesignal.user.internal.properties.a aVar4 = new com.onesignal.user.internal.properties.a();
                aVar4.setOnesignalId(hVar2.getOnesignalId());
                if (aVar2.getProperties().getCountry() != null) {
                    aVar4.setCountry(aVar2.getProperties().getCountry());
                }
                if (aVar2.getProperties().getLanguage() != null) {
                    aVar4.setLanguage(aVar2.getProperties().getLanguage());
                }
                if (aVar2.getProperties().getTags() != null) {
                    for (Map.Entry<String, String> entry2 : aVar2.getProperties().getTags().entrySet()) {
                        if (entry2.getValue() != null) {
                            com.onesignal.common.modeling.h tags = aVar4.getTags();
                            String key = entry2.getKey();
                            String value = entry2.getValue();
                            kotlin.jvm.internal.h.b(value);
                            tags.put((com.onesignal.common.modeling.h) key, value);
                        }
                    }
                }
                aVar4.setTimezone(com.onesignal.common.l.INSTANCE.getTimeZoneId());
                String pushSubscriptionId = ((com.onesignal.core.internal.config.b) lVar._configModelStore.getModel()).getPushSubscriptionId();
                ArrayList arrayList = new ArrayList();
                V5.q qVar = null;
                for (Q5.h hVar3 : aVar2.getSubscriptions()) {
                    Z5.d dVar3 = new Z5.d();
                    String id = hVar3.getId();
                    kotlin.jvm.internal.h.b(id);
                    dVar3.setId(id);
                    String token = hVar3.getToken();
                    if (token == null) {
                        token = "";
                    }
                    dVar3.setAddress(token);
                    f.a aVar5 = Z5.f.Companion;
                    Integer notificationTypes = hVar3.getNotificationTypes();
                    Z5.f fromInt = aVar5.fromInt(notificationTypes != null ? notificationTypes.intValue() : Z5.f.SUBSCRIBED.getValue());
                    if (fromInt == null) {
                        fromInt = Z5.f.SUBSCRIBED;
                    }
                    dVar3.setStatus(fromInt);
                    Q5.j type = hVar3.getType();
                    kotlin.jvm.internal.h.b(type);
                    int i9 = m.$EnumSwitchMapping$0[type.ordinal()];
                    dVar3.setType(i9 != 1 ? i9 != 2 ? Z5.g.PUSH : Z5.g.SMS : Z5.g.EMAIL);
                    dVar3.setOptedIn((dVar3.getStatus() == Z5.f.UNSUBSCRIBE || dVar3.getStatus() == Z5.f.DISABLED_FROM_REST_API_DEFAULT_REASON) ? false : true);
                    String sdk = hVar3.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    dVar3.setSdk(sdk);
                    String deviceOS = hVar3.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    dVar3.setDeviceOS(deviceOS);
                    String carrier = hVar3.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    dVar3.setCarrier(carrier);
                    String appVersion = hVar3.getAppVersion();
                    if (appVersion == null) {
                        appVersion = "";
                    }
                    dVar3.setAppVersion(appVersion);
                    if (dVar3.getType() != Z5.g.PUSH) {
                        arrayList.add(dVar3);
                    } else if (kotlin.jvm.internal.h.a(hVar3.getId(), pushSubscriptionId) && qVar == null) {
                        qVar = lVar.buildPushSelfHealOperationForStuckSubscription(hVar2, hVar3, pushSubscriptionId);
                    }
                }
                if (pushSubscriptionId != null && (dVar = (Z5.d) lVar._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(dVar);
                }
                lVar._identityModelStore.replace(aVar3, "HYDRATE");
                lVar._propertiesModelStore.replace(aVar4, "HYDRATE");
                lVar._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new H4.a(H4.b.SUCCESS, null, qVar != null ? Z2.d.n(qVar) : null, null, 10, null);
            }
        }
        bVar = new b(interfaceC5240d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        A7.a aVar6 = A7.a.f215n;
        i = bVar22.label;
        if (i != 0) {
        }
        Q5.a aVar22 = (Q5.a) obj2;
        if (kotlin.jvm.internal.h.a(hVar2.getOnesignalId(), ((U5.a) lVar._identityModelStore.getModel()).getOnesignalId())) {
        }
    }

    @Override // H4.d
    public Object execute(List<? extends H4.g> list, InterfaceC5240d interfaceC5240d) {
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((H4.g) it.next()) instanceof V5.h)) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
            }
        }
        H4.g gVar = (H4.g) AbstractC5119j.y(list);
        if (gVar instanceof V5.h) {
            return getUser((V5.h) gVar, interfaceC5240d);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // H4.d
    public List<String> getOperations() {
        return Z2.d.n(REFRESH_USER);
    }
}
