package com.onesignal.notifications.internal.registration.impl;

import F.n;
import O3.i;
import P2.w;
import android.util.Base64;
import com.google.firebase.messaging.FirebaseMessaging;
import j3.m;
import java.util.concurrent.ExecutionException;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class f extends e {
    public static final a Companion = new a(null);
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private final x4.f _applicationService;
    private com.onesignal.core.internal.config.c _configModelStore;
    private final String apiKey;
    private final String appId;
    private O3.g firebaseApp;
    private final String projectId;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.onesignal.core.internal.config.c _configModelStore, x4.f _applicationService, com.onesignal.notifications.internal.registration.impl.a upgradePrompt, C4.c deviceService) {
        super(deviceService, _configModelStore, upgradePrompt);
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(upgradePrompt, "upgradePrompt");
        kotlin.jvm.internal.h.e(deviceService, "deviceService");
        this._configModelStore = _configModelStore;
        this._applicationService = _applicationService;
        com.onesignal.core.internal.config.d fcmParams = ((com.onesignal.core.internal.config.b) _configModelStore.getModel()).getFcmParams();
        String projectId = fcmParams.getProjectId();
        this.projectId = projectId == null ? FCM_DEFAULT_PROJECT_ID : projectId;
        String appId = fcmParams.getAppId();
        this.appId = appId == null ? FCM_DEFAULT_APP_ID : appId;
        byte[] decode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        kotlin.jvm.internal.h.d(decode, "decode(...)");
        String str = new String(decode, Q7.a.f2664a);
        String apiKey = fcmParams.getApiKey();
        this.apiKey = apiKey != null ? apiKey : str;
    }

    private final String getTokenWithClassFirebaseMessaging() {
        O3.g gVar = this.firebaseApp;
        kotlin.jvm.internal.h.b(gVar);
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        firebaseMessaging.getClass();
        j3.h hVar = new j3.h();
        firebaseMessaging.f36198f.execute(new n(19, firebaseMessaging, hVar));
        m mVar = hVar.f38358a;
        kotlin.jvm.internal.h.d(mVar, "getToken(...)");
        try {
            Object b9 = S0.f.b(mVar);
            kotlin.jvm.internal.h.d(b9, "await(...)");
            return (String) b9;
        } catch (ExecutionException e9) {
            Exception f3 = mVar.f();
            if (f3 == null) {
                throw e9;
            }
            throw f3;
        }
    }

    private final void initFirebaseApp(String str) {
        if (this.firebaseApp != null) {
            return;
        }
        String str2 = this.appId;
        w.f(str2, "ApplicationId must be set.");
        String str3 = this.apiKey;
        w.f(str3, "ApiKey must be set.");
        this.firebaseApp = O3.g.f(new i(str2, str3, null, null, str, null, this.projectId), this._applicationService.getAppContext(), FCM_APP_NAME);
    }

    @Override // com.onesignal.notifications.internal.registration.impl.e
    public String getProviderName() {
        return "FCM";
    }

    @Override // com.onesignal.notifications.internal.registration.impl.e
    public Object getToken(String str, InterfaceC5267d interfaceC5267d) {
        initFirebaseApp(str);
        return getTokenWithClassFirebaseMessaging();
    }

    public final x4.f get_applicationService() {
        return this._applicationService;
    }

    public final com.onesignal.core.internal.config.c get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(com.onesignal.core.internal.config.c cVar) {
        kotlin.jvm.internal.h.e(cVar, "<set-?>");
        this._configModelStore = cVar;
    }
}
