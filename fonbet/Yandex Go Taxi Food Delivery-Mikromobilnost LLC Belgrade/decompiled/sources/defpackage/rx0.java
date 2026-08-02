package defpackage;

import ru.yandex.taxi.fragment.preorder.AddressMapFragment;

/* loaded from: classes5.dex */
public final class rx0 implements uy60 {
    public final /* synthetic */ AddressMapFragment a;

    public /* synthetic */ rx0(AddressMapFragment addressMapFragment) {
        this.a = addressMapFragment;
    }

    @Override // defpackage.uy60
    public void a() {
        this.a.invalidatePickupPoints();
    }
}
