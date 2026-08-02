package com.anythink.basead.exoplayer.e;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public interface k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l f7962a;

        /* renamed from: b, reason: collision with root package name */
        public final l f7963b;

        public a(l lVar) {
            this(lVar, lVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7962a.equals(aVar.f7962a) && this.f7963b.equals(aVar.f7963b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7963b.hashCode() + (this.f7962a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f7962a);
            if (this.f7962a.equals(this.f7963b)) {
                str = "";
            } else {
                str = ", " + this.f7963b;
            }
            return Wv.i(sb, str, "]");
        }

        public a(l lVar, l lVar2) {
            this.f7962a = (l) com.anythink.basead.exoplayer.k.a.a(lVar);
            this.f7963b = (l) com.anythink.basead.exoplayer.k.a.a(lVar2);
        }
    }

    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        private final long f7964a;

        /* renamed from: b, reason: collision with root package name */
        private final a f7965b;

        private b(long j6) {
            this(j6, 0L);
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final boolean a() {
            return false;
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final long b() {
            return this.f7964a;
        }

        public b(long j6, long j9) {
            this.f7964a = j6;
            this.f7965b = new a(j9 == 0 ? l.f7966a : new l(0L, j9));
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final a a(long j6) {
            return this.f7965b;
        }
    }

    a a(long j6);

    boolean a();

    long b();
}
