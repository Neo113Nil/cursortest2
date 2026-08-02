package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y6x0 implements pre {
    public final String a;
    public final ArrayList b;
    public final c7x0 c;

    public y6x0(String str, ArrayList arrayList, c7x0 c7x0Var) {
        this.a = str;
        this.b = arrayList;
        this.c = c7x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6x0)) {
            return false;
        }
        y6x0 y6x0Var = (y6x0) obj;
        return jl40.l(this.a, y6x0Var.a) && this.b.equals(y6x0Var.b) && this.c.equals(y6x0Var.c);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "tag-line";
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = x4e.m("TagLineRemoteCoreWidget(id=", this.a, ", tags=", ", viewMode=", this.b);
        m.append(this.c);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
