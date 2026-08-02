package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bv4 implements ev4 {
    public final to1 a;
    public final Object b;

    public bv4(to1 to1Var) {
        to1Var.getClass();
        this.a = to1Var;
        this.b = btf.a(bwf.c, new r93(22, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.ev4
    public final String a() {
        return (String) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bv4) && Intrinsics.d(this.a, ((bv4) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "ArtistsTopElement(top=" + this.a + ")";
    }
}
