package defpackage;

/* loaded from: classes4.dex */
public final class qjs extends bzf {
    public final long b;

    public qjs(Long l) {
        super(19);
        this.b = l.longValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qjs) {
            if (this.b == ((qjs) obj).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }
}
