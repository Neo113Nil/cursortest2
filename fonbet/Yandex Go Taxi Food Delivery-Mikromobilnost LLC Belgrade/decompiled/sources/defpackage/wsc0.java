package defpackage;

/* loaded from: classes2.dex */
public final class wsc0 {
    public final String a;
    public final yo11 b;

    public wsc0(String str, yo11 yo11Var) {
        this.a = str;
        this.b = yo11Var;
    }

    public final yo11 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsc0)) {
            return false;
        }
        wsc0 wsc0Var = (wsc0) obj;
        return this.a.equals(wsc0Var.a) && this.b.equals(wsc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TypedProperties(__typename=" + this.a + ", typedWidgetGroupProperties=" + this.b + ')';
    }
}
