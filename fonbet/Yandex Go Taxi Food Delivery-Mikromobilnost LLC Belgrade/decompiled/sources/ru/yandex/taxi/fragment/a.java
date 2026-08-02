package ru.yandex.taxi.fragment;

import com.yandex.go.address.models.Address;
import defpackage.pv0;
import ru.yandex.taxi.fragment.MapFragment;

/* loaded from: classes5.dex */
public final class a extends MapFragment.a {
    public final /* synthetic */ SuggestedFavoritesFragment a;

    public a(SuggestedFavoritesFragment suggestedFavoritesFragment) {
        this.a = suggestedFavoritesFragment;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
    }

    @Override // defpackage.si00
    public final void j(pv0 pv0Var) {
        this.a.onPreResult(pv0Var);
    }
}
