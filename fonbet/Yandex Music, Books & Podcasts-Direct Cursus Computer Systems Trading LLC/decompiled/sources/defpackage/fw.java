package defpackage;

/* loaded from: classes3.dex */
public final class fw extends q6k {
    public final ru k;

    public fw(ru ruVar) {
        this.k = ruVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fw) && this.k.equals(((fw) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    public final String toString() {
        return "Album(uiData=" + this.k + ")";
    }
}
