package com.google.android.filament;

/* loaded from: classes.dex */
public abstract class Platform {
    public static Platform mCurrentPlatform;

    /* loaded from: classes6.dex */
    public final class UnknownPlatform extends Platform {
        @Override // com.google.android.filament.Platform
        public final boolean validateSurface(Object obj) {
            return false;
        }
    }

    public static Platform get() {
        if (mCurrentPlatform == null) {
            try {
                if ("The Android Project".equalsIgnoreCase(System.getProperty("java.vendor"))) {
                    int i = AndroidPlatform.$r8$clinit;
                    mCurrentPlatform = (Platform) AndroidPlatform.class.newInstance();
                } else {
                    mCurrentPlatform = (Platform) Class.forName("com.google.android.filament.DesktopPlatform").newInstance();
                }
            } catch (Exception unused) {
            }
            if (mCurrentPlatform == null) {
                mCurrentPlatform = new UnknownPlatform();
            }
        }
        return mCurrentPlatform;
    }

    public abstract boolean validateSurface(Object obj);
}
