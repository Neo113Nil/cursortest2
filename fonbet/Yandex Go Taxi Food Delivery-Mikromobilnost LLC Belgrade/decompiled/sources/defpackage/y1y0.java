package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class y1y0 implements jms {
    public final /* synthetic */ x980 a;

    public y1y0(x980 x980Var) {
        this.a = x980Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y1y0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(4, this.a, x980.class, "openCenterModal", "openCenterModal(Lcom/yandex/go/taxi/order/models/api/TaxiOrderHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
