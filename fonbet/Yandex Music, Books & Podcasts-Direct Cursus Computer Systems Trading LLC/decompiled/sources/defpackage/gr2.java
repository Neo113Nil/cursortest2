package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public abstract class gr2 extends BasePendingResult {
    public final go0 o;
    public final po0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr2(po0 po0Var, tmd tmdVar) {
        super(tmdVar);
        y1g.H(tmdVar, "GoogleApiClient must not be null");
        y1g.H(po0Var, "Api must not be null");
        this.o = po0Var.b;
        this.p = po0Var;
    }

    public abstract void l(fo0 fo0Var);

    public final void m(Status status) {
        y1g.y("Failed result must not be success", !status.d());
        g(c(status));
    }
}
