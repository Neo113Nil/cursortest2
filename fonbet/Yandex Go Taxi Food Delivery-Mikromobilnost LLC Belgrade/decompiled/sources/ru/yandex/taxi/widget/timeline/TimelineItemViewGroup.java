package ru.yandex.taxi.widget.timeline;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bcz0;
import defpackage.g8e;
import defpackage.hbp0;
import defpackage.i9z0;
import defpackage.j9z0;
import defpackage.ny61;
import defpackage.oaz0;
import defpackage.pav;
import defpackage.w511;
import defpackage.xbz0;
import defpackage.ytz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.timeline.TimelineItemView;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001Bí\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\n\u0012\b\b\u0001\u0010\u000f\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\n\u0012\b\b\u0001\u0010\u0011\u001a\u00020\n\u0012\b\b\u0001\u0010\u0012\u001a\u00020\n\u0012\b\b\u0001\u0010\u0013\u001a\u00020\n\u0012\b\b\u0001\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001e\u001a\u00020\n\u0012\b\b\u0001\u0010\u001f\u001a\u00020\n\u0012\b\b\u0001\u0010 \u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020#H\u0002¢\u0006\u0004\b*\u0010%J\u000f\u0010+\u001a\u00020#H\u0002¢\u0006\u0004\b+\u0010%J\u0017\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020,2\u0006\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010.J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\nH\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020#2\u0006\u00104\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020#2\u0006\u0010&\u001a\u00020\n2\u0006\u00107\u001a\u000201H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020#2\u0006\u0010&\u001a\u00020\n2\u0006\u00107\u001a\u000201H\u0002¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020#H\u0002¢\u0006\u0004\b;\u0010%J\u000f\u0010<\u001a\u00020#H\u0002¢\u0006\u0004\b<\u0010%J\u000f\u0010=\u001a\u00020#H\u0002¢\u0006\u0004\b=\u0010%J\u0017\u0010B\u001a\u00020#2\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\b@\u0010AJ\u0017\u0010G\u001a\u00020#2\u0006\u0010D\u001a\u00020CH\u0000¢\u0006\u0004\bE\u0010FJK\u0010J\u001a\u00020#2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\bH\u0010IJ'\u0010M\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0000¢\u0006\u0004\bK\u0010LJ\u0015\u0010Q\u001a\b\u0012\u0004\u0012\u00020,0NH\u0000¢\u0006\u0004\bO\u0010PJ\u001f\u0010T\u001a\u00020#2\u0006\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\nH\u0014¢\u0006\u0004\bT\u0010UJ7\u0010[\u001a\u00020#2\u0006\u0010V\u001a\u00020\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\nH\u0014¢\u0006\u0004\b[\u0010\\R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010]R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010^R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010_R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010`R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010`R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010`R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010`R\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010`R\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010`R\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010`R\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010`R\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010`R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010`R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010aR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010aR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010aR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010aR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010bR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010`R\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010`R\u0014\u0010 \u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010`R\"\u0010c\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010b\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR&\u0010j\u001a\u0012\u0012\u0004\u0012\u0002010hj\b\u0012\u0004\u0012\u000201`i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010lR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010mR\u0016\u0010n\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bn\u0010`R\u001a\u0010o\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010`\u001a\u0004\bp\u0010qR\u001a\u0010r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010`\u001a\u0004\bs\u0010q¨\u0006t"}, d2 = {"Lru/yandex/taxi/widget/timeline/TimelineItemViewGroup;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Loaz0;", "dataState", "Lhbp0;", "scopeDelegate", "Lru/yandex/taxi/widget/timeline/TimelineOrientation;", "orientation", "", "segmentPx", "outlinePassedWidthPx", "outlineCurrentWidthPx", "outlinePendingWidthPx", "frontPassedRadiusPx", "frontCurrentRadiusPx", "frontPendingRadiusPx", "iconPassedRadiusPx", "iconCurrentRadiusPx", "iconPendingRadiusPx", "Landroid/graphics/drawable/Drawable;", "outlinePassedBackground", "outlineCurrentBackground", "outlinePendingBackground", "frontPassedBackground", "frontCurrentBackground", "frontPendingBackground", "", "applyAnimation", "iconPassedTintColor", "iconCurrentTintColor", "iconPendingTintColor", "<init>", "(Landroid/content/Context;Loaz0;Lhbp0;Lru/yandex/taxi/widget/timeline/TimelineOrientation;IIIIIIIIIILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZIII)V", "Lzy11;", "updateStatus", "()V", "index", "Lru/yandex/taxi/widget/timeline/TimelineItemView$Status;", "getTimelineItemStatus", "(I)Lru/yandex/taxi/widget/timeline/TimelineItemView$Status;", "setData", "calculateFullLength", "Landroid/graphics/Point;", "getHorizontalPoint", "(I)Landroid/graphics/Point;", "getVerticalPoint", "position", "Lru/yandex/taxi/widget/timeline/TimelineItemView;", "getTimelineItemView", "(I)Lru/yandex/taxi/widget/timeline/TimelineItemView;", "size", "applyTimelineItemViewsCacheSize", "(I)V", "itemView", "setHorizontalLayoutPosition", "(ILru/yandex/taxi/widget/timeline/TimelineItemView;)V", "setVerticalLayoutPosition", "checkLength", "checkHorizontalLength", "checkVerticalLength", "Lpav;", "imageLoader", "setImageLoader$taxi_design", "(Lpav;)V", "setImageLoader", "Lytz;", "lottieLoader", "setLottieLoader$taxi_design", "(Lytz;)V", "setLottieLoader", "updateBackground$taxi_design", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "updateBackground", "updateIconTintColor$taxi_design", "(III)V", "updateIconTintColor", "", "getItemPoints$taxi_design", "()Ljava/util/List;", "getItemPoints", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Loaz0;", "Lhbp0;", "Lru/yandex/taxi/widget/timeline/TimelineOrientation;", CA20Status.STATUS_USER_I, "Landroid/graphics/drawable/Drawable;", "Z", "shouldAnimate", "getShouldAnimate$taxi_design", "()Z", "setShouldAnimate$taxi_design", "(Z)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "timelineItemViewCache", "Ljava/util/ArrayList;", "Lpav;", "Lytz;", "fullLengthPx", "timelineItemViewWidthPx", "getTimelineItemViewWidthPx", "()I", "timelineItemViewHeightPx", "getTimelineItemViewHeightPx", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimelineItemViewGroup extends ViewGroup {
    public static final int $stable = 8;
    private final boolean applyAnimation;
    private final oaz0 dataState;
    private final Drawable frontCurrentBackground;
    private final int frontCurrentRadiusPx;
    private final Drawable frontPassedBackground;
    private final int frontPassedRadiusPx;
    private final Drawable frontPendingBackground;
    private final int frontPendingRadiusPx;
    private int fullLengthPx;
    private final int iconCurrentRadiusPx;
    private final int iconCurrentTintColor;
    private final int iconPassedRadiusPx;
    private final int iconPassedTintColor;
    private final int iconPendingRadiusPx;
    private final int iconPendingTintColor;
    private pav imageLoader;
    private ytz lottieLoader;
    private final TimelineOrientation orientation;
    private final Drawable outlineCurrentBackground;
    private final int outlineCurrentWidthPx;
    private final Drawable outlinePassedBackground;
    private final int outlinePassedWidthPx;
    private final Drawable outlinePendingBackground;
    private final int outlinePendingWidthPx;
    private final hbp0 scopeDelegate;
    private int segmentPx;
    private boolean shouldAnimate;
    private ArrayList<TimelineItemView> timelineItemViewCache;
    private final int timelineItemViewHeightPx;
    private final int timelineItemViewWidthPx;

    public TimelineItemViewGroup(Context context, oaz0 oaz0Var, hbp0 hbp0Var, TimelineOrientation timelineOrientation, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6, boolean z, int i11, int i12, int i13) {
        super(context);
        this.dataState = oaz0Var;
        this.scopeDelegate = hbp0Var;
        this.orientation = timelineOrientation;
        this.segmentPx = i;
        this.outlinePassedWidthPx = i2;
        this.outlineCurrentWidthPx = i3;
        this.outlinePendingWidthPx = i4;
        this.frontPassedRadiusPx = i5;
        this.frontCurrentRadiusPx = i6;
        this.frontPendingRadiusPx = i7;
        this.iconPassedRadiusPx = i8;
        this.iconCurrentRadiusPx = i9;
        this.iconPendingRadiusPx = i10;
        this.outlinePassedBackground = drawable;
        this.outlineCurrentBackground = drawable2;
        this.outlinePendingBackground = drawable3;
        this.frontPassedBackground = drawable4;
        this.frontCurrentBackground = drawable5;
        this.frontPendingBackground = drawable6;
        this.applyAnimation = z;
        this.iconPassedTintColor = i11;
        this.iconCurrentTintColor = i12;
        this.iconPendingTintColor = i13;
        this.timelineItemViewCache = new ArrayList<>();
        int i14 = (i6 + i3) * 2;
        this.timelineItemViewWidthPx = i14;
        this.timelineItemViewHeightPx = i14;
        oaz0Var.c.add(new i9z0(this, 1));
        oaz0Var.d.add(new j9z0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TimelineItemViewGroup timelineItemViewGroup, List list) {
        timelineItemViewGroup.applyTimelineItemViewsCacheSize(list.size());
        timelineItemViewGroup.calculateFullLength();
        timelineItemViewGroup.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TimelineItemViewGroup timelineItemViewGroup) {
        timelineItemViewGroup.updateStatus();
        timelineItemViewGroup.setData();
    }

    private final void applyTimelineItemViewsCacheSize(int size) {
        int size2 = this.timelineItemViewCache.size();
        ArrayList<TimelineItemView> arrayList = this.timelineItemViewCache;
        if (size2 > size) {
            removeViews(size, arrayList.size() - size);
            ArrayList<TimelineItemView> arrayList2 = this.timelineItemViewCache;
            arrayList2.subList(size, arrayList2.size()).clear();
            return;
        }
        if (arrayList.size() < size) {
            int i = 0;
            for (int size3 = size - this.timelineItemViewCache.size(); i < size3; size3 = size3) {
                Context context = getContext();
                hbp0 hbp0Var = this.scopeDelegate;
                int i2 = this.timelineItemViewWidthPx;
                int i3 = this.frontPassedRadiusPx;
                int i4 = this.outlinePassedWidthPx + i3;
                int i5 = this.frontCurrentRadiusPx;
                int i6 = this.outlineCurrentWidthPx + i5;
                int i7 = this.frontPendingRadiusPx;
                TimelineItemView timelineItemView = new TimelineItemView(context, hbp0Var, i2, i4, i6, this.outlinePendingWidthPx + i7, i3, i5, i7, this.iconPassedRadiusPx, this.iconCurrentRadiusPx, this.iconPendingRadiusPx, this.outlinePassedBackground, this.outlineCurrentBackground, this.outlinePendingBackground, this.frontPassedBackground, this.frontCurrentBackground, this.frontPendingBackground, this.applyAnimation, this.iconPassedTintColor, this.iconCurrentTintColor, this.iconPendingTintColor);
                timelineItemView.setLayoutParams(new FrameLayout.LayoutParams(this.timelineItemViewWidthPx, this.timelineItemViewHeightPx));
                this.timelineItemViewCache.add(timelineItemView);
                addView(timelineItemView);
                i++;
            }
        }
    }

    private final void calculateFullLength() {
        int size = this.dataState.a.size();
        this.fullLengthPx = g8e.d(size, 1, this.segmentPx, this.frontCurrentRadiusPx * 2 * size);
    }

    private final void checkHorizontalLength() {
        int size = this.dataState.a.size();
        if (this.fullLengthPx + this.outlineCurrentWidthPx > getWidth()) {
            int width = getWidth();
            int i = this.frontCurrentRadiusPx;
            int i2 = this.outlineCurrentWidthPx;
            int i3 = size - 1;
            int i4 = ((width - ((i * 2) * size)) - (i2 * 2)) / i3;
            if ((i2 * 2) + (i3 * i4) + (i * 2 * size) > getWidth()) {
                ny61.r("TimelineView exceeds screen width");
                return;
            }
            this.segmentPx = i4;
            calculateFullLength();
            requestLayout();
        }
    }

    private final void checkLength() {
        int i = bcz0.a[this.orientation.ordinal()];
        if (i == 1) {
            checkHorizontalLength();
        } else if (i == 2) {
            checkVerticalLength();
        } else {
            w511.b();
        }
    }

    private final void checkVerticalLength() {
        int size = this.dataState.a.size();
        if (this.fullLengthPx + this.outlineCurrentWidthPx > getHeight()) {
            int height = getHeight();
            int i = this.frontCurrentRadiusPx;
            int i2 = this.outlineCurrentWidthPx;
            int i3 = size - 1;
            int i4 = ((height - ((i * 2) * size)) - (i2 * 2)) / i3;
            if ((i2 * 2) + (i3 * i4) + (i * 2 * size) > getHeight()) {
                ny61.r("TimelineView exceeds screen width");
                return;
            }
            this.segmentPx = i4;
            calculateFullLength();
            requestLayout();
        }
    }

    private final Point getHorizontalPoint(int index) {
        int width = ((this.segmentPx * index) + (((this.frontCurrentRadiusPx * 2) * index) + ((getWidth() - this.fullLengthPx) / 2))) - this.outlineCurrentWidthPx;
        int height = getHeight() / 2;
        int i = this.frontCurrentRadiusPx;
        int i2 = this.outlineCurrentWidthPx;
        return new Point(width + i2 + i, ((height - i) - i2) + i2 + i);
    }

    private final TimelineItemView.Status getTimelineItemStatus(int index) {
        int i = this.dataState.b;
        return index < i ? TimelineItemView.Status.PASSED : index == i ? TimelineItemView.Status.CURRENT : TimelineItemView.Status.PENDING;
    }

    private final TimelineItemView getTimelineItemView(int position) {
        return this.timelineItemViewCache.get(position);
    }

    private final Point getVerticalPoint(int index) {
        int height = (getHeight() - this.fullLengthPx) / 2;
        int width = getWidth() / 2;
        int i = this.frontCurrentRadiusPx;
        int i2 = this.outlineCurrentWidthPx;
        return new Point(((width - i) - i2) + i2 + i, (((this.segmentPx * index) + (((i * 2) * index) + height)) - i2) + i2 + i);
    }

    private final void setData() {
        ArrayList arrayList = this.dataState.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            getTimelineItemView(i).setData$taxi_design((xbz0) arrayList.get(i), this.imageLoader, this.lottieLoader);
        }
    }

    private final void setHorizontalLayoutPosition(int index, TimelineItemView itemView) {
        int width = ((this.segmentPx * index) + (((this.frontCurrentRadiusPx * 2) * index) + ((getWidth() - this.fullLengthPx) / 2))) - this.outlineCurrentWidthPx;
        int height = ((getHeight() / 2) - this.frontCurrentRadiusPx) - this.outlineCurrentWidthPx;
        itemView.layout(width, height, this.timelineItemViewWidthPx + width, this.timelineItemViewHeightPx + height);
    }

    private final void setVerticalLayoutPosition(int index, TimelineItemView itemView) {
        int height = (getHeight() - this.fullLengthPx) / 2;
        int width = getWidth() / 2;
        int i = this.frontCurrentRadiusPx;
        int i2 = this.outlineCurrentWidthPx;
        int i3 = (width - i) - i2;
        int i4 = ((this.segmentPx * index) + (((i * 2) * index) + height)) - i2;
        itemView.layout(i3, i4, this.timelineItemViewWidthPx + i3, this.timelineItemViewHeightPx + i4);
    }

    private final void updateStatus() {
        int size = this.dataState.a.size();
        for (int i = 0; i < size; i++) {
            getTimelineItemView(i).setStatus$taxi_design(getTimelineItemStatus(i), this.shouldAnimate);
        }
    }

    public final List<Point> getItemPoints$taxi_design() {
        int size = this.dataState.a.size();
        ArrayList arrayList = new ArrayList(this.dataState.a.size());
        for (int i = 0; i < size; i++) {
            int i2 = bcz0.a[this.orientation.ordinal()];
            if (i2 == 1) {
                arrayList.add(getHorizontalPoint(i));
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                arrayList.add(getVerticalPoint(i));
            }
        }
        return arrayList;
    }

    /* renamed from: getShouldAnimate$taxi_design, reason: from getter */
    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    public final int getTimelineItemViewHeightPx() {
        return this.timelineItemViewHeightPx;
    }

    public final int getTimelineItemViewWidthPx() {
        return this.timelineItemViewWidthPx;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        checkLength();
        int size = this.dataState.a.size();
        for (int i = 0; i < size; i++) {
            TimelineItemView timelineItemView = getTimelineItemView(i);
            int i2 = bcz0.a[this.orientation.ordinal()];
            if (i2 == 1) {
                setHorizontalLayoutPosition(i, timelineItemView);
            } else {
                if (i2 != 2) {
                    w511.b();
                    return;
                }
                setVerticalLayoutPosition(i, timelineItemView);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.timelineItemViewWidthPx, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.timelineItemViewHeightPx, 1073741824);
        Iterator<T> it = this.timelineItemViewCache.iterator();
        while (it.hasNext()) {
            ((TimelineItemView) it.next()).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setImageLoader$taxi_design(pav imageLoader) {
        this.imageLoader = imageLoader;
    }

    public final void setLottieLoader$taxi_design(ytz lottieLoader) {
        this.lottieLoader = lottieLoader;
    }

    public final void setShouldAnimate$taxi_design(boolean z) {
        this.shouldAnimate = z;
    }

    public final void updateBackground$taxi_design(Drawable outlinePassedBackground, Drawable outlineCurrentBackground, Drawable outlinePendingBackground, Drawable frontPassedBackground, Drawable frontCurrentBackground, Drawable frontPendingBackground) {
        int size = this.dataState.a.size();
        for (int i = 0; i < size; i++) {
            getTimelineItemView(i).setBackground$taxi_design(outlinePassedBackground, outlineCurrentBackground, outlinePendingBackground, frontPassedBackground, frontCurrentBackground, frontPendingBackground);
        }
        updateStatus();
    }

    public final void updateIconTintColor$taxi_design(int iconPassedTintColor, int iconCurrentTintColor, int iconPendingTintColor) {
        int size = this.dataState.a.size();
        for (int i = 0; i < size; i++) {
            getTimelineItemView(i).setIconTintColor$taxi_design(iconPassedTintColor, iconCurrentTintColor, iconPendingTintColor);
        }
    }
}
