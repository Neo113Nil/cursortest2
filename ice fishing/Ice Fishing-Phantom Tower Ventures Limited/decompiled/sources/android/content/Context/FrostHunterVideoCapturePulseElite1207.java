package android.content.Context;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterVideoCapturePulseElite1207 {
    public static final List FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(Application.class, FrostHunterStateFlowCosmosTurboPhantom3869.class);
    public static final List FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterCardViewHyperionAurora3829.FrostHunterR8MasterNebulaSpark7247(FrostHunterStateFlowCosmosTurboPhantom3869.class);

    public static final Constructor FrostHunterAlphaAnimationNeoCosmos5761(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List FrostHunterItemDecorationPhoenixAlphaVortex8006 = FrostHunterContextSolarMegaPhantom7469.FrostHunterItemDecorationPhoenixAlphaVortex8006(parameterTypes);
            if (list.equals(FrostHunterItemDecorationPhoenixAlphaVortex8006)) {
                return constructor;
            }
            if (list.size() == FrostHunterItemDecorationPhoenixAlphaVortex8006.size() && FrostHunterItemDecorationPhoenixAlphaVortex8006.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final FrostHunterFragmentCosmosSolar3628 FrostHunterConstraintSetCloneMasterUltraRogue2633(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (FrostHunterFragmentCosmosSolar3628) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterKeyframeGammaGamma1197("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
