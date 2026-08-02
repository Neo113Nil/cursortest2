package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class w1y0 implements jms {
    public final /* synthetic */ x980 a;

    public w1y0(x980 x980Var) {
        this.a = x980Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w1y0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, x980.class, "openBottomModal", "openBottomModal(Lcom/yandex/go/taxi/order/models/api/bottom_modal/BottomModalParams;Lru/yandex/taxi/payments/model/CurrencyRules;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
