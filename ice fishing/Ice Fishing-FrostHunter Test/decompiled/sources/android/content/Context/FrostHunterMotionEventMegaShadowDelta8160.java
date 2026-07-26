package android.content.Context;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterMotionEventMegaShadowDelta8160 extends FrostHunterTextRecognitionNebulaGamma2828 {
    public final Method FrostHunterAlertDialogAuroraDelta3200;
    public final Method FrostHunterCameraXPixelTurboCosmos9814;
    public final Method FrostHunterFlowMaxDragonHero5809;
    public final Method FrostHunterFragmentBetaMegaVortex6025;
    public final Method FrostHunterKeyframeGammaGamma1197;
    public final Class FrostHunterLevelListDrawableFusionDragonHero2232;
    public final Constructor FrostHunterRemoteConfigSpeedSpeed8566;

    public FrostHunterMotionEventMegaShadowDelta8160() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = FrostHunterLintTitanVortexQuantum9911(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = cls;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = constructor;
        this.FrostHunterCameraXPixelTurboCosmos9814 = method2;
        this.FrostHunterFlowMaxDragonHero5809 = method3;
        this.FrostHunterAlertDialogAuroraDelta3200 = method4;
        this.FrostHunterKeyframeGammaGamma1197 = method5;
        this.FrostHunterFragmentBetaMegaVortex6025 = method;
    }

    public static Method FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // android.content.Context.FrostHunterTextRecognitionNebulaGamma2828, android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    public final Typeface FrostHunterBundlePulseFusionHero2475(Context context, FrostHunterPreviewHyperionMegaInferno5813[] frostHunterPreviewHyperionMegaInferno5813Arr) {
        Object obj;
        Typeface FrostHunterLightSensorForceFusion4241;
        boolean z;
        if (frostHunterPreviewHyperionMegaInferno5813Arr.length >= 1) {
            try {
                if (this.FrostHunterCameraXPixelTurboCosmos9814 != null) {
                    HashMap hashMap = new HashMap();
                    for (FrostHunterPreviewHyperionMegaInferno5813 frostHunterPreviewHyperionMegaInferno5813 : frostHunterPreviewHyperionMegaInferno5813Arr) {
                        if (frostHunterPreviewHyperionMegaInferno5813.FrostHunterLevelListDrawableFusionDragonHero2232 == 0) {
                            Uri uri = frostHunterPreviewHyperionMegaInferno5813.FrostHunterAlphaAnimationNeoCosmos5761;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, FrostHunterLiveDataEpicNeoPrime2305.FrostHunterCameraXPixelTurboCosmos9814(uri, context));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.FrostHunterRemoteConfigSpeedSpeed8566.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = frostHunterPreviewHyperionMegaInferno5813Arr.length;
                        int i = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method = this.FrostHunterKeyframeGammaGamma1197;
                            if (i < length) {
                                FrostHunterPreviewHyperionMegaInferno5813 frostHunterPreviewHyperionMegaInferno58132 = frostHunterPreviewHyperionMegaInferno5813Arr[i];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(frostHunterPreviewHyperionMegaInferno58132.FrostHunterAlphaAnimationNeoCosmos5761);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.FrostHunterFlowMaxDragonHero5809.invoke(obj, byteBuffer, Integer.valueOf(frostHunterPreviewHyperionMegaInferno58132.FrostHunterConstraintSetCloneMasterUltraRogue2633), null, Integer.valueOf(frostHunterPreviewHyperionMegaInferno58132.FrostHunterBundlePulseFusionHero2475), Integer.valueOf(frostHunterPreviewHyperionMegaInferno58132.FrostHunterServiceEliteCelestialThunder1757 ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i++;
                                z2 = z2;
                            } else if (!z2) {
                                method.invoke(obj, null);
                            } else if (FrostHunterScaleAnimationStrikeSpark5059(obj) && (FrostHunterLightSensorForceFusion4241 = FrostHunterLightSensorForceFusion4241(obj)) != null) {
                                return Typeface.create(FrostHunterLightSensorForceFusion4241, 0);
                            }
                        }
                    }
                } else {
                    FrostHunterPreviewHyperionMegaInferno5813 FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterTextInputLayoutBlazePhoenix5492.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterPreviewHyperionMegaInferno5813Arr);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterBundlePulseFusionHero2475).setItalic(FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterServiceEliteCelestialThunder1757).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterTextRecognitionNebulaGamma2828, android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    public final Typeface FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context, FrostHunterDataBindingHyperionEclipseNova9876 frostHunterDataBindingHyperionEclipseNova9876, Resources resources) {
        Object obj;
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == null) {
            return super.FrostHunterConstraintSetCloneMasterUltraRogue2633(context, frostHunterDataBindingHyperionEclipseNova9876, resources);
        }
        try {
            obj = this.FrostHunterRemoteConfigSpeedSpeed8566.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            FrostHunterOnLongClickListenerGammaNovaXMaster7595[] frostHunterOnLongClickListenerGammaNovaXMaster7595Arr = frostHunterDataBindingHyperionEclipseNova9876.FrostHunterAlphaAnimationNeoCosmos5761;
            int length = frostHunterOnLongClickListenerGammaNovaXMaster7595Arr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    FrostHunterOnLongClickListenerGammaNovaXMaster7595 frostHunterOnLongClickListenerGammaNovaXMaster7595 = frostHunterOnLongClickListenerGammaNovaXMaster7595Arr[i];
                    String str = frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i2 = frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterLifecycleBlazeGammaElite2889;
                    int i3 = frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    boolean z = frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterBundlePulseFusionHero2475;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterServiceEliteCelestialThunder1757);
                    FrostHunterMotionEventMegaShadowDelta8160 frostHunterMotionEventMegaShadowDelta8160 = this;
                    Context context2 = context;
                    if (frostHunterMotionEventMegaShadowDelta8160.FrostHunterServiceConnectionTurboPhoenixOmega6719(context2, obj, str, i2, i3, z ? 1 : 0, fromFontVariationSettings)) {
                        i++;
                        this = frostHunterMotionEventMegaShadowDelta8160;
                        context = context2;
                    } else {
                        try {
                            frostHunterMotionEventMegaShadowDelta8160.FrostHunterKeyframeGammaGamma1197.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else {
                    FrostHunterMotionEventMegaShadowDelta8160 frostHunterMotionEventMegaShadowDelta81602 = this;
                    if (frostHunterMotionEventMegaShadowDelta81602.FrostHunterScaleAnimationStrikeSpark5059(obj)) {
                        return frostHunterMotionEventMegaShadowDelta81602.FrostHunterLightSensorForceFusion4241(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    public final Typeface FrostHunterLifecycleBlazeGammaElite2889(Context context, Resources resources, String str) {
        Object obj;
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == null) {
            return super.FrostHunterLifecycleBlazeGammaElite2889(context, resources, str);
        }
        try {
            obj = this.FrostHunterRemoteConfigSpeedSpeed8566.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!FrostHunterServiceConnectionTurboPhoenixOmega6719(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.FrostHunterKeyframeGammaGamma1197.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (FrostHunterScaleAnimationStrikeSpark5059(obj)) {
                return FrostHunterLightSensorForceFusion4241(obj);
            }
        }
        return null;
    }

    public Typeface FrostHunterLightSensorForceFusion4241(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.FrostHunterLevelListDrawableFusionDragonHero2232, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.FrostHunterFragmentBetaMegaVortex6025.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method FrostHunterLintTitanVortexQuantum9911(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final boolean FrostHunterScaleAnimationStrikeSpark5059(Object obj) {
        try {
            return ((Boolean) this.FrostHunterAlertDialogAuroraDelta3200.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean FrostHunterServiceConnectionTurboPhoenixOmega6719(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.FrostHunterCameraXPixelTurboCosmos9814.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
