package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class zkh implements qlh, ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ ulh b;
    public final /* synthetic */ int c;

    public /* synthetic */ zkh(ulh ulhVar, int i, int i2) {
        this.a = i2;
        this.b = ulhVar;
        this.c = i;
    }

    @Override // defpackage.qlh
    public void b(c9e c9eVar, int i) {
        switch (this.a) {
            case 0:
                c9eVar.g0(this.b.c, i, this.c);
                break;
            case 3:
                c9eVar.B0(this.b.c, i, this.c);
                break;
            case 6:
                c9eVar.D(this.b.c, i, this.c);
                break;
            case 7:
                c9eVar.w(this.b.c, i, this.c);
                break;
            case 9:
                c9eVar.G0(this.b.c, i, this.c);
                break;
            default:
                c9eVar.i0(this.b.c, i, this.c);
                break;
        }
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        f8l f8lVar = (f8l) obj;
        switch (this.a) {
            case 1:
                f8lVar.s(this.c, this.b.o.s);
                break;
            case 2:
                f8lVar.s(this.c, this.b.o.s);
                break;
            case 3:
            case 6:
            case 7:
            default:
                f8lVar.s(this.c, this.b.o.s);
                break;
            case 4:
                f8lVar.s(this.c, this.b.o.s);
                break;
            case 5:
                f8lVar.s(this.c, this.b.o.s);
                break;
            case 8:
                f8lVar.s(this.c, this.b.o.s);
                break;
        }
    }
}
