package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import app.cash.arcade.values.Color;
import app.cash.arcade.values.TimelineItemIcon;
import app.cash.mooncake.values.MooncakeTimelineItemIcons;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.timeline.views.TimelineDrawing;
import com.squareup.util.android.Views;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TimelineBinding extends LinearLayout implements Widget {
    public final ColorPalette colorPalette;
    public final UnleashContext content;
    public Modifier modifier;
    public final ThemeInfo themeInfo;
    public final TimelineDrawing timelineDrawing;
    public final int timelineIndent;
    public final int timelineMargin;
    public final TimelineBinding value;
    public final int verticalMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineBinding(Context context) {
        super(context);
        context.getClass();
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.value = this;
        this.content = new UnleashContext(this);
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        this.themeInfo = themeInfo;
        ColorPalette colorPalette = themeInfo.colorPalette;
        this.colorPalette = colorPalette;
        int dip = Views.dip((View) this, 12);
        this.timelineIndent = dip;
        this.timelineMargin = Views.dip((View) this, 36);
        this.verticalMargin = Views.dip((View) this, 16);
        TimelineDrawing timelineDrawing = new TimelineDrawing(context, colorPalette);
        timelineDrawing.centerX = dip + timelineDrawing.circleRadius;
        this.timelineDrawing = timelineDrawing;
        setOrientation(1);
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        LinearLayout.LayoutParams generateDefaultLayoutParams = super.generateDefaultLayoutParams();
        int i = this.timelineMargin;
        int i2 = this.timelineIndent;
        generateDefaultLayoutParams.setMarginStart(i + i2);
        generateDefaultLayoutParams.setMarginEnd(i2);
        int i3 = this.verticalMargin;
        generateDefaultLayoutParams.topMargin = i3;
        generateDefaultLayoutParams.bottomMargin = i3;
        return generateDefaultLayoutParams;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        this.timelineDrawing.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d A[SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Color color;
        Integer num;
        Integer valueOf;
        int i5;
        int i6;
        Color color2;
        super.onLayout(z, i, i2, i3, i4);
        ArrayList arrayList = new ArrayList();
        UnleashContext unleashContext = this.content;
        ArrayList arrayList2 = (ArrayList) unleashContext.properties;
        ArrayList arrayList3 = (ArrayList) unleashContext.properties;
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            TimelineDrawing timelineDrawing = this.timelineDrawing;
            if (i7 >= size) {
                timelineDrawing.getClass();
                timelineDrawing.elements = arrayList;
                return;
            }
            Widget widget = (Widget) arrayList3.get(i7);
            Color color3 = null;
            TimelineItemBinding timelineItemBinding = widget instanceof TimelineItemBinding ? (TimelineItemBinding) widget : null;
            if (timelineItemBinding != null) {
                TimelineItemIcon timelineItemIcon = timelineItemBinding.icon;
                if (timelineItemIcon == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("icon");
                    throw null;
                }
                if (timelineItemIcon.equals(MooncakeTimelineItemIcons.arrowLeft)) {
                    drawable2 = timelineDrawing.refundDrawable;
                } else if (timelineItemIcon.equals(MooncakeTimelineItemIcons.arrowLeftWithCurl)) {
                    drawable2 = timelineDrawing.refundAltDrawable;
                } else if (timelineItemIcon.equals(MooncakeTimelineItemIcons.checkmark)) {
                    drawable2 = timelineDrawing.completeDrawable;
                } else if (timelineItemIcon.equals(MooncakeTimelineItemIcons.chevronsRight)) {
                    drawable2 = timelineDrawing.skippedDrawable;
                } else if (timelineItemIcon.equals(MooncakeTimelineItemIcons.clock)) {
                    drawable2 = timelineDrawing.pendingDrawable;
                } else if (timelineItemIcon.equals(MooncakeTimelineItemIcons.dash)) {
                    drawable2 = timelineDrawing.canceledDrawable;
                } else if (timelineItemIcon.equals(MooncakeTimelineItemIcons.x)) {
                    drawable2 = timelineDrawing.missedDrawable;
                } else {
                    drawable = null;
                    color = timelineItemBinding.color;
                    if (color != null) {
                        Intrinsics.throwUninitializedPropertyAccessException("color");
                        throw null;
                    }
                    int colorInt$default = ColorsKt.toColorInt$default(color, this.themeInfo);
                    TimelineItemIcon timelineItemIcon2 = timelineItemBinding.icon;
                    if (timelineItemIcon2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("icon");
                        throw null;
                    }
                    boolean z2 = timelineItemIcon2.equals(MooncakeTimelineItemIcons.checkmark) || timelineItemIcon2.equals(MooncakeTimelineItemIcons.clock) || timelineItemIcon2.equals(MooncakeTimelineItemIcons.none) || timelineItemIcon2.equals(MooncakeTimelineItemIcons.tinted) || timelineItemIcon2.equals(MooncakeTimelineItemIcons.x);
                    Integer valueOf2 = z2 ? Integer.valueOf(colorInt$default) : null;
                    TimelineItemIcon timelineItemIcon3 = timelineItemBinding.icon;
                    if (timelineItemIcon3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("icon");
                        throw null;
                    }
                    if (timelineItemIcon3.equals(MooncakeTimelineItemIcons.tinted)) {
                        valueOf = Integer.valueOf(ColorUtils.setAlphaComponent(colorInt$default, 31));
                    } else if (timelineItemIcon3.equals(MooncakeTimelineItemIcons.none) || timelineItemIcon3.equals(MooncakeTimelineItemIcons.clock)) {
                        num = null;
                        int i8 = this.colorPalette.outline;
                        if (z2 && (i6 = i7 + 1) < arrayList3.size()) {
                            Object obj = arrayList3.get(i6);
                            TimelineItemBinding timelineItemBinding2 = !(obj instanceof TimelineItemBinding) ? (TimelineItemBinding) obj : null;
                            color2 = timelineItemBinding.color;
                            if (color2 != null) {
                                Intrinsics.throwUninitializedPropertyAccessException("color");
                                throw null;
                            }
                            if (timelineItemBinding2 != null) {
                                Color color4 = timelineItemBinding2.color;
                                if (color4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("color");
                                    throw null;
                                }
                                color3 = color4;
                            }
                            if (color2.equals(color3)) {
                                i5 = colorInt$default;
                                TimelineItemBinding timelineItemBinding3 = ((TimelineItemBinding) widget).value;
                                arrayList.add(new TimelineDrawing.Element((timelineItemBinding3.getMeasuredHeight() / 2.0f) + timelineItemBinding3.getTop(), i5, num, valueOf2, drawable));
                            }
                        }
                        i5 = i8;
                        TimelineItemBinding timelineItemBinding32 = ((TimelineItemBinding) widget).value;
                        arrayList.add(new TimelineDrawing.Element((timelineItemBinding32.getMeasuredHeight() / 2.0f) + timelineItemBinding32.getTop(), i5, num, valueOf2, drawable));
                    } else {
                        valueOf = Integer.valueOf(colorInt$default);
                    }
                    num = valueOf;
                    int i82 = this.colorPalette.outline;
                    if (z2) {
                        Object obj2 = arrayList3.get(i6);
                        if (!(obj2 instanceof TimelineItemBinding)) {
                        }
                        color2 = timelineItemBinding.color;
                        if (color2 != null) {
                        }
                    }
                    i5 = i82;
                    TimelineItemBinding timelineItemBinding322 = ((TimelineItemBinding) widget).value;
                    arrayList.add(new TimelineDrawing.Element((timelineItemBinding322.getMeasuredHeight() / 2.0f) + timelineItemBinding322.getTop(), i5, num, valueOf2, drawable));
                }
                drawable = drawable2;
                color = timelineItemBinding.color;
                if (color != null) {
                }
            }
            i7++;
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
