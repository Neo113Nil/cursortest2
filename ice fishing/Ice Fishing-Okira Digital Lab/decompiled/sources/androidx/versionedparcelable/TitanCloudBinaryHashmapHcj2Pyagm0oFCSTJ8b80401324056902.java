package androidx.versionedparcelable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class TitanCloudBinaryHashmapHcj2Pyagm0oFCSTJ8b80401324056902 {
    public static final HashMap ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new HashMap();
    public static final HashMap AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new HashMap();

    public static int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Class cls) {
        Constructor<?> constructor;
        boolean z;
        HashMap hashMap = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
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
                String concat = AxiomCoreMonitorWorkerEpOThAFmoCLxMwibdJ72468267872406.JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987(canonicalName, ".", "_").concat("_LifecycleAdapter");
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
            HashMap hashMap2 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            if (constructor != null) {
                hashMap2.put(cls, ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(constructor));
            } else {
                NovaLayerResolverParserJnBBDE5P95uODD1xci89393299813941 novaLayerResolverParserJnBBDE5P95uODD1xci89393299813941 = NovaLayerResolverParserJnBBDE5P95uODD1xci89393299813941.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                HashMap hashMap3 = novaLayerResolverParserJnBBDE5P95uODD1xci89393299813941.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
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
                            if (((EmeraldStackStatePacketGA0jgdXdy5oI6DMSKg13956253476490) declaredMethods[i2].getAnnotation(EmeraldStackStatePacketGA0jgdXdy5oI6DMSKg13956253476490.class)) != null) {
                                novaLayerResolverParserJnBBDE5P95uODD1xci89393299813941.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(cls, declaredMethods);
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
                    if (superclass != null && JadeCircuitResourceValidationAVt47hTUQWsszZEf2t61060163808152.class.isAssignableFrom(superclass)) {
                        superclass.getClass();
                        if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(superclass) != 1) {
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
                            if (cls2 != null && JadeCircuitResourceValidationAVt47hTUQWsszZEf2t61060163808152.class.isAssignableFrom(cls2)) {
                                cls2.getClass();
                                if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(cls2) == 1) {
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

    public static void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Constructor constructor, JadeCircuitResourceValidationAVt47hTUQWsszZEf2t61060163808152 jadeCircuitResourceValidationAVt47hTUQWsszZEf2t61060163808152) {
        try {
            constructor.newInstance(jadeCircuitResourceValidationAVt47hTUQWsszZEf2t61060163808152).getClass();
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
