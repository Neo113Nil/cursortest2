package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class av4 implements ev4 {
    public final yb1 a;
    public final Object b;

    public av4(yb1 yb1Var) {
        yb1Var.getClass();
        this.a = yb1Var;
        this.b = btf.a(bwf.c, new r93(21, this));
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
        return (obj instanceof av4) && Intrinsics.d(this.a, ((av4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ArtistElement(item=" + this.a + ")";
    }
}
