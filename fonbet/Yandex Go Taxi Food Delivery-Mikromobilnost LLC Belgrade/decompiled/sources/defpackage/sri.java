package defpackage;

import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Alignment;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sri extends uri {
    public final zp1 a;
    public final zp1 b;
    public final DeliveryStateItem$TextWidget$Alignment c;
    public final DeliveryStateItem$TextWidget$Alignment d;
    public final Integer e;
    public final f2w f;
    public final f2w g;
    public final DeliveryStateItem$TextWidget$Type h;
    public final gv90 i;
    public final boolean j;
    public final String k;

    public sri(zp1 zp1Var, zp1 zp1Var2, DeliveryStateItem$TextWidget$Alignment deliveryStateItem$TextWidget$Alignment, DeliveryStateItem$TextWidget$Alignment deliveryStateItem$TextWidget$Alignment2, Integer num, f2w f2wVar, f2w f2wVar2, DeliveryStateItem$TextWidget$Type deliveryStateItem$TextWidget$Type, gv90 gv90Var, boolean z, String str) {
        this.a = zp1Var;
        this.b = zp1Var2;
        this.c = deliveryStateItem$TextWidget$Alignment;
        this.d = deliveryStateItem$TextWidget$Alignment2;
        this.e = num;
        this.f = f2wVar;
        this.g = f2wVar2;
        this.h = deliveryStateItem$TextWidget$Type;
        this.i = gv90Var;
        this.j = z;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sri) {
            sri sriVar = (sri) obj;
            if (this.a == sriVar.a && jl40.l(this.b, sriVar.b) && this.c == sriVar.c && this.d == sriVar.d && jl40.l(this.e, sriVar.e) && jl40.l(this.f, sriVar.f) && jl40.l(this.g, sriVar.g) && this.h == sriVar.h && jl40.l(this.i, sriVar.i) && this.j == sriVar.j && jl40.l(this.k, sriVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zp1 zp1Var = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (zp1Var == null ? 0 : zp1Var.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        f2w f2wVar = this.f;
        int hashCode4 = (hashCode3 + (f2wVar == null ? 0 : f2wVar.hashCode())) * 31;
        f2w f2wVar2 = this.g;
        int hashCode5 = (this.h.hashCode() + ((hashCode4 + (f2wVar2 == null ? 0 : f2wVar2.hashCode())) * 31)) * 31;
        gv90 gv90Var = this.i;
        int e = unr0.e((hashCode5 + (gv90Var == null ? 0 : gv90Var.hashCode())) * 31, 31, this.j);
        String str = this.k;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextWidget(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", titleAlignment=");
        sb.append(this.c);
        sb.append(", subtitleAlignment=");
        sb.append(this.d);
        sb.append(", minHeight=");
        sb.append(this.e);
        sb.append(", externalInsets=");
        sb.append(this.f);
        sb.append(", internalInsets=");
        sb.append(this.g);
        sb.append(", type=");
        sb.append(this.h);
        sb.append(", action=");
        sb.append(this.i);
        sb.append(", isShimmering=");
        sb.append(this.j);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }
}
