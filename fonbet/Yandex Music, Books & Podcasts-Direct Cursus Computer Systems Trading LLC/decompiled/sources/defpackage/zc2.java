package defpackage;

/* loaded from: classes3.dex */
public final class zc2 extends mq6 {
    public final String a;

    public zc2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mq6)) {
            return false;
        }
        return this.a.equals(((zc2) ((mq6) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return su4.o(new StringBuilder("User{identifier="), this.a, "}");
    }
}
