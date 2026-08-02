package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.change.source.mvp.d;
import ru.yandex.taxi.ChangeOrderSourceAddressFragment;
import ru.yandex.taxi.fragment.MapFragment;

/* loaded from: classes5.dex */
public final class wb9 extends MapFragment.a {
    public final /* synthetic */ si00 a;
    public final /* synthetic */ ChangeOrderSourceAddressFragment b;

    public wb9(si00 si00Var, ChangeOrderSourceAddressFragment changeOrderSourceAddressFragment) {
        this.a = si00Var;
        this.b = changeOrderSourceAddressFragment;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        si00 si00Var = this.a;
        if (si00Var != null) {
            si00Var.a(address);
        }
    }

    @Override // defpackage.si00
    public final void h(String str) {
        si00 si00Var = this.a;
        if (si00Var != null) {
            si00Var.h(str);
        }
    }

    @Override // defpackage.si00
    public final void j(pv0 pv0Var) {
        d dVar;
        dVar = this.b.presenter;
        if (dVar == null) {
            dVar = null;
        }
        dVar.Lg(pv0Var);
    }
}
