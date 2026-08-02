package defpackage;

/* loaded from: classes10.dex */
public final class r2b0 extends q2b0 {
    public int A;
    public final p2b0 x;
    public Object y;
    public boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r2b0(p2b0 p2b0Var) {
        super(r0, r1);
        Object obj = p2b0Var.b;
        d2b0 d2b0Var = p2b0Var.w;
        this.x = p2b0Var;
        this.A = d2b0Var.x;
    }

    @Override // defpackage.q2b0, java.util.Iterator
    public final Object next() {
        if (this.x.w.x != this.A) {
            ny61.y();
            return null;
        }
        Object next = super.next();
        this.y = next;
        this.z = true;
        return next;
    }

    @Override // defpackage.q2b0, java.util.Iterator
    public final void remove() {
        if (!this.z) {
            ny61.k();
            return;
        }
        Object obj = this.y;
        p2b0 p2b0Var = this.x;
        ym11.a(p2b0Var).remove(obj);
        this.y = null;
        this.z = false;
        this.A = p2b0Var.w.x;
        this.b--;
    }
}
