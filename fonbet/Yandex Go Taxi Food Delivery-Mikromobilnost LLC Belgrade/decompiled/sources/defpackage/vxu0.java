package defpackage;

import com.yandex.go.taxi.order.bubble.model.Bubble$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vxu0 extends tl6 {
    public final zzs a;
    public final Bubble$Type b;
    public final sxu0 c;
    public final String d = toString();

    public vxu0(zzs zzsVar, Bubble$Type bubble$Type, sxu0 sxu0Var) {
        this.a = zzsVar;
        this.b = bubble$Type;
        this.c = sxu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxu0)) {
            return false;
        }
        vxu0 vxu0Var = (vxu0) obj;
        return jl40.l(this.a, vxu0Var.a) && this.b == vxu0Var.b && this.c.equals(vxu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StyledBubble(geoPoint=" + this.a + ", type=" + this.b + ", icon=" + this.c + Extension.C_BRAKE;
    }
}
