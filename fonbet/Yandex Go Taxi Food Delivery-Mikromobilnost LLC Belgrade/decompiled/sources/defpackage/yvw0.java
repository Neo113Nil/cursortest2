package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yvw0 {
    public final wp2 a;
    public final float b;
    public final int c;
    public final nvi0 d;
    public final int e;

    public yvw0(wp2 wp2Var, float f, int i, nvi0 nvi0Var, int i2) {
        this.a = wp2Var;
        this.b = f;
        this.c = i;
        this.d = nvi0Var;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvw0)) {
            return false;
        }
        yvw0 yvw0Var = (yvw0) obj;
        return jl40.l(this.a, yvw0Var.a) && Float.compare(this.b, yvw0Var.b) == 0 && this.c == yvw0Var.c && this.d.equals(yvw0Var.d) && this.e == yvw0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + oyr.b(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurgeWidgetBodyUiState(color=");
        sb.append(this.a);
        sb.append(", offsetPercent=");
        sb.append(this.b);
        sb.append(", barPointerSize=");
        sb.append(this.c);
        sb.append(", barPointerRemoteImage=");
        sb.append(this.d);
        sb.append(", barWidth=");
        return oyr.m(this.e, Extension.C_BRAKE, sb);
    }
}
