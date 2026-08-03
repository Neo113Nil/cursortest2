package com.onesignal.internal;

import ac.o;
import android.content.Context;
import android.os.Build;
import bc.n;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.i;
import com.onesignal.core.CoreModule;
import com.onesignal.session.SessionModule;
import com.onesignal.user.UserModule;
import eb.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n8.d;
import ob.g;
import oc.e;
import org.json.JSONObject;
import pc.j;
import pc.k;
import pc.s;
import z8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements h8.a, n8.b {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private com.onesignal.core.internal.config.a configModel;
    private boolean isInitialized;
    private final List<String> listOfModules;
    private f operationRepo;
    private final d services;
    private c sessionModel;
    private final String sdkVersion = i.SDK_VERSION;
    private final g9.a debug = new h9.a();
    private final Object initLock = new Object();
    private final Object loginLock = new Object();

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.internal.a$a, reason: collision with other inner class name */
    public static final class C0038a extends k implements e {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0038a(String str) {
            super(2);
            this.$externalId = str;
        }

        @Override // oc.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((jb.a) obj, (com.onesignal.user.internal.properties.a) obj2);
            return o.f277a;
        }

        public final void invoke(jb.a aVar, com.onesignal.user.internal.properties.a aVar2) {
            j.e(aVar, "identityModel");
            j.e(aVar2, "<anonymous parameter 1>");
            aVar.setExternalId(this.$externalId);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.j implements oc.c {
        final /* synthetic */ s $currentIdentityExternalId;
        final /* synthetic */ s $currentIdentityOneSignalId;
        final /* synthetic */ String $externalId;
        final /* synthetic */ s $newIdentityOneSignalId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar, String str, s sVar2, s sVar3, fc.d dVar) {
            super(1, dVar);
            this.$newIdentityOneSignalId = sVar;
            this.$externalId = str;
            this.$currentIdentityExternalId = sVar2;
            this.$currentIdentityOneSignalId = sVar3;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return a.this.new b(this.$newIdentityOneSignalId, this.$externalId, this.$currentIdentityExternalId, this.$currentIdentityOneSignalId, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((b) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                f fVar = a.this.operationRepo;
                j.b(fVar);
                com.onesignal.core.internal.config.a aVar = a.this.configModel;
                j.b(aVar);
                kb.f fVar2 = new kb.f(aVar.getAppId(), (String) this.$newIdentityOneSignalId.f5683g, this.$externalId, this.$currentIdentityExternalId.f5683g == null ? (String) this.$currentIdentityOneSignalId.f5683g : null);
                this.label = 1;
                obj = z8.e.enqueueAndWait$default(fVar, fVar2, false, this, 2, null);
                gc.a aVar2 = gc.a.f2559g;
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "Could not login user");
            }
            return o.f277a;
        }
    }

    public a() {
        List<String> L = n.L("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = L;
        n8.c cVar = new n8.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = L.iterator();
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(it.next()).newInstance();
                j.c(newInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((m8.a) newInstance);
            } catch (ClassNotFoundException e10) {
                e10.printStackTrace();
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m8.a) obj).register(cVar);
        }
        this.services = cVar.build();
    }

    private final void createAndSwitchToNewUser(boolean z10, e eVar) {
        Object obj;
        String str;
        String str2;
        ob.f fVar;
        com.onesignal.debug.internal.logging.b.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String createLocalId = com.onesignal.common.e.INSTANCE.createLocalId();
        jb.a aVar = new jb.a();
        aVar.setOnesignalId(createLocalId);
        com.onesignal.user.internal.properties.a aVar2 = new com.onesignal.user.internal.properties.a();
        aVar2.setOnesignalId(createLocalId);
        if (eVar != null) {
            eVar.invoke(aVar, aVar2);
        }
        ArrayList arrayList = new ArrayList();
        ob.e subscriptionModelStore = getSubscriptionModelStore();
        j.b(subscriptionModelStore);
        Iterator<T> it = subscriptionModelStore.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String id2 = ((ob.d) obj).getId();
            com.onesignal.core.internal.config.a aVar3 = this.configModel;
            j.b(aVar3);
            if (j.a(id2, aVar3.getPushSubscriptionId())) {
                break;
            }
        }
        ob.d dVar = (ob.d) obj;
        ob.d dVar2 = new ob.d();
        String createLocalId2 = com.onesignal.common.e.INSTANCE.createLocalId();
        if (dVar == null || (str = dVar.getId()) == null) {
            str = createLocalId2;
        }
        dVar2.setId(str);
        dVar2.setType(g.PUSH);
        dVar2.setOptedIn(dVar != null ? dVar.getOptedIn() : true);
        if (dVar == null || (str2 = dVar.getAddress()) == null) {
            str2 = "";
        }
        dVar2.setAddress(str2);
        if (dVar == null || (fVar = dVar.getStatus()) == null) {
            fVar = ob.f.NO_PERMISSION;
        }
        dVar2.setStatus(fVar);
        dVar2.setSdk(i.SDK_VERSION);
        String str3 = Build.VERSION.RELEASE;
        j.d(str3, "RELEASE");
        dVar2.setDeviceOS(str3);
        String carrierName = com.onesignal.common.d.INSTANCE.getCarrierName(((q8.f) this.services.getService(q8.f.class)).getAppContext());
        if (carrierName == null) {
            carrierName = "";
        }
        dVar2.setCarrier(carrierName);
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(((q8.f) this.services.getService(q8.f.class)).getAppContext());
        dVar2.setAppVersion(appVersion != null ? appVersion : "");
        ob.e subscriptionModelStore2 = getSubscriptionModelStore();
        j.b(subscriptionModelStore2);
        String str4 = "NO_PROPOGATE";
        subscriptionModelStore2.clear("NO_PROPOGATE");
        jb.b identityModelStore = getIdentityModelStore();
        j.b(identityModelStore);
        com.onesignal.common.modeling.e.replace$default(identityModelStore, aVar, null, 2, null);
        com.onesignal.user.internal.properties.b propertiesModelStore = getPropertiesModelStore();
        j.b(propertiesModelStore);
        com.onesignal.common.modeling.e.replace$default(propertiesModelStore, aVar2, null, 2, null);
        if (!z10) {
            if ((dVar != null ? dVar.getId() : null) == null || aVar.getExternalId() == null) {
                dVar2.setId(createLocalId2);
                str4 = "NORMAL";
            } else {
                f fVar2 = this.operationRepo;
                j.b(fVar2);
                com.onesignal.core.internal.config.a aVar4 = this.configModel;
                j.b(aVar4);
                z8.e.enqueue$default(fVar2, new kb.o(aVar4.getAppId(), dVar.getId(), createLocalId), false, 2, null);
            }
        }
        com.onesignal.core.internal.config.a aVar5 = this.configModel;
        j.b(aVar5);
        aVar5.setPushSubscriptionId(dVar2.getId());
        arrayList.add(dVar2);
        ob.e subscriptionModelStore3 = getSubscriptionModelStore();
        j.b(subscriptionModelStore3);
        subscriptionModelStore3.replaceAll(arrayList, str4);
    }

    public static /* synthetic */ void createAndSwitchToNewUser$default(a aVar, boolean z10, e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        aVar.createAndSwitchToNewUser(z10, eVar);
    }

    private final jb.b getIdentityModelStore() {
        return (jb.b) this.services.getService(jb.b.class);
    }

    private final String getLegacyAppId() {
        return c9.a.getString$default(getPreferencesService(), "OneSignal", "GT_APP_ID", null, 4, null);
    }

    private final c9.b getPreferencesService() {
        return (c9.b) this.services.getService(c9.b.class);
    }

    private final com.onesignal.user.internal.properties.b getPropertiesModelStore() {
        return (com.onesignal.user.internal.properties.b) this.services.getService(com.onesignal.user.internal.properties.b.class);
    }

    private final ob.e getSubscriptionModelStore() {
        return (ob.e) this.services.getService(ob.e.class);
    }

    @Override // n8.b
    public <T> List<T> getAllServices(Class<T> cls) {
        j.e(cls, "c");
        return this.services.getAllServices(cls);
    }

    public boolean getConsentGiven() {
        Boolean consentGiven;
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return (aVar == null || (consentGiven = aVar.getConsentGiven()) == null) ? j.a(this._consentGiven, Boolean.TRUE) : consentGiven.booleanValue();
    }

    public boolean getConsentRequired() {
        Boolean consentRequired;
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return (aVar == null || (consentRequired = aVar.getConsentRequired()) == null) ? j.a(this._consentRequired, Boolean.TRUE) : consentRequired.booleanValue();
    }

    public g9.a getDebug() {
        return this.debug;
    }

    public boolean getDisableGMSMissingPrompt() {
        com.onesignal.core.internal.config.a aVar = this.configModel;
        return aVar != null ? aVar.getDisableGMSMissingPrompt() : j.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    public i9.j getInAppMessages() {
        if (isInitialized()) {
            return (i9.j) this.services.getService(i9.j.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public u9.a getLocation() {
        if (isInitialized()) {
            return (u9.a) this.services.getService(u9.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public ca.n getNotifications() {
        if (isInitialized()) {
            return (ca.n) this.services.getService(ca.n.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // n8.b
    public <T> T getService(Class<T> cls) {
        j.e(cls, "c");
        return (T) this.services.getService(cls);
    }

    @Override // n8.b
    public <T> T getServiceOrNull(Class<T> cls) {
        j.e(cls, "c");
        return (T) this.services.getServiceOrNull(cls);
    }

    public za.a getSession() {
        if (isInitialized()) {
            return (za.a) this.services.getService(za.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    public fb.a getUser() {
        if (isInitialized()) {
            return (fb.a) this.services.getService(fb.a.class);
        }
        throw new Exception("Must call 'initWithContext' before use");
    }

    @Override // n8.b
    public <T> boolean hasService(Class<T> cls) {
        j.e(cls, "c");
        return this.services.hasService(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e6, code lost:
    
        if (pc.j.a(r10.getAppId(), r19) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0217, code lost:
    
        if (r3.intValue() != r12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021b, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0208, code lost:
    
        if (r3.intValue() != r12) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:10:0x0045, B:12:0x009e, B:14:0x00ab, B:16:0x00b1, B:19:0x00b8, B:21:0x00cc, B:23:0x00d9, B:25:0x00e9, B:27:0x00f1, B:29:0x00f5, B:30:0x0102, B:32:0x0106, B:33:0x0113, B:35:0x0117, B:36:0x0128, B:38:0x0134, B:41:0x014a, B:42:0x02d9, B:45:0x016c, B:47:0x0180, B:48:0x01c8, B:50:0x01e3, B:53:0x020a, B:57:0x021c, B:60:0x0229, B:62:0x022e, B:65:0x023c, B:66:0x0245, B:69:0x026c, B:72:0x0287, B:73:0x02a1, B:75:0x0240, B:76:0x0213, B:79:0x0204), top: B:3:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:10:0x0045, B:12:0x009e, B:14:0x00ab, B:16:0x00b1, B:19:0x00b8, B:21:0x00cc, B:23:0x00d9, B:25:0x00e9, B:27:0x00f1, B:29:0x00f5, B:30:0x0102, B:32:0x0106, B:33:0x0113, B:35:0x0117, B:36:0x0128, B:38:0x0134, B:41:0x014a, B:42:0x02d9, B:45:0x016c, B:47:0x0180, B:48:0x01c8, B:50:0x01e3, B:53:0x020a, B:57:0x021c, B:60:0x0229, B:62:0x022e, B:65:0x023c, B:66:0x0245, B:69:0x026c, B:72:0x0287, B:73:0x02a1, B:75:0x0240, B:76:0x0213, B:79:0x0204), top: B:3:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:10:0x0045, B:12:0x009e, B:14:0x00ab, B:16:0x00b1, B:19:0x00b8, B:21:0x00cc, B:23:0x00d9, B:25:0x00e9, B:27:0x00f1, B:29:0x00f5, B:30:0x0102, B:32:0x0106, B:33:0x0113, B:35:0x0117, B:36:0x0128, B:38:0x0134, B:41:0x014a, B:42:0x02d9, B:45:0x016c, B:47:0x0180, B:48:0x01c8, B:50:0x01e3, B:53:0x020a, B:57:0x021c, B:60:0x0229, B:62:0x022e, B:65:0x023c, B:66:0x0245, B:69:0x026c, B:72:0x0287, B:73:0x02a1, B:75:0x0240, B:76:0x0213, B:79:0x0204), top: B:3:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0117 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:10:0x0045, B:12:0x009e, B:14:0x00ab, B:16:0x00b1, B:19:0x00b8, B:21:0x00cc, B:23:0x00d9, B:25:0x00e9, B:27:0x00f1, B:29:0x00f5, B:30:0x0102, B:32:0x0106, B:33:0x0113, B:35:0x0117, B:36:0x0128, B:38:0x0134, B:41:0x014a, B:42:0x02d9, B:45:0x016c, B:47:0x0180, B:48:0x01c8, B:50:0x01e3, B:53:0x020a, B:57:0x021c, B:60:0x0229, B:62:0x022e, B:65:0x023c, B:66:0x0245, B:69:0x026c, B:72:0x0287, B:73:0x02a1, B:75:0x0240, B:76:0x0213, B:79:0x0204), top: B:3:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:10:0x0045, B:12:0x009e, B:14:0x00ab, B:16:0x00b1, B:19:0x00b8, B:21:0x00cc, B:23:0x00d9, B:25:0x00e9, B:27:0x00f1, B:29:0x00f5, B:30:0x0102, B:32:0x0106, B:33:0x0113, B:35:0x0117, B:36:0x0128, B:38:0x0134, B:41:0x014a, B:42:0x02d9, B:45:0x016c, B:47:0x0180, B:48:0x01c8, B:50:0x01e3, B:53:0x020a, B:57:0x021c, B:60:0x0229, B:62:0x022e, B:65:0x023c, B:66:0x0245, B:69:0x026c, B:72:0x0287, B:73:0x02a1, B:75:0x0240, B:76:0x0213, B:79:0x0204), top: B:3:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:10:0x0045, B:12:0x009e, B:14:0x00ab, B:16:0x00b1, B:19:0x00b8, B:21:0x00cc, B:23:0x00d9, B:25:0x00e9, B:27:0x00f1, B:29:0x00f5, B:30:0x0102, B:32:0x0106, B:33:0x0113, B:35:0x0117, B:36:0x0128, B:38:0x0134, B:41:0x014a, B:42:0x02d9, B:45:0x016c, B:47:0x0180, B:48:0x01c8, B:50:0x01e3, B:53:0x020a, B:57:0x021c, B:60:0x0229, B:62:0x022e, B:65:0x023c, B:66:0x0245, B:69:0x026c, B:72:0x0287, B:73:0x02a1, B:75:0x0240, B:76:0x0213, B:79:0x0204), top: B:3:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c8 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0034, B:6:0x003b, B:10:0x0045, B:12:0x009e, B:14:0x00ab, B:16:0x00b1, B:19:0x00b8, B:21:0x00cc, B:23:0x00d9, B:25:0x00e9, B:27:0x00f1, B:29:0x00f5, B:30:0x0102, B:32:0x0106, B:33:0x0113, B:35:0x0117, B:36:0x0128, B:38:0x0134, B:41:0x014a, B:42:0x02d9, B:45:0x016c, B:47:0x0180, B:48:0x01c8, B:50:0x01e3, B:53:0x020a, B:57:0x021c, B:60:0x0229, B:62:0x022e, B:65:0x023c, B:66:0x0245, B:69:0x026c, B:72:0x0287, B:73:0x02a1, B:75:0x0240, B:76:0x0213, B:79:0x0204), top: B:3:0x0034 }] */
    @Override // h8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean initWithContext(Context context, String str) {
        boolean z10;
        String string$default;
        boolean z11;
        j.e(context, "context");
        g9.c cVar = g9.c.DEBUG;
        com.onesignal.debug.internal.logging.b.log(cVar, "initWithContext(context: " + context + ", appId: " + str + ')');
        synchronized (this.initLock) {
            if (isInitialized()) {
                com.onesignal.debug.internal.logging.b.log(cVar, "initWithContext: SDK already initialized");
                return true;
            }
            com.onesignal.debug.internal.logging.b.log(cVar, "initWithContext: SDK initializing");
            c9.c.INSTANCE.ensureNoObfuscatedPrefStore(context);
            q8.f fVar = (q8.f) this.services.getService(q8.f.class);
            j.c(fVar, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((com.onesignal.core.internal.application.impl.a) fVar).start(context);
            com.onesignal.debug.internal.logging.b.INSTANCE.setApplicationService(fVar);
            this.configModel = (com.onesignal.core.internal.config.a) ((com.onesignal.core.internal.config.b) this.services.getService(com.onesignal.core.internal.config.b.class)).getModel();
            this.sessionModel = (c) ((eb.d) this.services.getService(eb.d.class)).getModel();
            this.operationRepo = (f) this.services.getService(f.class);
            if (str == null) {
                com.onesignal.core.internal.config.a aVar = this.configModel;
                j.b(aVar);
                if (!aVar.hasProperty("appId")) {
                    String legacyAppId = getLegacyAppId();
                    if (legacyAppId == null) {
                        com.onesignal.debug.internal.logging.b.warn$default("initWithContext called without providing appId, and no appId has been established!", null, 2, null);
                        return false;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("initWithContext: using cached legacy appId ".concat(legacyAppId), null, 2, null);
                    com.onesignal.core.internal.config.a aVar2 = this.configModel;
                    j.b(aVar2);
                    aVar2.setAppId(legacyAppId);
                    z10 = true;
                    if (str != null) {
                        com.onesignal.core.internal.config.a aVar3 = this.configModel;
                        j.b(aVar3);
                        if (aVar3.hasProperty("appId")) {
                            com.onesignal.core.internal.config.a aVar4 = this.configModel;
                            j.b(aVar4);
                        }
                        z10 = true;
                        com.onesignal.core.internal.config.a aVar5 = this.configModel;
                        j.b(aVar5);
                        aVar5.setAppId(str);
                    }
                    if (this._consentRequired != null) {
                        com.onesignal.core.internal.config.a aVar6 = this.configModel;
                        j.b(aVar6);
                        Boolean bool = this._consentRequired;
                        j.b(bool);
                        aVar6.setConsentRequired(bool);
                    }
                    if (this._consentGiven != null) {
                        com.onesignal.core.internal.config.a aVar7 = this.configModel;
                        j.b(aVar7);
                        Boolean bool2 = this._consentGiven;
                        j.b(bool2);
                        aVar7.setConsentGiven(bool2);
                    }
                    if (this._disableGMSMissingPrompt != null) {
                        com.onesignal.core.internal.config.a aVar8 = this.configModel;
                        j.b(aVar8);
                        Boolean bool3 = this._disableGMSMissingPrompt;
                        j.b(bool3);
                        aVar8.setDisableGMSMissingPrompt(bool3.booleanValue());
                    }
                    d9.c cVar2 = new d9.c(this.services);
                    cVar2.bootstrap();
                    if (!z10) {
                        jb.b identityModelStore = getIdentityModelStore();
                        j.b(identityModelStore);
                        if (((jb.a) identityModelStore.getModel()).hasProperty("onesignal_id")) {
                            StringBuilder sb = new StringBuilder("initWithContext: using cached user ");
                            jb.b identityModelStore2 = getIdentityModelStore();
                            j.b(identityModelStore2);
                            sb.append(((jb.a) identityModelStore2.getModel()).getOnesignalId());
                            com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                            cVar2.scheduleStart();
                            setInitialized(true);
                            return true;
                        }
                    }
                    c9.b preferencesService = getPreferencesService();
                    j.b(preferencesService);
                    string$default = c9.a.getString$default(preferencesService, "OneSignal", "GT_PLAYER_ID", null, 4, null);
                    if (string$default != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
                        createAndSwitchToNewUser$default(this, false, null, 3, null);
                        f fVar2 = this.operationRepo;
                        j.b(fVar2);
                        com.onesignal.core.internal.config.a aVar9 = this.configModel;
                        j.b(aVar9);
                        String appId = aVar9.getAppId();
                        jb.b identityModelStore3 = getIdentityModelStore();
                        j.b(identityModelStore3);
                        String onesignalId = ((jb.a) identityModelStore3.getModel()).getOnesignalId();
                        jb.b identityModelStore4 = getIdentityModelStore();
                        j.b(identityModelStore4);
                        z8.e.enqueue$default(fVar2, new kb.f(appId, onesignalId, ((jb.a) identityModelStore4.getModel()).getExternalId(), null, 8, null), false, 2, null);
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating user linked to subscription ".concat(string$default), null, 2, null);
                        c9.b preferencesService2 = getPreferencesService();
                        j.b(preferencesService2);
                        String string$default2 = c9.a.getString$default(preferencesService2, "OneSignal", "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
                        if (string$default2 != null) {
                            JSONObject jSONObject = new JSONObject(string$default2);
                            Integer safeInt = com.onesignal.common.f.safeInt(jSONObject, "notification_types");
                            ob.d dVar = new ob.d();
                            dVar.setId(string$default);
                            dVar.setType(g.PUSH);
                            ob.f fVar3 = ob.f.NO_PERMISSION;
                            int value = fVar3.getValue();
                            if (safeInt != null) {
                            }
                            int value2 = ob.f.UNSUBSCRIBE.getValue();
                            if (safeInt != null) {
                            }
                            boolean z12 = true;
                            dVar.setOptedIn(z12);
                            String safeString = com.onesignal.common.f.safeString(jSONObject, "identifier");
                            if (safeString == null) {
                                safeString = "";
                            }
                            dVar.setAddress(safeString);
                            if (safeInt != null) {
                                ob.f fromInt = ob.f.Companion.fromInt(safeInt.intValue());
                                if (fromInt != null) {
                                    fVar3 = fromInt;
                                }
                                dVar.setStatus(fVar3);
                            } else {
                                dVar.setStatus(ob.f.SUBSCRIBED);
                            }
                            dVar.setSdk(i.SDK_VERSION);
                            String str2 = Build.VERSION.RELEASE;
                            j.d(str2, "RELEASE");
                            dVar.setDeviceOS(str2);
                            String carrierName = com.onesignal.common.d.INSTANCE.getCarrierName(((q8.f) this.services.getService(q8.f.class)).getAppContext());
                            if (carrierName == null) {
                                carrierName = "";
                            }
                            dVar.setCarrier(carrierName);
                            String appVersion = AndroidUtils.INSTANCE.getAppVersion(((q8.f) this.services.getService(q8.f.class)).getAppContext());
                            if (appVersion == null) {
                                appVersion = "";
                            }
                            dVar.setAppVersion(appVersion);
                            com.onesignal.core.internal.config.a aVar10 = this.configModel;
                            j.b(aVar10);
                            aVar10.setPushSubscriptionId(string$default);
                            ob.e subscriptionModelStore = getSubscriptionModelStore();
                            j.b(subscriptionModelStore);
                            subscriptionModelStore.add(dVar, "NO_PROPOGATE");
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        createAndSwitchToNewUser$default(this, z11, null, 2, null);
                        f fVar4 = this.operationRepo;
                        j.b(fVar4);
                        com.onesignal.core.internal.config.a aVar11 = this.configModel;
                        j.b(aVar11);
                        String appId2 = aVar11.getAppId();
                        jb.b identityModelStore5 = getIdentityModelStore();
                        j.b(identityModelStore5);
                        z8.e.enqueue$default(fVar4, new kb.e(appId2, ((jb.a) identityModelStore5.getModel()).getOnesignalId(), string$default), false, 2, null);
                        c9.b preferencesService3 = getPreferencesService();
                        j.b(preferencesService3);
                        preferencesService3.saveString("OneSignal", "GT_PLAYER_ID", null);
                    }
                    cVar2.scheduleStart();
                    setInitialized(true);
                    return true;
                }
            }
            z10 = false;
            if (str != null) {
            }
            if (this._consentRequired != null) {
            }
            if (this._consentGiven != null) {
            }
            if (this._disableGMSMissingPrompt != null) {
            }
            d9.c cVar22 = new d9.c(this.services);
            cVar22.bootstrap();
            if (!z10) {
            }
            c9.b preferencesService4 = getPreferencesService();
            j.b(preferencesService4);
            string$default = c9.a.getString$default(preferencesService4, "OneSignal", "GT_PLAYER_ID", null, 4, null);
            if (string$default != null) {
            }
            cVar22.scheduleStart();
            setInitialized(true);
            return true;
        }
    }

    public boolean isInitialized() {
        return this.isInitialized;
    }

    @Override // h8.a
    public void login(String str) {
        j.e(str, "externalId");
        login(str, null);
    }

    public void logout() {
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "logout()");
        if (!isInitialized()) {
            throw new Exception("Must call 'initWithContext' before 'logout'");
        }
        synchronized (this.loginLock) {
            jb.b identityModelStore = getIdentityModelStore();
            j.b(identityModelStore);
            if (((jb.a) identityModelStore.getModel()).getExternalId() == null) {
                return;
            }
            createAndSwitchToNewUser$default(this, false, null, 3, null);
            f fVar = this.operationRepo;
            j.b(fVar);
            com.onesignal.core.internal.config.a aVar = this.configModel;
            j.b(aVar);
            String appId = aVar.getAppId();
            jb.b identityModelStore2 = getIdentityModelStore();
            j.b(identityModelStore2);
            String onesignalId = ((jb.a) identityModelStore2.getModel()).getOnesignalId();
            jb.b identityModelStore3 = getIdentityModelStore();
            j.b(identityModelStore3);
            z8.e.enqueue$default(fVar, new kb.f(appId, onesignalId, ((jb.a) identityModelStore3.getModel()).getExternalId(), null, 8, null), false, 2, null);
        }
    }

    public void setConsentGiven(boolean z10) {
        f fVar;
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z10);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar != null) {
            aVar.setConsentGiven(Boolean.valueOf(z10));
        }
        if (j.a(bool, Boolean.valueOf(z10)) || !z10 || (fVar = this.operationRepo) == null) {
            return;
        }
        fVar.forceExecuteOperations();
    }

    public void setConsentRequired(boolean z10) {
        this._consentRequired = Boolean.valueOf(z10);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setConsentRequired(Boolean.valueOf(z10));
    }

    public void setDisableGMSMissingPrompt(boolean z10) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z10);
        com.onesignal.core.internal.config.a aVar = this.configModel;
        if (aVar == null) {
            return;
        }
        aVar.setDisableGMSMissingPrompt(z10);
    }

    public void setInitialized(boolean z10) {
        this.isInitialized = z10;
    }

    @Override // h8.a
    public void login(String str, String str2) {
        j.e(str, "externalId");
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "login(externalId: " + str + ", jwtBearerToken: " + str2 + ')');
        if (isInitialized()) {
            s sVar = new s();
            s sVar2 = new s();
            s sVar3 = new s();
            sVar3.f5683g = "";
            synchronized (this.loginLock) {
                jb.b identityModelStore = getIdentityModelStore();
                j.b(identityModelStore);
                sVar.f5683g = ((jb.a) identityModelStore.getModel()).getExternalId();
                jb.b identityModelStore2 = getIdentityModelStore();
                j.b(identityModelStore2);
                sVar2.f5683g = ((jb.a) identityModelStore2.getModel()).getOnesignalId();
                if (j.a(sVar.f5683g, str)) {
                    return;
                }
                createAndSwitchToNewUser$default(this, false, new C0038a(str), 1, null);
                jb.b identityModelStore3 = getIdentityModelStore();
                j.b(identityModelStore3);
                sVar3.f5683g = ((jb.a) identityModelStore3.getModel()).getOnesignalId();
                com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(sVar3, str, sVar, sVar2, null), 1, null);
                return;
            }
        }
        throw new Exception("Must call 'initWithContext' before 'login'");
    }
}
