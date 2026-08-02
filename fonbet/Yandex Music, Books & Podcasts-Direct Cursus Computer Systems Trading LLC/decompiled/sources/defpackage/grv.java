package defpackage;

/* loaded from: classes.dex */
public final class grv {
    public final jrv a;
    public final jpv b;

    public grv(jrv jrvVar, jpv jpvVar) {
        this.a = jrvVar;
        this.b = jpvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!grv.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        grv grvVar = (grv) obj;
        return this.a.equals(grvVar.a) && this.b.equals(grvVar.b);
    }

    public final int hashCode() {
        return (this.a.a * 31) + this.b.a;
    }

    public final String toString() {
        return "WindowSizeClass {windowWidthSizeClass=" + this.a + ", windowHeightSizeClass=" + this.b + " }";
    }
}
