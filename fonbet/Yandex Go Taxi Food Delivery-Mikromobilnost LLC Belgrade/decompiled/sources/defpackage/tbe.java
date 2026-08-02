package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ContactSelectorRemoteCoreWidget$ContactPositionModel;

/* loaded from: classes5.dex */
public final class tbe implements pre {
    public final String a;
    public final c0k0 b;
    public final ContactSelectorRemoteCoreWidget$ContactPositionModel c;
    public final FormattedText d;
    public final FormattedText e;
    public final hty0 f;
    public final lts0 g;
    public final lts0 h;
    public final fws0 i;
    public final fws0 j;
    public final o690 k;
    public final sbe l;
    public final String m;
    public final Map n;

    public tbe(String str, c0k0 c0k0Var, ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel, FormattedText formattedText, FormattedText formattedText2, hty0 hty0Var, lts0 lts0Var, lts0 lts0Var2, fws0 fws0Var, fws0 fws0Var2, o690 o690Var, sbe sbeVar, String str2, Map map) {
        this.a = str;
        this.b = c0k0Var;
        this.c = contactSelectorRemoteCoreWidget$ContactPositionModel;
        this.d = formattedText;
        this.e = formattedText2;
        this.f = hty0Var;
        this.g = lts0Var;
        this.h = lts0Var2;
        this.i = fws0Var;
        this.j = fws0Var2;
        this.k = o690Var;
        this.l = sbeVar;
        this.m = str2;
        this.n = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbe)) {
            return false;
        }
        tbe tbeVar = (tbe) obj;
        return jl40.l(this.a, tbeVar.a) && this.b.equals(tbeVar.b) && this.c == tbeVar.c && this.d.equals(tbeVar.d) && this.e.equals(tbeVar.e) && jl40.l(this.f, tbeVar.f) && jl40.l(this.g, tbeVar.g) && jl40.l(this.h, tbeVar.h) && jl40.l(this.i, tbeVar.i) && jl40.l(this.j, tbeVar.j) && jl40.l(this.k, tbeVar.k) && jl40.l(this.l, tbeVar.l) && jl40.l(this.m, tbeVar.m) && jl40.l(this.n, tbeVar.n);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "contact";
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a), 31, this.e.a);
        hty0 hty0Var = this.f;
        int hashCode = (c + (hty0Var == null ? 0 : hty0Var.hashCode())) * 31;
        lts0 lts0Var = this.g;
        int hashCode2 = (hashCode + (lts0Var == null ? 0 : lts0Var.hashCode())) * 31;
        lts0 lts0Var2 = this.h;
        int hashCode3 = (hashCode2 + (lts0Var2 == null ? 0 : lts0Var2.hashCode())) * 31;
        fws0 fws0Var = this.i;
        int hashCode4 = (hashCode3 + (fws0Var == null ? 0 : fws0Var.hashCode())) * 31;
        fws0 fws0Var2 = this.j;
        int hashCode5 = (hashCode4 + (fws0Var2 == null ? 0 : fws0Var2.hashCode())) * 31;
        o690 o690Var = this.k;
        int hashCode6 = (hashCode5 + (o690Var == null ? 0 : o690Var.hashCode())) * 31;
        sbe sbeVar = this.l;
        int hashCode7 = (hashCode6 + (sbeVar == null ? 0 : sbeVar.hashCode())) * 31;
        String str = this.m;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.n;
        return hashCode8 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "ContactSelectorRemoteCoreWidget(id=" + this.a + ", resultPosition=" + this.b + ", contactPosition=" + this.c + ", selectedDescription=" + this.d + ", unselectedDescription=" + this.e + ", addressStyle=" + this.f + ", selectedLead=" + this.g + ", unselectedLead=" + this.h + ", selectedTrail=" + this.i + ", unselectedTrail=" + this.j + ", horizontalPaddings=" + this.k + ", contactPrefill=" + this.l + ", metricaLabel=" + this.m + ", meta=" + this.n + Extension.C_BRAKE;
    }
}
