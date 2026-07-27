package com.onesignal.user.internal;

import I7.p;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class d {
    private final com.onesignal.core.internal.config.b configModel;
    private final U5.b identityModelStore;
    private final com.onesignal.user.internal.jwt.c jwtTokenStore;
    private final Object lock;
    private final H4.f operationRepo;
    private final l userSwitcher;

    public static final class a {
        private final String appId;
        private final String existingOneSignalId;
        private final String externalId;
        private final String newIdentityOneSignalId;

        public a(String appId, String newIdentityOneSignalId, String externalId, String str) {
            kotlin.jvm.internal.h.e(appId, "appId");
            kotlin.jvm.internal.h.e(newIdentityOneSignalId, "newIdentityOneSignalId");
            kotlin.jvm.internal.h.e(externalId, "externalId");
            this.appId = appId;
            this.newIdentityOneSignalId = newIdentityOneSignalId;
            this.externalId = externalId;
            this.existingOneSignalId = str;
        }

        public static /* synthetic */ a copy$default(a aVar, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.appId;
            }
            if ((i & 2) != 0) {
                str2 = aVar.newIdentityOneSignalId;
            }
            if ((i & 4) != 0) {
                str3 = aVar.externalId;
            }
            if ((i & 8) != 0) {
                str4 = aVar.existingOneSignalId;
            }
            return aVar.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.appId;
        }

        public final String component2() {
            return this.newIdentityOneSignalId;
        }

        public final String component3() {
            return this.externalId;
        }

        public final String component4() {
            return this.existingOneSignalId;
        }

        public final a copy(String appId, String newIdentityOneSignalId, String externalId, String str) {
            kotlin.jvm.internal.h.e(appId, "appId");
            kotlin.jvm.internal.h.e(newIdentityOneSignalId, "newIdentityOneSignalId");
            kotlin.jvm.internal.h.e(externalId, "externalId");
            return new a(appId, newIdentityOneSignalId, externalId, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.h.a(this.appId, aVar.appId) && kotlin.jvm.internal.h.a(this.newIdentityOneSignalId, aVar.newIdentityOneSignalId) && kotlin.jvm.internal.h.a(this.externalId, aVar.externalId) && kotlin.jvm.internal.h.a(this.existingOneSignalId, aVar.existingOneSignalId);
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getExistingOneSignalId() {
            return this.existingOneSignalId;
        }

        public final String getExternalId() {
            return this.externalId;
        }

        public final String getNewIdentityOneSignalId() {
            return this.newIdentityOneSignalId;
        }

        public int hashCode() {
            int k9 = u1.h.k(u1.h.k(this.appId.hashCode() * 31, 31, this.newIdentityOneSignalId), 31, this.externalId);
            String str = this.existingOneSignalId;
            return k9 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LoginEnqueueContext(appId=" + this.appId + ", newIdentityOneSignalId=" + this.newIdentityOneSignalId + ", externalId=" + this.externalId + ", existingOneSignalId=" + this.existingOneSignalId + ')';
        }
    }

    public static final class b extends B7.c {
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.enqueueLogin$com_onesignal_core(null, this);
        }
    }

    public static final class c extends kotlin.jvm.internal.i implements p {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(2);
            this.$externalId = str;
        }

        @Override // I7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((U5.a) obj, (com.onesignal.user.internal.properties.a) obj2);
            return v.f41350a;
        }

        public final void invoke(U5.a identityModel, com.onesignal.user.internal.properties.a aVar) {
            kotlin.jvm.internal.h.e(identityModel, "identityModel");
            kotlin.jvm.internal.h.e(aVar, "<anonymous parameter 1>");
            identityModel.setExternalId(this.$externalId);
        }
    }

    public d(U5.b identityModelStore, l userSwitcher, H4.f operationRepo, com.onesignal.core.internal.config.b configModel, com.onesignal.user.internal.jwt.c jwtTokenStore, Object lock) {
        kotlin.jvm.internal.h.e(identityModelStore, "identityModelStore");
        kotlin.jvm.internal.h.e(userSwitcher, "userSwitcher");
        kotlin.jvm.internal.h.e(operationRepo, "operationRepo");
        kotlin.jvm.internal.h.e(configModel, "configModel");
        kotlin.jvm.internal.h.e(jwtTokenStore, "jwtTokenStore");
        kotlin.jvm.internal.h.e(lock, "lock");
        this.identityModelStore = identityModelStore;
        this.userSwitcher = userSwitcher;
        this.operationRepo = operationRepo;
        this.configModel = configModel;
        this.jwtTokenStore = jwtTokenStore;
        this.lock = lock;
    }

    public static /* synthetic */ a switchUser$com_onesignal_core$default(d dVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return dVar.switchUser$com_onesignal_core(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object enqueueLogin$com_onesignal_core(a aVar, InterfaceC5267d interfaceC5267d) {
        b bVar;
        Object obj;
        int i;
        if (interfaceC5267d instanceof b) {
            bVar = (b) interfaceC5267d;
            int i6 = bVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.label = i6 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                obj = bVar2.result;
                A7.a aVar2 = A7.a.f58n;
                i = bVar2.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    H4.f fVar = this.operationRepo;
                    V5.f fVar2 = new V5.f(aVar.getAppId(), aVar.getNewIdentityOneSignalId(), aVar.getExternalId(), aVar.getExistingOneSignalId());
                    bVar2.label = 1;
                    obj = H4.e.enqueueAndWait$default(fVar, fVar2, false, bVar2, 2, null);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("Could not login user", null, 2, null);
                }
                return v.f41350a;
            }
        }
        bVar = new b(interfaceC5267d);
        b bVar22 = bVar;
        obj = bVar22.result;
        A7.a aVar22 = A7.a.f58n;
        i = bVar22.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return v.f41350a;
    }

    public final a switchUser$com_onesignal_core(String externalId, String str) {
        kotlin.jvm.internal.h.e(externalId, "externalId");
        synchronized (this.lock) {
            String externalId2 = ((U5.a) this.identityModelStore.getModel()).getExternalId();
            String onesignalId = ((U5.a) this.identityModelStore.getModel()).getOnesignalId();
            if (kotlin.jvm.internal.h.a(externalId2, externalId)) {
                if (str != null) {
                    this.jwtTokenStore.putJwt(externalId, str);
                    this.operationRepo.forceExecuteOperations();
                }
                return null;
            }
            this.jwtTokenStore.putJwt(externalId, str);
            l.createAndSwitchToNewUser$default(this.userSwitcher, false, new c(externalId), 1, null);
            String onesignalId2 = ((U5.a) this.identityModelStore.getModel()).getOnesignalId();
            if (this.configModel.getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED || externalId2 != null) {
                onesignalId = null;
            }
            return new a(this.configModel.getAppId(), onesignalId2, externalId, onesignalId);
        }
    }
}
