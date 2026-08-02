package defpackage;

import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p5d {
    public final mwk a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final h4q e;
    public final u3q f;
    public final t0q g;
    public final EnumSet h;

    public p5d(mwk mwkVar, boolean z, boolean z2, long j, h4q h4qVar, u3q u3qVar, t0q t0qVar, EnumSet enumSet) {
        mwkVar.getClass();
        h4qVar.getClass();
        u3qVar.getClass();
        t0qVar.getClass();
        enumSet.getClass();
        this.a = mwkVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = h4qVar;
        this.f = u3qVar;
        this.g = t0qVar;
        this.h = enumSet;
    }

    public static p5d a(p5d p5dVar, boolean z, long j, h4q h4qVar, EnumSet enumSet, int i) {
        mwk mwkVar = p5dVar.a;
        if ((i & 2) != 0) {
            z = p5dVar.b;
        }
        boolean z2 = z;
        boolean z3 = p5dVar.c;
        if ((i & 8) != 0) {
            j = p5dVar.d;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            h4qVar = p5dVar.e;
        }
        h4q h4qVar2 = h4qVar;
        u3q u3qVar = p5dVar.f;
        t0q t0qVar = (i & 64) != 0 ? p5dVar.g : q0q.a;
        EnumSet enumSet2 = (i & 128) != 0 ? p5dVar.h : enumSet;
        p5dVar.getClass();
        mwkVar.getClass();
        h4qVar2.getClass();
        u3qVar.getClass();
        t0qVar.getClass();
        enumSet2.getClass();
        return new p5d(mwkVar, z2, z3, j2, h4qVar2, u3qVar, t0qVar, enumSet2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5d)) {
            return false;
        }
        p5d p5dVar = (p5d) obj;
        return Intrinsics.d(this.a, p5dVar.a) && this.b == p5dVar.b && this.c == p5dVar.c && this.d == p5dVar.d && Intrinsics.d(this.e, p5dVar.e) && Intrinsics.d(this.f, p5dVar.f) && Intrinsics.d(this.g, p5dVar.g) && Intrinsics.d(this.h, p5dVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + eta.a(tlm.c(this.d, k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), this.e.a, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlayerConfiguration(playable=" + this.a + ", playWhenReady=" + this.b + ", mute=" + this.c + ", currentPosition=" + this.d + ", speed=" + this.e + ", playbackEntity=" + this.f + ", fade=" + this.g + ", type=" + this.h + ")";
    }
}
