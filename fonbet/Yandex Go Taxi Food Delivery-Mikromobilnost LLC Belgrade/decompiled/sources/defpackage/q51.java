package defpackage;

import ru.yandex.taxi.search.view.AddressSearchModalView;

/* loaded from: classes6.dex */
public final class q51 implements t030 {
    public final /* synthetic */ AddressSearchModalView a;

    public q51(AddressSearchModalView addressSearchModalView) {
        this.a = addressSearchModalView;
    }

    @Override // defpackage.t030
    public final boolean H() {
        return false;
    }

    @Override // defpackage.t030
    public final void collapse() {
    }

    @Override // defpackage.t030
    public final void dismissWithAction(Runnable runnable) {
        this.a.dismissWithAction(runnable);
    }

    @Override // defpackage.t030
    public final void expand() {
    }

    @Override // defpackage.t030
    public final boolean isCollapsed() {
        return this.a.isCollapsed();
    }

    @Override // defpackage.t030
    public final boolean isExpanded() {
        return this.a.isExpanded();
    }
}
