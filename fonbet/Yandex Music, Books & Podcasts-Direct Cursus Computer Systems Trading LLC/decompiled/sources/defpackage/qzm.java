package defpackage;

/* loaded from: classes.dex */
public final class qzm {
    public final ozm a;
    public final boolean b;
    public final n2r c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public qzm(ozm ozmVar, Object obj, boolean z, n2r n2rVar, boolean z2) {
        this.a = ozmVar;
        this.b = z;
        this.c = n2rVar;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        pq5.d("Unexpected form of a provided value");
        rj7.f();
        return null;
    }
}
