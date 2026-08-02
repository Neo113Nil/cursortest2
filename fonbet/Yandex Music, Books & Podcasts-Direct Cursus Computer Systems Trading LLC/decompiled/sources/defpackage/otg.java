package defpackage;

/* loaded from: classes3.dex */
public final class otg extends ptg {
    public final yxc a;

    public otg(yxc yxcVar) {
        this.a = yxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof otg) && this.a.equals(((otg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(userInfo=" + this.a + ")";
    }
}
