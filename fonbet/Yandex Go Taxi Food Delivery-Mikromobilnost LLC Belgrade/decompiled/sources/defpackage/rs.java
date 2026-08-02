package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class rs implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xs b;

    public /* synthetic */ rs(xs xsVar) {
        this.b = xsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        xs xsVar = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    rdb1.b(xsVar.d, an91.m(c530.a, 16.0f, 0.0f, 2), null, btsVar, 48, 4);
                    break;
                }
            default:
                num.getClass();
                bka1.b(xsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ rs(xs xsVar, int i) {
        this.b = xsVar;
    }
}
