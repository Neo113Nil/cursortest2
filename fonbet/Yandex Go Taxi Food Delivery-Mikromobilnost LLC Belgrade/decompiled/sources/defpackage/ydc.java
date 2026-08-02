package defpackage;

/* loaded from: classes2.dex */
public final class ydc {
    public final String a;

    public ydc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydc) && this.a.equals(((ydc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Color1(rgba="), this.a, ')');
    }
}
