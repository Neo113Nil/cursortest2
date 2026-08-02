package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.fragment.MapFragment;

/* loaded from: classes5.dex */
public final class vfp implements qz0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MapFragment.a b;

    public /* synthetic */ vfp(MapFragment.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    @Override // defpackage.qz0
    public final void P(Address address) {
        int i = this.a;
        MapFragment.a aVar = this.b;
        switch (i) {
            case 0:
                aVar.a(address);
                break;
            default:
                ((gjp) aVar).a(address);
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
    }
}
