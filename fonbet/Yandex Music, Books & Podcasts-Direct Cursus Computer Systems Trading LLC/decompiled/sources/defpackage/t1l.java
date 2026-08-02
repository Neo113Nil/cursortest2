package defpackage;

/* loaded from: classes4.dex */
public final class t1l implements v1l {
    public final o4l a;

    public t1l(o4l o4lVar) {
        this.a = o4lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1l) && this.a == ((t1l) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Start(direction=" + this.a + ")";
    }
}
