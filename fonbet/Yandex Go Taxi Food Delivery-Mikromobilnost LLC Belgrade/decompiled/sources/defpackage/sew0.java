package defpackage;

/* loaded from: classes8.dex */
public final class sew0 implements fy2 {
    public boolean a;
    public final /* synthetic */ tew0 b;

    public sew0(tew0 tew0Var) {
        this.b = tew0Var;
        this.a = tew0Var.a.a;
    }

    @Override // defpackage.fy2
    public final void a(boolean z, boolean z2) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        if (z) {
            this.b.d(null);
        }
    }
}
