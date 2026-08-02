package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v7q0 {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final String d;
    public final o9q0 e;

    public v7q0(String str, ArrayList arrayList, int i, String str2, o9q0 o9q0Var) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = str2;
        this.e = o9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7q0)) {
            return false;
        }
        v7q0 v7q0Var = (v7q0) obj;
        return jl40.l(this.a, v7q0Var.a) && this.b.equals(v7q0Var.b) && this.c == v7q0Var.c && jl40.l(this.d, v7q0Var.d) && this.e.equals(v7q0Var.e);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, ly3.b(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = x4e.m("SegmentActionModel(formStateKey=", this.a, ", options=", ", selectedIndex=", this.b);
        smw0.t(this.c, ", metricaLabel=", this.d, ", widthMode=", m);
        m.append(this.e);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
