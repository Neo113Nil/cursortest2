package com.squareup.cash.blockers.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoCapture;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.mooncake.components.WeightedLeftInBlockers;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.util.android.Views;
import com.squareup.util.android.layout.Anchor;
import com.squareup.util.android.layout.LayoutHelpersKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes4.dex */
public class BlockerLayout extends ViewGroup {
    public static final /* synthetic */ int $r8$clinit = 0;
    public AppCompatImageButton closeButton;
    public final DividerLinearLayout contentLayout;
    public final int contentTextRightInset;
    public final int defaultSidePadding;
    public final ArrayList displayList;
    public final LinearLayout footerLayout;
    public final PausedCompositionImpl loadingHelper;
    public final ScrollView scrollView;
    public final PaddingSpec topPadding;

    public final class BlockerLayoutParams extends ViewGroup.LayoutParams {
        public final int sidePadding;

        public BlockerLayoutParams(int i) {
            super(-1, -2);
            this.sidePadding = i;
        }
    }

    public static final class DividerLinearLayout extends LinearLayout {
        public final Paint dividerPaint;
        public Function2 drawDividerIf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DividerLinearLayout(Context context) {
            super(context);
            context.getClass();
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-2500135);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(Views.dip((View) this, 1.0f));
            this.dividerPaint = paint;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            Function2 function2;
            canvas.getClass();
            super.onDraw(canvas);
            if (this.drawDividerIf == null) {
                return;
            }
            float left = getLeft();
            float right = getRight();
            int top = getTop();
            int childCount = getChildCount();
            View view = null;
            int i = 0;
            while (i < childCount) {
                View childAt = getChildAt(i);
                if (view == null || (function2 = this.drawDividerIf) == null || !((Boolean) function2.invoke(view, childAt)).booleanValue()) {
                    canvas2 = canvas;
                } else {
                    float top2 = top + ((childAt.getTop() - r1) / 2.0f) + view.getBottom();
                    canvas2 = canvas;
                    canvas2.drawLine(left, top2, right, top2, this.dividerPaint);
                }
                i++;
                canvas = canvas2;
                view = childAt;
            }
        }

