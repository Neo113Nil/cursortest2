package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q3d {
    public final int a;
    public final hiu b;

    public q3d(int i, hiu hiuVar) {
        hiuVar.getClass();
        this.a = i;
        this.b = hiuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3d)) {
            return false;
        }
        q3d q3dVar = (q3d) obj;
        return this.a == q3dVar.a && Intrinsics.d(this.b, q3dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
