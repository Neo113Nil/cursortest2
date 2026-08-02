package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.stats.zza;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.squareup.cash.overlays.FakeOverlayLayer;
import com.squareup.cash.overlays.FakeOverlayLayer$show$session$1;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import com.squareup.cash.savings.viewmodels.CelebrationViewModel;
import com.squareup.cash.sheet.BottomSheet;
import com.squareup.cash.sheet.BottomSheetState;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class CircularProgressDrawable extends Drawable implements Animatable {
    public final ValueAnimator mAnimator;
    public boolean mFinishing;
    public final Resources mResources;
    public final Ring mRing;
    public float mRotation;
    public float mRotationCount;
    public static final LinearInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final FastOutSlowInInterpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator(0);
    public static final int[] COLORS = {-16777216};

    public final class Ring {
        public int mAlpha;
        public Path mArrow;
        public int mArrowHeight;
        public final Paint mArrowPaint;
        public float mArrowScale;
        public int mArrowWidth;
        public final Paint mCirclePaint;
        public int mColorIndex;
        public int[] mColors;
        public int mCurrentColor;
        public float mEndTrim;
        public final Paint mPaint;
        public float mRingCenterRadius;
        public float mRotation;
        public boolean mShowArrow;
        public float mStartTrim;
        public float mStartingEndTrim;
        public float mStartingRotation;
        public float mStartingStartTrim;
        public float mStrokeWidth;
        public final RectF mTempBounds = new RectF();

        public Ring() {
            Paint paint = new Paint();
            this.mPaint = paint;
            Paint paint2 = new Paint();
            this.mArrowPaint = paint2;
            Paint paint3 = new Paint();
            this.mCirclePaint = paint3;
            this.mStartTrim = RecyclerView.DECELERATION_RATE;
            this.mEndTrim = RecyclerView.DECELERATION_RATE;
            this.mRotation = RecyclerView.DECELERATION_RATE;
            this.mStrokeWidth = 5.0f;
            this.mArrowScale = 1.0f;
            this.mAlpha = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void setColorIndex(int i) {
            this.mColorIndex = i;
            this.mCurrentColor = this.mColors[i];
        }
    }

    public CircularProgressDrawable(Context context) {
        context.getClass();
        this.mResources = context.getResources();
        Ring ring = new Ring();
        this.mRing = ring;
        ring.mColors = COLORS;
        ring.setColorIndex(0);
        ring.mStrokeWidth = 2.5f;
        ring.mPaint.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.addUpdateListener(new MultiViewUpdateListener(this, ring));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(LINEAR_INTERPOLATOR);
        ofFloat.addListener(new AnonymousClass2(this, ring));
        this.mAnimator = ofFloat;
    }

    public static void updateRingColor(float f, Ring ring) {
        if (f <= 0.75f) {
            ring.mCurrentColor = ring.mColors[ring.mColorIndex];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = ring.mColors;
        int i = ring.mColorIndex;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        ring.mCurrentColor = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r1) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r3) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r4) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r2))));
    }

    public final void applyTransformation(float f, Ring ring, boolean z) {
        float f2;
        if (this.mFinishing) {
            updateRingColor(f, ring);
            float floor = (float) (Math.floor(ring.mStartingRotation / 0.8f) + 1.0d);
            float f3 = ring.mStartingStartTrim;
            float f4 = ring.mStartingEndTrim;
            ring.mStartTrim = (((f4 - 0.01f) - f3) * f) + f3;
            ring.mEndTrim = f4;
            float f5 = ring.mStartingRotation;
            ring.mRotation = CameraState$Type$EnumUnboxingLocalUtility.m(floor, f5, f, f5);
            return;
        }
        if (f != 1.0f || z) {
            float f6 = ring.mStartingRotation;
            float f7 = ring.mStartingStartTrim;
            FastOutSlowInInterpolator fastOutSlowInInterpolator = MATERIAL_INTERPOLATOR;
            if (f < 0.5f) {
                f2 = (fastOutSlowInInterpolator.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f7;
            } else {
                float f8 = f7 + 0.79f;
                f7 = f8 - (((1.0f - fastOutSlowInInterpolator.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f8;
            }
            float f9 = (0.20999998f * f) + f6;
            float f10 = (f + this.mRotationCount) * 216.0f;
            ring.mStartTrim = f7;
            ring.mEndTrim = f2;
            ring.mRotation = f9;
            this.mRotation = f10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        Ring ring = this.mRing;
        Paint paint = ring.mPaint;
        RectF rectF = ring.mTempBounds;
        float f = ring.mRingCenterRadius;
        float f2 = (ring.mStrokeWidth / 2.0f) + f;
        if (f <= RecyclerView.DECELERATION_RATE) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((ring.mArrowWidth * ring.mArrowScale) / 2.0f, ring.mStrokeWidth / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = ring.mStartTrim;
        float f4 = ring.mRotation;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((ring.mEndTrim + f4) * 360.0f) - f5;
        paint.setColor(ring.mCurrentColor);
        paint.setAlpha(ring.mAlpha);
        float f7 = ring.mStrokeWidth / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ring.mCirclePaint);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = ring.mArrowPaint;
        if (ring.mShowArrow) {
            Path path = ring.mArrow;
            if (path == null) {
                Path path2 = new Path();
                ring.mArrow = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (ring.mArrowWidth * ring.mArrowScale) / 2.0f;
            ring.mArrow.moveTo(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            ring.mArrow.lineTo(ring.mArrowWidth * ring.mArrowScale, RecyclerView.DECELERATION_RATE);
            Path path3 = ring.mArrow;
            float f10 = ring.mArrowWidth;
            float f11 = ring.mArrowScale;
            path3.lineTo((f10 * f11) / 2.0f, ring.mArrowHeight * f11);
            ring.mArrow.offset((rectF.centerX() + min) - f9, (ring.mStrokeWidth / 2.0f) + rectF.centerY());
            ring.mArrow.close();
            paint2.setColor(ring.mCurrentColor);
            paint2.setAlpha(ring.mAlpha);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(ring.mArrow, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.mRing.mAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.mAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.mRing.mAlpha = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.mRing.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setSizeParameters(float f, float f2, float f3, float f4) {
        float f5 = this.mResources.getDisplayMetrics().density;
        float f6 = f2 * f5;
        Ring ring = this.mRing;
        ring.mStrokeWidth = f6;
        ring.mPaint.setStrokeWidth(f6);
        ring.mRingCenterRadius = f * f5;
        ring.setColorIndex(0);
        ring.mArrowWidth = (int) (f3 * f5);
        ring.mArrowHeight = (int) (f4 * f5);
    }

    public final void setStyle(int i) {
        if (i == 0) {
            setSizeParameters(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            setSizeParameters(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.mAnimator;
        valueAnimator.cancel();
        Ring ring = this.mRing;
        float f = ring.mStartTrim;
        ring.mStartingStartTrim = f;
        float f2 = ring.mEndTrim;
        ring.mStartingEndTrim = f2;
        ring.mStartingRotation = ring.mRotation;
        if (f2 != f) {
            this.mFinishing = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        ring.setColorIndex(0);
        ring.mStartingStartTrim = RecyclerView.DECELERATION_RATE;
        ring.mStartingEndTrim = RecyclerView.DECELERATION_RATE;
        ring.mStartingRotation = RecyclerView.DECELERATION_RATE;
        ring.mStartTrim = RecyclerView.DECELERATION_RATE;
        ring.mEndTrim = RecyclerView.DECELERATION_RATE;
        ring.mRotation = RecyclerView.DECELERATION_RATE;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.mAnimator.cancel();
        this.mRotation = RecyclerView.DECELERATION_RATE;
        Ring ring = this.mRing;
        if (ring.mShowArrow) {
            ring.mShowArrow = false;
        }
        ring.setColorIndex(0);
        ring.mStartingStartTrim = RecyclerView.DECELERATION_RATE;
        ring.mStartingEndTrim = RecyclerView.DECELERATION_RATE;
        ring.mStartingRotation = RecyclerView.DECELERATION_RATE;
        ring.mStartTrim = RecyclerView.DECELERATION_RATE;
        ring.mEndTrim = RecyclerView.DECELERATION_RATE;
        ring.mRotation = RecyclerView.DECELERATION_RATE;
        invalidateSelf();
    }

    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$2, reason: invalid class name */
    public final class AnonymousClass2 implements Animator.AnimatorListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;
        public final /* synthetic */ Object val$ring;

        public AnonymousClass2(CircularProgressDrawable circularProgressDrawable, Ring ring) {
            this.$r8$classId = 0;
            this.this$0 = circularProgressDrawable;
            this.val$ring = ring;
        }

        private final void onAnimationCancel$androidx$swiperefreshlayout$widget$CircularProgressDrawable$2(Animator animator) {
        }

        private final void onAnimationCancel$com$squareup$cash$overlays$FakeOverlayLayer$show$session$1$dismiss$lambda$0$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationCancel$com$squareup$cash$reactions$views$ChooseReactionOverlay$setStateAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
        }

        private final void onAnimationCancel$com$squareup$cash$sheet$BottomSheet$enterAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
        }

        private final void onAnimationCancel$com$squareup$cash$sheet$BottomSheet$moveSheetToStateAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
        }

        private final void onAnimationCancel$com$withpersona$sdk2$inquiry$selfie$view$Pi2ProgressArcView$setProgressInternal$lambda$8$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationEnd$androidx$swiperefreshlayout$widget$CircularProgressDrawable$2(Animator animator) {
        }

        private final void onAnimationEnd$com$squareup$cash$reactions$views$ChooseReactionOverlay$setStateAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
        }

        private final void onAnimationEnd$com$squareup$cash$sheet$BottomSheet$enterAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
        }

        private final void onAnimationEnd$com$squareup$cash$sheet$BottomSheet$moveSheetToStateAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
        }

        private final void onAnimationRepeat$com$squareup$cash$overlays$FakeOverlayLayer$show$session$1$dismiss$lambda$0$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationRepeat$com$squareup$cash$reactions$views$ChooseReactionOverlay$setStateAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
        }

        private final void onAnimationRepeat$com$squareup$cash$sheet$BottomSheet$enterAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
        }

        private final void onAnimationRepeat$com$squareup$cash$sheet$BottomSheet$moveSheetToStateAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
        }

        private final void onAnimationRepeat$com$withpersona$sdk2$inquiry$selfie$view$Pi2ProgressArcView$setProgressInternal$lambda$8$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationStart$com$squareup$cash$overlays$FakeOverlayLayer$show$session$1$dismiss$lambda$0$$inlined$doOnEnd$1(Animator animator) {
        }

        private final void onAnimationStart$com$withpersona$sdk2$inquiry$selfie$view$Pi2ProgressArcView$setProgressInternal$lambda$8$$inlined$doOnEnd$1(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 3:
                    animator.getClass();
                    break;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            Object obj2 = this.val$ring;
            switch (i) {
                case 0:
                    break;
                case 1:
                    ((FakeOverlayLayer) obj2).sessions.remove((FakeOverlayLayer$show$session$1) obj);
                    break;
                case 2:
                    break;
                case 3:
                    animator.getClass();
                    ((Function1) obj2).invoke(((CelebrationViewModel) obj).onSeenEvent);
                    break;
                case 4:
                case 5:
                    break;
                default:
                    Function0 function0 = (Function0) obj2;
                    if (function0 != null) {
                        ((Pi2ProgressArcView) obj).postDelayed(new zza(function0), 100L);
                        break;
                    }
                    break;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    CircularProgressDrawable circularProgressDrawable = (CircularProgressDrawable) this.this$0;
                    Ring ring = (Ring) this.val$ring;
                    circularProgressDrawable.applyTransformation(1.0f, ring, true);
                    ring.mStartingStartTrim = ring.mStartTrim;
                    ring.mStartingEndTrim = ring.mEndTrim;
                    ring.mStartingRotation = ring.mRotation;
                    ring.setColorIndex((ring.mColorIndex + 1) % ring.mColors.length);
                    if (!circularProgressDrawable.mFinishing) {
                        circularProgressDrawable.mRotationCount += 1.0f;
                        break;
                    } else {
                        circularProgressDrawable.mFinishing = false;
                        animator.cancel();
                        animator.setDuration(1332L);
                        animator.start();
                        if (ring.mShowArrow) {
                            ring.mShowArrow = false;
                            break;
                        }
                    }
                    break;
                case 3:
                    animator.getClass();
                    break;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.val$ring;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    ((CircularProgressDrawable) obj2).mRotationCount = RecyclerView.DECELERATION_RATE;
                    break;
                case 2:
                    ((ChooseReactionOverlay) obj).state = (ChooseReactionOverlay.State) obj2;
                    break;
                case 3:
                    animator.getClass();
                    break;
                case 4:
                    ((BottomSheet) obj).setCurrentState((BottomSheetState) obj2);
                    break;
                case 5:
                    BottomSheet bottomSheet = (BottomSheet) obj;
                    bottomSheet.stateChangeAnimator.cancel();
                    bottomSheet.stateChangeAnimator = (Animator) obj2;
                    break;
            }
        }

        public /* synthetic */ AnonymousClass2(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$ring = obj;
            this.this$0 = obj2;
        }
    }
}
