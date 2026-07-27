package com.pairip.application;

import android.content.Context;
import com.catchingfish.fishcatcherpro.presentation.application.FishApp;
import com.pairip.licensecheck.LicenseClient;

/* loaded from: classes.dex */
public class Application extends FishApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
