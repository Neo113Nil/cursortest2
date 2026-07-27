package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.common.AndroidUtils;
import java.io.IOException;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import y5.C5253a;
import y5.InterfaceC5254b;

/* loaded from: classes2.dex */
public abstract class e implements InterfaceC5254b, com.onesignal.notifications.internal.registration.impl.c {
    public static final a Companion = new a(null);
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private com.onesignal.core.internal.config.c _configModelStore;
    private final y4.c _deviceService;
    private final com.onesignal.notifications.internal.registration.impl.a _upgradePrompt;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC5219c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.attemptRegistration(null, 0, this);
        }
    }

    public static final class c extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.internalRegisterForPush(null, this);
        }
    }

    public static final class d extends AbstractC5219c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.registerInBackground(null, this);
        }
    }

    public e(y4.c _deviceService, com.onesignal.core.internal.config.c _configModelStore, com.onesignal.notifications.internal.registration.impl.a _upgradePrompt) {
        kotlin.jvm.internal.h.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_upgradePrompt, "_upgradePrompt");
        this._deviceService = _deviceService;
        this._configModelStore = _configModelStore;
        this._upgradePrompt = _upgradePrompt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptRegistration(String str, int i, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i4;
        e eVar;
        String rootCauseMessage;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i9 = bVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.label = i9 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = bVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    try {
                        bVar.L$0 = this;
                        bVar.I$0 = i;
                        bVar.label = 1;
                        obj = getToken(str, bVar);
                        if (obj == enumC5179a) {
                            return enumC5179a;
                        }
                        eVar = this;
                    } catch (IOException e6) {
                        e = e6;
                        eVar = this;
                        V5.f pushStatusFromThrowable = eVar.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage)) {
                        }
                        Exception exc = new Exception(e);
                        if (i < 4) {
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        eVar = this;
                        com.onesignal.debug.internal.logging.b.warn("Unknown error getting " + eVar.getProviderName() + " Token", th);
                        return new C5253a(null, V5.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = bVar.I$0;
                    eVar = (e) bVar.L$0;
                    try {
                        com.bumptech.glide.f.r(obj);
                    } catch (IOException e9) {
                        e = e9;
                        V5.f pushStatusFromThrowable2 = eVar.pushStatusFromThrowable(e);
                        rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(e);
                        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage) && !"AUTHENTICATION_FAILED".equals(rootCauseMessage)) {
                            com.onesignal.debug.internal.logging.b.warn("Error Getting " + eVar.getProviderName() + " Token", new Exception(e));
                            return new C5253a(null, pushStatusFromThrowable2);
                        }
                        Exception exc2 = new Exception(e);
                        if (i < 4) {
                            com.onesignal.debug.internal.logging.b.info("Retry count of 5 exceed! Could not get a " + eVar.getProviderName() + " Token.", exc2);
                        } else {
                            com.onesignal.debug.internal.logging.b.info("'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i, exc2);
                            if (i == 2) {
                                return new C5253a(null, pushStatusFromThrowable2);
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        com.onesignal.debug.internal.logging.b.warn("Unknown error getting " + eVar.getProviderName() + " Token", th);
                        return new C5253a(null, V5.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION);
                    }
                }
                String str2 = (String) obj;
                com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str2, null, 2, null);
                return new C5253a(str2, V5.f.SUBSCRIBED);
            }
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = bVar.label;
        if (i4 != 0) {
        }
        String str22 = (String) obj2;
        com.onesignal.debug.internal.logging.b.info$default("Device registered, push token = " + str22, null, 2, null);
        return new C5253a(str22, V5.f.SUBSCRIBED);
    }

    public static /* synthetic */ Object fireCallback$suspendImpl(e eVar, String str, InterfaceC5133d interfaceC5133d) {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.onesignal.notifications.internal.registration.impl.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.onesignal.notifications.internal.registration.impl.e] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalRegisterForPush(String str, InterfaceC5133d interfaceC5133d) {
        c cVar;
        int i;
        try {
            if (interfaceC5133d instanceof c) {
                cVar = (c) interfaceC5133d;
                int i4 = cVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i4 - Integer.MIN_VALUE;
                    Object obj = cVar.result;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = cVar.label;
                    if (i == 0) {
                        if (i == 1) {
                            com.bumptech.glide.f.r(obj);
                            return (C5253a) obj;
                        }
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.f.r(obj);
                        com.onesignal.debug.internal.logging.b.warn$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                        return new C5253a(null, V5.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                    }
                    com.bumptech.glide.f.r(obj);
                    try {
                        if (this._deviceService.isGMSInstalledAndEnabled()) {
                            cVar.L$0 = this;
                            cVar.label = 1;
                            obj = registerInBackground(str, cVar);
                            if (obj != enumC5179a) {
                                return (C5253a) obj;
                            }
                        } else {
                            com.onesignal.notifications.internal.registration.impl.a aVar = this._upgradePrompt;
                            cVar.L$0 = this;
                            cVar.label = 2;
                            if (aVar.showUpdateGPSDialog(cVar) != enumC5179a) {
                                com.onesignal.debug.internal.logging.b.warn$default("'Google Play services' app not installed or disabled on the device.", null, 2, null);
                                return new C5253a(null, V5.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP);
                            }
                        }
                        return enumC5179a;
                    } catch (Throwable th) {
                        th = th;
                        str = this;
                        com.onesignal.debug.internal.logging.b.warn("Could not register with " + str.getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                        return new C5253a(null, V5.f.FIREBASE_FCM_INIT_ERROR);
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        cVar = new c(interfaceC5133d);
        Object obj2 = cVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = cVar.label;
    }

    private final boolean isValidProjectNumber(String str) {
        try {
            kotlin.jvm.internal.h.b(str);
            Float.parseFloat(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final V5.f pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(th);
        return th instanceof IOException ? kotlin.jvm.internal.h.a(rootCauseMessage, "SERVICE_NOT_AVAILABLE") ? V5.f.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE : kotlin.jvm.internal.h.a(rootCauseMessage, "AUTHENTICATION_FAILED") ? V5.f.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : V5.f.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER : V5.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    }

    public static /* synthetic */ Object registerForPush$suspendImpl(e eVar, InterfaceC5133d interfaceC5133d) {
        if (!((com.onesignal.core.internal.config.b) eVar._configModelStore.getModel()).isInitializedWithRemote()) {
            return new C5253a(null, V5.f.FIREBASE_FCM_INIT_ERROR);
        }
        if (!eVar._deviceService.getHasFCMLibrary()) {
            com.onesignal.debug.internal.logging.b.warn$default("The Firebase FCM library is missing! Please make sure to include it in your project.", null, 2, null);
            return new C5253a(null, V5.f.MISSING_FIREBASE_FCM_LIBRARY);
        }
        if (!eVar.isValidProjectNumber(((com.onesignal.core.internal.config.b) eVar._configModelStore.getModel()).getGoogleProjectNumber())) {
            com.onesignal.debug.internal.logging.b.warn$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null, 2, null);
            return new C5253a(null, V5.f.INVALID_FCM_SENDER_ID);
        }
        String googleProjectNumber = ((com.onesignal.core.internal.config.b) eVar._configModelStore.getModel()).getGoogleProjectNumber();
        kotlin.jvm.internal.h.b(googleProjectNumber);
        return eVar.internalRegisterForPush(googleProjectNumber, interfaceC5133d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (O7.AbstractC0399y.f((r10 + 1) * 10000, r0) == r1) goto L28;
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
    public final Object registerInBackground(String str, InterfaceC5133d interfaceC5133d) {
        d dVar;
        int i;
        int i4;
        e eVar;
        int i9;
        e eVar2;
        String str2;
        C5253a c5253a;
        if (interfaceC5133d instanceof d) {
            dVar = (d) interfaceC5133d;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = dVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    i4 = 0;
                    eVar = this;
                    if (i4 < 5) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i9 = dVar.I$0;
                        str2 = (String) dVar.L$1;
                        eVar2 = (e) dVar.L$0;
                        com.bumptech.glide.f.r(obj);
                        i4 = i9 + 1;
                        str = str2;
                        eVar = eVar2;
                        if (i4 < 5) {
                            return new C5253a(null, V5.f.FIREBASE_FCM_INIT_ERROR);
                        }
                        dVar.L$0 = eVar;
                        dVar.L$1 = str;
                        dVar.I$0 = i4;
                        dVar.label = 1;
                        Object attemptRegistration = eVar.attemptRegistration(str, i4, dVar);
                        if (attemptRegistration != enumC5179a) {
                            e eVar3 = eVar;
                            str2 = str;
                            i9 = i4;
                            obj = attemptRegistration;
                            eVar2 = eVar3;
                            c5253a = (C5253a) obj;
                            if (c5253a == null) {
                                return c5253a;
                            }
                            dVar.L$0 = eVar2;
                            dVar.L$1 = str2;
                            dVar.I$0 = i9;
                            dVar.label = 2;
                        }
                        return enumC5179a;
                    }
                    i9 = dVar.I$0;
                    str2 = (String) dVar.L$1;
                    eVar2 = (e) dVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    c5253a = (C5253a) obj;
                    if (c5253a == null) {
                    }
                }
            }
        }
        dVar = new d(interfaceC5133d);
        Object obj2 = dVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = dVar.label;
        if (i != 0) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, InterfaceC5133d interfaceC5133d) {
        return fireCallback$suspendImpl(this, str, interfaceC5133d);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, InterfaceC5133d interfaceC5133d);

    @Override // y5.InterfaceC5254b
    public Object registerForPush(InterfaceC5133d interfaceC5133d) {
        return registerForPush$suspendImpl(this, interfaceC5133d);
    }
}
