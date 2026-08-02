package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;

/* loaded from: classes6.dex */
public final class ri30 implements kc30 {
    public final /* synthetic */ lc30 a;
    public final /* synthetic */ si30 b;

    public ri30(lc30 lc30Var, si30 si30Var) {
        this.a = lc30Var;
        this.b = si30Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.b.P();
    }

    @Override // defpackage.kc30
    public final void d(Address address) {
        si30 si30Var = this.b;
        wu30 wu30Var = si30Var.F;
        int i = qi30.a[this.a.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            } else {
                wu30Var.d(address);
                si30Var.r(new pi30(1));
                return;
            }
        }
        wu30Var.i(new ZoneAddress(address, 2));
        if (wu30Var.k() != null) {
            si30Var.r(new pi30(0));
        } else {
            si30Var.P();
        }
    }
}
