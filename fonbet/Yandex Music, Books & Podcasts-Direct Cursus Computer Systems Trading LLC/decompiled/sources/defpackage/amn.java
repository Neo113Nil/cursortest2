package defpackage;

/* loaded from: classes4.dex */
public final class amn extends bmn {
    public final mqs a;

    public amn(mqs mqsVar) {
        this.a = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof amn) && this.a.equals(((amn) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Success(track=" + this.a + ")";
    }
}
