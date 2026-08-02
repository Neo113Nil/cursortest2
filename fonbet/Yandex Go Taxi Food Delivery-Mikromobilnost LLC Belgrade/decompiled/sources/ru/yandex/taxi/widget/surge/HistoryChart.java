package ru.yandex.taxi.widget.surge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.bdc;
import defpackage.evu0;
import defpackage.kdc;
import defpackage.mrg0;
import defpackage.qje;
import defpackage.qlu;
import defpackage.rlu;
import defpackage.s8o;
import defpackage.slu;
import defpackage.tje;
import defpackage.tlu;
import defpackage.wza;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y6i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.surge.a;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001DB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010-\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010.R\u0016\u0010A\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/yandex/taxi/widget/surge/HistoryChart;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.X, RemoteBioParameters.Y, "radius", "Lkdc;", "color", "Lzy11;", "drawCurrentValue", "(Landroid/graphics/Canvas;FFFLkdc;)V", "fromY", "toY", "drawDashedVerticalLine", "(Landroid/graphics/Canvas;FFF)V", "stepX", "moveBubble", "Lru/yandex/taxi/design/bubble/decorator/DefaultBubbleDecorator$Position;", "rtlMirrored", "(Lru/yandex/taxi/design/bubble/decorator/DefaultBubbleDecorator$Position;)Lru/yandex/taxi/design/bubble/decorator/DefaultBubbleDecorator$Position;", "Lru/yandex/taxi/widget/surge/a$a;", "accessibility", "updateAccessibility", "(Lru/yandex/taxi/widget/surge/a$a;)V", "Lru/yandex/taxi/widget/surge/a;", "newState", "update", "(Lru/yandex/taxi/widget/surge/a;)V", "onDraw", "(Landroid/graphics/Canvas;)V", "barColor", CA20Status.STATUS_USER_I, "labelColor", "shadowColor", "defaultCircleColor", "barRadius", "F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Rect;", "textBounds", "Landroid/graphics/Rect;", "labelPadding", "Landroid/graphics/DashPathEffect;", "lineDashEffect", "Landroid/graphics/DashPathEffect;", "Lwza;", "bubbleDecorator", "Lwza;", "Lru/yandex/taxi/design/bubble/BubbleTextComponent;", "bubble", "Lru/yandex/taxi/design/bubble/BubbleTextComponent;", "minBubbleHeight", ClidProvider.STATE, "Lru/yandex/taxi/widget/surge/a;", "Companion", "qlu", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HistoryChart extends FrameLayout {
    public static final int $stable = 8;

    @Deprecated
    public static final int BAR_INTERSECTION_PX = 5;

    @Deprecated
    public static final float BAR_MAX_VALUE = 1.0f;

    @Deprecated
    public static final float BAR_MIN_VALUE = 0.0f;
    private static final qlu Companion = new qlu();

    @Deprecated
    public static final float DASH_LINE_STROKE_WIDTH = 3.0f;

    @Deprecated
    public static final float VALUE_CIRCLES_INNER_RATIO = 0.7f;

    @Deprecated
    public static final float VALUE_CIRCLES_RATIO = 0.8f;
    private final int barColor;
    private final float barRadius;
    private final BubbleTextComponent bubble;
    private final wza bubbleDecorator;
    private final int defaultCircleColor;
    private final int labelColor;
    private final float labelPadding;
    private final DashPathEffect lineDashEffect;
    private final float minBubbleHeight;
    private final Paint paint;
    private final int shadowColor;
    private a state;
    private final Rect textBounds;
    private final Paint textPaint;

    public HistoryChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.barColor = qje.t(xng0.controlMinor, getContext());
        int t = qje.t(xng0.textMinor, getContext());
        this.labelColor = t;
        this.shadowColor = qje.t(xng0.effectShadowBottom, getContext());
        this.defaultCircleColor = qje.t(xng0.bgInvert, getContext());
        this.barRadius = tje.w(2, getContext());
        this.paint = new Paint();
        Paint paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(tje.r(mrg0.component_text_size_bubble, getContext()));
        paint.setColor(t);
        this.textPaint = paint;
        this.textBounds = new Rect();
        this.labelPadding = tje.w(6, getContext());
        this.lineDashEffect = new DashPathEffect(new float[]{tje.w(1, getContext()), tje.w(1, getContext())}, 0.0f);
        wza wzaVar = new wza(context);
        this.bubbleDecorator = wzaVar;
        BubbleTextComponent bubbleTextComponent = new BubbleTextComponent(context, null, 0, 6, null);
        bubbleTextComponent.setTextSize(bubbleTextComponent.getResources().getDimensionPixelSize(mrg0.component_text_size_bubble));
        bubbleTextComponent.setTextColor(new bdc(xng0.everBack));
        xw31.G(tje.r(mrg0.go_design_s_space, bubbleTextComponent.getContext()), bubbleTextComponent);
        bubbleTextComponent.showCloseIcon(false);
        bubbleTextComponent.setDecorator(wzaVar);
        this.bubble = bubbleTextComponent;
        this.minBubbleHeight = tje.w(50, getContext());
        this.state = new a(0);
        bubbleTextComponent.setVisibility(8);
        addView(bubbleTextComponent, -2, -2);
        setWillNotDraw(false);
        setClipChildren(false);
        setClickable(false);
        setImportantForAccessibility(1);
    }

    private final void drawCurrentValue(Canvas canvas, float x, float y, float radius, kdc color) {
        this.paint.setShadowLayer(radius, 0.0f, 0.0f, this.shadowColor);
        this.paint.setColor(qje.t(xng0.bgMain, getContext()));
        canvas.drawCircle(x, y, radius, this.paint);
        this.paint.clearShadowLayer();
        this.paint.setColor(color != null ? s8o.m(color, getContext()) : this.defaultCircleColor);
        canvas.drawCircle(x, y, radius * 0.7f, this.paint);
    }

    private final void drawDashedVerticalLine(Canvas canvas, float x, float fromY, float toY) {
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(3.0f);
        this.paint.setPathEffect(this.lineDashEffect);
        this.paint.setStrokeWidth(tje.w(1, getContext()));
        this.paint.setColor(this.labelColor);
        canvas.drawLine(x, fromY, x, toY, this.paint);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setPathEffect(null);
    }

    private final void moveBubble(Canvas canvas, float x, float y, float stepX) {
        float width;
        DefaultBubbleDecorator$Position defaultBubbleDecorator$Position = x - ((float) this.bubble.getWidth()) < 0.0f ? DefaultBubbleDecorator$Position.OFFSET_START : ((float) this.bubble.getWidth()) + x > ((float) canvas.getWidth()) ? DefaultBubbleDecorator$Position.OFFSET_END : DefaultBubbleDecorator$Position.CENTER;
        if (x - this.bubble.getWidth() < 0.0f) {
            width = x - (stepX / 2.0f);
        } else {
            float width2 = this.bubble.getWidth() + x;
            float width3 = canvas.getWidth();
            BubbleTextComponent bubbleTextComponent = this.bubble;
            width = width2 > width3 ? (x - bubbleTextComponent.getWidth()) + (stepX / 2.0f) : x - (bubbleTextComponent.getWidth() / 2);
        }
        this.bubbleDecorator.p(rtlMirrored(defaultBubbleDecorator$Position), 0.0f);
        this.bubble.setX(width);
        this.bubble.setY(y);
        BubbleTextComponent bubbleTextComponent2 = this.bubble;
        bubbleTextComponent2.setVisibility(!evu0.J(bubbleTextComponent2.getText()) ? 0 : 8);
    }

    private final DefaultBubbleDecorator$Position rtlMirrored(DefaultBubbleDecorator$Position defaultBubbleDecorator$Position) {
        if (!xw31.k(getContext())) {
            DefaultBubbleDecorator$Position defaultBubbleDecorator$Position2 = DefaultBubbleDecorator$Position.OFFSET_START;
            if (defaultBubbleDecorator$Position == defaultBubbleDecorator$Position2) {
                return DefaultBubbleDecorator$Position.OFFSET_END;
            }
            if (defaultBubbleDecorator$Position == DefaultBubbleDecorator$Position.OFFSET_END) {
                return defaultBubbleDecorator$Position2;
            }
        }
        return defaultBubbleDecorator$Position;
    }

    private final void updateAccessibility(a.C0123a accessibility) {
        setContentDescription(accessibility.a);
        boolean z = !evu0.J(accessibility.a);
        c.y(this, z);
        this.bubble.textImportantForAccessibility(z);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.state.a.isEmpty()) {
            return;
        }
        float width = getWidth() / this.state.a.size();
        float height = getHeight() * 0.9f;
        float height2 = this.bubble.getHeight() - this.bubbleDecorator.b;
        float f = this.minBubbleHeight;
        float f2 = height2 < f ? f : height2;
        float f3 = height - f2;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (rlu rluVar : this.state.a) {
            this.paint.setColor(this.barColor);
            float c = height - (y6i0.c(rluVar.a, f4, 1.0f) * f3);
            float f6 = f5 + width;
            float f7 = this.barRadius;
            canvas.drawRoundRect(f5 - 5.0f, c, f6, height, f7, f7, this.paint);
            String str = rluVar.b;
            if (str != null) {
                this.textPaint.getTextBounds(str, 0, str.length(), this.textBounds);
                canvas.drawText(str, (width / 2.0f) + f5, this.textBounds.height() + height + this.labelPadding, this.textPaint);
            }
            f5 = f6;
            f4 = 0.0f;
        }
        tlu tluVar = this.state.b;
        if (tluVar != null) {
            float f8 = (width / 2.0f) + (tluVar.b * width);
            moveBubble(canvas, f8, 0.0f, width);
            drawDashedVerticalLine(canvas, f8, height, f2);
            drawCurrentValue(canvas, f8, height - (f3 * tluVar.a), (0.8f * width) / 2.0f, tluVar.c);
            this.paint.setColor(this.barColor);
        }
        this.bubble.setVisibility(this.state.b != null ? 0 : 8);
    }

    public final void update(a newState) {
        slu sluVar;
        this.state = newState;
        tlu tluVar = newState.b;
        if (tluVar != null && (sluVar = tluVar.d) != null) {
            CharSequence charSequence = sluVar.a;
            this.bubble.setText(charSequence);
            this.bubble.setVisibility(!evu0.J(charSequence) ? 0 : 8);
            this.bubbleDecorator.b(sluVar.b);
            Drawable drawable = sluVar.c;
            if (drawable != null) {
                this.bubbleDecorator.n(drawable);
            }
        }
        updateAccessibility(newState.c);
        invalidate();
    }

    public HistoryChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public HistoryChart(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ HistoryChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
