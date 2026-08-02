package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class xk81 {
    public final b971 a;
    public final al81 b;
    public final ArrayList c;
    public final ru71 d;
    public final xx71 e;
    public final bo81 f;

    public xk81(b971 b971Var, al81 al81Var, ArrayList arrayList, ru71 ru71Var, xx71 xx71Var, bo81 bo81Var) {
        this.a = b971Var;
        this.b = al81Var;
        this.c = arrayList;
        this.d = ru71Var;
        this.e = xx71Var;
        this.f = bo81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk81)) {
            return false;
        }
        xk81 xk81Var = (xk81) obj;
        return this.a.equals(xk81Var.a) && this.b.equals(xk81Var.b) && this.c.equals(xk81Var.c) && this.d.equals(xk81Var.d) && this.e.equals(xk81Var.e) && jl40.l(this.f, xk81Var.f);
    }

    public final int hashCode() {
        int e = unr0.e((this.d.hashCode() + ly3.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e.a);
        bo81 bo81Var = this.f;
        return e + (bo81Var == null ? 0 : bo81Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelLocalData(appData=" + this.a + ", sdkData=" + this.b + ", mediationNetworksData=" + this.c + ", consentsData=" + this.d + ", debugErrorIndicatorData=" + this.e + ", logsData=" + this.f + Extension.C_BRAKE;
    }
}
