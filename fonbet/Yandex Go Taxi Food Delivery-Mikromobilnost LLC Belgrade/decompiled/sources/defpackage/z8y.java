package defpackage;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class z8y implements taa {
    public final String a;
    public final FormattedText b;
    public final sca c;
    public final FormattedText d;
    public final FormattedText e;
    public final String f;
    public final FormattedText g;
    public final String h;
    public final FormattedText i;
    public final FormattedText j;
    public final FormattedText k;
    public final ArrayList l;
    public final ArrayList m;
    public final y8y n;
    public final Integer o;
    public final Integer p;
    public final List q;
    public final List r;

    public z8y(String str, FormattedText formattedText, sca scaVar, FormattedText formattedText2, FormattedText formattedText3, String str2, FormattedText formattedText4, String str3, FormattedText formattedText5, FormattedText formattedText6, FormattedText formattedText7, ArrayList arrayList, ArrayList arrayList2, y8y y8yVar, Integer num, Integer num2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = str;
        this.b = formattedText;
        this.c = scaVar;
        this.d = formattedText2;
        this.e = formattedText3;
        this.f = str2;
        this.g = formattedText4;
        this.h = str3;
        this.i = formattedText5;
        this.j = formattedText6;
        this.k = formattedText7;
        this.l = arrayList;
        this.m = arrayList2;
        this.n = y8yVar;
        this.o = num;
        this.p = num2;
        this.q = arrayList3;
        this.r = arrayList4;
    }

    @Override // defpackage.taa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.taa
    public final ChargersActiveOrderStatus b() {
        return ChargersActiveOrderStatus.LEASING;
    }

    @Override // defpackage.taa
    public final sca c() {
        return this.c;
    }

    @Override // defpackage.taa
    public final FormattedText d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8y)) {
            return false;
        }
        z8y z8yVar = (z8y) obj;
        return this.a.equals(z8yVar.a) && this.b.equals(z8yVar.b) && jl40.l(this.c, z8yVar.c) && jl40.l(this.d, z8yVar.d) && jl40.l(this.e, z8yVar.e) && jl40.l(this.f, z8yVar.f) && jl40.l(this.g, z8yVar.g) && jl40.l(this.h, z8yVar.h) && this.i.equals(z8yVar.i) && jl40.l(this.j, z8yVar.j) && jl40.l(this.k, z8yVar.k) && this.l.equals(z8yVar.l) && this.m.equals(z8yVar.m) && jl40.l(this.n, z8yVar.n) && jl40.l(this.o, z8yVar.o) && jl40.l(this.p, z8yVar.p) && jl40.l(this.q, z8yVar.q) && jl40.l(this.r, z8yVar.r);
    }

    public final int hashCode() {
        int b = ly3.b(ly3.b(unr0.c(unr0.c(unr0.c(unr0.b(unr0.c(unr0.b(unr0.c(unr0.c((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a)) * 31, 31, this.d.a), 31, this.e.a), 31, this.f), 31, this.g.a), 31, this.h), 31, this.i.a), 31, this.j.a), 31, this.k.a), 31, this.l), 31, this.m);
        y8y y8yVar = this.n;
        int hashCode = (b + (y8yVar == null ? 0 : y8yVar.hashCode())) * 31;
        Integer num = this.o;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.p;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.q;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.r;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("LeasingChargersOrder(orderId=", this.a, ", statusText=", ", multiorder=", this.b);
        q.append(this.c);
        q.append(", primaryLabel=");
        q.append(this.d);
        q.append(", secondaryLabel=");
        q.append(this.e);
        q.append(", powerBankNumber=");
        q.append(this.f);
        q.append(", powerBankNumberText=");
        q.append(this.g);
        q.append(", powerBankIconTag=");
        q.append(this.h);
        q.append(", pricingPlanText=");
        n.C(q, this.i, ", durationText=", this.j, ", priceAndDurationText=");
        q.append(this.k);
        q.append(", items=");
        q.append(this.l);
        q.append(", details=");
        q.append(this.m);
        q.append(", activeCardModes=");
        q.append(this.n);
        q.append(", freeCheckSeconds=");
        q.append(this.o);
        q.append(", freeCheckDeltaSeconds=");
        q.append(this.p);
        q.append(", notifications=");
        return vfc.p(q, this.q, ", popups=", this.r, Extension.C_BRAKE);
    }
}
