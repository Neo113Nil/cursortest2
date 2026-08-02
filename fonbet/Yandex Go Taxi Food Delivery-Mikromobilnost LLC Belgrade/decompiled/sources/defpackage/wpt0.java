package defpackage;

import com.yandex.go.design.compose.spinner.SpinnerSize;

/* loaded from: classes11.dex */
public final /* synthetic */ class wpt0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SpinnerSize b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ wp2 w;

    public /* synthetic */ wpt0(SpinnerSize spinnerSize, f530 f530Var, wp2 wp2Var, int i, int i2) {
        this.a = i2;
        this.b = spinnerSize;
        this.c = f530Var;
        this.w = wp2Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wp2 wp2Var = this.w;
        f530 f530Var = this.c;
        SpinnerSize spinnerSize = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ffb1.b(spinnerSize, f530Var, wp2Var, fidVar, vng.O(1));
                break;
            default:
                ffb1.a(spinnerSize, f530Var, wp2Var, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
