package defpackage;

import com.yandex.go.places.impl.ui.bookings.PlacesBookingsModalView;

/* loaded from: classes13.dex */
public final class s5c0 implements w5c0 {
    public final /* synthetic */ PlacesBookingsModalView a;

    public s5c0(PlacesBookingsModalView placesBookingsModalView) {
        this.a = placesBookingsModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        o5c0 bookingsAdapter;
        bookingsAdapter = this.a.getBookingsAdapter();
        bookingsAdapter.submitList(((c6c0) obj).a, null);
    }
}
