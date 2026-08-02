package com.icefishingapp.icefishing;

import android.app.Application;
import android.os.Build;
import android.webkit.WebView;
import com.facebook.ads.AudienceNetworkAds;
import q2.J0;

/* loaded from: classes2.dex */
public class MyApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        String processName;
        String processName2;
        String processName3;
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            processName3 = Application.getProcessName();
            if (!getPackageName().equals(processName3)) {
                WebView.setDataDirectorySuffix(processName3);
            }
        }
        if (i >= 28) {
            processName2 = Application.getProcessName();
            if (!getPackageName().equals(processName2)) {
                WebView.setDataDirectorySuffix(processName2);
            }
        }
        AudienceNetworkAds.initialize(this);
        if (i >= 28) {
            processName = Application.getProcessName();
            if (!getPackageName().equals(processName)) {
                WebView.setDataDirectorySuffix(processName);
            }
        }
        J0.c().d(this, new z());
    }
}
