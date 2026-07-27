package android.content.Context;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterGradlePluginNovaThunderFusion2972 {
    public final FrostHunterViewPager2SpectraForceVortex4544 FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterViewPager2SpectraForceVortex4544 FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterViewPager2SpectraForceVortex4544 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterGradlePluginNovaThunderFusion2972(FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544, FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex45442, FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex45443) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterViewPager2SpectraForceVortex4544;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterViewPager2SpectraForceVortex45442;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterViewPager2SpectraForceVortex45443;
    }

    public abstract FrostHunterContentProviderOmegaGammaStorm3382 FrostHunterAlphaAnimationNeoCosmos5761();

    public final Method FrostHunterBundlePulseFusionHero2475(String str) {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        Method method = (Method) frostHunterViewPager2SpectraForceVortex4544.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, FrostHunterGradlePluginNovaThunderFusion2972.class.getClassLoader()).getDeclaredMethod("read", FrostHunterGradlePluginNovaThunderFusion2972.class);
        frostHunterViewPager2SpectraForceVortex4544.put(str, declaredMethod);
        return declaredMethod;
    }

    public abstract void FrostHunterCameraXPixelTurboCosmos9814(int i);

    public final Class FrostHunterConstraintSetCloneMasterUltraRogue2633(Class cls) {
        String name = cls.getName();
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterBundlePulseFusionHero2475;
        Class cls2 = (Class) frostHunterViewPager2SpectraForceVortex4544.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        frostHunterViewPager2SpectraForceVortex4544.put(cls.getName(), cls3);
        return cls3;
    }

    public final void FrostHunterFlowMaxDragonHero5809(FrostHunterScaleDrawableHyperOmegaAlpha6108 frostHunterScaleDrawableHyperOmegaAlpha6108) {
        if (frostHunterScaleDrawableHyperOmegaAlpha6108 == null) {
            ((FrostHunterContentProviderOmegaGammaStorm3382) this).FrostHunterLifecycleBlazeGammaElite2889.writeString(null);
            return;
        }
        try {
            ((FrostHunterContentProviderOmegaGammaStorm3382) this).FrostHunterLifecycleBlazeGammaElite2889.writeString(FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterScaleDrawableHyperOmegaAlpha6108.getClass()).getName());
            FrostHunterContentProviderOmegaGammaStorm3382 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
            try {
                FrostHunterServiceEliteCelestialThunder1757(frostHunterScaleDrawableHyperOmegaAlpha6108.getClass()).invoke(null, frostHunterScaleDrawableHyperOmegaAlpha6108, FrostHunterAlphaAnimationNeoCosmos5761);
                Parcel parcel = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889;
                int i = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809;
                if (i >= 0) {
                    int i2 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(frostHunterScaleDrawableHyperOmegaAlpha6108.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public final Parcelable FrostHunterLevelListDrawableFusionDragonHero2232(Parcelable parcelable, int i) {
        if (!FrostHunterLifecycleBlazeGammaElite2889(i)) {
            return parcelable;
        }
        return ((FrostHunterContentProviderOmegaGammaStorm3382) this).FrostHunterLifecycleBlazeGammaElite2889.readParcelable(FrostHunterContentProviderOmegaGammaStorm3382.class.getClassLoader());
    }

    public abstract boolean FrostHunterLifecycleBlazeGammaElite2889(int i);

    public final FrostHunterScaleDrawableHyperOmegaAlpha6108 FrostHunterRemoteConfigSpeedSpeed8566() {
        String readString = ((FrostHunterContentProviderOmegaGammaStorm3382) this).FrostHunterLifecycleBlazeGammaElite2889.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (FrostHunterScaleDrawableHyperOmegaAlpha6108) FrostHunterBundlePulseFusionHero2475(readString).invoke(null, FrostHunterAlphaAnimationNeoCosmos5761());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final Method FrostHunterServiceEliteCelestialThunder1757(Class cls) {
        String name = cls.getName();
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Method method = (Method) frostHunterViewPager2SpectraForceVortex4544.get(name);
        if (method != null) {
            return method;
        }
        Class FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(cls);
        System.currentTimeMillis();
        Method declaredMethod = FrostHunterConstraintSetCloneMasterUltraRogue2633.getDeclaredMethod("write", cls, FrostHunterGradlePluginNovaThunderFusion2972.class);
        frostHunterViewPager2SpectraForceVortex4544.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }
}
