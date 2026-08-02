package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wx41 {
    public final String a;
    public final ArrayList b;
    public final t1y c;

    public wx41(String str, ArrayList arrayList, t1y t1yVar) {
        this.a = str;
        this.b = arrayList;
        this.c = t1yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx41)) {
            return false;
        }
        wx41 wx41Var = (wx41) obj;
        return jl40.l(this.a, wx41Var.a) && this.b.equals(wx41Var.b) && this.c.equals(wx41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = x4e.m("WheelPickerColumnModel(formStateKey=", this.a, ", options=", ", layoutPolicy=", this.b);
        m.append(this.c);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
