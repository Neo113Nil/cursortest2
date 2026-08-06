package defpackage;

/* loaded from: classes.dex */
public final class a2 implements android.view.View.OnDragListener, defpackage.xq {
    public final defpackage.yq IHQe1A4L2xu;
    public final defpackage.s6 oh6vYeIP;
    public final defpackage.z1 r1MBDhnF;

    public a2() {
        defpackage.yq yqVar = new defpackage.yq();
        yqVar.kNAkVymC = 0L;
        this.IHQe1A4L2xu = yqVar;
        this.oh6vYeIP = new defpackage.s6();
        this.r1MBDhnF = new defpackage.z1(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(android.view.View view, android.view.DragEvent dragEvent) {
        defpackage.c1NqjJifC7 c1nqjjifc7 = new defpackage.c1NqjJifC7(11, dragEvent);
        int action = dragEvent.getAction();
        defpackage.ti1 ti1Var = defpackage.ti1.adDC3e2L;
        defpackage.s6 s6Var = this.oh6vYeIP;
        defpackage.yq yqVar = this.IHQe1A4L2xu;
        switch (action) {
            case 1:
                defpackage.nz0 nz0Var = new defpackage.nz0();
                defpackage.s sVar = new defpackage.s(c1nqjjifc7, yqVar, nz0Var);
                if (sVar.AARZUJiTa(yqVar) == ti1Var) {
                    defpackage.f70.SiPhmbmu(yqVar, sVar);
                }
                boolean z = nz0Var.adDC3e2L;
                s6Var.getClass();
                defpackage.n6 n6Var = new defpackage.n6(s6Var);
                while (n6Var.hasNext()) {
                    ((defpackage.yq) n6Var.next()).uLnPvzwk();
                }
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                yqVar.WnQbjbWuMR(c1nqjjifc7);
                break;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.s sVar2 = new defpackage.s(12, c1nqjjifc7);
                if (sVar2.AARZUJiTa(yqVar) == ti1Var) {
                    defpackage.f70.SiPhmbmu(yqVar, sVar2);
                }
                s6Var.clear();
                break;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                yqVar.H6IrRhrpWoH();
                break;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                yqVar.pm90rNzI5F();
                break;
        }
        return false;
    }
}
