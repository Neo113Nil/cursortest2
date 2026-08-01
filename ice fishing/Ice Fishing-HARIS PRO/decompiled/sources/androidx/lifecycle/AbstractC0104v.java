package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0104v {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2053a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f2054b = new HashMap();

    public static void a(Constructor constructor, r rVar) {
        try {
            D1.i.d(constructor.newInstance(rVar), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z2;
        HashMap hashMap = f2053a;
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
                D1.i.d(name, "fullPackage");
                if (name.length() != 0) {
                    D1.i.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    D1.i.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                D1.i.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = K1.l.f0(canonicalName, ".", "_").concat("_LifecycleAdapter");
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
            HashMap hashMap2 = f2054b;
            if (constructor != null) {
                hashMap2.put(cls, h0.f.s(constructor));
            } else {
                C0087d c0087d = C0087d.f2030c;
                HashMap hashMap3 = c0087d.f2032b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            }
                            if (((B) declaredMethods[i2].getAnnotation(B.class)) != null) {
                                c0087d.a(cls, declaredMethods);
                                z2 = true;
                                break;
                            }
                            i2++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z2) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && r.class.isAssignableFrom(superclass)) {
                        D1.i.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            D1.i.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    D1.i.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && r.class.isAssignableFrom(cls2)) {
                                D1.i.d(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                D1.i.b(obj2);
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
