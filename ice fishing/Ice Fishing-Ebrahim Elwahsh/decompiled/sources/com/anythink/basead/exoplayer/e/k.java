package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.k.C0544a;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public interface k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l f7333a;

        /* renamed from: b, reason: collision with root package name */
        public final l f7334b;

        public a(l lVar) {
            this(lVar, lVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7333a.equals(aVar.f7333a) && this.f7334b.equals(aVar.f7334b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7334b.hashCode() + (this.f7333a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f7333a);
            if (this.f7333a.equals(this.f7334b)) {
                str = "";
            } else {
                str = ", " + this.f7334b;
            }
            return AbstractC5051n.g(sb, str, "]");
        }

        public a(l lVar, l lVar2) {
            this.f7333a = (l) C0544a.a(lVar);
            this.f7334b = (l) C0544a.a(lVar2);
        }
    }

    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        private final long f7335a;

        /* renamed from: b, reason: collision with root package name */
        private final a f7336b;

        private b(long j9) {
            this(j9, 0L);
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final boolean a() {
            return false;
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final long b() {
            return this.f7335a;
        }

        public b(long j9, long j10) {
            this.f7335a = j9;
            this.f7336b = new a(j10 == 0 ? l.f7337a : new l(0L, j10));
        }

        @Override // com.anythink.basead.exoplayer.e.k
        public final a a(long j9) {
            return this.f7336b;
        }
    }

    a a(long j9);

    boolean a();

    long b();
}
