package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.clarify_address.AddressClarificationReason;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;
import ru.yandex.taxi.search.router.a;

/* loaded from: classes6.dex */
public final class xef extends MapFragment.a {
    public final /* synthetic */ a a;
    public final /* synthetic */ AddressMapPickerFragment b;

    public xef(a aVar, AddressMapPickerFragment addressMapPickerFragment) {
        this.a = aVar;
        this.b = addressMapPickerFragment;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        address.G(GeoPointAcquisitionType.USER_LOCATION);
        a aVar = this.a;
        aVar.H.m(new ZoneAddress(address, aVar.G.f(((PlainAddress) address).getZoneName())), null);
        ((com.yandex.go.clarify_address.a) this.b.getAddressClarificationInteractor()).c(true, AddressClarificationReason.Map);
        aVar.r(new a5f(7));
    }

    @Override // defpackage.si00
    public final void d() {
        this.a.r(new qu(9));
    }
}
