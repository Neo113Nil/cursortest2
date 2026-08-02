package defpackage;

/* loaded from: classes11.dex */
public final class vc0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5f b;
    public final /* synthetic */ pa90 c;

    public /* synthetic */ vc0(m5f m5fVar, pa90 pa90Var, int i) {
        this.a = i;
        this.b = m5fVar;
        this.c = pa90Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c530 c530Var = c530.a;
        pa90 pa90Var = this.c;
        m5f m5fVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Number) obj2).intValue();
                String str = m5fVar.c;
                if ((intValue & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                if (str.length() != 0) {
                    int i2 = zt11.a;
                    pa90 d = dya1.d(str, new uc0(pa90Var, 0), new uc0(pa90Var, 1), fidVar, 0);
                    qnm.c.getClass();
                    o4b1.b(d, null, ljs0.m(c530Var, 32.0f), null, null, 0.0f, null, fidVar, 48, 120);
                    break;
                }
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                pa90 d2 = dya1.d(m5fVar.c, new uc0(pa90Var, 4), new uc0(pa90Var, 5), fidVar2, 0);
                qnm.c.getClass();
                o4b1.b(d2, null, ljs0.m(c530Var, 32.0f), null, null, 0.0f, null, fidVar2, 48, 120);
                break;
        }
        return zy11Var;
    }
}
