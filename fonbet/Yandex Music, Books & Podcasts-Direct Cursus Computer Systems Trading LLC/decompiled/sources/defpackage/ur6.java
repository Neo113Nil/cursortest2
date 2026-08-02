package defpackage;

/* loaded from: classes4.dex */
public final class ur6 implements vr6 {
    public final String a;

    public ur6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur6) && this.a.equals(((ur6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Success(link=", this.a, ")");
    }
}