        public final void setDrawDividerIf$views(Function2<? super View, ? super View, Boolean> function2) {
            this.drawDividerIf = function2;
            setWillNotDraw(function2 == null);
            invalidate();
        }
    }

    public abstract class Element {

        public final class Field extends Element {
            public final View view;

            public Field(View view) {
                this.view = view;
            }
        }

        public final class Spacer extends Element {
        }
    }

    public final class PaddingSpec {
        public final int min;
        public final int preferred;

        public PaddingSpec(int i, int i2) {
            this.preferred = i;
            this.min = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaddingSpec)) {
                return false;
            }
            PaddingSpec paddingSpec = (PaddingSpec) obj;
            return this.preferred == paddingSpec.preferred && this.min == paddingSpec.min;
        }

        public final int hashCode() {
            return Integer.hashCode(this.min) + (Integer.hashCode(this.preferred) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.preferred, this.min, "PaddingSpec(preferred=", ", min=", ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockerLayout(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        InsetsCollector attachedTo = WindowCompat$Api35Impl.attachedTo(this);
        this.topPadding = new PaddingSpec(Views.dip((View) this, 64), 0);
        this.defaultSidePadding = Views.dip((View) this, 32);
        int dip = Views.dip((View) this, 24);
        this.contentTextRightInset = Views.dip((View) this, 16);
        DividerLinearLayout dividerLinearLayout = new DividerLinearLayout(context);
        dividerLinearLayout.setOrientation(1);
        this.contentLayout = dividerLinearLayout;
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(dividerLinearLayout);
        this.scrollView = scrollView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new BlockerLayoutParams(dip));
        this.footerLayout = linearLayout;
        this.loadingHelper = new PausedCompositionImpl(this, CollectionsKt__CollectionsJVMKt.listOf(linearLayout), null, new BadgeQueries$$ExternalSyntheticLambda5(this, 28), 26);
        this.displayList = new ArrayList();
        attachedTo.setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        setBackgroundColor(colorPalette.background);
        addView(scrollView);
        addView(linearLayout);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ArrayList arrayList = this.displayList;
        arrayList.clear();
        LinearLayout linearLayout = this.footerLayout;
        Iterator it = new ViewGroupKt$children$1(linearLayout).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                break;
            }
            if (((View) viewGroupKt$iterator$1.next()).getVisibility() == 0) {
                arrayList.add(new PaddingSpec(Views.dip((View) this, 24), Views.dip((View) this, 5)));
                arrayList.add(linearLayout);
                break;
            }
        }
        arrayList.add(new PaddingSpec(Views.dip((View) this, 20), Views.dip((View) this, 5)));
        ScrollView scrollView = this.scrollView;
        arrayList.add(scrollView);
        PaddingSpec paddingSpec = this.topPadding;
        arrayList.add(paddingSpec);
        Iterator it2 = arrayList.iterator();
        int i7 = 0;
        while (true) {
            boolean hasNext = it2.hasNext();
            i5 = this.defaultSidePadding;
            if (!hasNext) {
                break;
            }
            Object next = it2.next();
            if (next instanceof View) {
                int width = getWidth();
                View view = (View) next;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                BlockerLayoutParams blockerLayoutParams = layoutParams instanceof BlockerLayoutParams ? (BlockerLayoutParams) layoutParams : null;
                if (blockerLayoutParams != null) {
                    i5 = blockerLayoutParams.sidePadding;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(width - (i5 * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 0));
                i6 = view.getMeasuredHeight();
            } else {
                i6 = 0;
            }
            i7 += i6;
        }
        Iterator it3 = arrayList.iterator();
        int i8 = 0;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            i8 += next2 instanceof PaddingSpec ? ((PaddingSpec) next2).preferred : 0;
        }
        int coerceIn = RangesKt___RangesKt.coerceIn(((getHeight() - i7) - getPaddingBottom()) - getPaddingTop(), 0, i8);
        int height = getHeight() - getPaddingBottom();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            if (next3 instanceof PaddingSpec) {
                float f = coerceIn * (r11.preferred / i8);
                float f2 = ((PaddingSpec) next3).min;
                if (f < f2) {
                    f = f2;
                }
                height -= (int) f;
            } else {
                if (!(next3 instanceof View)) {
                    a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m((Class) next3.getClass(), "Invalid element type "));
                    return;
                }
                View view2 = (View) next3;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                BlockerLayoutParams blockerLayoutParams2 = layoutParams2 instanceof BlockerLayoutParams ? (BlockerLayoutParams) layoutParams2 : null;
                int i9 = blockerLayoutParams2 != null ? blockerLayoutParams2.sidePadding : i5;
                int width2 = getWidth() - (i9 * 2);
                if (next3 == scrollView) {
                    float f3 = coerceIn * (paddingSpec.preferred / i8);
                    float f4 = paddingSpec.min;
                    if (f3 < f4) {
                        f3 = f4;
                    }
                    ((ScrollView) next3).measure(View.MeasureSpec.makeMeasureSpec(width2, 1073741824), View.MeasureSpec.makeMeasureSpec((height - getPaddingTop()) - ((int) f3), 1073741824));
                    LayoutHelpersKt.layoutBy(view2, Anchor.BottomLeft, i9, height);
                } else {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(width2, 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 0));
                    LayoutHelpersKt.layoutBy(view2, Anchor.BottomLeft, i9, height);
                }
                height -= view2.getHeight();
            }
        }
        AppCompatImageButton appCompatImageButton = this.closeButton;
        if (appCompatImageButton != null) {
            appCompatImageButton.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 0), View.MeasureSpec.makeMeasureSpec(getHeight(), 0));
            Anchor anchor = Anchor.TopLeft;
            int top = (scrollView.getTop() / 2) - (appCompatImageButton.getMeasuredHeight() / 2);
            int paddingTop = getPaddingTop();
            if (top < paddingTop) {
                top = paddingTop;
            }
            LayoutHelpersKt.layoutBy(appCompatImageButton, anchor, 0, top);
        }
    }

    public final void setFooterContent(Element... elementArr) {
        verticallyLayoutInto(this.footerLayout, (Element[]) Arrays.copyOf(elementArr, elementArr.length));
    }

    public void setLoading(boolean z) {
        this.loadingHelper.setLoading(z);
    }

    public final void verticallyLayoutInto(LinearLayout linearLayout, Element... elementArr) {
        linearLayout.removeAllViews();
        View view = null;
        for (Element element : elementArr) {
            if (element instanceof Element.Field) {
                view = ((Element.Field) element).view;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams == null ? new ViewGroup.MarginLayoutParams(-1, -2) : layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
                if (element instanceof WeightedLeftInBlockers) {
                    marginLayoutParams.rightMargin = this.contentTextRightInset;
                }
                view.setLayoutParams(marginLayoutParams);
                linearLayout.addView(view);
            } else if (!(element instanceof Element.Spacer)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            } else if (view == null) {
                linearLayout.setPadding(linearLayout.getPaddingLeft(), Views.dip((View) this, 16), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            } else {
                Views.updateMargins$default(view, 0, 0, 0, Views.dip((View) this, 16), 7);
            }
        }
    }
}
