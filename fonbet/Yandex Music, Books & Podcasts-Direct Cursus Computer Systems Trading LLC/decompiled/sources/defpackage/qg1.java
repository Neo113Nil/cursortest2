package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qg1 {
    public final og1 a;
    public final p43 b;

    public qg1(og1 og1Var, p43 p43Var) {
        this.a = og1Var;
        this.b = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg1)) {
            return false;
        }
        qg1 qg1Var = (qg1) obj;
        return this.a.equals(qg1Var.a) && Intrinsics.d(this.b, qg1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p43 p43Var = this.b;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "ArtistReleaseBlockData(release=" + this.a + ", analytics=" + this.b + ")";
    }
}
