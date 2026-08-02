package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.SlotModel$Size;

/* loaded from: classes5.dex */
public final class xts0 {
    public final lts0 a;
    public final hqs0 b;
    public final hqs0 c;
    public final hqs0 d;
    public final fws0 e;
    public final fws0 f;
    public final r9x0 g;
    public final boolean h;
    public final qus0 i;
    public final List j;
    public final SlotModel$Size k;

    public xts0(lts0 lts0Var, hqs0 hqs0Var, hqs0 hqs0Var2, hqs0 hqs0Var3, fws0 fws0Var, fws0 fws0Var2, r9x0 r9x0Var, boolean z, qus0 qus0Var, List list, SlotModel$Size slotModel$Size) {
        this.a = lts0Var;
        this.b = hqs0Var;
        this.c = hqs0Var2;
        this.d = hqs0Var3;
        this.e = fws0Var;
        this.f = fws0Var2;
        this.g = r9x0Var;
        this.h = z;
        this.i = qus0Var;
        this.j = list;
        this.k = slotModel$Size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xts0)) {
            return false;
        }
        xts0 xts0Var = (xts0) obj;
        return jl40.l(this.a, xts0Var.a) && this.b.equals(xts0Var.b) && jl40.l(this.c, xts0Var.c) && jl40.l(this.d, xts0Var.d) && jl40.l(this.e, xts0Var.e) && jl40.l(this.f, xts0Var.f) && jl40.l(this.g, xts0Var.g) && this.h == xts0Var.h && jl40.l(this.i, xts0Var.i) && jl40.l(this.j, xts0Var.j) && this.k == xts0Var.k;
    }

    public final int hashCode() {
        lts0 lts0Var = this.a;
        int hashCode = (this.b.hashCode() + ((lts0Var == null ? 0 : lts0Var.hashCode()) * 31)) * 31;
        hqs0 hqs0Var = this.c;
        int hashCode2 = (hashCode + (hqs0Var == null ? 0 : hqs0Var.hashCode())) * 31;
        hqs0 hqs0Var2 = this.d;
        int hashCode3 = (hashCode2 + (hqs0Var2 == null ? 0 : hqs0Var2.hashCode())) * 31;
        fws0 fws0Var = this.e;
        int hashCode4 = (hashCode3 + (fws0Var == null ? 0 : fws0Var.hashCode())) * 31;
        fws0 fws0Var2 = this.f;
        int hashCode5 = (hashCode4 + (fws0Var2 == null ? 0 : fws0Var2.hashCode())) * 31;
        r9x0 r9x0Var = this.g;
        return this.k.hashCode() + unr0.c((this.i.hashCode() + unr0.e((hashCode5 + (r9x0Var != null ? r9x0Var.hashCode() : 0)) * 31, 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        return "SlotModel(lead=" + this.a + ", body1=" + this.b + ", body2=" + this.c + ", body3=" + this.d + ", trail1=" + this.e + ", trail2=" + this.f + ", action=" + this.g + ", enabled=" + this.h + ", style=" + this.i + ", stateDependedStyles=" + this.j + ", size=" + this.k + Extension.C_BRAKE;
    }
}
