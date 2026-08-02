package defpackage;

import com.yandex.go.navigator.address.NavigatorRouteStopsSearchView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes6.dex */
public final class te50 extends b61 {
    public zf50 A;
    public String B;

    @Override // defpackage.b61, defpackage.zw4
    public final BaseAddressSearchView a() {
        return new NavigatorRouteStopsSearchView(this);
    }

    @Override // defpackage.b61
    /* renamed from: d */
    public final AddressSearchView a() {
        return new NavigatorRouteStopsSearchView(this);
    }
}
