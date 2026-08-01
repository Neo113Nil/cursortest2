package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0087d f2030c = new C0087d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2031a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2032b = new HashMap();

    public static void b(HashMap hashMap, C0086c c0086c, EnumC0096m enumC0096m, Class cls) {
        EnumC0096m enumC0096m2 = (EnumC0096m) hashMap.get(c0086c);
        if (enumC0096m2 == null || enumC0096m == enumC0096m2) {
            if (enumC0096m2 == null) {
                hashMap.put(c0086c, enumC0096m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0086c.f2029b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0096m2 + ", new value " + enumC0096m);
    }

    public final C0085b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f2031a;
        if (superclass != null) {
            C0085b c0085b = (C0085b) hashMap2.get(superclass);
            if (c0085b == null) {
                c0085b = a(superclass, null);
            }
            hashMap.putAll(c0085b.f2027b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0085b c0085b2 = (C0085b) hashMap2.get(cls2);
            if (c0085b2 == null) {
                c0085b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0085b2.f2027b.entrySet()) {
                b(hashMap, (C0086c) entry.getKey(), (EnumC0096m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            B b2 = (B) method.getAnnotation(B.class);
            if (b2 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0101s.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0096m value = b2.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0096m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0096m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0086c(i, method), value, cls);
                z2 = true;
            }
        }
        C0085b c0085b3 = new C0085b(hashMap);
        hashMap2.put(cls, c0085b3);
        this.f2032b.put(cls, Boolean.valueOf(z2));
        return c0085b3;
    }
}
