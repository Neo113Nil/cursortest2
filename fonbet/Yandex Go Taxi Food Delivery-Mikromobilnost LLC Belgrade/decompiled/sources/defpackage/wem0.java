package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wem0 {
    public final List a;
    public final String b;
    public final fu5 c;
    public final boolean d;
    public final ArrayList e;

    public wem0(List list, String str, fu5 fu5Var, boolean z) {
        this.a = list;
        this.b = str;
        this.c = fu5Var;
        this.d = z;
        this.e = bza1.b(str, list);
    }

    public static wem0 a(wem0 wem0Var, List list, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            list = wem0Var.a;
        }
        if ((i & 2) != 0) {
            str = wem0Var.b;
        }
        fu5 fu5Var = wem0Var.c;
        if ((i & 8) != 0) {
            z = wem0Var.d;
        }
        wem0Var.getClass();
        return new wem0(list, str, fu5Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wem0)) {
            return false;
        }
        wem0 wem0Var = (wem0) obj;
        return this.a.equals(wem0Var.a) && this.b.equals(wem0Var.b) && this.c.equals(wem0Var.c) && this.d == wem0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder s = xvz.s("SbpBanksSuccessState(ybs=", this.a, ", filterText=", this.b, ", commonBottomSheet=");
        s.append(this.c);
        s.append(", scrollToTop=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
