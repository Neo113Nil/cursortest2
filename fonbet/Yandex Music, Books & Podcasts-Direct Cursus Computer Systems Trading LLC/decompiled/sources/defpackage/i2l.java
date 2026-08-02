package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i2l {
    public final v0l a;
    public final mwk b;
    public final boolean c;
    public final boolean d;

    public i2l(v0l v0lVar, mwk mwkVar, boolean z, boolean z2) {
        mwkVar.getClass();
        this.a = v0lVar;
        this.b = mwkVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2l)) {
            return false;
        }
        i2l i2lVar = (i2l) obj;
        return this.a == i2lVar.a && Intrinsics.d(this.b, i2lVar.b) && this.c == i2lVar.c && this.d == i2lVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressSourceData(playerState=");
        sb.append(this.a);
        sb.append(", playable=");
        sb.append(this.b);
        sb.append(", suspend=");
        return v3w.g(sb, this.c, ", isPlayerPlaying=", this.d, ")");
    }
}
