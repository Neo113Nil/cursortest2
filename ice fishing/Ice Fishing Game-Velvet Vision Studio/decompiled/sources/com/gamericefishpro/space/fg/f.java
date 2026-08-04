package com.gamericefishpro.space.fg;

import android.util.Base64;
import com.gamericefishpro.space.r9.o;
import com.gamericefishpro.space.v8.c0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {
    public static final a Companion = new a(null);
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private final com.gamericefishpro.space.lc.f _applicationService;
    private com.gamericefishpro.space.rc.b _configModelStore;
    private final String apiKey;
    private final String appId;
    private com.gamericefishpro.space.wa.g firebaseApp;
    private final String projectId;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.fg.a upgradePrompt, com.gamericefishpro.space.vc.c deviceService) {
        super(deviceService, _configModelStore, upgradePrompt);
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(upgradePrompt, "upgradePrompt");
        Intrinsics.checkNotNullParameter(deviceService, "deviceService");
        this._configModelStore = _configModelStore;
        this._applicationService = _applicationService;
        com.gamericefishpro.space.rc.c fcmParams = ((com.gamericefishpro.space.rc.a) _configModelStore.getModel()).getFcmParams();
        String projectId = fcmParams.getProjectId();
        this.projectId = projectId == null ? FCM_DEFAULT_PROJECT_ID : projectId;
        String appId = fcmParams.getAppId();
        this.appId = appId == null ? FCM_DEFAULT_APP_ID : appId;
        byte[] bArrDecode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        String str = new String(bArrDecode, Charsets.UTF_8);
        String apiKey = fcmParams.getApiKey();
        this.apiKey = apiKey != null ? apiKey : str;
    }

    private final String getTokenWithClassFirebaseMessaging() throws Exception {
        com.gamericefishpro.space.wa.g gVar = this.firebaseApp;
        Intrinsics.b(gVar);
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        firebaseMessaging.getClass();
        com.gamericefishpro.space.r9.h hVar = new com.gamericefishpro.space.r9.h();
        firebaseMessaging.f.execute(new com.gamericefishpro.space.bb.h(13, firebaseMessaging, hVar));
        o oVar = hVar.a;
        Intrinsics.checkNotNullExpressionValue(oVar, "getToken(...)");
        try {
            Object objJ = com.gamericefishpro.space.d9.h.j(oVar);
            Intrinsics.checkNotNullExpressionValue(objJ, "await(...)");
            return (String) objJ;
        } catch (ExecutionException e) {
            Exception exception = oVar.getException();
            if (exception == null) {
                throw e;
            }
            throw exception;
        }
    }

    private final void initFirebaseApp(String str) {
        if (this.firebaseApp != null) {
            return;
        }
        String str2 = this.appId;
        c0.e(str2, "ApplicationId must be set.");
        String str3 = this.apiKey;
        c0.e(str3, "ApiKey must be set.");
        com.gamericefishpro.space.wa.h hVar = new com.gamericefishpro.space.wa.h(str2, str3, null, null, str, null, this.projectId);
        Intrinsics.checkNotNullExpressionValue(hVar, "build(...)");
        this.firebaseApp = com.gamericefishpro.space.wa.g.f(this._applicationService.getAppContext(), hVar, FCM_APP_NAME);
    }

    @Override // com.gamericefishpro.space.fg.e
    public String getProviderName() {
        return "FCM";
    }

    @Override // com.gamericefishpro.space.fg.e
    public Object getToken(String str, com.gamericefishpro.space.th.a aVar) {
        initFirebaseApp(str);
        return getTokenWithClassFirebaseMessaging();
    }

    public final com.gamericefishpro.space.lc.f get_applicationService() {
        return this._applicationService;
    }

    public final com.gamericefishpro.space.rc.b get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(com.gamericefishpro.space.rc.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this._configModelStore = bVar;
    }
}
