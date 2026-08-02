package defpackage;

import ru.yandex.taxi.fragment.preorder.AddressMapFragment;

/* loaded from: classes5.dex */
public final /* synthetic */ class wx0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx0 b;

    public /* synthetic */ wx0(xx0 xx0Var, int i) {
        this.a = i;
        this.b = xx0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        xx0 xx0Var = this.b;
        switch (i) {
            case 0:
                ((AddressMapFragment) ((ddf) xx0Var.j).b).invalidatePickupPoints();
                break;
            default:
                ((AddressMapFragment) ((ddf) xx0Var.j).b).invalidatePickupPoints();
                break;
        }
        return zy11Var;
    }
}
