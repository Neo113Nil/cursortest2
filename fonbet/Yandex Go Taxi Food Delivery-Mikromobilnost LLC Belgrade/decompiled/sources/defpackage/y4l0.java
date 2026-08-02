package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class y4l0 implements wls {
    public final /* synthetic */ y7m A;
    public final /* synthetic */ a B;
    public final /* synthetic */ zls C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float w;
    public final /* synthetic */ jt1 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ ety0 z;

    public /* synthetic */ y4l0(f530 f530Var, float f, float f2, jt1 jt1Var, float f3, ety0 ety0Var, y7m y7mVar, a aVar, zls zlsVar, a aVar2, int i, int i2) {
        this.b = f530Var;
        this.c = f;
        this.w = f2;
        this.x = jt1Var;
        this.y = f3;
        this.z = ety0Var;
        this.A = y7mVar;
        this.B = aVar;
        this.C = zlsVar;
        this.F = aVar2;
        this.D = i;
        this.E = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.D;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                a5l0.d((String) obj3, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.C, this.B, (fid) obj, O, this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                a5l0.c(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (a) obj3, (fid) obj, O2, this.E);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ y4l0(String str, f530 f530Var, float f, float f2, jt1 jt1Var, float f3, ety0 ety0Var, y7m y7mVar, zls zlsVar, a aVar, int i, int i2) {
        this.F = str;
        this.b = f530Var;
        this.c = f;
        this.w = f2;
        this.x = jt1Var;
        this.y = f3;
        this.z = ety0Var;
        this.A = y7mVar;
        this.C = zlsVar;
        this.B = aVar;
        this.D = i;
        this.E = i2;
    }
}
