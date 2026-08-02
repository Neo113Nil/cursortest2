package com.fillr.analytics.metrics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class FAConfig {
    public static boolean DEBUG = false;
    public static FAConfig sInstance;
    public static final Object sInstanceLock = new Object();
    public final int mBulkUploadLimit;
    public final int mDataExpiration;
    public final boolean mDisableAppOpenEvent;
    public final boolean mDisableFallback;
    public final String mEventsEndpoint;
    public final String mEventsFallbackEndpoint;
    public final int mFlushInterval;
    public final int mMinimumDatabaseLimit;
    public final String mPeopleEndpoint;
    public final String mPeopleFallbackEndpoint;
    public final SSLSocketFactory mSSLSocketFactory;

    public FAConfig(Context context, Bundle bundle) {
        SSLSocketFactory sSLSocketFactory = null;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            sSLSocketFactory = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            String.format("System has no SSL support. Built-in events editor will not be available s%", e.getCause());
        }
        this.mSSLSocketFactory = sSLSocketFactory;
        DEBUG = bundle.getBoolean("com.fillr.analytics.FAConfig.EnableDebugLogging", false);
        bundle.containsKey("com.fillr.analytics.FAConfig.DebugFlushInterval");
        this.mBulkUploadLimit = bundle.getInt("com.fillr.analytics.FAConfig.BulkUploadLimit", 40);
        this.mFlushInterval = bundle.getInt("com.fillr.analytics.FAConfig.FlushInterval", 60000);
        this.mDataExpiration = bundle.getInt("com.fillr.analytics.FAConfig.DataExpiration", 432000000);
        this.mMinimumDatabaseLimit = bundle.getInt("com.fillr.analytics.FAConfig.MinimumDatabaseLimit", 20971520);
        this.mDisableFallback = bundle.getBoolean("com.fillr.analytics.FAConfig.DisableFallback", true);
        bundle.getString("com.fillr.analytics.FAConfig.ResourcePackageName");
        bundle.getBoolean("com.fillr.analytics.FAConfig.DisableGestureBindingUI", false);
        bundle.getBoolean("com.fillr.analytics.FAConfig.DisableEmulatorBindingUI", false);
        this.mDisableAppOpenEvent = bundle.getBoolean("com.fillr.analytics.FAConfig.DisableAppOpenEvent", true);
        bundle.getBoolean("com.fillr.analytics.FAConfig.DisableViewCrawler", false);
        bundle.getBoolean("com.fillr.analytics.FAConfig.DisableDecideChecker", false);
        bundle.getInt("com.fillr.analytics.FAConfig.ImageCacheMaxMemoryFactor", 10);
        bundle.getBoolean("com.fillr.analytics.FAConfig.IgnoreInvisibleViewsVisualEditor", false);
        bundle.getBoolean("com.fillr.analytics.FAConfig.AutoShowMixpanelUpdates", true);
        bundle.getBoolean("com.fillr.analytics.FAConfig.TestMode", false);
        String string2 = bundle.getString("com.fillr.analytics.FAConfig.EventsEndpoint");
        this.mEventsEndpoint = string2 == null ? "https://api.fillr.com/track?ip=1" : string2;
        this.mEventsFallbackEndpoint = bundle.getString("com.fillr.analytics.FAConfig.EventsFallbackEndpoint");
        String string3 = bundle.getString("com.fillr.analytics.FAConfig.PeopleEndpoint");
        this.mPeopleEndpoint = string3 == null ? "https://api.fillr.com/track" : string3;
        String string4 = bundle.getString("com.fillr.analytics.FAConfig.PeopleFallbackEndpoint");
        this.mPeopleFallbackEndpoint = string4 != null ? string4 : "https://api.fillr.com/track";
        bundle.getString("com.fillr.analytics.FAConfig.DecideEndpoint");
        bundle.getString("com.fillr.analytics.FAConfig.DecideFallbackEndpoint");
        bundle.getString("com.fillr.analytics.FAConfig.EditorUrl");
        int i = bundle.getInt("com.fillr.analytics.FAConfig.DisableViewCrawlerForProjects", -1);
        if (i != -1) {
            context.getResources().getStringArray(i);
        }
    }

    public static FAConfig getInstance(Context context) {
        FAConfig fAConfig;
        synchronized (sInstanceLock) {
            try {
                if (sInstance == null) {
                    Context applicationContext = context.getApplicationContext();
                    String packageName = applicationContext.getPackageName();
                    try {
                        Bundle bundle = applicationContext.getPackageManager().getApplicationInfo(packageName, 128).metaData;
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        fAConfig = new FAConfig(applicationContext, bundle);
                    } catch (PackageManager.NameNotFoundException e) {
                        OptionalProvider$$ExternalSyntheticLambda0.m(Recorder$$ExternalSyntheticOutline2.m("Can't configure Mixpanel with package name ", packageName), (Throwable) e);
                        fAConfig = null;
                    }
                    sInstance = fAConfig;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sInstance;
    }

    public final synchronized SSLSocketFactory getSSLSocketFactory() {
        return this.mSSLSocketFactory;
    }
}
