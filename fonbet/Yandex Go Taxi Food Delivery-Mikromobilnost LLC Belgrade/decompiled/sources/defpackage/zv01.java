package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zv01 {
    public final rb6 a;
    public final uv01 b;
    public final Integer c;
    public final ArrayList d;
    public final q4u e;

    public zv01(rb6 rb6Var, uv01 uv01Var, Integer num, ArrayList arrayList, q4u q4uVar) {
        this.a = rb6Var;
        this.b = uv01Var;
        this.c = num;
        this.d = arrayList;
        this.e = q4uVar;
    }

    public final uv01 a() {
        return this.b;
    }

    public final Integer b() {
        return this.c;
    }

    public final q4u c() {
        return this.e;
    }

    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv01)) {
            return false;
        }
        zv01 zv01Var = (zv01) obj;
        return jl40.l(this.a, zv01Var.a) && this.b.equals(zv01Var.b) && jl40.l(this.c, zv01Var.c) && this.d.equals(zv01Var.d) && jl40.l(this.e, zv01Var.e);
    }

    public final int hashCode() {
        rb6 rb6Var = this.a;
        int hashCode = (this.b.hashCode() + ((rb6Var == null ? 0 : rb6Var.a.hashCode()) * 31)) * 31;
        Integer num = this.c;
        int b = ly3.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        q4u q4uVar = this.e;
        return b + (q4uVar != null ? q4uVar.hashCode() : 0);
    }

    public final String toString() {
        return "TransfersDashboardViewState(bottomBar=" + this.a + ", bottomSheet=" + this.b + ", bottomSheetState=" + this.c + ", topButtons=" + this.d + ", guidelinesWidget=" + this.e + Extension.C_BRAKE;
    }
}
