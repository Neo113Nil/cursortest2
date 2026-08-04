package com.gamericefishpro.space.fg;

import com.onesignal.common.AndroidUtils;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements com.gamericefishpro.space.eg.b, com.gamericefishpro.space.fg.c {
    public static final a Companion = new a(null);
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.vc.c _deviceService;
    private final com.gamericefishpro.space.fg.a _upgradePrompt;

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
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.attemptRegistration(null, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.internalRegisterForPush(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.registerInBackground(null, this);
        }
    }

    public e(com.gamericefishpro.space.vc.c _deviceService, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.fg.a _upgradePrompt) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_upgradePrompt, "_upgradePrompt");
        this._deviceService = _deviceService;
        this._configModelStore = _configModelStore;
        this._upgradePrompt = _upgradePrompt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00d5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00f0, please report this as an issue */
    public final Object attemptRegistration(String str, int i, com.gamericefishpro.space.th.a aVar) {
        b bVar;
        e eVar;
        com.gamericefishpro.space.jh.f fVarPushStatusFromThrowable;
        String rootCauseMessage;
        Exception exc;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object token = bVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = bVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(token);
            try {
                bVar.L$0 = this;
                bVar.I$0 = i;
                bVar.label = 1;
                token = getToken(str, bVar);
                if (token == aVar2) {
                    return aVar2;
                }
                eVar = this;
            } catch (IOException e) {
                e = e;
                eVar = this;
                fVarPushStatusFromThrowable = eVar.pushStatusFromThrowable(e);
                rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage)) {
                }
                exc = new Exception(e);
                if (i >= 4) {
                    com.gamericefishpro.space.od.b.error("Retry count of 5 exceed! Could not get a " + eVar.getProviderName() + " Token.", exc);
                } else {
                    com.gamericefishpro.space.od.b.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i, exc);
                    if (i == 2) {
                        return new com.gamericefishpro.space.eg.a(null, fVarPushStatusFromThrowable);
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                eVar = this;
                com.gamericefishpro.space.od.b.error("Unknown error getting " + eVar.getProviderName() + " Token", th);
                return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = bVar.I$0;
            eVar = (e) bVar.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(token);
            } catch (IOException e2) {
                e = e2;
                fVarPushStatusFromThrowable = eVar.pushStatusFromThrowable(e);
                rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage) && !"AUTHENTICATION_FAILED".equals(rootCauseMessage)) {
                    com.gamericefishpro.space.od.b.error("Error Getting " + eVar.getProviderName() + " Token", new Exception(e));
                    return new com.gamericefishpro.space.eg.a(null, fVarPushStatusFromThrowable);
                }
                exc = new Exception(e);
                if (i >= 4) {
                    com.gamericefishpro.space.od.b.error("Retry count of 5 exceed! Could not get a " + eVar.getProviderName() + " Token.", exc);
                } else {
                    com.gamericefishpro.space.od.b.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i, exc);
                    if (i == 2) {
                        return new com.gamericefishpro.space.eg.a(null, fVarPushStatusFromThrowable);
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                com.gamericefishpro.space.od.b.error("Unknown error getting " + eVar.getProviderName() + " Token", th);
                return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
            }
        }
        String str2 = (String) token;
        com.gamericefishpro.space.od.b.info$default("Device registered, push token = " + str2, null, 2, null);
        return new com.gamericefishpro.space.eg.a(str2, com.gamericefishpro.space.jh.f.SUBSCRIBED);
    }

    public static /* synthetic */ Object fireCallback$suspendImpl(e eVar, String str, com.gamericefishpro.space.th.a aVar) throws Exception {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.gamericefishpro.space.fg.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.gamericefishpro.space.fg.e] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final Object internalRegisterForPush(String str, com.gamericefishpro.space.th.a aVar) {
        c cVar;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(aVar);
            }
        } else {
            cVar = new c(aVar);
        }
        Object objRegisterInBackground = cVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    com.gamericefishpro.space.wa.b.P(objRegisterInBackground);
                    return (com.gamericefishpro.space.eg.a) objRegisterInBackground;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(objRegisterInBackground);
                com.gamericefishpro.space.od.b.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
            }
            com.gamericefishpro.space.wa.b.P(objRegisterInBackground);
            try {
                if (this._deviceService.isGMSInstalledAndEnabled()) {
                    cVar.L$0 = this;
                    cVar.label = 1;
                    objRegisterInBackground = registerInBackground(str, cVar);
                    if (objRegisterInBackground != aVar2) {
                        return (com.gamericefishpro.space.eg.a) objRegisterInBackground;
                    }
                } else {
                    com.gamericefishpro.space.fg.a aVar3 = this._upgradePrompt;
                    cVar.L$0 = this;
                    cVar.label = 2;
                    if (aVar3.showUpdateGPSDialog(cVar) != aVar2) {
                        com.gamericefishpro.space.od.b.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    }
                }
                return aVar2;
            } catch (Throwable th) {
                th = th;
                str = this;
                com.gamericefishpro.space.od.b.error("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.FIREBASE_FCM_INIT_ERROR);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final boolean isValidProjectNumber(String str) {
        try {
            Intrinsics.b(str);
            Float.parseFloat(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final com.gamericefishpro.space.jh.f pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(th);
        if (!(th instanceof IOException)) {
            return com.gamericefishpro.space.jh.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
        }
        if (Intrinsics.a(rootCauseMessage, "SERVICE_NOT_AVAILABLE")) {
            return com.gamericefishpro.space.jh.f.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE;
        }
        return Intrinsics.a(rootCauseMessage, "AUTHENTICATION_FAILED") ? com.gamericefishpro.space.jh.f.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : com.gamericefishpro.space.jh.f.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER;
    }

    public static /* synthetic */ Object registerForPush$suspendImpl(e eVar, com.gamericefishpro.space.th.a aVar) {
        if (!((com.gamericefishpro.space.rc.a) eVar._configModelStore.getModel()).isInitializedWithRemote()) {
            return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.FIREBASE_FCM_INIT_ERROR);
        }
        if (!eVar._deviceService.getHasFCMLibrary()) {
            com.gamericefishpro.space.od.b.fatal$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!eVar.isValidProjectNumber(((com.gamericefishpro.space.rc.a) eVar._configModelStore.getModel()).getGoogleProjectNumber())) {
            com.gamericefishpro.space.od.b.error$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = ((com.gamericefishpro.space.rc.a) eVar._configModelStore.getModel()).getGoogleProjectNumber();
        Intrinsics.b(googleProjectNumber);
        return eVar.internalRegisterForPush(googleProjectNumber, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (com.gamericefishpro.space.pi.a0.i(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:29:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerInBackground(String str, com.gamericefishpro.space.th.a aVar) {
        d dVar;
        int i;
        e eVar;
        int i2;
        e eVar2;
        String str2;
        com.gamericefishpro.space.eg.a aVar2;
        Object objAttemptRegistration;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i3 = dVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.label = i3 - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        Object obj = dVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i4 = dVar.label;
        if (i4 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            i = 0;
            eVar = this;
            if (i < 5) {
                return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.FIREBASE_FCM_INIT_ERROR);
            }
            dVar.L$0 = eVar;
            dVar.L$1 = str;
            dVar.I$0 = i;
            dVar.label = 1;
            objAttemptRegistration = eVar.attemptRegistration(str, i, dVar);
            if (objAttemptRegistration != aVar3) {
                e eVar3 = eVar;
                str2 = str;
                i2 = i;
                obj = objAttemptRegistration;
                eVar2 = eVar3;
                aVar2 = (com.gamericefishpro.space.eg.a) obj;
                if (aVar2 != null) {
                    return aVar2;
                }
                long j = (i2 + 1) * REGISTRATION_RETRY_BACKOFF_MS;
                dVar.L$0 = eVar2;
                dVar.L$1 = str2;
                dVar.I$0 = i2;
                dVar.label = 2;
            }
            return aVar3;
        }
        if (i4 == 1) {
            i2 = dVar.I$0;
            str2 = (String) dVar.L$1;
            eVar2 = (e) dVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            aVar2 = (com.gamericefishpro.space.eg.a) obj;
            if (aVar2 != null) {
                return aVar2;
            }
            long j2 = (i2 + 1) * REGISTRATION_RETRY_BACKOFF_MS;
            dVar.L$0 = eVar2;
            dVar.L$1 = str2;
            dVar.I$0 = i2;
            dVar.label = 2;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = dVar.I$0;
            str2 = (String) dVar.L$1;
            eVar2 = (e) dVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        i = i2 + 1;
        str = str2;
        eVar = eVar2;
        if (i < 5) {
            return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.FIREBASE_FCM_INIT_ERROR);
        }
        dVar.L$0 = eVar;
        dVar.L$1 = str;
        dVar.I$0 = i;
        dVar.label = 1;
        objAttemptRegistration = eVar.attemptRegistration(str, i, dVar);
        if (objAttemptRegistration != aVar3) {
            e eVar4 = eVar;
            str2 = str;
            i2 = i;
            obj = objAttemptRegistration;
            eVar2 = eVar4;
            aVar2 = (com.gamericefishpro.space.eg.a) obj;
            if (aVar2 != null) {
                return aVar2;
            }
            long j3 = (i2 + 1) * REGISTRATION_RETRY_BACKOFF_MS;
            dVar.L$0 = eVar2;
            dVar.L$1 = str2;
            dVar.I$0 = i2;
            dVar.label = 2;
        }
        return aVar3;
    }

    @Override // com.gamericefishpro.space.fg.c
    public Object fireCallback(String str, com.gamericefishpro.space.th.a aVar) {
        return fireCallback$suspendImpl(this, str, aVar);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, com.gamericefishpro.space.th.a aVar);

    @Override // com.gamericefishpro.space.eg.b
    public Object registerForPush(com.gamericefishpro.space.th.a aVar) {
        return registerForPush$suspendImpl(this, aVar);
    }
}
