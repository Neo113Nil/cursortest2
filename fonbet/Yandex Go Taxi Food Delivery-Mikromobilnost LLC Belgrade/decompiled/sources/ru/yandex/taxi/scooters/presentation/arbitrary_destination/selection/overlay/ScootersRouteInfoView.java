package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import defpackage.mrg0;
import defpackage.q0h0;
import defpackage.tje;
import defpackage.xw31;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007Ê\u0001\f\b\t\u0012\b\b\n\u0012\u0004\b\u0003\u0010\u0000¨\u0006\b"}, d2 = {"Lru/yandex/taxi/scooters/presentation/arbitrary_destination/selection/overlay/ScootersRouteInfoView;", "Lru/yandex/taxi/widget/RobotoTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "asBitmap", "Landroid/graphics/Bitmap;", "ontheway", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersRouteInfoView extends RobotoTextView {
    public static final int $stable = 8;

    public ScootersRouteInfoView(Context context) {
        super(context, null, 0, 6, null);
        setTextSize(0, getResources().getDimension(mrg0.component_text_size_caption));
        setBackgroundResource(q0h0.bg_route_info);
        setPaddingRelative(tje.r(mrg0.go_design_s_space, getContext()), tje.u(4, getContext()), tje.r(mrg0.go_design_s_space, getContext()), tje.u(4, getContext()));
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    public final Bitmap asBitmap() {
        xw31.r(this);
        return xw31.t(this);
    }
}
