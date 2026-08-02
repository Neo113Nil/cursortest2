package defpackage;

/* loaded from: classes.dex */
public final class gd2 extends a2c {
    public final fd2 a;

    public gd2(fd2 fd2Var) {
        this.a = fd2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a2c)) {
            return false;
        }
        return this.a.equals(((gd2) ((a2c) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
