package defpackage;

import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import com.yandex.go.address.address_map_picker.pin.AddressMapPickerPinV1DataRepository$stateFlow$$inlined$flatMapLatest$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class x11 extends y0c0 {
    public final AddressMapPickerAddressStateRepository a;
    public final g92 b;

    public x11(r0c0 r0c0Var, AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository) {
        this.a = addressMapPickerAddressStateRepository;
        this.b = new g92(2, r0c0Var.g());
    }

    @Override // defpackage.y0c0
    public final tpr a() {
        return new g92(2, Boolean.FALSE);
    }

    @Override // defpackage.y0c0
    public final tpr b() {
        return new g92(2, null);
    }

    @Override // defpackage.y0c0
    public final tpr c() {
        return new g92(2, "");
    }

    @Override // defpackage.y0c0
    public final tpr d(tpr tprVar) {
        return e.X(tprVar, new AddressMapPickerPinV1DataRepository$stateFlow$$inlined$flatMapLatest$1(null, this));
    }

    @Override // defpackage.y0c0
    public final tpr e() {
        return this.b;
    }

    @Override // defpackage.y0c0
    public final tpr f() {
        return new g92(2, Boolean.TRUE);
    }
}
