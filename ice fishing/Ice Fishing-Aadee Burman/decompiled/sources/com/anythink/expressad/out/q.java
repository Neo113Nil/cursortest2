package com.anythink.expressad.out;

/* loaded from: classes.dex */
public final class q {

    public interface a {
        void a();
    }

    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    public interface c {
        void a(com.anythink.expressad.foundation.d.d dVar, String str);

        void a(k kVar);

        void a(k kVar, String str);

        void b(k kVar);

        void b(k kVar, String str);

        boolean b();

        void c();

        void c(k kVar);

        void d(k kVar);
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private int f20065a;

        /* renamed from: b, reason: collision with root package name */
        private int f20066b;

        private d(int i, int i6) {
            this.f20065a = i;
            this.f20066b = i6;
        }

        private int a() {
            return this.f20065a;
        }

        private int b() {
            return this.f20066b;
        }

        private void a(int i) {
            this.f20065a = i;
        }

        private void b(int i) {
            this.f20066b = i;
        }
    }

    public interface e extends c {
        void a();
    }
}
