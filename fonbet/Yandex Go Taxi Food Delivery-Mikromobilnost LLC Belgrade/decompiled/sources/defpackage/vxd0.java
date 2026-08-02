package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.poll.a;

/* loaded from: classes12.dex */
public final class vxd0 extends d7 implements mse {
    public final /* synthetic */ a a;
    public final /* synthetic */ ig5 b;
    public final /* synthetic */ jh5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxd0(a aVar, ig5 ig5Var, jh5 jh5Var) {
        super(lse.a);
        this.a = aVar;
        this.b = ig5Var;
        this.c = jh5Var;
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        uxd0 uxd0Var = (uxd0) this.b;
        z22 z22Var = this.a.a;
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        nba1.h(z22Var, message);
        vm50 vm50Var = uxd0Var.g;
        if (vm50Var != null) {
            this.c.a.dispatch(vm50Var);
        }
    }
}
