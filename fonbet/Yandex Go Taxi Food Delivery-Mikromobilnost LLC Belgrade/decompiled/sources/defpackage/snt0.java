package defpackage;

/* loaded from: classes10.dex */
public final class snt0 extends t5w {
    public int a;
    public final /* synthetic */ pnt0 b;

    public snt0(pnt0 pnt0Var) {
        this.b = pnt0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.e();
    }

    @Override // defpackage.t5w
    public final int nextInt() {
        int i = this.a;
        this.a = i + 1;
        return this.b.c(i);
    }
}
