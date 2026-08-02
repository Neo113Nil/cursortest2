package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class yo1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ yo1(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        float f = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.b(f);
                m2k0Var.j(2);
                break;
            case 2:
                ((Float) obj).floatValue();
                break;
            case 3:
                ((m2k0) obj).b(y6i0.c(1.0f - f, 0.0f, 1.0f));
                break;
            case 4:
                ((m2k0) obj).b(f);
                break;
            case 5:
                ((m2k0) obj).b(f);
                break;
            case 6:
                ((m2k0) obj).b(f);
                break;
            case 7:
                m2k0 m2k0Var2 = (m2k0) obj;
                m2k0Var2.q(f);
                m2k0Var2.B(jw01.b);
                break;
            case 8:
                m2k0 m2k0Var3 = (m2k0) obj;
                m2k0Var3.D(-(m2k0Var3.K.getDensity() * f));
                break;
            default:
                m2k0 m2k0Var4 = (m2k0) obj;
                m2k0Var4.D(m2k0Var4.K.getDensity() * f);
                m2k0Var4.G(-(m2k0Var4.K.getDensity() * 16.0f));
                break;
        }
        return zy11Var;
    }
}
