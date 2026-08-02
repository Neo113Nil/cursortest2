package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class tn4 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int w;
    public final /* synthetic */ float x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ cms z;

    public /* synthetic */ tn4(f530 f530Var, float f, int i, float f2, Object obj, tls tlsVar, int i2) {
        this.b = f530Var;
        this.c = f;
        this.w = i;
        this.x = f2;
        this.y = obj;
        this.z = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cms cmsVar = this.z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(24583);
                f4b1.a((a) this.y, this.b, this.c, this.x, (a) cmsVar, (fid) obj, O, this.w);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                e5b1.a(this.b, this.c, this.w, this.x, this.y, (tls) cmsVar, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ tn4(a aVar, f530 f530Var, float f, float f2, a aVar2, int i, int i2) {
        this.y = aVar;
        this.b = f530Var;
        this.c = f;
        this.x = f2;
        this.z = aVar2;
        this.w = i2;
    }
}
