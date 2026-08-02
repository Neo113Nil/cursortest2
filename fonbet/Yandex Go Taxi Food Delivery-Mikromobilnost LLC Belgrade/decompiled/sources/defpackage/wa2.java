package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class wa2 implements wls {
    public final /* synthetic */ float A;
    public final /* synthetic */ a B;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ sz40 c;
    public final /* synthetic */ oz40 w;
    public final /* synthetic */ oip0 x;
    public final /* synthetic */ ehr0 y;
    public final /* synthetic */ long z;

    public /* synthetic */ wa2(f530 f530Var, sz40 sz40Var, oz40 oz40Var, oip0 oip0Var, ehr0 ehr0Var, long j, float f, a aVar) {
        this.b = f530Var;
        this.c = sz40Var;
        this.w = oz40Var;
        this.x = oip0Var;
        this.y = ehr0Var;
        this.z = j;
        this.A = f;
        this.B = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    zl10.a(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, btsVar, 384);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                zl10.a(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj, vng.O(385));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ wa2(f530 f530Var, sz40 sz40Var, oz40 oz40Var, oip0 oip0Var, ehr0 ehr0Var, long j, float f, a aVar, int i) {
        this.b = f530Var;
        this.c = sz40Var;
        this.w = oz40Var;
        this.x = oip0Var;
        this.y = ehr0Var;
        this.z = j;
        this.A = f;
        this.B = aVar;
    }
}
