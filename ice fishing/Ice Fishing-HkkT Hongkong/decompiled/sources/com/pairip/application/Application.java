package com.pairip.application;

import android.content.Context;
import com.icefishing.icefishingmoneygame11.core.AppController;
import com.pairip.licensecheck.LicenseClient;

/* loaded from: classes.dex */
public class Application extends AppController {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
