package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class uny0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ uny0(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                ((tls) oz40Var.getValue()).invoke((wu60) obj);
                return zy11Var;
            case 1:
                nzs.i(((wu60) obj).a, oz40Var);
                return zy11Var;
            case 2:
                oz40Var.setValue(new k6w(((k6w) obj).a));
                return zy11Var;
            case 3:
                oz40Var.setValue((rzx) obj);
                return zy11Var;
            case 4:
                nzs.i(((rzx) obj).mo43localToScreenMKHz9U(0L), oz40Var);
                return zy11Var;
            case 5:
                nzs.i(((rzx) obj).m(0L), oz40Var);
                return zy11Var;
            case 6:
                nzs.i(((rzx) obj).v(0L), oz40Var);
                return zy11Var;
            case 7:
                return new jeg0(1, oz40Var);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                oz40Var.setValue(bool);
                return zy11Var;
        }
    }
}
