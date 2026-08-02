package defpackage;

import com.yandex.go.navigator.floating_control_buttons.compose.button.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class xm1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bj6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ xm1(bj6 bj6Var, int i, int i2) {
        this.a = i2;
        this.b = bj6Var;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        bj6 bj6Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                dn1.b(bj6Var, fidVar, vng.O(i2 | 1));
                break;
            case 1:
                a.d(bj6Var, fidVar, vng.O(i2 | 1));
                break;
            case 2:
                a.c(bj6Var, fidVar, vng.O(i2 | 1));
                break;
            case 3:
                a.e(bj6Var, fidVar, vng.O(i2 | 1));
                break;
            default:
                ha91.b(bj6Var, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
