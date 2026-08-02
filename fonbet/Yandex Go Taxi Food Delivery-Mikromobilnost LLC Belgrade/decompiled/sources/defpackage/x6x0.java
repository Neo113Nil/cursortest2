package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x6x0 extends n351 {
    public final ArrayList c;
    public final t7x0 d;
    public final String e;

    public x6x0(ArrayList arrayList, t7x0 t7x0Var, String str) {
        super("tag-line", false, 14);
        this.c = arrayList;
        this.d = t7x0Var;
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
        if (!(obj instanceof x6x0)) {
            return false;
        }
        x6x0 x6x0Var = (x6x0) obj;
        return this.c.equals(x6x0Var.c) && this.d.equals(x6x0Var.d) && jl40.l(this.e, x6x0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TagLineModel(tags=");
        sb.append(this.c);
        sb.append(", viewMode=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
