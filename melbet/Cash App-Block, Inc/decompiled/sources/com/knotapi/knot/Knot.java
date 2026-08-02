package com.knotapi.knot;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.knotapi.knot.interfaces.KnotEventDelegate;
import com.knotapi.knot.models.CustomerConfiguration;
import com.knotapi.knot.models.Environment;
import com.knotapi.knot.models.KnotConfiguration;
import com.knotapi.knot.services.AnalyticsManager;
import com.knotapi.knot.services.CrashHandler;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.ui.activities.KnotActivity;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class Knot {
    private static volatile Knot INSTANCE;
    private String clientId;
    private Context context;
    private CustomerConfiguration customerConfiguration;
    private String[] domainUrls;
    private String entryPoint;
    private Environment environment;
    private KnotEventDelegate knotEventDelegate;
    private int[] merchantIds;
    private WeakReference<Activity> openedActivityRef = null;
    private String sessionId;
    private Boolean useCategories;
    private Boolean useSearch;

    /* loaded from: classes6.dex */
    public enum Product {
        card_switcher,
        transaction_link,
        link,
        vault
    }

    private void cleanupReferences() {
        this.knotEventDelegate = null;
        this.context = null;
        this.environment = null;
        this.clientId = null;
        this.sessionId = null;
        this.merchantIds = null;
        this.useCategories = null;
        this.useSearch = null;
        this.domainUrls = null;
        this.entryPoint = null;
        this.customerConfiguration = null;
    }

    public static void close() {
        if (INSTANCE != null) {
            INSTANCE.onCloseSession();
        }
    }

    private Intent createIntent() {
        Intent intent = new Intent(this.context, (Class<?>) KnotActivity.class);
        intent.putExtra("environment", this.environment);
        intent.putExtra("clientId", this.clientId);
        intent.putExtra("sessionId", this.sessionId);
        intent.putExtra("merchantIds", this.merchantIds);
        intent.putExtra("useCategories", this.useCategories);
        intent.putExtra("useSearch", this.useSearch);
        intent.putExtra("domainUrls", this.domainUrls);
        intent.putExtra("entryPoint", this.entryPoint);
        intent.putExtra("customerConfiguration", this.customerConfiguration);
        return intent;
    }

    private void finishActivity() {
        WeakReference<Activity> weakReference = this.openedActivityRef;
        if (weakReference != null) {
            Activity activity = weakReference.get();
            if (activity != null && !activity.isFinishing()) {
                try {
                    activity.finish();
                    BreadcrumbHelper.trackSession("Activity finished", BreadcrumbHelper.Category.LIFECYCLE);
                } catch (Exception e) {
                    Reporter.error(e, "onCloseSession - activity.finish()");
                }
            }
            this.openedActivityRef = null;
        }
    }

    public static Knot getInstance() {
        if (INSTANCE == null) {
            synchronized (Knot.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new Knot();
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    public static String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private void notifyDelegate() {
        KnotEventDelegate knotEventDelegate = this.knotEventDelegate;
        if (knotEventDelegate != null) {
            try {
                knotEventDelegate.onExit();
                BreadcrumbHelper.trackSession("Delegate notified of exit", BreadcrumbHelper.Category.LIFECYCLE);
            } catch (Exception e) {
                Reporter.error(e, "onCloseSession - KnotEventDelegate.onExit");
            }
        }
    }

    public static void open(Context context, KnotConfiguration knotConfiguration, KnotEventDelegate knotEventDelegate) {
        getInstance().openSessionType(context, knotConfiguration, knotEventDelegate);
    }

    private void trackAnalytics(Intent intent) {
        AnalyticsManager analyticsManager = AnalyticsManager.getInstance(this.environment);
        if (analyticsManager == null) {
            Reporter.error(new IllegalArgumentException("AnalyticsManager instance is null."), "Analytics Initialization for Tracking");
            return;
        }
        analyticsManager.identifyAndTrackOpen(this.sessionId);
        String str = this.sessionId;
        Boolean bool = this.useSearch;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.useCategories;
        analyticsManager.trackSDKOpened(str, intent, booleanValue, bool2 != null ? bool2.booleanValue() : true, this.merchantIds);
        BreadcrumbHelper.trackSession("Analytics tracked: SDK Opened", BreadcrumbHelper.Category.ANALYTICS);
    }

    private void trackClosureEvent() {
        AnalyticsManager analyticsManager = AnalyticsManager.getInstance(this.environment);
        if (analyticsManager == null) {
            Reporter.error(new IllegalArgumentException("AnalyticsManager instance is null."), "onCloseSession - AnalyticsManager");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
        analyticsManager.trackEvent("SDK Closed using onClose()", this.sessionId, new HashMap(), hashMap);
        BreadcrumbHelper.trackSession("Analytics tracked: SDK Closed", BreadcrumbHelper.Category.ANALYTICS);
    }

    public KnotEventDelegate getKnotEventDelegateListener() {
        return this.knotEventDelegate;
    }

    public Activity getOpenedActivity() {
        WeakReference<Activity> weakReference = this.openedActivityRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void onCloseSession() {
        try {
            BreadcrumbHelper.trackSession("SDK session closing", BreadcrumbHelper.Category.LIFECYCLE);
            trackClosureEvent();
            notifyDelegate();
            finishActivity();
            cleanupReferences();
        } catch (Exception e) {
            Reporter.error(e, "onCloseSession");
        }
    }

    public void openProduct(Context context) {
        try {
            Intent createIntent = createIntent();
            if (!(context instanceof Activity)) {
                createIntent.addFlags(268435456);
            }
            context.startActivity(createIntent);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
            if (context instanceof Activity) {
                this.openedActivityRef = new WeakReference<>((Activity) context);
            }
            trackAnalytics(createIntent);
        } catch (Exception e) {
            BreadcrumbHelper.trackSession("Error in openProduct: " + e.getMessage(), BreadcrumbHelper.Category.ERROR);
            Reporter.error(e, "openProduct");
        }
    }

    public void openSessionType(Context context, KnotConfiguration knotConfiguration, KnotEventDelegate knotEventDelegate) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            if (knotConfiguration == null) {
                throw new IllegalArgumentException("Configuration cannot be null.");
            }
            this.context = context.getApplicationContext();
            this.environment = knotConfiguration.getEnvironment();
            this.clientId = knotConfiguration.getClientId();
            this.sessionId = knotConfiguration.getSessionId();
            this.knotEventDelegate = knotEventDelegate;
            BreadcrumbHelper.trackSession("SDK init - Session: " + this.sessionId, BreadcrumbHelper.Category.INITIALIZATION);
            if (this.environment != null) {
                BreadcrumbHelper.trackSession("Environment: " + this.environment.name(), BreadcrumbHelper.Category.CONFIGURATION);
            }
            this.merchantIds = knotConfiguration.getMerchantIds() != null ? knotConfiguration.getMerchantIds() : new int[0];
            this.useCategories = Boolean.valueOf(knotConfiguration.getUseCategories() != null ? knotConfiguration.getUseCategories().booleanValue() : true);
            this.useSearch = Boolean.valueOf(knotConfiguration.getUseSearch() != null ? knotConfiguration.getUseSearch().booleanValue() : true);
            this.domainUrls = knotConfiguration.getDomainUrls();
            this.entryPoint = knotConfiguration.getEntryPoint();
            this.customerConfiguration = knotConfiguration.getCustomerConfiguration();
            Context context2 = this.context;
            String str = this.sessionId;
            Environment environment = this.environment;
            CrashHandler.initialize(context2, str, environment != null ? environment.name() : null);
            BreadcrumbHelper.trackSession("Crash handler initialized", BreadcrumbHelper.Category.INITIALIZATION);
            String str2 = this.sessionId;
            Environment environment2 = this.environment;
            Reporter.setSessionInfo(str2, environment2 != null ? environment2.name() : null);
            if (AnalyticsManager.getInstance(this.environment) == null) {
                Reporter.error(new IllegalArgumentException("AnalyticsManager instance is null."), "AnalyticsManager Initialization");
                BreadcrumbHelper.trackSession("Analytics init failed", BreadcrumbHelper.Category.ERROR);
            } else {
                BreadcrumbHelper.trackSession("Analytics initialized", BreadcrumbHelper.Category.INITIALIZATION);
            }
            BreadcrumbHelper.trackSession("Launching KnotActivity", BreadcrumbHelper.Category.NAVIGATION);
            openProduct(context);
        } catch (Exception e) {
            Reporter.error(e, "openSession");
        }
    }

    public void registerOpenedActivity(Activity activity) {
        if (activity != null) {
            this.openedActivityRef = new WeakReference<>(activity);
        }
    }
}
