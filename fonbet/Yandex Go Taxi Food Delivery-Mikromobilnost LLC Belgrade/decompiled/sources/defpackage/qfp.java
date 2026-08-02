package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.favorites.edit.presenter.d;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.fragment.favorites.edit.FavoriteEditFragment;

/* loaded from: classes5.dex */
public final class qfp extends MapFragment.a {
    public final /* synthetic */ FavoriteEditFragment a;

    public qfp(FavoriteEditFragment favoriteEditFragment) {
        this.a = favoriteEditFragment;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        d presenter = this.a.getPresenter();
        presenter.M.h(address);
        presenter.Lg();
    }
}
