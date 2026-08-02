package com.knotapi.knot.ui.activities;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.webkit.CookieManager;
import android.webkit.WebMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.ApiFeature$M;
import androidx.webkit.internal.WebViewFeatureInternal;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.knotapi.knot.BuildConfig;
import com.knotapi.knot.Knot;
import com.knotapi.knot.R;
import com.knotapi.knot.interfaces.MerchantClickDelegate;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.interfaces.WebAppLoadingListener;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.models.CustomEvent;
import com.knotapi.knot.models.CustomerConfiguration;
import com.knotapi.knot.models.DeviceInfo;
import com.knotapi.knot.models.Environment;
import com.knotapi.knot.models.ExtraInfo;
import com.knotapi.knot.models.JavaScriptInterface;
import com.knotapi.knot.models.MerchantWebViewData;
import com.knotapi.knot.services.AnalyticsManager;
import com.knotapi.knot.services.KnotSDKInitProvider;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.knotapi.knot.utilities.Constants;
import com.knotapi.knot.utilities.Helper;
import com.knotapi.knot.utilities.JsScripts;
import com.knotapi.knot.utilities.PreferenceManager;
import com.knotapi.knot.utilities.WebViewHelper;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.knotapi.knot.webview.WebViewManager;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class KnotActivity extends AppCompatActivity implements MerchantClickDelegate, MerchantWebViewDelegate, WebAppLoadingListener {
    public static final String TAG = "Knot:KnotActivity";
    public static Activity activity;
    public static String[] domainUrls;
    private static final Map<String, String> pendingAssets = new HashMap();
    public String appRootURL;
    double cardSwitcherLoadTime;
    ConstraintLayout clSlowInternet;
    String clientId;
    CustomerConfiguration customerConfiguration;
    String entryPoint;
    Environment environment;
    Gson gson;
    ImageView imgClose;
    ImageView imgCloseSdk;
    String internetSpeed;
    Boolean isBotStarted;
    Boolean isSdkLoaded;
    Boolean isSdkStartLoading;
    Boolean isShowSlowInternet;
    Boolean isWebLoadError;
    RelativeLayout loaderOverlay;
    private Map<String, MerchantWebViewListenerFragment> merchantFragmentMap;
    int[] merchantIds;
    Boolean needTimeOutCall;
    PreferenceManager preferenceManager;
    View rootView;
    String sessionId;
    WebView switcherWebView;
    String timeOutErrorMessage;
    Boolean useCategories;
    Boolean useSearch;
    private Vibrator vibrator;
    private WebViewManager webViewManager;
    String version = BuildConfig.VERSION_NAME;
    private final List<Bot> mBots = new ArrayList();

    /* renamed from: com.knotapi.knot.ui.activities.KnotActivity$3, reason: invalid class name */
    public class AnonymousClass3 implements WebViewManager.WebViewCreationCallback {
        final /* synthetic */ String val$botIdStr;
        final /* synthetic */ Bot val$newBot;
        final /* synthetic */ MerchantWebViewListenerFragment val$newFragment;

        public AnonymousClass3(Bot bot, MerchantWebViewListenerFragment merchantWebViewListenerFragment, String str) {
            this.val$newBot = bot;
            this.val$newFragment = merchantWebViewListenerFragment;
            this.val$botIdStr = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onWebViewCreated$0(Bot bot) {
            KnotActivity.this.sendNativeLogEvent(Integer.valueOf(bot.getBotId()), Constants.META_FLOW, "canceled because of null merchantWebView", "");
            KnotActivity.this.switcherWebView.goBack();
        }

        @Override // com.knotapi.knot.webview.WebViewManager.WebViewCreationCallback
        public void onWebViewCreated(KnotView knotView) {
            if (knotView == null) {
                new Handler().postDelayed(new KnotActivity$$ExternalSyntheticLambda8(2, this, this.val$newBot), 10000L);
                return;
            }
            BreadcrumbHelper.trackForMerchant(this.val$newBot.getMerchantName(), this.val$newBot.getMerchantId(), "webview created", BreadcrumbHelper.Category.WEBVIEW);
            this.val$newFragment.setMerchantWebView(knotView);
            this.val$newFragment.setBot(this.val$newBot);
            this.val$newFragment.setWebViewDelegate(KnotActivity.this);
            this.val$newFragment.setMerchantIds(KnotActivity.this.merchantIds);
            this.val$newFragment.setInjectedAssets(KnotActivity.getCachedAssets());
            if (!this.val$newBot.getDetached().booleanValue()) {
                KnotActivity.this.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.knotapi.knot.ui.activities.KnotActivity.3.1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_RESUME) {
                            FragmentManager supportFragmentManager = KnotActivity.this.getSupportFragmentManager();
                            if (!supportFragmentManager.isStateSaved() && !KnotActivity.this.isFinishing() && !KnotActivity.this.isDestroyed() && !AnonymousClass3.this.val$newFragment.isAdded()) {
                                try {
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    anonymousClass3.val$newFragment.show(supportFragmentManager, anonymousClass3.val$botIdStr);
                                    BreadcrumbHelper.trackForMerchant(AnonymousClass3.this.val$newBot.getMerchantName(), AnonymousClass3.this.val$newBot.getMerchantId(), "Fragment shown", BreadcrumbHelper.Category.FRAGMENT);
                                } catch (IllegalStateException e) {
                                    BreadcrumbHelper.trackForMerchant(AnonymousClass3.this.val$newBot.getMerchantName(), AnonymousClass3.this.val$newBot.getMerchantId(), "Fragment show failed: FragmentManager destroyed", BreadcrumbHelper.Category.ERROR);
                                    Reporter.error(e, "Failed to show fragment - FragmentManager may be destroyed");
                                }
                            }
                            KnotActivity.this.getLifecycle().removeObserver(this);
                        }
                    }
                });
            } else {
                FrameLayout frameLayout = (FrameLayout) KnotActivity.this.findViewById(R.id.temporary_webView_container);
                knotView.getSettings().setUserAgentString("Mozilla/5.0 (iPad; CPU OS 16_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.5 Mobile/15E148 Safari/604.1");
                frameLayout.addView(knotView);
            }
        }
    }

    public KnotActivity() {
        Boolean bool = Boolean.FALSE;
        this.needTimeOutCall = bool;
        this.timeOutErrorMessage = "agent";
        this.isBotStarted = bool;
        this.isShowSlowInternet = bool;
        this.entryPoint = null;
        this.internetSpeed = "";
        this.preferenceManager = null;
        this.cardSwitcherLoadTime = 0.0d;
        this.appRootURL = "";
        this.gson = new Gson();
        this.merchantFragmentMap = new HashMap();
        this.isSdkLoaded = bool;
        this.isSdkStartLoading = bool;
        this.isWebLoadError = bool;
    }

    private void clearCookies() {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
        if (domainUrls != null) {
            Helper.resetCookies(this.preferenceManager.getString(this, PreferenceManager.PREF_CLIENT_COOKIES, ""));
        }
    }

    private Bot getBotById(final int i) {
        return this.mBots.stream().filter(new Predicate() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getBotById$11;
                lambda$getBotById$11 = KnotActivity.lambda$getBotById$11(i, (Bot) obj);
                return lambda$getBotById$11;
            }
        }).findFirst().orElse(null);
    }

    public static Map<String, String> getCachedAssets() {
        return pendingAssets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callSlowInternetTimeOut$6() {
        if (this.isShowSlowInternet.booleanValue()) {
            BreadcrumbHelper.trackSession("Slow internet timeout - showing warning", BreadcrumbHelper.Category.PERFORMANCE);
            this.preferenceManager.saveString(this, PreferenceManager.PREF_INTERNET_SPEED, this.internetSpeed);
            this.preferenceManager.saveString(this, PreferenceManager.PREF_SDK_LOAD_TIME, String.valueOf(this.cardSwitcherLoadTime));
            AlphaAnimation alphaAnimation = new AlphaAnimation(RecyclerView.DECELERATION_RATE, 1.0f);
            alphaAnimation.setDuration(1000L);
            this.clSlowInternet.setVisibility(0);
            this.clSlowInternet.startAnimation(alphaAnimation);
            trackShowSlowInternetMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callTimeOutErrorCallback$8(Bot bot) {
        if (this.needTimeOutCall.booleanValue()) {
            StringBuilder sb = new StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotError\", { bubbles: true, detail: { merchantId: ");
            sb.append(bot != null ? Integer.valueOf(bot.getMerchantId()) : "''");
            sb.append(", botId: ");
            sb.append(bot != null ? Integer.valueOf(bot.getBotId()) : "''");
            sb.append(", errorMessage: \"");
            sb.append(this.timeOutErrorMessage);
            sb.append("\" } }));})();");
            evaluateJS(sb.toString());
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$evaluateJS$9(String str) {
        this.switcherWebView.evaluateJavascript(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getBotById$11(int i, Bot bot) {
        return bot.getBotId() == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideLoading$5() {
        Helper.configureSystemBars(this, getWindow(), this.rootView);
        RelativeLayout relativeLayout = this.loaderOverlay;
        if (relativeLayout == null || this.switcherWebView == null) {
            return;
        }
        relativeLayout.clearAnimation();
        if (this.loaderOverlay.getVisibility() != 8) {
            this.loaderOverlay.setVisibility(8);
        }
        this.imgCloseSdk.setVisibility(8);
        this.switcherWebView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectionStateChanged$7(String str) {
        this.switcherWebView.evaluateJavascript(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.mImpl.getInsets(519);
        view.setPadding(view.getPaddingLeft(), insets.top, view.getPaddingRight(), insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        hideSlowInternetPopup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view) {
        hideSlowInternetPopup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$3(View view) {
        finish();
        if (Knot.getInstance() == null || Knot.getInstance().getKnotEventDelegateListener() == null) {
            return;
        }
        Knot.getInstance().getKnotEventDelegateListener().onExit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLoading$4() {
        RelativeLayout relativeLayout = this.loaderOverlay;
        if (relativeLayout == null || this.switcherWebView == null) {
            return;
        }
        relativeLayout.clearAnimation();
        if (this.loaderOverlay.getVisibility() != 0) {
            this.loaderOverlay.setVisibility(0);
        }
        this.switcherWebView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$triggerFinalStepOnActiveMerchantWebView$10(MerchantWebViewListenerFragment merchantWebViewListenerFragment) {
        merchantWebViewListenerFragment.merchantWebView.finalStep();
    }

    private void validateAndReportCredentialCapture(Bot bot, String str, String str2) {
        if (bot != null) {
            try {
                if (bot.getCredentialTracking()) {
                    if (str == null || str.isEmpty() || str.equals("{}")) {
                        String merchantName = bot.getMerchantName() != null ? bot.getMerchantName() : "Unknown";
                        String str3 = "credentials_" + bot.getMerchantId();
                        Reporter.addBreadcrumb("CREDENTIAL_VALIDATION_START - " + merchantName + " - Session: " + str2, "credential_validation");
                        StringBuilder sb = new StringBuilder();
                        sb.append(merchantName);
                        sb.append(" credentials not captured");
                        Reporter.reportWithBreadcrumbs(new Exception(sb.toString()), merchantName + " credential capture failed - Session: " + str2, str3);
                    }
                }
            } catch (Exception e) {
                Reporter.error(e, "Error executing validateAndReportCredentialCapture");
            }
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantClickDelegate
    public void attachMerchantWebView(String str) {
        try {
            String valueOf = String.valueOf(new JSONObject(str).optInt("botId"));
            MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.merchantFragmentMap.get(valueOf);
            if (merchantWebViewListenerFragment == null || isFinishing() || isDestroyed()) {
                return;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.isStateSaved() || merchantWebViewListenerFragment.isAdded()) {
                return;
            }
            try {
                merchantWebViewListenerFragment.show(supportFragmentManager, valueOf);
            } catch (IllegalStateException e) {
                Reporter.error(e, "Failed to show fragment - FragmentManager may be destroyed");
            }
        } catch (JSONException unused) {
            sendNativeLogEvent(null, Constants.META_FLOW, "Error while parsing attach merchant web view event properties", "");
        } catch (Exception unused2) {
        }
    }

    public void cacheDynamicAsset(String str, String str2) {
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            return;
        }
        Map<String, String> map = pendingAssets;
        synchronized (map) {
            map.put(str, str2);
        }
    }

    public void callSlowInternetTimeOut() {
        new Handler().postDelayed(new KnotActivity$$ExternalSyntheticLambda0(this, 1), 6000L);
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void callTimeOutErrorCallback(int i) {
        new Handler().postDelayed(new KnotActivity$$ExternalSyntheticLambda8(0, this, getBotById(i)), 120000L);
    }

    public void clear() {
        try {
            this.switcherWebView.clearCache(true);
            this.switcherWebView.clearFormData();
            this.switcherWebView.clearHistory();
            clearCookies();
            clearLocalStorage();
        } catch (Exception unused) {
        }
    }

    public void clearLocalStorage() {
        try {
            this.switcherWebView.evaluateJavascript(JsScripts.CLEAR_LOCAL_STORAGE, null);
            WebStorage.getInstance().deleteAllData();
        } catch (Exception unused) {
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantClickDelegate
    public void didMerchantClick(String str) {
        KnotActivity knotActivity;
        Exception exc;
        Bot botObject;
        int length;
        String valueOf;
        MerchantWebViewListenerFragment newInstance;
        try {
            botObject = Bot.getBotObject(str);
            int[] iArr = this.merchantIds;
            if (iArr != null) {
                try {
                    length = iArr.length;
                } catch (Exception e) {
                    exc = e;
                    knotActivity = this;
                    knotActivity.sendNativeLogEvent(null, Constants.META_FLOW, "Error while parsing merchant click event properties", "");
                    Reporter.error(exc, "Error executing didMerchantClick");
                }
            } else {
                length = 0;
            }
            botObject.setMerchantCount(length);
            valueOf = String.valueOf(botObject.getBotId());
            BreadcrumbHelper.trackSession(BreadcrumbHelper.formatMerchant(botObject.getMerchantName(), botObject.getMerchantId()) + " clicked", BreadcrumbHelper.Category.USER_ACTION);
            MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.merchantFragmentMap.get(valueOf);
            if (merchantWebViewListenerFragment != null) {
                if (merchantWebViewListenerFragment.isVisible()) {
                    return;
                }
            }
            clearCookies();
            this.isBotStarted = Boolean.FALSE;
            this.mBots.add(botObject);
            newInstance = MerchantWebViewListenerFragment.newInstance(botObject);
            BreadcrumbHelper.trackForMerchant(botObject.getMerchantName(), botObject.getMerchantId(), "Fragment created", BreadcrumbHelper.Category.FRAGMENT);
            knotActivity = this;
        } catch (Exception e2) {
            e = e2;
            knotActivity = this;
        }
        try {
            this.webViewManager.createWebView("merchantWebView-" + botObject.getBotId(), botObject, knotActivity, newInstance, new AnonymousClass3(botObject, newInstance, valueOf));
            knotActivity.merchantFragmentMap.put(valueOf, newInstance);
        } catch (Exception e3) {
            e = e3;
            exc = e;
            knotActivity.sendNativeLogEvent(null, Constants.META_FLOW, "Error while parsing merchant click event properties", "");
            Reporter.error(exc, "Error executing didMerchantClick");
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void evaluateJS(String str) {
        runOnUiThread(new KnotActivity$$ExternalSyntheticLambda5(this, str, 0));
    }

    @Override // android.app.Activity
    public void finish() {
        trackCloseSDK();
        super.finish();
    }

    public void hideLoading() {
        runOnUiThread(new KnotActivity$$ExternalSyntheticLambda0(this, 0));
    }

    public void hideSlowInternetPopup() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, RecyclerView.DECELERATION_RATE);
        alphaAnimation.setDuration(500L);
        this.clSlowInternet.startAnimation(alphaAnimation);
        this.clSlowInternet.setVisibility(8);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    public void onConnectionStateChanged(boolean z) {
        runOnUiThread(new KnotActivity$$ExternalSyntheticLambda5(this, Fragment$5$$ExternalSyntheticOutline0.m("(function() { window.dispatchEvent(new CustomEvent(\"androidConnectionChanged\", { bubbles: true, detail: { online: ", " } }));})();", z), 1));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BreadcrumbHelper.trackSession("KnotActivity onCreate", BreadcrumbHelper.Category.LIFECYCLE);
        setContentView(R.layout.activity_knot);
        Knot.getInstance().registerOpenedActivity(this);
        final int i = 1;
        if (getDelegate().getLocalNightMode() != 1) {
            getDelegate().setLocalNightMode(1);
        }
        this.vibrator = (Vibrator) getSystemService("vibrator");
        activity = this;
        this.sessionId = Helper.sanitizeInput(getIntent().getStringExtra("sessionId"), "sessionId");
        this.clientId = Helper.sanitizeInput(getIntent().getStringExtra("clientId"), "clientId");
        this.customerConfiguration = (CustomerConfiguration) getIntent().getParcelableExtra("customerConfiguration");
        try {
            View findViewById = findViewById(R.id.root_layout);
            this.rootView = findViewById;
            JWK$$ExternalSyntheticBUOutline0 jWK$$ExternalSyntheticBUOutline0 = new JWK$$ExternalSyntheticBUOutline0(11);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(findViewById, jWK$$ExternalSyntheticBUOutline0);
        } catch (Exception e) {
            Reporter.error(e, "KnotActivity- error in onCreate");
        }
        if (this.sessionId == null || this.clientId == null) {
            BreadcrumbHelper.trackSession("Invalid session/client - finishing", BreadcrumbHelper.Category.ERROR);
            finish();
            return;
        }
        BreadcrumbHelper.trackSession("Session validated: " + this.sessionId, BreadcrumbHelper.Category.LIFECYCLE);
        this.merchantIds = getIntent().getIntArrayExtra("merchantIds");
        domainUrls = getIntent().getStringArrayExtra("domainUrls");
        this.useCategories = Boolean.valueOf(getIntent().getBooleanExtra("useCategories", true));
        this.useSearch = Boolean.valueOf(getIntent().getBooleanExtra("useSearch", true));
        this.entryPoint = Helper.sanitizeInput(getIntent().getStringExtra("entryPoint"), "entryPoint");
        try {
            Environment environment = (Environment) getIntent().getSerializableExtra("environment");
            this.environment = environment;
            if (environment == null) {
                this.environment = Environment.production;
            }
            BreadcrumbHelper.trackSession("Environment: " + this.environment.name(), BreadcrumbHelper.Category.CONFIGURATION);
        } catch (Exception e2) {
            Reporter.error(e2, "KnotActivity- error getting environment");
        }
        this.switcherWebView = (WebView) findViewById(R.id.webView);
        this.loaderOverlay = (RelativeLayout) findViewById(R.id.loader_overlay);
        this.clSlowInternet = (ConstraintLayout) findViewById(R.id.clSlowInternet);
        this.imgClose = (ImageView) findViewById(R.id.imgClose);
        this.imgCloseSdk = (ImageView) findViewById(R.id.imgCloseSdk);
        final int i2 = 0;
        WebView.setWebContentsDebuggingEnabled(false);
        this.preferenceManager = new PreferenceManager();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (domainUrls != null) {
                CookieManager cookieManager = CookieManager.getInstance();
                JSONArray jSONArray = new JSONArray();
                for (String str : domainUrls) {
                    String cookie = cookieManager.getCookie(str);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("domainUrls", str);
                    jSONObject.put("cookies", cookie);
                    jSONArray.put(jSONObject);
                }
                this.preferenceManager.saveString(this, PreferenceManager.PREF_CLIENT_COOKIES, jSONArray.toString());
            }
        } catch (JSONException unused) {
        }
        clear();
        this.clSlowInternet.setOnClickListener(new View.OnClickListener(this) { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda2
            public final /* synthetic */ KnotActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                KnotActivity knotActivity = this.f$0;
                switch (i3) {
                    case 0:
                        knotActivity.lambda$onCreate$1(view);
                        break;
                    case 1:
                        knotActivity.lambda$onCreate$2(view);
                        break;
                    default:
                        knotActivity.lambda$onCreate$3(view);
                        break;
                }
            }
        });
        this.imgClose.setOnClickListener(new View.OnClickListener(this) { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda2
            public final /* synthetic */ KnotActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                KnotActivity knotActivity = this.f$0;
                switch (i3) {
                    case 0:
                        knotActivity.lambda$onCreate$1(view);
                        break;
                    case 1:
                        knotActivity.lambda$onCreate$2(view);
                        break;
                    default:
                        knotActivity.lambda$onCreate$3(view);
                        break;
                }
            }
        });
        final int i3 = 2;
        this.imgCloseSdk.setOnClickListener(new View.OnClickListener(this) { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda2
            public final /* synthetic */ KnotActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                KnotActivity knotActivity = this.f$0;
                switch (i32) {
                    case 0:
                        knotActivity.lambda$onCreate$1(view);
                        break;
                    case 1:
                        knotActivity.lambda$onCreate$2(view);
                        break;
                    default:
                        knotActivity.lambda$onCreate$3(view);
                        break;
                }
            }
        });
        this.isShowSlowInternet = Boolean.TRUE;
        callSlowInternetTimeOut();
        this.switcherWebView.setWebViewClient(new AnonymousClass1(currentTimeMillis));
        WebSettings settings = this.switcherWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSaveFormData(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.switcherWebView, true);
        settings.setTextZoom(100);
        this.switcherWebView.setLayerType(2, null);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.switcherWebView.setVerticalScrollBarEnabled(false);
        this.switcherWebView.addJavascriptInterface(new JavaScriptInterface(this.environment, this, this, this, this, this), "JSInterface");
        String switcherURL = WebViewHelper.getSwitcherURL(this.environment, getSharedPreferences("knot_example_app_prefs", 0).getString("pref_knot_link", ""));
        this.appRootURL = switcherURL;
        KnotSDKInitProvider.rootUrl = switcherURL;
        this.switcherWebView.loadUrl(switcherURL);
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.knotapi.knot.ui.activities.KnotActivity.2
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                KnotActivity.this.onConnectionStateChanged(true);
                if (!KnotActivity.this.isSdkStartLoading.booleanValue() || KnotActivity.this.isSdkLoaded.booleanValue()) {
                    return;
                }
                KnotActivity.this.showLoading();
                KnotActivity.this.runOnUiThread(new Runnable() { // from class: com.knotapi.knot.ui.activities.KnotActivity.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        KnotActivity knotActivity = KnotActivity.this;
                        knotActivity.isWebLoadError = Boolean.FALSE;
                        knotActivity.switcherWebView.loadUrl(knotActivity.appRootURL);
                    }
                });
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                KnotActivity.this.onConnectionStateChanged(false);
            }
        };
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ConnectivityManager.class);
        if (connectivityManager != null) {
            connectivityManager.requestNetwork(build, networkCallback);
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                this.internetSpeed = Boxes$$ExternalSyntheticOutline1.m(networkCapabilities.getLinkDownstreamBandwidthKbps(), "Kbps");
            }
        }
        this.webViewManager = new WebViewManager(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.switcherWebView.removeJavascriptInterface("JSInterface");
        this.switcherWebView.clearCache(true);
        this.switcherWebView.clearHistory();
        this.switcherWebView.onPause();
        this.switcherWebView.removeAllViews();
        this.switcherWebView.destroy();
        super.onDestroy();
        clear();
    }

    @Override // com.knotapi.knot.interfaces.WebAppLoadingListener
    public void onLoadingFinished() {
        hideLoading();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.knotapi.knot.interfaces.WebAppLoadingListener
    public void onStartHaptics() {
        Vibrator vibrator = this.vibrator;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        View findViewById = findViewById(android.R.id.content);
        if (Build.VERSION.SDK_INT >= 30) {
            findViewById.performHapticFeedback(16);
        } else {
            findViewById.performHapticFeedback(0);
        }
        this.vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 50, 50, 50}, -1));
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void onTryAgain(Bot bot) {
        try {
            clearCookies();
            removeFragment(bot.getBotId(), false);
            didMerchantClick(this.gson.toJson((JsonElement) bot.getAllSettings()));
        } catch (Exception unused) {
            sendNativeLogEvent(null, Constants.META_FLOW, "Error while click on try again button on error view", "");
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void removeFragment(int i, boolean z) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        try {
            String valueOf = String.valueOf(i);
            MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.merchantFragmentMap.get(valueOf);
            if (merchantWebViewListenerFragment != null) {
                Bot botById = getBotById(i);
                if (botById != null) {
                    BreadcrumbHelper.trackForMerchant(botById.getMerchantName(), botById.getMerchantId(), "Fragment removed", BreadcrumbHelper.Category.FRAGMENT);
                }
                merchantWebViewListenerFragment.dismiss();
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
                backStackRecord.remove(merchantWebViewListenerFragment);
                backStackRecord.commit();
                if (z) {
                    return;
                }
                this.merchantFragmentMap.remove(valueOf);
                this.mBots.remove(getBotById(i));
            }
        } catch (IllegalStateException e) {
            Reporter.error(e, "Error removing fragment");
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendBotCustomEvent(CustomEvent customEvent) {
        evaluateJS(customEvent.getScript());
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendFullReverseLoginEvent(String str) {
        if (!Helper.isValidJson(str)) {
            str = "{}";
        }
        evaluateJS("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotFullReverseLoginView\", { bubbles: true, detail: { data: " + str + " } }));})();");
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendNativeLogEvent(MerchantWebViewData merchantWebViewData) {
        try {
            Bot botById = getBotById(merchantWebViewData.getBotId());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("meta", merchantWebViewData.getEventType());
                jSONObject.put("message", merchantWebViewData.getMessage());
                jSONObject.put("screenName", merchantWebViewData.getScreenName());
                if (merchantWebViewData.getEventType().equals(Constants.META_SCREENSHOT) && (botById == null || botById.getBotId() == 0)) {
                    Reporter.error(new Exception("Screenshot sent without bot"), jSONObject.toString());
                }
                String cookies = merchantWebViewData.getCookies() != null ? merchantWebViewData.getCookies() : "{}";
                JSONObject jSONObject2 = new JSONObject();
                if (merchantWebViewData.getInteractionMap() != null && !merchantWebViewData.getInteractionMap().isEmpty()) {
                    for (Map.Entry<String, String> entry : merchantWebViewData.getInteractionMap().entrySet()) {
                        try {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        } catch (JSONException unused) {
                            entry.getKey();
                        }
                    }
                }
                String localStorage = merchantWebViewData.getLocalStorage() != null ? merchantWebViewData.getLocalStorage() : "{}";
                String sessionStorage = merchantWebViewData.getSessionStorage() != null ? merchantWebViewData.getSessionStorage() : "{}";
                StringBuilder sb = new StringBuilder();
                sb.append("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotEvent\", { bubbles: true, detail: {");
                sb.append("merchantId: ");
                sb.append(botById != null ? Integer.valueOf(botById.getMerchantId()) : "''");
                sb.append(", ");
                sb.append("botId: ");
                sb.append(botById != null ? Integer.valueOf(botById.getBotId()) : "''");
                sb.append(", ");
                sb.append("event: ");
                sb.append(jSONObject.toString());
                sb.append(", ");
                if (cookies != null && !cookies.equals("{}")) {
                    sb.append("cookies: ");
                    sb.append(cookies);
                    sb.append(", ");
                }
                if (merchantWebViewData.getInteractionMap() != null && !merchantWebViewData.getInteractionMap().isEmpty()) {
                    sb.append("interactions: ");
                    sb.append(jSONObject2.toString());
                    sb.append(", ");
                }
                if (localStorage != null && !localStorage.equals("{}")) {
                    sb.append("localStorage: ");
                    sb.append(localStorage);
                    sb.append(", ");
                }
                if (sessionStorage != null && !sessionStorage.equals("{}")) {
                    sb.append("sessionStorage: ");
                    sb.append(sessionStorage);
                    sb.append(", ");
                }
                sb.append(" } }));})();");
                evaluateJS(sb.toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            Reporter.error(e2, "Error executing sendNativeLogEvent");
        }
    }

    public void sendNativeLogEventWithSdkLoadTime(Integer num, String str, String str2) {
        if (num == null) {
            num = 0;
        }
        Bot botById = getBotById(num.intValue());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("meta", str);
            jSONObject.put("message", str2);
            jSONObject.put("sdkLoadTime", this.preferenceManager.getString(this, PreferenceManager.PREF_SDK_LOAD_TIME, ""));
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotEvent\", { bubbles: true, detail: { merchantId: ");
            sb.append(botById != null ? Integer.valueOf(botById.getMerchantId()) : "''");
            sb.append(", botId: ");
            sb.append(botById != null ? Integer.valueOf(botById.getBotId()) : "''");
            sb.append(", event: ");
            sb.append(jSONObject2);
            sb.append(" } }));})();");
            evaluateJS(sb.toString());
        } catch (JSONException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendRunningEvent(int i, String str, String str2, ExtraInfo extraInfo, Boolean bool, String str3, String str4) {
        String str5;
        String str6;
        String str7;
        String sb;
        String str8;
        Object obj;
        String str9 = str;
        String str10 = "{}";
        String str11 = str3 == null ? "{}" : str3;
        String str12 = str4 == null ? "{}" : str4;
        Bot botById = getBotById(i);
        if (bool.booleanValue()) {
            this.isBotStarted = Boolean.TRUE;
        }
        String loggedInPage = (extraInfo == null || extraInfo.getLoggedInPage() == null) ? "" : extraInfo.getLoggedInPage();
        String userAgent = (extraInfo == null || extraInfo.getUserAgent() == null) ? "" : extraInfo.getUserAgent();
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(", loggedInPage: '", loggedInPage, "', userAgent: '", userAgent, "', workFlowTaskTrigger: '"), (extraInfo == null || !extraInfo.isWorkflowTaskTrigger()) ? "front_end" : "back_end", "'");
        if (!extraInfo.getInterceptedHashmap().isEmpty()) {
            String concat = m.concat(", extraInfo: { intercepted: {");
            for (Map.Entry<String, String> entry : extraInfo.getInterceptedHashmap().entrySet()) {
                concat = concat.concat(entry.getKey() + ": '" + entry.getValue() + "',");
            }
            m = concat.concat(" }}");
        }
        if (extraInfo.getInterceptedValues() != null && !extraInfo.getInterceptedValues().isEmpty()) {
            str10 = extraInfo.getInterceptedValues();
        }
        if (str9 == null || str9.isEmpty()) {
            str5 = "(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ";
            str6 = userAgent;
            str7 = "'";
            StringBuilder sb2 = new StringBuilder(str5);
            sb2.append(botById != null ? Integer.valueOf(botById.getMerchantId()) : "''");
            sb2.append(", botId: ");
            sb2.append(botById != null ? Integer.valueOf(botById.getBotId()) : "''");
            sb2.append(m);
            sb2.append(", internalInformation: ");
            sb2.append(str10);
            sb2.append(", shouldStartBot: ");
            sb2.append(bool);
            sb2.append(" } }));})();");
            sb = sb2.toString();
        } else {
            str6 = userAgent;
            if (str2 == null || str2.isEmpty()) {
                str7 = "'";
                str5 = "(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ";
                StringBuilder sb3 = new StringBuilder(str5);
                sb3.append(botById != null ? Integer.valueOf(botById.getMerchantId()) : "''");
                sb3.append(", botId: ");
                sb3.append(botById != null ? Integer.valueOf(botById.getBotId()) : "''");
                sb3.append(", cookies: ");
                sb3.append(str9);
                sb3.append(", localStorage: ");
                Boxes$$ExternalSyntheticOutline1.m(sb3, str11, ", sessionStorage: ", str12, m);
                sb3.append(", internalInformation: ");
                sb3.append(str10);
                sb3.append(", shouldStartBot: ");
                sb3.append(bool);
                sb3.append(" } }));})();");
                sb = sb3.toString();
            } else {
                str7 = "'";
                StringBuilder sb4 = new StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ");
                if (botById != null) {
                    str8 = "(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ";
                    obj = Integer.valueOf(botById.getMerchantId());
                } else {
                    str8 = "(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ";
                    obj = "''";
                }
                sb4.append(obj);
                sb4.append(", botId: ");
                sb4.append(botById != null ? Integer.valueOf(botById.getBotId()) : "''");
                sb4.append(", cookies: ");
                sb4.append(str9);
                sb4.append(", extraCookies: ");
                Boxes$$ExternalSyntheticOutline1.m(sb4, str2, ", localStorage: ", str11, ", sessionStorage: ");
                Boxes$$ExternalSyntheticOutline1.m(sb4, str12, m, ", internalInformation: ", str10);
                sb4.append(", shouldStartBot: ");
                sb4.append(bool);
                sb4.append(" } }));})();");
                sb = sb4.toString();
                str5 = str8;
            }
        }
        if (!extraInfo.getIntentRedirection().isEmpty()) {
            String intentRedirection = extraInfo.getIntentRedirection();
            String m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(", loggedInPage: '', userAgent: '", str6, str7);
            StringBuilder sb5 = new StringBuilder(str5);
            sb5.append(botById != null ? Integer.valueOf(botById.getMerchantId()) : "''");
            sb5.append(", botId: ");
            sb5.append(botById != null ? Integer.valueOf(botById.getBotId()) : "''");
            sb5.append(", cookies: ");
            if (str9 == null) {
                str9 = "";
            }
            Boxes$$ExternalSyntheticOutline1.m(sb5, str9, ", extraInfo: { intentRedirect: '", intentRedirection, "'}, localStorage: ");
            Boxes$$ExternalSyntheticOutline1.m(sb5, str11, ", sessionStorage: ", str12, m2);
            sb5.append(", internalInformation: ");
            sb5.append(str10);
            sb5.append(", shouldStartBot: ");
            sb5.append(bool);
            sb5.append(" } }));})();");
            sb = sb5.toString();
        }
        evaluateJS(sb);
        validateAndReportCredentialCapture(botById, str10, this.sessionId);
        this.webViewManager.destroyWebView("merchantWebView-" + i);
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendUserActionEvent(int i) {
        Bot botById = getBotById(i);
        StringBuilder sb = new StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotEvent\", { bubbles: true, detail: { event: \"user-action-required\", merchantId: ");
        sb.append(botById != null ? Integer.valueOf(botById.getMerchantId()) : "''");
        sb.append(", botId: ");
        sb.append(i);
        sb.append(" } }));})();");
        evaluateJS(sb.toString());
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendWebMessageToWebApp(MerchantWebViewData merchantWebViewData) {
        try {
            Bot botById = getBotById(merchantWebViewData.getBotId());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("meta", merchantWebViewData.getEventType());
                jSONObject.put("message", merchantWebViewData.getMessage());
                jSONObject.put("screenName", merchantWebViewData.getScreenName());
            } catch (JSONException e) {
                Reporter.error(e, "Error building message payload");
            }
            String cookies = merchantWebViewData.getCookies() != null ? merchantWebViewData.getCookies() : "{}";
            String localStorage = merchantWebViewData.getLocalStorage() != null ? merchantWebViewData.getLocalStorage() : "{}";
            String sessionStorage = merchantWebViewData.getSessionStorage() != null ? merchantWebViewData.getSessionStorage() : "{}";
            if (merchantWebViewData.getEventType().equals(Constants.META_VALIDATE_WORKFLOW)) {
                if (botById == null || !botById.getDisableWorkflowValidation()) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        if (cookies.equals("{}")) {
                            jSONObject2.put("cookies", new JSONArray());
                        } else {
                            jSONObject2.put("cookies", new JSONArray(cookies));
                        }
                        if (localStorage == null || localStorage.equals("{}")) {
                            jSONObject2.put("local_storage", new JSONObject());
                        } else {
                            jSONObject2.put("local_storage", new JSONObject(localStorage));
                        }
                        if (sessionStorage == null || sessionStorage.equals("{}")) {
                            jSONObject2.put("session_storage", new JSONObject());
                        } else {
                            jSONObject2.put("session_storage", new JSONObject(sessionStorage));
                        }
                        if (merchantWebViewData.getTrigger() != null) {
                            jSONObject2.put("trigger", merchantWebViewData.getTrigger());
                        }
                        jSONObject2.put("page_url", merchantWebViewData.getScreenName());
                        jSONObject2.put("url", merchantWebViewData.getScreenName());
                        jSONObject2.put("platform", "android");
                        jSONObject2.put("sdk_version", BuildConfig.VERSION_NAME);
                    } catch (JSONException e2) {
                        Reporter.error(e2, "Error building VALIDATE_WORKFLOW payload");
                    }
                    String compressJson = Helper.compressJson(jSONObject2.toString());
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("merchantId", botById != null ? Integer.valueOf(botById.getMerchantId()) : "");
                    jSONObject3.put("botId", botById != null ? Integer.valueOf(botById.getBotId()) : "");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("meta", Constants.META_VALIDATE_WORKFLOW);
                    jSONObject4.put("message", "");
                    jSONObject3.put(BreadcrumbHelper.Category.EVENT, jSONObject4);
                    jSONObject3.put("data", compressJson);
                    String jSONObject5 = jSONObject3.toString();
                    if (!WebViewFeature.isFeatureSupported("POST_WEB_MESSAGE")) {
                        evaluateJS("(function(){window.dispatchEvent(new CustomEvent(\"mobileBotEvent\",{bubbles:true,detail:" + jSONObject5 + "}))})();");
                        return;
                    }
                    WebView webView = this.switcherWebView;
                    if (webView != null) {
                        Uri uri = Uri.EMPTY;
                        if (WebViewCompat.WILDCARD_URI.equals(uri)) {
                            uri = WebViewCompat.EMPTY_URI;
                        }
                        ApiFeature$M apiFeature$M = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
                        webView.postWebMessage(new WebMessage(jSONObject5, null), uri);
                    }
                }
            }
        } catch (Exception e3) {
            Reporter.error(e3, "Error sending message to WebApp");
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void setNeedTimeOutCall(boolean z) {
        this.needTimeOutCall = Boolean.valueOf(z);
    }

    public void showLoading() {
        runOnUiThread(new KnotActivity$$ExternalSyntheticLambda0(this, 2));
    }

    public void trackCloseSDK() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("entry_point", this.entryPoint);
            hashMap.put("search_enabled", this.useSearch);
            hashMap.put("categories_enabled", this.useCategories);
            int[] iArr = this.merchantIds;
            if (iArr != null && iArr.length > 0) {
                hashMap.put("merchant_id", Integer.valueOf(iArr[0]));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("platform", "android");
            hashMap2.put("sdk_version", BuildConfig.VERSION_NAME);
            AnalyticsManager.getInstance(this.environment).trackEvent("SDK Closed", this.sessionId, hashMap, hashMap2);
        } catch (Exception e) {
            Reporter.error(e, "Error while closing SDK");
        }
    }

    public void trackShowSlowInternetMessage() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("platform", "android");
        hashMap2.put("sdk_version", BuildConfig.VERSION_NAME);
        AnalyticsManager.getInstance(this.environment).trackEvent("Slow Internet Connection Message Displayed", this.sessionId, hashMap, hashMap2);
    }

    public void triggerFinalStepOnActiveMerchantWebView() {
        KnotView knotView;
        try {
            for (MerchantWebViewListenerFragment merchantWebViewListenerFragment : this.merchantFragmentMap.values()) {
                if (merchantWebViewListenerFragment != null && merchantWebViewListenerFragment.isVisible() && (knotView = merchantWebViewListenerFragment.merchantWebView) != null) {
                    knotView.isUserAuthed = true;
                    runOnUiThread(new KnotView$$ExternalSyntheticLambda1(merchantWebViewListenerFragment, 15));
                    return;
                }
            }
        } catch (Exception e) {
            Reporter.error(e, "Error executing triggerFinalStepOnActiveMerchantWebView");
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void userCloseMerchantView(int i, int i2) {
        evaluateJS("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotCloseLoginView\", { bubbles: true, detail: { merchantId: " + i2 + " } }));})();");
        Bot botById = getBotById(i);
        if (botById != null) {
            BreadcrumbHelper.trackForMerchant(botById.getMerchantName(), botById.getMerchantId(), "User closed merchant view", BreadcrumbHelper.Category.USER_ACTION);
            sendNativeLogEvent(Integer.valueOf(botById.getBotId()), Constants.META_FLOW, getString(R.string.webView_closed), "");
            removeFragment(i, botById.getDetached().booleanValue());
        }
    }

    /* renamed from: com.knotapi.knot.ui.activities.KnotActivity$1, reason: invalid class name */
    public class AnonymousClass1 extends WebViewClient {
        final /* synthetic */ long val$cardSwitcherStartTime;

        public AnonymousClass1(long j) {
            this.val$cardSwitcherStartTime = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageFinished$0(String str) {
            KnotActivity.this.sendNativeLogEventWithSdkLoadTime(null, Constants.META_INTERNET_SPEED, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!KnotActivity.this.isWebLoadError.booleanValue()) {
                KnotActivity.this.isSdkLoaded = Boolean.TRUE;
            }
            double currentTimeMillis = (System.currentTimeMillis() - this.val$cardSwitcherStartTime) / 1000.0d;
            KnotActivity.this.cardSwitcherLoadTime = Math.round(currentTimeMillis * 100.0d) / 100.0d;
            KnotActivity.this.isShowSlowInternet = Boolean.FALSE;
            BreadcrumbHelper.trackSession("Main switcher loaded (" + KnotActivity.this.cardSwitcherLoadTime + "s)", BreadcrumbHelper.Category.PERFORMANCE);
            KnotActivity knotActivity = KnotActivity.this;
            String internetSpeed = knotActivity.preferenceManager.internetSpeed(knotActivity);
            if (!internetSpeed.isEmpty()) {
                new Handler().postDelayed(new KnotActivity$$ExternalSyntheticLambda8(1, this, internetSpeed), 2000L);
            }
            KnotActivity knotActivity2 = KnotActivity.this;
            knotActivity2.preferenceManager.saveString(knotActivity2, PreferenceManager.PREF_INTERNET_SPEED, "");
            if (KnotActivity.this.clSlowInternet.getVisibility() == 0) {
                KnotActivity.this.hideSlowInternetPopup();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            KnotActivity.this.isSdkStartLoading = Boolean.TRUE;
            BreadcrumbHelper.trackSession("Main switcher loading: " + str, BreadcrumbHelper.Category.WEBVIEW);
            DeviceInfo deviceInfo = new DeviceInfo(KnotActivity.this.getApplicationContext());
            StringBuilder sb = new StringBuilder("window.sessionId = \"");
            sb.append(KnotActivity.this.sessionId);
            sb.append("\";\nwindow.clientId = \"");
            sb.append(KnotActivity.this.clientId);
            sb.append("\";\nwindow.merchantIds = ");
            sb.append(Arrays.toString(KnotActivity.this.merchantIds));
            sb.append(";\nwindow.useCategories = ");
            sb.append(KnotActivity.this.useCategories);
            sb.append(";\nwindow.useSearch = ");
            sb.append(KnotActivity.this.useSearch);
            sb.append(";\nwindow.environment = \"");
            sb.append(KnotActivity.this.environment.name());
            sb.append("\";\nwindow.SDK_Version = \"");
            sb.append(KnotActivity.this.version);
            sb.append("\";\nwindow.deviceInfo = ");
            sb.append(deviceInfo.toJson());
            sb.append(";\n");
            if (KnotActivity.this.entryPoint != null) {
                sb.append("window.entryPoint = \"");
                sb.append(KnotActivity.this.entryPoint);
                sb.append("\";\n");
            }
            CustomerConfiguration customerConfiguration = KnotActivity.this.customerConfiguration;
            if (customerConfiguration != null) {
                if (customerConfiguration.getCustomerName() != null) {
                    sb.append("window.customerName = \"");
                    sb.append(KnotActivity.this.customerConfiguration.getCustomerName());
                    sb.append("\";\n");
                }
                if (KnotActivity.this.customerConfiguration.getCardName() != null) {
                    sb.append("window.cardName = \"");
                    sb.append(KnotActivity.this.customerConfiguration.getCardName());
                    sb.append("\";\n");
                }
                if (KnotActivity.this.customerConfiguration.getLogoId() != null) {
                    sb.append("window.logoId = \"");
                    sb.append(KnotActivity.this.customerConfiguration.getLogoId());
                    sb.append("\";\n");
                }
            }
            KnotActivity.this.evaluateJS(sb.toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            KnotActivity.this.isWebLoadError = Boolean.TRUE;
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            BreadcrumbHelper.trackSession("Page error [" + webResourceError + "]: " + webResourceRequest.getUrl().toString(), BreadcrumbHelper.Category.ERROR);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            KnotActivity.this.isWebLoadError = Boolean.TRUE;
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendNativeLogEvent(Integer num, String str, String str2, String str3) {
        MerchantWebViewData.Builder message = new MerchantWebViewData.Builder().setBotId(num != null ? num.intValue() : 0).setEventType(str).setMessage(str2);
        if (str3 == null) {
            str3 = "";
        }
        sendNativeLogEvent(message.setScreenName(str3).setCookies("{}").setInteractionMap(null).build());
    }
}
