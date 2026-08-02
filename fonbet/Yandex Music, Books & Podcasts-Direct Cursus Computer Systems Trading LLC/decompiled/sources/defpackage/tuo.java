package defpackage;

/* loaded from: classes3.dex */
public final class tuo implements wuo {
    public final String a;

    public tuo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tuo) && this.a.equals(((tuo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("OpenAdvInfo(text=", this.a, ")");
    }
}
