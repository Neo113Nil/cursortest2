package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vzl extends wzl {
    public final xzl a;
    public final ArrayList b;

    public vzl(xzl xzlVar, ArrayList arrayList) {
        this.a = xzlVar;
        this.b = arrayList;
    }

    public final List a() {
        return this.b;
    }

    public final xzl b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vzl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vzl vzlVar = (vzl) obj;
        return this.a.equals(vzlVar.a) && this.b.equals(vzlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DocumentFetchExtendedResult(result=" + this.a + ", parts=" + this.b + Extension.C_BRAKE;
    }
}
