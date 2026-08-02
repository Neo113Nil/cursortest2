package defpackage;

/* loaded from: classes3.dex */
public final class ewj extends fwj {
    public final o3n a;

    public ewj(o3n o3nVar) {
        this.a = o3nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewj) && this.a.equals(((ewj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(buttonState=" + this.a + ")";
    }
}
