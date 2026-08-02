package defpackage;

/* loaded from: classes.dex */
public final class j83 implements r2c {
    public final /* synthetic */ int a;
    public final olq b;

    public j83(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new olq(35152, 2, "image/png");
                break;
            default:
                this.b = new olq(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // defpackage.r2c
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        switch (this.a) {
            case 0:
                this.b.b(j, j2);
                break;
            default:
                this.b.b(j, j2);
                break;
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        switch (this.a) {
        }
        return this.b.d(s2cVar);
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        switch (this.a) {
        }
        return this.b.h(s2cVar, ci0Var);
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        switch (this.a) {
            case 0:
                this.b.l(t2cVar);
                break;
            default:
                this.b.l(t2cVar);
                break;
        }
    }

    private final void c() {
    }

    private final void e() {
    }
}
