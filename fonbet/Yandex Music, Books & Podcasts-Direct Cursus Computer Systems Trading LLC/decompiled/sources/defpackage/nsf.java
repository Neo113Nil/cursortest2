package defpackage;

/* loaded from: classes.dex */
public final class nsf {
    public final /* synthetic */ int a;
    public final u6k b;
    public final u6k c;
    public boolean d;
    public Object e;
    public final xtf f;

    public nsf(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new u6k(i);
                this.c = new u6k(i2);
                this.f = new xtf(i, 30, 100);
                break;
            default:
                this.b = new u6k(i);
                this.c = new u6k(i2);
                this.f = new xtf(i, 90, 200);
                break;
        }
    }

    public final void a(int i, int i2) {
        switch (this.a) {
            case 0:
                if (i < 0.0f) {
                    vme.a("Index should be non-negative");
                }
                this.b.i(i);
                this.f.a(i);
                this.c.i(i2);
                break;
            default:
                if (i < 0.0f) {
                    vme.a("Index should be non-negative (" + i + ')');
                }
                this.b.i(i);
                this.f.a(i);
                this.c.i(i2);
                break;
        }
    }
}
