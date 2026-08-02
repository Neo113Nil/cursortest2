package defpackage;

import com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.redirect.a;

/* loaded from: classes12.dex */
public final class y7f implements v7p {
    public final /* synthetic */ int a;
    public final jc50 b;

    public /* synthetic */ y7f(jc50 jc50Var, int i) {
        this.a = i;
        this.b = jc50Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        jc50 jc50Var = this.b;
        switch (i) {
            case 0:
                return new a((kt90) jc50Var.get());
            default:
                return new com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.a((kt90) jc50Var.get());
        }
    }
}
