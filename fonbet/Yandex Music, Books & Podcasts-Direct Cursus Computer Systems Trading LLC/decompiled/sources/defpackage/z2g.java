package defpackage;

/* loaded from: classes4.dex */
public final class z2g implements a3g {
    public final zgs a;

    public z2g(zgs zgsVar) {
        this.a = zgsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2g) && this.a.equals(((z2g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(tileUiData=" + this.a + ")";
    }
}
