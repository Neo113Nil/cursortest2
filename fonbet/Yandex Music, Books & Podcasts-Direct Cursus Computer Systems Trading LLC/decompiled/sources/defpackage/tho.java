package defpackage;

/* loaded from: classes3.dex */
public final class tho implements xfu {
    public final xfu a;
    public final /* synthetic */ uho b;

    public tho(uho uhoVar, xfu xfuVar) {
        this.b = uhoVar;
        this.a = xfuVar;
    }

    @Override // defpackage.xfu
    public final void a(int i, float f, int i2) {
        h2k adapter;
        uho uhoVar = this.b;
        adapter = super/*lgu*/.getAdapter();
        if (wyf.N(uhoVar) && adapter != null) {
            int b = adapter.b();
            int width = ((int) ((1 - 1.0f) * uhoVar.getWidth())) + i2;
            while (i < b && width > 0) {
                i++;
                width -= (int) (uhoVar.getWidth() * 1.0f);
            }
            i = (b - i) - 1;
            i2 = -width;
            f = i2 / (uhoVar.getWidth() * 1.0f);
        }
        this.a.a(i, f, i2);
    }

    @Override // defpackage.xfu
    public final void b(int i) {
        h2k adapter;
        uho uhoVar = this.b;
        adapter = super/*lgu*/.getAdapter();
        if (wyf.N(uhoVar) && adapter != null) {
            i = (adapter.b() - i) - 1;
        }
        this.a.b(i);
    }

    @Override // defpackage.xfu
    public final void c(int i) {
        this.a.c(i);
    }
}
