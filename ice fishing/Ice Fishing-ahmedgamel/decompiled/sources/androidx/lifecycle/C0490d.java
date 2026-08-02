package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0490d f5125c = new C0490d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5126a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5127b = new HashMap();

    public static void b(HashMap hashMap, C0489c c0489c, EnumC0500n enumC0500n, Class cls) {
        EnumC0500n enumC0500n2 = (EnumC0500n) hashMap.get(c0489c);
        if (enumC0500n2 == null || enumC0500n == enumC0500n2) {
            if (enumC0500n2 == null) {
                hashMap.put(c0489c, enumC0500n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0489c.f5124b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0500n2 + ", new value " + enumC0500n);
    }

    public final C0488b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f5126a;
        if (superclass != null) {
            C0488b c0488b = (C0488b) hashMap2.get(superclass);
            if (c0488b == null) {
                c0488b = a(superclass, null);
            }
            hashMap.putAll(c0488b.f5122b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0488b c0488b2 = (C0488b) hashMap2.get(cls2);
            if (c0488b2 == null) {
                c0488b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0488b2.f5122b.entrySet()) {
                b(hashMap, (C0489c) entry.getKey(), (EnumC0500n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e9) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e9);
            }
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            D d9 = (D) method.getAnnotation(D.class);
            if (d9 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0507v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0500n value = d9.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0500n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0500n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0489c(i, method), value, cls);
                z6 = true;
            }
        }
        C0488b c0488b3 = new C0488b(hashMap);
        hashMap2.put(cls, c0488b3);
        this.f5127b.put(cls, Boolean.valueOf(z6));
        return c0488b3;
    }
}
