package defpackage;

/* loaded from: classes4.dex */
public final class tmn extends umn {
    public final mqs a;

    public tmn(mqs mqsVar) {
        this.a = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tmn) && this.a.equals(((tmn) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Success(track=" + this.a + ")";
    }
}
