package defpackage;

/* loaded from: classes3.dex */
public final class got extends hot {
    public final yxc a;

    public got(yxc yxcVar) {
        this.a = yxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof got) && this.a.equals(((got) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(fullUserInfo=" + this.a + ")";
    }
}
