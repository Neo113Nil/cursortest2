package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;

/* loaded from: classes13.dex */
public final /* synthetic */ class yux implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ yux(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Throwable th = this.b;
        switch (i) {
            case 0:
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.j((r2 & 1) == 0);
                w3j0Var.d(Constants.KEY_EXCEPTION, String.valueOf(th));
                break;
            case 1:
                gmo0 gmo0Var = ((fmo0) obj).a;
                gmo0Var.A((m950) gmo0Var.D.get(), new zjn0(th, (List) null, 6), new ndn0(2, gmo0Var));
                break;
            default:
                ((w8w0) obj).onFailure(th);
                break;
        }
        return zy11Var;
    }
}
