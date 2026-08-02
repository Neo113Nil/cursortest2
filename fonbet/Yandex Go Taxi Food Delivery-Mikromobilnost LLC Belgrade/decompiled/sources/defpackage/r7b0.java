package defpackage;

import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.HashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class r7b0 {
    public final gnx0 a;
    public final HashMap b;
    public final ArrayList c;
    public final Zone d;
    public final op40 e;

    public r7b0(gnx0 gnx0Var, HashMap hashMap, ArrayList arrayList, Zone zone, op40 op40Var) {
        this.a = gnx0Var;
        this.b = hashMap;
        this.c = arrayList;
        this.d = zone;
        this.e = op40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7b0)) {
            return false;
        }
        r7b0 r7b0Var = (r7b0) obj;
        return jl40.l(this.a, r7b0Var.a) && this.b.equals(r7b0Var.b) && this.c.equals(r7b0Var.c) && jl40.l(this.d, r7b0Var.d) && jl40.l(this.e, r7b0Var.e);
    }

    public final int hashCode() {
        gnx0 gnx0Var = this.a;
        int b = ly3.b((this.b.hashCode() + ((gnx0Var == null ? 0 : gnx0Var.hashCode()) * 31)) * 31, 31, this.c);
        Zone zone = this.d;
        int hashCode = (b + (zone == null ? 0 : zone.hashCode())) * 31;
        op40 op40Var = this.e;
        return hashCode + (op40Var != null ? op40Var.hashCode() : 0);
    }

    public final String toString() {
        return "PersonalStateSnapshot(tariffSelectionChange=" + this.a + ", selectedMultiTariffClasses=" + this.b + ", selectedClassesInVerticals=" + this.c + ", zone=" + this.d + ", multiclassOverrideSummaryButton=" + this.e + Extension.C_BRAKE;
    }
}
