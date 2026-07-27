package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f5184a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f5185b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0502u interfaceC0502u) {
        try {
            kotlin.jvm.internal.h.d(constructor.newInstance(interfaceC0502u), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e9) {
            throw new RuntimeException(e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z3;
        HashMap hashMap = f5184a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r32 != null ? r32.getName() : "";
                kotlin.jvm.internal.h.d(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    kotlin.jvm.internal.h.d(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    kotlin.jvm.internal.h.d(name, "this as java.lang.String).substring(startIndex)");
                }
                kotlin.jvm.internal.h.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = Q7.q.P(name, com.anythink.core.common.d.j.f12378z, "_").concat("_LifecycleAdapter");
                if (fullPackage.length() != 0) {
                    concat = fullPackage + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException(e9);
            }
            HashMap hashMap2 = f5185b;
            if (constructor != null) {
                hashMap2.put(cls, d6.c.k(constructor));
            } else {
                C0486d c0486d = C0486d.f5158c;
                HashMap hashMap3 = c0486d.f5160b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z3 = false;
                                break;
                            }
                            if (((D) declaredMethods[i6].getAnnotation(D.class)) != null) {
                                c0486d.a(cls, declaredMethods);
                                z3 = true;
                                break;
                            }
                            i6++;
                        }
                    } catch (NoClassDefFoundError e10) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
                    }
                }
                if (!z3) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0502u.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.h.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            kotlin.jvm.internal.h.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    kotlin.jvm.internal.h.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            Class<?> intrface = interfaces[i9];
                            if (intrface != null && InterfaceC0502u.class.isAssignableFrom(intrface)) {
                                kotlin.jvm.internal.h.d(intrface, "intrface");
                                if (b(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                kotlin.jvm.internal.h.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i9++;
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
