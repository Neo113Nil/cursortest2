package defpackage;

import android.text.SpannableStringBuilder;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class z3v0 extends anf0 {
    public final SpannableStringBuilder a;
    public final String b;
    public final String c;
    public final List d;
    public final xoe e;
    public final ief f;
    public final String g;
    public final ReferralService h;
    public final int i;
    public final String j;
    public final String k;

    public z3v0(SpannableStringBuilder spannableStringBuilder, String str, String str2, List list, xoe xoeVar, ief iefVar, String str3, ReferralService referralService, int i, String str4, String str5) {
        this.a = spannableStringBuilder;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = xoeVar;
        this.f = iefVar;
        this.g = str3;
        this.h = referralService;
        this.i = i;
        this.j = str4;
        this.k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3v0)) {
            return false;
        }
        z3v0 z3v0Var = (z3v0) obj;
        return this.a.equals(z3v0Var.a) && jl40.l(this.b, z3v0Var.b) && jl40.l(this.c, z3v0Var.c) && this.d.equals(z3v0Var.d) && this.e.equals(z3v0Var.e) && jl40.l(this.f, z3v0Var.f) && jl40.l(this.g, z3v0Var.g) && this.h == z3v0Var.h && this.i == z3v0Var.i && jl40.l(this.j, z3v0Var.j) && jl40.l(this.k, z3v0Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.c(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        ief iefVar = this.f;
        int hashCode2 = (hashCode + (iefVar == null ? 0 : iefVar.hashCode())) * 31;
        String str = this.g;
        return this.k.hashCode() + unr0.b(oyr.b(this.i, (this.h.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessShareViewModel(title=");
        sb.append((Object) this.a);
        sb.append(", imageUrl=");
        sb.append(this.b);
        sb.append(", promoCode=");
        tse0.x(this.c, ", instructions=", ", copyButtonStateModel=", sb, this.d);
        sb.append(this.e);
        sb.append(", currencyRulesDto=");
        sb.append(this.f);
        sb.append(", message=");
        sb.append(this.g);
        sb.append(", referralService=");
        sb.append(this.h);
        sb.append(", ridesLeft=");
        smw0.t(this.i, ", shareButtonTitle=", this.j, ", shareButtonSubtitle=", sb);
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }
}
