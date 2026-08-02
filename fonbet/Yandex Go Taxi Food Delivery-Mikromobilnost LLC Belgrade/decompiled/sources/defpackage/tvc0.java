package defpackage;

/* loaded from: classes.dex */
public final class tvc0 {
    public static final tvc0 c = new tvc0();
    public final boolean a;
    public final int b;

    public tvc0(boolean z) {
        this.a = z;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvc0)) {
            return false;
        }
        tvc0 tvc0Var = (tvc0) obj;
        return this.a == tvc0Var.a && this.b == tvc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) mun.a(this.b)) + ')';
    }

    public tvc0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public tvc0() {
        this(0, false);
    }
}
