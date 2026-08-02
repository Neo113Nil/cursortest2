package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

/* loaded from: classes8.dex */
public final class sap {
    public final boolean a;
    public final CharSequence b;
    public final CharSequence c;
    public final boolean d;
    public final String e;
    public final String f;
    public final kdc g;
    public final kdc h;
    public final ActionButton.ButtonActionType i;
    public final String j;

    static {
        ActionButton.ButtonActionType buttonActionType = ActionButton.ButtonActionType.WEB_VIEW;
    }

    public sap(boolean z, CharSequence charSequence, CharSequence charSequence2, boolean z2, String str, String str2, kdc kdcVar, kdc kdcVar2, ActionButton.ButtonActionType buttonActionType, String str3) {
        this.a = z;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.g = kdcVar;
        this.h = kdcVar2;
        this.i = buttonActionType;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sap)) {
            return false;
        }
        sap sapVar = (sap) obj;
        return this.a == sapVar.a && jl40.l(this.b, sapVar.b) && jl40.l(this.c, sapVar.c) && this.d == sapVar.d && this.e.equals(sapVar.e) && jl40.l(this.f, sapVar.f) && jl40.l(this.g, sapVar.g) && jl40.l(this.h, sapVar.h) && this.i == sapVar.i && jl40.l(this.j, sapVar.j);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.e(smw0.b(smw0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        kdc kdcVar = this.g;
        int hashCode = (b + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.h;
        return this.j.hashCode() + ((this.i.hashCode() + ((hashCode + (kdcVar2 != null ? kdcVar2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(isVisible=");
        sb.append(this.a);
        sb.append(", itemTitle=");
        sb.append((Object) this.b);
        sb.append(", itemDescription=");
        sb.append((Object) this.c);
        sb.append(", hasActionButton=");
        sb.append(this.d);
        sb.append(", buttonTitle=");
        g8e.D(sb, this.e, ", buttonDeeplink=", this.f, ", buttonTextColor=");
        sb.append(this.g);
        sb.append(", buttonColor=");
        sb.append(this.h);
        sb.append(", buttonAction=");
        sb.append(this.i);
        sb.append(", webViewUrl=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
