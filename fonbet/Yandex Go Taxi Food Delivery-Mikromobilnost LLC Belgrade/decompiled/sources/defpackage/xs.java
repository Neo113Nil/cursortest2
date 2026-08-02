package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ButtonSize;

/* loaded from: classes5.dex */
public final class xs extends n351 {
    public final ButtonSize c;
    public final fqs0 d;
    public final hka1 e;
    public final boolean f;
    public final Boolean g;
    public final boolean h;
    public final x9x0 i;
    public final x2s j;
    public final l690 k;
    public final String l;

    public xs(ButtonSize buttonSize, fqs0 fqs0Var, hka1 hka1Var, boolean z, Boolean bool, boolean z2, x9x0 x9x0Var, x2s x2sVar, l690 l690Var, String str) {
        super("action-button", false, 14);
        this.c = buttonSize;
        this.d = fqs0Var;
        this.e = hka1Var;
        this.f = z;
        this.g = bool;
        this.h = z2;
        this.i = x9x0Var;
        this.j = x2sVar;
        this.k = l690Var;
        this.l = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs)) {
            return false;
        }
        xs xsVar = (xs) obj;
        return this.c == xsVar.c && jl40.l(this.d, xsVar.d) && this.e.equals(xsVar.e) && this.f == xsVar.f && this.g.equals(xsVar.g) && this.h == xsVar.h && this.i.equals(xsVar.i) && jl40.l(this.j, xsVar.j) && this.k.equals(xsVar.k) && jl40.l(this.l, xsVar.l);
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + unr0.e((this.g.hashCode() + unr0.e((this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31, 31, this.f)) * 31, 31, this.h)) * 31;
        x2s x2sVar = this.j;
        int hashCode2 = (this.k.hashCode() + ((hashCode + (x2sVar == null ? 0 : x2sVar.hashCode())) * 31)) * 31;
        String str = this.l;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ActionButtonModel(buttonSize=" + this.c + ", body=" + this.d + ", style=" + this.e + ", isEnabled=" + this.f + ", analyticsEnabledField=" + this.g + ", isShimmering=" + this.h + ", widgetAction=" + this.i + ", onShownAnalyticsData=" + this.j + ", paddings=" + this.k + ", id=" + this.l + Extension.C_BRAKE;
    }
}
