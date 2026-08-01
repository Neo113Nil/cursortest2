package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0486d f5158c = new C0486d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5159a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5160b = new HashMap();

    public static void b(HashMap hashMap, C0485c c0485c, EnumC0496n enumC0496n, Class cls) {
        EnumC0496n enumC0496n2 = (EnumC0496n) hashMap.get(c0485c);
        if (enumC0496n2 == null || enumC0496n == enumC0496n2) {
            if (enumC0496n2 == null) {
                hashMap.put(c0485c, enumC0496n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0485c.f5157b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0496n2 + ", new value " + enumC0496n);
    }

    public final C0484b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f5159a;
        if (superclass != null) {
            C0484b c0484b = (C0484b) hashMap2.get(superclass);
            if (c0484b == null) {
                c0484b = a(superclass, null);
            }
            hashMap.putAll(c0484b.f5155b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0484b c0484b2 = (C0484b) hashMap2.get(cls2);
            if (c0484b2 == null) {
                c0484b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0484b2.f5155b.entrySet()) {
                b(hashMap, (C0485c) entry.getKey(), (EnumC0496n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e9) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e9);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            D d2 = (D) method.getAnnotation(D.class);
            if (d2 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0503v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0496n value = d2.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0496n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0496n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0485c(i, method), value, cls);
                z3 = true;
            }
        }
        C0484b c0484b3 = new C0484b(hashMap);
        hashMap2.put(cls, c0484b3);
        this.f5160b.put(cls, Boolean.valueOf(z3));
        return c0484b3;
    }
}
