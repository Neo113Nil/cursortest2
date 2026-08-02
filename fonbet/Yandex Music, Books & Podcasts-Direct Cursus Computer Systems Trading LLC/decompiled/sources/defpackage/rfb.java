package defpackage;

/* loaded from: classes6.dex */
public final class rfb extends qld {
    public final String p;

    public rfb(String str) {
        this.p = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfb) && this.p.equals(((rfb) obj).p);
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Ignored(message="), this.p, ')');
    }
}
