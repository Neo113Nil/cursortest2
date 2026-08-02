package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineView;

/* loaded from: classes14.dex */
public final class r2y implements zo31 {
    public final RideCardTimelineView a;
    public final ViewStub b;
    public final ViewStub c;
    public final ViewStub d;

    public r2y(RideCardTimelineView rideCardTimelineView, ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        this.a = rideCardTimelineView;
        this.b = viewStub;
        this.c = viewStub2;
        this.d = viewStub3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
