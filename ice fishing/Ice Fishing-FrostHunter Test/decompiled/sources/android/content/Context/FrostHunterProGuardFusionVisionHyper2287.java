package android.content.Context;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterProGuardFusionVisionHyper2287 {
    public static final HashMap FrostHunterAlphaAnimationNeoCosmos5761 = new HashMap();
    public static final HashMap FrostHunterConstraintSetCloneMasterUltraRogue2633 = new HashMap();

    public static void FrostHunterAlphaAnimationNeoCosmos5761(Constructor constructor, FrostHunterColorDrawableNebulaPulseCelestial8992 frostHunterColorDrawableNebulaPulseCelestial8992) {
        try {
            constructor.newInstance(frostHunterColorDrawableNebulaPulseCelestial8992).getClass();
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static int FrostHunterConstraintSetCloneMasterUltraRogue2633(Class cls) {
        Constructor<?> constructor;
        boolean z;
        HashMap hashMap = FrostHunterAlphaAnimationNeoCosmos5761;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String concat = FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (constructor != null) {
                hashMap2.put(cls, FrostHunterCardViewHyperionAurora3829.FrostHunterR8MasterNebulaSpark7247(constructor));
            } else {
                FrostHunterTextureViewShadowPulse6060 frostHunterTextureViewShadowPulse6060 = FrostHunterTextureViewShadowPulse6060.FrostHunterBundlePulseFusionHero2475;
                HashMap hashMap3 = frostHunterTextureViewShadowPulse6060.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                            if (((FrostHunterButtonVortexTitan9062) declaredMethods[i2].getAnnotation(FrostHunterButtonVortexTitan9062.class)) != null) {
                                frostHunterTextureViewShadowPulse6060.FrostHunterAlphaAnimationNeoCosmos5761(cls, declaredMethods);
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && FrostHunterColorDrawableNebulaPulseCelestial8992.class.isAssignableFrom(superclass)) {
                        superclass.getClass();
                        if (FrostHunterConstraintSetCloneMasterUltraRogue2633(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    interfaces.getClass();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && FrostHunterColorDrawableNebulaPulseCelestial8992.class.isAssignableFrom(cls2)) {
                                cls2.getClass();
                                if (FrostHunterConstraintSetCloneMasterUltraRogue2633(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                obj2.getClass();
                                arrayList.addAll((Collection) obj2);
                            }
                            i3++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
