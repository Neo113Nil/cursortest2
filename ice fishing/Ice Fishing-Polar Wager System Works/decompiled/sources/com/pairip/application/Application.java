package com.pairip.application;

/* loaded from: classes.dex */
public class Application extends com.corsair.ledger.CorsairApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        com.pairip.licensecheck.LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
