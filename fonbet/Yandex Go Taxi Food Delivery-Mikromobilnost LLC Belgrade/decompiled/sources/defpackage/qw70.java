package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

/* loaded from: classes6.dex */
public final /* synthetic */ class qw70 implements v030, jms {
    public final /* synthetic */ OrderFragment a;

    public qw70(OrderFragment orderFragment) {
        this.a = orderFragment;
    }

    @Override // defpackage.v030
    public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        this.a.updateScreenState(u45Var, u45Var2, modalViewCoordinator$StackChangeType);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof v030) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(3, this.a, OrderFragment.class, "updateScreenState", "updateScreenState(Lru/yandex/taxi/widget/BaseModalView;Lru/yandex/taxi/widget/BaseModalView;Lru/yandex/taxi/widget/modalview/ModalViewCoordinator$StackChangeType;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
