package android.content.Context;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTextureViewShadowPulse6060 {
    public static final FrostHunterTextureViewShadowPulse6060 FrostHunterBundlePulseFusionHero2475 = new FrostHunterTextureViewShadowPulse6060();
    public final HashMap FrostHunterAlphaAnimationNeoCosmos5761 = new HashMap();
    public final HashMap FrostHunterConstraintSetCloneMasterUltraRogue2633 = new HashMap();

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(HashMap hashMap, FrostHunterRotateDrawableEliteNovaXForce9868 frostHunterRotateDrawableEliteNovaXForce9868, FrostHunterMaterialCardViewLegendDragon2868 frostHunterMaterialCardViewLegendDragon2868, Class cls) {
        FrostHunterMaterialCardViewLegendDragon2868 frostHunterMaterialCardViewLegendDragon28682 = (FrostHunterMaterialCardViewLegendDragon2868) hashMap.get(frostHunterRotateDrawableEliteNovaXForce9868);
        if (frostHunterMaterialCardViewLegendDragon28682 == null || frostHunterMaterialCardViewLegendDragon2868 == frostHunterMaterialCardViewLegendDragon28682) {
            if (frostHunterMaterialCardViewLegendDragon28682 == null) {
                hashMap.put(frostHunterRotateDrawableEliteNovaXForce9868, frostHunterMaterialCardViewLegendDragon2868);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + frostHunterRotateDrawableEliteNovaXForce9868.FrostHunterConstraintSetCloneMasterUltraRogue2633.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + frostHunterMaterialCardViewLegendDragon28682 + ", new value " + frostHunterMaterialCardViewLegendDragon2868);
    }

    public final FrostHunterLintDragonDelta9380 FrostHunterAlphaAnimationNeoCosmos5761(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (superclass != null) {
            FrostHunterLintDragonDelta9380 frostHunterLintDragonDelta9380 = (FrostHunterLintDragonDelta9380) hashMap2.get(superclass);
            if (frostHunterLintDragonDelta9380 == null) {
                frostHunterLintDragonDelta9380 = FrostHunterAlphaAnimationNeoCosmos5761(superclass, null);
            }
            hashMap.putAll(frostHunterLintDragonDelta9380.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            FrostHunterLintDragonDelta9380 frostHunterLintDragonDelta93802 = (FrostHunterLintDragonDelta9380) hashMap2.get(cls2);
            if (frostHunterLintDragonDelta93802 == null) {
                frostHunterLintDragonDelta93802 = FrostHunterAlphaAnimationNeoCosmos5761(cls2, null);
            }
            for (Map.Entry entry : frostHunterLintDragonDelta93802.FrostHunterConstraintSetCloneMasterUltraRogue2633.entrySet()) {
                FrostHunterConstraintSetCloneMasterUltraRogue2633(hashMap, (FrostHunterRotateDrawableEliteNovaXForce9868) entry.getKey(), (FrostHunterMaterialCardViewLegendDragon2868) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            FrostHunterButtonVortexTitan9062 frostHunterButtonVortexTitan9062 = (FrostHunterButtonVortexTitan9062) method.getAnnotation(FrostHunterButtonVortexTitan9062.class);
            if (frostHunterButtonVortexTitan9062 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!FrostHunterNotificationSpectraTurbo8770.class.isAssignableFrom(parameterTypes[0])) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                FrostHunterMaterialCardViewLegendDragon2868 value = frostHunterButtonVortexTitan9062.value();
                if (parameterTypes.length > 1) {
                    if (!FrostHunterMaterialCardViewLegendDragon2868.class.isAssignableFrom(parameterTypes[1])) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != FrostHunterMaterialCardViewLegendDragon2868.ON_ANY) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("cannot have more than 2 params");
                    return null;
                }
                FrostHunterConstraintSetCloneMasterUltraRogue2633(hashMap, new FrostHunterRotateDrawableEliteNovaXForce9868(i, method), value, cls);
                z = true;
            }
        }
        FrostHunterLintDragonDelta9380 frostHunterLintDragonDelta93803 = new FrostHunterLintDragonDelta9380(hashMap);
        hashMap2.put(cls, frostHunterLintDragonDelta93803);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633.put(cls, Boolean.valueOf(z));
        return frostHunterLintDragonDelta93803;
    }
}
