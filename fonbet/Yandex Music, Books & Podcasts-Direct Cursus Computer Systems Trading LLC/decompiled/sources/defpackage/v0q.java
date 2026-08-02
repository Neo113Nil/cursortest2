package defpackage;

/* loaded from: classes5.dex */
public final class v0q implements qa8 {
    public final x0q a;
    public final long b;
    public final Object c;
    public final zt3 d;

    public v0q(x0q x0qVar, long j, Object obj, zt3 zt3Var) {
        this.a = x0qVar;
        this.b = j;
        this.c = obj;
        this.d = zt3Var;
    }

    @Override // defpackage.qa8
    public final void a() {
        x0q x0qVar = this.a;
        synchronized (x0qVar) {
            if (this.b < x0qVar.q()) {
                return;
            }
            Object[] objArr = x0qVar.h;
            objArr.getClass();
            long j = this.b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            y0q.c(objArr, j, y0q.a);
            x0qVar.l();
        }
    }
}
