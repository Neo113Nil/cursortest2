package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nt6 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final Long d;
    public final jzb e;

    public nt6(String str, String str2, String str3, Long l, jzb jzbVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = jzbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt6)) {
            return false;
        }
        nt6 nt6Var = (nt6) obj;
        return Intrinsics.d(this.a, nt6Var.a) && Intrinsics.d(this.b, nt6Var.b) && Intrinsics.d(this.c, nt6Var.c) && Intrinsics.d(this.d, nt6Var.d) && this.e == nt6Var.e;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (c + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Long l = this.d;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        jzb jzbVar = this.e;
        return hashCode2 + (jzbVar != null ? jzbVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("CredentialsBottomSheetHeaderUiState(id=", this.a, ", title=", this.b, ", subtitle=");
        m.append((Object) this.c);
        m.append(", subtitlePostfix=");
        m.append(this.d);
        m.append(", explicitType=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
