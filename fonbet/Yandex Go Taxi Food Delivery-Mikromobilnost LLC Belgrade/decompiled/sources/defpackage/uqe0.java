package defpackage;

import com.yandex.go.address_confirmation.api.TargetScreenAfterConfirmation;
import com.yandex.go.preorder.navigation.c;

/* loaded from: classes13.dex */
public final class uqe0 implements sy60 {
    public final /* synthetic */ c a;
    public final /* synthetic */ TargetScreenAfterConfirmation b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ k9s0 w;

    public uqe0(c cVar, TargetScreenAfterConfirmation targetScreenAfterConfirmation, sls slsVar, k9s0 k9s0Var) {
        this.a = cVar;
        this.b = targetScreenAfterConfirmation;
        this.c = slsVar;
        this.w = k9s0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        boolean z;
        int i = tqe0.a[this.b.ordinal()];
        c cVar = this.a;
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            k9s0 k9s0Var = this.w;
            z = cVar.a0(k9s0Var != null ? k9s0Var.e : null, null);
        }
        if (z) {
            return;
        }
        cVar.r(new qu(9));
    }

    public final void n1() {
        if (nqe0.a[this.b.ordinal()] == 1) {
            ((iwx0) this.a.i0.get()).a(kwx0.b);
        }
        this.c.invoke();
    }
}
