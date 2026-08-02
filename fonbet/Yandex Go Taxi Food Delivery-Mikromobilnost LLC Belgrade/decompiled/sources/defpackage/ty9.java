package defpackage;

import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackBannerAnalyticsAlias;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ty9 {
    public final CharSequence a;
    public final CharSequence b;
    public final tn9 c;
    public final nvi0 d;
    public final xy9 e;
    public final ChargersFeedbackBannerAnalyticsAlias f;

    public ty9(CharSequence charSequence, CharSequence charSequence2, tn9 tn9Var, ovi0 ovi0Var, xy9 xy9Var, ChargersFeedbackBannerAnalyticsAlias chargersFeedbackBannerAnalyticsAlias) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = tn9Var;
        this.d = ovi0Var;
        this.e = xy9Var;
        this.f = chargersFeedbackBannerAnalyticsAlias;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty9)) {
            return false;
        }
        ty9 ty9Var = (ty9) obj;
        return jl40.l(this.a, ty9Var.a) && jl40.l(this.b, ty9Var.b) && jl40.l(this.c, ty9Var.c) && jl40.l(this.d, ty9Var.d) && jl40.l(this.e, ty9Var.e) && this.f == ty9Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        tn9 tn9Var = this.c;
        int hashCode3 = (hashCode2 + (tn9Var == null ? 0 : tn9Var.hashCode())) * 31;
        nvi0 nvi0Var = this.d;
        int hashCode4 = (hashCode3 + (nvi0Var == null ? 0 : nvi0Var.hashCode())) * 31;
        xy9 xy9Var = this.e;
        int hashCode5 = (hashCode4 + (xy9Var == null ? 0 : xy9Var.hashCode())) * 31;
        ChargersFeedbackBannerAnalyticsAlias chargersFeedbackBannerAnalyticsAlias = this.f;
        return hashCode5 + (chargersFeedbackBannerAnalyticsAlias != null ? chargersFeedbackBannerAnalyticsAlias.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ChargersFeedbackBanner(title=", ", subtitle=", ", attribute=");
        r.append(this.c);
        r.append(", image=");
        r.append(this.d);
        r.append(", action=");
        r.append(this.e);
        r.append(", analyticsAlias=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
