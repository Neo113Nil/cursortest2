package defpackage;

import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes6.dex */
public final class tjs extends b61 {
    public vjs A;
    public String B;
    public boolean C;
    public boolean D;

    @Override // defpackage.b61, defpackage.zw4
    public final BaseAddressSearchView a() {
        return new FullscreenDestinationSearchView(this);
    }

    @Override // defpackage.b61
    /* renamed from: d */
    public final AddressSearchView a() {
        return new FullscreenDestinationSearchView(this);
    }
}
