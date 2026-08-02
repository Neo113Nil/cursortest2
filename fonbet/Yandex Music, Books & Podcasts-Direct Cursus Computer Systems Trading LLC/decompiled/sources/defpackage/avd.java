package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class avd extends q6k {
    public final boolean k;
    public final hfs l;
    public final o43 m;
    public final boolean n;

    public avd(boolean z, hfs hfsVar, o43 o43Var, boolean z2) {
        this.k = z;
        this.l = hfsVar;
        this.m = o43Var;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avd)) {
            return false;
        }
        avd avdVar = (avd) obj;
        return this.k == avdVar.k && Intrinsics.d(this.l, avdVar.l) && Intrinsics.d(this.m, avdVar.m) && this.n == avdVar.n;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.k) * 31;
        hfs hfsVar = this.l;
        int hashCode2 = (hashCode + (hfsVar == null ? 0 : hfsVar.hashCode())) * 31;
        o43 o43Var = this.m;
        return Boolean.hashCode(this.n) + ((hashCode2 + (o43Var != null ? o43Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Simple(isLanguageRu=" + this.k + ", textColor=" + this.l + ", blockAction=" + this.m + ", hasSecretAnimation=" + this.n + ")";
    }

    public /* synthetic */ avd(boolean z) {
        this(z, null, null, false);
    }
}
