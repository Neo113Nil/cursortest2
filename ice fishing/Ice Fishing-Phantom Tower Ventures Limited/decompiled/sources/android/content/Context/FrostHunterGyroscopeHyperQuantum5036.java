package android.content.Context;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterGyroscopeHyperQuantum5036 {
    public static final FrostHunterManifestPulseHyperSolar1207 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterManifestPulseHyperSolar1207();
    public static final Object FrostHunterConstraintSetCloneMasterUltraRogue2633 = new Object();
    public static FrostHunterServiceInfoEclipseAurora7011 FrostHunterBundlePulseFusionHero2475 = null;

    public static long FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? FrostHunterTypefacePhantomUltra7139.FrostHunterAlphaAnimationNeoCosmos5761(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void FrostHunterBundlePulseFusionHero2475(Context context, boolean z) {
        boolean z2;
        FrostHunterDialogVisionPrime4170 FrostHunterAlphaAnimationNeoCosmos57612;
        FrostHunterDialogVisionPrime4170 frostHunterDialogVisionPrime4170;
        int i;
        if (z || FrostHunterBundlePulseFusionHero2475 == null) {
            synchronized (FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                if (!z) {
                    if (FrostHunterBundlePulseFusionHero2475 != null) {
                        return;
                    }
                }
                int i2 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z2 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterAlphaAnimationNeoCosmos5761(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterDialogVisionPrime4170.FrostHunterAlphaAnimationNeoCosmos5761(file3);
                            } catch (IOException unused2) {
                                FrostHunterConstraintSetCloneMasterUltraRogue2633();
                                return;
                            }
                        } else {
                            FrostHunterAlphaAnimationNeoCosmos57612 = null;
                        }
                        if (FrostHunterAlphaAnimationNeoCosmos57612 != null && FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterBundlePulseFusionHero2475 == FrostHunterAlphaAnimationNeoCosmos57613 && (i = FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterConstraintSetCloneMasterUltraRogue2633) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (FrostHunterAlphaAnimationNeoCosmos57612 != null && FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 2 && i2 == 1 && length < FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterServiceEliteCelestialThunder1757) {
                                i2 = 3;
                            }
                            frostHunterDialogVisionPrime4170 = new FrostHunterDialogVisionPrime4170(1, i2, FrostHunterAlphaAnimationNeoCosmos57613, length2);
                            if (FrostHunterAlphaAnimationNeoCosmos57612 != null || !FrostHunterAlphaAnimationNeoCosmos57612.equals(frostHunterDialogVisionPrime4170)) {
                                frostHunterDialogVisionPrime4170.FrostHunterConstraintSetCloneMasterUltraRogue2633(file3);
                            }
                            FrostHunterConstraintSetCloneMasterUltraRogue2633();
                            return;
                        }
                        if (z3) {
                            i2 = 1;
                        } else if (z4) {
                            i2 = 2;
                        }
                        if (z) {
                            i2 = 2;
                        }
                        if (FrostHunterAlphaAnimationNeoCosmos57612 != null) {
                            i2 = 3;
                        }
                        frostHunterDialogVisionPrime4170 = new FrostHunterDialogVisionPrime4170(1, i2, FrostHunterAlphaAnimationNeoCosmos57613, length2);
                        if (FrostHunterAlphaAnimationNeoCosmos57612 != null) {
                        }
                        frostHunterDialogVisionPrime4170.FrostHunterConstraintSetCloneMasterUltraRogue2633(file3);
                        FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        return;
                    }
                }
                FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
        }
    }

    public static FrostHunterServiceInfoEclipseAurora7011 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterServiceInfoEclipseAurora7011 frostHunterServiceInfoEclipseAurora7011 = new FrostHunterServiceInfoEclipseAurora7011(19);
        FrostHunterBundlePulseFusionHero2475 = frostHunterServiceInfoEclipseAurora7011;
        FrostHunterManifestPulseHyperSolar1207 frostHunterManifestPulseHyperSolar1207 = FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterManifestPulseHyperSolar1207.getClass();
        if (FrostHunterChipQuantumVision8640.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterFlowMaxDragonHero5809(frostHunterManifestPulseHyperSolar1207, null, frostHunterServiceInfoEclipseAurora7011)) {
            FrostHunterChipQuantumVision8640.FrostHunterBundlePulseFusionHero2475(frostHunterManifestPulseHyperSolar1207);
        }
        return FrostHunterBundlePulseFusionHero2475;
    }
}
