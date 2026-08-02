package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wwt implements opv {
    public final String a;
    public final x6k b;

    public wwt(ioe ioeVar, String str) {
        this.a = str;
        this.b = szf.g0(ioeVar);
    }

    @Override // defpackage.opv
    public final int a(jx7 jx7Var) {
        return e().b;
    }

    @Override // defpackage.opv
    public final int b(jx7 jx7Var, xof xofVar) {
        return e().c;
    }

    @Override // defpackage.opv
    public final int c(jx7 jx7Var) {
        return e().d;
    }

    @Override // defpackage.opv
    public final int d(jx7 jx7Var, xof xofVar) {
        return e().a;
    }

    public final ioe e() {
        return (ioe) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wwt) {
            return Intrinsics.d(e(), ((wwt) obj).e());
        }
        return false;
    }

    public final void f(ioe ioeVar) {
        this.b.setValue(ioeVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return vz1.r(sb, e().d, ')');
    }
}
