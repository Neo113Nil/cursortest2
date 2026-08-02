package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vmm0 extends n351 {
    public final List c;
    public final cbc d;
    public final String e;

    public vmm0(List list, cbc cbcVar, String str) {
        super("scenario-selector", false, 14);
        this.c = list;
        this.d = cbcVar;
        this.e = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmm0)) {
            return false;
        }
        vmm0 vmm0Var = (vmm0) obj;
        return jl40.l(this.c, vmm0Var.c) && jl40.l(this.d, vmm0Var.d) && jl40.l(this.e, vmm0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        cbc cbcVar = this.d;
        int hashCode2 = (hashCode + (cbcVar == null ? 0 : cbcVar.hashCode())) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScenarioSelectorModel(options=");
        sb.append(this.c);
        sb.append(", collapsedStateConfig=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
