package com.onesignal.user.internal.operations.impl.executors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ob.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements z8.d {
    public static final a Companion = new a(null);
    public static final String REFRESH_USER = "refresh-user";
    private final hb.a _buildUserService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final jb.b _identityModelStore;
    private final mb.a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final ob.e _subscriptionsModelStore;
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
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h.this.getUser(null, this);
        }
    }

    public h(gb.d dVar, jb.b bVar, com.onesignal.user.internal.properties.b bVar2, ob.e eVar, com.onesignal.core.internal.config.b bVar3, hb.a aVar, mb.a aVar2) {
        pc.j.e(dVar, "_userBackend");
        pc.j.e(bVar, "_identityModelStore");
        pc.j.e(bVar2, "_propertiesModelStore");
        pc.j.e(eVar, "_subscriptionsModelStore");
        pc.j.e(bVar3, "_configModelStore");
        pc.j.e(aVar, "_buildUserService");
        pc.j.e(aVar2, "_newRecordState");
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[Catch: a -> 0x0034, TryCatch #1 {a -> 0x0034, blocks: (B:11:0x0030, B:12:0x0061, B:14:0x0079, B:17:0x0087, B:18:0x0098, B:20:0x009e, B:22:0x00b0, B:24:0x00c6, B:25:0x00d1, B:27:0x00db, B:28:0x00e6, B:30:0x00f0, B:31:0x0100, B:33:0x0106, B:36:0x0112, B:41:0x0125, B:43:0x012f, B:44:0x013a, B:45:0x0147, B:47:0x014d, B:51:0x016b, B:53:0x0176, B:54:0x0181, B:56:0x0187, B:57:0x0189, B:60:0x019f, B:61:0x01a7, B:63:0x01b2, B:66:0x01bd, B:69:0x01c7, B:72:0x01d1, B:75:0x01db, B:78:0x01e6, B:81:0x01f1, B:87:0x01a2, B:88:0x01a5, B:89:0x017b, B:91:0x01f6, B:93:0x0204, B:95:0x020e, B:96:0x0211), top: B:10:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[Catch: a -> 0x0034, TryCatch #1 {a -> 0x0034, blocks: (B:11:0x0030, B:12:0x0061, B:14:0x0079, B:17:0x0087, B:18:0x0098, B:20:0x009e, B:22:0x00b0, B:24:0x00c6, B:25:0x00d1, B:27:0x00db, B:28:0x00e6, B:30:0x00f0, B:31:0x0100, B:33:0x0106, B:36:0x0112, B:41:0x0125, B:43:0x012f, B:44:0x013a, B:45:0x0147, B:47:0x014d, B:51:0x016b, B:53:0x0176, B:54:0x0181, B:56:0x0187, B:57:0x0189, B:60:0x019f, B:61:0x01a7, B:63:0x01b2, B:66:0x01bd, B:69:0x01c7, B:72:0x01d1, B:75:0x01db, B:78:0x01e6, B:81:0x01f1, B:87:0x01a2, B:88:0x01a5, B:89:0x017b, B:91:0x01f6, B:93:0x0204, B:95:0x020e, B:96:0x0211), top: B:10:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUser(kb.h hVar, fc.d dVar) {
        b bVar;
        int i10;
        kb.h hVar2;
        h hVar3;
        kb.h hVar4;
        gb.d dVar2;
        String appId;
        String onesignalId;
        int i11;
        ob.d dVar3;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                i10 = bVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    try {
                        dVar2 = this._userBackend;
                        appId = hVar.getAppId();
                        onesignalId = hVar.getOnesignalId();
                        bVar.L$0 = this;
                        hVar2 = hVar;
                    } catch (l8.a e10) {
                        e = e10;
                        hVar2 = hVar;
                    }
                    try {
                        bVar.L$1 = hVar2;
                        bVar.label = 1;
                        obj = dVar2.getUser(appId, "onesignal_id", onesignalId, bVar);
                        gc.a aVar = gc.a.f2559g;
                        if (obj == aVar) {
                            return aVar;
                        }
                        hVar3 = this;
                        hVar4 = hVar2;
                    } catch (l8.a e11) {
                        e = e11;
                        hVar3 = this;
                        hVar4 = hVar2;
                        i11 = i.$EnumSwitchMapping$1[com.onesignal.common.h.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i11 != 1) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar4 = (kb.h) bVar.L$1;
                    hVar3 = (h) bVar.L$0;
                    try {
                        v6.a.W(obj);
                    } catch (l8.a e12) {
                        e = e12;
                        i11 = i.$EnumSwitchMapping$1[com.onesignal.common.h.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i11 != 1) {
                            return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i11 == 2) {
                            return new z8.a(z8.b.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i11 != 3) {
                            return new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404 && hVar3._newRecordState.isInMissingRetryWindow(hVar4.getOnesignalId())) {
                            return new z8.a(z8.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        List<z8.g> rebuildOperationsIfCurrentUser = hVar3._buildUserService.getRebuildOperationsIfCurrentUser(hVar4.getAppId(), hVar4.getOnesignalId());
                        return rebuildOperationsIfCurrentUser == null ? new z8.a(z8.b.FAIL_NORETRY, null, null, null, 14, null) : new z8.a(z8.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                }
                gb.a aVar2 = (gb.a) obj;
                if (pc.j.a(hVar4.getOnesignalId(), ((jb.a) hVar3._identityModelStore.getModel()).getOnesignalId())) {
                    return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
                }
                jb.a aVar3 = new jb.a();
                for (Map.Entry<String, String> entry : aVar2.getIdentities().entrySet()) {
                    aVar3.put((jb.a) entry.getKey(), entry.getValue());
                }
                com.onesignal.user.internal.properties.a aVar4 = new com.onesignal.user.internal.properties.a();
                aVar4.setOnesignalId(hVar4.getOnesignalId());
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
                            pc.j.b(value);
                            tags.put((com.onesignal.common.modeling.h) key, value);
                        }
                    }
                }
                if (aVar2.getProperties().getTimezoneId() != null) {
                    aVar4.setTimezone(aVar2.getProperties().getTimezoneId());
                }
                ArrayList arrayList = new ArrayList();
                for (gb.h hVar5 : aVar2.getSubscriptions()) {
                    ob.d dVar4 = new ob.d();
                    String id2 = hVar5.getId();
                    pc.j.b(id2);
                    dVar4.setId(id2);
                    String token = hVar5.getToken();
                    String str = "";
                    if (token == null) {
                        token = "";
                    }
                    dVar4.setAddress(token);
                    f.a aVar5 = ob.f.Companion;
                    Integer notificationTypes = hVar5.getNotificationTypes();
                    ob.f fromInt = aVar5.fromInt(notificationTypes != null ? notificationTypes.intValue() : ob.f.SUBSCRIBED.getValue());
                    if (fromInt == null) {
                        fromInt = ob.f.SUBSCRIBED;
                    }
                    dVar4.setStatus(fromInt);
                    gb.j type = hVar5.getType();
                    pc.j.b(type);
                    int i13 = i.$EnumSwitchMapping$0[type.ordinal()];
                    dVar4.setType(i13 != 1 ? i13 != 2 ? ob.g.PUSH : ob.g.SMS : ob.g.EMAIL);
                    dVar4.setOptedIn((dVar4.getStatus() == ob.f.UNSUBSCRIBE || dVar4.getStatus() == ob.f.DISABLED_FROM_REST_API_DEFAULT_REASON) ? false : true);
                    String sdk = hVar5.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    dVar4.setSdk(sdk);
                    String deviceOS = hVar5.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    dVar4.setDeviceOS(deviceOS);
                    String carrier = hVar5.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    dVar4.setCarrier(carrier);
                    String appVersion = hVar5.getAppVersion();
                    if (appVersion != null) {
                        str = appVersion;
                    }
                    dVar4.setAppVersion(str);
                    if (dVar4.getType() != ob.g.PUSH) {
                        arrayList.add(dVar4);
                    }
                }
                String pushSubscriptionId = ((com.onesignal.core.internal.config.a) hVar3._configModelStore.getModel()).getPushSubscriptionId();
                if (pushSubscriptionId != null && (dVar3 = (ob.d) hVar3._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(dVar3);
                }
                hVar3._identityModelStore.replace(aVar3, "HYDRATE");
                hVar3._propertiesModelStore.replace(aVar4, "HYDRATE");
                hVar3._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new z8.a(z8.b.SUCCESS, null, null, null, 14, null);
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        i10 = bVar.label;
        if (i10 != 0) {
        }
        gb.a aVar22 = (gb.a) obj2;
        if (pc.j.a(hVar4.getOnesignalId(), ((jb.a) hVar3._identityModelStore.getModel()).getOnesignalId())) {
        }
    }

    @Override // z8.d
    public Object execute(List<? extends z8.g> list, fc.d dVar) {
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((z8.g) it.next()) instanceof kb.h)) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
            }
        }
        z8.g gVar = (z8.g) bc.m.T(list);
        if (gVar instanceof kb.h) {
            return getUser((kb.h) gVar, dVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // z8.d
    public List<String> getOperations() {
        return i7.b.z(REFRESH_USER);
    }
}
