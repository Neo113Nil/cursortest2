package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yud extends q6k {
    public final boolean k;
    public final ifs l;
    public final o43 m;
    public final boolean n;

    public yud(boolean z, ifs ifsVar, o43 o43Var, boolean z2) {
        this.k = z;
        this.l = ifsVar;
        this.m = o43Var;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yud)) {
            return false;
        }
        yud yudVar = (yud) obj;
        return this.k == yudVar.k && this.l.equals(yudVar.l) && Intrinsics.d(this.m, yudVar.m) && this.n == yudVar.n;
    }

    public final int hashCode() {
        int hashCode = (this.l.hashCode() + (Boolean.hashCode(this.k) * 31)) * 31;
        o43 o43Var = this.m;
        return Boolean.hashCode(this.n) + ((hashCode + (o43Var == null ? 0 : o43Var.hashCode())) * 31);
    }

    public final String toString() {
        return "DoodleImage(isLanguageRu=" + this.k + ", doodleImageUrl=" + this.l + ", blockAction=" + this.m + ", hasSecretAnimation=" + this.n + ")";
    }
}
