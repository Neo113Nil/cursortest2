package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class y6t implements yr2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y6t(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yr2
    public final void a() {
        switch (this.a) {
            case 0:
                ((z6t) this.b).k = true;
                break;
            case 1:
                ((z6t) this.b).k = true;
                break;
            case 2:
                ((z6t) this.b).k = true;
                break;
            default:
                ds2 ds2Var = (ds2) this.b;
                boolean z = ds2Var.r.l() == 1.0f;
                if (z != ds2Var.x) {
                    ds2Var.x = z;
                    ds2Var.o.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
