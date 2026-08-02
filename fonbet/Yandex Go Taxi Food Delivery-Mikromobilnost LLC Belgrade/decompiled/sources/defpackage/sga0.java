package defpackage;

import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import com.yandex.xplat.payment.sdk.PaymentPollingResult;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class sga0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wga0 b;

    public /* synthetic */ sga0(wga0 wga0Var, int i) {
        this.a = i;
        this.b = wga0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        final int i2 = 0;
        Object[] objArr = 0;
        zy11 zy11Var = zy11.a;
        final wga0 wga0Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                bt5 bt5Var = wga0Var.g;
                String b = wga0Var.b();
                ox90 ox90Var = wga0Var.c;
                nw70 nw70Var = new nw70(11, ox90Var);
                oy80 oy80Var = new oy80(wga0Var, ox90Var, objArr == true ? 1 : 0, 7);
                String c = wga0Var.c(PaymentOptionNameForAnalytics.GOOGLE_PAY);
                rwo rwoVar = bt5Var.g;
                sv90 sv90Var = qv90.a;
                boolean z = bt5Var.p;
                sv90Var.getClass();
                iho f = xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Оплата через GooglePay ".concat(z ? "через PSP" : "через Trust"), z ? "google_pay_payment_v2" : "google_pay_payment");
                md51 a = bt5Var.a(b);
                u50 u50Var = new u50((Object) bt5Var, str, (Object) nw70Var, (Object) oy80Var, (Object) c, 2);
                ymx ymxVar = (ymx) a;
                ymxVar.getClass();
                md51 j = ymx.j(ymxVar, u50Var, null, 5);
                ((y22) rwoVar).b(f, j);
                break;
            case 1:
                final int i3 = 1;
                n891.n(new sls() { // from class: rga0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i3;
                        zy11 zy11Var2 = zy11.a;
                        wga0 wga0Var2 = wga0Var;
                        switch (i4) {
                            case 0:
                                wga0Var2.b.a();
                                wga0Var2.i.invoke();
                                break;
                            default:
                                wga0Var2.b.a();
                                wga0Var2.i.invoke();
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
            case 2:
                n891.n(new sls() { // from class: rga0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i2;
                        zy11 zy11Var2 = zy11.a;
                        wga0 wga0Var2 = wga0Var;
                        switch (i4) {
                            case 0:
                                wga0Var2.b.a();
                                wga0Var2.i.invoke();
                                break;
                            default:
                                wga0Var2.b.a();
                                wga0Var2.i.invoke();
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
            case 3:
                n891.n(new xw90(8, wga0Var, (PaymentPollingResult) obj));
                break;
            default:
                n891.n(new xw90(9, wga0Var, (YSError) obj));
                break;
        }
        return zy11Var;
    }
}
