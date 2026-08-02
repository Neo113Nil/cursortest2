package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b7v {
    public final float a;
    public final Function0 b;
    public final float c;
    public final x7v d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public b7v(float f, Function0 function0, float f2, x7v x7vVar, boolean z, boolean z2, float f3) {
        function0.getClass();
        x7vVar.getClass();
        this.a = f;
        this.b = function0;
        this.c = f2;
        this.d = x7vVar;
        this.e = z;
        this.f = z2;
        this.g = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7v)) {
            return false;
        }
        b7v b7vVar = (b7v) obj;
        return cma.a(this.a, b7vVar.a) && Intrinsics.d(this.b, b7vVar.b) && cma.a(this.c, b7vVar.c) && this.d == b7vVar.d && this.e == b7vVar.e && this.f == b7vVar.f && cma.a(this.g, b7vVar.g);
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + k5r.e(k5r.e((this.d.hashCode() + eta.a((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, this.c, 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String b = cma.b(this.a);
        String b2 = cma.b(this.c);
        String b3 = cma.b(this.g);
        StringBuilder sb = new StringBuilder("WaveWordsContainerConfig(safeZone=");
        sb.append(b);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(b2);
        sb.append(", iconStyle=");
        sb.append(this.d);
        sb.append(", iconDynamicAiLabel=");
        dfi.t(sb, this.e, ", iconSmoothTransitions=", this.f, ", starSize=");
        return su4.o(sb, b3, ")");
    }
}
