package defpackage;

import com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ru9 implements tu9 {
    public final ir9 a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final qu9 f;
    public final CharSequence g;
    public final ChargersPromoDetailsDto h;

    public ru9(ir9 ir9Var, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, qu9 qu9Var, CharSequence charSequence4, ChargersPromoDetailsDto chargersPromoDetailsDto) {
        this.a = ir9Var;
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = qu9Var;
        this.g = charSequence4;
        this.h = chargersPromoDetailsDto;
    }

    @Override // defpackage.tu9
    public final as9 a() {
        return this.h;
    }

    @Override // defpackage.tu9
    public final ir9 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru9)) {
            return false;
        }
        ru9 ru9Var = (ru9) obj;
        return jl40.l(this.a, ru9Var.a) && jl40.l(this.b, ru9Var.b) && jl40.l(this.c, ru9Var.c) && jl40.l(this.d, ru9Var.d) && jl40.l(this.e, ru9Var.e) && jl40.l(this.f, ru9Var.f) && jl40.l(this.g, ru9Var.g) && jl40.l(this.h, ru9Var.h);
    }

    public final int hashCode() {
        int b = smw0.b((this.f.hashCode() + smw0.b(smw0.b(smw0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
        ChargersPromoDetailsDto chargersPromoDetailsDto = this.h;
        return b + (chargersPromoDetailsDto == null ? 0 : chargersPromoDetailsDto.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RentalPromoItem(discount=");
        sb.append(this.a);
        sb.append(", imageTag=");
        sb.append(this.b);
        sb.append(", body=");
        vfc.A(sb, this.c, ", description=", this.d, ", rightBody=");
        sb.append((Object) this.e);
        sb.append(", toggle=");
        sb.append(this.f);
        sb.append(", toggleText=");
        sb.append((Object) this.g);
        sb.append(", details=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
