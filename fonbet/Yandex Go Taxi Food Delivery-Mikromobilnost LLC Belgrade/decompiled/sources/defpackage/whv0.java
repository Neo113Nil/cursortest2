package defpackage;

import com.yandex.go.summary.ui.compose.common.bottomsheet.i;

/* loaded from: classes14.dex */
public final /* synthetic */ class whv0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ int x;

    public /* synthetic */ whv0(wg6 wg6Var, int i, tls tlsVar, int i2, int i3) {
        this.a = i3;
        this.b = wg6Var;
        this.c = i;
        this.w = tlsVar;
        this.x = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        tls tlsVar = this.w;
        int i3 = this.c;
        wg6 wg6Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                i.f(wg6Var, i3, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                com.yandex.go.taxi.summary.verticalsummary.ui.i.a(wg6Var, i3, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
