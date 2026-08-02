package defpackage;

/* loaded from: classes3.dex */
public final class gw extends q6k {
    public final kbj k;

    public gw(kbj kbjVar) {
        this.k = kbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gw) && this.k.equals(((gw) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    public final String toString() {
        return "NonMusic(uiData=" + this.k + ")";
    }
}
