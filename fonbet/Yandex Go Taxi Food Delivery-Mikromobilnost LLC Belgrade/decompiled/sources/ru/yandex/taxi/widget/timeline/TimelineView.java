package ru.yandex.taxi.widget.timeline;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.czo0;
import defpackage.g4i0;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.oaz0;
import defpackage.pav;
import defpackage.pdz0;
import defpackage.qje;
import defpackage.scc;
import defpackage.xbz0;
import defpackage.xng0;
import defpackage.ytz;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0016\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/yandex/taxi/widget/timeline/TimelineView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "Lxbz0;", "list", "", "compareItemList", "(Ljava/util/List;)Z", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "setItems", "(Ljava/util/List;)V", "index", "(Ljava/util/List;I)V", "setCurrentItem", "(I)V", "Landroid/graphics/Point;", "getItemsPoints", "()Ljava/util/List;", "Lpav;", "imageLoader", "setImageLoader", "(Lpav;)V", "Lytz;", "lottieLoader", "setLottieLoader", "(Lytz;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/util/AttributeSet;", CA20Status.STATUS_USER_I, "Loaz0;", "dataState", "Loaz0;", "Lru/yandex/taxi/widget/timeline/TimelineItemViewGroup;", "timelineItemViewGroup", "Lru/yandex/taxi/widget/timeline/TimelineItemViewGroup;", "Lru/yandex/taxi/widget/timeline/TimelineBar;", "timelineBar", "Lru/yandex/taxi/widget/timeline/TimelineBar;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "Companion", "pdz0", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimelineView extends FrameLayout implements nwy0 {
    public static final int $stable = 8;
    private static final pdz0 Companion = new pdz0();
    private static final int HORIZONTAL = 0;
    private static final int VERTICAL = 1;
    private final AttributeSet attrs;
    private final oaz0 dataState;
    private final int defStyleAttr;
    private final int defStyleRes;
    private final hbp0 scopeDelegate;
    private final TimelineBar timelineBar;
    private final TimelineItemViewGroup timelineItemViewGroup;

    public TimelineView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TimelineOrientation timelineOrientation;
        this.attrs = attributeSet;
        this.defStyleAttr = i;
        this.defStyleRes = i2;
        oaz0 oaz0Var = new oaz0();
        this.dataState = oaz0Var;
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        this.scopeDelegate = hbp0Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g4i0.TimelineView, i, i2);
        int i3 = obtainStyledAttributes.getInt(g4i0.TimelineView_timelineOrientation, 0);
        if (i3 == 0) {
            timelineOrientation = TimelineOrientation.HORIZONTAL;
        } else {
            if (i3 != 1) {
                ny61.k();
                throw null;
            }
            timelineOrientation = TimelineOrientation.VERTICAL;
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_timelineBarSegment, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_circleTailRadius, 0);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_circleTailSpace, 0);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_segmentSpace, 0);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_barLineWidth, 0);
        int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_outlinePassedSize, 0);
        int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_outlineCurrentSize, 0);
        int dimensionPixelSize8 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_outlinePendingSize, 0);
        int dimensionPixelSize9 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_frontPassedRadius, 0);
        int dimensionPixelSize10 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_frontCurrentRadius, 0);
        int dimensionPixelSize11 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_frontPendingRadius, 0);
        int dimensionPixelSize12 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_iconPassedRadius, 0);
        int dimensionPixelSize13 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_iconCurrentRadius, 0);
        TimelineOrientation timelineOrientation2 = timelineOrientation;
        int dimensionPixelSize14 = obtainStyledAttributes.getDimensionPixelSize(g4i0.TimelineView_iconPendingRadius, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(g4i0.TimelineView_outlinePassedBackground);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(g4i0.TimelineView_outlineCurrentBackground);
        Drawable drawable3 = obtainStyledAttributes.getDrawable(g4i0.TimelineView_outlinePendingBackground);
        Drawable drawable4 = obtainStyledAttributes.getDrawable(g4i0.TimelineView_frontPassedBackground);
        Drawable drawable5 = obtainStyledAttributes.getDrawable(g4i0.TimelineView_frontCurrentBackground);
        Drawable drawable6 = obtainStyledAttributes.getDrawable(g4i0.TimelineView_frontPendingBackground);
        int t = qje.t(xng0.controlMain, getContext());
        int t2 = qje.t(xng0.bgMain, getContext());
        int color = obtainStyledAttributes.getColor(g4i0.TimelineView_passedLineColor, t);
        int color2 = obtainStyledAttributes.getColor(g4i0.TimelineView_pendingLineColor, t2);
        int color3 = obtainStyledAttributes.getColor(g4i0.TimelineView_circleTailColor, t);
        boolean z = obtainStyledAttributes.getBoolean(g4i0.TimelineView_showPendingLine, false);
        boolean z2 = obtainStyledAttributes.getBoolean(g4i0.TimelineView_passedLineWithRoundCap, false);
        boolean z3 = obtainStyledAttributes.getBoolean(g4i0.TimelineView_pendingLineWithRoundCap, false);
        boolean z4 = obtainStyledAttributes.getBoolean(g4i0.TimelineView_applyAnimation, true);
        int t3 = qje.t(xng0.textOnControl, getContext());
        int t4 = qje.t(xng0.textMain, getContext());
        int color4 = obtainStyledAttributes.getColor(g4i0.TimelineView_iconPassedTintColor, t3);
        int color5 = obtainStyledAttributes.getColor(g4i0.TimelineView_iconCurrentTintColor, t3);
        int color6 = obtainStyledAttributes.getColor(g4i0.TimelineView_iconPendingTintColor, t4);
        obtainStyledAttributes.recycle();
        TimelineItemViewGroup timelineItemViewGroup = new TimelineItemViewGroup(context, oaz0Var, hbp0Var, timelineOrientation2, dimensionPixelSize, dimensionPixelSize6, dimensionPixelSize7, dimensionPixelSize8, dimensionPixelSize9, dimensionPixelSize10, dimensionPixelSize11, dimensionPixelSize12, dimensionPixelSize13, dimensionPixelSize14, drawable, drawable2, drawable3, drawable4, drawable5, drawable6, z4, color4, color5, color6);
        this.timelineItemViewGroup = timelineItemViewGroup;
        TimelineBar timelineBar = new TimelineBar(context, oaz0Var, timelineOrientation2, dimensionPixelSize, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize10, dimensionPixelSize7, z4, z, z2, z3, color, color2, color3);
        this.timelineBar = timelineBar;
        timelineBar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        timelineItemViewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(timelineBar);
        addView(timelineItemViewGroup);
    }

    private final boolean compareItemList(List<xbz0> list) {
        ArrayList arrayList = this.dataState.a;
        if (list.size() != arrayList.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!jl40.l(list.get(i).a, ((xbz0) arrayList.get(i)).a)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.attrs, g4i0.TimelineView, this.defStyleAttr, this.defStyleRes);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(g4i0.TimelineView_outlinePassedBackground);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(g4i0.TimelineView_outlineCurrentBackground);
            Drawable drawable3 = obtainStyledAttributes.getDrawable(g4i0.TimelineView_outlinePendingBackground);
            Drawable drawable4 = obtainStyledAttributes.getDrawable(g4i0.TimelineView_frontPassedBackground);
            Drawable drawable5 = obtainStyledAttributes.getDrawable(g4i0.TimelineView_frontCurrentBackground);
            Drawable drawable6 = obtainStyledAttributes.getDrawable(g4i0.TimelineView_frontPendingBackground);
            int t = qje.t(xng0.controlMain, getContext());
            int t2 = qje.t(xng0.bgMain, getContext());
            int color = obtainStyledAttributes.getColor(g4i0.TimelineView_passedLineColor, t);
            int color2 = obtainStyledAttributes.getColor(g4i0.TimelineView_pendingLineColor, t2);
            int color3 = obtainStyledAttributes.getColor(g4i0.TimelineView_circleTailColor, t);
            int t3 = qje.t(xng0.textOnControl, getContext());
            int t4 = qje.t(xng0.textMain, getContext());
            this.timelineItemViewGroup.updateIconTintColor$taxi_design(obtainStyledAttributes.getColor(g4i0.TimelineView_iconPassedTintColor, t3), obtainStyledAttributes.getColor(g4i0.TimelineView_iconCurrentTintColor, t3), obtainStyledAttributes.getColor(g4i0.TimelineView_iconPendingTintColor, t4));
            this.timelineItemViewGroup.updateBackground$taxi_design(drawable, drawable2, drawable3, drawable4, drawable5, drawable6);
            this.timelineBar.updateColor$taxi_design(color, color2, color3);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final List<Point> getItemsPoints() {
        if (isLaidOut()) {
            return this.timelineItemViewGroup.getItemPoints$taxi_design();
        }
        ny61.g("TimelineView is not laid out");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scopeDelegate.b();
    }

    public final void setCurrentItem(int index) {
        if (scc.f(this.dataState.a) < index) {
            ny61.g("TimelineView: current index exceeds size of items list");
            return;
        }
        this.timelineBar.setShouldAnimate$taxi_design(true);
        this.timelineItemViewGroup.setShouldAnimate$taxi_design(true);
        this.dataState.a(index);
    }

    public final void setImageLoader(pav imageLoader) {
        this.timelineItemViewGroup.setImageLoader$taxi_design(imageLoader);
    }

    public final void setItems(List<xbz0> list, int index) {
        if (scc.f(list) < index) {
            ny61.g("TimelineView: current index exceeds size of items list");
            return;
        }
        boolean compareItemList = compareItemList(list);
        this.timelineBar.setShouldAnimate$taxi_design(compareItemList);
        this.timelineItemViewGroup.setShouldAnimate$taxi_design(compareItemList);
        this.dataState.b(list);
        this.dataState.a(index);
    }

    public final void setLottieLoader(ytz lottieLoader) {
        this.timelineItemViewGroup.setLottieLoader$taxi_design(lottieLoader);
    }

    public final void setItems(List<xbz0> list) {
        this.timelineBar.setShouldAnimate$taxi_design(false);
        this.timelineItemViewGroup.setShouldAnimate$taxi_design(false);
        this.dataState.b(list);
        this.dataState.a(0);
    }

    public TimelineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public TimelineView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public TimelineView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ TimelineView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
