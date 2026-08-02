package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ecf {
    public final Float a;
    public kya b;

    public ecf(Float f, kya kyaVar) {
        this.a = f;
        this.b = kyaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ecf)) {
            return false;
        }
        ecf ecfVar = (ecf) obj;
        return ecfVar.a.equals(this.a) && Intrinsics.d(ecfVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + f1d.a(0, this.a.hashCode() * 31, 31);
    }
}
