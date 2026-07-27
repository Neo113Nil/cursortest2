package android.content.Context;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterTextRecognitionNebulaGamma2828 extends FrostHunterTextInputLayoutBlazePhoenix5492 {
    public static Class FrostHunterAlphaAnimationNeoCosmos5761 = null;
    public static Method FrostHunterBundlePulseFusionHero2475 = null;
    public static Constructor FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
    public static boolean FrostHunterLifecycleBlazeGammaElite2889 = false;
    public static Method FrostHunterServiceEliteCelestialThunder1757;

    public static void FrostHunterFragmentBetaMegaVortex6025() {
        Method method;
        Class<?> cls;
        Method method2;
        if (FrostHunterLifecycleBlazeGammaElite2889) {
            return;
        }
        FrostHunterLifecycleBlazeGammaElite2889 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = constructor;
        FrostHunterAlphaAnimationNeoCosmos5761 = cls;
        FrostHunterBundlePulseFusionHero2475 = method2;
        FrostHunterServiceEliteCelestialThunder1757 = method;
    }

    public static boolean FrostHunterKeyframeGammaGamma1197(Object obj, String str, int i, boolean z) {
        FrostHunterFragmentBetaMegaVortex6025();
        try {
            return ((Boolean) FrostHunterBundlePulseFusionHero2475.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface FrostHunterBundlePulseFusionHero2475(Context context, FrostHunterPreviewHyperionMegaInferno5813[] frostHunterPreviewHyperionMegaInferno5813Arr) {
        File file;
        File FrostHunterLevelListDrawableFusionDragonHero2232;
        Typeface createFromFile;
        String readlink;
        if (frostHunterPreviewHyperionMegaInferno5813Arr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(FrostHunterTextInputLayoutBlazePhoenix5492.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterPreviewHyperionMegaInferno5813Arr).FrostHunterAlphaAnimationNeoCosmos5761, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile2 = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLiveDataEpicNeoPrime2305.FrostHunterLevelListDrawableFusionDragonHero2232(context);
                            if (FrostHunterLevelListDrawableFusionDragonHero2232 != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    FrostHunterLevelListDrawableFusionDragonHero2232.delete();
                                    throw th;
                                }
                                if (FrostHunterLiveDataEpicNeoPrime2305.FrostHunterBundlePulseFusionHero2475(FrostHunterLevelListDrawableFusionDragonHero2232, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(FrostHunterLevelListDrawableFusionDragonHero2232.getPath());
                                    FrostHunterLevelListDrawableFusionDragonHero2232.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                FrostHunterLevelListDrawableFusionDragonHero2232.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLiveDataEpicNeoPrime2305.FrostHunterLevelListDrawableFusionDragonHero2232(context);
                        if (FrostHunterLevelListDrawableFusionDragonHero2232 != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile22 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    public Typeface FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context, FrostHunterDataBindingHyperionEclipseNova9876 frostHunterDataBindingHyperionEclipseNova9876, Resources resources) {
        FrostHunterFragmentBetaMegaVortex6025();
        try {
            Object newInstance = FrostHunterConstraintSetCloneMasterUltraRogue2633.newInstance(null);
            for (FrostHunterOnLongClickListenerGammaNovaXMaster7595 frostHunterOnLongClickListenerGammaNovaXMaster7595 : frostHunterDataBindingHyperionEclipseNova9876.FrostHunterAlphaAnimationNeoCosmos5761) {
                File FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLiveDataEpicNeoPrime2305.FrostHunterLevelListDrawableFusionDragonHero2232(context);
                if (FrostHunterLevelListDrawableFusionDragonHero2232 == null) {
                    return null;
                }
                try {
                    if (!FrostHunterLiveDataEpicNeoPrime2305.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLevelListDrawableFusionDragonHero2232, resources, frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterLevelListDrawableFusionDragonHero2232)) {
                        return null;
                    }
                    if (!FrostHunterKeyframeGammaGamma1197(newInstance, FrostHunterLevelListDrawableFusionDragonHero2232.getPath(), frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterBundlePulseFusionHero2475)) {
                        return null;
                    }
                    FrostHunterLevelListDrawableFusionDragonHero2232.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    FrostHunterLevelListDrawableFusionDragonHero2232.delete();
                }
            }
            FrostHunterFragmentBetaMegaVortex6025();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) FrostHunterAlphaAnimationNeoCosmos5761, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) FrostHunterServiceEliteCelestialThunder1757.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
