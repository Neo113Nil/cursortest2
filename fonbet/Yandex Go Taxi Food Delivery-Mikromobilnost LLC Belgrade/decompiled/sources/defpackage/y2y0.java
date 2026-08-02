package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.linked_order.models.data.LinkedOrderType;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;

/* loaded from: classes8.dex */
public final class y2y0 implements w201 {
    public final String a;
    public final i501 b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final q48 g;
    public final LinkedOrderStatusDto h;
    public final LinkedOrderType i;

    public y2y0(String str, i501 i501Var, long j, String str2, String str3, String str4, q48 q48Var, LinkedOrderStatusDto linkedOrderStatusDto, LinkedOrderType linkedOrderType) {
        this.a = str;
        this.b = i501Var;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = q48Var;
        this.h = linkedOrderStatusDto;
        this.i = linkedOrderType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2y0)) {
            return false;
        }
        y2y0 y2y0Var = (y2y0) obj;
        return jl40.l(this.a, y2y0Var.a) && jl40.l(this.b, y2y0Var.b) && this.c == y2y0Var.c && jl40.l(this.d, y2y0Var.d) && jl40.l(this.e, y2y0Var.e) && jl40.l(this.f, y2y0Var.f) && jl40.l(this.g, y2y0Var.g) && this.h == y2y0Var.h && this.i == y2y0Var.i;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        q48 q48Var = this.g;
        return this.i.hashCode() + ((this.h.hashCode() + ((hashCode + (q48Var != null ? q48Var.hashCode() : 0)) * 31)) * 31);
    }

    @Override // defpackage.w201
    public final i501 q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiOrderLinkedTracking(id=");
        sb.append(this.a);
        sb.append(", cardSwipeBehaviour=");
        sb.append(this.b);
        sb.append(", timestamp=");
        uw51.v(this.c, ", title=", this.d, sb);
        g8e.D(sb, ", subtitle=", this.e, ", imageTag=", this.f);
        sb.append(", carData=");
        sb.append(this.g);
        sb.append(", orderState=");
        sb.append(this.h);
        sb.append(", type=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
