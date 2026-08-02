package com.icefishing.icefishingmoneygame11.core;

import android.app.Application;
import android.os.Build;
import android.webkit.WebView;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* loaded from: classes2.dex */
public class AppController extends Application {
    private static AppController mInstance;

    static /* synthetic */ void lambda$onCreate$0(InitializationStatus initializationStatus) {
    }

    public static synchronized AppController getInstance() {
        AppController appController;
        synchronized (AppController.class) {
            appController = mInstance;
        }
        return appController;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = getProcessName();
            if (!getPackageName().equals(processName)) {
                WebView.setDataDirectorySuffix(processName);
            }
        }
        mInstance = this;
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.icefishing.icefishingmoneygame11.core.AppController$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                AppController.lambda$onCreate$0(initializationStatus);
            }
        });
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }
}
