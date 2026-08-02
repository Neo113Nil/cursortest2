package defpackage;

/* loaded from: classes3.dex */
public final class h1a extends c1a {
    public final /* synthetic */ i1a q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1a(i1a i1aVar, hh9 hh9Var) {
        super(hh9Var.getContext());
        this.q = i1aVar;
    }

    @Override // defpackage.i7g
    public final int a(int i, int i2, int i3, int i4, int i5) {
        hh9 hh9Var = this.q.n;
        i3k pagerSnapStartHelper = hh9Var.getPagerSnapStartHelper();
        if (pagerSnapStartHelper == null) {
            return 0;
        }
        int i6 = pagerSnapStartHelper.e;
        qon adapter = hh9Var.getAdapter();
        u09 u09Var = adapter instanceof u09 ? (u09) adapter : null;
        return (((((u09Var == null || u09Var.o != 0) ? hh9Var.getHeight() : hh9Var.getWidth()) - i) - i2) + i6) / 2;
    }
}
