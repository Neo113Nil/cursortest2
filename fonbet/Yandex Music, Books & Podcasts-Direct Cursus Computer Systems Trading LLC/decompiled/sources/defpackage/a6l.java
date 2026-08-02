package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a6l {
    public final gxc a;
    public final gj b;

    public a6l(gxc gxcVar, gj gjVar) {
        this.a = gxcVar;
        this.b = gjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6l)) {
            return false;
        }
        a6l a6lVar = (a6l) obj;
        return this.a.equals(a6lVar.a) && Intrinsics.d(this.b, a6lVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gj gjVar = this.b;
        return hashCode + (gjVar == null ? 0 : gjVar.hashCode());
    }

    public final String toString() {
        return "PlaybackStartUiAttributes(fromData=" + this.a + ", adData=" + this.b + ")";
    }
}
