package defpackage;

import com.yandex.go.taxi.summary.verticalsummary.state.TariffUiState$AlternativePosition;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uox0 {
    public final boolean a;
    public final String b;
    public final TariffUiState$AlternativePosition c;
    public final CharSequence d;
    public final String e;
    public final nvi0 f;
    public final tox0 g;
    public final boolean h;
    public final vcx0 i;
    public final wbx0 j;
    public final qdx0 k;

    public uox0(boolean z, String str, TariffUiState$AlternativePosition tariffUiState$AlternativePosition, CharSequence charSequence, String str2, pvi0 pvi0Var, tox0 tox0Var, boolean z2, vcx0 vcx0Var, wbx0 wbx0Var, qdx0 qdx0Var) {
        this.a = z;
        this.b = str;
        this.c = tariffUiState$AlternativePosition;
        this.d = charSequence;
        this.e = str2;
        this.f = pvi0Var;
        this.g = tox0Var;
        this.h = z2;
        this.i = vcx0Var;
        this.j = wbx0Var;
        this.k = qdx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uox0)) {
            return false;
        }
        uox0 uox0Var = (uox0) obj;
        return this.a == uox0Var.a && jl40.l(this.b, uox0Var.b) && this.c == uox0Var.c && this.d.equals(uox0Var.d) && jl40.l(this.e, uox0Var.e) && jl40.l(this.f, uox0Var.f) && this.g.equals(uox0Var.g) && this.h == uox0Var.h && this.i.equals(uox0Var.i) && this.j.equals(uox0Var.j) && this.k.equals(uox0Var.k);
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        TariffUiState$AlternativePosition tariffUiState$AlternativePosition = this.c;
        int b2 = smw0.b((b + (tariffUiState$AlternativePosition == null ? 0 : tariffUiState$AlternativePosition.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        nvi0 nvi0Var = this.f;
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + unr0.e((this.g.hashCode() + ((hashCode + (nvi0Var != null ? nvi0Var.hashCode() : 0)) * 31)) * 31, 31, this.h)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("TariffUiState(isSelected=", ", tariffName=", this.b, ", alternativePosition=", this.a);
        v.append(this.c);
        v.append(", price=");
        v.append((Object) this.d);
        v.append(", plusValue=");
        v.append(this.e);
        v.append(", leadImage=");
        v.append(this.f);
        v.append(", metaInfo=");
        v.append(this.g);
        v.append(", isStub=");
        v.append(this.h);
        v.append(", leadState=");
        v.append(this.i);
        v.append(", bodyState=");
        v.append(this.j);
        v.append(", trailState=");
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
