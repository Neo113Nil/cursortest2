package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes11.dex */
public final class qx81 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ lta0 b;
    public final /* synthetic */ Object c;

    public qx81(lta0 lta0Var, atx0 atx0Var, wdz wdzVar) {
        this.b = lta0Var;
        this.c = atx0Var;
    }

    public final void a(Status status) {
        int i = this.a;
        lta0 lta0Var = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((rx81) obj).a.remove((BasePendingResult) lta0Var);
                break;
            default:
                atx0 atx0Var = (atx0) obj;
                if (!status.isSuccess()) {
                    atx0Var.a.r(sn2.a(status));
                    break;
                } else {
                    lta0Var.b();
                    atx0Var.a(null);
                    break;
                }
        }
    }

    public qx81(rx81 rx81Var, BasePendingResult basePendingResult) {
        this.c = rx81Var;
        this.b = basePendingResult;
    }
}
