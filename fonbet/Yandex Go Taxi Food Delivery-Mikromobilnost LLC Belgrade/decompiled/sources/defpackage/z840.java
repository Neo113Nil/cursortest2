package defpackage;

import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class z840 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ tls w;

    public /* synthetic */ z840(f530 f530Var, List list, tls tlsVar, int i) {
        this.a = 1;
        this.b = list;
        this.c = f530Var;
        this.w = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.w;
        List list = this.b;
        f530 f530Var = this.c;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                qpb1.b(vng.O(7), fidVar, tlsVar, f530Var, list);
                break;
            case 1:
                xqa1.d(vng.O(1), fidVar, tlsVar, f530Var, list);
                break;
            case 2:
                yua1.a(vng.O(1), fidVar, tlsVar, f530Var, list);
                break;
            default:
                fsb1.a(vng.O(1), fidVar, tlsVar, f530Var, list);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ z840(f530 f530Var, List list, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.c = f530Var;
        this.b = list;
        this.w = tlsVar;
    }
}
