package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ymm0 implements pre {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final dbc d;

    public ymm0(String str, String str2, ArrayList arrayList, dbc dbcVar) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = dbcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymm0)) {
            return false;
        }
        ymm0 ymm0Var = (ymm0) obj;
        return jl40.l(this.a, ymm0Var.a) && jl40.l(this.b, ymm0Var.b) && this.c.equals(ymm0Var.c) && jl40.l(this.d, ymm0Var.d);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "scenario-selector";
    }

    public final int hashCode() {
        int b = ly3.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        dbc dbcVar = this.d;
        return b + (dbcVar == null ? 0 : dbcVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ScenarioSelectorRemoteCoreWidget(id=", this.a, ", formStateKey=", this.b, ", options=");
        v.append(this.c);
        v.append(", collapsedStateConfig=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
