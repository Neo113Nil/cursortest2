package com.onesignal.notifications.internal.registration.impl;

import android.util.Base64;
import com.google.firebase.messaging.FirebaseMessaging;
import g7.o;
import i7.i;
import java.util.concurrent.ExecutionException;
import p6.u;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends e {
    public static final a Companion = new a(null);
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private final q8.f _applicationService;
    private com.onesignal.core.internal.config.b _configModelStore;
    private final String apiKey;
    private final String appId;
    private i7.g firebaseApp;
    private final String projectId;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.onesignal.core.internal.config.b bVar, q8.f fVar, com.onesignal.notifications.internal.registration.impl.a aVar, v8.c cVar) {
        super(cVar, bVar, aVar);
        j.e(bVar, "_configModelStore");
        j.e(fVar, "_applicationService");
        j.e(aVar, "upgradePrompt");
        j.e(cVar, "deviceService");
        this._configModelStore = bVar;
        this._applicationService = fVar;
        com.onesignal.core.internal.config.c fcmParams = ((com.onesignal.core.internal.config.a) bVar.getModel()).getFcmParams();
        String projectId = fcmParams.getProjectId();
        this.projectId = projectId == null ? FCM_DEFAULT_PROJECT_ID : projectId;
        String appId = fcmParams.getAppId();
        this.appId = appId == null ? FCM_DEFAULT_APP_ID : appId;
        byte[] decode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        j.d(decode, "decode(FCM_DEFAULT_API_KEY_BASE64, Base64.DEFAULT)");
        String str = new String(decode, xc.a.f8399a);
        String apiKey = fcmParams.getApiKey();
        this.apiKey = apiKey != null ? apiKey : str;
    }

    private final String getTokenWithClassFirebaseMessaging() {
        i7.g gVar = this.firebaseApp;
        j.b(gVar);
        gVar.a();
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) gVar.f3234d.a(FirebaseMessaging.class);
        firebaseMessaging.getClass();
        g7.h hVar = new g7.h();
        firebaseMessaging.f1465f.execute(new a1.d(4, firebaseMessaging, hVar));
        o oVar = hVar.f2537a;
        j.d(oVar, "fcmInstance.token");
        try {
            Object l10 = i7.b.l(oVar);
            j.d(l10, "await(tokenTask)");
            return (String) l10;
        } catch (ExecutionException e10) {
            Exception f10 = oVar.f();
            if (f10 == null) {
                throw e10;
            }
            throw f10;
        }
    }

    private final void initFirebaseApp(String str) {
        if (this.firebaseApp != null) {
            return;
        }
        String str2 = this.appId;
        u.d(str2, "ApplicationId must be set.");
        String str3 = this.apiKey;
        u.d(str3, "ApiKey must be set.");
        this.firebaseApp = i7.g.f(this._applicationService.getAppContext(), new i(str2, str3, null, null, str, null, this.projectId), FCM_APP_NAME);
    }

    @Override // com.onesignal.notifications.internal.registration.impl.e
    public String getProviderName() {
        return "FCM";
    }

    @Override // com.onesignal.notifications.internal.registration.impl.e
    public Object getToken(String str, fc.d dVar) {
        initFirebaseApp(str);
        return getTokenWithClassFirebaseMessaging();
    }

    public final q8.f get_applicationService() {
        return this._applicationService;
    }

    public final com.onesignal.core.internal.config.b get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(com.onesignal.core.internal.config.b bVar) {
        j.e(bVar, "<set-?>");
        this._configModelStore = bVar;
    }
}
