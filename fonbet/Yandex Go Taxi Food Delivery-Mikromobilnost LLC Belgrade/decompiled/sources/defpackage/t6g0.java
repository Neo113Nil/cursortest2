package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class t6g0 {
    public final ArrayList a;
    public final int b;
    public final tm90 c;

    public t6g0(ArrayList arrayList, int i, tm90 tm90Var) {
        this.a = arrayList;
        this.b = i;
        this.c = tm90Var;
    }

    public final List a() {
        return this.a;
    }

    public final tm90 b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6g0)) {
            return false;
        }
        t6g0 t6g0Var = (t6g0) obj;
        return this.a.equals(t6g0Var.a) && this.b == t6g0Var.b && jl40.l(this.c, t6g0Var.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        tm90 tm90Var = this.c;
        return b + (tm90Var == null ? 0 : tm90Var.hashCode());
    }

    public final String toString() {
        return "QrContainerViewState(items=" + this.a + ", selectedIndex=" + this.b + ", passesWidgetViewState=" + this.c + Extension.C_BRAKE;
    }
}
