package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ci3 implements bcs {
    public final ltp a;
    public final float b;

    public ci3(ltp ltpVar, float f) {
        this.a = ltpVar;
        this.b = f;
    }

    @Override // defpackage.bcs
    public final long a() {
        int i = d85.o;
        return d85.n;
    }

    @Override // defpackage.bcs
    public final float b() {
        return this.b;
    }

    @Override // defpackage.bcs
    public final ai3 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci3)) {
            return false;
        }
        ci3 ci3Var = (ci3) obj;
        return Intrinsics.d(this.a, ci3Var.a) && Float.compare(this.b, ci3Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return ouj.p(sb, this.b, ')');
    }
}
