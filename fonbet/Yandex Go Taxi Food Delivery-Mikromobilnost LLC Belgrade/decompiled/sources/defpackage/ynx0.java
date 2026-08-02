package defpackage;

import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class ynx0 implements a.InterfaceC0113a {
    public final /* synthetic */ b8r a;
    public final /* synthetic */ c4r0 b;

    public ynx0(b8r b8rVar, c4r0 c4r0Var) {
        this.a = b8rVar;
        this.b = c4r0Var;
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a.InterfaceC0113a
    public final void Xf(sgx0 sgx0Var, String str, boolean z) {
        mi31 b = this.a.b(sgx0Var, str);
        if (b != null) {
            this.b.d(SelectionOrigin.USER, b.a.J0, b.b, true);
            return;
        }
        jst.e.k(new IllegalStateException("Tariff not found"), "Tariff " + sgx0Var.a + " not found");
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a.InterfaceC0113a
    public final void Z6(int i, elx0 elx0Var) {
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a.InterfaceC0113a
    public final void i(ux31 ux31Var) {
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a.InterfaceC0113a
    public final void u0(sgx0 sgx0Var) {
    }
}
