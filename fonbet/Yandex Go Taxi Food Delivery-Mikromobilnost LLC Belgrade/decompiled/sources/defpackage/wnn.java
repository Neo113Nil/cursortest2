package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wnn implements pre {
    public final String a;
    public final ArrayList b;
    public final vu0 c;
    public final String d;

    public wnn(String str, ArrayList arrayList, vu0 vu0Var, String str2) {
        this.a = str;
        this.b = arrayList;
        this.c = vu0Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnn)) {
            return false;
        }
        wnn wnnVar = (wnn) obj;
        return jl40.l(this.a, wnnVar.a) && this.b.equals(wnnVar.b) && jl40.l(this.c, wnnVar.c) && jl40.l(this.d, wnnVar.d);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "editable-route-widgets";
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        vu0 vu0Var = this.c;
        int hashCode = (b + (vu0Var == null ? 0 : vu0Var.hashCode())) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = x4e.m("EditableRouteCoreWidget(id=", this.a, ", routePointWidgets=", ", addressFlow=", this.b);
        m.append(this.c);
        m.append(", metricaLabel=");
        m.append(this.d);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
