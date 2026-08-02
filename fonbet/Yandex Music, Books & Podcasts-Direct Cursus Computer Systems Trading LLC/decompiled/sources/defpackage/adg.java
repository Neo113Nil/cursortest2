package defpackage;

/* loaded from: classes.dex */
public final class adg {
    public final Object a;
    public bz2 b = new bz2(11);
    public boolean c;
    public boolean d;

    public adg(Object obj) {
        this.a = obj;
    }

    public final void a(zcg zcgVar) {
        this.d = true;
        if (this.c) {
            this.c = false;
            zcgVar.c(this.a, this.b.q());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || adg.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((adg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
