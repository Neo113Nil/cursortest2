package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zt01 implements bu01 {
    public final List a;
    public final boolean b;
    public final rtz0 c;

    public zt01(List list, boolean z, rtz0 rtz0Var) {
        this.a = list;
        this.b = z;
        this.c = rtz0Var;
    }

    @Override // defpackage.bu01
    public final rtz0 a() {
        return this.c;
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt01)) {
            return false;
        }
        zt01 zt01Var = (zt01) obj;
        return this.a.equals(zt01Var.a) && this.b == zt01Var.b && this.c.equals(zt01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.bu01
    public final boolean isBackButtonVisible() {
        return this.b;
    }

    public final String toString() {
        return "Loading(recyclerItems=" + this.a + ", isBackButtonVisible=" + this.b + ", toolbarRightPart=" + this.c + Extension.C_BRAKE;
    }
}
