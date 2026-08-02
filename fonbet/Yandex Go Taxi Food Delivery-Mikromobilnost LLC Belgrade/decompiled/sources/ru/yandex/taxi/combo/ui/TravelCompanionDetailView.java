package ru.yandex.taxi.combo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.ad11;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.yvf0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/combo/ui/TravelCompanionDetailView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lyvf0;", "Lru/yandex/taxi/combo/ui/TravelCompanionStatusView;", "viewProvider", "", "Lad11;", "travelCompanions", "Lzy11;", "setCompanionCards", "(Lyvf0;Ljava/util/List;)V", "combo"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TravelCompanionDetailView extends LinearLayout {
    public TravelCompanionDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
    }

    public final void setCompanionCards(yvf0 viewProvider, List<ad11> travelCompanions) {
        removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, tje.u(6, getContext()), 0, 0);
        for (ad11 ad11Var : travelCompanions) {
            TravelCompanionStatusView travelCompanionStatusView = (TravelCompanionStatusView) viewProvider.get();
            travelCompanionStatusView.setTitleMaxLines(2);
            travelCompanionStatusView.setTitleEllipsizeMode(1);
            travelCompanionStatusView.setSubtitleMaxLines(1);
            travelCompanionStatusView.setLayoutParams(layoutParams);
            travelCompanionStatusView.setVerticalPadding(tje.r(mrg0.go_design_s_space, getContext()));
            travelCompanionStatusView.bind(ad11Var);
            travelCompanionStatusView.makeViewRounded();
            addView(travelCompanionStatusView);
        }
    }
}
