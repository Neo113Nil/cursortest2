package com.anythink.expressad.atsignalcommon.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class b {

    public interface a {
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.c.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0112b<T> implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private T f18741a;

        private T a() {
            return this.f18741a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(this.f18741a, objArr);
            } catch (IllegalAccessException e9) {
                e9.printStackTrace();
                return null;
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
                return null;
            } catch (InvocationTargetException e11) {
                throw e11.getTargetException();
            }
        }

        public final void a(T t6) {
            this.f18741a = t6;
        }
    }

    private b() {
    }

    private static <T> T a(Object obj, Class<T> cls, AbstractC0112b<T> abstractC0112b) {
        abstractC0112b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls, a.class}, abstractC0112b);
    }

    public static <T> T a(Object obj, AbstractC0112b<T> abstractC0112b, Class<?>... clsArr) {
        abstractC0112b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), clsArr, abstractC0112b);
    }
}
