package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m1u {
    public final d85 a;
    public final d85 b;

    public m1u(d85 d85Var, d85 d85Var2) {
        this.a = d85Var;
        this.b = d85Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1u)) {
            return false;
        }
        m1u m1uVar = (m1u) obj;
        return Intrinsics.d(this.a, m1uVar.a) && Intrinsics.d(this.b, m1uVar.b);
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        d85 d85Var = this.a;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int i2 = hashCode * 31;
        d85 d85Var2 = this.b;
        if (d85Var2 != null) {
            long j2 = d85Var2.a;
            met metVar2 = net.b;
            i = Long.hashCode(j2);
        }
        return i2 + i;
    }

    public final String toString() {
        return "VibeBlockColorsUiData(average=" + this.a + ", waveText=" + this.b + ")";
    }
}
