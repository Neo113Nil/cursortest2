package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.common.AndroidUtils;
import java.io.IOException;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e implements wa.b, com.onesignal.notifications.internal.registration.impl.c {
    public static final a Companion = new a(null);
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private com.onesignal.core.internal.config.b _configModelStore;
    private final v8.c _deviceService;
    private final com.onesignal.notifications.internal.registration.impl.a _upgradePrompt;

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
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.attemptRegistration(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.internalRegisterForPush(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.registerInBackground(null, this);
        }
    }

    public e(v8.c cVar, com.onesignal.core.internal.config.b bVar, com.onesignal.notifications.internal.registration.impl.a aVar) {
        j.e(cVar, "_deviceService");
        j.e(bVar, "_configModelStore");
        j.e(aVar, "_upgradePrompt");
        this._deviceService = cVar;
        this._configModelStore = bVar;
        this._upgradePrompt = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptRegistration(String str, int i10, fc.d dVar) {
        b bVar;
        int i11;
        e eVar;
        String rootCauseMessage;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                i11 = bVar.label;
                if (i11 != 0) {
                    v6.a.W(obj);
                    try {
                        bVar.L$0 = this;
                        bVar.I$0 = i10;
                        bVar.label = 1;
                        obj = getToken(str, bVar);
                        gc.a aVar = gc.a.f2559g;
                        if (obj == aVar) {
                            return aVar;
                        }
                        eVar = this;
                    } catch (IOException e10) {
                        e = e10;
                        eVar = this;
                        ob.f pushStatusFromThrowable = eVar.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage)) {
                        }
                        Exception exc = new Exception(e);
                        if (i10 < 4) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        eVar = this;
                        com.onesignal.debug.internal.logging.b.error("Unknown error getting " + eVar.getProviderName() + " Token", th);
                        return new wa.a(null, ob.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = bVar.I$0;
                    eVar = (e) bVar.L$0;
                    try {
                        v6.a.W(obj);
                    } catch (IOException e11) {
                        e = e11;
                        ob.f pushStatusFromThrowable2 = eVar.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage) && !"AUTHENTICATION_FAILED".equals(rootCauseMessage)) {
                            com.onesignal.debug.internal.logging.b.error("Error Getting " + eVar.getProviderName() + " Token", new Exception(e));
                            return new wa.a(null, pushStatusFromThrowable2);
                        }
                        Exception exc2 = new Exception(e);
                        if (i10 < 4) {
                            com.onesignal.debug.internal.logging.b.error("Retry count of 5 exceed! Could not get a " + eVar.getProviderName() + " Token.", exc2);
                        } else {
                            com.onesignal.debug.internal.logging.b.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i10, exc2);
                            if (i10 == 2) {
                                return new wa.a(null, pushStatusFromThrowable2);
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        com.onesignal.debug.internal.logging.b.error("Unknown error getting " + eVar.getProviderName() + " Token", th);
                        return new wa.a(null, ob.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                }
                String str2 = (String) obj;
                com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str2, null, 2, null);
                return new wa.a(str2, ob.f.SUBSCRIBED);
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        i11 = bVar.label;
        if (i11 != 0) {
        }
        String str22 = (String) obj2;
        com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str22, null, 2, null);
        return new wa.a(str22, ob.f.SUBSCRIBED);
    }

    public static /* synthetic */ Object fireCallback$suspendImpl(e eVar, String str, fc.d dVar) {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.onesignal.notifications.internal.registration.impl.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.onesignal.notifications.internal.registration.impl.e] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalRegisterForPush(String str, fc.d dVar) {
        c cVar;
        int i10;
        try {
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i11 = cVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i11 - Integer.MIN_VALUE;
                    Object obj = cVar.result;
                    i10 = cVar.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            v6.a.W(obj);
                            return (wa.a) obj;
                        }
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        com.onesignal.debug.internal.logging.b.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new wa.a(null, ob.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    }
                    v6.a.W(obj);
                    try {
                        boolean isGMSInstalledAndEnabled = this._deviceService.isGMSInstalledAndEnabled();
                        gc.a aVar = gc.a.f2559g;
                        if (isGMSInstalledAndEnabled) {
                            cVar.L$0 = this;
                            cVar.label = 1;
                            obj = registerInBackground(str, cVar);
                            if (obj != aVar) {
                                return (wa.a) obj;
                            }
                        } else {
                            com.onesignal.notifications.internal.registration.impl.a aVar2 = this._upgradePrompt;
                            cVar.L$0 = this;
                            cVar.label = 2;
                            if (aVar2.showUpdateGPSDialog(cVar) != aVar) {
                                com.onesignal.debug.internal.logging.b.error$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                                return new wa.a(null, ob.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                            }
                        }
                        return aVar;
                    } catch (Throwable th) {
                        th = th;
                        str = this;
                        com.onesignal.debug.internal.logging.b.error("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                        return new wa.a(null, ob.f.FIREBASE_FCM_INIT_ERROR);
                    }
                }
            }
            if (i10 == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        cVar = new c(dVar);
        Object obj2 = cVar.result;
        i10 = cVar.label;
    }

    private final boolean isValidProjectNumber(String str) {
        try {
            j.b(str);
            Float.parseFloat(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final ob.f pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(th);
        return th instanceof IOException ? j.a(rootCauseMessage, "SERVICE_NOT_AVAILABLE") ? ob.f.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE : j.a(rootCauseMessage, "AUTHENTICATION_FAILED") ? ob.f.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : ob.f.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER : ob.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    }

    public static /* synthetic */ Object registerForPush$suspendImpl(e eVar, fc.d dVar) {
        if (!((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).isInitializedWithRemote()) {
            return new wa.a(null, ob.f.FIREBASE_FCM_INIT_ERROR);
        }
        if (!eVar._deviceService.getHasFCMLibrary()) {
            com.onesignal.debug.internal.logging.b.fatal$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new wa.a(null, ob.f.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!eVar.isValidProjectNumber(((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).getGoogleProjectNumber())) {
            com.onesignal.debug.internal.logging.b.error$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new wa.a(null, ob.f.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = ((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).getGoogleProjectNumber();
        j.b(googleProjectNumber);
        return eVar.internalRegisterForPush(googleProjectNumber, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (yc.a0.f(r6, r0) == r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:11:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerInBackground(String str, fc.d dVar) {
        d dVar2;
        int i10;
        int i11;
        e eVar;
        int i12;
        e eVar2;
        String str2;
        wa.a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i13 = dVar2.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i13 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                i10 = dVar2.label;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    i11 = 0;
                    eVar = this;
                    if (i11 < REGISTRATION_RETRY_COUNT) {
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i12 = dVar2.I$0;
                        str2 = (String) dVar2.L$1;
                        eVar2 = (e) dVar2.L$0;
                        v6.a.W(obj);
                        i11 = i12 + 1;
                        str = str2;
                        eVar = eVar2;
                        if (i11 < REGISTRATION_RETRY_COUNT) {
                            return new wa.a(null, ob.f.FIREBASE_FCM_INIT_ERROR);
                        }
                        dVar2.L$0 = eVar;
                        dVar2.L$1 = str;
                        dVar2.I$0 = i11;
                        dVar2.label = 1;
                        Object attemptRegistration = eVar.attemptRegistration(str, i11, dVar2);
                        if (attemptRegistration != aVar2) {
                            e eVar3 = eVar;
                            str2 = str;
                            i12 = i11;
                            obj = attemptRegistration;
                            eVar2 = eVar3;
                            aVar = (wa.a) obj;
                            if (aVar == null) {
                                return aVar;
                            }
                            long j3 = (i12 + 1) * REGISTRATION_RETRY_BACKOFF_MS;
                            dVar2.L$0 = eVar2;
                            dVar2.L$1 = str2;
                            dVar2.I$0 = i12;
                            dVar2.label = 2;
                        }
                        return aVar2;
                    }
                    i12 = dVar2.I$0;
                    str2 = (String) dVar2.L$1;
                    eVar2 = (e) dVar2.L$0;
                    v6.a.W(obj);
                    aVar = (wa.a) obj;
                    if (aVar == null) {
                    }
                }
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.result;
        i10 = dVar2.label;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, fc.d dVar) {
        return fireCallback$suspendImpl(this, str, dVar);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, fc.d dVar);

    @Override // wa.b
    public Object registerForPush(fc.d dVar) {
        return registerForPush$suspendImpl(this, dVar);
    }
}
