package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class zsm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ a c;

    public /* synthetic */ zsm(f530 f530Var, a aVar, int i, int i2) {
        this.a = i2;
        this.b = f530Var;
        this.c = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                aw91.a(f530Var, aVar, fidVar, vng.O(49));
                break;
            case 1:
                com.yx360.design.compose.atoms.snackbar.a.d(f530Var, aVar, fidVar, vng.O(49));
                break;
            case 2:
                f7b1.a(f530Var, aVar, fidVar, vng.O(49));
                break;
            case 3:
                zcb1.c(f530Var, aVar, fidVar, vng.O(49));
                break;
            default:
                c5a1.a(f530Var, aVar, fidVar, vng.O(49));
                break;
        }
        return zy11Var;
    }
}
