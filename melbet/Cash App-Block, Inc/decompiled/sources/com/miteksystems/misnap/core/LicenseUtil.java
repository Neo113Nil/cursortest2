package com.miteksystems.misnap.core;

import android.util.Log;
import com.miteksystems.misnap.core.internal.LicensingNativeWrapper;

/* loaded from: classes9.dex */
public abstract class LicenseUtil {
    public static final boolean a;
    public static final LicensingNativeWrapper b;

    static {
        boolean z;
        LicensingNativeWrapper licensingNativeWrapper = new LicensingNativeWrapper();
        try {
            System.loadLibrary("misnapLicenseVerifier");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("LicensingInternal", "Unable to load licensing library", e);
            z = false;
        }
        a = z;
        b = licensingNativeWrapper;
    }
}
