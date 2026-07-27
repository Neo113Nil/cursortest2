package com.anythink.basead.webtemplet.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0066a f11636a;

    /* renamed from: com.anythink.basead.webtemplet.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0066a {
        boolean a();
    }

    public static abstract class b {

        /* renamed from: com.anythink.basead.webtemplet.b.a$b$a, reason: collision with other inner class name */
        public static class C0067a extends Throwable {

            /* renamed from: d, reason: collision with root package name */
            private static final long f11637d = 1;

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f11638a;

            /* renamed from: b, reason: collision with root package name */
            private String f11639b;

            /* renamed from: c, reason: collision with root package name */
            private String f11640c;

            public C0067a(String str) {
                super(str);
            }

            private Class<?> a() {
                return this.f11638a;
            }

            private String b() {
                return this.f11640c;
            }

            private String c() {
                return this.f11639b;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return C0067a.class.getName() + ": " + getCause();
            }

            public C0067a(Exception exc) {
                super(exc);
            }

            public final void a(Class<?> cls) {
                this.f11638a = cls;
            }

            public final void b(String str) {
                this.f11639b = str;
            }

            public final void a(String str) {
                this.f11640c = str;
            }
        }
    }

    public static class c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f11641a;

        public c(Class<C> cls) {
            this.f11641a = cls;
        }

        private e<C, Object> a(String str) {
            return new e<>(this.f11641a, str, 8);
        }

        private e<C, Object> b(String str) {
            return new e<>(this.f11641a, str, 0);
        }

        private f b(String str, Class<?>... clsArr) {
            return new f(this.f11641a, str, clsArr, 8);
        }

        public final f a(String str, Class<?>... clsArr) {
            return new f(this.f11641a, str, clsArr, 0);
        }

        private d a(Class<?>... clsArr) {
            return new d(this.f11641a, clsArr);
        }

        private Class<C> a() {
            return this.f11641a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected Constructor<?> f11642a;

        public d(Class<?> cls, Class<?>[] clsArr) {
            if (cls == null) {
                return;
            }
            try {
                this.f11642a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e6) {
                b.C0067a c0067a = new b.C0067a(e6);
                c0067a.a(cls);
                a.b(c0067a);
            }
        }

        private Object a(Object... objArr) {
            this.f11642a.setAccessible(true);
            try {
                return this.f11642a.newInstance(objArr);
            } catch (Exception e6) {
                e6.printStackTrace();
                return null;
            }
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.C0067a c0067a) {
        InterfaceC0066a interfaceC0066a = f11636a;
        if (interfaceC0066a == null) {
            throw c0067a;
        }
        if (!interfaceC0066a.a()) {
            throw c0067a;
        }
    }

    public static class e<C, T> {

        /* renamed from: a, reason: collision with root package name */
        private Object f11643a;

        /* renamed from: b, reason: collision with root package name */
        private final Field f11644b;

        public e(Class<C> cls, String str, int i) {
            Field field = null;
            if (cls == null) {
                this.f11644b = null;
                return;
            }
            try {
                try {
                    this.f11643a = null;
                    field = cls.getDeclaredField(str);
                    if (i > 0 && (field.getModifiers() & i) != i) {
                        a.b(new b.C0067a(field + " does not match modifiers: " + i));
                    }
                    field.setAccessible(true);
                    this.f11644b = field;
                } catch (NoSuchFieldException e6) {
                    b.C0067a c0067a = new b.C0067a(e6);
                    c0067a.a((Class<?>) cls);
                    c0067a.b(str);
                    a.b(c0067a);
                    this.f11644b = field;
                }
            } catch (Throwable th) {
                this.f11644b = field;
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> a(Class<?> cls) {
            Field field = this.f11644b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                a.b(new b.C0067a(new ClassCastException(this.f11644b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private <T2> e<C, T2> b(Class<T2> cls) {
            Field field = this.f11644b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                a.b(new b.C0067a(new ClassCastException(this.f11644b + " is not of type " + cls)));
            }
            return this;
        }

        private e<C, T> a(String str) {
            try {
                Class<?> cls = Class.forName(str);
                Field field = this.f11644b;
                if (field == null || cls.isAssignableFrom(field.getType())) {
                    return this;
                }
                a.b(new b.C0067a(new ClassCastException(this.f11644b + " is not of type " + cls)));
                return this;
            } catch (ClassNotFoundException e6) {
                a.b(new b.C0067a(e6));
                return this;
            }
        }

        private e<C, T> b(C c4) {
            this.f11643a = c4;
            return this;
        }

        private Field b() {
            return this.f11644b;
        }

        private T a() {
            try {
                return (T) this.f11644b.get(this.f11643a);
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
                return null;
            }
        }

        private void a(Object obj) {
            try {
                this.f11644b.set(this.f11643a, obj);
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
            }
        }
    }

    private static <T> c<T> a(Class<T> cls) {
        return new c<>(cls);
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Method f11645a;

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
                } catch (Exception e6) {
                    b.C0067a c0067a = new b.C0067a(e6);
                    c0067a.a(cls);
                    c0067a.a(str);
                    a.b(c0067a);
                    return;
                } finally {
                    this.f11645a = method;
                }
            }
            if (method != null) {
                if (i > 0 && (method.getModifiers() & i) != i) {
                    a.b(new b.C0067a(method + " does not match modifiers: " + i));
                }
                method.setAccessible(true);
            }
        }

        public final Object a(Object obj, Object... objArr) {
            Method method = this.f11645a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e6) {
                e6.getMessage();
                return null;
            }
        }

        public final Method a() {
            return this.f11645a;
        }
    }

    private static <T> c<T> a(String str) {
        try {
            return new c<>(Class.forName(str));
        } catch (ClassNotFoundException e6) {
            b(new b.C0067a(e6));
            return new c<>(null);
        }
    }

    public static <T> c<T> a(ClassLoader classLoader, String str) {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e6) {
            b(new b.C0067a(e6));
            return new c<>(null);
        }
    }

    private static void a(InterfaceC0066a interfaceC0066a) {
        f11636a = interfaceC0066a;
    }
}
