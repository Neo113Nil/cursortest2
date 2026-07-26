package android.content.Context;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterVectorDrawableBetaAuroraFusion3307 extends FrostHunterTextInputLayoutBlazePhoenix5492 {
    public static final Class FrostHunterAlphaAnimationNeoCosmos5761;
    public static final Method FrostHunterBundlePulseFusionHero2475;
    public static final Constructor FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public static final Method FrostHunterServiceEliteCelestialThunder1757;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = constructor;
        FrostHunterAlphaAnimationNeoCosmos5761 = cls;
        FrostHunterBundlePulseFusionHero2475 = method2;
        FrostHunterServiceEliteCelestialThunder1757 = method;
    }

    public static Typeface FrostHunterFragmentBetaMegaVortex6025(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) FrostHunterAlphaAnimationNeoCosmos5761, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) FrostHunterServiceEliteCelestialThunder1757.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean FrostHunterKeyframeGammaGamma1197(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) FrostHunterBundlePulseFusionHero2475.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    public final Typeface FrostHunterBundlePulseFusionHero2475(Context context, FrostHunterPreviewHyperionMegaInferno5813[] frostHunterPreviewHyperionMegaInferno5813Arr) {
        Object obj;
        try {
            obj = FrostHunterConstraintSetCloneMasterUltraRogue2633.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            FrostHunterTimerCosmosCyberLegend3595 frostHunterTimerCosmosCyberLegend3595 = new FrostHunterTimerCosmosCyberLegend3595(0);
            int length = frostHunterPreviewHyperionMegaInferno5813Arr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    FrostHunterPreviewHyperionMegaInferno5813 frostHunterPreviewHyperionMegaInferno5813 = frostHunterPreviewHyperionMegaInferno5813Arr[i];
                    Uri uri = frostHunterPreviewHyperionMegaInferno5813.FrostHunterAlphaAnimationNeoCosmos5761;
                    ByteBuffer byteBuffer = (ByteBuffer) frostHunterTimerCosmosCyberLegend3595.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = FrostHunterLiveDataEpicNeoPrime2305.FrostHunterCameraXPixelTurboCosmos9814(uri, context);
                        frostHunterTimerCosmosCyberLegend3595.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !FrostHunterKeyframeGammaGamma1197(obj, byteBuffer, frostHunterPreviewHyperionMegaInferno5813.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterPreviewHyperionMegaInferno5813.FrostHunterBundlePulseFusionHero2475, frostHunterPreviewHyperionMegaInferno5813.FrostHunterServiceEliteCelestialThunder1757)) {
                        break;
                    }
                    i++;
                } else {
                    Typeface FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025(obj);
                    if (FrostHunterFragmentBetaMegaVortex6025 != null) {
                        return Typeface.create(FrostHunterFragmentBetaMegaVortex6025, 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    public final Typeface FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context, FrostHunterDataBindingHyperionEclipseNova9876 frostHunterDataBindingHyperionEclipseNova9876, Resources resources) {
        Object obj;
        int i;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = FrostHunterConstraintSetCloneMasterUltraRogue2633.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (FrostHunterOnLongClickListenerGammaNovaXMaster7595 frostHunterOnLongClickListenerGammaNovaXMaster7595 : frostHunterDataBindingHyperionEclipseNova9876.FrostHunterAlphaAnimationNeoCosmos5761) {
                int i2 = frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterLevelListDrawableFusionDragonHero2232;
                File FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLiveDataEpicNeoPrime2305.FrostHunterLevelListDrawableFusionDragonHero2232(context);
                if (FrostHunterLevelListDrawableFusionDragonHero2232 != null) {
                    try {
                        if (FrostHunterLiveDataEpicNeoPrime2305.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLevelListDrawableFusionDragonHero2232, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(FrostHunterLevelListDrawableFusionDragonHero2232);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i = (mappedByteBuffer != null && FrostHunterKeyframeGammaGamma1197(obj, mappedByteBuffer, frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterLifecycleBlazeGammaElite2889, frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterBundlePulseFusionHero2475)) ? i + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        FrostHunterLevelListDrawableFusionDragonHero2232.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return FrostHunterFragmentBetaMegaVortex6025(obj);
        }
        return null;
    }
}
