package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class w34 {
    public uo7 b;
    public iiv c;
    public iiv d;
    public final Size f;
    public final int g;
    public final ArrayList h;
    public final boolean i;
    public final dge0 j;
    public final hkn k;
    public final hkn l;
    public uo7 a = new y38(0);
    public iiv e = null;

    public w34(Size size, int i, ArrayList arrayList, boolean z, dge0 dge0Var, hkn hknVar, hkn hknVar2) {
        if (size == null) {
            ny61.t("Null size");
            throw null;
        }
        this.f = size;
        this.g = i;
        this.h = arrayList;
        this.i = z;
        this.j = dge0Var;
        this.k = hknVar;
        this.l = hknVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w34)) {
            return false;
        }
        w34 w34Var = (w34) obj;
        if (!this.f.equals(w34Var.f) || this.g != w34Var.g || !this.h.equals(w34Var.h) || this.i != w34Var.i) {
            return false;
        }
        dge0 dge0Var = w34Var.j;
        dge0 dge0Var2 = this.j;
        if (dge0Var2 == null) {
            if (dge0Var != null) {
                return false;
            }
        } else if (!dge0Var2.equals(dge0Var)) {
            return false;
        }
        return this.k.equals(w34Var.k) && this.l.equals(w34Var.l);
    }

    public final int hashCode() {
        int hashCode = (((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * (-721379959);
        dge0 dge0Var = this.j;
        return this.l.hashCode() ^ ((((hashCode ^ (dge0Var == null ? 0 : dge0Var.hashCode())) * 1000003) ^ this.k.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.f + ", inputFormat=" + this.g + ", outputFormats=" + this.h + ", virtualCamera=" + this.i + ", imageReaderProxyProvider=null, postviewSettings=" + this.j + ", requestEdge=" + this.k + ", errorEdge=" + this.l + "}";
    }
}
