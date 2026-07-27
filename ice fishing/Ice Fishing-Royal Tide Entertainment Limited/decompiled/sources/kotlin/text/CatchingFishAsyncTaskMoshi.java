package kotlin.text;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishAsyncTaskMoshi {
    public static final HashMap CatchingFishParcelableFAB = new HashMap();
    public static final HashMap CatchingFishSnackbar = new HashMap();

    public static void CatchingFishParcelableFAB(Constructor constructor, CatchingFishLiveDataFABMVP catchingFishLiveDataFABMVP) {
        try {
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(constructor.newInstance(catchingFishLiveDataFABMVP));
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static int CatchingFishSnackbar(Class cls) {
        Constructor<?> constructor;
        boolean z;
        HashMap hashMap = CatchingFishParcelableFAB;
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
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(name);
                if (name.length() != 0) {
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    CatchingFishFirebaseDagger.CatchingFishRoomDatabase(canonicalName, "substring(...)");
                }
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(canonicalName);
                String concat = CatchingFishRoomMVVMWidget.CatchingFishEspressoMockk(canonicalName, ".", "_").concat("_LifecycleAdapter");
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
            HashMap hashMap2 = CatchingFishSnackbar;
            if (constructor != null) {
                hashMap2.put(cls, CatchingFishGsonCardView.CatchingFishFragmentFactory(constructor));
            } else {
                CatchingFishBiometricKtor catchingFishBiometricKtor = CatchingFishBiometricKtor.CatchingFishCoroutine;
                HashMap hashMap3 = catchingFishBiometricKtor.CatchingFishSnackbar;
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
                            if (((CatchingFishCustomViewToast) declaredMethods[i2].getAnnotation(CatchingFishCustomViewToast.class)) != null) {
                                catchingFishBiometricKtor.CatchingFishParcelableFAB(cls, declaredMethods);
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
                    if (superclass != null && CatchingFishLiveDataFABMVP.class.isAssignableFrom(superclass)) {
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(superclass);
                        if (CatchingFishSnackbar(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    CatchingFishFirebaseDagger.CatchingFishRoomDatabase(interfaces, "getInterfaces(...)");
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && CatchingFishLiveDataFABMVP.class.isAssignableFrom(cls2)) {
                                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(cls2);
                                if (CatchingFishSnackbar(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj2);
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
