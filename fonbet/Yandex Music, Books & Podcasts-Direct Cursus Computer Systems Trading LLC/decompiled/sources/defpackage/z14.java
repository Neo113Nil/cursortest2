package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z14 implements c24 {
    public final rmk a;
    public final umk b;

    public z14(rmk rmkVar, umk umkVar) {
        umkVar.getClass();
        this.a = rmkVar;
        this.b = umkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z14)) {
            return false;
        }
        z14 z14Var = (z14) obj;
        return this.a.equals(z14Var.a) && Intrinsics.d(this.b, z14Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PersonalPlaylist(uiData=" + this.a + ", entity=" + this.b + ")";
    }
}
