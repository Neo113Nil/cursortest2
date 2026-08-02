package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e91 {
    public static final e91 c = new e91(0, null);
    public final int a;
    public final p43 b;

    public e91(int i, p43 p43Var) {
        this.a = i;
        this.b = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e91)) {
            return false;
        }
        e91 e91Var = (e91) obj;
        return this.a == e91Var.a && Intrinsics.d(this.b, e91Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        p43 p43Var = this.b;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "ArtistFamiliarToYouWaveData(tracksCount=" + this.a + ", analytics=" + this.b + ")";
    }
}
