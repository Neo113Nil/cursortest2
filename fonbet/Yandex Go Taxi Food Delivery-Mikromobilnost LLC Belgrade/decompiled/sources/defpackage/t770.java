package defpackage;

import com.yandex.go.vault.flexsdk.descriptors.widget.actions.b;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.h;

/* loaded from: classes14.dex */
public final class t770 implements v7p {
    public final /* synthetic */ int a;
    public final qx5 b;

    public /* synthetic */ t770(qx5 qx5Var, int i) {
        this.a = i;
        this.b = qx5Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        qx5 qx5Var = this.b;
        switch (i) {
            case 0:
                return new b((h) qx5Var.get(), 0);
            case 1:
                return new b((h) qx5Var.get(), 1);
            case 2:
                return new b((h) qx5Var.get(), 2);
            default:
                return new b((h) qx5Var.get(), 3);
        }
    }
}
