package com.gamericefishpro.space.je;

import android.content.Context;
import android.os.Build;
import com.gamericefishpro.space.bd.e;
import com.gamericefishpro.space.bd.f;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.hc.d;
import com.gamericefishpro.space.pd.j;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.rg.c;
import com.gamericefishpro.space.ve.n;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.yb.g;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.CoreModule;
import com.onesignal.session.SessionModule;
import com.onesignal.user.UserModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.xb.a, com.gamericefishpro.space.hc.b {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private com.gamericefishpro.space.rc.a configModel;
    private boolean isInitialized;
    private final List<String> listOfModules;
    private f operationRepo;
    private final d services;
    private c sessionModel;
    private final String sdkVersion = g.INSTANCE.getSdkVersion();
    private final com.gamericefishpro.space.md.a debug = new com.gamericefishpro.space.nd.a();
    private final Object initLock = new Object();
    private final Object loginLock = new Object();

    /* JADX INFO: renamed from: com.gamericefishpro.space.je.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0027a extends l implements Function2 {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0027a(String str) {
            super(2);
            this.$externalId = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.gamericefishpro.space.bh.a) obj, (com.gamericefishpro.space.hh.a) obj2);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.bh.a identityModel, com.gamericefishpro.space.hh.a aVar) {
            Intrinsics.checkNotNullParameter(identityModel, "identityModel");
            Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 1>");
            identityModel.setExternalId(this.$externalId);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function1 {
        final /* synthetic */ a0 $currentIdentityExternalId;
        final /* synthetic */ a0 $currentIdentityOneSignalId;
        final /* synthetic */ String $externalId;
        final /* synthetic */ a0 $newIdentityOneSignalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var, String str, a0 a0Var2, a0 a0Var3, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$newIdentityOneSignalId = a0Var;
            this.$externalId = str;
            this.$currentIdentityExternalId = a0Var2;
            this.$currentIdentityOneSignalId = a0Var3;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return a.this.new b(this.$newIdentityOneSignalId, this.$externalId, this.$currentIdentityExternalId, this.$currentIdentityOneSignalId, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                f fVar = a.this.operationRepo;
                Intrinsics.b(fVar);
                com.gamericefishpro.space.rc.a aVar2 = a.this.configModel;
                Intrinsics.b(aVar2);
                com.gamericefishpro.space.dh.f fVar2 = new com.gamericefishpro.space.dh.f(aVar2.getAppId(), (String) this.$newIdentityOneSignalId.d, this.$externalId, this.$currentIdentityExternalId.d == null ? (String) this.$currentIdentityOneSignalId.d : null);
                this.label = 1;
                obj = e.enqueueAndWait$default(fVar, fVar2, false, this, 2, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "Could not login user");
            }
            return Unit.a;
        }
    }

    public a() throws IllegalAccessException, InstantiationException {
        List<String> listF = x.f("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = listF;
        com.gamericefishpro.space.hc.c cVar = new com.gamericefishpro.space.hc.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = listF.iterator();
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).newInstance();
                Intrinsics.c(objNewInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((com.gamericefishpro.space.gc.a) objNewInstance);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((com.gamericefishpro.space.gc.a) obj).register(cVar);
        }
        this.services = cVar.build();
    }

    private final void createAndSwitchToNewUser(boolean z, Function2<? super com.gamericefishpro.space.bh.a, ? super com.gamericefishpro.space.hh.a, Unit> function2) {
        Object next;
        String strCreateLocalId;
        String address;
        com.gamericefishpro.space.jh.f status;
        String id;
        com.gamericefishpro.space.rc.a aVar;
        com.gamericefishpro.space.od.b.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String strCreateLocalId2 = com.gamericefishpro.space.yb.c.INSTANCE.createLocalId();
        com.gamericefishpro.space.bh.a aVar2 = new com.gamericefishpro.space.bh.a();
        aVar2.setOnesignalId(strCreateLocalId2);
        com.gamericefishpro.space.hh.a aVar3 = new com.gamericefishpro.space.hh.a();
        aVar3.setOnesignalId(strCreateLocalId2);
        if (function2 != null) {
            function2.invoke(aVar2, aVar3);
        }
        ArrayList arrayList = new ArrayList();
        com.gamericefishpro.space.jh.e subscriptionModelStore = getSubscriptionModelStore();
        Intrinsics.b(subscriptionModelStore);
        Iterator<T> it = subscriptionModelStore.list().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            id = ((com.gamericefishpro.space.jh.d) next).getId();
            aVar = this.configModel;
            Intrinsics.b(aVar);
        } while (!Intrinsics.a(id, aVar.getPushSubscriptionId()));
        com.gamericefishpro.space.jh.d dVar = (com.gamericefishpro.space.jh.d) next;
        com.gamericefishpro.space.jh.d dVar2 = new com.gamericefishpro.space.jh.d();
        if (dVar == null || (strCreateLocalId = dVar.getId()) == null) {
            strCreateLocalId = com.gamericefishpro.space.yb.c.INSTANCE.createLocalId();
        }
        dVar2.setId(strCreateLocalId);
        dVar2.setType(com.gamericefishpro.space.jh.g.PUSH);
        dVar2.setOptedIn(dVar != null ? dVar.getOptedIn() : true);
        if (dVar == null || (address = dVar.getAddress()) == null) {
            address = "";
        }
        dVar2.setAddress(address);
        if (dVar == null || (status = dVar.getStatus()) == null) {
            status = com.gamericefishpro.space.jh.f.NO_PERMISSION;
        }
        dVar2.setStatus(status);
        dVar2.setSdk(g.INSTANCE.getSdkVersion());
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        dVar2.setDeviceOS(RELEASE);
        String carrierName = com.gamericefishpro.space.yb.b.INSTANCE.getCarrierName(((com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class)).getAppContext());
        if (carrierName == null) {
            carrierName = "";
        }
        dVar2.setCarrier(carrierName);
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(((com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class)).getAppContext());
        dVar2.setAppVersion(appVersion != null ? appVersion : "");
        com.gamericefishpro.space.rc.a aVar4 = this.configModel;
        Intrinsics.b(aVar4);
        aVar4.setPushSubscriptionId(dVar2.getId());
        arrayList.add(dVar2);
        com.gamericefishpro.space.jh.e subscriptionModelStore2 = getSubscriptionModelStore();
        Intrinsics.b(subscriptionModelStore2);
        subscriptionModelStore2.clear("NO_PROPOGATE");
        com.gamericefishpro.space.bh.b identityModelStore = getIdentityModelStore();
        Intrinsics.b(identityModelStore);
        com.gamericefishpro.space.fc.e.replace$default(identityModelStore, aVar2, null, 2, null);
        com.gamericefishpro.space.hh.b propertiesModelStore = getPropertiesModelStore();
        Intrinsics.b(propertiesModelStore);
        com.gamericefishpro.space.fc.e.replace$default(propertiesModelStore, aVar3, null, 2, null);
        if (z) {
            com.gamericefishpro.space.jh.e subscriptionModelStore3 = getSubscriptionModelStore();
            Intrinsics.b(subscriptionModelStore3);
            subscriptionModelStore3.replaceAll(arrayList, "NO_PROPOGATE");
        } else {
            com.gamericefishpro.space.jh.e subscriptionModelStore4 = getSubscriptionModelStore();
            Intrinsics.b(subscriptionModelStore4);
            com.gamericefishpro.space.fc.b.replaceAll$default(subscriptionModelStore4, arrayList, null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createAndSwitchToNewUser$default(a aVar, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        aVar.createAndSwitchToNewUser(z, function2);
    }

    private final com.gamericefishpro.space.bh.b getIdentityModelStore() {
        return (com.gamericefishpro.space.bh.b) this.services.getService(com.gamericefishpro.space.bh.b.class);
    }

    private final String getLegacyAppId() {
        return com.gamericefishpro.space.gd.a.getString$default(getPreferencesService(), "OneSignal", "GT_APP_ID", null, 4, null);
    }

    private final com.gamericefishpro.space.gd.b getPreferencesService() {
        return (com.gamericefishpro.space.gd.b) this.services.getService(com.gamericefishpro.space.gd.b.class);
    }

    private final com.gamericefishpro.space.hh.b getPropertiesModelStore() {
        return (com.gamericefishpro.space.hh.b) this.services.getService(com.gamericefishpro.space.hh.b.class);
    }

    private final com.gamericefishpro.space.jh.e getSubscriptionModelStore() {
        return (com.gamericefishpro.space.jh.e) this.services.getService(com.gamericefishpro.space.jh.e.class);
    }

    @Override // com.gamericefishpro.space.hc.b
    public <T> List<T> getAllServices(Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return this.services.getAllServices(c);
    }

    public boolean getConsentGiven() {
        Boolean consentGiven;
        com.gamericefishpro.space.rc.a aVar = this.configModel;
        return (aVar == null || (consentGiven = aVar.getConsentGiven()) == null) ? Intrinsics.a(this._consentGiven, Boolean.TRUE) : consentGiven.booleanValue();
    }

    public boolean getConsentRequired() {
        Boolean consentRequired;
        com.gamericefishpro.space.rc.a aVar = this.configModel;
        return (aVar == null || (consentRequired = aVar.getConsentRequired()) == null) ? Intrinsics.a(this._consentRequired, Boolean.TRUE) : consentRequired.booleanValue();
    }

    public com.gamericefishpro.space.md.a getDebug() {
        return this.debug;
    }

    public boolean getDisableGMSMissingPrompt() {
        com.gamericefishpro.space.rc.a aVar = this.configModel;
        return aVar != null ? aVar.getDisableGMSMissingPrompt() : Intrinsics.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    public j getInAppMessages() throws Exception {
        if (isInitialized()) {
            return (j) this.services.getService(j.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public com.gamericefishpro.space.ke.a getLocation() throws Exception {
        if (isInitialized()) {
            return (com.gamericefishpro.space.ke.a) this.services.getService(com.gamericefishpro.space.ke.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public n getNotifications() throws Exception {
        if (isInitialized()) {
            return (n) this.services.getService(n.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.gamericefishpro.space.hc.b
    public <T> T getService(Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return (T) this.services.getService(c);
    }

    @Override // com.gamericefishpro.space.hc.b
    public <T> T getServiceOrNull(Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return (T) this.services.getServiceOrNull(c);
    }

    public com.gamericefishpro.space.kg.a getSession() throws Exception {
        if (isInitialized()) {
            return (com.gamericefishpro.space.kg.a) this.services.getService(com.gamericefishpro.space.kg.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public com.gamericefishpro.space.tg.a getUser() throws Exception {
        if (isInitialized()) {
            return (com.gamericefishpro.space.tg.a) this.services.getService(com.gamericefishpro.space.tg.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // com.gamericefishpro.space.hc.b
    public <T> boolean hasService(Class<T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return this.services.hasService(c);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0192 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:11:0x0045, B:13:0x0050, B:16:0x0057, B:18:0x00ad, B:20:0x00ba, B:22:0x00c0, B:25:0x00c7, B:28:0x00db, B:30:0x00e8, B:33:0x00f8, B:34:0x0100, B:36:0x0104, B:37:0x0111, B:39:0x0115, B:40:0x0122, B:42:0x0126, B:43:0x0137, B:45:0x0143, B:48:0x0159, B:86:0x02f1, B:49:0x017b, B:51:0x0192, B:52:0x01db, B:54:0x01f9, B:59:0x0220, B:66:0x0232, B:69:0x023f, B:71:0x0244, B:75:0x0252, B:77:0x025b, B:80:0x0286, B:83:0x029f, B:85:0x02b9, B:76:0x0256, B:62:0x0229, B:57:0x021a), top: B:91:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01db A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:11:0x0045, B:13:0x0050, B:16:0x0057, B:18:0x00ad, B:20:0x00ba, B:22:0x00c0, B:25:0x00c7, B:28:0x00db, B:30:0x00e8, B:33:0x00f8, B:34:0x0100, B:36:0x0104, B:37:0x0111, B:39:0x0115, B:40:0x0122, B:42:0x0126, B:43:0x0137, B:45:0x0143, B:48:0x0159, B:86:0x02f1, B:49:0x017b, B:51:0x0192, B:52:0x01db, B:54:0x01f9, B:59:0x0220, B:66:0x0232, B:69:0x023f, B:71:0x0244, B:75:0x0252, B:77:0x025b, B:80:0x0286, B:83:0x029f, B:85:0x02b9, B:76:0x0256, B:62:0x0229, B:57:0x021a), top: B:91:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01f9 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:11:0x0045, B:13:0x0050, B:16:0x0057, B:18:0x00ad, B:20:0x00ba, B:22:0x00c0, B:25:0x00c7, B:28:0x00db, B:30:0x00e8, B:33:0x00f8, B:34:0x0100, B:36:0x0104, B:37:0x0111, B:39:0x0115, B:40:0x0122, B:42:0x0126, B:43:0x0137, B:45:0x0143, B:48:0x0159, B:86:0x02f1, B:49:0x017b, B:51:0x0192, B:52:0x01db, B:54:0x01f9, B:59:0x0220, B:66:0x0232, B:69:0x023f, B:71:0x0244, B:75:0x0252, B:77:0x025b, B:80:0x0286, B:83:0x029f, B:85:0x02b9, B:76:0x0256, B:62:0x0229, B:57:0x021a), top: B:91:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0231  */
    /* JADX WARN: Code duplicated, block: B:68:0x023d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0244 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:11:0x0045, B:13:0x0050, B:16:0x0057, B:18:0x00ad, B:20:0x00ba, B:22:0x00c0, B:25:0x00c7, B:28:0x00db, B:30:0x00e8, B:33:0x00f8, B:34:0x0100, B:36:0x0104, B:37:0x0111, B:39:0x0115, B:40:0x0122, B:42:0x0126, B:43:0x0137, B:45:0x0143, B:48:0x0159, B:86:0x02f1, B:49:0x017b, B:51:0x0192, B:52:0x01db, B:54:0x01f9, B:59:0x0220, B:66:0x0232, B:69:0x023f, B:71:0x0244, B:75:0x0252, B:77:0x025b, B:80:0x0286, B:83:0x029f, B:85:0x02b9, B:76:0x0256, B:62:0x0229, B:57:0x021a), top: B:91:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0250  */
    /* JADX WARN: Code duplicated, block: B:74:0x0251  */
    /* JADX WARN: Code duplicated, block: B:76:0x0256 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:11:0x0045, B:13:0x0050, B:16:0x0057, B:18:0x00ad, B:20:0x00ba, B:22:0x00c0, B:25:0x00c7, B:28:0x00db, B:30:0x00e8, B:33:0x00f8, B:34:0x0100, B:36:0x0104, B:37:0x0111, B:39:0x0115, B:40:0x0122, B:42:0x0126, B:43:0x0137, B:45:0x0143, B:48:0x0159, B:86:0x02f1, B:49:0x017b, B:51:0x0192, B:52:0x01db, B:54:0x01f9, B:59:0x0220, B:66:0x0232, B:69:0x023f, B:71:0x0244, B:75:0x0252, B:77:0x025b, B:80:0x0286, B:83:0x029f, B:85:0x02b9, B:76:0x0256, B:62:0x0229, B:57:0x021a), top: B:91:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0284  */
    /* JADX WARN: Code duplicated, block: B:82:0x029d  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b8  */
    @Override // com.gamericefishpro.space.xb.a
    public boolean initWithContext(Context context, String str) {
        boolean z;
        String string$default;
        String string$default2;
        boolean z2;
        Integer numSafeInt;
        com.gamericefishpro.space.jh.d dVar;
        com.gamericefishpro.space.jh.f fVar;
        boolean z3;
        String strSafeString;
        String carrierName;
        String appVersion;
        com.gamericefishpro.space.jh.f fVarFromInt;
        Intrinsics.checkNotNullParameter(context, "context");
        com.gamericefishpro.space.md.c cVar = com.gamericefishpro.space.md.c.DEBUG;
        com.gamericefishpro.space.od.b.log(cVar, "initWithContext(context: " + context + ", appId: " + str + ')');
        synchronized (this.initLock) {
            if (isInitialized()) {
                com.gamericefishpro.space.od.b.log(cVar, "initWithContext: SDK already initialized");
                return true;
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            if (!androidUtils.isAndroidUserUnlocked(context)) {
                com.gamericefishpro.space.od.b.warn$default("initWithContext called when device storage is locked, no user data is accessible!", null, 2, null);
                return false;
            }
            com.gamericefishpro.space.od.b.log(cVar, "initWithContext: SDK initializing");
            com.gamericefishpro.space.gd.c.INSTANCE.ensureNoObfuscatedPrefStore(context);
            com.gamericefishpro.space.lc.f fVar2 = (com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class);
            Intrinsics.c(fVar2, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((com.gamericefishpro.space.mc.a) fVar2).start(context);
            com.gamericefishpro.space.od.b.INSTANCE.setApplicationService(fVar2);
            this.configModel = (com.gamericefishpro.space.rc.a) ((com.gamericefishpro.space.rc.b) this.services.getService(com.gamericefishpro.space.rc.b.class)).getModel();
            this.sessionModel = (c) ((com.gamericefishpro.space.rg.d) this.services.getService(com.gamericefishpro.space.rg.d.class)).getModel();
            this.operationRepo = (f) this.services.getService(f.class);
            if (str == null) {
                com.gamericefishpro.space.rc.a aVar = this.configModel;
                Intrinsics.b(aVar);
                if (aVar.hasProperty("appId")) {
                    z = false;
                } else {
                    String legacyAppId = getLegacyAppId();
                    if (legacyAppId == null) {
                        com.gamericefishpro.space.od.b.warn$default("initWithContext called without providing appId, and no appId has been established!", null, 2, null);
                        return false;
                    }
                    com.gamericefishpro.space.od.b.debug$default("initWithContext: using cached legacy appId ".concat(legacyAppId), null, 2, null);
                    com.gamericefishpro.space.rc.a aVar2 = this.configModel;
                    Intrinsics.b(aVar2);
                    aVar2.setAppId(legacyAppId);
                    z = true;
                }
            } else {
                z = false;
            }
            if (str != null) {
                com.gamericefishpro.space.rc.a aVar3 = this.configModel;
                Intrinsics.b(aVar3);
                if (aVar3.hasProperty("appId")) {
                    com.gamericefishpro.space.rc.a aVar4 = this.configModel;
                    Intrinsics.b(aVar4);
                    if (!Intrinsics.a(aVar4.getAppId(), str)) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                com.gamericefishpro.space.rc.a aVar5 = this.configModel;
                Intrinsics.b(aVar5);
                aVar5.setAppId(str);
            }
            if (this._consentRequired != null) {
                com.gamericefishpro.space.rc.a aVar6 = this.configModel;
                Intrinsics.b(aVar6);
                Boolean bool = this._consentRequired;
                Intrinsics.b(bool);
                aVar6.setConsentRequired(bool);
            }
            if (this._consentGiven != null) {
                com.gamericefishpro.space.rc.a aVar7 = this.configModel;
                Intrinsics.b(aVar7);
                Boolean bool2 = this._consentGiven;
                Intrinsics.b(bool2);
                aVar7.setConsentGiven(bool2);
            }
            if (this._disableGMSMissingPrompt != null) {
                com.gamericefishpro.space.rc.a aVar8 = this.configModel;
                Intrinsics.b(aVar8);
                Boolean bool3 = this._disableGMSMissingPrompt;
                Intrinsics.b(bool3);
                aVar8.setDisableGMSMissingPrompt(bool3.booleanValue());
            }
            com.gamericefishpro.space.jd.c cVar2 = new com.gamericefishpro.space.jd.c(this.services);
            cVar2.bootstrap();
            if (z) {
                com.gamericefishpro.space.gd.b preferencesService = getPreferencesService();
                Intrinsics.b(preferencesService);
                string$default = com.gamericefishpro.space.gd.a.getString$default(preferencesService, "OneSignal", "GT_PLAYER_ID", null, 4, null);
                if (string$default == null) {
                    com.gamericefishpro.space.od.b.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
                    createAndSwitchToNewUser$default(this, false, null, 3, null);
                    f fVar3 = this.operationRepo;
                    Intrinsics.b(fVar3);
                    com.gamericefishpro.space.rc.a aVar9 = this.configModel;
                    Intrinsics.b(aVar9);
                    String appId = aVar9.getAppId();
                    com.gamericefishpro.space.bh.b identityModelStore = getIdentityModelStore();
                    Intrinsics.b(identityModelStore);
                    String onesignalId = ((com.gamericefishpro.space.bh.a) identityModelStore.getModel()).getOnesignalId();
                    com.gamericefishpro.space.bh.b identityModelStore2 = getIdentityModelStore();
                    Intrinsics.b(identityModelStore2);
                    e.enqueue$default(fVar3, new com.gamericefishpro.space.dh.f(appId, onesignalId, ((com.gamericefishpro.space.bh.a) identityModelStore2.getModel()).getExternalId(), null, 8, null), false, 2, null);
                } else {
                    com.gamericefishpro.space.od.b.debug$default("initWithContext: creating user linked to subscription ".concat(string$default), null, 2, null);
                    com.gamericefishpro.space.gd.b preferencesService2 = getPreferencesService();
                    Intrinsics.b(preferencesService2);
                    string$default2 = com.gamericefishpro.space.gd.a.getString$default(preferencesService2, "OneSignal", "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
                    if (string$default2 != null) {
                        JSONObject jSONObject = new JSONObject(string$default2);
                        numSafeInt = com.gamericefishpro.space.yb.d.safeInt(jSONObject, "notification_types");
                        dVar = new com.gamericefishpro.space.jh.d();
                        dVar.setId(string$default);
                        dVar.setType(com.gamericefishpro.space.jh.g.PUSH);
                        fVar = com.gamericefishpro.space.jh.f.NO_PERMISSION;
                        int value = fVar.getValue();
                        if (numSafeInt != null) {
                            z3 = false;
                            dVar.setOptedIn(z3);
                            strSafeString = com.gamericefishpro.space.yb.d.safeString(jSONObject, "identifier");
                            if (strSafeString == null) {
                                strSafeString = "";
                            }
                            dVar.setAddress(strSafeString);
                            if (numSafeInt != null) {
                                fVarFromInt = com.gamericefishpro.space.jh.f.Companion.fromInt(numSafeInt.intValue());
                                if (fVarFromInt == null) {
                                    fVar = fVarFromInt;
                                }
                                dVar.setStatus(fVar);
                            } else {
                                dVar.setStatus(com.gamericefishpro.space.jh.f.SUBSCRIBED);
                            }
                            dVar.setSdk(g.INSTANCE.getSdkVersion());
                            String RELEASE = Build.VERSION.RELEASE;
                            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                            dVar.setDeviceOS(RELEASE);
                            carrierName = com.gamericefishpro.space.yb.b.INSTANCE.getCarrierName(((com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            dVar.setCarrier(carrierName);
                            appVersion = androidUtils.getAppVersion(((com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            dVar.setAppVersion(appVersion);
                            com.gamericefishpro.space.rc.a aVar10 = this.configModel;
                            Intrinsics.b(aVar10);
                            aVar10.setPushSubscriptionId(string$default);
                            com.gamericefishpro.space.jh.e subscriptionModelStore = getSubscriptionModelStore();
                            Intrinsics.b(subscriptionModelStore);
                            subscriptionModelStore.add(dVar, "NO_PROPOGATE");
                            z2 = true;
                        }
                        int value2 = com.gamericefishpro.space.jh.f.UNSUBSCRIBE.getValue();
                        if (numSafeInt != null) {
                            z3 = false;
                            dVar.setOptedIn(z3);
                            strSafeString = com.gamericefishpro.space.yb.d.safeString(jSONObject, "identifier");
                            if (strSafeString == null) {
                                strSafeString = "";
                            }
                            dVar.setAddress(strSafeString);
                            if (numSafeInt != null) {
                                fVarFromInt = com.gamericefishpro.space.jh.f.Companion.fromInt(numSafeInt.intValue());
                                if (fVarFromInt == null) {
                                    fVar = fVarFromInt;
                                }
                                dVar.setStatus(fVar);
                            } else {
                                dVar.setStatus(com.gamericefishpro.space.jh.f.SUBSCRIBED);
                            }
                            dVar.setSdk(g.INSTANCE.getSdkVersion());
                            String RELEASE2 = Build.VERSION.RELEASE;
                            Intrinsics.checkNotNullExpressionValue(RELEASE2, "RELEASE");
                            dVar.setDeviceOS(RELEASE2);
                            carrierName = com.gamericefishpro.space.yb.b.INSTANCE.getCarrierName(((com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            dVar.setCarrier(carrierName);
                            appVersion = androidUtils.getAppVersion(((com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            dVar.setAppVersion(appVersion);
                            com.gamericefishpro.space.rc.a aVar11 = this.configModel;
                            Intrinsics.b(aVar11);
                            aVar11.setPushSubscriptionId(string$default);
                            com.gamericefishpro.space.jh.e subscriptionModelStore2 = getSubscriptionModelStore();
                            Intrinsics.b(subscriptionModelStore2);
                            subscriptionModelStore2.add(dVar, "NO_PROPOGATE");
                            z2 = true;
                        }
                        z3 = true;
                        dVar.setOptedIn(z3);
                        strSafeString = com.gamericefishpro.space.yb.d.safeString(jSONObject, "identifier");
                        if (strSafeString == null) {
                            strSafeString = "";
                        }
                        dVar.setAddress(strSafeString);
                        if (numSafeInt != null) {
                            fVarFromInt = com.gamericefishpro.space.jh.f.Companion.fromInt(numSafeInt.intValue());
                            if (fVarFromInt == null) {
                                fVar = fVarFromInt;
                            }
                            dVar.setStatus(fVar);
                        } else {
                            dVar.setStatus(com.gamericefishpro.space.jh.f.SUBSCRIBED);
                        }
                        dVar.setSdk(g.INSTANCE.getSdkVersion());
                        String RELEASE3 = Build.VERSION.RELEASE;
                        Intrinsics.checkNotNullExpressionValue(RELEASE3, "RELEASE");
                        dVar.setDeviceOS(RELEASE3);
                        carrierName = com.gamericefishpro.space.yb.b.INSTANCE.getCarrierName(((com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class)).getAppContext());
                        if (carrierName == null) {
                            carrierName = "";
                        }
                        dVar.setCarrier(carrierName);
                        appVersion = androidUtils.getAppVersion(((com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class)).getAppContext());
                        if (appVersion == null) {
                            appVersion = "";
                        }
                        dVar.setAppVersion(appVersion);
                        com.gamericefishpro.space.rc.a aVar12 = this.configModel;
                        Intrinsics.b(aVar12);
                        aVar12.setPushSubscriptionId(string$default);
                        com.gamericefishpro.space.jh.e subscriptionModelStore3 = getSubscriptionModelStore();
                        Intrinsics.b(subscriptionModelStore3);
                        subscriptionModelStore3.add(dVar, "NO_PROPOGATE");
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    createAndSwitchToNewUser$default(this, z2, null, 2, null);
                    f fVar4 = this.operationRepo;
                    Intrinsics.b(fVar4);
                    com.gamericefishpro.space.rc.a aVar13 = this.configModel;
                    Intrinsics.b(aVar13);
                    String appId2 = aVar13.getAppId();
                    com.gamericefishpro.space.bh.b identityModelStore3 = getIdentityModelStore();
                    Intrinsics.b(identityModelStore3);
                    e.enqueue$default(fVar4, new com.gamericefishpro.space.dh.e(appId2, ((com.gamericefishpro.space.bh.a) identityModelStore3.getModel()).getOnesignalId(), string$default), false, 2, null);
                    com.gamericefishpro.space.gd.b preferencesService3 = getPreferencesService();
                    Intrinsics.b(preferencesService3);
                    preferencesService3.saveString("OneSignal", "GT_PLAYER_ID", null);
                }
            } else {
                com.gamericefishpro.space.bh.b identityModelStore4 = getIdentityModelStore();
                Intrinsics.b(identityModelStore4);
                if (((com.gamericefishpro.space.bh.a) identityModelStore4.getModel()).hasProperty("onesignal_id")) {
                    StringBuilder sb = new StringBuilder("initWithContext: using cached user ");
                    com.gamericefishpro.space.bh.b identityModelStore5 = getIdentityModelStore();
                    Intrinsics.b(identityModelStore5);
                    sb.append(((com.gamericefishpro.space.bh.a) identityModelStore5.getModel()).getOnesignalId());
                    com.gamericefishpro.space.od.b.debug$default(sb.toString(), null, 2, null);
                } else {
                    com.gamericefishpro.space.gd.b preferencesService4 = getPreferencesService();
                    Intrinsics.b(preferencesService4);
                    string$default = com.gamericefishpro.space.gd.a.getString$default(preferencesService4, "OneSignal", "GT_PLAYER_ID", null, 4, null);
                    if (string$default == null) {
                        com.gamericefishpro.space.od.b.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
                        createAndSwitchToNewUser$default(this, false, null, 3, null);
                        f fVar5 = this.operationRepo;
                        Intrinsics.b(fVar5);
                        com.gamericefishpro.space.rc.a aVar14 = this.configModel;
                        Intrinsics.b(aVar14);
                        String appId3 = aVar14.getAppId();
                        com.gamericefishpro.space.bh.b identityModelStore6 = getIdentityModelStore();
                        Intrinsics.b(identityModelStore6);
                        String onesignalId2 = ((com.gamericefishpro.space.bh.a) identityModelStore6.getModel()).getOnesignalId();
                        com.gamericefishpro.space.bh.b identityModelStore7 = getIdentityModelStore();
                        Intrinsics.b(identityModelStore7);
                        e.enqueue$default(fVar5, new com.gamericefishpro.space.dh.f(appId3, onesignalId2, ((com.gamericefishpro.space.bh.a) identityModelStore7.getModel()).getExternalId(), null, 8, null), false, 2, null);
                    } else {
                        com.gamericefishpro.space.od.b.debug$default("initWithContext: creating user linked to subscription ".concat(string$default), null, 2, null);
                        com.gamericefishpro.space.gd.b preferencesService5 = getPreferencesService();
                        Intrinsics.b(preferencesService5);
                        string$default2 = com.gamericefishpro.space.gd.a.getString$default(preferencesService5, "OneSignal", "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
                        if (string$default2 != null) {
                            JSONObject jSONObject2 = new JSONObject(string$default2);
                            numSafeInt = com.gamericefishpro.space.yb.d.safeInt(jSONObject2, "notification_types");
                            dVar = new com.gamericefishpro.space.jh.d();
                            dVar.setId(string$default);
                            dVar.setType(com.gamericefishpro.space.jh.g.PUSH);
                            fVar = com.gamericefishpro.space.jh.f.NO_PERMISSION;
                            int value3 = fVar.getValue();
                            if (numSafeInt != null && numSafeInt.intValue() == value3) {
                                z3 = false;
                            } else {
                                int value4 = com.gamericefishpro.space.jh.f.UNSUBSCRIBE.getValue();
                                if (numSafeInt != null && numSafeInt.intValue() == value4) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            }
                            dVar.setOptedIn(z3);
                            strSafeString = com.gamericefishpro.space.yb.d.safeString(jSONObject2, "identifier");
                            if (strSafeString == null) {
                                strSafeString = "";
                            }
                            dVar.setAddress(strSafeString);
                            if (numSafeInt != null) {
                                fVarFromInt = com.gamericefishpro.space.jh.f.Companion.fromInt(numSafeInt.intValue());
                                if (fVarFromInt == null) {
                                    fVar = fVarFromInt;
                                }
                                dVar.setStatus(fVar);
                            } else {
                                dVar.setStatus(com.gamericefishpro.space.jh.f.SUBSCRIBED);
                            }
                            dVar.setSdk(g.INSTANCE.getSdkVersion());
                            String RELEASE4 = Build.VERSION.RELEASE;
                            Intrinsics.checkNotNullExpressionValue(RELEASE4, "RELEASE");
                            dVar.setDeviceOS(RELEASE4);
                            carrierName = com.gamericefishpro.space.yb.b.INSTANCE.getCarrierName(((com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            dVar.setCarrier(carrierName);
                            appVersion = androidUtils.getAppVersion(((com.gamericefishpro.space.lc.f) this.services.getService(com.gamericefishpro.space.lc.f.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            dVar.setAppVersion(appVersion);
                            com.gamericefishpro.space.rc.a aVar15 = this.configModel;
                            Intrinsics.b(aVar15);
                            aVar15.setPushSubscriptionId(string$default);
                            com.gamericefishpro.space.jh.e subscriptionModelStore4 = getSubscriptionModelStore();
                            Intrinsics.b(subscriptionModelStore4);
                            subscriptionModelStore4.add(dVar, "NO_PROPOGATE");
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        createAndSwitchToNewUser$default(this, z2, null, 2, null);
                        f fVar6 = this.operationRepo;
                        Intrinsics.b(fVar6);
                        com.gamericefishpro.space.rc.a aVar16 = this.configModel;
                        Intrinsics.b(aVar16);
                        String appId4 = aVar16.getAppId();
                        com.gamericefishpro.space.bh.b identityModelStore8 = getIdentityModelStore();
                        Intrinsics.b(identityModelStore8);
                        e.enqueue$default(fVar6, new com.gamericefishpro.space.dh.e(appId4, ((com.gamericefishpro.space.bh.a) identityModelStore8.getModel()).getOnesignalId(), string$default), false, 2, null);
                        com.gamericefishpro.space.gd.b preferencesService6 = getPreferencesService();
                        Intrinsics.b(preferencesService6);
                        preferencesService6.saveString("OneSignal", "GT_PLAYER_ID", null);
                    }
                }
            }
            cVar2.scheduleStart();
            setInitialized(true);
            return true;
        }
    }

    public boolean isInitialized() {
        return this.isInitialized;
    }

    @Override // com.gamericefishpro.space.xb.a
    public void login(String externalId) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        login(externalId, null);
    }

    public void logout() throws Exception {
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "logout()");
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before 'logout'");
        }
        synchronized (this.loginLock) {
            com.gamericefishpro.space.bh.b identityModelStore = getIdentityModelStore();
            Intrinsics.b(identityModelStore);
            if (((com.gamericefishpro.space.bh.a) identityModelStore.getModel()).getExternalId() == null) {
                return;
            }
            createAndSwitchToNewUser$default(this, false, null, 3, null);
            f fVar = this.operationRepo;
            Intrinsics.b(fVar);
            com.gamericefishpro.space.rc.a aVar = this.configModel;
            Intrinsics.b(aVar);
            String appId = aVar.getAppId();
            com.gamericefishpro.space.bh.b identityModelStore2 = getIdentityModelStore();
            Intrinsics.b(identityModelStore2);
            String onesignalId = ((com.gamericefishpro.space.bh.a) identityModelStore2.getModel()).getOnesignalId();
            com.gamericefishpro.space.bh.b identityModelStore3 = getIdentityModelStore();
            Intrinsics.b(identityModelStore3);
            e.enqueue$default(fVar, new com.gamericefishpro.space.dh.f(appId, onesignalId, ((com.gamericefishpro.space.bh.a) identityModelStore3.getModel()).getExternalId(), null, 8, null), false, 2, null);
            Unit unit = Unit.a;
        }
    }

    public void setConsentGiven(boolean z) {
        f fVar;
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z);
        com.gamericefishpro.space.rc.a aVar = this.configModel;
        if (aVar != null) {
            aVar.setConsentGiven(Boolean.valueOf(z));
        }
        if (Intrinsics.a(bool, Boolean.valueOf(z)) || !z || (fVar = this.operationRepo) == null) {
            return;
        }
        fVar.forceExecuteOperations();
    }

    public void setConsentRequired(boolean z) {
        this._consentRequired = Boolean.valueOf(z);
        com.gamericefishpro.space.rc.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setConsentRequired(Boolean.valueOf(z));
    }

    public void setDisableGMSMissingPrompt(boolean z) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z);
        com.gamericefishpro.space.rc.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setDisableGMSMissingPrompt(z);
    }

    public void setInitialized(boolean z) {
        this.isInitialized = z;
    }

    @Override // com.gamericefishpro.space.xb.a
    public void login(String externalId, String str) throws Exception {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "login(externalId: " + externalId + ", jwtBearerToken: " + str + ')');
        if (isInitialized()) {
            a0 a0Var = new a0();
            a0 a0Var2 = new a0();
            a0 a0Var3 = new a0();
            a0Var3.d = "";
            synchronized (this.loginLock) {
                com.gamericefishpro.space.bh.b identityModelStore = getIdentityModelStore();
                Intrinsics.b(identityModelStore);
                a0Var.d = ((com.gamericefishpro.space.bh.a) identityModelStore.getModel()).getExternalId();
                com.gamericefishpro.space.bh.b identityModelStore2 = getIdentityModelStore();
                Intrinsics.b(identityModelStore2);
                a0Var2.d = ((com.gamericefishpro.space.bh.a) identityModelStore2.getModel()).getOnesignalId();
                if (Intrinsics.a(a0Var.d, externalId)) {
                    return;
                }
                createAndSwitchToNewUser$default(this, false, new C0027a(externalId), 1, null);
                com.gamericefishpro.space.bh.b identityModelStore3 = getIdentityModelStore();
                Intrinsics.b(identityModelStore3);
                a0Var3.d = ((com.gamericefishpro.space.bh.a) identityModelStore3.getModel()).getOnesignalId();
                Unit unit = Unit.a;
                com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new b(a0Var3, externalId, a0Var, a0Var2, null), 1, null);
                return;
            }
        }
        throw new Exception("Must call 'initWithContext' before 'login'");
    }
}
