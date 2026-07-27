package android.content.Context;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCamera2PixelSpectraAlpha7690 {
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public Object FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public Serializable FrostHunterLifecycleBlazeGammaElite2889;
    public Serializable FrostHunterServiceEliteCelestialThunder1757;

    public static String FrostHunterBundlePulseFusionHero2475(com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754) {
        frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterFlowDragonHyperionPixel5649 frostHunterFlowDragonHyperionPixel5649 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBundlePulseFusionHero2475;
        String str = frostHunterFlowDragonHyperionPixel5649.FrostHunterLifecycleBlazeGammaElite2889;
        if (str != null) {
            return str;
        }
        frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
        String str2 = frostHunterFlowDragonHyperionPixel5649.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761 + 1;
        long[] jArr = (long[]) this.FrostHunterBundlePulseFusionHero2475;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            ?? r2 = new int[i2];
            FrostHunterContextSolarMegaPhantom7469.FrostHunterImageAnalysisGammaOlympian2400(jArr, jArr2, 0, 0, jArr.length);
            FrostHunterContextSolarMegaPhantom7469.FrostHunterInAppPurchaseLegendEpicDragon4579(0, 0, 14, (int[]) this.FrostHunterServiceEliteCelestialThunder1757, r2);
            this.FrostHunterBundlePulseFusionHero2475 = jArr2;
            this.FrostHunterServiceEliteCelestialThunder1757 = r2;
        }
        int i3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i3 + 1;
        int length2 = ((int[]) this.FrostHunterLifecycleBlazeGammaElite2889).length;
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 >= length2) {
            int i4 = length2 * 2;
            ?? r22 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                r22[i5] = i6;
                i5 = i6;
            }
            FrostHunterContextSolarMegaPhantom7469.FrostHunterInAppPurchaseLegendEpicDragon4579(0, 0, 14, (int[]) this.FrostHunterLifecycleBlazeGammaElite2889, r22);
            this.FrostHunterLifecycleBlazeGammaElite2889 = r22;
        }
        int i7 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr = (int[]) this.FrostHunterLifecycleBlazeGammaElite2889;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = iArr[i7];
        long[] jArr3 = (long[]) this.FrostHunterBundlePulseFusionHero2475;
        jArr3[i3] = j;
        ((int[]) this.FrostHunterServiceEliteCelestialThunder1757)[i3] = i7;
        iArr[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(jArr3[i8], j) <= 0) {
                break;
            }
            FrostHunterRemoteConfigSpeedSpeed8566(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public synchronized String FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        try {
            if (((String) this.FrostHunterServiceEliteCelestialThunder1757) == null) {
                FrostHunterLifecycleBlazeGammaElite2889();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.FrostHunterServiceEliteCelestialThunder1757;
    }

    public void FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    public synchronized void FrostHunterLifecycleBlazeGammaElite2889() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.FrostHunterBundlePulseFusionHero2475).getPackageManager().getPackageInfo(((Context) this.FrostHunterBundlePulseFusionHero2475).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.FrostHunterServiceEliteCelestialThunder1757 = Integer.toString(packageInfo.versionCode);
            this.FrostHunterLifecycleBlazeGammaElite2889 = packageInfo.versionName;
        }
    }

    public void FrostHunterRemoteConfigSpeedSpeed8566(int i, int i2) {
        long[] jArr = (long[]) this.FrostHunterBundlePulseFusionHero2475;
        int[] iArr = (int[]) this.FrostHunterServiceEliteCelestialThunder1757;
        int[] iArr2 = (int[]) this.FrostHunterLifecycleBlazeGammaElite2889;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public boolean FrostHunterServiceEliteCelestialThunder1757() {
        int i;
        synchronized (this) {
            i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.FrostHunterBundlePulseFusionHero2475).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i = 0;
                } else {
                    if (!FrostHunterVectorDrawableForceMax1351.FrostHunterBitmapTurboDeltaNebula8743()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        if (FrostHunterVectorDrawableForceMax1351.FrostHunterBitmapTurboDeltaNebula8743()) {
                            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 2;
                        } else {
                            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 1;
                        }
                        i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    } else {
                        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 2;
                        i = 2;
                    }
                }
            }
        }
        return i != 0;
    }
}
