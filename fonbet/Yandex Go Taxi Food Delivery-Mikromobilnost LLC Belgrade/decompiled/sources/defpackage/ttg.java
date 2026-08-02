package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ttg {
    public static final ttg i = new ttg("", "", null, null, null, null, null, null);
    public final String a;
    public final String b;
    public final wqk0 c;
    public final wqk0 d;
    public final stg e;
    public final aid0 f;
    public final mt g;
    public final mt h;

    public ttg(String str, String str2, wqk0 wqk0Var, wqk0 wqk0Var2, stg stgVar, aid0 aid0Var, mt mtVar, mt mtVar2) {
        this.a = str;
        this.b = str2;
        this.c = wqk0Var;
        this.d = wqk0Var2;
        this.e = stgVar;
        this.f = aid0Var;
        this.g = mtVar;
        this.h = mtVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttg)) {
            return false;
        }
        ttg ttgVar = (ttg) obj;
        return jl40.l(this.a, ttgVar.a) && jl40.l(this.b, ttgVar.b) && jl40.l(this.c, ttgVar.c) && jl40.l(this.d, ttgVar.d) && jl40.l(this.e, ttgVar.e) && jl40.l(this.f, ttgVar.f) && jl40.l(this.g, ttgVar.g) && jl40.l(this.h, ttgVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        wqk0 wqk0Var = this.c;
        int hashCode3 = (hashCode2 + (wqk0Var == null ? 0 : wqk0Var.hashCode())) * 31;
        wqk0 wqk0Var2 = this.d;
        int hashCode4 = (hashCode3 + (wqk0Var2 == null ? 0 : wqk0Var2.hashCode())) * 31;
        stg stgVar = this.e;
        int hashCode5 = (hashCode4 + (stgVar == null ? 0 : stgVar.hashCode())) * 31;
        aid0 aid0Var = this.f;
        int hashCode6 = (hashCode5 + (aid0Var == null ? 0 : aid0Var.hashCode())) * 31;
        mt mtVar = this.g;
        int hashCode7 = (hashCode6 + (mtVar == null ? 0 : mtVar.hashCode())) * 31;
        mt mtVar2 = this.h;
        return hashCode7 + (mtVar2 != null ? mtVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebtFlowPaymentViewModel(title=", this.a, ", subtitle=", this.b, ", primaryRideViewModel=");
        v.append(this.c);
        v.append(", secondaryRideViewModel=");
        v.append(this.d);
        v.append(", cardSelectorViewModel=");
        v.append(this.e);
        v.append(", plusPointsStateViewModel=");
        v.append(this.f);
        v.append(", primaryActionButtonViewModel=");
        v.append(this.g);
        v.append(", secondaryActionButtonViewModel=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
