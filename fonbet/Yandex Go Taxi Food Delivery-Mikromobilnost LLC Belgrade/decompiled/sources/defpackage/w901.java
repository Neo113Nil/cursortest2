package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class w901 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ w901(ibp0 ibp0Var, pvi0 pvi0Var, jt1 jt1Var, nhe nheVar, float f, int i, a aVar, int i2) {
        this.y = ibp0Var;
        this.z = pvi0Var;
        this.A = jt1Var;
        this.B = nheVar;
        this.c = f;
        this.w = i;
        this.b = aVar;
        this.x = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(this.x | 1);
                urb1.c((ibp0) obj6, (pvi0) obj5, (jt1) obj4, (nhe) obj3, this.c, this.w, this.b, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(this.w | 1);
                vub1.b(this.b, (a) obj6, (f530) obj5, this.c, (to5) obj4, (to5) obj3, (fid) obj, O2, this.x);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ w901(a aVar, a aVar2, f530 f530Var, float f, to5 to5Var, to5 to5Var2, int i, int i2) {
        this.b = aVar;
        this.y = aVar2;
        this.z = f530Var;
        this.c = f;
        this.A = to5Var;
        this.B = to5Var2;
        this.w = i;
        this.x = i2;
    }
}
