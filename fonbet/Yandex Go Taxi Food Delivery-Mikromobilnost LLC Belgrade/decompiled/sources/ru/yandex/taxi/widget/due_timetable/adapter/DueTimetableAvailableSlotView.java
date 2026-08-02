package ru.yandex.taxi.widget.due_timetable.adapter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.eja1;
import defpackage.f1h0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.mrs0;
import defpackage.nrs0;
import defpackage.nwy0;
import defpackage.ors0;
import defpackage.prs0;
import defpackage.qje;
import defpackage.qym;
import defpackage.tje;
import defpackage.up11;
import defpackage.usg0;
import defpackage.w511;
import defpackage.wuj0;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SingleShimmeringPaint;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u0007*\u00020\u00072\b\b\u0001\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b/\u0010$J\u0015\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b4\u0010 J\u0017\u00106\u001a\u00020\f2\u0006\u00105\u001a\u00020\u000bH\u0014¢\u0006\u0004\b6\u0010\u000eJ\u000f\u00107\u001a\u00020\fH\u0014¢\u0006\u0004\b7\u0010&J\u0017\u00108\u001a\u00020\f2\u0006\u00105\u001a\u00020\u000bH\u0014¢\u0006\u0004\b8\u0010\u000eJ7\u0010>\u001a\u00020\f2\u0006\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007H\u0014¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010J\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010ER\u0014\u0010K\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010ER\u0014\u0010L\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010ER\u0014\u0010M\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010ER\u0014\u0010N\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010ER\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010S\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010QR\u0014\u0010T\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010QR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0016\u0010h\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010ER\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010kR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010lR\u0014\u0010o\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006p"}, d2 = {"Lru/yandex/taxi/widget/due_timetable/adapter/DueTimetableAvailableSlotView;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "Lzy11;", "drawBar", "(Landroid/graphics/Canvas;)V", "drawLabel", "drawErrorIcon", "", "oldValue", "newValue", "animateBarValue", "(FF)V", "", "selected", "animateBarSelection", "(Z)V", "Lprs0;", ClidProvider.STATE, "updateBarColor", "(Lprs0;)V", "animate", "updateBarSelection", "(ZZ)V", "oldState", "newState", "updateBarValue", "(Lprs0;Lprs0;)V", "applyShimmeringColors", "()V", "ratio", "withAlpha", "(IF)I", "icon", "colorAttr", "Landroid/graphics/drawable/Drawable;", "tintedDrawable", "(II)Landroid/graphics/drawable/Drawable;", "setBarState", "", "barLabel", "setBarLabel", "(Ljava/lang/String;)V", "setBarSelected", "canvas", "onDraw", "onDetachedFromWindow", "dispatchDraw", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "defaultBarHeightFraction", "F", "loadingBarHeightFactor", "selectedErrorIconDrawable", "Landroid/graphics/drawable/Drawable;", "unselectedErrorIconDrawable", "barBottomOffset", "errorIconBottomOffset", "errorBarHeight", "barCornerRadius", "errorIconSize", "Landroid/graphics/Paint;", "selectedBarPaint", "Landroid/graphics/Paint;", "unselectedBarPaint", "animatingBarPaint", "labelPaint", "Lru/yandex/taxi/widget/SingleShimmeringPaint;", "shimmeringPaint", "Lru/yandex/taxi/widget/SingleShimmeringPaint;", "", "barCorners", "[F", "Landroid/graphics/Path;", "barPath", "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "barRect", "Landroid/graphics/RectF;", "Landroid/graphics/Rect;", "labelBoundsRect", "Landroid/graphics/Rect;", "Landroid/animation/ValueAnimator;", "barSelectionAnimator", "Landroid/animation/ValueAnimator;", "barValueAnimator", "barState", "Lprs0;", "barValue", "Ljava/lang/String;", "Z", "getMaxBarHeight", "()F", "maxBarHeight", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DueTimetableAvailableSlotView extends View implements nwy0 {
    public static final int $stable = 8;
    private final Paint animatingBarPaint;
    private final float barBottomOffset;
    private final float barCornerRadius;
    private final float[] barCorners;
    private String barLabel;
    private final Path barPath;
    private final RectF barRect;
    private ValueAnimator barSelectionAnimator;
    private prs0 barState;
    private float barValue;
    private ValueAnimator barValueAnimator;
    private final float defaultBarHeightFraction;
    private final float errorBarHeight;
    private final float errorIconBottomOffset;
    private final float errorIconSize;
    private final Rect labelBoundsRect;
    private final Paint labelPaint;
    private final float loadingBarHeightFactor;
    private boolean selected;
    private final Paint selectedBarPaint;
    private final Drawable selectedErrorIconDrawable;
    private final SingleShimmeringPaint shimmeringPaint;
    private final Paint unselectedBarPaint;
    private final Drawable unselectedErrorIconDrawable;

    public DueTimetableAvailableSlotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        int i2 = usg0.default_bar_height_fraction;
        ThreadLocal threadLocal = wuj0.a;
        float f = resources.getFloat(i2);
        this.defaultBarHeightFraction = f;
        this.loadingBarHeightFactor = f;
        this.selectedErrorIconDrawable = tintedDrawable(f1h0.ic_question, xng0.bgMain);
        this.unselectedErrorIconDrawable = tintedDrawable(f1h0.ic_question, xng0.textMinor);
        this.barBottomOffset = tje.x(context, 32.0f);
        this.errorIconBottomOffset = tje.x(context, 14.0f);
        this.errorBarHeight = tje.x(context, 48.0f);
        float x = tje.x(context, 8.0f);
        this.barCornerRadius = x;
        this.errorIconSize = tje.x(context, 20.0f);
        this.selectedBarPaint = new Paint(1);
        this.unselectedBarPaint = new Paint(1);
        this.animatingBarPaint = new Paint(1);
        Paint paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(tje.r(mrg0.component_text_size_caption, getContext()));
        int[] iArr = up11.a;
        paint.setTypeface(eja1.w(3, 0));
        this.labelPaint = paint;
        SingleShimmeringPaint singleShimmeringPaint = new SingleShimmeringPaint(context);
        singleShimmeringPaint.setCenterOffset(0.5f);
        singleShimmeringPaint.setGradientWidth((int) tje.x(getContext(), 48.0f));
        singleShimmeringPaint.setDuration(1000L);
        this.shimmeringPaint = singleShimmeringPaint;
        this.barCorners = new float[]{x, x, x, x, 0.0f, 0.0f, 0.0f, 0.0f};
        this.barPath = new Path();
        this.barRect = new RectF();
        this.labelBoundsRect = new Rect();
        this.barState = ors0.a;
        this.barLabel = "";
        applyShimmeringColors();
    }

    private final void animateBarSelection(boolean selected) {
        this.animatingBarPaint.setColor(this.selectedBarPaint.getColor());
        float alpha = this.selectedBarPaint.getAlpha();
        float f = selected ? 0.0f : alpha;
        if (!selected) {
            alpha = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, alpha);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(0L);
        ofFloat.addUpdateListener(new qym(this, 1));
        ofFloat.start();
        this.barSelectionAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBarSelection$lambda$0$0(DueTimetableAvailableSlotView dueTimetableAvailableSlotView, ValueAnimator valueAnimator) {
        dueTimetableAvailableSlotView.animatingBarPaint.setAlpha((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
        dueTimetableAvailableSlotView.invalidate();
    }

    private final void animateBarValue(float oldValue, float newValue) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(oldValue, newValue);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(0L);
        ofFloat.addUpdateListener(new qym(this, 0));
        ofFloat.start();
        this.barValueAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBarValue$lambda$0$0(DueTimetableAvailableSlotView dueTimetableAvailableSlotView, ValueAnimator valueAnimator) {
        dueTimetableAvailableSlotView.barValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dueTimetableAvailableSlotView.invalidate();
    }

    private final void applyShimmeringColors() {
        this.shimmeringPaint.setColors(qje.t(xng0.shimmeringCenterColor, getContext()), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void drawBar(Canvas canvas) {
        float f;
        float maxBarHeight;
        float f2;
        ValueAnimator valueAnimator;
        prs0 prs0Var = this.barState;
        if (prs0Var instanceof ors0) {
            f = this.loadingBarHeightFactor;
            maxBarHeight = getMaxBarHeight();
        } else {
            if (prs0Var instanceof mrs0) {
                f2 = this.errorBarHeight;
                this.barRect.set(getPaddingStart(), getMaxBarHeight() - f2, canvas.getWidth() - getPaddingEnd(), getMaxBarHeight());
                this.barPath.reset();
                this.barPath.addRoundRect(this.barRect, this.barCorners, Path.Direction.CW);
                canvas.drawPath(this.barPath, this.unselectedBarPaint);
                valueAnimator = this.barSelectionAnimator;
                if (valueAnimator == null && valueAnimator.isRunning()) {
                    canvas.drawPath(this.barPath, this.animatingBarPaint);
                } else if (this.selected) {
                    canvas.drawPath(this.barPath, this.selectedBarPaint);
                }
                if (this.barState instanceof ors0) {
                    return;
                }
                canvas.drawPath(this.barPath, this.shimmeringPaint);
                return;
            }
            if (!(prs0Var instanceof nrs0)) {
                w511.b();
                return;
            } else {
                f = this.barValue;
                maxBarHeight = getMaxBarHeight();
            }
        }
        f2 = f * maxBarHeight;
        this.barRect.set(getPaddingStart(), getMaxBarHeight() - f2, canvas.getWidth() - getPaddingEnd(), getMaxBarHeight());
        this.barPath.reset();
        this.barPath.addRoundRect(this.barRect, this.barCorners, Path.Direction.CW);
        canvas.drawPath(this.barPath, this.unselectedBarPaint);
        valueAnimator = this.barSelectionAnimator;
        if (valueAnimator == null) {
        }
        if (this.selected) {
        }
        if (this.barState instanceof ors0) {
        }
    }

    private final void drawErrorIcon(Canvas canvas) {
        Drawable drawable = this.selected ? this.selectedErrorIconDrawable : this.unselectedErrorIconDrawable;
        if (drawable != null) {
            drawable.setBounds((int) ((canvas.getWidth() / 2) - (this.errorIconSize / 2.0f)), (int) ((getMaxBarHeight() - this.errorIconBottomOffset) - this.errorIconSize), (int) ((this.errorIconSize / 2.0f) + (canvas.getWidth() / 2)), (int) (getMaxBarHeight() - this.errorIconBottomOffset));
            drawable.draw(canvas);
        }
    }

    private final void drawLabel(Canvas canvas) {
        Paint paint = this.labelPaint;
        String str = this.barLabel;
        paint.getTextBounds(str, 0, str.length(), this.labelBoundsRect);
        canvas.drawText(this.barLabel, (canvas.getWidth() / 2.0f) - this.labelBoundsRect.left, (canvas.getHeight() - (this.barBottomOffset / 2.0f)) + (((this.labelPaint.descent() - this.labelPaint.ascent()) / 2.0f) - this.labelPaint.descent()), this.labelPaint);
    }

    private final float getMaxBarHeight() {
        return getHeight() - this.barBottomOffset;
    }

    private final Drawable tintedDrawable(int icon, int colorAttr) {
        Drawable c0 = tje.c0(icon, getContext());
        if (c0 == null) {
            return null;
        }
        c0.setTint(qje.t(colorAttr, getContext()));
        return c0;
    }

    private final void updateBarColor(prs0 state) {
        if (state instanceof ors0) {
            this.selectedBarPaint.setColor(withAlpha(qje.t(xng0.bgInvert, getContext()), 0.6f));
            this.unselectedBarPaint.setColor(qje.t(xng0.controlMinor, getContext()));
            return;
        }
        if (!(state instanceof nrs0)) {
            if (!(state instanceof mrs0)) {
                w511.b();
                return;
            } else {
                this.selectedBarPaint.setColor(withAlpha(qje.t(xng0.bgInvert, getContext()), 0.6f));
                this.unselectedBarPaint.setColor(qje.t(xng0.controlMinor, getContext()));
                return;
            }
        }
        nrs0 nrs0Var = (nrs0) state;
        if (nrs0Var.c) {
            this.selectedBarPaint.setColor(getContext().getColor(mqg0.component_orange_normal));
            this.unselectedBarPaint.setColor(withAlpha(getContext().getColor(mqg0.component_orange_normal), 0.2f));
            return;
        }
        boolean z = nrs0Var.b;
        Paint paint = this.selectedBarPaint;
        if (!z) {
            paint.setColor(qje.t(xng0.controlMain, getContext()));
            this.unselectedBarPaint.setColor(qje.t(xng0.controlMinor, getContext()));
            return;
        }
        paint.setColor(getContext().getColor(mqg0.component_green_normal));
        this.unselectedBarPaint.setColor(withAlpha(getContext().getColor(mqg0.component_green_normal), 0.2f));
    }

    private final void updateBarSelection(boolean selected, boolean animate) {
        this.labelPaint.setColor(selected ? qje.t(xng0.textMain, getContext()) : qje.t(xng0.textMinor, getContext()));
        ValueAnimator valueAnimator = this.barSelectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (animate) {
            animateBarSelection(selected);
        }
    }

    private final void updateBarValue(prs0 oldState, prs0 newState) {
        ValueAnimator valueAnimator = this.barValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z = newState instanceof nrs0;
        if (z && (oldState instanceof ors0)) {
            animateBarValue(this.loadingBarHeightFactor, ((nrs0) newState).a);
            return;
        }
        if (z && (oldState instanceof nrs0)) {
            animateBarValue(((nrs0) oldState).a, ((nrs0) newState).a);
        } else if (z) {
            this.barValue = ((nrs0) newState).a;
        } else {
            this.barValue = 0.0f;
        }
    }

    private final int withAlpha(int i, float f) {
        return Color.argb((int) (Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyShimmeringColors();
        updateBarSelection(this.selected, false);
        updateBarColor(this.barState);
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.barState instanceof ors0) {
            this.shimmeringPaint.updateShimmering();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.barSelectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.barValueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBar(canvas);
        drawLabel(canvas);
        if (this.barState instanceof mrs0) {
            drawErrorIcon(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.barState instanceof ors0) {
            this.shimmeringPaint.updateOffset(this);
        }
    }

    public final void setBarLabel(String barLabel) {
        this.barLabel = barLabel;
        invalidate();
    }

    public final void setBarSelected(boolean selected, boolean animate) {
        this.selected = selected;
        setSelected(selected);
        updateBarSelection(selected, animate);
        invalidate();
    }

    public final void setBarState(prs0 oldState, prs0 newState) {
        this.barState = newState;
        updateBarColor(newState);
        updateBarValue(oldState, newState);
        invalidate();
    }

    public DueTimetableAvailableSlotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DueTimetableAvailableSlotView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DueTimetableAvailableSlotView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
