package defpackage;

import android.util.Size;

/* loaded from: classes10.dex */
public final class v74 extends dge0 {
    public final Size a;
    public final int b;

    public v74(int i, Size size) {
        if (size == null) {
            ny61.t("Null resolution");
            throw null;
        }
        this.a = size;
        this.b = i;
    }

    @Override // defpackage.dge0
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dge0
    public final Size b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dge0)) {
            return false;
        }
        dge0 dge0Var = (dge0) obj;
        return this.a.equals(dge0Var.b()) && this.b == dge0Var.a();
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostviewSettings{resolution=");
        sb.append(this.a);
        sb.append(", inputFormat=");
        return oyr.m(this.b, "}", sb);
    }
}
