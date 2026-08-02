package defpackage;

/* loaded from: classes2.dex */
public final class wgx0 {
    public final String a;

    public wgx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgx0) && this.a.equals(((wgx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Tariff(name="), this.a, ')');
    }
}
