package com.anythink.expressad.atsignalcommon.c;

import com.anythink.expressad.atsignalcommon.c.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static a f17955a;

    public interface a {
        boolean a();
    }

    public static abstract class b {

        public static class a extends Throwable {

            /* renamed from: d, reason: collision with root package name */
            private static final long f17956d = 1;

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f17957a;

            /* renamed from: b, reason: collision with root package name */
            private String f17958b;

            /* renamed from: c, reason: collision with root package name */
            private String f17959c;

            public a(String str) {
                super(str);
            }

            public final Class<?> a() {
                return this.f17957a;
            }

            public final String b() {
                return this.f17959c;
            }

            public final String c() {
                return this.f17958b;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return a.class.getName() + ": " + getCause();
            }

            public a(Exception exc) {
                super(exc);
            }

            public final void a(Class<?> cls) {
                this.f17957a = cls;
            }

            public final void b(String str) {
                this.f17958b = str;
            }

            public final void a(String str) {
                this.f17959c = str;
            }
        }
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.c.c$c, reason: collision with other inner class name */
    public static class C0113c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f17960a;

        public C0113c(Class<C> cls) {
            this.f17960a = cls;
        }

        private e<C, Object> a(String str) {
            return new e<>(this.f17960a, str, 8);
        }

        private e<C, Object> b(String str) {
            return new e<>(this.f17960a, str, 0);
        }

        private f b(String str, Class<?>... clsArr) {
            return new f(this.f17960a, str, clsArr, 8);
        }

        public final f a(String str, Class<?>... clsArr) {
            return new f(this.f17960a, str, clsArr, 0);
        }

        private d a(Class<?>... clsArr) {
            return new d(this.f17960a, clsArr);
        }

        private Class<C> a() {
            return this.f17960a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected Constructor<?> f17961a;

        public d(Class<?> cls, Class<?>[] clsArr) {
            if (cls == null) {
                return;
            }
            try {
                this.f17961a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e9) {
                b.a aVar = new b.a(e9);
                aVar.a(cls);
                c.b(aVar);
            }
        }

        private Object a(Object... objArr) {
            this.f17961a.setAccessible(true);
            try {
                return this.f17961a.newInstance(objArr);
            } catch (Exception e9) {
                e9.printStackTrace();
                return null;
            }
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.a aVar) {
        a aVar2 = f17955a;
        if (aVar2 == null) {
            throw aVar;
        }
        if (!aVar2.a()) {
            throw aVar;
        }
    }

    public static class e<C, T> {

        /* renamed from: a, reason: collision with root package name */
        private Object f17962a;

        /* renamed from: b, reason: collision with root package name */
        private final Field f17963b;

        public e(Class<C> cls, String str, int i) {
            Field field = null;
            if (cls == null) {
                this.f17963b = null;
                return;
            }
            try {
                try {
                    this.f17962a = null;
                    field = cls.getDeclaredField(str);
                    if (i > 0 && (field.getModifiers() & i) != i) {
                        c.b(new b.a(field + " does not match modifiers: " + i));
                    }
                    field.setAccessible(true);
                    this.f17963b = field;
                } catch (NoSuchFieldException e9) {
                    b.a aVar = new b.a(e9);
                    aVar.a((Class<?>) cls);
                    aVar.b(str);
                    c.b(aVar);
                    this.f17963b = field;
                }
            } catch (Throwable th) {
                this.f17963b = field;
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> a(Class<?> cls) {
            Field field = this.f17963b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.f17963b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> b(Class<T2> cls) {
            Field field = this.f17963b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                c.b(new b.a(new ClassCastException(this.f17963b + " is not of type " + cls)));
            }
            return this;
        }

        private e<C, T> a(String str) {
            try {
                Class<?> cls = Class.forName(str);
                Field field = this.f17963b;
                if (field == null || cls.isAssignableFrom(field.getType())) {
                    return this;
                }
                c.b(new b.a(new ClassCastException(this.f17963b + " is not of type " + cls)));
                return this;
            } catch (ClassNotFoundException e9) {
                c.b(new b.a(e9));
                return this;
            }
        }

        private e<C, T> b(C c9) {
            this.f17962a = c9;
            return this;
        }

        private Field b() {
            return this.f17963b;
        }

        private T a() {
            try {
                return (T) this.f17963b.get(this.f17962a);
            } catch (IllegalAccessException e9) {
                e9.printStackTrace();
                return null;
            }
        }

        private void a(Object obj) {
            try {
                this.f17963b.set(this.f17962a, obj);
            } catch (IllegalAccessException e9) {
                e9.printStackTrace();
            }
        }

        private void a(b.AbstractC0112b<?> abstractC0112b) {
            T a9 = a();
            if (a9 != null) {
                try {
                    this.f17963b.set(this.f17962a, com.anythink.expressad.atsignalcommon.c.b.a(a9, abstractC0112b, a9.getClass().getInterfaces()));
                    return;
                } catch (IllegalAccessException e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            throw new IllegalStateException("Cannot mapping null");
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Method f17964a;

        public f(Class<?> cls, String str, Class<?>[] clsArr, int i) {
            Method method = null;
            if (cls == null) {
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    method = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e9) {
                    if (com.anythink.expressad.a.f17618a && cls.getSuperclass() == Object.class) {
                        e9.printStackTrace();
                    }
                    cls = cls.getSuperclass();
                } catch (SecurityException e10) {
                    try {
                        if (com.anythink.expressad.a.f17618a && cls.getSuperclass() == Object.class) {
                            e10.printStackTrace();
                        }
                        cls = cls.getSuperclass();
                    } catch (Exception e11) {
                        b.a aVar = new b.a(e11);
                        aVar.a(cls);
                        aVar.a(str);
                        c.b(aVar);
                        return;
                    } finally {
                        this.f17964a = method;
                    }
                }
            }
            if (method != null) {
                if (i > 0 && (method.getModifiers() & i) != i) {
                    c.b(new b.a(method + " does not match modifiers: " + i));
                }
                method.setAccessible(true);
            }
        }

        public final Object a(Object obj, Object... objArr) {
            Method method = this.f17964a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }

        public final Method a() {
            return this.f17964a;
        }
    }

    private static <T> C0113c<T> a(Class<T> cls) {
        return new C0113c<>(cls);
    }

    private static <T> C0113c<T> a(String str) {
        try {
            return new C0113c<>(Class.forName(str));
        } catch (ClassNotFoundException e9) {
            b(new b.a(e9));
            return new C0113c<>(null);
        }
    }

    public static <T> C0113c<T> a(ClassLoader classLoader, String str) {
        try {
            return new C0113c<>(classLoader.loadClass(str));
        } catch (Exception e9) {
            b(new b.a(e9));
            return new C0113c<>(null);
        }
    }

    private static void a(a aVar) {
        f17955a = aVar;
    }
}
