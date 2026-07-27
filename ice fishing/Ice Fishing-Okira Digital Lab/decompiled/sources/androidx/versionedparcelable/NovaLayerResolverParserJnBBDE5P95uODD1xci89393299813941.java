package androidx.versionedparcelable;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class NovaLayerResolverParserJnBBDE5P95uODD1xci89393299813941 {
    public static final NovaLayerResolverParserJnBBDE5P95uODD1xci89393299813941 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new NovaLayerResolverParserJnBBDE5P95uODD1xci89393299813941();
    public final HashMap ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new HashMap();
    public final HashMap AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new HashMap();

    public static void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(HashMap hashMap, MysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832 mysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832, NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073, Class cls) {
        NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 novaLayerStateAnnotationXKDio9YaHeDJRrC7C0941349726720732 = (NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073) hashMap.get(mysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832);
        if (novaLayerStateAnnotationXKDio9YaHeDJRrC7C0941349726720732 == null || novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 == novaLayerStateAnnotationXKDio9YaHeDJRrC7C0941349726720732) {
            if (novaLayerStateAnnotationXKDio9YaHeDJRrC7C0941349726720732 == null) {
                hashMap.put(mysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832, novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + mysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + novaLayerStateAnnotationXKDio9YaHeDJRrC7C0941349726720732 + ", new value " + novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073);
    }

    public final DeltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (superclass != null) {
            DeltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693 deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693 = (DeltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693) hashMap2.get(superclass);
            if (deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693 == null) {
                deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(superclass, null);
            }
            hashMap.putAll(deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            DeltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693 deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT909529567316932 = (DeltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693) hashMap2.get(cls2);
            if (deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT909529567316932 == null) {
                deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT909529567316932 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(cls2, null);
            }
            for (Map.Entry entry : deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT909529567316932.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.entrySet()) {
                AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(hashMap, (MysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832) entry.getKey(), (NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073) entry.getValue(), cls);
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
            EmeraldStackStatePacketGA0jgdXdy5oI6DMSKg13956253476490 emeraldStackStatePacketGA0jgdXdy5oI6DMSKg13956253476490 = (EmeraldStackStatePacketGA0jgdXdy5oI6DMSKg13956253476490) method.getAnnotation(EmeraldStackStatePacketGA0jgdXdy5oI6DMSKg13956253476490.class);
            if (emeraldStackStatePacketGA0jgdXdy5oI6DMSKg13956253476490 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014.class.isAssignableFrom(parameterTypes[0])) {
                        CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 value = emeraldStackStatePacketGA0jgdXdy5oI6DMSKg13956253476490.value();
                if (parameterTypes.length > 1) {
                    if (!NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.class.isAssignableFrom(parameterTypes[1])) {
                        CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_ANY) {
                        CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("cannot have more than 2 params");
                    return null;
                }
                AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(hashMap, new MysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832(i, method), value, cls);
                z = true;
            }
        }
        DeltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693 deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT909529567316933 = new DeltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693(hashMap);
        hashMap2.put(cls, deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT909529567316933);
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.put(cls, Boolean.valueOf(z));
        return deltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT909529567316933;
    }
}
