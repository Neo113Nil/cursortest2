package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class v7e0 implements d8e0 {
    public final String a;
    public final ArrayList b;

    public v7e0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7e0)) {
            return false;
        }
        v7e0 v7e0Var = (v7e0) obj;
        return jl40.l(this.a, v7e0Var.a) && this.b.equals(v7e0Var.b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("ButtonsItem(id=", this.a, ", items=", Extension.C_BRAKE, this.b);
    }
}
