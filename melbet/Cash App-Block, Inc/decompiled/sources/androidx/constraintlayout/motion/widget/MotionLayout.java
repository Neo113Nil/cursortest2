package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.constraintlayout.core.motion.utils.ArcCurveFit;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.motion.widget.TouchResponse;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.StateSet$State;
import androidx.constraintlayout.widget.StateSet$Variant;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.widget.NestedScrollView;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.fillr.e0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static final /* synthetic */ int $r8$clinit = 0;
    public long mAnimationStartTime;
    public int mBeginState;
    public final RectF mBoundsCheck;
    public int mCurrentState;
    public int mDebugPath;
    public final DecelerateInterpolator mDecelerateLogic;
    public boolean mDelayedApply;
    public DevModeDraw mDevModeDraw;
    public int mEndState;
    public int mEndWrapHeight;
    public int mEndWrapWidth;
    public final HashMap mFrameArrayList;
    public int mFrames;
    public int mHeightMeasureMode;
    public boolean mInLayout;
    public boolean mInTransition;
    public boolean mInteractionEnabled;
    public MotionInterpolator mInterpolator;
    public Matrix mInverseMatrix;
    public boolean mKeepAnimating;
    public final Easing mKeyCache;
    public long mLastDrawTime;
    public float mLastFps;
    public int mLastHeightMeasureSpec;
    public int mLastLayoutHeight;
    public int mLastLayoutWidth;
    public float mLastVelocity;
    public int mLastWidthMeasureSpec;
    public float mListenerPosition;
    public int mListenerState;
    public boolean mMeasureDuringTransition;
    public final Model mModel;
    public boolean mNeedsFireTransitionCompleted;
    public Recorder$$ExternalSyntheticLambda15 mOnComplete;
    public ArrayList mOnHideHelpers;
    public ArrayList mOnShowHelpers;
    public float mPostInterpolationPosition;
    public Interpolator mProgressInterpolator;
    public View mRegionView;
    public MotionScene mScene;
    public float mScrollTargetDT;
    public float mScrollTargetDX;
    public float mScrollTargetDY;
    public long mScrollTargetTime;
    public int mStartWrapHeight;
    public int mStartWrapWidth;
    public StateCache mStateCache;
    public final StopLogic mStopLogic;
    public final Rect mTempRect;
    public boolean mTemporalInterpolator;
    public final ArrayList mTransitionCompleted;
    public float mTransitionDuration;
    public float mTransitionGoalPosition;
    public boolean mTransitionInstantly;
    public float mTransitionLastPosition;
    public long mTransitionLastTime;
    public TransitionListener mTransitionListener;
    public CopyOnWriteArrayList mTransitionListeners;
    public float mTransitionPosition;
    public int mTransitionState;
    public boolean mUndergoingMotion;
    public int mWidthMeasureMode;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$1, reason: invalid class name */
    public final class AnonymousClass1 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ View this$0;

        public /* synthetic */ AnonymousClass1(View view, int i) {
            this.$r8$classId = i;
            this.this$0 = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.$r8$classId;
            View view = this.this$0;
            switch (i) {
                case 0:
                    ((MotionLayout) view).mStateCache.apply();
                    break;
                case 1:
                    ((MotionLayout) view).mStateCache.apply();
                    break;
                default:
                    view.setNestedScrollingEnabled(true);
                    break;
            }
        }
    }

    public final class DecelerateInterpolator extends MotionInterpolator {
        public float mMaxA;
        public float mInitialV = RecyclerView.DECELERATION_RATE;
        public float mCurrentP = RecyclerView.DECELERATION_RATE;

        public DecelerateInterpolator() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = this.mInitialV;
            float f3 = this.mMaxA;
            MotionLayout motionLayout = MotionLayout.this;
            if (f2 > RecyclerView.DECELERATION_RATE) {
                float f4 = f2 / f3;
                if (f4 < f) {
                    f = f4;
                }
                float f5 = f3 * f;
                motionLayout.mLastVelocity = f2 - f5;
                return ((f2 * f) - ((f5 * f) / 2.0f)) + this.mCurrentP;
            }
            float f6 = (-f2) / f3;
            if (f6 < f) {
                f = f6;
            }
            float f7 = f3 * f;
            motionLayout.mLastVelocity = f7 + f2;
            return ((f7 * f) / 2.0f) + (f2 * f) + this.mCurrentP;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public final float getVelocity() {
            return MotionLayout.this.mLastVelocity;
        }
    }

    public final class DevModeDraw {
        public final Paint mFillPaint;
        public int mKeyFrameCount;
        public final float[] mKeyFramePoints;
        public final Paint mPaint;
        public final Paint mPaintGraph;
        public final Paint mPaintKeyframes;
        public Path mPath;
        public final int[] mPathMode;
        public float[] mPoints;
        public final float[] mRectangle;
        public final Paint mTextPaint;
        public final Rect mBounds = new Rect();
        public final int mShadowTranslate = 1;

        public DevModeDraw() {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            this.mPaintKeyframes = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.mPaintGraph = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            this.mTextPaint = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.mRectangle = new float[8];
            Paint paint5 = new Paint();
            this.mFillPaint = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, RecyclerView.DECELERATION_RATE));
            this.mKeyFramePoints = new float[100];
            this.mPathMode = new int[50];
        }

        public final void drawAll(Canvas canvas, int i, int i2, MotionController motionController) {
            Canvas canvas2;
            int i3;
            int i4;
            boolean z;
            float f;
            Paint paint = this.mPaintGraph;
            int[] iArr = this.mPathMode;
            boolean z2 = false;
            int i5 = 4;
            if (i == 4) {
                int i6 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (i6 < this.mKeyFrameCount) {
                    int i7 = iArr[i6];
                    boolean z5 = z3;
                    if (i7 == 1) {
                        z5 = true;
                    }
                    if (i7 == 0) {
                        z4 = true;
                    }
                    i6++;
                    z3 = z5;
                    z4 = z4;
                }
                if (z3) {
                    float[] fArr = this.mPoints;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
                }
                if (z4) {
                    drawPathCartesian(canvas);
                }
            }
            if (i == 2) {
                float[] fArr2 = this.mPoints;
                float f2 = fArr2[0];
                float f3 = fArr2[1];
                float f4 = fArr2[fArr2.length - 2];
                float f5 = fArr2[fArr2.length - 1];
                canvas2 = canvas;
                canvas2.drawLine(f2, f3, f4, f5, paint);
            } else {
                canvas2 = canvas;
            }
            if (i == 3) {
                drawPathCartesian(canvas);
            }
            canvas2.drawLines(this.mPoints, this.mPaint);
            View view = motionController.mView;
            if (view != null) {
                i3 = view.getWidth();
                i4 = motionController.mView.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i8 = 1;
            while (i8 < i2 - 1) {
                if (i == i5 && iArr[i8 - 1] == 0) {
                    z = z2;
                } else {
                    int i9 = i8 * 2;
                    float[] fArr3 = this.mKeyFramePoints;
                    float f6 = fArr3[i9];
                    float f7 = fArr3[i9 + 1];
                    this.mPath.reset();
                    z = z2;
                    this.mPath.moveTo(f6, f7 + 10.0f);
                    this.mPath.lineTo(f6 + 10.0f, f7);
                    this.mPath.lineTo(f6, f7 - 10.0f);
                    this.mPath.lineTo(f6 - 10.0f, f7);
                    this.mPath.close();
                    int i10 = i8 - 1;
                    Paint paint2 = this.mFillPaint;
                    if (i == i5) {
                        int i11 = iArr[i10];
                        if (i11 == 1) {
                            drawPathRelativeTicks(canvas2, f6 - RecyclerView.DECELERATION_RATE, f7 - RecyclerView.DECELERATION_RATE);
                        } else if (i11 == 0) {
                            drawPathCartesianTicks(canvas2, f6 - RecyclerView.DECELERATION_RATE, f7 - RecyclerView.DECELERATION_RATE);
                        } else if (i11 == 2) {
                            f = f7;
                            drawPathScreenTicks(canvas2, f6 - RecyclerView.DECELERATION_RATE, f - RecyclerView.DECELERATION_RATE, i3, i4);
                            canvas2.drawPath(this.mPath, paint2);
                        }
                        f = f7;
                        canvas2.drawPath(this.mPath, paint2);
                    } else {
                        f = f7;
                    }
                    if (i == 2) {
                        drawPathRelativeTicks(canvas2, f6 - RecyclerView.DECELERATION_RATE, f - RecyclerView.DECELERATION_RATE);
                    }
                    if (i == 3) {
                        drawPathCartesianTicks(canvas2, f6 - RecyclerView.DECELERATION_RATE, f - RecyclerView.DECELERATION_RATE);
                    }
                    if (i == 6) {
                        drawPathScreenTicks(canvas2, f6 - RecyclerView.DECELERATION_RATE, f - RecyclerView.DECELERATION_RATE, i3, i4);
                    }
                    canvas2.drawPath(this.mPath, paint2);
                }
                i8++;
                z2 = z;
                i5 = 4;
            }
            boolean z6 = z2;
            float[] fArr4 = this.mPoints;
            if (fArr4.length > 1) {
                float f8 = fArr4[z6 ? 1 : 0];
                float f9 = fArr4[1];
                Paint paint3 = this.mPaintKeyframes;
                canvas2.drawCircle(f8, f9, 8.0f, paint3);
                float[] fArr5 = this.mPoints;
                canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
            }
        }

        public final void drawPathCartesian(Canvas canvas) {
            float[] fArr = this.mPoints;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float min = Math.min(f, f3);
            float max = Math.max(f2, f4);
            float max2 = Math.max(f, f3);
            float max3 = Math.max(f2, f4);
            Paint paint = this.mPaintGraph;
            canvas.drawLine(min, max, max2, max3, paint);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
        }

        public final void drawPathCartesianTicks(Canvas canvas, float f, float f2) {
            float[] fArr = this.mPoints;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            int length = str.length();
            Paint paint = this.mTextPaint;
            Rect rect = this.mBounds;
            paint.getTextBounds(str, 0, length, rect);
            canvas.drawText(str, ((min2 / 2.0f) - (rect.width() / 2)) + min, f2 - 20.0f, paint);
            float min3 = Math.min(f3, f5);
            Paint paint2 = this.mPaintGraph;
            canvas.drawLine(f, f2, min3, f2, paint2);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            paint.getTextBounds(str2, 0, str2.length(), rect);
            canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
        }

        public final void drawPathRelativeTicks(Canvas canvas, float f, float f2) {
            float[] fArr = this.mPoints;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (hypot * hypot);
            float f10 = (f7 * f9) + f3;
            float f11 = (f9 * f8) + f4;
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            int length = str.length();
            Paint paint = this.mTextPaint;
            paint.getTextBounds(str, 0, length, this.mBounds);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (r7.width() / 2), -20.0f, paint);
            canvas.drawLine(f, f2, f10, f11, this.mPaintGraph);
        }

        public final void drawPathScreenTicks(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder sb = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb.append(((int) ((((f - (i / 2)) * 100.0f) / (motionLayout.getWidth() - i)) + 0.5d)) / 100.0f);
            String sb2 = sb.toString();
            int length = sb2.length();
            Paint paint = this.mTextPaint;
            Rect rect = this.mBounds;
            paint.getTextBounds(sb2, 0, length, rect);
            canvas.drawText(sb2, ((f / 2.0f) - (rect.width() / 2)) + RecyclerView.DECELERATION_RATE, f2 - 20.0f, paint);
            float min = Math.min(RecyclerView.DECELERATION_RATE, 1.0f);
            Paint paint2 = this.mPaintGraph;
            canvas.drawLine(f, f2, min, f2, paint2);
            String str = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (motionLayout.getHeight() - i2)) + 0.5d)) / 100.0f);
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, f + 5.0f, RecyclerView.DECELERATION_RATE - ((f2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(RecyclerView.DECELERATION_RATE, 1.0f), paint2);
        }
    }

    public final class Model {
        public int mEndId;
        public int mStartId;
        public ConstraintWidgetContainer mLayoutStart = new ConstraintWidgetContainer();
        public ConstraintWidgetContainer mLayoutEnd = new ConstraintWidgetContainer();
        public ConstraintSet mStart = null;
        public ConstraintSet mEnd = null;

        public Model() {
        }

        public static void copy(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ArrayList arrayList = constraintWidgetContainer.mChildren;
            HashMap hashMap = new HashMap();
            hashMap.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.mChildren.clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, hashMap);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                ConstraintWidget barrier = constraintWidget instanceof Barrier ? new Barrier() : constraintWidget instanceof Guideline ? new Guideline() : constraintWidget instanceof Flow ? new Flow() : constraintWidget instanceof Placeholder ? new Placeholder() : constraintWidget instanceof HelperWidget ? new HelperWidget() : new ConstraintWidget();
                constraintWidgetContainer2.add(barrier);
                hashMap.put(constraintWidget, barrier);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) it2.next();
                ((ConstraintWidget) hashMap.get(constraintWidget2)).copy(constraintWidget2, hashMap);
            }
        }

        public static ConstraintWidget getWidget(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.mCompanionWidget == view) {
                return constraintWidgetContainer;
            }
            ArrayList arrayList = constraintWidgetContainer.mChildren;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i);
                if (constraintWidget.mCompanionWidget == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public final void build() {
            int i;
            HashMap hashMap;
            SparseArray sparseArray;
            int[] iArr;
            int i2;
            Rect rect;
            Rect rect2;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            HashMap hashMap2 = motionLayout.mFrameArrayList;
            hashMap2.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                MotionController motionController = new MotionController(childAt);
                int id = childAt.getId();
                iArr2[i3] = id;
                sparseArray2.put(id, motionController);
                hashMap2.put(childAt, motionController);
            }
            int i4 = 0;
            while (i4 < childCount) {
                View childAt2 = motionLayout.getChildAt(i4);
                MotionController motionController2 = (MotionController) hashMap2.get(childAt2);
                if (motionController2 == null) {
                    i = childCount;
                    hashMap = hashMap2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                } else {
                    Rect rect3 = motionController2.mTempRect;
                    MotionPaths motionPaths = motionController2.mStartMotionPath;
                    if (this.mStart != null) {
                        ConstraintWidget widget = getWidget(this.mLayoutStart, childAt2);
                        if (widget != null) {
                            Rect access$2000 = MotionLayout.access$2000(motionLayout, widget);
                            hashMap = hashMap2;
                            ConstraintSet constraintSet = this.mStart;
                            iArr = iArr2;
                            int width = motionLayout.getWidth();
                            i2 = i4;
                            int height = motionLayout.getHeight();
                            sparseArray = sparseArray2;
                            int i5 = constraintSet.mRotate;
                            if (i5 != 0) {
                                MotionController.rotate(access$2000, rect3, i5, width, height);
                            }
                            motionPaths.mTime = RecyclerView.DECELERATION_RATE;
                            motionPaths.mPosition = RecyclerView.DECELERATION_RATE;
                            motionController2.readView(motionPaths);
                            i = childCount;
                            rect = rect3;
                            motionPaths.setBounds(access$2000.left, access$2000.top, access$2000.width(), access$2000.height());
                            ConstraintSet.Constraint constraint = constraintSet.get(motionController2.mId);
                            motionPaths.applyParameters(constraint);
                            ConstraintSet.Motion motion = constraint.motion;
                            motionController2.mMotionStagger = motion.mMotionStagger;
                            motionController2.mStartPoint.setState(access$2000, constraintSet, i5, motionController2.mId);
                            motionController2.mTransformPivotTarget = constraint.transform.transformPivotTarget;
                            motionController2.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
                            motionController2.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
                            Context context = motionController2.mView.getContext();
                            int i6 = motion.mQuantizeInterpolatorType;
                            motionController2.mQuantizeMotionInterpolator = i6 != -2 ? i6 != -1 ? i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new android.view.animation.DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new MotionScene.AnonymousClass1(Easing.getInterpolator(motion.mQuantizeInterpolatorString), 1) : AnimationUtils.loadInterpolator(context, motion.mQuantizeInterpolatorID);
                        } else {
                            i = childCount;
                            hashMap = hashMap2;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            i2 = i4;
                            rect = rect3;
                            if (motionLayout.mDebugPath != 0) {
                                Log.e("MotionLayout", Debug.getLocation() + "no widget for  " + Debug.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i = childCount;
                        hashMap = hashMap2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        rect = rect3;
                    }
                    if (this.mEnd != null) {
                        ConstraintWidget widget2 = getWidget(this.mLayoutEnd, childAt2);
                        if (widget2 != null) {
                            Rect access$20002 = MotionLayout.access$2000(motionLayout, widget2);
                            ConstraintSet constraintSet2 = this.mEnd;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            MotionPaths motionPaths2 = motionController2.mEndMotionPath;
                            int i7 = constraintSet2.mRotate;
                            if (i7 != 0) {
                                Rect rect4 = rect;
                                MotionController.rotate(access$20002, rect4, i7, width2, height2);
                                rect2 = rect4;
                            } else {
                                rect2 = access$20002;
                            }
                            motionPaths2.mTime = 1.0f;
                            motionPaths2.mPosition = 1.0f;
                            motionController2.readView(motionPaths2);
                            motionPaths2.setBounds(rect2.left, rect2.top, rect2.width(), rect2.height());
                            motionPaths2.applyParameters(constraintSet2.get(motionController2.mId));
                            motionController2.mEndPoint.setState(rect2, constraintSet2, i7, motionController2.mId);
                        } else if (motionLayout.mDebugPath != 0) {
                            Log.e("MotionLayout", Debug.getLocation() + "no widget for  " + Debug.getName(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i4 = i2 + 1;
                hashMap2 = hashMap;
                iArr2 = iArr;
                sparseArray2 = sparseArray;
                childCount = i;
            }
            SparseArray sparseArray3 = sparseArray2;
            int[] iArr3 = iArr2;
            int i8 = childCount;
            int i9 = 0;
            while (i9 < i8) {
                SparseArray sparseArray4 = sparseArray3;
                MotionController motionController3 = (MotionController) sparseArray4.get(iArr3[i9]);
                int i10 = motionController3.mStartMotionPath.mAnimateRelativeTo;
                if (i10 != -1) {
                    MotionController motionController4 = (MotionController) sparseArray4.get(i10);
                    motionController3.mStartMotionPath.setupRelative(motionController4, motionController4.mStartMotionPath);
                    motionController3.mEndMotionPath.setupRelative(motionController4, motionController4.mEndMotionPath);
                }
                i9++;
                sparseArray3 = sparseArray4;
            }
        }

        public final void computeStartEndSize(int i, int i2) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.mCurrentState == motionLayout.mBeginState) {
                ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutEnd;
                ConstraintSet constraintSet = this.mEnd;
                motionLayout.resolveSystem(constraintWidgetContainer, optimizationLevel, (constraintSet == null || constraintSet.mRotate == 0) ? i : i2, (constraintSet == null || constraintSet.mRotate == 0) ? i2 : i);
                ConstraintSet constraintSet2 = this.mStart;
                if (constraintSet2 != null) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    int i3 = constraintSet2.mRotate;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout.resolveSystem(constraintWidgetContainer2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            ConstraintSet constraintSet3 = this.mStart;
            if (constraintSet3 != null) {
                ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
                int i5 = constraintSet3.mRotate;
                motionLayout.resolveSystem(constraintWidgetContainer3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            ConstraintWidgetContainer constraintWidgetContainer4 = this.mLayoutEnd;
            ConstraintSet constraintSet4 = this.mEnd;
            int i6 = (constraintSet4 == null || constraintSet4.mRotate == 0) ? i : i2;
            if (constraintSet4 == null || constraintSet4.mRotate == 0) {
                i = i2;
            }
            motionLayout.resolveSystem(constraintWidgetContainer4, optimizationLevel, i6, i);
        }

        public final void initFrom(ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            this.mStart = constraintSet;
            this.mEnd = constraintSet2;
            this.mLayoutStart = new ConstraintWidgetContainer();
            this.mLayoutEnd = new ConstraintWidgetContainer();
            ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutStart;
            MotionLayout motionLayout = MotionLayout.this;
            BasicMeasure$Measurer basicMeasure$Measurer = ((ConstraintLayout) motionLayout).mLayoutWidget.mMeasurer;
            constraintWidgetContainer.mMeasurer = basicMeasure$Measurer;
            constraintWidgetContainer.mDependencyGraph.mMeasurer = basicMeasure$Measurer;
            ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutEnd;
            BasicMeasure$Measurer basicMeasure$Measurer2 = ((ConstraintLayout) motionLayout).mLayoutWidget.mMeasurer;
            constraintWidgetContainer2.mMeasurer = basicMeasure$Measurer2;
            constraintWidgetContainer2.mDependencyGraph.mMeasurer = basicMeasure$Measurer2;
            this.mLayoutStart.mChildren.clear();
            this.mLayoutEnd.mChildren.clear();
            copy(((ConstraintLayout) motionLayout).mLayoutWidget, this.mLayoutStart);
            copy(((ConstraintLayout) motionLayout).mLayoutWidget, this.mLayoutEnd);
            if (motionLayout.mTransitionLastPosition > 0.5d) {
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
            } else {
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
            }
            this.mLayoutStart.mIsRtl = motionLayout.isRtl();
            ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
            constraintWidgetContainer3.mBasicMeasureSolver.updateHierarchy(constraintWidgetContainer3);
            this.mLayoutEnd.mIsRtl = motionLayout.isRtl();
            ConstraintWidgetContainer constraintWidgetContainer4 = this.mLayoutEnd;
            constraintWidgetContainer4.mBasicMeasureSolver.updateHierarchy(constraintWidgetContainer4);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                int i = layoutParams.width;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (i == -2) {
                    this.mLayoutStart.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    this.mLayoutEnd.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    this.mLayoutStart.setVerticalDimensionBehaviour(dimensionBehaviour);
                    this.mLayoutEnd.setVerticalDimensionBehaviour(dimensionBehaviour);
                }
            }
        }

        public final void reEvaluateState() {
            ConstraintWidgetContainer constraintWidgetContainer;
            boolean z;
            MotionLayout motionLayout = MotionLayout.this;
            int i = motionLayout.mLastWidthMeasureSpec;
            int i2 = motionLayout.mLastHeightMeasureSpec;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            motionLayout.mWidthMeasureMode = mode;
            motionLayout.mHeightMeasureMode = mode2;
            computeStartEndSize(i, i2);
            int i3 = 0;
            if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                computeStartEndSize(i, i2);
                motionLayout.mStartWrapWidth = this.mLayoutStart.getWidth();
                motionLayout.mStartWrapHeight = this.mLayoutStart.getHeight();
                motionLayout.mEndWrapWidth = this.mLayoutEnd.getWidth();
                int height = this.mLayoutEnd.getHeight();
                motionLayout.mEndWrapHeight = height;
                motionLayout.mMeasureDuringTransition = (motionLayout.mStartWrapWidth == motionLayout.mEndWrapWidth && motionLayout.mStartWrapHeight == height) ? false : true;
            }
            int i4 = motionLayout.mStartWrapWidth;
            int i5 = motionLayout.mStartWrapHeight;
            int i6 = motionLayout.mWidthMeasureMode;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout.mPostInterpolationPosition * (motionLayout.mEndWrapWidth - i4)) + i4);
            }
            int i7 = motionLayout.mHeightMeasureMode;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i5 = (int) ((motionLayout.mPostInterpolationPosition * (motionLayout.mEndWrapHeight - i5)) + i5);
            }
            ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
            if (constraintWidgetContainer2.mWidthMeasuredTooSmall || this.mLayoutEnd.mWidthMeasuredTooSmall) {
                constraintWidgetContainer = constraintWidgetContainer2;
                z = true;
            } else {
                constraintWidgetContainer = constraintWidgetContainer2;
                z = false;
            }
            motionLayout.resolveMeasuredDimension(i, i2, i4, i5, z, constraintWidgetContainer.mHeightMeasuredTooSmall || this.mLayoutEnd.mHeightMeasuredTooSmall);
            HashMap hashMap = motionLayout.mFrameArrayList;
            int childCount = motionLayout.getChildCount();
            motionLayout.mModel.build();
            motionLayout.mInTransition = true;
            SparseArray sparseArray = new SparseArray();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = motionLayout.getChildAt(i8);
                sparseArray.put(childAt.getId(), (MotionController) hashMap.get(childAt));
            }
            int width = motionLayout.getWidth();
            int height2 = motionLayout.getHeight();
            MotionScene.Transition transition = motionLayout.mScene.mCurrentTransition;
            int i9 = transition != null ? transition.mPathMotionArc : -1;
            if (i9 != -1) {
                for (int i10 = 0; i10 < childCount; i10++) {
                    MotionController motionController = (MotionController) hashMap.get(motionLayout.getChildAt(i10));
                    if (motionController != null) {
                        motionController.mPathMotionArc = i9;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[hashMap.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                MotionController motionController2 = (MotionController) hashMap.get(motionLayout.getChildAt(i12));
                int i13 = motionController2.mStartMotionPath.mAnimateRelativeTo;
                if (i13 != -1) {
                    sparseBooleanArray.put(i13, true);
                    iArr[i11] = motionController2.mStartMotionPath.mAnimateRelativeTo;
                    i11++;
                }
            }
            for (int i14 = 0; i14 < i11; i14++) {
                MotionController motionController3 = (MotionController) hashMap.get(motionLayout.findViewById(iArr[i14]));
                if (motionController3 != null) {
                    motionLayout.mScene.getKeyFrames(motionController3);
                    motionController3.setup(width, height2, System.nanoTime());
                }
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = motionLayout.getChildAt(i15);
                MotionController motionController4 = (MotionController) hashMap.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && motionController4 != null) {
                    motionLayout.mScene.getKeyFrames(motionController4);
                    motionController4.setup(width, height2, System.nanoTime());
                }
            }
            MotionScene.Transition transition2 = motionLayout.mScene.mCurrentTransition;
            float f = transition2 != null ? transition2.mStagger : 0.0f;
            if (f != RecyclerView.DECELERATION_RATE) {
                boolean z2 = ((double) f) < 0.0d;
                float abs = Math.abs(f);
                float f2 = -3.4028235E38f;
                float f3 = Float.MAX_VALUE;
                float f4 = -3.4028235E38f;
                float f5 = Float.MAX_VALUE;
                for (int i16 = 0; i16 < childCount; i16++) {
                    MotionController motionController5 = (MotionController) hashMap.get(motionLayout.getChildAt(i16));
                    if (!Float.isNaN(motionController5.mMotionStagger)) {
                        for (int i17 = 0; i17 < childCount; i17++) {
                            MotionController motionController6 = (MotionController) hashMap.get(motionLayout.getChildAt(i17));
                            if (!Float.isNaN(motionController6.mMotionStagger)) {
                                f3 = Math.min(f3, motionController6.mMotionStagger);
                                f2 = Math.max(f2, motionController6.mMotionStagger);
                            }
                        }
                        while (i3 < childCount) {
                            MotionController motionController7 = (MotionController) hashMap.get(motionLayout.getChildAt(i3));
                            if (!Float.isNaN(motionController7.mMotionStagger)) {
                                motionController7.mStaggerScale = 1.0f / (1.0f - abs);
                                float f6 = motionController7.mMotionStagger;
                                if (z2) {
                                    motionController7.mStaggerOffset = abs - (((f2 - f6) / (f2 - f3)) * abs);
                                } else {
                                    motionController7.mStaggerOffset = abs - (((f6 - f3) * abs) / (f2 - f3));
                                }
                            }
                            i3++;
                        }
                        return;
                    }
                    MotionPaths motionPaths = motionController5.mEndMotionPath;
                    float f7 = motionPaths.mX;
                    float f8 = motionPaths.mY;
                    float f9 = z2 ? f8 - f7 : f8 + f7;
                    f5 = Math.min(f5, f9);
                    f4 = Math.max(f4, f9);
                }
                while (i3 < childCount) {
                    MotionController motionController8 = (MotionController) hashMap.get(motionLayout.getChildAt(i3));
                    MotionPaths motionPaths2 = motionController8.mEndMotionPath;
                    float f10 = motionPaths2.mX;
                    float f11 = motionPaths2.mY;
                    float f12 = z2 ? f11 - f10 : f11 + f10;
                    motionController8.mStaggerScale = 1.0f / (1.0f - abs);
                    motionController8.mStaggerOffset = abs - (((f12 - f5) * abs) / (f4 - f5));
                    i3++;
                }
            }
        }

        public final void setupConstraintWidget(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            ConstraintSet.Constraint constraint;
            ConstraintSet.Constraint constraint2;
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), constraintWidgetContainer);
            if (constraintSet != null && constraintSet.mRotate != 0) {
                ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutEnd;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
                int i = MotionLayout.$r8$clinit;
                motionLayout.resolveSystem(constraintWidgetContainer2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
            }
            Iterator it = constraintWidgetContainer.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                constraintWidget.mAnimated = true;
                sparseArray.put(((View) constraintWidget.mCompanionWidget).getId(), constraintWidget);
            }
            Iterator it2 = constraintWidgetContainer.mChildren.iterator();
            while (it2.hasNext()) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) it2.next();
                View view = (View) constraintWidget2.mCompanionWidget;
                int id = view.getId();
                HashMap hashMap = constraintSet.mConstraints;
                if (hashMap.containsKey(Integer.valueOf(id)) && (constraint2 = (ConstraintSet.Constraint) hashMap.get(Integer.valueOf(id))) != null) {
                    constraint2.applyTo(layoutParams);
                }
                constraintWidget2.setWidth(constraintSet.get(view.getId()).layout.mWidth);
                constraintWidget2.setHeight(constraintSet.get(view.getId()).layout.mHeight);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id2 = constraintHelper.getId();
                    HashMap hashMap2 = constraintSet.mConstraints;
                    if (hashMap2.containsKey(Integer.valueOf(id2)) && (constraint = (ConstraintSet.Constraint) hashMap2.get(Integer.valueOf(id2))) != null && (constraintWidget2 instanceof HelperWidget)) {
                        constraintHelper.loadParameters(constraint, (HelperWidget) constraintWidget2, layoutParams, sparseArray);
                    }
                    if (view instanceof androidx.constraintlayout.widget.Barrier) {
                        ((androidx.constraintlayout.widget.Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
                int i2 = MotionLayout.$r8$clinit;
                motionLayout.applyConstraintsFromLayoutParams(false, view, constraintWidget2, layoutParams, sparseArray);
                if (constraintSet.get(view.getId()).propertySet.mVisibilityMode == 1) {
                    constraintWidget2.mVisibility = view.getVisibility();
                } else {
                    constraintWidget2.mVisibility = constraintSet.get(view.getId()).propertySet.visibility;
                }
            }
            Iterator it3 = constraintWidgetContainer.mChildren.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget3 = (ConstraintWidget) it3.next();
                if (constraintWidget3 instanceof VirtualLayout) {
                    ConstraintHelper constraintHelper2 = (ConstraintHelper) constraintWidget3.mCompanionWidget;
                    HelperWidget helperWidget = (HelperWidget) constraintWidget3;
                    constraintHelper2.getClass();
                    helperWidget.mWidgetsCount = 0;
                    Arrays.fill(helperWidget.mWidgets, (Object) null);
                    for (int i3 = 0; i3 < constraintHelper2.mCount; i3++) {
                        helperWidget.add(sparseArray.get(constraintHelper2.mIds[i3]));
                    }
                    VirtualLayout virtualLayout = (VirtualLayout) helperWidget;
                    for (int i4 = 0; i4 < virtualLayout.mWidgetsCount; i4++) {
                        ConstraintWidget constraintWidget4 = virtualLayout.mWidgets[i4];
                        if (constraintWidget4 != null) {
                            constraintWidget4.mInVirtualLayout = true;
                        }
                    }
                }
            }
        }
    }

    public final class MyTracker {
        public static final MyTracker sMe = new MyTracker();
        public VelocityTracker mTracker;
    }

    public final class StateCache {
        public float mProgress = Float.NaN;
        public float mVelocity = Float.NaN;
        public int mStartState = -1;
        public int mEndState = -1;

        public StateCache() {
        }

        public final void apply() {
            int i = this.mStartState;
            MotionLayout motionLayout = MotionLayout.this;
            if (i != -1 || this.mEndState != -1) {
                int i2 = this.mEndState;
                if (i == -1) {
                    motionLayout.transitionToState(i2);
                } else if (i2 == -1) {
                    motionLayout.setState(i, -1, -1);
                } else {
                    motionLayout.setTransition(i, i2);
                }
                motionLayout.setState$1(2);
            }
            boolean isNaN = Float.isNaN(this.mVelocity);
            float f = this.mProgress;
            if (isNaN) {
                if (Float.isNaN(f)) {
                    return;
                }
                motionLayout.setProgress(this.mProgress);
            } else {
                motionLayout.setProgress(f, this.mVelocity);
                this.mProgress = Float.NaN;
                this.mVelocity = Float.NaN;
                this.mStartState = -1;
                this.mEndState = -1;
            }
        }
    }

    public interface TransitionListener {
    }

    public MotionLayout(Context context) {
        super(context);
        this.mProgressInterpolator = null;
        this.mLastVelocity = RecyclerView.DECELERATION_RATE;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = RecyclerView.DECELERATION_RATE;
        this.mTransitionLastPosition = RecyclerView.DECELERATION_RATE;
        this.mTransitionGoalPosition = RecyclerView.DECELERATION_RATE;
        this.mInTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = RecyclerView.DECELERATION_RATE;
        this.mListenerState = 0;
        this.mListenerPosition = RecyclerView.DECELERATION_RATE;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new Easing(1);
        this.mInLayout = false;
        this.mOnComplete = null;
        new HashMap();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = 1;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList();
        init(null);
    }

    public static Rect access$2000(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        Rect rect = motionLayout.mTempRect;
        rect.top = constraintWidget.getY();
        rect.left = constraintWidget.getX();
        rect.right = constraintWidget.getWidth() + rect.left;
        rect.bottom = constraintWidget.getHeight() + rect.top;
        return rect;
    }

    public final void animateTo(float f) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        float f2 = this.mTransitionLastPosition;
        float f3 = this.mTransitionPosition;
        if (f2 != f3 && this.mTransitionInstantly) {
            this.mTransitionLastPosition = f3;
        }
        float f4 = this.mTransitionLastPosition;
        if (f4 == f) {
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = f;
        this.mTransitionDuration = (motionScene.mCurrentTransition != null ? r3.mDuration : motionScene.mDefaultDuration) / 1000.0f;
        setProgress(f);
        this.mInterpolator = null;
        this.mProgressInterpolator = this.mScene.getInterpolator();
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = System.nanoTime();
        this.mInTransition = true;
        this.mTransitionPosition = f4;
        this.mTransitionLastPosition = f4;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Iterator it;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        Paint paint;
        Paint paint2;
        int i4;
        Paint paint3;
        int i5;
        Paint paint4;
        float f;
        Paint paint5;
        int i6;
        double d;
        Paint paint6;
        float f2;
        String resourceEntryName;
        e0 e0Var;
        evaluate(false);
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (e0Var = motionScene.mViewTransitionController) != null) {
            ArrayList arrayList2 = (ArrayList) e0Var.h;
            ArrayList arrayList3 = (ArrayList) e0Var.f;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    ((ViewTransition.Animate) it2.next()).mutate();
                }
                ((ArrayList) e0Var.f).removeAll(arrayList2);
                arrayList2.clear();
                if (((ArrayList) e0Var.f).isEmpty()) {
                    e0Var.f = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.mScene == null) {
            return;
        }
        if ((this.mDebugPath & 1) == 1) {
            this.mFrames++;
            long nanoTime = System.nanoTime();
            long j = this.mLastDrawTime;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.mLastFps = ((int) ((this.mFrames / (r10 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.mFrames = 0;
                    this.mLastDrawTime = nanoTime;
                }
            } else {
                this.mLastDrawTime = nanoTime;
            }
            Paint paint7 = new Paint();
            paint7.setTextSize(42.0f);
            float f3 = ((int) (this.mTransitionLastPosition * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.mLastFps);
            sb.append(" fps ");
            int i7 = this.mBeginState;
            StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, i7 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i7), " -> "));
            int i8 = this.mEndState;
            m.append(i8 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i8));
            m.append(" (progress: ");
            m.append(f3);
            m.append(" ) state=");
            int i9 = this.mCurrentState;
            if (i9 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i9 != -1 ? getContext().getResources().getResourceEntryName(i9) : "UNDEFINED";
            }
            m.append(resourceEntryName);
            String sb2 = m.toString();
            paint7.setColor(-16777216);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint7);
            paint7.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint7);
        }
        if (this.mDebugPath > 1) {
            if (this.mDevModeDraw == null) {
                this.mDevModeDraw = new DevModeDraw();
            }
            DevModeDraw devModeDraw = this.mDevModeDraw;
            MotionScene motionScene2 = this.mScene;
            MotionScene.Transition transition = motionScene2.mCurrentTransition;
            int i10 = transition != null ? transition.mDuration : motionScene2.mDefaultDuration;
            int i11 = this.mDebugPath;
            Paint paint8 = devModeDraw.mPaintGraph;
            Paint paint9 = devModeDraw.mPaintKeyframes;
            Paint paint10 = devModeDraw.mFillPaint;
            int i12 = devModeDraw.mShadowTranslate;
            Paint paint11 = devModeDraw.mPaint;
            MotionLayout motionLayout = MotionLayout.this;
            HashMap hashMap = this.mFrameArrayList;
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            if ((i11 & 1) == 2) {
                String str = motionLayout.getContext().getResources().getResourceName(motionLayout.mEndState) + ":" + motionLayout.mTransitionLastPosition;
                canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, devModeDraw.mTextPaint);
                canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint11);
            }
            Iterator it3 = hashMap.values().iterator();
            while (it3.hasNext()) {
                MotionController motionController = (MotionController) it3.next();
                MotionPaths motionPaths = motionController.mStartMotionPath;
                ArrayList arrayList4 = motionController.mMotionPaths;
                int i13 = motionPaths.mDrawPath;
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    i13 = Math.max(i13, ((MotionPaths) it4.next()).mDrawPath);
                }
                int max = Math.max(i13, motionController.mEndMotionPath.mDrawPath);
                if (i11 > 0 && max == 0) {
                    max = 1;
                }
                if (max != 0) {
                    float[] fArr = devModeDraw.mKeyFramePoints;
                    int[] iArr = devModeDraw.mPathMode;
                    if (fArr != null) {
                        it = it3;
                        double[] timePoints = motionController.mSpline[0].getTimePoints();
                        if (iArr != null) {
                            Iterator it5 = arrayList4.iterator();
                            int i14 = 0;
                            while (it5.hasNext()) {
                                iArr[i14] = ((MotionPaths) it5.next()).mMode;
                                i14++;
                                arrayList4 = arrayList4;
                            }
                        }
                        arrayList = arrayList4;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < timePoints.length) {
                            float[] fArr2 = fArr;
                            double[] dArr = timePoints;
                            motionController.mSpline[0].getPos(timePoints[i15], motionController.mInterpolateData);
                            motionController.mStartMotionPath.getCenter(dArr[i15], motionController.mInterpolateVariables, motionController.mInterpolateData, fArr2, i16);
                            i16 += 2;
                            i15++;
                            fArr = fArr2;
                            i10 = i10;
                            timePoints = dArr;
                        }
                        i = i10;
                        i2 = i16 / 2;
                    } else {
                        it = it3;
                        arrayList = arrayList4;
                        i = i10;
                        i2 = 0;
                    }
                    devModeDraw.mKeyFrameCount = i2;
                    if (max >= 1) {
                        int i17 = i / 16;
                        float[] fArr3 = devModeDraw.mPoints;
                        if (fArr3 == null || fArr3.length != i17 * 2) {
                            devModeDraw.mPoints = new float[i17 * 2];
                            devModeDraw.mPath = new Path();
                        }
                        float f4 = i12;
                        canvas.translate(f4, f4);
                        paint11.setColor(1996488704);
                        paint10.setColor(1996488704);
                        paint9.setColor(1996488704);
                        paint8.setColor(1996488704);
                        float[] fArr4 = devModeDraw.mPoints;
                        float f5 = 1.0f / (i17 - 1);
                        HashMap hashMap2 = motionController.mAttributesMap;
                        float f6 = 1.0f;
                        ViewSpline viewSpline = hashMap2 == null ? null : (ViewSpline) hashMap2.get("translationX");
                        HashMap hashMap3 = motionController.mAttributesMap;
                        ViewSpline viewSpline2 = hashMap3 == null ? null : (ViewSpline) hashMap3.get("translationY");
                        i3 = i11;
                        HashMap hashMap4 = motionController.mCycleMap;
                        ViewOscillator viewOscillator = hashMap4 == null ? null : (ViewOscillator) hashMap4.get("translationX");
                        HashMap hashMap5 = motionController.mCycleMap;
                        ViewOscillator viewOscillator2 = hashMap5 == null ? null : (ViewOscillator) hashMap5.get("translationY");
                        int i18 = 0;
                        while (true) {
                            float f7 = Float.NaN;
                            float f8 = RecyclerView.DECELERATION_RATE;
                            if (i18 >= i17) {
                                break;
                            }
                            int i19 = i17;
                            float f9 = i18 * f5;
                            float f10 = motionController.mStaggerScale;
                            if (f10 != f6) {
                                float f11 = motionController.mStaggerOffset;
                                if (f9 < f11) {
                                    f2 = f11;
                                    f = 0.0f;
                                } else {
                                    f2 = f11;
                                    f = f9;
                                }
                                i5 = i18;
                                paint4 = paint8;
                                if (f > f2 && f < 1.0d) {
                                    f = Math.min((f - f2) * f10, f6);
                                }
                            } else {
                                i5 = i18;
                                paint4 = paint8;
                                f = f9;
                            }
                            double d2 = f;
                            Easing easing = motionPaths.mKeyFrameEasing;
                            Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                Iterator it7 = it6;
                                MotionPaths motionPaths2 = (MotionPaths) it6.next();
                                MotionPaths motionPaths3 = motionPaths;
                                Easing easing2 = motionPaths2.mKeyFrameEasing;
                                if (easing2 != null) {
                                    float f12 = motionPaths2.mTime;
                                    if (f12 < f) {
                                        f8 = f12;
                                        easing = easing2;
                                    } else if (Float.isNaN(f7)) {
                                        f7 = motionPaths2.mTime;
                                    }
                                }
                                it6 = it7;
                                motionPaths = motionPaths3;
                            }
                            MotionPaths motionPaths4 = motionPaths;
                            if (easing != null) {
                                if (Float.isNaN(f7)) {
                                    f7 = 1.0f;
                                }
                                paint5 = paint10;
                                i6 = i12;
                                d = (((float) easing.get((f - f8) / r19)) * (f7 - f8)) + f8;
                            } else {
                                paint5 = paint10;
                                i6 = i12;
                                d = d2;
                            }
                            motionController.mSpline[0].getPos(d, motionController.mInterpolateData);
                            ArcCurveFit arcCurveFit = motionController.mArcSpline;
                            if (arcCurveFit != null) {
                                double[] dArr2 = motionController.mInterpolateData;
                                paint6 = paint5;
                                if (dArr2.length > 0) {
                                    arcCurveFit.getPos(d, dArr2);
                                }
                            } else {
                                paint6 = paint5;
                            }
                            int i20 = i5 * 2;
                            motionController.mStartMotionPath.getCenter(d, motionController.mInterpolateVariables, motionController.mInterpolateData, fArr4, i20);
                            if (viewOscillator != null) {
                                fArr4[i20] = viewOscillator.get(f) + fArr4[i20];
                            } else if (viewSpline != null) {
                                fArr4[i20] = viewSpline.get(f) + fArr4[i20];
                            }
                            if (viewOscillator2 != null) {
                                int i21 = i20 + 1;
                                fArr4[i21] = viewOscillator2.get(f) + fArr4[i21];
                            } else if (viewSpline2 != null) {
                                int i22 = i20 + 1;
                                fArr4[i22] = viewSpline2.get(f) + fArr4[i22];
                            }
                            i18 = i5 + 1;
                            i17 = i19;
                            paint8 = paint4;
                            motionPaths = motionPaths4;
                            i12 = i6;
                            paint10 = paint6;
                            f6 = 1.0f;
                        }
                        MotionPaths motionPaths5 = motionPaths;
                        Paint paint12 = paint8;
                        devModeDraw.drawAll(canvas, max, devModeDraw.mKeyFrameCount, motionController);
                        paint11.setColor(-21965);
                        paint9.setColor(-2067046);
                        paint2 = paint10;
                        paint2.setColor(-2067046);
                        Paint paint13 = paint12;
                        paint13.setColor(-13391360);
                        int i23 = i12;
                        float f13 = -i23;
                        canvas.translate(f13, f13);
                        devModeDraw.drawAll(canvas, max, devModeDraw.mKeyFrameCount, motionController);
                        char c = 5;
                        if (max == 5) {
                            float[] fArr5 = devModeDraw.mRectangle;
                            devModeDraw.mPath.reset();
                            int i24 = 0;
                            while (i24 <= 50) {
                                char c2 = c;
                                float[] fArr6 = fArr5;
                                motionController.mSpline[0].getPos(motionController.getAdjustedPosition(i24 / 50.0f, null), motionController.mInterpolateData);
                                int[] iArr2 = motionController.mInterpolateVariables;
                                double[] dArr3 = motionController.mInterpolateData;
                                MotionPaths motionPaths6 = motionPaths5;
                                float f14 = motionPaths6.mX;
                                float f15 = motionPaths6.mY;
                                float f16 = motionPaths6.mWidth;
                                float f17 = motionPaths6.mHeight;
                                int i25 = i23;
                                MotionController motionController2 = motionController;
                                int i26 = 0;
                                while (true) {
                                    paint3 = paint13;
                                    if (i26 >= iArr2.length) {
                                        break;
                                    }
                                    int[] iArr3 = iArr2;
                                    float f18 = (float) dArr3[i26];
                                    int i27 = iArr3[i26];
                                    int i28 = i26;
                                    if (i27 == 1) {
                                        f14 = f18;
                                    } else if (i27 == 2) {
                                        f15 = f18;
                                    } else if (i27 == 3) {
                                        f16 = f18;
                                    } else if (i27 == 4) {
                                        f17 = f18;
                                    }
                                    i26 = i28 + 1;
                                    iArr2 = iArr3;
                                    paint13 = paint3;
                                }
                                if (motionPaths6.mRelativeToController != null) {
                                    double d3 = f14;
                                    double d4 = f15;
                                    float sin = (float) (((Math.sin(d4) * d3) + 0.0d) - (f16 / 2.0f));
                                    f15 = (float) ((0.0d - (Math.cos(d4) * d3)) - (f17 / 2.0f));
                                    f14 = sin;
                                }
                                float f19 = f16 + f14;
                                float f20 = f17 + f15;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f21 = f14 + RecyclerView.DECELERATION_RATE;
                                float f22 = f15 + RecyclerView.DECELERATION_RATE;
                                float f23 = f19 + RecyclerView.DECELERATION_RATE;
                                float f24 = f20 + RecyclerView.DECELERATION_RATE;
                                fArr6[0] = f21;
                                fArr6[1] = f22;
                                fArr6[2] = f23;
                                fArr6[3] = f22;
                                fArr6[4] = f23;
                                fArr6[c2] = f24;
                                fArr6[6] = f21;
                                fArr6[7] = f24;
                                devModeDraw.mPath.moveTo(f21, f22);
                                devModeDraw.mPath.lineTo(fArr6[2], fArr6[3]);
                                devModeDraw.mPath.lineTo(fArr6[4], fArr6[c2]);
                                devModeDraw.mPath.lineTo(fArr6[6], fArr6[7]);
                                devModeDraw.mPath.close();
                                i24++;
                                motionPaths5 = motionPaths6;
                                fArr5 = fArr6;
                                c = c2;
                                motionController = motionController2;
                                paint13 = paint3;
                                i23 = i25;
                            }
                            i4 = i23;
                            paint = paint13;
                            paint11.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(devModeDraw.mPath, paint11);
                            canvas.translate(-2.0f, -2.0f);
                            paint11.setColor(-65536);
                            canvas.drawPath(devModeDraw.mPath, paint11);
                        } else {
                            i4 = i23;
                            paint = paint13;
                        }
                    } else {
                        i3 = i11;
                        paint = paint8;
                        paint2 = paint10;
                        i4 = i12;
                    }
                    paint10 = paint2;
                    it3 = it;
                    i10 = i;
                    i11 = i3;
                    paint8 = paint;
                    i12 = i4;
                }
            }
            canvas.restore();
        }
    }

    public final void endTrigger(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            MotionController motionController = (MotionController) this.mFrameArrayList.get(getChildAt(i));
            if (motionController != null && "button".equals(Debug.getName(motionController.mView)) && motionController.mKeyTriggers != null) {
                int i2 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = motionController.mKeyTriggers;
                    if (i2 < keyTriggerArr.length) {
                        keyTriggerArr[i2].conditionallyFire(motionController.mView, z ? -100.0f : 100.0f);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void evaluate(boolean z) {
        boolean z2;
        char c;
        int childCount;
        Interpolator interpolator;
        int i;
        float f;
        int i2;
        float f2;
        boolean z3;
        if (this.mTransitionLastTime == -1) {
            this.mTransitionLastTime = System.nanoTime();
        }
        float f3 = this.mTransitionLastPosition;
        float f4 = RecyclerView.DECELERATION_RATE;
        if (f3 > RecyclerView.DECELERATION_RATE && f3 < 1.0f) {
            this.mCurrentState = -1;
        }
        boolean z4 = false;
        if (this.mKeepAnimating || (this.mInTransition && (z || this.mTransitionGoalPosition != f3))) {
            float signum = Math.signum(this.mTransitionGoalPosition - f3);
            long nanoTime = System.nanoTime();
            MotionInterpolator motionInterpolator = this.mInterpolator;
            float f5 = motionInterpolator == null ? (((nanoTime - this.mTransitionLastTime) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f;
            float f6 = this.mTransitionLastPosition + f5;
            if (this.mTransitionInstantly) {
                f6 = this.mTransitionGoalPosition;
            }
            if ((signum <= RecyclerView.DECELERATION_RATE || f6 < this.mTransitionGoalPosition) && (signum > RecyclerView.DECELERATION_RATE || f6 > this.mTransitionGoalPosition)) {
                z2 = false;
            } else {
                f6 = this.mTransitionGoalPosition;
                this.mInTransition = false;
                z2 = true;
            }
            this.mTransitionLastPosition = f6;
            this.mTransitionPosition = f6;
            this.mTransitionLastTime = nanoTime;
            if (motionInterpolator == null || z2) {
                this.mLastVelocity = f5;
            } else if (this.mTemporalInterpolator) {
                float interpolation = motionInterpolator.getInterpolation((nanoTime - this.mAnimationStartTime) * 1.0E-9f);
                MotionInterpolator motionInterpolator2 = this.mInterpolator;
                StopLogic stopLogic = this.mStopLogic;
                c = motionInterpolator2 == stopLogic ? stopLogic.mEngine.isStopped() ? (char) 2 : (char) 1 : (char) 0;
                this.mTransitionLastPosition = interpolation;
                this.mTransitionLastTime = nanoTime;
                MotionInterpolator motionInterpolator3 = this.mInterpolator;
                if (motionInterpolator3 != null) {
                    float velocity = motionInterpolator3.getVelocity();
                    this.mLastVelocity = velocity;
                    if (Math.abs(velocity) * this.mTransitionDuration <= 1.0E-5f && c == 2) {
                        this.mInTransition = false;
                    }
                    if (velocity > RecyclerView.DECELERATION_RATE && interpolation >= 1.0f) {
                        this.mTransitionLastPosition = 1.0f;
                        this.mInTransition = false;
                        interpolation = 1.0f;
                    }
                    if (velocity < RecyclerView.DECELERATION_RATE && interpolation <= RecyclerView.DECELERATION_RATE) {
                        this.mTransitionLastPosition = RecyclerView.DECELERATION_RATE;
                        this.mInTransition = false;
                        f6 = 0.0f;
                        if (Math.abs(this.mLastVelocity) > 1.0E-5f) {
                            setState$1(3);
                        }
                        if (c != 1) {
                            if ((signum > RecyclerView.DECELERATION_RATE && f6 >= this.mTransitionGoalPosition) || (signum <= RecyclerView.DECELERATION_RATE && f6 <= this.mTransitionGoalPosition)) {
                                f6 = this.mTransitionGoalPosition;
                                this.mInTransition = false;
                            }
                            if (f6 >= 1.0f || f6 <= RecyclerView.DECELERATION_RATE) {
                                this.mInTransition = false;
                                setState$1(4);
                            }
                        }
                        childCount = getChildCount();
                        this.mKeepAnimating = false;
                        long nanoTime2 = System.nanoTime();
                        this.mPostInterpolationPosition = f6;
                        Interpolator interpolator2 = this.mProgressInterpolator;
                        float interpolation2 = interpolator2 == null ? f6 : interpolator2.getInterpolation(f6);
                        interpolator = this.mProgressInterpolator;
                        if (interpolator != null) {
                            float interpolation3 = interpolator.getInterpolation((signum / this.mTransitionDuration) + f6);
                            this.mLastVelocity = interpolation3;
                            this.mLastVelocity = interpolation3 - this.mProgressInterpolator.getInterpolation(f6);
                        }
                        i = 0;
                        while (i < childCount) {
                            View childAt = getChildAt(i);
                            MotionController motionController = (MotionController) this.mFrameArrayList.get(childAt);
                            if (motionController != null) {
                                f2 = f4;
                                this.mKeepAnimating = motionController.interpolate(interpolation2, nanoTime2, childAt, this.mKeyCache) | this.mKeepAnimating;
                            } else {
                                f2 = f4;
                            }
                            i++;
                            f4 = f2;
                        }
                        f = f4;
                        boolean z5 = (signum <= RecyclerView.DECELERATION_RATE && f6 >= this.mTransitionGoalPosition) || (signum <= f && f6 <= this.mTransitionGoalPosition);
                        if (!this.mKeepAnimating && !this.mInTransition && z5) {
                            setState$1(4);
                        }
                        if (this.mMeasureDuringTransition) {
                            requestLayout();
                        }
                        this.mKeepAnimating = (!z5) | this.mKeepAnimating;
                        if (f6 <= f && (i2 = this.mBeginState) != -1 && this.mCurrentState != i2) {
                            this.mCurrentState = i2;
                            this.mScene.getConstraintSet(i2).applyCustomAttributes(this);
                            setState$1(4);
                            z4 = true;
                        }
                        if (f6 >= 1.0d) {
                            int i3 = this.mCurrentState;
                            int i4 = this.mEndState;
                            if (i3 != i4) {
                                this.mCurrentState = i4;
                                this.mScene.getConstraintSet(i4).applyCustomAttributes(this);
                                setState$1(4);
                                z4 = true;
                            }
                        }
                        if (!this.mKeepAnimating || this.mInTransition) {
                            invalidate();
                        } else if ((signum > RecyclerView.DECELERATION_RATE && f6 == 1.0f) || (signum < f && f6 == f)) {
                            setState$1(4);
                        }
                        if (!this.mKeepAnimating && !this.mInTransition && ((signum > RecyclerView.DECELERATION_RATE && f6 == 1.0f) || (signum < f && f6 == f))) {
                            onNewStateAttachHandlers();
                        }
                    }
                }
                f6 = interpolation;
                if (Math.abs(this.mLastVelocity) > 1.0E-5f) {
                }
                if (c != 1) {
                }
                childCount = getChildCount();
                this.mKeepAnimating = false;
                long nanoTime22 = System.nanoTime();
                this.mPostInterpolationPosition = f6;
                Interpolator interpolator22 = this.mProgressInterpolator;
                if (interpolator22 == null) {
                }
                interpolator = this.mProgressInterpolator;
                if (interpolator != null) {
                }
                i = 0;
                while (i < childCount) {
                }
                f = f4;
                if (signum <= RecyclerView.DECELERATION_RATE) {
                }
                if (!this.mKeepAnimating) {
                    setState$1(4);
                }
                if (this.mMeasureDuringTransition) {
                }
                this.mKeepAnimating = (!z5) | this.mKeepAnimating;
                if (f6 <= f) {
                    this.mCurrentState = i2;
                    this.mScene.getConstraintSet(i2).applyCustomAttributes(this);
                    setState$1(4);
                    z4 = true;
                }
                if (f6 >= 1.0d) {
                }
                if (this.mKeepAnimating) {
                }
                invalidate();
                if (!this.mKeepAnimating) {
                    onNewStateAttachHandlers();
                }
            } else {
                float interpolation4 = motionInterpolator.getInterpolation(f6);
                MotionInterpolator motionInterpolator4 = this.mInterpolator;
                if (motionInterpolator4 != null) {
                    this.mLastVelocity = motionInterpolator4.getVelocity();
                } else {
                    this.mLastVelocity = ((motionInterpolator4.getInterpolation(f6 + f5) - interpolation4) * signum) / f5;
                }
                f6 = interpolation4;
            }
            c = 0;
            if (Math.abs(this.mLastVelocity) > 1.0E-5f) {
            }
            if (c != 1) {
            }
            childCount = getChildCount();
            this.mKeepAnimating = false;
            long nanoTime222 = System.nanoTime();
            this.mPostInterpolationPosition = f6;
            Interpolator interpolator222 = this.mProgressInterpolator;
            if (interpolator222 == null) {
            }
            interpolator = this.mProgressInterpolator;
            if (interpolator != null) {
            }
            i = 0;
            while (i < childCount) {
            }
            f = f4;
            if (signum <= RecyclerView.DECELERATION_RATE) {
            }
            if (!this.mKeepAnimating) {
            }
            if (this.mMeasureDuringTransition) {
            }
            this.mKeepAnimating = (!z5) | this.mKeepAnimating;
            if (f6 <= f) {
            }
            if (f6 >= 1.0d) {
            }
            if (this.mKeepAnimating) {
            }
            invalidate();
            if (!this.mKeepAnimating) {
            }
        } else {
            f = 0.0f;
        }
        float f7 = this.mTransitionLastPosition;
        if (f7 < 1.0f) {
            if (f7 <= f) {
                int i5 = this.mCurrentState;
                int i6 = this.mBeginState;
                z3 = i5 == i6 ? z4 : true;
                this.mCurrentState = i6;
            }
            this.mNeedsFireTransitionCompleted |= z4;
            if (z4 && !this.mInLayout) {
                requestLayout();
            }
            this.mTransitionPosition = this.mTransitionLastPosition;
        }
        int i7 = this.mCurrentState;
        int i8 = this.mEndState;
        z3 = i7 == i8 ? z4 : true;
        this.mCurrentState = i8;
        z4 = z3;
        this.mNeedsFireTransitionCompleted |= z4;
        if (z4) {
            requestLayout();
        }
        this.mTransitionPosition = this.mTransitionLastPosition;
    }

    public final void fireTransitionChange() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        if ((this.mTransitionListener == null && ((copyOnWriteArrayList2 = this.mTransitionListeners) == null || copyOnWriteArrayList2.isEmpty())) || this.mListenerPosition == this.mTransitionPosition) {
            return;
        }
        if (this.mListenerState != -1 && (copyOnWriteArrayList = this.mTransitionListeners) != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TransitionListener) it.next()).getClass();
            }
        }
        this.mListenerState = -1;
        this.mListenerPosition = this.mTransitionPosition;
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.getClass();
        }
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.mTransitionListeners;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((TransitionListener) it2.next()).getClass();
            }
        }
    }

    public final void fireTransitionCompleted() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            ArrayList arrayList = this.mTransitionCompleted;
            int intValue = !arrayList.isEmpty() ? ((Integer) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList)).intValue() : -1;
            int i = this.mCurrentState;
            if (intValue != i && i != -1) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        processTransitionCompleted();
        Recorder$$ExternalSyntheticLambda15 recorder$$ExternalSyntheticLambda15 = this.mOnComplete;
        if (recorder$$ExternalSyntheticLambda15 != null) {
            recorder$$ExternalSyntheticLambda15.run();
            this.mOnComplete = null;
        }
    }

    public final void getAnchorDpDt(int i, float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        View viewById = getViewById(i);
        MotionController motionController = (MotionController) this.mFrameArrayList.get(viewById);
        if (motionController == null) {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewById == null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "") : viewById.getContext().getResources().getResourceName(i)));
            return;
        }
        MotionPaths motionPaths = motionController.mStartMotionPath;
        float[] fArr2 = motionController.mVelocity;
        float adjustedPosition = motionController.getAdjustedPosition(f, fArr2);
        CurveFit[] curveFitArr = motionController.mSpline;
        int i2 = 0;
        if (curveFitArr != null) {
            double d = adjustedPosition;
            curveFitArr[0].getSlope(d, motionController.mInterpolateVelocity);
            motionController.mSpline[0].getPos(d, motionController.mInterpolateData);
            float f4 = fArr2[0];
            while (true) {
                dArr = motionController.mInterpolateVelocity;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * f4;
                i2++;
            }
            ArcCurveFit arcCurveFit = motionController.mArcSpline;
            if (arcCurveFit != null) {
                double[] dArr2 = motionController.mInterpolateData;
                if (dArr2.length > 0) {
                    arcCurveFit.getPos(d, dArr2);
                    motionController.mArcSpline.getSlope(d, motionController.mInterpolateVelocity);
                    int[] iArr = motionController.mInterpolateVariables;
                    double[] dArr3 = motionController.mInterpolateVelocity;
                    double[] dArr4 = motionController.mInterpolateData;
                    motionPaths.getClass();
                    MotionPaths.setDpDt(f2, f3, fArr, iArr, dArr3, dArr4);
                }
            } else {
                int[] iArr2 = motionController.mInterpolateVariables;
                double[] dArr5 = motionController.mInterpolateData;
                motionPaths.getClass();
                MotionPaths.setDpDt(f2, f3, fArr, iArr2, dArr, dArr5);
            }
        } else {
            MotionPaths motionPaths2 = motionController.mEndMotionPath;
            float f5 = motionPaths2.mX - motionPaths.mX;
            float f6 = motionPaths2.mY - motionPaths.mY;
            float f7 = motionPaths2.mWidth - motionPaths.mWidth;
            float f8 = (motionPaths2.mHeight - motionPaths.mHeight) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
        }
        viewById.getY();
    }

    public final boolean handlesTouchEvent(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean onTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (handlesTouchEvent((r3.getLeft() + f) - view.getScrollX(), (r3.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            RectF rectF = this.mBoundsCheck;
            rectF.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f3, f4);
                    if (this.mInverseMatrix == null) {
                        this.mInverseMatrix = new Matrix();
                    }
                    matrix.invert(this.mInverseMatrix);
                    obtain.transform(this.mInverseMatrix);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    public final void init(AttributeSet attributeSet) {
        MotionScene motionScene;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.mScene = new MotionScene(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, RecyclerView.DECELERATION_RATE);
                    this.mInTransition = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.mDebugPath == 0) {
                        this.mDebugPath = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.mDebugPath = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            MotionScene motionScene2 = this.mScene;
            if (motionScene2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int startId = motionScene2.getStartId();
                MotionScene motionScene3 = this.mScene;
                ConstraintSet constraintSet = motionScene3.getConstraintSet(motionScene3.getStartId());
                String name = Debug.getName(getContext(), startId);
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("CHECK: ", name, " ALL VIEWS SHOULD HAVE ID's ");
                        m3m.append(childAt.getClass().getName());
                        m3m.append(" does not!");
                        Log.w("MotionLayout", m3m.toString());
                    }
                    if (constraintSet.getConstraint(id) == null) {
                        StringBuilder m3m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("CHECK: ", name, " NO CONSTRAINTS for ");
                        m3m2.append(Debug.getName(childAt));
                        Log.w("MotionLayout", m3m2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) constraintSet.mConstraints.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = numArr[i3].intValue();
                }
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr[i4];
                    String name2 = Debug.getName(getContext(), i5);
                    if (findViewById(iArr[i4]) == null) {
                        Log.w("MotionLayout", "CHECK: " + name + " NO View matches id " + name2);
                    }
                    if (constraintSet.get(i5).layout.mHeight == -1) {
                        Log.w("MotionLayout", Boxes$$ExternalSyntheticOutline1.m("CHECK: ", name, "(", name2, ") no LAYOUT_HEIGHT"));
                    }
                    if (constraintSet.get(i5).layout.mWidth == -1) {
                        Log.w("MotionLayout", Boxes$$ExternalSyntheticOutline1.m("CHECK: ", name, "(", name2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                Iterator it = this.mScene.mTransitionList.iterator();
                while (it.hasNext()) {
                    MotionScene.Transition transition = (MotionScene.Transition) it.next();
                    if (transition == this.mScene.mCurrentTransition) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (transition.mConstraintSetStart == transition.mConstraintSetEnd) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i6 = transition.mConstraintSetStart;
                    int i7 = transition.mConstraintSetEnd;
                    String name3 = Debug.getName(getContext(), i6);
                    String name4 = Debug.getName(getContext(), i7);
                    if (sparseIntArray.get(i6) == i7) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + name3 + "->" + name4);
                    }
                    if (sparseIntArray2.get(i7) == i6) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + name3 + "->" + name4);
                    }
                    sparseIntArray.put(i6, i7);
                    sparseIntArray2.put(i7, i6);
                    if (this.mScene.getConstraintSet(i6) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + name3);
                    }
                    if (this.mScene.getConstraintSet(i7) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + name3);
                    }
                }
            }
        }
        if (this.mCurrentState != -1 || (motionScene = this.mScene) == null) {
            return;
        }
        this.mCurrentState = motionScene.getStartId();
        this.mBeginState = this.mScene.getStartId();
        MotionScene.Transition transition2 = this.mScene.mCurrentTransition;
        this.mEndState = transition2 != null ? transition2.mConstraintSetEnd : -1;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i) {
        MotionScene.Transition transition;
        if (i == 0) {
            this.mScene = null;
            return;
        }
        try {
            MotionScene motionScene = new MotionScene(getContext(), this, i);
            this.mScene = motionScene;
            int i2 = -1;
            if (this.mCurrentState == -1) {
                this.mCurrentState = motionScene.getStartId();
                this.mBeginState = this.mScene.getStartId();
                MotionScene.Transition transition2 = this.mScene.mCurrentTransition;
                if (transition2 != null) {
                    i2 = transition2.mConstraintSetEnd;
                }
                this.mEndState = i2;
            }
            if (!isAttachedToWindow()) {
                this.mScene = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                MotionScene motionScene2 = this.mScene;
                if (motionScene2 != null) {
                    ConstraintSet constraintSet = motionScene2.getConstraintSet(this.mCurrentState);
                    this.mScene.readFallback(this);
                    if (constraintSet != null) {
                        constraintSet.applyTo(this);
                    }
                    this.mBeginState = this.mCurrentState;
                }
                onNewStateAttachHandlers();
                StateCache stateCache = this.mStateCache;
                if (stateCache != null) {
                    if (this.mDelayedApply) {
                        post(new AnonymousClass1(this, 0));
                        return;
                    } else {
                        stateCache.apply();
                        return;
                    }
                }
                MotionScene motionScene3 = this.mScene;
                if (motionScene3 == null || (transition = motionScene3.mCurrentTransition) == null || transition.mAutoTransition != 4) {
                    return;
                }
                transitionToEnd();
                setState$1(2);
                setState$1(3);
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        } catch (Exception e2) {
            Handlers$$ExternalSyntheticBUOutline0.m("unable to parse MotionScene file", e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        MotionScene.Transition transition;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (i = this.mCurrentState) != -1) {
            ConstraintSet constraintSet = motionScene.getConstraintSet(i);
            this.mScene.readFallback(this);
            if (constraintSet != null) {
                constraintSet.applyTo(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        StateCache stateCache = this.mStateCache;
        if (stateCache != null) {
            if (this.mDelayedApply) {
                post(new AnonymousClass1(this, 1));
                return;
            } else {
                stateCache.apply();
                return;
            }
        }
        MotionScene motionScene2 = this.mScene;
        if (motionScene2 == null || (transition = motionScene2.mCurrentTransition) == null || transition.mAutoTransition != 4) {
            return;
        }
        transitionToEnd();
        setState$1(2);
        setState$1(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00ff  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int i;
        RectF touchRegion;
        Iterator it;
        MotionScene motionScene = this.mScene;
        if (motionScene == null || !this.mInteractionEnabled) {
            return false;
        }
        e0 e0Var = motionScene.mViewTransitionController;
        if (e0Var != null) {
            ArrayList arrayList = (ArrayList) e0Var.b;
            MotionLayout motionLayout = (MotionLayout) e0Var.a;
            int i2 = motionLayout.mCurrentState;
            if (i2 != -1) {
                if (((HashSet) e0Var.c) == null) {
                    e0Var.c = new HashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ViewTransition viewTransition = (ViewTransition) it2.next();
                        int childCount = motionLayout.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = motionLayout.getChildAt(i3);
                            if (viewTransition.matchesView(childAt)) {
                                childAt.getId();
                                ((HashSet) e0Var.c).add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList arrayList2 = (ArrayList) e0Var.f;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator it3 = ((ArrayList) e0Var.f).iterator();
                    while (it3.hasNext()) {
                        ViewTransition.Animate animate = (ViewTransition.Animate) it3.next();
                        Rect rect2 = animate.mTempRec;
                        if (action != 1) {
                            if (action == 2) {
                                animate.mMC.mView.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !animate.mReverse) {
                                    animate.reverse();
                                }
                            }
                        } else if (!animate.mReverse) {
                            animate.reverse();
                        }
                    }
                }
                z = false;
                if (action == 0 || action == 1) {
                    MotionScene motionScene2 = motionLayout.mScene;
                    ConstraintSet constraintSet = motionScene2 == null ? null : motionScene2.getConstraintSet(i2);
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        ViewTransition viewTransition2 = (ViewTransition) it4.next();
                        int i4 = viewTransition2.mOnStateTransition;
                        if (i4 == 1) {
                            if (action == 0) {
                                it = ((HashSet) e0Var.c).iterator();
                                while (it.hasNext()) {
                                    View view = (View) it.next();
                                    if (viewTransition2.matchesView(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            viewTransition2.applyTransition(e0Var, (MotionLayout) e0Var.a, i2, constraintSet, view);
                                        }
                                    }
                                }
                            }
                        } else if (i4 == 2) {
                            if (action == 1) {
                                it = ((HashSet) e0Var.c).iterator();
                                while (it.hasNext()) {
                                }
                            }
                        } else if (i4 == 3 && action == 0) {
                            it = ((HashSet) e0Var.c).iterator();
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                transition = this.mScene.mCurrentTransition;
                if (transition != null || transition.mDisable || (touchResponse = transition.mTouchResponse) == null) {
                    return z;
                }
                if ((motionEvent.getAction() == 0 && (touchRegion = touchResponse.getTouchRegion(this, new RectF())) != null && !touchRegion.contains(motionEvent.getX(), motionEvent.getY())) || (i = touchResponse.mTouchRegionId) == -1) {
                    return z;
                }
                View view2 = this.mRegionView;
                if (view2 == null || view2.getId() != i) {
                    this.mRegionView = findViewById(i);
                }
                View view3 = this.mRegionView;
                if (view3 == null) {
                    return z;
                }
                float left = view3.getLeft();
                float top = this.mRegionView.getTop();
                float right = this.mRegionView.getRight();
                float bottom = this.mRegionView.getBottom();
                RectF rectF = this.mBoundsCheck;
                rectF.set(left, top, right, bottom);
                return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || handlesTouchEvent((float) this.mRegionView.getLeft(), (float) this.mRegionView.getTop(), this.mRegionView, motionEvent)) ? z : onTouchEvent(motionEvent);
            }
        }
        z = false;
        transition = this.mScene.mCurrentTransition;
        return transition != null ? z : z;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.mInLayout = false;
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.mLastLayoutWidth != i5 || this.mLastLayoutHeight != i6) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i5;
            this.mLastLayoutHeight = i6;
            this.mInLayout = false;
        } catch (Throwable th) {
            this.mInLayout = false;
            throw th;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.mScene == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.mLastWidthMeasureSpec == i && this.mLastHeightMeasureSpec == i2) ? false : true;
        if (this.mNeedsFireTransitionCompleted) {
            this.mNeedsFireTransitionCompleted = false;
            onNewStateAttachHandlers();
            processTransitionCompleted();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.mLastWidthMeasureSpec = i;
        this.mLastHeightMeasureSpec = i2;
        int startId = this.mScene.getStartId();
        MotionScene.Transition transition = this.mScene.mCurrentTransition;
        int i3 = transition == null ? -1 : transition.mConstraintSetEnd;
        Model model = this.mModel;
        if ((!z3 && startId == model.mStartId && i3 == model.mEndId) || this.mBeginState == -1) {
            if (z3) {
                super.onMeasure(i, i2);
            }
            z = true;
        } else {
            super.onMeasure(i, i2);
            model.initFrom(this.mScene.getConstraintSet(startId), this.mScene.getConstraintSet(i3));
            model.reEvaluateState();
            model.mStartId = startId;
            model.mEndId = i3;
            z = false;
        }
        if (this.mMeasureDuringTransition || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int width = this.mLayoutWidget.getWidth() + getPaddingRight() + getPaddingLeft();
            int height = this.mLayoutWidget.getHeight() + paddingBottom;
            int i4 = this.mWidthMeasureMode;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                width = (int) ((this.mPostInterpolationPosition * (this.mEndWrapWidth - r1)) + this.mStartWrapWidth);
                requestLayout();
            }
            int i5 = this.mHeightMeasureMode;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                height = (int) ((this.mPostInterpolationPosition * (this.mEndWrapHeight - r2)) + this.mStartWrapHeight);
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = System.nanoTime();
        MotionInterpolator motionInterpolator = this.mInterpolator;
        float f = this.mTransitionLastPosition + (!(motionInterpolator instanceof StopLogic) ? (((nanoTime - this.mTransitionLastTime) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            f = this.mTransitionGoalPosition;
        }
        if ((signum <= RecyclerView.DECELERATION_RATE || f < this.mTransitionGoalPosition) && (signum > RecyclerView.DECELERATION_RATE || f > this.mTransitionGoalPosition)) {
            z2 = false;
        } else {
            f = this.mTransitionGoalPosition;
        }
        if (motionInterpolator != null && !z2) {
            f = this.mTemporalInterpolator ? motionInterpolator.getInterpolation((nanoTime - this.mAnimationStartTime) * 1.0E-9f) : motionInterpolator.getInterpolation(f);
        }
        if ((signum > RecyclerView.DECELERATION_RATE && f >= this.mTransitionGoalPosition) || (signum <= RecyclerView.DECELERATION_RATE && f <= this.mTransitionGoalPosition)) {
            f = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f;
        int childCount = getChildCount();
        long nanoTime2 = System.nanoTime();
        Interpolator interpolator = this.mProgressInterpolator;
        if (interpolator != null) {
            f = interpolator.getInterpolation(f);
        }
        float f2 = f;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            MotionController motionController = (MotionController) this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.interpolate(f2, nanoTime2, childAt, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        MotionScene.Transition transition;
        boolean z;
        float f;
        boolean z2;
        TouchResponse touchResponse;
        float f2;
        TouchResponse touchResponse2;
        TouchResponse touchResponse3;
        TouchResponse touchResponse4;
        int i4;
        MotionScene motionScene = this.mScene;
        if (motionScene == null || (transition = motionScene.mCurrentTransition) == null || (z = transition.mDisable)) {
            return;
        }
        int i5 = -1;
        if (z || (touchResponse4 = transition.mTouchResponse) == null || (i4 = touchResponse4.mTouchRegionId) == -1 || view.getId() == i4) {
            MotionScene.Transition transition2 = motionScene.mCurrentTransition;
            if ((transition2 == null || (touchResponse3 = transition2.mTouchResponse) == null) ? false : touchResponse3.mMoveWhenScrollAtTop) {
                TouchResponse touchResponse5 = transition.mTouchResponse;
                if (touchResponse5 != null && (touchResponse5.mFlags & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.mTransitionPosition;
                if ((f3 == 1.0f || f3 == RecyclerView.DECELERATION_RATE) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            TouchResponse touchResponse6 = transition.mTouchResponse;
            if (touchResponse6 == null || (touchResponse6.mFlags & 1) == 0) {
                f = 0.0f;
            } else {
                float f4 = i;
                float f5 = i2;
                MotionScene.Transition transition3 = motionScene.mCurrentTransition;
                if (transition3 == null || (touchResponse2 = transition3.mTouchResponse) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    float[] fArr = touchResponse2.mAnchorDpDt;
                    MotionLayout motionLayout = touchResponse2.mMotionLayout;
                    f = 0.0f;
                    motionLayout.getAnchorDpDt(touchResponse2.mTouchAnchorId, motionLayout.mTransitionLastPosition, touchResponse2.mTouchAnchorX, touchResponse2.mTouchAnchorY, fArr);
                    float f6 = touchResponse2.mTouchDirectionX;
                    if (f6 != RecyclerView.DECELERATION_RATE) {
                        if (fArr[0] == RecyclerView.DECELERATION_RATE) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        if (fArr[1] == RecyclerView.DECELERATION_RATE) {
                            fArr[1] = 1.0E-7f;
                        }
                        f2 = (f5 * touchResponse2.mTouchDirectionY) / fArr[1];
                    }
                }
                float f7 = this.mTransitionLastPosition;
                if ((f7 <= f && f2 < f) || (f7 >= 1.0f && f2 > f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new AnonymousClass1(view, 2));
                    return;
                }
            }
            float f8 = this.mTransitionPosition;
            long nanoTime = System.nanoTime();
            float f9 = i;
            this.mScrollTargetDX = f9;
            float f10 = i2;
            this.mScrollTargetDY = f10;
            this.mScrollTargetDT = (float) ((nanoTime - this.mScrollTargetTime) * 1.0E-9d);
            this.mScrollTargetTime = nanoTime;
            MotionScene.Transition transition4 = motionScene.mCurrentTransition;
            if (transition4 == null || (touchResponse = transition4.mTouchResponse) == null) {
                z2 = 1;
            } else {
                float[] fArr2 = touchResponse.mAnchorDpDt;
                MotionLayout motionLayout2 = touchResponse.mMotionLayout;
                float f11 = motionLayout2.mTransitionLastPosition;
                if (!touchResponse.mDragStarted) {
                    touchResponse.mDragStarted = true;
                    motionLayout2.setProgress(f11);
                }
                boolean z3 = true;
                touchResponse.mMotionLayout.getAnchorDpDt(touchResponse.mTouchAnchorId, f11, touchResponse.mTouchAnchorX, touchResponse.mTouchAnchorY, fArr2);
                if (Math.abs((touchResponse.mTouchDirectionY * fArr2[1]) + (touchResponse.mTouchDirectionX * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f12 = touchResponse.mTouchDirectionX;
                float max = Math.max(Math.min(f11 + (f12 != f ? (f9 * f12) / fArr2[0] : (f10 * touchResponse.mTouchDirectionY) / fArr2[1]), 1.0f), f);
                z2 = z3;
                if (max != motionLayout2.mTransitionLastPosition) {
                    motionLayout2.setProgress(max);
                    z2 = z3;
                }
            }
            if (f8 != this.mTransitionPosition) {
                iArr[0] = i;
                iArr[z2] = i2;
            }
            evaluate(false);
            if (iArr[0] == 0 && iArr[z2] == 0) {
                return;
            }
            this.mUndergoingMotion = z2;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.mUndergoingMotion || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.mUndergoingMotion = false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.mScrollTargetTime = System.nanoTime();
        this.mScrollTargetDT = RecyclerView.DECELERATION_RATE;
        this.mScrollTargetDX = RecyclerView.DECELERATION_RATE;
        this.mScrollTargetDY = RecyclerView.DECELERATION_RATE;
    }

    public final void onNewStateAttachHandlers() {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        View view;
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        if (motionScene.autoTransition(this.mCurrentState, this)) {
            requestLayout();
            return;
        }
        int i = this.mCurrentState;
        if (i != -1) {
            MotionScene motionScene2 = this.mScene;
            ArrayList arrayList = motionScene2.mAbstractTransitionList;
            ArrayList arrayList2 = motionScene2.mTransitionList;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                MotionScene.Transition transition2 = (MotionScene.Transition) it.next();
                if (transition2.mOnClicks.size() > 0) {
                    Iterator it2 = transition2.mOnClicks.iterator();
                    while (it2.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it2.next()).removeOnClickListeners(this);
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                MotionScene.Transition transition3 = (MotionScene.Transition) it3.next();
                if (transition3.mOnClicks.size() > 0) {
                    Iterator it4 = transition3.mOnClicks.iterator();
                    while (it4.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it4.next()).removeOnClickListeners(this);
                    }
                }
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                MotionScene.Transition transition4 = (MotionScene.Transition) it5.next();
                if (transition4.mOnClicks.size() > 0) {
                    Iterator it6 = transition4.mOnClicks.iterator();
                    while (it6.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it6.next()).addOnClickListeners(this, i, transition4);
                    }
                }
            }
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                MotionScene.Transition transition5 = (MotionScene.Transition) it7.next();
                if (transition5.mOnClicks.size() > 0) {
                    Iterator it8 = transition5.mOnClicks.iterator();
                    while (it8.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it8.next()).addOnClickListeners(this, i, transition5);
                    }
                }
            }
        }
        if (!this.mScene.supportTouch() || (transition = this.mScene.mCurrentTransition) == null || (touchResponse = transition.mTouchResponse) == null) {
            return;
        }
        MotionLayout motionLayout = touchResponse.mMotionLayout;
        int i2 = touchResponse.mTouchAnchorId;
        if (i2 != -1) {
            view = motionLayout.findViewById(i2);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + Debug.getName(motionLayout.getContext(), touchResponse.mTouchAnchorId));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new TouchResponse.AnonymousClass1(0));
            nestedScrollView.setOnScrollChangeListener(new TouchResponse.AnonymousClass2());
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        TouchResponse touchResponse;
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            boolean isRtl = isRtl();
            motionScene.mRtl = isRtl;
            MotionScene.Transition transition = motionScene.mCurrentTransition;
            if (transition == null || (touchResponse = transition.mTouchResponse) == null) {
                return;
            }
            touchResponse.setRTL(isRtl);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        MotionScene motionScene = this.mScene;
        return (motionScene == null || (transition = motionScene.mCurrentTransition) == null || (touchResponse = transition.mTouchResponse) == null || (touchResponse.mFlags & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i) {
        TouchResponse touchResponse;
        int i2;
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f = this.mScrollTargetDT;
            float f2 = RecyclerView.DECELERATION_RATE;
            if (f == RecyclerView.DECELERATION_RATE) {
                return;
            }
            float f3 = this.mScrollTargetDX / f;
            float f4 = this.mScrollTargetDY / f;
            MotionScene.Transition transition = motionScene.mCurrentTransition;
            if (transition == null || (touchResponse = transition.mTouchResponse) == null) {
                return;
            }
            float[] fArr = touchResponse.mAnchorDpDt;
            touchResponse.mDragStarted = false;
            MotionLayout motionLayout = touchResponse.mMotionLayout;
            float f5 = motionLayout.mTransitionLastPosition;
            motionLayout.getAnchorDpDt(touchResponse.mTouchAnchorId, f5, touchResponse.mTouchAnchorX, touchResponse.mTouchAnchorY, fArr);
            float f6 = touchResponse.mTouchDirectionX;
            float f7 = f6 != RecyclerView.DECELERATION_RATE ? (f3 * f6) / fArr[0] : (f4 * touchResponse.mTouchDirectionY) / fArr[1];
            if (!Float.isNaN(f7)) {
                f5 += f7 / 3.0f;
            }
            if (f5 == RecyclerView.DECELERATION_RATE || f5 == 1.0f || (i2 = touchResponse.mOnTouchUp) == 3) {
                return;
            }
            if (f5 >= 0.5d) {
                f2 = 1.0f;
            }
            motionLayout.touchAnimateTo(f2, f7, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x07aa A[RETURN] */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v25 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MyTracker myTracker;
        MyTracker myTracker2;
        TouchResponse touchResponse;
        MotionLayout motionLayout;
        char c;
        char c2;
        int i;
        char c3;
        char c4;
        float right;
        float f;
        int top;
        int bottom;
        int i2;
        float f2;
        float f3;
        int i3;
        boolean z;
        double d;
        int i4;
        float f4;
        ?? r19;
        MotionScene.Transition transition;
        MotionEvent motionEvent2;
        MotionScene.Transition transition2;
        int i5;
        MotionEvent motionEvent3;
        RectF rectF;
        Iterator it;
        float f5;
        MotionScene motionScene = this.mScene;
        if (motionScene == null || !this.mInteractionEnabled || !motionScene.supportTouch()) {
            return super.onTouchEvent(motionEvent);
        }
        MotionScene motionScene2 = this.mScene;
        MotionScene.Transition transition3 = motionScene2.mCurrentTransition;
        if (transition3 != null && transition3.mDisable) {
            return super.onTouchEvent(motionEvent);
        }
        int i6 = this.mCurrentState;
        MotionLayout motionLayout2 = motionScene2.mMotionLayout;
        RectF rectF2 = new RectF();
        if (motionScene2.mVelocityTracker == null) {
            motionLayout2.getClass();
            VelocityTracker obtain = VelocityTracker.obtain();
            MyTracker myTracker3 = MyTracker.sMe;
            myTracker3.mTracker = obtain;
            motionScene2.mVelocityTracker = myTracker3;
        }
        VelocityTracker velocityTracker = motionScene2.mVelocityTracker.mTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (i6 != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                motionScene2.mLastTouchX = motionEvent.getRawX();
                motionScene2.mLastTouchY = motionEvent.getRawY();
                motionScene2.mLastTouchDown = motionEvent;
                motionScene2.mIgnoreTouch = false;
                TouchResponse touchResponse2 = motionScene2.mCurrentTransition.mTouchResponse;
                if (touchResponse2 != null) {
                    RectF limitBoundsTo = touchResponse2.getLimitBoundsTo(motionLayout2, rectF2);
                    if (limitBoundsTo == null || limitBoundsTo.contains(motionScene2.mLastTouchDown.getX(), motionScene2.mLastTouchDown.getY())) {
                        RectF touchRegion = motionScene2.mCurrentTransition.mTouchResponse.getTouchRegion(motionLayout2, rectF2);
                        if (touchRegion == null || touchRegion.contains(motionScene2.mLastTouchDown.getX(), motionScene2.mLastTouchDown.getY())) {
                            motionScene2.mMotionOutsideRegion = false;
                        } else {
                            motionScene2.mMotionOutsideRegion = true;
                        }
                        TouchResponse touchResponse3 = motionScene2.mCurrentTransition.mTouchResponse;
                        float f6 = motionScene2.mLastTouchX;
                        float f7 = motionScene2.mLastTouchY;
                        touchResponse3.mLastTouchX = f6;
                        touchResponse3.mLastTouchY = f7;
                    } else {
                        motionScene2.mLastTouchDown = null;
                        motionScene2.mIgnoreTouch = true;
                    }
                }
            } else if (action == 2 && !motionScene2.mIgnoreTouch) {
                float rawY = motionEvent.getRawY() - motionScene2.mLastTouchY;
                float rawX = motionEvent.getRawX() - motionScene2.mLastTouchX;
                if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = motionScene2.mLastTouchDown) != null) {
                    if (i6 != -1) {
                        Sniffer sniffer = motionScene2.mStateSet;
                        if (sniffer == null || (i5 = sniffer.stateGetConstraintID(i6)) == -1) {
                            i5 = i6;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = motionScene2.mTransitionList.iterator();
                        while (it2.hasNext()) {
                            MotionScene.Transition transition4 = (MotionScene.Transition) it2.next();
                            if (transition4.mConstraintSetStart == i5 || transition4.mConstraintSetEnd == i5) {
                                arrayList.add(transition4);
                            }
                        }
                        RectF rectF3 = new RectF();
                        Iterator it3 = arrayList.iterator();
                        float f8 = RecyclerView.DECELERATION_RATE;
                        transition2 = null;
                        while (it3.hasNext()) {
                            MotionScene.Transition transition5 = (MotionScene.Transition) it3.next();
                            if (transition5.mDisable) {
                                motionEvent3 = motionEvent2;
                            } else {
                                TouchResponse touchResponse4 = transition5.mTouchResponse;
                                if (touchResponse4 != null) {
                                    touchResponse4.setRTL(motionScene2.mRtl);
                                    RectF touchRegion2 = transition5.mTouchResponse.getTouchRegion(motionLayout2, rectF3);
                                    if (touchRegion2 != null) {
                                        motionEvent3 = motionEvent2;
                                        if (!touchRegion2.contains(motionEvent2.getX(), motionEvent3.getY())) {
                                        }
                                    } else {
                                        motionEvent3 = motionEvent2;
                                    }
                                    RectF limitBoundsTo2 = transition5.mTouchResponse.getLimitBoundsTo(motionLayout2, rectF3);
                                    if (limitBoundsTo2 == null || limitBoundsTo2.contains(motionEvent3.getX(), motionEvent3.getY())) {
                                        TouchResponse touchResponse5 = transition5.mTouchResponse;
                                        float f9 = (touchResponse5.mTouchDirectionY * rawY) + (touchResponse5.mTouchDirectionX * rawX);
                                        if (touchResponse5.mIsRotateMode) {
                                            float x = motionEvent3.getX();
                                            transition5.mTouchResponse.getClass();
                                            float y = motionEvent3.getY();
                                            transition5.mTouchResponse.getClass();
                                            rectF = rectF3;
                                            it = it3;
                                            f5 = f8;
                                            f9 = ((float) (Math.atan2(rawY + r12, rawX + r6) - Math.atan2(x - 0.5f, y - 0.5f))) * 10.0f;
                                        } else {
                                            rectF = rectF3;
                                            it = it3;
                                            f5 = f8;
                                        }
                                        float f10 = f9 * (transition5.mConstraintSetEnd == i6 ? -1.0f : 1.1f);
                                        if (f10 > f5) {
                                            f8 = f10;
                                            transition2 = transition5;
                                            motionEvent2 = motionEvent3;
                                            rectF3 = rectF;
                                            it3 = it;
                                        }
                                    }
                                } else {
                                    motionEvent3 = motionEvent2;
                                    rectF = rectF3;
                                    it = it3;
                                    f5 = f8;
                                }
                                f8 = f5;
                                motionEvent2 = motionEvent3;
                                rectF3 = rectF;
                                it3 = it;
                            }
                            motionEvent2 = motionEvent3;
                        }
                    } else {
                        transition2 = motionScene2.mCurrentTransition;
                    }
                    if (transition2 != null) {
                        setTransition(transition2);
                        RectF touchRegion3 = motionScene2.mCurrentTransition.mTouchResponse.getTouchRegion(motionLayout2, rectF2);
                        motionScene2.mMotionOutsideRegion = (touchRegion3 == null || touchRegion3.contains(motionScene2.mLastTouchDown.getX(), motionScene2.mLastTouchDown.getY())) ? false : true;
                        TouchResponse touchResponse6 = motionScene2.mCurrentTransition.mTouchResponse;
                        float f11 = motionScene2.mLastTouchX;
                        float f12 = motionScene2.mLastTouchY;
                        touchResponse6.mLastTouchX = f11;
                        touchResponse6.mLastTouchY = f12;
                        touchResponse6.mDragStarted = false;
                    }
                }
            }
            transition = this.mScene.mCurrentTransition;
            if ((transition.mTransitionFlags & 4) == 0) {
                return transition.mTouchResponse.mDragStarted;
            }
            return true;
        }
        if (!motionScene2.mIgnoreTouch) {
            MotionScene.Transition transition6 = motionScene2.mCurrentTransition;
            if (transition6 != null && (touchResponse = transition6.mTouchResponse) != null) {
                float[] fArr = touchResponse.mAnchorDpDt;
                if (!motionScene2.mMotionOutsideRegion) {
                    MyTracker myTracker4 = motionScene2.mVelocityTracker;
                    MotionLayout motionLayout3 = touchResponse.mMotionLayout;
                    if (touchResponse.mIsRotateMode) {
                        int[] iArr = touchResponse.mTempLoc;
                        VelocityTracker velocityTracker2 = myTracker4.mTracker;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        int action2 = motionEvent.getAction();
                        if (action2 == 0) {
                            touchResponse.mLastTouchX = motionEvent.getRawX();
                            touchResponse.mLastTouchY = motionEvent.getRawY();
                            touchResponse.mDragStarted = false;
                        } else if (action2 == 1) {
                            touchResponse.mDragStarted = false;
                            VelocityTracker velocityTracker3 = myTracker4.mTracker;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(16);
                            }
                            VelocityTracker velocityTracker4 = myTracker4.mTracker;
                            float xVelocity = velocityTracker4 != null ? velocityTracker4.getXVelocity() : RecyclerView.DECELERATION_RATE;
                            VelocityTracker velocityTracker5 = myTracker4.mTracker;
                            float yVelocity = velocityTracker5 != null ? velocityTracker5.getYVelocity() : RecyclerView.DECELERATION_RATE;
                            float f13 = motionLayout3.mTransitionLastPosition;
                            float width = motionLayout3.getWidth() / 2.0f;
                            float height = motionLayout3.getHeight() / 2.0f;
                            int i7 = touchResponse.mRotationCenterId;
                            if (i7 != -1) {
                                View findViewById = motionLayout3.findViewById(i7);
                                motionLayout3.getLocationOnScreen(iArr);
                                right = iArr[0] + ((findViewById.getRight() + findViewById.getLeft()) / 2.0f);
                                f = iArr[1];
                                top = findViewById.getTop();
                                bottom = findViewById.getBottom();
                            } else {
                                int i8 = touchResponse.mTouchAnchorId;
                                if (i8 != -1) {
                                    View findViewById2 = motionLayout3.findViewById(((MotionController) motionLayout3.mFrameArrayList.get(motionLayout3.findViewById(i8))).mStartMotionPath.mAnimateRelativeTo);
                                    motionLayout3.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((findViewById2.getRight() + findViewById2.getLeft()) / 2.0f);
                                    f = iArr[1];
                                    top = findViewById2.getTop();
                                    bottom = findViewById2.getBottom();
                                }
                                float rawX2 = motionEvent.getRawX() - width;
                                double degrees = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height, rawX2));
                                i2 = touchResponse.mTouchAnchorId;
                                if (i2 == -1) {
                                    f2 = 1.0f;
                                    touchResponse.mMotionLayout.getAnchorDpDt(i2, f13, touchResponse.mTouchAnchorX, touchResponse.mTouchAnchorY, fArr);
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    f2 = 1.0f;
                                    fArr[1] = 360.0f;
                                }
                                float degrees2 = ((float) (Math.toDegrees(Math.atan2(yVelocity + r13, xVelocity + rawX2)) - degrees)) * 62.5f;
                                f3 = Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * touchResponse.mDragScale) / fArr[1]) + f13 : f13;
                                if (f3 == RecyclerView.DECELERATION_RATE && f3 != f2 && (i3 = touchResponse.mOnTouchUp) != 3) {
                                    float f14 = (degrees2 * touchResponse.mDragScale) / fArr[1];
                                    float f15 = ((double) f3) < 0.5d ? RecyclerView.DECELERATION_RATE : f2;
                                    if (i3 == 6) {
                                        if (f13 + f14 < RecyclerView.DECELERATION_RATE) {
                                            f14 = Math.abs(f14);
                                        }
                                        f15 = f2;
                                    }
                                    if (touchResponse.mOnTouchUp == 7) {
                                        if (f13 + f14 > f2) {
                                            f14 = -Math.abs(f14);
                                        }
                                        f15 = RecyclerView.DECELERATION_RATE;
                                    }
                                    motionLayout3.touchAnimateTo(f15, f14 * 3.0f, touchResponse.mOnTouchUp);
                                    if (RecyclerView.DECELERATION_RATE >= f13 || f2 <= f13) {
                                        motionLayout3.setState$1(4);
                                    }
                                } else if (RecyclerView.DECELERATION_RATE < f3 || f2 <= f3) {
                                    motionLayout3.setState$1(4);
                                }
                            }
                            float f16 = f + ((bottom + top) / 2.0f);
                            width = right;
                            height = f16;
                            float rawX22 = motionEvent.getRawX() - width;
                            double degrees3 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height, rawX22));
                            i2 = touchResponse.mTouchAnchorId;
                            if (i2 == -1) {
                            }
                            float degrees22 = ((float) (Math.toDegrees(Math.atan2(yVelocity + r13, xVelocity + rawX22)) - degrees3)) * 62.5f;
                            if (Float.isNaN(degrees22)) {
                            }
                            if (f3 == RecyclerView.DECELERATION_RATE) {
                            }
                            if (RecyclerView.DECELERATION_RATE < f3) {
                            }
                            motionLayout3.setState$1(4);
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            float width2 = motionLayout3.getWidth() / 2.0f;
                            float height2 = motionLayout3.getHeight() / 2.0f;
                            int i9 = touchResponse.mRotationCenterId;
                            if (i9 != -1) {
                                View findViewById3 = motionLayout3.findViewById(i9);
                                motionLayout3.getLocationOnScreen(iArr);
                                float right2 = iArr[0] + ((findViewById3.getRight() + findViewById3.getLeft()) / 2.0f);
                                float bottom2 = iArr[1] + ((findViewById3.getBottom() + findViewById3.getTop()) / 2.0f);
                                width2 = right2;
                                height2 = bottom2;
                            } else {
                                int i10 = touchResponse.mTouchAnchorId;
                                if (i10 != -1) {
                                    if (motionLayout3.findViewById(((MotionController) motionLayout3.mFrameArrayList.get(motionLayout3.findViewById(i10))).mStartMotionPath.mAnimateRelativeTo) == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        motionLayout3.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((r12.getRight() + r12.getLeft()) / 2.0f);
                                        height2 = ((r12.getBottom() + r12.getTop()) / 2.0f) + iArr[1];
                                    }
                                }
                            }
                            float rawX3 = motionEvent.getRawX() - width2;
                            float rawY2 = motionEvent.getRawY() - height2;
                            double atan2 = Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2);
                            float atan22 = (float) (((atan2 - Math.atan2(touchResponse.mLastTouchY - height2, touchResponse.mLastTouchX - width2)) * 180.0d) / 3.141592653589793d);
                            if (atan22 > 330.0f) {
                                atan22 -= 360.0f;
                            } else if (atan22 < -330.0f) {
                                atan22 += 360.0f;
                            }
                            float f17 = atan22;
                            if (Math.abs(f17) > 0.01d || touchResponse.mDragStarted) {
                                float f18 = motionLayout3.mTransitionLastPosition;
                                if (touchResponse.mDragStarted) {
                                    z = true;
                                } else {
                                    z = true;
                                    touchResponse.mDragStarted = true;
                                    motionLayout3.setProgress(f18);
                                }
                                int i11 = touchResponse.mTouchAnchorId;
                                if (i11 != -1) {
                                    boolean z2 = z;
                                    MotionLayout motionLayout4 = touchResponse.mMotionLayout;
                                    float f19 = touchResponse.mTouchAnchorX;
                                    float f20 = touchResponse.mTouchAnchorY;
                                    d = atan2;
                                    i4 = IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
                                    f4 = 1.0f;
                                    motionLayout4.getAnchorDpDt(i11, f18, f19, f20, fArr);
                                    fArr[z2 ? 1 : 0] = (float) Math.toDegrees(fArr[z2 ? 1 : 0]);
                                    r19 = z2;
                                } else {
                                    boolean z3 = z;
                                    d = atan2;
                                    i4 = IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
                                    f4 = 1.0f;
                                    fArr[z3 ? 1 : 0] = 360.0f;
                                    r19 = z3;
                                }
                                float max = Math.max(Math.min(((f17 * touchResponse.mDragScale) / fArr[r19]) + f18, f4), RecyclerView.DECELERATION_RATE);
                                float f21 = motionLayout3.mTransitionLastPosition;
                                if (max != f21) {
                                    if (f21 == RecyclerView.DECELERATION_RATE || f21 == f4) {
                                        motionLayout3.endTrigger(f21 == RecyclerView.DECELERATION_RATE);
                                    }
                                    motionLayout3.setProgress(max);
                                    VelocityTracker velocityTracker6 = myTracker4.mTracker;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(i4);
                                    }
                                    VelocityTracker velocityTracker7 = myTracker4.mTracker;
                                    float xVelocity2 = velocityTracker7 != null ? velocityTracker7.getXVelocity() : RecyclerView.DECELERATION_RATE;
                                    VelocityTracker velocityTracker8 = myTracker4.mTracker;
                                    double yVelocity2 = velocityTracker8 != null ? velocityTracker8.getYVelocity() : RecyclerView.DECELERATION_RATE;
                                    double d2 = xVelocity2;
                                    motionLayout3.mLastVelocity = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity2, d2) - d) * Math.hypot(yVelocity2, d2)) / Math.hypot(rawX3, rawY2)));
                                } else {
                                    motionLayout3.mLastVelocity = RecyclerView.DECELERATION_RATE;
                                }
                                touchResponse.mLastTouchX = motionEvent.getRawX();
                                touchResponse.mLastTouchY = motionEvent.getRawY();
                            }
                        }
                    } else {
                        VelocityTracker velocityTracker9 = myTracker4.mTracker;
                        if (velocityTracker9 != null) {
                            velocityTracker9.addMovement(motionEvent);
                        }
                        int action3 = motionEvent.getAction();
                        if (action3 == 0) {
                            touchResponse.mLastTouchX = motionEvent.getRawX();
                            touchResponse.mLastTouchY = motionEvent.getRawY();
                            touchResponse.mDragStarted = false;
                        } else if (action3 == 1) {
                            touchResponse.mDragStarted = false;
                            VelocityTracker velocityTracker10 = myTracker4.mTracker;
                            if (velocityTracker10 != null) {
                                velocityTracker10.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                            }
                            VelocityTracker velocityTracker11 = myTracker4.mTracker;
                            float xVelocity3 = velocityTracker11 != null ? velocityTracker11.getXVelocity() : RecyclerView.DECELERATION_RATE;
                            VelocityTracker velocityTracker12 = myTracker4.mTracker;
                            float yVelocity3 = velocityTracker12 != null ? velocityTracker12.getYVelocity() : RecyclerView.DECELERATION_RATE;
                            float f22 = motionLayout3.mTransitionLastPosition;
                            int i12 = touchResponse.mTouchAnchorId;
                            if (i12 != -1) {
                                motionLayout = motionLayout3;
                                motionLayout.getAnchorDpDt(i12, f22, touchResponse.mTouchAnchorX, touchResponse.mTouchAnchorY, fArr);
                                c = 1;
                                c2 = 0;
                            } else {
                                motionLayout = motionLayout3;
                                float min = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                c = 1;
                                fArr[1] = touchResponse.mTouchDirectionY * min;
                                c2 = 0;
                                fArr[0] = min * touchResponse.mTouchDirectionX;
                            }
                            float f23 = touchResponse.mTouchDirectionX != RecyclerView.DECELERATION_RATE ? xVelocity3 / fArr[c2] : yVelocity3 / fArr[c];
                            float f24 = !Float.isNaN(f23) ? (f23 / 3.0f) + f22 : f22;
                            if (f24 != RecyclerView.DECELERATION_RATE && f24 != 1.0f && (i = touchResponse.mOnTouchUp) != 3) {
                                float f25 = ((double) f24) < 0.5d ? RecyclerView.DECELERATION_RATE : 1.0f;
                                if (i == 6) {
                                    if (f22 + f23 < RecyclerView.DECELERATION_RATE) {
                                        f23 = Math.abs(f23);
                                    }
                                    f25 = 1.0f;
                                }
                                if (touchResponse.mOnTouchUp == 7) {
                                    if (f22 + f23 > 1.0f) {
                                        f23 = -Math.abs(f23);
                                    }
                                    f25 = RecyclerView.DECELERATION_RATE;
                                }
                                motionLayout.touchAnimateTo(f25, f23, touchResponse.mOnTouchUp);
                                if (RecyclerView.DECELERATION_RATE >= f22 || 1.0f <= f22) {
                                    motionLayout.setState$1(4);
                                }
                            } else if (RecyclerView.DECELERATION_RATE >= f24 || 1.0f <= f24) {
                                motionLayout.setState$1(4);
                            }
                        } else if (action3 == 2) {
                            float rawY3 = motionEvent.getRawY() - touchResponse.mLastTouchY;
                            float rawX4 = motionEvent.getRawX() - touchResponse.mLastTouchX;
                            if (Math.abs((touchResponse.mTouchDirectionY * rawY3) + (touchResponse.mTouchDirectionX * rawX4)) > touchResponse.mDragThreshold || touchResponse.mDragStarted) {
                                float f26 = motionLayout3.mTransitionLastPosition;
                                if (!touchResponse.mDragStarted) {
                                    touchResponse.mDragStarted = true;
                                    motionLayout3.setProgress(f26);
                                }
                                int i13 = touchResponse.mTouchAnchorId;
                                MotionLayout motionLayout5 = touchResponse.mMotionLayout;
                                if (i13 != -1) {
                                    motionLayout5.getAnchorDpDt(i13, f26, touchResponse.mTouchAnchorX, touchResponse.mTouchAnchorY, fArr);
                                    c3 = 1;
                                    c4 = 0;
                                } else {
                                    float min2 = Math.min(motionLayout5.getWidth(), motionLayout3.getHeight());
                                    c3 = 1;
                                    fArr[1] = touchResponse.mTouchDirectionY * min2;
                                    c4 = 0;
                                    fArr[0] = min2 * touchResponse.mTouchDirectionX;
                                }
                                if (Math.abs(((touchResponse.mTouchDirectionY * fArr[c3]) + (touchResponse.mTouchDirectionX * fArr[c4])) * touchResponse.mDragScale) < 0.01d) {
                                    fArr[0] = 0.01f;
                                    fArr[c3] = 0.01f;
                                }
                                float max2 = Math.max(Math.min(f26 + (touchResponse.mTouchDirectionX != RecyclerView.DECELERATION_RATE ? rawX4 / fArr[0] : rawY3 / fArr[c3]), 1.0f), RecyclerView.DECELERATION_RATE);
                                if (touchResponse.mOnTouchUp == 6) {
                                    max2 = Math.max(max2, 0.01f);
                                }
                                if (touchResponse.mOnTouchUp == 7) {
                                    max2 = Math.min(max2, 0.99f);
                                }
                                float f27 = motionLayout3.mTransitionLastPosition;
                                if (max2 != f27) {
                                    if (f27 == RecyclerView.DECELERATION_RATE || f27 == 1.0f) {
                                        motionLayout3.endTrigger(f27 == RecyclerView.DECELERATION_RATE);
                                    }
                                    motionLayout3.setProgress(max2);
                                    VelocityTracker velocityTracker13 = myTracker4.mTracker;
                                    if (velocityTracker13 != null) {
                                        velocityTracker13.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                                    }
                                    VelocityTracker velocityTracker14 = myTracker4.mTracker;
                                    float xVelocity4 = velocityTracker14 != null ? velocityTracker14.getXVelocity() : RecyclerView.DECELERATION_RATE;
                                    VelocityTracker velocityTracker15 = myTracker4.mTracker;
                                    motionLayout3.mLastVelocity = touchResponse.mTouchDirectionX != RecyclerView.DECELERATION_RATE ? xVelocity4 / fArr[0] : (velocityTracker15 != null ? velocityTracker15.getYVelocity() : RecyclerView.DECELERATION_RATE) / fArr[1];
                                } else {
                                    motionLayout3.mLastVelocity = RecyclerView.DECELERATION_RATE;
                                }
                                touchResponse.mLastTouchX = motionEvent.getRawX();
                                touchResponse.mLastTouchY = motionEvent.getRawY();
                            }
                        }
                    }
                }
            }
            motionScene2.mLastTouchX = motionEvent.getRawX();
            motionScene2.mLastTouchY = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (myTracker = motionScene2.mVelocityTracker) != null) {
                VelocityTracker velocityTracker16 = myTracker.mTracker;
                if (velocityTracker16 != null) {
                    velocityTracker16.recycle();
                    myTracker2 = null;
                    myTracker.mTracker = null;
                } else {
                    myTracker2 = null;
                }
                motionScene2.mVelocityTracker = myTracker2;
                int i14 = this.mCurrentState;
                if (i14 != -1) {
                    motionScene2.autoTransition(i14, this);
                }
            }
        }
        transition = this.mScene.mCurrentTransition;
        if ((transition.mTransitionFlags & 4) == 0) {
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new CopyOnWriteArrayList();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.mUseOnShow) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.mUseOnHide) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    public final void processTransitionCompleted() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.mTransitionListener == null && ((copyOnWriteArrayList = this.mTransitionListeners) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList arrayList = this.mTransitionCompleted;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            TransitionListener transitionListener = this.mTransitionListener;
            if (transitionListener != null) {
                num.intValue();
                transitionListener.getClass();
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.mTransitionListeners;
            if (copyOnWriteArrayList2 != null) {
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    TransitionListener transitionListener2 = (TransitionListener) it2.next();
                    num.intValue();
                    transitionListener2.getClass();
                }
            }
        }
        arrayList.clear();
    }

    public final void rebuildScene() {
        this.mModel.reEvaluateState();
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (!this.mMeasureDuringTransition && this.mCurrentState == -1 && (motionScene = this.mScene) != null && (transition = motionScene.mCurrentTransition) != null) {
            int i = transition.mLayoutDuringTransition;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ((MotionController) this.mFrameArrayList.get(getChildAt(i2))).mForceMeasure = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.mDebugPath = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.mDelayedApply = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.mInteractionEnabled = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.mScene != null) {
            setState$1(3);
            Interpolator interpolator = this.mScene.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.mOnHideHelpers.get(i)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.mOnShowHelpers.get(i)).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f < RecyclerView.DECELERATION_RATE || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.mProgress = f;
            return;
        }
        if (f <= RecyclerView.DECELERATION_RATE) {
            if (this.mTransitionLastPosition == 1.0f && this.mCurrentState == this.mEndState) {
                setState$1(3);
            }
            this.mCurrentState = this.mBeginState;
            if (this.mTransitionLastPosition == RecyclerView.DECELERATION_RATE) {
                setState$1(4);
            }
        } else if (f >= 1.0f) {
            if (this.mTransitionLastPosition == RecyclerView.DECELERATION_RATE && this.mCurrentState == this.mBeginState) {
                setState$1(3);
            }
            this.mCurrentState = this.mEndState;
            if (this.mTransitionLastPosition == 1.0f) {
                setState$1(4);
            }
        } else {
            this.mCurrentState = -1;
            setState$1(3);
        }
        if (this.mScene == null) {
            return;
        }
        this.mTransitionInstantly = true;
        this.mTransitionGoalPosition = f;
        this.mTransitionPosition = f;
        this.mTransitionLastTime = -1L;
        this.mAnimationStartTime = -1L;
        this.mInterpolator = null;
        this.mInTransition = true;
        invalidate();
    }

    public void setScene(MotionScene motionScene) {
        TouchResponse touchResponse;
        this.mScene = motionScene;
        boolean isRtl = isRtl();
        motionScene.mRtl = isRtl;
        MotionScene.Transition transition = motionScene.mCurrentTransition;
        if (transition != null && (touchResponse = transition.mTouchResponse) != null) {
            touchResponse.setRTL(isRtl);
        }
        rebuildScene();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState$1(2);
        this.mCurrentState = i;
        this.mBeginState = -1;
        this.mEndState = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i2, i3, i);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.getConstraintSet(i).applyTo(this);
        }
    }

    public final void setState$1(int i) {
        if (i == 4 && this.mCurrentState == -1) {
            return;
        }
        int i2 = this.mTransitionState;
        this.mTransitionState = i;
        if (i2 == 3 && i == 3) {
            fireTransitionChange();
        }
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i2);
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && i == 4) {
                fireTransitionCompleted();
                return;
            }
            return;
        }
        if (i == 3) {
            fireTransitionChange();
        }
        if (i == 4) {
            fireTransitionCompleted();
        }
    }

    public void setTransition(int i) {
        MotionScene.Transition transition;
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            Iterator it = motionScene.mTransitionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    transition = null;
                    break;
                } else {
                    transition = (MotionScene.Transition) it.next();
                    if (transition.mId == i) {
                        break;
                    }
                }
            }
            this.mBeginState = transition.mConstraintSetStart;
            this.mEndState = transition.mConstraintSetEnd;
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new StateCache();
                }
                StateCache stateCache = this.mStateCache;
                stateCache.mStartState = this.mBeginState;
                stateCache.mEndState = this.mEndState;
                return;
            }
            int i2 = this.mCurrentState;
            float f = i2 == this.mBeginState ? 0.0f : i2 == this.mEndState ? 1.0f : Float.NaN;
            MotionScene motionScene2 = this.mScene;
            motionScene2.mCurrentTransition = transition;
            TouchResponse touchResponse = transition.mTouchResponse;
            if (touchResponse != null) {
                touchResponse.setRTL(motionScene2.mRtl);
            }
            this.mModel.initFrom(this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            rebuildScene();
            if (this.mTransitionLastPosition != f) {
                if (f == RecyclerView.DECELERATION_RATE) {
                    endTrigger(true);
                    this.mScene.getConstraintSet(this.mBeginState).applyTo(this);
                } else if (f == 1.0f) {
                    endTrigger(false);
                    this.mScene.getConstraintSet(this.mEndState).applyTo(this);
                }
            }
            this.mTransitionLastPosition = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
            } else {
                Log.v("MotionLayout", Debug.getLocation().concat(" transitionToStart "));
                animateTo(RecyclerView.DECELERATION_RATE);
            }
        }
    }

    public void setTransitionDuration(int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        MotionScene.Transition transition = motionScene.mCurrentTransition;
        if (transition != null) {
            transition.mDuration = Math.max(i, 8);
        } else {
            motionScene.mDefaultDuration = i;
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.mTransitionListener = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        StateCache stateCache = this.mStateCache;
        stateCache.getClass();
        stateCache.mProgress = bundle.getFloat("motion.progress");
        stateCache.mVelocity = bundle.getFloat("motion.velocity");
        stateCache.mStartState = bundle.getInt("motion.StartState");
        stateCache.mEndState = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.mStateCache.apply();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return Debug.getName(context, this.mBeginState) + "->" + Debug.getName(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r20 != 7) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0066, code lost:
    
        if ((((r19 * r5) - (((r2 * r5) * r5) / 2.0f)) + r1) > 1.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0088, code lost:
    
        r2 = r17.mTransitionLastPosition;
        r5 = r17.mTransitionDuration;
        r6 = r17.mScene.getMaxAcceleration();
        r1 = r17.mScene.mCurrentTransition;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0096, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0098, code lost:
    
        r1 = r1.mTouchResponse;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009a, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x009c, code lost:
    
        r7 = r1.mMaxVelocity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00a1, code lost:
    
        r17.mStopLogic.config(r2, r3, r19, r5, r6, r7);
        r17.mLastVelocity = androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE;
        r1 = r17.mCurrentState;
        r17.mTransitionGoalPosition = r3;
        r17.mCurrentState = r1;
        r17.mInterpolator = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a0, code lost:
    
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0076, code lost:
    
        r1 = r17.mTransitionLastPosition;
        r2 = r17.mScene.getMaxAcceleration();
        r9.mInitialV = r19;
        r9.mCurrentP = r1;
        r9.mMaxA = r2;
        r17.mInterpolator = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0074, code lost:
    
        if ((((((r2 * r5) * r5) / 2.0f) + (r19 * r5)) + r1) < androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void touchAnimateTo(float f, float f2, int i) {
        float f3;
        TouchResponse touchResponse;
        TouchResponse touchResponse2;
        TouchResponse touchResponse3;
        TouchResponse touchResponse4;
        TouchResponse touchResponse5;
        TouchResponse touchResponse6;
        TouchResponse touchResponse7;
        float f4 = f;
        if (this.mScene == null || this.mTransitionLastPosition == f4) {
            return;
        }
        this.mTemporalInterpolator = true;
        this.mAnimationStartTime = System.nanoTime();
        MotionScene motionScene = this.mScene;
        MotionScene.Transition transition = motionScene.mCurrentTransition;
        float f5 = (transition != null ? transition.mDuration : motionScene.mDefaultDuration) / 1000.0f;
        this.mTransitionDuration = f5;
        this.mTransitionGoalPosition = f4;
        this.mInTransition = true;
        StopLogic stopLogic = this.mStopLogic;
        float f6 = RecyclerView.DECELERATION_RATE;
        if (i != 0 && i != 1 && i != 2) {
            f3 = 1.0f;
            DecelerateInterpolator decelerateInterpolator = this.mDecelerateLogic;
            if (i == 4) {
                float f7 = this.mTransitionLastPosition;
                float maxAcceleration = motionScene.getMaxAcceleration();
                decelerateInterpolator.mInitialV = f2;
                decelerateInterpolator.mCurrentP = f7;
                decelerateInterpolator.mMaxA = maxAcceleration;
                this.mInterpolator = decelerateInterpolator;
            } else if (i == 5) {
                float f8 = this.mTransitionLastPosition;
                float maxAcceleration2 = motionScene.getMaxAcceleration();
                if (f2 > RecyclerView.DECELERATION_RATE) {
                    float f9 = f2 / maxAcceleration2;
                } else {
                    float f10 = (-f2) / maxAcceleration2;
                }
            } else if (i != 6) {
            }
            this.mTransitionInstantly = false;
            this.mAnimationStartTime = System.nanoTime();
            invalidate();
        }
        f3 = 1.0f;
        if (i == 1 || i == 7) {
            f4 = 0.0f;
        } else if (i == 2 || i == 6) {
            f4 = f3;
        }
        int i2 = (transition == null || (touchResponse7 = transition.mTouchResponse) == null) ? 0 : touchResponse7.mAutoCompleteMode;
        float f11 = this.mTransitionLastPosition;
        int i3 = i2;
        StopLogic stopLogic2 = this.mStopLogic;
        if (i3 == 0) {
            float maxAcceleration3 = motionScene.getMaxAcceleration();
            MotionScene.Transition transition2 = this.mScene.mCurrentTransition;
            if (transition2 != null && (touchResponse6 = transition2.mTouchResponse) != null) {
                f6 = touchResponse6.mMaxVelocity;
            }
            stopLogic2.config(f11, f4, f2, f5, maxAcceleration3, f6);
        } else {
            float f12 = (transition == null || (touchResponse5 = transition.mTouchResponse) == null) ? 0.0f : touchResponse5.mSpringMass;
            float f13 = (transition == null || (touchResponse4 = transition.mTouchResponse) == null) ? 0.0f : touchResponse4.mSpringStiffness;
            float f14 = (transition == null || (touchResponse3 = transition.mTouchResponse) == null) ? 0.0f : touchResponse3.mSpringDamping;
            float f15 = (transition == null || (touchResponse2 = transition.mTouchResponse) == null) ? 0.0f : touchResponse2.mSpringStopThreshold;
            int i4 = (transition == null || (touchResponse = transition.mTouchResponse) == null) ? 0 : touchResponse.mSpringBoundary;
            if (stopLogic2.mSpringStopEngine == null) {
                SpringStopEngine springStopEngine = new SpringStopEngine();
                springStopEngine.mDamping = 0.5d;
                springStopEngine.mBoundaryMode = 0;
                stopLogic2.mSpringStopEngine = springStopEngine;
            }
            SpringStopEngine springStopEngine2 = stopLogic2.mSpringStopEngine;
            stopLogic2.mEngine = springStopEngine2;
            springStopEngine2.mTargetPos = f4;
            springStopEngine2.mDamping = f14;
            springStopEngine2.mPos = f11;
            springStopEngine2.mStiffness = f13;
            springStopEngine2.mMass = f12;
            springStopEngine2.mStopThreshold = f15;
            springStopEngine2.mBoundaryMode = i4;
            springStopEngine2.mLastTime = RecyclerView.DECELERATION_RATE;
        }
        int i5 = this.mCurrentState;
        this.mTransitionGoalPosition = f4;
        this.mCurrentState = i5;
        this.mInterpolator = stopLogic;
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = System.nanoTime();
        invalidate();
    }

    public final void transitionToEnd() {
        animateTo(1.0f);
        this.mOnComplete = null;
    }

    public final void transitionToState(int i) {
        Sniffer sniffer;
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.mEndState = i;
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (sniffer = motionScene.mStateSet) != null) {
            int i2 = this.mCurrentState;
            StateSet$State stateSet$State = (StateSet$State) ((SparseArray) sniffer.scratch).get(i);
            if (stateSet$State == null) {
                i2 = i;
            } else {
                ArrayList arrayList = stateSet$State.mVariants;
                int i3 = stateSet$State.mConstraintID;
                if (i3 != i2) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (i2 == ((StateSet$Variant) it.next()).mConstraintID) {
                                break;
                            }
                        } else {
                            i2 = i3;
                            break;
                        }
                    }
                }
            }
            if (i2 != -1) {
                i = i2;
            }
        }
        int i4 = this.mCurrentState;
        if (i4 == i) {
            return;
        }
        if (this.mBeginState == i) {
            animateTo(RecyclerView.DECELERATION_RATE);
            return;
        }
        if (this.mEndState == i) {
            animateTo(1.0f);
            return;
        }
        this.mEndState = i;
        if (i4 != -1) {
            setTransition(i4, i);
            animateTo(1.0f);
            this.mTransitionLastPosition = RecyclerView.DECELERATION_RATE;
            transitionToEnd();
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = 1.0f;
        this.mTransitionPosition = RecyclerView.DECELERATION_RATE;
        this.mTransitionLastPosition = RecyclerView.DECELERATION_RATE;
        this.mTransitionLastTime = System.nanoTime();
        this.mAnimationStartTime = System.nanoTime();
        this.mTransitionInstantly = false;
        this.mInterpolator = null;
        MotionScene motionScene2 = this.mScene;
        this.mTransitionDuration = (motionScene2.mCurrentTransition != null ? r6.mDuration : motionScene2.mDefaultDuration) / 1000.0f;
        this.mBeginState = -1;
        motionScene2.setTransition(-1, this.mEndState);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap hashMap = this.mFrameArrayList;
        hashMap.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            hashMap.put(childAt, new MotionController(childAt));
            sparseArray.put(childAt.getId(), (MotionController) hashMap.get(childAt));
        }
        this.mInTransition = true;
        ConstraintSet constraintSet = this.mScene.getConstraintSet(i);
        Model model = this.mModel;
        model.initFrom(null, constraintSet);
        rebuildScene();
        model.build();
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            MotionController motionController = (MotionController) hashMap.get(childAt2);
            if (motionController != null) {
                MotionPaths motionPaths = motionController.mStartMotionPath;
                motionPaths.mTime = RecyclerView.DECELERATION_RATE;
                motionPaths.mPosition = RecyclerView.DECELERATION_RATE;
                motionPaths.setBounds(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                MotionConstrainedPoint motionConstrainedPoint = motionController.mStartPoint;
                motionConstrainedPoint.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                motionConstrainedPoint.mVisibility = childAt2.getVisibility();
                motionConstrainedPoint.mAlpha = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                motionConstrainedPoint.mElevation = childAt2.getElevation();
                motionConstrainedPoint.mRotation = childAt2.getRotation();
                motionConstrainedPoint.mRotationX = childAt2.getRotationX();
                motionConstrainedPoint.rotationY = childAt2.getRotationY();
                motionConstrainedPoint.mScaleX = childAt2.getScaleX();
                motionConstrainedPoint.mScaleY = childAt2.getScaleY();
                motionConstrainedPoint.mPivotX = childAt2.getPivotX();
                motionConstrainedPoint.mPivotY = childAt2.getPivotY();
                motionConstrainedPoint.mTranslationX = childAt2.getTranslationX();
                motionConstrainedPoint.mTranslationY = childAt2.getTranslationY();
                motionConstrainedPoint.mTranslationZ = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i7 = 0; i7 < childCount; i7++) {
            MotionController motionController2 = (MotionController) hashMap.get(getChildAt(i7));
            if (motionController2 != null) {
                this.mScene.getKeyFrames(motionController2);
                motionController2.setup(width, height, System.nanoTime());
            }
        }
        MotionScene.Transition transition = this.mScene.mCurrentTransition;
        float f = transition != null ? transition.mStagger : 0.0f;
        if (f != RecyclerView.DECELERATION_RATE) {
            float f2 = Float.MAX_VALUE;
            float f3 = -3.4028235E38f;
            for (int i8 = 0; i8 < childCount; i8++) {
                MotionPaths motionPaths2 = ((MotionController) hashMap.get(getChildAt(i8))).mEndMotionPath;
                float f4 = motionPaths2.mY + motionPaths2.mX;
                f2 = Math.min(f2, f4);
                f3 = Math.max(f3, f4);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                MotionController motionController3 = (MotionController) hashMap.get(getChildAt(i9));
                MotionPaths motionPaths3 = motionController3.mEndMotionPath;
                float f5 = motionPaths3.mX;
                float f6 = motionPaths3.mY;
                motionController3.mStaggerScale = 1.0f / (1.0f - f);
                motionController3.mStaggerOffset = f - ((((f5 + f6) - f2) * f) / (f3 - f2));
            }
        }
        this.mTransitionPosition = RecyclerView.DECELERATION_RATE;
        this.mTransitionLastPosition = RecyclerView.DECELERATION_RATE;
        this.mInTransition = true;
        invalidate();
    }

    public final void updateState(int i, ConstraintSet constraintSet) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.mConstraintSetMap.put(i, constraintSet);
        }
        this.mModel.initFrom(this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        rebuildScene();
        if (this.mCurrentState == i) {
            constraintSet.applyTo(this);
        }
    }

    public final void viewTransition(int i, View... viewArr) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        e0 e0Var = motionScene.mViewTransitionController;
        String str = (String) e0Var.i;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) e0Var.b).iterator();
        ViewTransition viewTransition = null;
        while (it.hasNext()) {
            ViewTransition viewTransition2 = (ViewTransition) it.next();
            if (viewTransition2.mId == i) {
                for (View view : viewArr) {
                    if (viewTransition2.checkTags(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    viewTransition = viewTransition2;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = (MotionLayout) e0Var.a;
                    int i2 = motionLayout.mCurrentState;
                    if (viewTransition2.mViewTransitionMode != 2) {
                        if (i2 == -1) {
                            Log.w(str, "No support for ViewTransition within transition yet. Currently: ".concat(motionLayout.toString()));
                        } else {
                            MotionScene motionScene2 = motionLayout.mScene;
                            ConstraintSet constraintSet = motionScene2 == null ? null : motionScene2.getConstraintSet(i2);
                            if (constraintSet != null) {
                                viewTransition = viewTransition2;
                                viewTransition.applyTransition(e0Var, (MotionLayout) e0Var.a, i2, constraintSet, viewArr2);
                            }
                        }
                        viewTransition = viewTransition2;
                    } else {
                        viewTransition = viewTransition2;
                        viewTransition.applyTransition(e0Var, motionLayout, i2, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (viewTransition == null) {
            Log.e(str, " Could not find ViewTransition");
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            StateCache stateCache = this.mStateCache;
            stateCache.mProgress = f;
            stateCache.mVelocity = f2;
            return;
        }
        setProgress(f);
        setState$1(3);
        this.mLastVelocity = f2;
        float f3 = RecyclerView.DECELERATION_RATE;
        if (f2 != RecyclerView.DECELERATION_RATE) {
            if (f2 > RecyclerView.DECELERATION_RATE) {
                f3 = 1.0f;
            }
            animateTo(f3);
        } else {
            if (f == RecyclerView.DECELERATION_RATE || f == 1.0f) {
                return;
            }
            if (f > 0.5f) {
                f3 = 1.0f;
            }
            animateTo(f3);
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mProgressInterpolator = null;
        this.mLastVelocity = RecyclerView.DECELERATION_RATE;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = RecyclerView.DECELERATION_RATE;
        this.mTransitionLastPosition = RecyclerView.DECELERATION_RATE;
        this.mTransitionGoalPosition = RecyclerView.DECELERATION_RATE;
        this.mInTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = RecyclerView.DECELERATION_RATE;
        this.mListenerState = 0;
        this.mListenerPosition = RecyclerView.DECELERATION_RATE;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new Easing(1);
        this.mInLayout = false;
        this.mOnComplete = null;
        new HashMap();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = 1;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList();
        init(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressInterpolator = null;
        this.mLastVelocity = RecyclerView.DECELERATION_RATE;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = RecyclerView.DECELERATION_RATE;
        this.mTransitionLastPosition = RecyclerView.DECELERATION_RATE;
        this.mTransitionGoalPosition = RecyclerView.DECELERATION_RATE;
        this.mInTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = RecyclerView.DECELERATION_RATE;
        this.mListenerState = 0;
        this.mListenerPosition = RecyclerView.DECELERATION_RATE;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new Easing(1);
        this.mInLayout = false;
        this.mOnComplete = null;
        new HashMap();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = 1;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList();
        init(attributeSet);
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            StateCache stateCache = this.mStateCache;
            stateCache.mStartState = i;
            stateCache.mEndState = i2;
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mBeginState = i;
            this.mEndState = i2;
            motionScene.setTransition(i, i2);
            this.mModel.initFrom(this.mScene.getConstraintSet(i), this.mScene.getConstraintSet(i2));
            rebuildScene();
            this.mTransitionLastPosition = RecyclerView.DECELERATION_RATE;
            animateTo(RecyclerView.DECELERATION_RATE);
        }
    }

    public final void setTransition(MotionScene.Transition transition) {
        MotionScene motionScene = this.mScene;
        motionScene.mCurrentTransition = transition;
        TouchResponse touchResponse = transition.mTouchResponse;
        if (touchResponse != null) {
            touchResponse.setRTL(motionScene.mRtl);
        }
        setState$1(2);
        int i = this.mCurrentState;
        MotionScene.Transition transition2 = this.mScene.mCurrentTransition;
        if (i == (transition2 == null ? -1 : transition2.mConstraintSetEnd)) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = RecyclerView.DECELERATION_RATE;
            this.mTransitionPosition = RecyclerView.DECELERATION_RATE;
            this.mTransitionGoalPosition = RecyclerView.DECELERATION_RATE;
        }
        this.mTransitionLastTime = (transition.mTransitionFlags & 1) != 0 ? -1L : System.nanoTime();
        int startId = this.mScene.getStartId();
        MotionScene motionScene2 = this.mScene;
        MotionScene.Transition transition3 = motionScene2.mCurrentTransition;
        int i2 = transition3 != null ? transition3.mConstraintSetEnd : -1;
        if (startId == this.mBeginState && i2 == this.mEndState) {
            return;
        }
        this.mBeginState = startId;
        this.mEndState = i2;
        motionScene2.setTransition(startId, i2);
        ConstraintSet constraintSet = this.mScene.getConstraintSet(this.mBeginState);
        ConstraintSet constraintSet2 = this.mScene.getConstraintSet(this.mEndState);
        Model model = this.mModel;
        model.initFrom(constraintSet, constraintSet2);
        int i3 = this.mBeginState;
        int i4 = this.mEndState;
        model.mStartId = i3;
        model.mEndId = i4;
        model.reEvaluateState();
        rebuildScene();
    }
}
