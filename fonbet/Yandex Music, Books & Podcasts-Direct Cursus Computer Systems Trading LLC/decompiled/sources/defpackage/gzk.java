package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gzk {
    public final mwk a;
    public final tnl b;
    public final boolean c;
    public final boolean d;

    public gzk(mwk mwkVar, tnl tnlVar, boolean z, boolean z2) {
        mwkVar.getClass();
        tnlVar.getClass();
        this.a = mwkVar;
        this.b = tnlVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzk)) {
            return false;
        }
        gzk gzkVar = (gzk) obj;
        return Intrinsics.d(this.a, gzkVar.a) && this.b == gzkVar.b && this.c == gzkVar.c && this.d == gzkVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackEvent(playable=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", playWhenReady=");
        return v3w.g(sb, this.c, ", muted=", this.d, ")");
    }
}
