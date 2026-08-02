package com.anythink.expressad.atsignalcommon.windvane;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class e {

    public interface a {
    }

    public static abstract class b<T> implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private T f18857a;

        private T a() {
            return this.f18857a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return method.invoke(this.f18857a, objArr);
        }

        public final void a(T t6) {
            this.f18857a = t6;
        }
    }

    private e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T a(Object obj, Class<T> cls, b<T> bVar) {
        if (obj instanceof a) {
            return obj;
        }
        bVar.a(obj);
        return (T) Proxy.newProxyInstance(e.class.getClassLoader(), new Class[]{cls, a.class}, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T a(Object obj, b<T> bVar, Class<?>... clsArr) {
        if (Proxy.isProxyClass(obj.getClass())) {
            return obj;
        }
        bVar.a(obj);
        return (T) Proxy.newProxyInstance(e.class.getClassLoader(), clsArr, bVar);
    }
}
