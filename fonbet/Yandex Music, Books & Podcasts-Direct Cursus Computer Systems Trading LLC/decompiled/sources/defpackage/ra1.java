package defpackage;

/* loaded from: classes3.dex */
public final class ra1 implements wa1 {
    public final String a;

    public ra1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra1) && this.a.equals(((ra1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Description(text=", this.a, ")");
    }
}
