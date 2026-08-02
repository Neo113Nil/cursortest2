package defpackage;

import com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class reg0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ reg0(tls tlsVar, f530 f530Var, int i) {
        this.a = 0;
        this.c = tlsVar;
        this.b = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.d(vng.O(49), fidVar, tlsVar, f530Var);
                break;
            case 1:
                e2a1.b(vng.O(1), fidVar, tlsVar, f530Var);
                break;
            default:
                qe61.c(vng.O(1), fidVar, tlsVar, f530Var);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ reg0(f530 f530Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = f530Var;
        this.c = tlsVar;
    }
}
