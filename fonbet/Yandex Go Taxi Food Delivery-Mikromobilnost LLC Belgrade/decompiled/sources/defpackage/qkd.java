package defpackage;

import com.yandex.plus.core.graphql.type.COMPOSITE_OFFER_STRUCTURE_TYPE;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class qkd {
    public final String a;
    public final COMPOSITE_OFFER_STRUCTURE_TYPE b;
    public final kkd c;
    public final okd d;
    public final ArrayList e;
    public final mkd f;
    public final ArrayList g;
    public final jkd h;
    public final boolean i;

    public qkd(String str, COMPOSITE_OFFER_STRUCTURE_TYPE composite_offer_structure_type, kkd kkdVar, okd okdVar, ArrayList arrayList, mkd mkdVar, ArrayList arrayList2, jkd jkdVar, boolean z) {
        this.a = str;
        this.b = composite_offer_structure_type;
        this.c = kkdVar;
        this.d = okdVar;
        this.e = arrayList;
        this.f = mkdVar;
        this.g = arrayList2;
        this.h = jkdVar;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkd)) {
            return false;
        }
        qkd qkdVar = (qkd) obj;
        return this.a.equals(qkdVar.a) && this.b == qkdVar.b && jl40.l(this.c, qkdVar.c) && jl40.l(this.d, qkdVar.d) && this.e.equals(qkdVar.e) && jl40.l(this.f, qkdVar.f) && this.g.equals(qkdVar.g) && this.h.equals(qkdVar.h) && this.i == qkdVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        kkd kkdVar = this.c;
        int hashCode2 = (hashCode + (kkdVar == null ? 0 : kkdVar.a.hashCode())) * 31;
        okd okdVar = this.d;
        int b = ly3.b((hashCode2 + (okdVar == null ? 0 : okdVar.hashCode())) * 31, 31, this.e);
        mkd mkdVar = this.f;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ly3.b((b + (mkdVar != null ? mkdVar.hashCode() : 0)) * 31, 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositeOffer(positionId=");
        sb.append(this.a);
        sb.append(", structureType=");
        sb.append(this.b);
        sb.append(", forActiveTariff=");
        sb.append(this.c);
        sb.append(", tariffOffer=");
        sb.append(this.d);
        sb.append(", optionOffers=");
        sb.append(this.e);
        sb.append(", legalInfo=");
        sb.append(this.f);
        sb.append(", invoices=");
        sb.append(this.g);
        sb.append(", asset=");
        sb.append(this.h);
        sb.append(", silentInvoiceAvailable=");
        return unr0.u(sb, this.i, ')');
    }
}
