package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class vx20 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ vx20(f530 f530Var, zx01 zx01Var, v2o v2oVar, ymo ymoVar, boolean z, boolean z2, a aVar, int i) {
        this.c = f530Var;
        this.y = zx01Var;
        this.z = v2oVar;
        this.A = ymoVar;
        this.b = z;
        this.w = z2;
        this.B = aVar;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                wx20.b(this.c, (zx01) obj6, (v2o) obj5, (ymo) obj4, this.b, this.w, (a) obj3, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                jzw0.a(this.b, (tls) obj6, this.c, (wls) obj5, this.w, (syw0) obj4, (zx40) obj3, (fid) obj, O2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int O3 = vng.O(i2 | 1);
                jzw0.b(this.c, this.b, this.w, (syw0) obj6, (wls) obj5, (h8w) obj4, (ehr0) obj3, (fid) obj, O3);
                break;
            default:
                ((Integer) obj2).getClass();
                int O4 = vng.O(i2 | 1);
                csb1.b(this.b, (CharSequence) obj6, (CharSequence) obj5, (CharSequence) obj4, this.w, this.c, (sls) obj3, (fid) obj, O4);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ vx20(f530 f530Var, boolean z, boolean z2, syw0 syw0Var, wls wlsVar, h8w h8wVar, ehr0 ehr0Var, int i) {
        this.c = f530Var;
        this.b = z;
        this.w = z2;
        this.y = syw0Var;
        this.z = wlsVar;
        this.A = h8wVar;
        this.B = ehr0Var;
        this.x = i;
    }

    public /* synthetic */ vx20(boolean z, tls tlsVar, f530 f530Var, wls wlsVar, boolean z2, syw0 syw0Var, zx40 zx40Var, int i) {
        this.b = z;
        this.y = tlsVar;
        this.c = f530Var;
        this.z = wlsVar;
        this.w = z2;
        this.A = syw0Var;
        this.B = zx40Var;
        this.x = i;
    }

    public /* synthetic */ vx20(boolean z, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z2, f530 f530Var, sls slsVar, int i) {
        this.b = z;
        this.y = charSequence;
        this.z = charSequence2;
        this.A = charSequence3;
        this.w = z2;
        this.c = f530Var;
        this.B = slsVar;
        this.x = i;
    }
}
