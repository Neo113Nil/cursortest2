package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes6.dex */
public final /* synthetic */ class z51 implements t6v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9v0 b;
    public final /* synthetic */ BaseAddressSearchView c;

    public /* synthetic */ z51(BaseAddressSearchView baseAddressSearchView, x9v0 x9v0Var, int i) {
        this.a = i;
        this.c = baseAddressSearchView;
        this.b = x9v0Var;
    }

    @Override // defpackage.t6v0
    public final void a(Address address) {
        int i = this.a;
        x9v0 x9v0Var = this.b;
        BaseAddressSearchView baseAddressSearchView = this.c;
        switch (i) {
            case 0:
                AddressSearchView.createSuggestMenuPayload$lambda$1((AddressSearchView) baseAddressSearchView, x9v0Var, address);
                break;
            default:
                CompositeAddressSearchView.createSuggestMenuPayload$lambda$1((CompositeAddressSearchView) baseAddressSearchView, x9v0Var, address);
                break;
        }
    }
}
