package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineView;
import ru.yandex.taxi.widget.timeline.TimelineView;

/* loaded from: classes14.dex */
public final class wok0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ RideCardTimelineView w;

    public /* synthetic */ wok0(TimelineView timelineView, tls tlsVar, RideCardTimelineView rideCardTimelineView, int i) {
        this.a = i;
        this.b = timelineView;
        this.c = tlsVar;
        this.w = rideCardTimelineView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TimelineView regularTimelineView;
        TimelineView compactTimelineView;
        int i = this.a;
        RideCardTimelineView rideCardTimelineView = this.w;
        tls tlsVar = this.c;
        switch (i) {
            case 0:
                regularTimelineView = rideCardTimelineView.getRegularTimelineView();
                tlsVar.invoke(regularTimelineView.getItemsPoints());
                break;
            default:
                compactTimelineView = rideCardTimelineView.getCompactTimelineView();
                tlsVar.invoke(compactTimelineView.getItemsPoints());
                break;
        }
    }
}
