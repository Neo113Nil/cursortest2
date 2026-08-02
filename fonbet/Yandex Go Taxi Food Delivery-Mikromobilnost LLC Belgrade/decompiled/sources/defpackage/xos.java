package defpackage;

import com.ybsdk.feature.savings.internal.interactors.b;
import com.ybsdk.feature.savings.internal.interactors.c;

/* loaded from: classes3.dex */
public final class xos implements v7p {
    public final /* synthetic */ int a;
    public final q150 b;
    public final g7g c;

    public /* synthetic */ xos(q150 q150Var, g7g g7gVar, int i) {
        this.a = i;
        this.b = q150Var;
        this.c = g7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        g7g g7gVar = this.c;
        q150 q150Var = this.b;
        switch (i) {
            case 0:
                return new b((com.ybsdk.feature.savings.internal.data.b) q150Var.get(), (com.ybsdk.utils.poller.b) g7gVar.get());
            default:
                return new c((com.ybsdk.feature.savings.internal.data.b) q150Var.get(), (com.ybsdk.utils.poller.b) g7gVar.get());
        }
    }
}
