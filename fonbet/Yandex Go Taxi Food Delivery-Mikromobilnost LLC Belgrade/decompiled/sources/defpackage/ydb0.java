package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ydb0 {
    public final rb6 a;
    public final odb0 b;

    public ydb0(rb6 rb6Var, odb0 odb0Var) {
        this.a = rb6Var;
        this.b = odb0Var;
    }

    public final rb6 a() {
        return this.a;
    }

    public final odb0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydb0)) {
            return false;
        }
        ydb0 ydb0Var = (ydb0) obj;
        return this.a.equals(ydb0Var.a) && this.b.equals(ydb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "PfmViewState(bottomBarState=" + this.a + ", screenViewState=" + this.b + Extension.C_BRAKE;
    }
}
