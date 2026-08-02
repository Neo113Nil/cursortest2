package defpackage;

import com.yandex.go.chargers.discounts.data.models.ChargersTaskDiscountDetailsDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class su9 implements tu9 {
    public final ir9 a;
    public final CharSequence b;
    public final CharSequence c;
    public final int d;
    public final String e;
    public final int f;
    public final kdc g;
    public final CharSequence h;
    public final CharSequence i;
    public final kdc j;
    public final kdc k;
    public final ChargersTaskDiscountDetailsDto l;

    public su9(ir9 ir9Var, CharSequence charSequence, CharSequence charSequence2, int i, String str, int i2, kdc kdcVar, CharSequence charSequence3, CharSequence charSequence4, kdc kdcVar2, kdc kdcVar3, ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto) {
        this.a = ir9Var;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = i;
        this.e = str;
        this.f = i2;
        this.g = kdcVar;
        this.h = charSequence3;
        this.i = charSequence4;
        this.j = kdcVar2;
        this.k = kdcVar3;
        this.l = chargersTaskDiscountDetailsDto;
    }

    @Override // defpackage.tu9
    public final as9 a() {
        return this.l;
    }

    @Override // defpackage.tu9
    public final ir9 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su9)) {
            return false;
        }
        su9 su9Var = (su9) obj;
        return jl40.l(this.a, su9Var.a) && jl40.l(this.b, su9Var.b) && jl40.l(this.c, su9Var.c) && this.d == su9Var.d && jl40.l(this.e, su9Var.e) && this.f == su9Var.f && jl40.l(this.g, su9Var.g) && jl40.l(this.h, su9Var.h) && jl40.l(this.i, su9Var.i) && jl40.l(this.j, su9Var.j) && jl40.l(this.k, su9Var.k) && jl40.l(this.l, su9Var.l);
    }

    public final int hashCode() {
        int b = oyr.b(this.f, unr0.b(oyr.b(this.d, smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31);
        kdc kdcVar = this.g;
        int hashCode = (b + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        CharSequence charSequence = this.h;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.i;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        kdc kdcVar2 = this.j;
        int hashCode4 = (hashCode3 + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31;
        kdc kdcVar3 = this.k;
        int hashCode5 = (hashCode4 + (kdcVar3 == null ? 0 : kdcVar3.hashCode())) * 31;
        ChargersTaskDiscountDetailsDto chargersTaskDiscountDetailsDto = this.l;
        return hashCode5 + (chargersTaskDiscountDetailsDto != null ? chargersTaskDiscountDetailsDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskDiscountItem(discount=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", description=");
        sb.append((Object) this.c);
        sb.append(", stepsCount=");
        sb.append(this.d);
        sb.append(", imageTag=");
        b64.A(this.f, this.e, ", currentStep=", ", backgroundColor=", sb);
        sb.append(this.g);
        sb.append(", rightBody=");
        sb.append((Object) this.h);
        sb.append(", progressDescriptionText=");
        sb.append((Object) this.i);
        sb.append(", activeProgressColor=");
        sb.append(this.j);
        sb.append(", baseProgressColor=");
        sb.append(this.k);
        sb.append(", details=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
