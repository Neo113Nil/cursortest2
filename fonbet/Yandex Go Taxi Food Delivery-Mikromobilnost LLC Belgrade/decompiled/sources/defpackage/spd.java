package defpackage;

import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$StructureType;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
/* loaded from: classes2.dex */
public final class spd {
    public static final xnd Companion = new xnd();
    public static final i3y[] j;
    public final String a;
    public final CompositeOfferDto$StructureType b;
    public final wnd c;
    public final List d;
    public final qpd e;
    public final List f;
    public final kod g;
    public final boolean h;
    public final List i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, a.b(lazyThreadSafetyMode, new juc(17)), null, a.b(lazyThreadSafetyMode, new juc(18)), null, a.b(lazyThreadSafetyMode, new juc(19)), null, null, a.b(lazyThreadSafetyMode, new juc(20))};
    }

    public /* synthetic */ spd(int i, String str, CompositeOfferDto$StructureType compositeOfferDto$StructureType, wnd wndVar, List list, qpd qpdVar, List list2, kod kodVar, boolean z, List list3) {
        if (71 != (i & 71)) {
            qje.Z(i, 71, tnd.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = compositeOfferDto$StructureType;
        this.c = wndVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = qpdVar;
        }
        int i2 = i & 32;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.f = emptyList;
        } else {
            this.f = list2;
        }
        this.g = kodVar;
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = emptyList;
        } else {
            this.i = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spd)) {
            return false;
        }
        spd spdVar = (spd) obj;
        return jl40.l(this.a, spdVar.a) && this.b == spdVar.b && jl40.l(this.c, spdVar.c) && jl40.l(this.d, spdVar.d) && jl40.l(this.e, spdVar.e) && jl40.l(this.f, spdVar.f) && jl40.l(this.g, spdVar.g) && this.h == spdVar.h && jl40.l(this.i, spdVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        List list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        qpd qpdVar = this.e;
        return this.i.hashCode() + unr0.e((this.g.hashCode() + unr0.c((hashCode2 + (qpdVar != null ? qpdVar.hashCode() : 0)) * 31, 31, this.f)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositeOfferDto(positionId=");
        sb.append(this.a);
        sb.append(", structureType=");
        sb.append(this.b);
        sb.append(", asset=");
        sb.append(this.c);
        sb.append(", forActiveOffers=");
        sb.append(this.d);
        sb.append(", tariffOffer=");
        sb.append(this.e);
        sb.append(", optionOffers=");
        sb.append(this.f);
        sb.append(", legalInfo=");
        sb.append(this.g);
        sb.append(", silentInvoiceAvailable=");
        sb.append(this.h);
        sb.append(", invoices=");
        return unr0.t(sb, this.i, ')');
    }
}
