package com.anythink.basead.exoplayer.h;

import android.os.Handler;

/* loaded from: classes.dex */
public interface s {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8553a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8554b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8555c;

        /* renamed from: d, reason: collision with root package name */
        public final long f8556d;

        public a(int i) {
            this(i, -1L);
        }

        public final a a(int i) {
            return this.f8553a == i ? this : new a(i, this.f8554b, this.f8555c, this.f8556d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f8553a == aVar.f8553a && this.f8554b == aVar.f8554b && this.f8555c == aVar.f8555c && this.f8556d == aVar.f8556d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((((this.f8553a + 527) * 31) + this.f8554b) * 31) + this.f8555c) * 31) + ((int) this.f8556d);
        }

        public a(int i, long j6) {
            this(i, -1, -1, j6);
        }

        public a(int i, int i4, int i6, long j6) {
            this.f8553a = i;
            this.f8554b = i4;
            this.f8555c = i6;
            this.f8556d = j6;
        }

        public final boolean a() {
            return this.f8554b != -1;
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

    void a(com.anythink.basead.exoplayer.h hVar, boolean z6, b bVar);

    void b();
}
