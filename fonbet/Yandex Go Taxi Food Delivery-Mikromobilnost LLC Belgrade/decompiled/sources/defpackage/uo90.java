package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class uo90 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ z22 b;

    public /* synthetic */ uo90(z22 z22Var, int i) {
        this.a = i;
        this.b = z22Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        z22 z22Var = this.b;
        long longValue = ((Long) obj).longValue();
        switch (i) {
            case 0:
                ((a) z22Var).a(new enz0(longValue));
                break;
            case 1:
                ((a) z22Var).a(new lva0(longValue));
                break;
            case 2:
                ((a) z22Var).a(new mva0(longValue));
                break;
            case 3:
                ((a) z22Var).a(new inz0(longValue));
                break;
            case 4:
                ((a) z22Var).a(new pva0(longValue));
                break;
            default:
                ((a) z22Var).a(new qva0(longValue));
                break;
        }
        return zy11Var;
    }
}
