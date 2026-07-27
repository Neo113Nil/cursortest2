package com.anythink.basead.webtemplet.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0067a f11479a;

    /* renamed from: com.anythink.basead.webtemplet.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0067a {
        boolean a();
    }

    public static abstract class b {

        /* renamed from: com.anythink.basead.webtemplet.b.a$b$a, reason: collision with other inner class name */
        public static class C0068a extends Throwable {

            /* renamed from: d, reason: collision with root package name */
            private static final long f11480d = 1;

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f11481a;

            /* renamed from: b, reason: collision with root package name */
            private String f11482b;

            /* renamed from: c, reason: collision with root package name */
            private String f11483c;

            public C0068a(String str) {
                super(str);
            }

            private Class<?> a() {
                return this.f11481a;
            }

            private String b() {
                return this.f11483c;
            }

            private String c() {
                return this.f11482b;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return C0068a.class.getName() + ": " + getCause();
            }

            public C0068a(Exception exc) {
                super(exc);
            }

            public final void a(Class<?> cls) {
                this.f11481a = cls;
            }

            public final void b(String str) {
                this.f11482b = str;
            }

            public final void a(String str) {
                this.f11483c = str;
            }
        }
    }

    public static class c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f11484a;

        public c(Class<C> cls) {
            this.f11484a = cls;
        }

        private e<C, Object> a(String str) {
            return new e<>(this.f11484a, str, 8);
        }

        private e<C, Object> b(String str) {
            return new e<>(this.f11484a, str, 0);
        }

        private f b(String str, Class<?>... clsArr) {
            return new f(this.f11484a, str, clsArr, 8);
        }

        public final f a(String str, Class<?>... clsArr) {
            return new f(this.f11484a, str, clsArr, 0);
        }

        private d a(Class<?>... clsArr) {
            return new d(this.f11484a, clsArr);
        }

        private Class<C> a() {
            return this.f11484a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected Constructor<?> f11485a;

        public d(Class<?> cls, Class<?>[] clsArr) {
            if (cls == null) {
                return;
            }
            try {
                this.f11485a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e9) {
                b.C0068a c0068a = new b.C0068a(e9);
                c0068a.a(cls);
                a.b(c0068a);
            }
        }

        private Object a(Object... objArr) {
            this.f11485a.setAccessible(true);
            try {
                return this.f11485a.newInstance(objArr);
            } catch (Exception e9) {
                e9.printStackTrace();
                return null;
            }
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.C0068a c0068a) {
        InterfaceC0067a interfaceC0067a = f11479a;
        if (interfaceC0067a == null) {
            throw c0068a;
        }
        if (!interfaceC0067a.a()) {
            throw c0068a;
        }
    }

    public static class e<C, T> {

        /* renamed from: a, reason: collision with root package name */
        private Object f11486a;

        /* renamed from: b, reason: collision with root package name */
        private final Field f11487b;

        public e(Class<C> cls, String str, int i) {
            Field field = null;
            if (cls == null) {
                this.f11487b = null;
                return;
            }
            try {
                try {
                    this.f11486a = null;
                    field = cls.getDeclaredField(str);
                    if (i > 0 && (field.getModifiers() & i) != i) {
                        a.b(new b.C0068a(field + " does not match modifiers: " + i));
                    }
                    field.setAccessible(true);
                    this.f11487b = field;
                } catch (NoSuchFieldException e9) {
                    b.C0068a c0068a = new b.C0068a(e9);
                    c0068a.a((Class<?>) cls);
                    c0068a.b(str);
                    a.b(c0068a);
                    this.f11487b = field;
                }
            } catch (Throwable th) {
                this.f11487b = field;
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> a(Class<?> cls) {
            Field field = this.f11487b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                a.b(new b.C0068a(new ClassCastException(this.f11487b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> b(Class<T2> cls) {
            Field field = this.f11487b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                a.b(new b.C0068a(new ClassCastException(this.f11487b + " is not of type " + cls)));
            }
            return this;
        }

        private e<C, T> a(String str) {
            try {
                Class<?> cls = Class.forName(str);
                Field field = this.f11487b;
                if (field == null || cls.isAssignableFrom(field.getType())) {
                    return this;
                }
                a.b(new b.C0068a(new ClassCastException(this.f11487b + " is not of type " + cls)));
                return this;
            } catch (ClassNotFoundException e9) {
                a.b(new b.C0068a(e9));
                return this;
            }
        }

        private e<C, T> b(C c9) {
            this.f11486a = c9;
            return this;
        }

        private Field b() {
            return this.f11487b;
        }

        private T a() {
            try {
                return (T) this.f11487b.get(this.f11486a);
            } catch (IllegalAccessException e9) {
                e9.printStackTrace();
                return null;
            }
        }

        private void a(Object obj) {
            try {
                this.f11487b.set(this.f11486a, obj);
            } catch (IllegalAccessException e9) {
                e9.printStackTrace();
            }
        }
    }

    private static <T> c<T> a(Class<T> cls) {
        return new c<>(cls);
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Method f11488a;

        public f(Class<?> cls, String str, Class<?>[] clsArr, int i) {
            Method method = null;
            if (cls == null) {
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    try {
                        method = cls.getDeclaredMethod(str, clsArr);
                        break;
                    } catch (NoSuchMethodException | SecurityException unused) {
                        cls = cls.getSuperclass();
                    }
                } catch (Exception e9) {
                    b.C0068a c0068a = new b.C0068a(e9);
                    c0068a.a(cls);
                    c0068a.a(str);
                    a.b(c0068a);
                    return;
                } finally {
                    this.f11488a = method;
                }
            }
            if (method != null) {
                if (i > 0 && (method.getModifiers() & i) != i) {
                    a.b(new b.C0068a(method + " does not match modifiers: " + i));
                }
                method.setAccessible(true);
            }
        }

        public final Object a(Object obj, Object... objArr) {
            Method method = this.f11488a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e9) {
                e9.getMessage();
                return null;
            }
        }

        public final Method a() {
            return this.f11488a;
        }
    }

    private static <T> c<T> a(String str) {
        try {
            return new c<>(Class.forName(str));
        } catch (ClassNotFoundException e9) {
            b(new b.C0068a(e9));
            return new c<>(null);
        }
    }

    public static <T> c<T> a(ClassLoader classLoader, String str) {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e9) {
            b(new b.C0068a(e9));
            return new c<>(null);
        }
    }

    private static void a(InterfaceC0067a interfaceC0067a) {
        f11479a = interfaceC0067a;
    }
}
