package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinVisualState;

/* loaded from: classes7.dex */
public final class zxb0 {
    public final qzb0 a;
    public final PinVisualState b;
    public final List c;
    public final c3c0 d;
    public final boolean e;

    public zxb0(qzb0 qzb0Var, PinVisualState pinVisualState, List list, c3c0 c3c0Var, boolean z) {
        this.a = qzb0Var;
        this.b = pinVisualState;
        this.c = list;
        this.d = c3c0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxb0)) {
            return false;
        }
        zxb0 zxb0Var = (zxb0) obj;
        return jl40.l(this.a, zxb0Var.a) && this.b == zxb0Var.b && this.c.equals(zxb0Var.c) && jl40.l(this.d, zxb0Var.d) && this.e == zxb0Var.e;
    }

    public final int hashCode() {
        int c = unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        c3c0 c3c0Var = this.d;
        return Boolean.hashCode(this.e) + ((c + (c3c0Var == null ? 0 : c3c0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Descriptor(seed=");
        sb.append(this.a);
        sb.append(", visualState=");
        sb.append(this.b);
        sb.append(", placemarkTypes=");
        sb.append(this.c);
        sb.append(", variation=");
        sb.append(this.d);
        sb.append(", visited=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
