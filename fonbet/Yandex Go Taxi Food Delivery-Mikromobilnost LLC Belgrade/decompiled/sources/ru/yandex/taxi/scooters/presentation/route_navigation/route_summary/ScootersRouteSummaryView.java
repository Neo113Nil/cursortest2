package ru.yandex.taxi.scooters.presentation.route_navigation.route_summary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.pfh0;
import defpackage.q0h0;
import defpackage.qrh0;
import defpackage.rp31;
import defpackage.sls;
import defpackage.vng;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0014J\u001b\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/yandex/taxi/scooters/presentation/route_navigation/route_summary/ScootersRouteSummaryView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "progress", "Lzy11;", "setRouteProgress", "(F)V", "", "arrival", "setArrivalTime", "(Ljava/lang/CharSequence;)V", "remain", "setRemainingTime", "remaining", "setRemainingDistance", "Lkotlin/Function0;", "listener", "setStopListener", "(Lsls;)V", "Lcom/yandex/go/design/view/GoImageView;", "stop", "Lcom/yandex/go/design/view/GoImageView;", "Lru/yandex/taxi/widget/RobotoTextView;", "arrivalTime", "Lru/yandex/taxi/widget/RobotoTextView;", "remainingTime", "remainingDistance", "Lru/yandex/taxi/scooters/presentation/route_navigation/route_summary/ScootersSummaryRouteLineView;", "summaryRouteLineView", "Lru/yandex/taxi/scooters/presentation/route_navigation/route_summary/ScootersSummaryRouteLineView;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersRouteSummaryView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final RobotoTextView arrivalTime;
    private final RobotoTextView remainingDistance;
    private final RobotoTextView remainingTime;
    private final GoImageView stop;
    private final ScootersSummaryRouteLineView summaryRouteLineView;

    public ScootersRouteSummaryView(Context context) {
        super(context, null, 0, 0, 14, null);
        c.q(this, qrh0.scooters_route_summary_view, true);
        setBackground(vng.t(q0h0.scooters_route_summary_bg, getContext()));
        setClickable(true);
        int i = pfh0.stop;
        WeakHashMap weakHashMap = b.a;
        this.stop = (GoImageView) ((View) rp31.d(this, i));
        this.arrivalTime = (RobotoTextView) ((View) rp31.d(this, pfh0.arrival_time));
        this.remainingTime = (RobotoTextView) ((View) rp31.d(this, pfh0.remaining_time));
        this.remainingDistance = (RobotoTextView) ((View) rp31.d(this, pfh0.remaining_distance));
        this.summaryRouteLineView = (ScootersSummaryRouteLineView) ((View) rp31.d(this, pfh0.route_line));
    }

    public final void setArrivalTime(CharSequence arrival) {
        this.arrivalTime.setText(arrival);
    }

    public final void setRemainingDistance(CharSequence remaining) {
        this.remainingDistance.setText(remaining);
    }

    public final void setRemainingTime(CharSequence remain) {
        this.remainingTime.setText(remain);
    }

    public final void setRouteProgress(float progress) {
        this.summaryRouteLineView.setProgress(progress);
    }

    public final void setStopListener(sls listener) {
        c.z(listener, this.stop);
    }

    public ScootersRouteSummaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
        c.q(this, qrh0.scooters_route_summary_view, true);
        setBackground(vng.t(q0h0.scooters_route_summary_bg, getContext()));
        setClickable(true);
        int i = pfh0.stop;
        WeakHashMap weakHashMap = b.a;
        this.stop = (GoImageView) ((View) rp31.d(this, i));
        this.arrivalTime = (RobotoTextView) ((View) rp31.d(this, pfh0.arrival_time));
        this.remainingTime = (RobotoTextView) ((View) rp31.d(this, pfh0.remaining_time));
        this.remainingDistance = (RobotoTextView) ((View) rp31.d(this, pfh0.remaining_distance));
        this.summaryRouteLineView = (ScootersSummaryRouteLineView) ((View) rp31.d(this, pfh0.route_line));
    }

    public ScootersRouteSummaryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        c.q(this, qrh0.scooters_route_summary_view, true);
        setBackground(vng.t(q0h0.scooters_route_summary_bg, getContext()));
        setClickable(true);
        int i2 = pfh0.stop;
        WeakHashMap weakHashMap = b.a;
        this.stop = (GoImageView) ((View) rp31.d(this, i2));
        this.arrivalTime = (RobotoTextView) ((View) rp31.d(this, pfh0.arrival_time));
        this.remainingTime = (RobotoTextView) ((View) rp31.d(this, pfh0.remaining_time));
        this.remainingDistance = (RobotoTextView) ((View) rp31.d(this, pfh0.remaining_distance));
        this.summaryRouteLineView = (ScootersSummaryRouteLineView) ((View) rp31.d(this, pfh0.route_line));
    }
}
