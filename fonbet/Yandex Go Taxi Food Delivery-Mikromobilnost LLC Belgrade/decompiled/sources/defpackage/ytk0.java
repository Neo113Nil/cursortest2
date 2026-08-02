package defpackage;

import com.yandex.go.summary.ui.compose.common.bottomsheet.i;
import ru.yandex.taxi.preorder.tollroad.compose.ui.c;

/* loaded from: classes14.dex */
public final /* synthetic */ class ytk0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tls w;

    public /* synthetic */ ytk0(wg6 wg6Var, int i, tls tlsVar, int i2) {
        this.a = 1;
        this.b = wg6Var;
        this.c = i;
        this.w = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        tls tlsVar = this.w;
        wg6 wg6Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c.b(wg6Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 1:
                com.yandex.go.routestops.v2.ui.c.c(wg6Var, i2, tlsVar, fidVar, vng.O(1));
                break;
            default:
                i.g(wg6Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ytk0(wg6 wg6Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = wg6Var;
        this.w = tlsVar;
        this.c = i;
    }
}
