package defpackage;

/* loaded from: classes4.dex */
public final class uqo extends ksw {
    public final String z;

    public uqo(String str) {
        this.z = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqo) && this.z.equals(((uqo) obj).z);
    }

    public final int hashCode() {
        return this.z.hashCode();
    }

    public final String toString() {
        return hrg.q("SbpImageForMethod(methodIconUrl=", this.z, ")");
    }
}
