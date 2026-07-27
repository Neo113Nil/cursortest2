package com.pairip.application;

import android.content.Context;
import com.pairip.licensecheck.LicenseClient;
import com.zennvvarroo.pealkkk.ZenvaroPeakC533Core;

/* loaded from: classes2.dex */
public class Application extends ZenvaroPeakC533Core {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
