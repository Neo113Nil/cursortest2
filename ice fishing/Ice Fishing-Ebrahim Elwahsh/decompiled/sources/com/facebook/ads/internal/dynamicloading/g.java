package com.facebook.ads.internal.dynamicloading;

import I0.j;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class g implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23679a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23680b;

    public /* synthetic */ g(int i, Object obj) {
        this.f23679a = i;
        this.f23680b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.f23679a) {
            case 0:
                if ("toString".equals(method.getName())) {
                    return null;
                }
                ((h) this.f23680b).f23681a = method;
                return null;
            default:
                try {
                    return Class.forName(method.getDeclaringClass().getName(), true, j.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke((j) this.f23680b, objArr);
                } catch (InvocationTargetException e6) {
                    throw e6.getTargetException();
                } catch (ReflectiveOperationException e9) {
                    throw new RuntimeException("Reflection failed for method " + method, e9);
                }
        }
    }
}
