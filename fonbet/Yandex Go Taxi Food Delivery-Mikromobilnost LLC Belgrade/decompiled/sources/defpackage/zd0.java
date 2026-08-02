package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.fragment.SuggestedFavoritesFragment;
import ru.yandex.taxi.router.a;

/* loaded from: classes5.dex */
public final class zd0 extends MapFragment.a {
    public final /* synthetic */ a a;
    public final /* synthetic */ SuggestedFavoritesFragment b;

    public zd0(a aVar, SuggestedFavoritesFragment suggestedFavoritesFragment) {
        this.a = aVar;
        this.b = suggestedFavoritesFragment;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        this.a.r(new yd0(address, 0));
    }

    @Override // defpackage.si00
    public final void d() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.si00
    public final void j(pv0 pv0Var) {
        this.b.onPreResult(pv0Var);
    }
}
