package defpackage;

/* loaded from: classes10.dex */
public final class tuy {
    public final Object a;
    public gfr b = new gfr();
    public boolean c;
    public boolean d;

    public tuy(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tuy.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((tuy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
