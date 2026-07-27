package com.anythink.basead.exoplayer.h;

import android.os.Handler;

/* loaded from: classes.dex */
public interface s {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7767a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7768b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7769c;

        /* renamed from: d, reason: collision with root package name */
        public final long f7770d;

        public a(int i) {
            this(i, -1L);
        }

        public final a a(int i) {
            return this.f7767a == i ? this : new a(i, this.f7768b, this.f7769c, this.f7770d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7767a == aVar.f7767a && this.f7768b == aVar.f7768b && this.f7769c == aVar.f7769c && this.f7770d == aVar.f7770d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((((this.f7767a + 527) * 31) + this.f7768b) * 31) + this.f7769c) * 31) + ((int) this.f7770d);
        }

        public a(int i, long j6) {
            this(i, -1, -1, j6);
        }

        public a(int i, int i6, int i9, long j6) {
            this.f7767a = i;
            this.f7768b = i6;
            this.f7769c = i9;
            this.f7770d = j6;
        }

        public final boolean a() {
            return this.f7768b != -1;
        }
    }

    public interface b {
        void a(s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj);
    }

    r a(a aVar, com.anythink.basead.exoplayer.j.b bVar);

    void a(Handler handler, t tVar);

    void a(r rVar);

    void a(b bVar);

    void a(t tVar);

    void a(com.anythink.basead.exoplayer.h hVar, boolean z3, b bVar);

    void b();
}
