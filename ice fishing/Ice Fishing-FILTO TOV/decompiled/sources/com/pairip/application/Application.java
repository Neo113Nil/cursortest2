package com.pairip.application;

import android.content.Context;
import com.combinations.level.experts.XenoloopApplication;
import com.pairip.licensecheck.LicenseClient;

/* loaded from: classes.dex */
public class Application extends XenoloopApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
