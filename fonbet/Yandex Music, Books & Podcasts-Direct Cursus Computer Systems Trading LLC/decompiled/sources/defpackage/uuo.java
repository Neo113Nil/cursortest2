package defpackage;

/* loaded from: classes3.dex */
public final class uuo implements xuo {
    public final String a;

    public uuo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uuo) && this.a.equals(((uuo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("OpenAdvInfo(text=", this.a, ")");
    }
}
