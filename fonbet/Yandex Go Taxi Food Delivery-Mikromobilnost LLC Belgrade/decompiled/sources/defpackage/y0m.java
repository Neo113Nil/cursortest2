package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class y0m extends f1m {
    public final l1o a;
    public final u1m b;
    public final ywl c;
    public final ArrayList d;

    public y0m(l1o l1oVar, u1m u1mVar, ywl ywlVar, ArrayList arrayList) {
        this.a = l1oVar;
        this.b = u1mVar;
        this.c = ywlVar;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!y0m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        y0m y0mVar = (y0m) obj;
        return jl40.l(this.a, y0mVar.a) && jl40.l(this.b, y0mVar.b) && jl40.l(this.c, y0mVar.c) && jl40.l(this.d, y0mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Finished(context=" + this.a + ", query=" + this.b + ", document=" + this.c + ", tags=" + this.d + Extension.C_BRAKE;
    }
}
