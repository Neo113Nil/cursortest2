package defpackage;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class jxu implements mxu {
    public final pj6 a;
    public final IOException b;

    public jxu(pj6 pj6Var) {
        this.a = pj6Var;
        this.b = pj6Var.a();
    }

    @Override // defpackage.mxu
    public final Exception a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxu) && this.a.equals(((jxu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Network(error=" + this.a + ")";
    }
}
