package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x4v implements y4v {
    public final eu7 a;
    public final q4q b;

    public x4v(eu7 eu7Var, q4q q4qVar) {
        eu7Var.getClass();
        this.a = eu7Var;
        this.b = q4qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4v)) {
            return false;
        }
        x4v x4vVar = (x4v) obj;
        return Intrinsics.d(this.a, x4vVar.a) && this.b.equals(x4vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionStarted(pointer=" + this.a + ", waveEntity=" + this.b + ")";
    }
}
