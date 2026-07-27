package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0496d f5270c = new C0496d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5271a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5272b = new HashMap();

    public static void b(HashMap hashMap, C0495c c0495c, EnumC0506n enumC0506n, Class cls) {
        EnumC0506n enumC0506n2 = (EnumC0506n) hashMap.get(c0495c);
        if (enumC0506n2 == null || enumC0506n == enumC0506n2) {
            if (enumC0506n2 == null) {
                hashMap.put(c0495c, enumC0506n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0495c.f5269b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0506n2 + ", new value " + enumC0506n);
    }

    public final C0494b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f5271a;
        if (superclass != null) {
            C0494b c0494b = (C0494b) hashMap2.get(superclass);
            if (c0494b == null) {
                c0494b = a(superclass, null);
            }
            hashMap.putAll(c0494b.f5267b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0494b c0494b2 = (C0494b) hashMap2.get(cls2);
            if (c0494b2 == null) {
                c0494b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0494b2.f5267b.entrySet()) {
                b(hashMap, (C0495c) entry.getKey(), (EnumC0506n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z8 = false;
        for (Method method : methodArr) {
            D d2 = (D) method.getAnnotation(D.class);
            if (d2 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0513v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0506n value = d2.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0506n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0506n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0495c(i, method), value, cls);
                z8 = true;
            }
        }
        C0494b c0494b3 = new C0494b(hashMap);
        hashMap2.put(cls, c0494b3);
        this.f5272b.put(cls, Boolean.valueOf(z8));
        return c0494b3;
    }
}
