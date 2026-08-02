package ru.yandex.taxi.widget.timeline;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import defpackage.b64;
import defpackage.g8e;
import defpackage.i9z0;
import defpackage.j9z0;
import defpackage.k9z0;
import defpackage.l9z0;
import defpackage.ny61;
import defpackage.oaz0;
import defpackage.qx7;
import defpackage.scc;
import defpackage.w511;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\f\u001a\u00020\b\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0015\u001a\u00020\b\u0012\b\b\u0001\u0010\u0016\u001a\u00020\b\u0012\b\b\u0001\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020\u001aH\u0002¢\u0006\u0004\b+\u0010(J\u000f\u0010,\u001a\u00020\u001aH\u0002¢\u0006\u0004\b,\u0010(J\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b-\u0010!J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b.\u0010!J\u0017\u0010/\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u0010!J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b0\u0010!J\u0017\u00101\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b1\u0010!J\u0017\u00102\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b2\u0010!J\u0017\u00103\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b3\u0010!J\u0017\u00104\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b4\u0010!J\u0017\u00105\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b5\u0010!J\u000f\u00106\u001a\u00020\u001aH\u0002¢\u0006\u0004\b6\u0010(J\u0017\u00109\u001a\u00020\u001a2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u001a2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b;\u0010:J\u0017\u0010<\u001a\u00020\u001a2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b<\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010?R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010?R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010@R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010@R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010@R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010@R\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010?R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010?R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010?R\"\u0010A\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010@\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010?R\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010?R\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010?R\u0016\u0010I\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010?R\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010?R\u0016\u0010K\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010?R\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010?R\u0016\u0010M\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010?R\u0016\u0010N\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010?R\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010T\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010UR\u0016\u0010W\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010U¨\u0006X"}, d2 = {"Lru/yandex/taxi/widget/timeline/TimelineBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Loaz0;", "dataState", "Lru/yandex/taxi/widget/timeline/TimelineOrientation;", "orientation", "", "segmentPx", "segmentSpacePx", "barLineWidthPx", "circleTailRadiusPx", "circleTailSpacePx", "frontRadiusPx", "outlineSizePx", "", "applyAnimation", "showPendingLine", "passedLineWithRoundCap", "pendingLineWithRoundCap", "passedLineColor", "pendingLineColor", "circleTailColor", "<init>", "(Landroid/content/Context;Loaz0;Lru/yandex/taxi/widget/timeline/TimelineOrientation;IIIIIIIZZZZIII)V", "Lzy11;", "updateColor$taxi_design", "(III)V", "updateColor", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "createPassedLinePaint", "()Landroid/graphics/Paint;", "createPendingLinePaint", "createCircleTailPaint", "calculateFullLength", "()V", "calculatePassedLength", "checkLength", "checkHorizontalLength", "checkVerticalLength", "drawPassedLine", "drawHorizontalPassedLine", "drawVerticalPassedLine", "drawPendingLine", "drawHorizontalPendingLine", "drawVerticalPendingLine", "drawCircleTail", "drawHorizontalCircleTail", "drawVerticalCircleTail", "startAnimation", "", "duration", "startLineAnimation", "(J)V", "startSpaceAnimation", "startCircleAnimation", "Loaz0;", "Lru/yandex/taxi/widget/timeline/TimelineOrientation;", CA20Status.STATUS_USER_I, "Z", "shouldAnimate", "getShouldAnimate$taxi_design", "()Z", "setShouldAnimate$taxi_design", "(Z)V", "fullLengthPx", "passedLengthPx", "passedLengthAnimatedValue", "segmentSpaceAnimatedValue", "startLineAnimatedValue", "endLineAnimatedValue", "startCircleAnimatedValue", "endCircleAnimatedValue", "circleSpaceAnimatedValue", "Landroid/animation/ValueAnimator;", "lineAnimator", "Landroid/animation/ValueAnimator;", "spaceAnimator", "circleAnimator", "passedLinePaint", "Landroid/graphics/Paint;", "pendingLinePaint", "circleTailPaint", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimelineBar extends View {
    public static final int $stable = 8;
    private final boolean applyAnimation;
    private final int barLineWidthPx;
    private ValueAnimator circleAnimator;
    private int circleSpaceAnimatedValue;
    private int circleTailColor;
    private Paint circleTailPaint;
    private final int circleTailRadiusPx;
    private final int circleTailSpacePx;
    private final oaz0 dataState;
    private int endCircleAnimatedValue;
    private int endLineAnimatedValue;
    private final int frontRadiusPx;
    private int fullLengthPx;
    private ValueAnimator lineAnimator;
    private final TimelineOrientation orientation;
    private final int outlineSizePx;
    private int passedLengthAnimatedValue;
    private int passedLengthPx;
    private int passedLineColor;
    private Paint passedLinePaint;
    private boolean passedLineWithRoundCap;
    private int pendingLineColor;
    private Paint pendingLinePaint;
    private boolean pendingLineWithRoundCap;
    private int segmentPx;
    private int segmentSpaceAnimatedValue;
    private final int segmentSpacePx;
    private boolean shouldAnimate;
    private final boolean showPendingLine;
    private ValueAnimator spaceAnimator;
    private int startCircleAnimatedValue;
    private int startLineAnimatedValue;

    public TimelineBar(Context context, oaz0 oaz0Var, TimelineOrientation timelineOrientation, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, int i8, int i9, int i10) {
        super(context);
        this.dataState = oaz0Var;
        this.orientation = timelineOrientation;
        this.segmentPx = i;
        this.segmentSpacePx = i2;
        this.barLineWidthPx = i3;
        this.circleTailRadiusPx = i4;
        this.circleTailSpacePx = i5;
        this.frontRadiusPx = i6;
        this.outlineSizePx = i7;
        this.applyAnimation = z;
        this.showPendingLine = z2;
        this.passedLineWithRoundCap = z3;
        this.pendingLineWithRoundCap = z4;
        this.passedLineColor = i8;
        this.pendingLineColor = i9;
        this.circleTailColor = i10;
        this.passedLinePaint = createPassedLinePaint();
        this.pendingLinePaint = createPendingLinePaint();
        this.circleTailPaint = createCircleTailPaint();
        oaz0Var.c.add(new i9z0(this, 0));
        oaz0Var.d.add(new j9z0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TimelineBar timelineBar, List list) {
        timelineBar.calculateFullLength();
        timelineBar.calculatePassedLength();
        timelineBar.startAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TimelineBar timelineBar) {
        timelineBar.calculatePassedLength();
        timelineBar.startAnimation();
    }

    private final void calculateFullLength() {
        int size = this.dataState.a.size();
        this.fullLengthPx = g8e.d(size, 1, this.segmentPx, this.frontRadiusPx * 2 * size);
    }

    private final void calculatePassedLength() {
        int i = this.dataState.b;
        int i2 = this.frontRadiusPx;
        this.passedLengthPx = b64.b(this.segmentPx, i, i2 * 2 * i, i2);
    }

    private final void checkHorizontalLength() {
        int size = this.dataState.a.size();
        if (this.fullLengthPx + this.outlineSizePx > getWidth()) {
            int width = getWidth();
            int i = this.frontRadiusPx;
            int i2 = this.outlineSizePx;
            int i3 = size - 1;
            int i4 = ((width - ((i * 2) * size)) - (i2 * 2)) / i3;
            if ((i2 * 2) + (i3 * i4) + (i * 2 * size) > getWidth()) {
                ny61.r("TimelineView exceeds screen width");
                return;
            }
            this.segmentPx = i4;
            calculateFullLength();
            calculatePassedLength();
            invalidate();
        }
    }

    private final void checkLength() {
        int i = l9z0.a[this.orientation.ordinal()];
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
        if (this.fullLengthPx + this.outlineSizePx > getHeight()) {
            int height = getHeight();
            int i = this.frontRadiusPx;
            int i2 = this.outlineSizePx;
            int i3 = size - 1;
            int i4 = ((height - ((i * 2) * size)) - (i2 * 2)) / i3;
            if ((i2 * 2) + (i3 * i4) + (i * 2 * size) > getHeight()) {
                ny61.r("TimelineView exceeds screen width");
                return;
            }
            this.segmentPx = i4;
            calculateFullLength();
            calculatePassedLength();
            invalidate();
        }
    }

    private final Paint createCircleTailPaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.circleTailColor);
        paint.setStrokeWidth(this.circleTailRadiusPx * 2.0f);
        return paint;
    }

    private final Paint createPassedLinePaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.passedLineColor);
        paint.setStrokeWidth(this.barLineWidthPx);
        if (this.passedLineWithRoundCap) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        }
        return paint;
    }

    private final Paint createPendingLinePaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.pendingLineColor);
        paint.setStrokeWidth(this.barLineWidthPx);
        if (this.pendingLineWithRoundCap) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        }
        return paint;
    }

    private final void drawCircleTail(Canvas canvas) {
        int i = l9z0.a[this.orientation.ordinal()];
        if (i == 1) {
            drawHorizontalCircleTail(canvas);
        } else if (i == 2) {
            drawVerticalCircleTail(canvas);
        } else {
            w511.b();
        }
    }

    private final void drawHorizontalCircleTail(Canvas canvas) {
        canvas.drawCircle(((getWidth() - this.fullLengthPx) / 2.0f) + this.circleSpaceAnimatedValue + this.circleTailRadiusPx, getHeight() / 2.0f, this.circleTailRadiusPx, this.circleTailPaint);
    }

    private final void drawHorizontalPassedLine(Canvas canvas) {
        float width = ((getWidth() - this.fullLengthPx) / 2.0f) + this.frontRadiusPx;
        float width2 = (((getWidth() - this.fullLengthPx) / 2.0f) + this.passedLengthAnimatedValue) - this.segmentSpaceAnimatedValue;
        float height = getHeight() / 2.0f;
        float height2 = getHeight() / 2.0f;
        if (width > width2 || height > height2) {
            return;
        }
        canvas.drawLine(width, height, width2, height2, this.passedLinePaint);
    }

    private final void drawHorizontalPendingLine(Canvas canvas) {
        float width = ((getWidth() - this.fullLengthPx) / 2.0f) + this.passedLengthAnimatedValue + this.segmentSpaceAnimatedValue;
        int width2 = getWidth();
        float f = (((width2 - r2) / 2.0f) + this.fullLengthPx) - this.frontRadiusPx;
        float height = getHeight() / 2.0f;
        float height2 = getHeight() / 2.0f;
        if (width > f || height > height2) {
            return;
        }
        canvas.drawLine(width, height, f, height2, this.pendingLinePaint);
    }

    private final void drawPassedLine(Canvas canvas) {
        int i = l9z0.a[this.orientation.ordinal()];
        if (i == 1) {
            drawHorizontalPassedLine(canvas);
        } else if (i == 2) {
            drawVerticalPassedLine(canvas);
        } else {
            w511.b();
        }
    }

    private final void drawPendingLine(Canvas canvas) {
        if (this.showPendingLine) {
            int i = l9z0.a[this.orientation.ordinal()];
            if (i == 1) {
                drawHorizontalPendingLine(canvas);
            } else if (i == 2) {
                drawVerticalPendingLine(canvas);
            } else {
                w511.b();
            }
        }
    }

    private final void drawVerticalCircleTail(Canvas canvas) {
        int i = this.circleTailRadiusPx;
        canvas.drawCircle(getWidth() / 2.0f, ((getHeight() - this.fullLengthPx) / 2.0f) + this.circleSpaceAnimatedValue + i, i, this.circleTailPaint);
    }

    private final void drawVerticalPassedLine(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float width2 = getWidth() / 2.0f;
        float height = ((getHeight() - this.fullLengthPx) / 2.0f) + this.frontRadiusPx;
        float height2 = (((getHeight() - this.fullLengthPx) / 2.0f) + this.passedLengthAnimatedValue) - this.segmentSpaceAnimatedValue;
        if (width > width2 || height > height2) {
            return;
        }
        canvas.drawLine(width, height, width2, height2, this.passedLinePaint);
    }

    private final void drawVerticalPendingLine(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float width2 = getWidth() / 2.0f;
        float height = ((getHeight() - this.fullLengthPx) / 2.0f) + this.passedLengthAnimatedValue + this.segmentSpaceAnimatedValue;
        int height2 = getHeight();
        float f = (((height2 - r2) / 2.0f) + this.fullLengthPx) - this.frontRadiusPx;
        if (width > width2 || height > f) {
            return;
        }
        canvas.drawLine(width, height, width2, f, this.pendingLinePaint);
    }

    private final void startAnimation() {
        ValueAnimator valueAnimator = this.lineAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.spaceAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.circleAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        long j = (this.applyAnimation && this.shouldAnimate) ? 300L : 0L;
        startLineAnimation(j);
        startSpaceAnimation(j);
        startCircleAnimation(j);
    }

    private final void startCircleAnimation(long duration) {
        this.startCircleAnimatedValue = this.endCircleAnimatedValue;
        this.endCircleAnimatedValue = this.passedLengthPx + this.frontRadiusPx + this.circleTailSpacePx;
        oaz0 oaz0Var = this.dataState;
        if (oaz0Var.b == scc.f(oaz0Var.a)) {
            this.endCircleAnimatedValue = this.passedLengthPx;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.startCircleAnimatedValue, this.endCircleAnimatedValue);
        this.circleAnimator = ofFloat;
        ofFloat.addUpdateListener(new k9z0(this, 0));
        ofFloat.setDuration(duration);
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCircleAnimation$lambda$0(TimelineBar timelineBar, ValueAnimator valueAnimator) {
        timelineBar.circleSpaceAnimatedValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        timelineBar.invalidate();
    }

    private final void startLineAnimation(long duration) {
        int i = this.endLineAnimatedValue;
        this.startLineAnimatedValue = i;
        int i2 = this.passedLengthPx;
        this.endLineAnimatedValue = i2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, i2);
        this.lineAnimator = ofFloat;
        ofFloat.addUpdateListener(new k9z0(this, 1));
        ofFloat.setDuration(duration);
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLineAnimation$lambda$0(TimelineBar timelineBar, ValueAnimator valueAnimator) {
        timelineBar.passedLengthAnimatedValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        timelineBar.invalidate();
    }

    private final void startSpaceAnimation(long duration) {
        int i = this.segmentSpacePx;
        int i2 = ((i - this.frontRadiusPx) - this.outlineSizePx) * 2;
        float f = i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-f, f);
        this.spaceAnimator = ofFloat;
        ofFloat.addUpdateListener(new qx7(i2, 1, this));
        ofFloat.setDuration(duration);
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startSpaceAnimation$lambda$0(int i, TimelineBar timelineBar, ValueAnimator valueAnimator) {
        float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
        if (abs >= i) {
            timelineBar.segmentSpaceAnimatedValue = (int) abs;
            timelineBar.invalidate();
        }
    }

    /* renamed from: getShouldAnimate$taxi_design, reason: from getter */
    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        checkLength();
        drawPendingLine(canvas);
        drawPassedLine(canvas);
        drawCircleTail(canvas);
    }

    public final void setShouldAnimate$taxi_design(boolean z) {
        this.shouldAnimate = z;
    }

    public final void updateColor$taxi_design(int passedLineColor, int pendingLineColor, int circleTailColor) {
        this.passedLineColor = passedLineColor;
        this.pendingLineColor = pendingLineColor;
        this.circleTailColor = circleTailColor;
        this.passedLinePaint = createPassedLinePaint();
        this.pendingLinePaint = createPendingLinePaint();
        this.circleTailPaint = createCircleTailPaint();
        invalidate();
    }
}
