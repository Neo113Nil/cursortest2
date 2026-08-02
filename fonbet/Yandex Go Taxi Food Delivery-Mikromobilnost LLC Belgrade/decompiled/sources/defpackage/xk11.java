package defpackage;

import com.yandex.go.rida.bids.ui.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class xk11 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ m3u0 c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ wp2 x;
    public final /* synthetic */ float y;

    public /* synthetic */ xk11(f530 f530Var, m3u0 m3u0Var, boolean z, wp2 wp2Var, float f, int i, int i2) {
        this.a = i2;
        this.b = f530Var;
        this.c = m3u0Var;
        this.w = z;
        this.x = wp2Var;
        this.y = f;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(385);
                q6a1.a(this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(385);
                c.n(this.b, this.c, this.w, this.x, this.y, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
