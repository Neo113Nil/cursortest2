package ru.yandex.taxi.widget.progress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.state.db.StateEntry;
import defpackage.akh;
import defpackage.ckh;
import defpackage.fjf0;
import defpackage.ma90;
import defpackage.mqg0;
import defpackage.oa90;
import defpackage.s9q0;
import defpackage.tje;
import defpackage.w511;
import defpackage.y6i0;
import defpackage.yvb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.animation.BaseAnimatorListener;
import ru.yandex.taxi.widget.progress.CircularSegmentedProgressView;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 n2\u00020\u0001:\u0001oB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\b\b\u0001\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010$J/\u0010)\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\n2\b\b\u0001\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u00101J\u0019\u00103\u001a\u00020\n2\b\b\u0001\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u00101J\u001f\u00104\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020\n2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u00101J\u0017\u0010<\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u00101J\u0017\u0010E\u001a\u00020\n2\b\b\u0001\u0010D\u001a\u00020\u0011¢\u0006\u0004\bE\u0010=R\u0016\u0010F\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0016\u0010I\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010GR\u0016\u0010D\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010KR\u0016\u0010L\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010KR\u0016\u0010O\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010GR\u0016\u0010P\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010GR\u0016\u0010Q\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010UR\u0014\u0010V\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010ZR\u0014\u0010\\\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u0014\u0010_\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010eR\u0014\u0010g\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010eR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006p"}, d2 = {"Lru/yandex/taxi/widget/progress/CircularSegmentedProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateFillPaints", "()V", "calculateInnerBounds", "calculateAngles", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "", "scale", "applyScale", "(Landroid/graphics/Path;F)V", "", "colors", "", "positions", "Landroid/graphics/Shader;", "createGradient", "([I[F)Landroid/graphics/Shader;", "color", "(I)Landroid/graphics/Shader;", "normalizePositions", "([F)[F", "Landroid/graphics/Paint;", "paint", "initPaint", "(Landroid/graphics/Paint;I)V", "(Landroid/graphics/Paint;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "totalProgress", "setTotalProgress", "(I)V", "setProgressEmptyColor", "setProgressFillColor", "setProgressFillShader", "([I[F)V", "Loa90;", "paintMode", "setBonusTypeVisualIdentity", "(Loa90;)V", "currentProgress", "setCurrentProgress", "setLastSegmentScale", "(F)V", "", "visible", "setLastSegmentVisible", "(Z)V", "opacity", "setLastSegmentOpacity", "segmentWidth", "setSegmentWidth", "outerDashAngle", CA20Status.STATUS_USER_I, "outerSegmentAngle", "innerDashAngle", "innerSegmentAngle", "F", "lastSegmentVisible", "Z", "lastSegmentScale", "progressEmptyColor", "progressFillColor", "gradientPositions", "[F", "gradientColors", "[I", "Loa90;", "progressPath", "Landroid/graphics/Path;", "Landroid/graphics/Matrix;", "gradientMatrix", "Landroid/graphics/Matrix;", "lastSegmentScaleMatrix", "progressFillPaint", "Landroid/graphics/Paint;", "progressEmptyPaint", "lastSegmentPaint", "Landroid/graphics/PointF;", "centerPos", "Landroid/graphics/PointF;", "Landroid/graphics/RectF;", "outerBounds", "Landroid/graphics/RectF;", "innerBounds", "lastProgressSegmentBounds", "Lfjf0;", "progressInfo", "Lfjf0;", "Ls9q0;", "progressAnimator", "Ls9q0;", "Companion", "yvb", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CircularSegmentedProgressView extends View {
    private static final int AVAILABLE_SPACE_IN_DEGREES = 270;
    private static final int CIRCLE_DEGREES = 360;
    public static final yvb Companion = new yvb();
    private static final int DEFAULT_DASH_ANGLE = 7;
    private static final int DEFAULT_TOTAL_PROGRESS = 5;
    private static final int DEFAULT_WIDTH = 6;
    private static final int START_ANGLE = 135;
    private final PointF centerPos;
    private int[] gradientColors;
    private final Matrix gradientMatrix;
    private float[] gradientPositions;
    private final RectF innerBounds;
    private int innerDashAngle;
    private int innerSegmentAngle;
    private final RectF lastProgressSegmentBounds;
    private final Paint lastSegmentPaint;
    private float lastSegmentScale;
    private final Matrix lastSegmentScaleMatrix;
    private boolean lastSegmentVisible;
    private final RectF outerBounds;
    private int outerDashAngle;
    private int outerSegmentAngle;
    private oa90 paintMode;
    private final s9q0 progressAnimator;
    private int progressEmptyColor;
    private final Paint progressEmptyPaint;
    private int progressFillColor;
    private final Paint progressFillPaint;
    private final fjf0 progressInfo;
    private final Path progressPath;
    private float segmentWidth;

    public CircularSegmentedProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.outerDashAngle = 7;
        this.innerDashAngle = 7;
        this.segmentWidth = tje.w(6, getContext());
        this.lastSegmentVisible = true;
        this.lastSegmentScale = 1.0f;
        this.progressEmptyColor = getContext().getColor(mqg0.component_gray_175);
        this.gradientPositions = new float[0];
        this.gradientColors = new int[0];
        this.paintMode = new ma90();
        this.progressPath = new Path();
        this.gradientMatrix = new Matrix();
        this.lastSegmentScaleMatrix = new Matrix();
        Paint paint = new Paint(1);
        this.progressFillPaint = paint;
        Paint paint2 = new Paint(1);
        this.progressEmptyPaint = paint2;
        Paint paint3 = new Paint(1);
        this.lastSegmentPaint = paint3;
        this.centerPos = new PointF();
        this.outerBounds = new RectF();
        this.innerBounds = new RectF();
        this.lastProgressSegmentBounds = new RectF();
        this.progressInfo = new fjf0();
        this.progressAnimator = new ckh();
        initPaint(paint2, this.progressEmptyColor);
        initPaint(paint);
        initPaint(paint3);
        calculateAngles();
    }

    private final void applyScale(Path path, float scale) {
        path.computeBounds(this.lastProgressSegmentBounds, true);
        this.lastSegmentScaleMatrix.setScale(scale, scale, this.lastProgressSegmentBounds.centerX(), this.lastProgressSegmentBounds.centerY());
        path.transform(this.lastSegmentScaleMatrix);
    }

    private final void calculateAngles() {
        int i = this.progressInfo.a;
        this.outerSegmentAngle = i > 0 ? (270 - ((i - 1) * this.outerDashAngle)) / i : 0;
        RectF rectF = this.outerBounds;
        int i2 = (int) ((rectF.right - rectF.left) / 2.0f);
        RectF rectF2 = this.innerBounds;
        int i3 = (int) (360.0d / ((((int) ((rectF2.right - rectF2.left) / 2.0f)) * 6.283185307179586d) / ((int) ((((this.outerDashAngle / 360.0d) * 2.0d) * 3.141592653589793d) * i2))));
        this.innerDashAngle = i3;
        this.innerSegmentAngle = i > 0 ? (270 - ((i - 1) * i3)) / i : 0;
    }

    private final void calculateInnerBounds() {
        RectF rectF = this.innerBounds;
        RectF rectF2 = this.outerBounds;
        float f = rectF2.left;
        float f2 = this.segmentWidth;
        rectF.set(f + f2, rectF2.top + f2, rectF2.right - f2, rectF2.bottom - f2);
    }

    private final Shader createGradient(int[] colors, float[] positions) {
        if (colors.length < 2 || positions.length < 2) {
            return createGradient(this.progressFillColor);
        }
        PointF pointF = this.centerPos;
        SweepGradient sweepGradient = new SweepGradient(pointF.x, pointF.y, colors, positions);
        this.gradientMatrix.reset();
        Matrix matrix = this.gradientMatrix;
        PointF pointF2 = this.centerPos;
        matrix.preRotate(135.0f, pointF2.x, pointF2.y);
        sweepGradient.setLocalMatrix(this.gradientMatrix);
        return sweepGradient;
    }

    private final void initPaint(Paint paint, int color) {
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(color);
    }

    private final float[] normalizePositions(float[] positions) {
        int length = positions.length;
        for (int i = 0; i < length; i++) {
            positions[i] = 0.75f * positions[i];
        }
        return positions;
    }

    private final void updateFillPaints() {
        if (!(this.paintMode instanceof ma90)) {
            w511.b();
            return;
        }
        this.progressFillPaint.setColor(this.progressFillColor);
        this.lastSegmentPaint.setColor(this.progressFillColor);
        this.progressFillPaint.setShader(null);
        this.lastSegmentPaint.setShader(null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.progressInfo.a;
        int i2 = 135;
        int i3 = 0;
        int i4 = 135;
        while (i3 < i) {
            this.progressPath.reset();
            this.progressPath.addArc(this.innerBounds, i2, this.innerSegmentAngle);
            this.progressPath.arcTo(this.outerBounds, i4 + r6, -this.outerSegmentAngle);
            this.progressPath.close();
            int i5 = this.progressInfo.b;
            int i6 = i5 - 1;
            Path path = this.progressPath;
            if (i3 == i6) {
                applyScale(path, this.lastSegmentScale);
                canvas.drawPath(this.progressPath, this.lastSegmentVisible ? this.lastSegmentPaint : this.progressEmptyPaint);
            } else {
                canvas.drawPath(path, i3 < i5 ? this.progressFillPaint : this.progressEmptyPaint);
            }
            i2 += this.innerSegmentAngle + this.innerDashAngle;
            i4 += this.outerSegmentAngle + this.outerDashAngle;
            i3++;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.outerBounds.set(getPaddingStart(), getPaddingTop(), w - getPaddingEnd(), h - getPaddingBottom());
        calculateInnerBounds();
        calculateAngles();
        PointF pointF = this.centerPos;
        pointF.x = w / 2.0f;
        pointF.y = h / 2.0f;
        updateFillPaints();
    }

    public final void setBonusTypeVisualIdentity(oa90 paintMode) {
        this.paintMode = paintMode;
        if (paintMode instanceof ma90) {
            setProgressFillColor(0);
        } else {
            w511.b();
        }
    }

    public void setCurrentProgress(int currentProgress) {
        ValueAnimator valueAnimator;
        fjf0 fjf0Var = this.progressInfo;
        final int i = 0;
        fjf0Var.b = y6i0.d(currentProgress, 0, fjf0Var.a);
        s9q0 s9q0Var = this.progressAnimator;
        int i2 = this.progressInfo.b;
        final ckh ckhVar = (ckh) s9q0Var;
        AnimatorSet animatorSet = ckhVar.a;
        if (animatorSet.isRunning()) {
            animatorSet.end();
        }
        ValueAnimator valueAnimator2 = ckhVar.b;
        final int i3 = 1;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = ckhVar.b) != null) {
            valueAnimator.end();
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new akh(0), Boolean.FALSE, Boolean.TRUE);
        ofObject.setDuration(200L);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bkh
            public final /* synthetic */ CircularSegmentedProgressView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                int i4 = i;
                CircularSegmentedProgressView circularSegmentedProgressView = this.b;
                switch (i4) {
                    case 0:
                        circularSegmentedProgressView.setLastSegmentVisible(((Boolean) valueAnimator3.getAnimatedValue()).booleanValue());
                        break;
                    case 1:
                        circularSegmentedProgressView.setLastSegmentOpacity(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                        break;
                    default:
                        circularSegmentedProgressView.setLastSegmentScale(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                        break;
                }
            }
        });
        ckhVar.b = ofObject;
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new IntEvaluator(), 255, Integer.valueOf(HProv.PP_VERSION_TIMESTAMP));
        ofObject2.setDuration(500L);
        ofObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bkh
            public final /* synthetic */ CircularSegmentedProgressView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                int i4 = i3;
                CircularSegmentedProgressView circularSegmentedProgressView = this.b;
                switch (i4) {
                    case 0:
                        circularSegmentedProgressView.setLastSegmentVisible(((Boolean) valueAnimator3.getAnimatedValue()).booleanValue());
                        break;
                    case 1:
                        circularSegmentedProgressView.setLastSegmentOpacity(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                        break;
                    default:
                        circularSegmentedProgressView.setLastSegmentScale(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                        break;
                }
            }
        });
        ofObject2.setRepeatCount(1);
        final int i4 = 2;
        ofObject2.setRepeatMode(2);
        ValueAnimator ofObject3 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(1.0f), Float.valueOf(0.8f));
        ofObject3.setDuration(500L);
        ofObject3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bkh
            public final /* synthetic */ CircularSegmentedProgressView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                int i42 = i4;
                CircularSegmentedProgressView circularSegmentedProgressView = this.b;
                switch (i42) {
                    case 0:
                        circularSegmentedProgressView.setLastSegmentVisible(((Boolean) valueAnimator3.getAnimatedValue()).booleanValue());
                        break;
                    case 1:
                        circularSegmentedProgressView.setLastSegmentOpacity(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                        break;
                    default:
                        circularSegmentedProgressView.setLastSegmentScale(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                        break;
                }
            }
        });
        ofObject3.setRepeatCount(1);
        ofObject3.setRepeatMode(2);
        animatorSet.playTogether(ofObject2, ofObject3);
        animatorSet.addListener(new BaseAnimatorListener() { // from class: ru.yandex.taxi.widget.progress.DefaultSegmentedProgressViewAnimator$animateProgressChange$3
            private int currentRepeat;

            public final int getCurrentRepeat() {
                return this.currentRepeat;
            }

            @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                int i5 = this.currentRepeat + 1;
                this.currentRepeat = i5;
                ckh ckhVar2 = ckh.this;
                if (i5 >= 3) {
                    ckhVar2.a.removeAllListeners();
                } else {
                    ckhVar2.a.setStartDelay(200L);
                    ckh.this.a.start();
                }
            }

            public final void setCurrentRepeat(int i5) {
                this.currentRepeat = i5;
            }
        });
        ValueAnimator valueAnimator3 = ckhVar.b;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new BaseAnimatorListener() { // from class: ru.yandex.taxi.widget.progress.DefaultSegmentedProgressViewAnimator$animateProgressChange$4
                @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    ckh.this.a.start();
                    ValueAnimator valueAnimator4 = ckh.this.b;
                    if (valueAnimator4 != null) {
                        valueAnimator4.removeAllListeners();
                    }
                }
            });
        }
        ValueAnimator valueAnimator4 = ckhVar.b;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
        invalidate();
    }

    public void setLastSegmentOpacity(int opacity) {
        this.lastSegmentPaint.setAlpha(opacity);
        invalidate();
    }

    public void setLastSegmentScale(float scale) {
        this.lastSegmentScale = scale;
        invalidate();
    }

    public void setLastSegmentVisible(boolean visible) {
        this.lastSegmentVisible = visible;
        invalidate();
    }

    public void setProgressEmptyColor(int color) {
        this.progressEmptyColor = color;
        this.progressEmptyPaint.setColor(color);
        invalidate();
    }

    public void setProgressFillColor(int color) {
        this.progressFillColor = color;
        updateFillPaints();
        invalidate();
    }

    public void setProgressFillShader(int[] colors, float[] positions) {
        if (colors.length == positions.length) {
            this.gradientColors = colors;
            this.gradientPositions = normalizePositions(positions);
            updateFillPaints();
            invalidate();
        }
    }

    public final void setSegmentWidth(float segmentWidth) {
        this.segmentWidth = segmentWidth;
        calculateInnerBounds();
        calculateAngles();
        invalidate();
    }

    public void setTotalProgress(int totalProgress) {
        fjf0 fjf0Var = this.progressInfo;
        if (totalProgress == fjf0Var.a) {
            return;
        }
        fjf0Var.a = totalProgress;
        calculateAngles();
        invalidate();
    }

    private final void initPaint(Paint paint) {
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private final Shader createGradient(int color) {
        PointF pointF = this.centerPos;
        return new SweepGradient(pointF.x, pointF.y, color, color);
    }

    public CircularSegmentedProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CircularSegmentedProgressView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CircularSegmentedProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
