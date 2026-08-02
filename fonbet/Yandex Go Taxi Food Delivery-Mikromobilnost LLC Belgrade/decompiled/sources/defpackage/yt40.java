package defpackage;

import com.yandex.go.taxi.summary.rida_summary.ui.a;
import com.yandex.go.taxi.summary.verticalsummary.ui.d;

/* loaded from: classes11.dex */
public final /* synthetic */ class yt40 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ int c;

    public /* synthetic */ yt40(int i, int i2, tls tlsVar) {
        this.a = i2;
        this.b = tlsVar;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        tls tlsVar = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                jm91.d(tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 1:
                num.intValue();
                a.b(tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 2:
                num.intValue();
                u3b1.d(tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 3:
                num.getClass();
                tb31.g(tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 4:
                num.intValue();
                d.b(tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                num.intValue();
                d.c(tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
