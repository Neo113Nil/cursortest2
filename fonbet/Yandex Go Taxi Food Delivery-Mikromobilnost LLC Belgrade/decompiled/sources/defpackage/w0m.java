package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class w0m extends f1m {
    public final l1o a;
    public final u1m b;
    public final Throwable c;
    public final ArrayList d;

    public w0m(l1o l1oVar, u1m u1mVar, Throwable th, ArrayList arrayList) {
        this.a = l1oVar;
        this.b = u1mVar;
        this.c = th;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w0m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        w0m w0mVar = (w0m) obj;
        return jl40.l(this.a, w0mVar.a) && jl40.l(this.b, w0mVar.b) && jl40.l(this.c, w0mVar.c) && jl40.l(this.d, w0mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Failed(context=" + this.a + ", query=" + this.b + ", error=" + this.c + ", tags=" + this.d + Extension.C_BRAKE;
    }
}
