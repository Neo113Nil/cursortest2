package defpackage;

/* loaded from: classes4.dex */
public final class tkj implements ukj {
    public final mkj a;

    public tkj(mkj mkjVar) {
        this.a = mkjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkj) && this.a.equals(((tkj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(config=" + this.a + ")";
    }
}
