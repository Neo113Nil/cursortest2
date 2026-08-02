package defpackage;

import com.yandex.go.trusted_contacts.ui.TrustedContactsButtonAction;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uh11 {
    public final int a;
    public final Integer b;
    public final int c;
    public final TrustedContactsButtonAction d;
    public final ArrayList e;
    public final int f;
    public final int g;

    public uh11(int i, Integer num, int i2, TrustedContactsButtonAction trustedContactsButtonAction, ArrayList arrayList, int i3, int i4) {
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = trustedContactsButtonAction;
        this.e = arrayList;
        this.f = i3;
        this.g = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh11)) {
            return false;
        }
        uh11 uh11Var = (uh11) obj;
        return this.a == uh11Var.a && jl40.l(this.b, uh11Var.b) && this.c == uh11Var.c && this.d == uh11Var.d && this.e.equals(uh11Var.e) && this.f == uh11Var.f && this.g == uh11Var.g;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Integer.hashCode(this.g) + oyr.b(this.f, ly3.b((this.d.hashCode() + oyr.b(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrustedContactsScreenData(toolbarTitleRes=");
        sb.append(this.a);
        sb.append(", toolbarEndIcon=");
        sb.append(this.b);
        sb.append(", buttonTextRes=");
        sb.append(this.c);
        sb.append(", buttonAction=");
        sb.append(this.d);
        sb.append(", contactItems=");
        sb.append(this.e);
        sb.append(", trustedContactsCount=");
        sb.append(this.f);
        sb.append(", trustingContactsCount=");
        return oyr.m(this.g, Extension.C_BRAKE, sb);
    }
}
