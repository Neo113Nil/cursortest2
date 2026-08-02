package defpackage;

import com.yandex.go.benefits_center.benefits.sdk.actions.b;
import com.yandex.go.benefits_center.benefits.sdk.descriptors.a;

/* loaded from: classes.dex */
public final class r00 implements v7p {
    public final /* synthetic */ int a;
    public final sx2 b;

    public /* synthetic */ r00(sx2 sx2Var, int i) {
        this.a = i;
        this.b = sx2Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        sx2 sx2Var = this.b;
        switch (i) {
            case 0:
                return new a((b) sx2Var.get(), 0);
            case 1:
                return new a((b) sx2Var.get(), 3);
            case 2:
                return new a((b) sx2Var.get(), 4);
            default:
                return new a((b) sx2Var.get(), 6);
        }
    }
}
