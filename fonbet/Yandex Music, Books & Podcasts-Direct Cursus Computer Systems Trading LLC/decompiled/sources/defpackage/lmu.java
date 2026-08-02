package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lmu {
    public final d85 a;
    public final d85 b;

    public lmu(d85 d85Var, d85 d85Var2) {
        this.a = d85Var;
        this.b = d85Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmu)) {
            return false;
        }
        lmu lmuVar = (lmu) obj;
        return Intrinsics.d(this.a, lmuVar.a) && Intrinsics.d(this.b, lmuVar.b);
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
        return "WaveButtonUiColors(background=" + this.a + ", headerTextColor=" + this.b + ")";
    }
}
