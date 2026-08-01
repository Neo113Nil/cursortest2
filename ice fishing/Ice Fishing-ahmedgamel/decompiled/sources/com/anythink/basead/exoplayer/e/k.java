package com.anythink.basead.exoplayer.e;

/* loaded from: classes.dex */
public interface k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l f7176a;

        /* renamed from: b, reason: collision with root package name */
        public final l f7177b;

        public a(l lVar) {
            this(lVar, lVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7176a.equals(aVar.f7176a) && this.f7177b.equals(aVar.f7177b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7177b.hashCode() + (this.f7176a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f7176a);
            if (this.f7176a.equals(this.f7177b)) {
                str = "";
            } else {
                str = ", " + this.f7177b;
            }
            return u1.h.g(sb, str, "]");
        }

        public a(l lVar, l lVar2) {
            this.f7176a = (l) com.anythink.basead.exoplayer.k.a.a(lVar);
            this.f7177b = (l) com.anythink.basead.exoplayer.k.a.a(lVar2);
        }
    }

    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        private final long f7178a;

        /* renamed from: b, reason: collision with root package name */
        private final a f7179b;

        private b(long j6) {
            this(j6, 0L);
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final boolean a() {
            return false;
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final long b() {
            return this.f7178a;
        }

        public b(long j6, long j9) {
            this.f7178a = j6;
            this.f7179b = new a(j9 == 0 ? l.f7180a : new l(0L, j9));
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final a a(long j6) {
            return this.f7179b;
        }
    }

    a a(long j6);

    boolean a();

    long b();
}
