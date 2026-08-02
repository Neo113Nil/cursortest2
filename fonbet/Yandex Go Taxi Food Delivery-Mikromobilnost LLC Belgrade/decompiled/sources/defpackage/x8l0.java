package defpackage;

import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;

/* loaded from: classes5.dex */
public final /* synthetic */ class x8l0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RouteSelectorDestinationFragment b;

    public /* synthetic */ x8l0(RouteSelectorDestinationFragment routeSelectorDestinationFragment, int i) {
        this.a = i;
        this.b = routeSelectorDestinationFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onAttach$lambda$2;
        zy11 onAttach$lambda$3;
        int i = this.a;
        RouteSelectorDestinationFragment routeSelectorDestinationFragment = this.b;
        zzs zzsVar = (zzs) obj;
        switch (i) {
            case 0:
                onAttach$lambda$2 = RouteSelectorDestinationFragment.onAttach$lambda$2(routeSelectorDestinationFragment, zzsVar);
                return onAttach$lambda$2;
            case 1:
                onAttach$lambda$3 = RouteSelectorDestinationFragment.onAttach$lambda$3(routeSelectorDestinationFragment, zzsVar);
                return onAttach$lambda$3;
            default:
                routeSelectorDestinationFragment.moveToPoint(zzsVar, "manual.panorama_pickup_point");
                return zy11.a;
        }
    }
}
