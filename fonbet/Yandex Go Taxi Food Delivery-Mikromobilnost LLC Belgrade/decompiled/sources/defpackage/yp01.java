package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class yp01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ vq01 b;

    public /* synthetic */ yp01(vq01 vq01Var, int i) {
        this.a = i;
        this.b = vq01Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vq01 vq01Var = this.b;
        switch (i) {
            case 0:
                pqb pqbVar = (pqb) obj;
                int i2 = pqbVar.a;
                boolean z = false;
                if (i2 != 0) {
                    if (i2 != 1) {
                        x4c.g("[requisites] unexpected index of chip", null, pqbVar, null, 10);
                    } else {
                        z = true;
                    }
                }
                vq01Var.invoke(Boolean.valueOf(z));
                break;
            default:
                n70 n70Var = (n70) obj;
                n70Var.W(new dl01(6, n70Var, vq01Var));
                break;
        }
        return zy11Var;
    }
}
