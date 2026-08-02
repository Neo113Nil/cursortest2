package defpackage;

/* loaded from: classes10.dex */
public final class sg21 implements fk2 {
    public final String a;

    public sg21(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sg21) {
            return this.a.equals(((sg21) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
