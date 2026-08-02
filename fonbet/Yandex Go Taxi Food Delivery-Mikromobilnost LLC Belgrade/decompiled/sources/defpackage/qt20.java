package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qt20 implements rt20 {
    public final List a;
    public final boolean b;
    public final pt20 c;

    public qt20(List list, boolean z, pt20 pt20Var) {
        this.a = list;
        this.b = z;
        this.c = pt20Var;
    }

    public final boolean a() {
        return this.b;
    }

    public final pt20 b() {
        return this.c;
    }

    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt20)) {
            return false;
        }
        qt20 qt20Var = (qt20) obj;
        return jl40.l(this.a, qt20Var.a) && this.b == qt20Var.b && this.c.equals(qt20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Success(recyclerItems=" + this.a + ", contentChanged=" + this.b + ", loadableInputViewState=" + this.c + Extension.C_BRAKE;
    }
}
