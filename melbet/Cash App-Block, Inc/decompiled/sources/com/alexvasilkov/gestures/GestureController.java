package com.alexvasilkov.gestures;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.alexvasilkov.gestures.animation.ViewPositionAnimator;
import com.alexvasilkov.gestures.internal.ExitController;
import com.alexvasilkov.gestures.internal.MovementBounds;
import com.alexvasilkov.gestures.internal.ZoomBounds;
import com.alexvasilkov.gestures.internal.detectors.RotationGestureDetector;
import com.alexvasilkov.gestures.internal.detectors.ScaleGestureDetectorFixed;
import com.alexvasilkov.gestures.utils.FloatScroller;
import com.alexvasilkov.gestures.utils.GravityUtils;
import com.alexvasilkov.gestures.utils.MathUtils;
import com.alexvasilkov.gestures.views.GestureImageView;
import com.google.android.gms.common.api.internal.zaaq;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class GestureController implements View.OnTouchListener {
    public final LocalAnimationEngine animationEngine;
    public final ExitController exitController;
    public final MovementBounds flingBounds;
    public final OverScroller flingScroller;
    public final GestureDetector gestureDetector;
    public boolean isAnimatingInBounds;
    public boolean isInterceptTouchDisallowed;
    public boolean isRestrictRotationRequested;
    public boolean isRestrictZoomRequested;
    public boolean isRotationDetected;
    public boolean isScaleDetected;
    public boolean isScrollDetected;
    public boolean isStateChangedDuringTouch;
    public final int maxVelocity;
    public final int minVelocity;
    public final RotationGestureDetector rotateDetector;
    public final ScaleGestureDetectorFixed scaleDetector;
    public final Settings settings;
    public final StateController stateController;
    public final FloatScroller stateScroller;
    public final GestureImageView targetView;
    public final int touchSlop;
    public static final PointF tmpPointF = new PointF();
    public static final Point tmpPoint = new Point();
    public static final RectF tmpRectF = new RectF();
    public static final float[] tmpPointArr = new float[2];
    public final ArrayList stateListeners = new ArrayList();
    public float pivotX = Float.NaN;
    public float pivotY = Float.NaN;
    public float endPivotX = Float.NaN;
    public float endPivotY = Float.NaN;
    public StateSource stateSource = StateSource.NONE;
    public final State stateStart = new State();
    public final State stateEnd = new State();
    public final State state = new State();
    public final State prevState = new State();

    public final class InternalGesturesListener implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
        public InternalGesturesListener() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            GestureControllerForPager gestureControllerForPager = (GestureControllerForPager) GestureController.this;
            Settings settings = gestureControllerForPager.settings;
            if (!settings.isGesturesEnabled() || !settings.isDoubleTapEnabled || motionEvent.getActionMasked() != 1 || gestureControllerForPager.isScaleDetected) {
                return false;
            }
            StateController stateController = gestureControllerForPager.stateController;
            State state = gestureControllerForPager.state;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            ZoomBounds zoomBounds = stateController.zoomBounds;
            zoomBounds.set(state);
            float f = zoomBounds.fitZoom;
            float f2 = stateController.settings.doubleTapZoom;
            if (f2 <= RecyclerView.DECELERATION_RATE) {
                f2 = zoomBounds.maxZoom;
            }
            if (state.zoom < (f + f2) * 0.5f) {
                f = f2;
            }
            State state2 = new State();
            state2.set(state);
            state2.zoomTo(f, x, y);
            gestureControllerForPager.animateStateTo(state2, true);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            GestureControllerForPager gestureControllerForPager = (GestureControllerForPager) GestureController.this;
            gestureControllerForPager.isInterceptTouchDisallowed = false;
            gestureControllerForPager.stopFlingAnimation();
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent != null) {
                GestureControllerForPager gestureControllerForPager = (GestureControllerForPager) GestureController.this;
                State state = gestureControllerForPager.state;
                Settings settings = gestureControllerForPager.settings;
                if (settings.isPanEnabled() && settings.isGesturesEnabled() && settings.isFlingEnabled && !gestureControllerForPager.isAnimatingState()) {
                    if (gestureControllerForPager.exitController.isExitDetected()) {
                        return true;
                    }
                    gestureControllerForPager.stopFlingAnimation();
                    MovementBounds movementBounds = gestureControllerForPager.flingBounds;
                    movementBounds.set(state);
                    float f3 = state.x;
                    float f4 = state.y;
                    float[] fArr = MovementBounds.tmpPointArr;
                    fArr[0] = f3;
                    fArr[1] = f4;
                    float f5 = movementBounds.boundsRotation;
                    if (f5 != RecyclerView.DECELERATION_RATE) {
                        Matrix matrix = MovementBounds.tmpMatrix;
                        matrix.setRotate(-f5, movementBounds.boundsPivotX, movementBounds.boundsPivotY);
                        matrix.mapPoints(fArr);
                    }
                    movementBounds.bounds.union(fArr[0], fArr[1]);
                    gestureControllerForPager.flingScroller.fling(Math.round(state.x), Math.round(state.y), gestureControllerForPager.limitFlingVelocity(f * 0.9f), gestureControllerForPager.limitFlingVelocity(0.9f * f2), PKIFailureInfo.systemUnavail, Integer.MAX_VALUE, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE);
                    LocalAnimationEngine localAnimationEngine = gestureControllerForPager.animationEngine;
                    GestureImageView gestureImageView = (GestureImageView) localAnimationEngine.zab;
                    gestureImageView.removeCallbacks(localAnimationEngine);
                    gestureImageView.postOnAnimation(localAnimationEngine);
                    gestureControllerForPager.notifyStateSourceChanged();
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            GestureController gestureController = GestureController.this;
            if (gestureController.settings.isEnabled()) {
                gestureController.targetView.performLongClick();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0066, code lost:
        
            if (com.alexvasilkov.gestures.State.compare(r6.zoom, r8.minZoom) <= 0) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            boolean isExitDetected;
            GestureController gestureController = GestureController.this;
            Settings settings = gestureController.settings;
            if (settings.isGesturesEnabled() && settings.isZoomEnabled && !gestureController.isAnimatingState()) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (!Float.isNaN(scaleFactor) && !Float.isNaN(scaleGestureDetector.getFocusX()) && !Float.isNaN(scaleGestureDetector.getFocusY())) {
                    ExitController exitController = gestureController.exitController;
                    GestureController gestureController2 = exitController.controller;
                    GestureController gestureController3 = exitController.controller;
                    Settings settings2 = gestureController2.settings;
                    State state = gestureController2.state;
                    int i = settings2.isGesturesEnabled() ? settings2.exitType : 4;
                    if ((i == 1 || i == 3) && !exitController.isRotationInAction) {
                        State state2 = gestureController3.state;
                        ZoomBounds zoomBounds = gestureController3.stateController.zoomBounds;
                        zoomBounds.set(state2);
                    }
                    exitController.skipZoomDetection = true;
                    if (!exitController.skipZoomDetection && !exitController.isExitDetected() && exitController.canDetectExit() && scaleFactor < 1.0f) {
                        float f = exitController.zoomAccumulator * scaleFactor;
                        exitController.zoomAccumulator = f;
                        if (f < 0.75f) {
                            exitController.isZoomDetected = true;
                            exitController.initialZoom = state.zoom;
                            gestureController3.settings.boundsDisableCount++;
                        }
                    }
                    if (exitController.isZoomDetected) {
                        float f2 = (state.zoom * scaleFactor) / exitController.initialZoom;
                        exitController.exitState = f2;
                        Matrix matrix = MathUtils.tmpMatrix;
                        exitController.exitState = Math.max(0.01f, Math.min(f2, 1.0f));
                        Point point = ExitController.tmpPivot;
                        GravityUtils.getDefaultPivot(settings2, point);
                        if (exitController.exitState == 1.0f) {
                            state.zoomTo(exitController.initialZoom, point.x, point.y);
                        } else {
                            float m = CameraState$Type$EnumUnboxingLocalUtility.m(scaleFactor, 1.0f, 0.75f, 1.0f);
                            float f3 = point.x;
                            float f4 = point.y;
                            State.nonNaN(m);
                            Matrix matrix2 = state.matrix;
                            State.nonNaN(f3);
                            State.nonNaN(f4);
                            matrix2.postScale(m, m, f3, f4);
                            state.updateFromMatrix(true, false);
                        }
                        exitController.updateState();
                        if (exitController.exitState == 1.0f) {
                            exitController.finishDetection();
                            isExitDetected = true;
                            if (!isExitDetected) {
                                return true;
                            }
                            gestureController.pivotX = scaleGestureDetector.getFocusX();
                            float focusY = scaleGestureDetector.getFocusY();
                            gestureController.pivotY = focusY;
                            State state3 = gestureController.state;
                            float f5 = gestureController.pivotX;
                            state3.getClass();
                            State.nonNaN(scaleFactor);
                            Matrix matrix3 = state3.matrix;
                            State.nonNaN(f5);
                            State.nonNaN(focusY);
                            matrix3.postScale(scaleFactor, scaleFactor, f5, focusY);
                            state3.updateFromMatrix(true, false);
                            gestureController.isStateChangedDuringTouch = true;
                            return true;
                        }
                    }
                    isExitDetected = exitController.isExitDetected();
                    if (!isExitDetected) {
                    }
                }
            }
            return false;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            GestureControllerForPager gestureControllerForPager = (GestureControllerForPager) GestureController.this;
            Settings settings = gestureControllerForPager.settings;
            boolean z = settings.isGesturesEnabled() && settings.isZoomEnabled;
            gestureControllerForPager.isScaleDetected = z;
            if (z) {
                gestureControllerForPager.exitController.isZoomInAction = true;
            }
            return z;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            GestureController gestureController = GestureController.this;
            if (gestureController.isScaleDetected) {
                ExitController exitController = gestureController.exitController;
                exitController.isZoomInAction = false;
                exitController.skipZoomDetection = false;
                if (exitController.isZoomDetected) {
                    exitController.finishDetection();
                }
            }
            gestureController.isScaleDetected = false;
            gestureController.isRestrictZoomRequested = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x01ae, code lost:
        
            if (r0 != false) goto L99;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01ce A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0179  */
        @Override // android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            float f3;
            boolean isExitDetected;
            if (motionEvent == null) {
                return false;
            }
            GestureControllerForPager gestureControllerForPager = (GestureControllerForPager) GestureController.this;
            int i = gestureControllerForPager.touchSlop;
            if (gestureControllerForPager.settings.isPanEnabled() && !gestureControllerForPager.isAnimatingState() && !Float.isNaN(f) && !Float.isNaN(f2)) {
                ExitController exitController = gestureControllerForPager.exitController;
                float f4 = -f;
                float f5 = -f2;
                float f6 = exitController.scrollThresholdScaled;
                GestureController gestureController = exitController.controller;
                State state = gestureController.state;
                Settings settings = gestureController.settings;
                if (!exitController.skipScrollDetection && !exitController.isExitDetected() && exitController.canDetectExit()) {
                    int i2 = settings.isGesturesEnabled() ? settings.exitType : 4;
                    if ((i2 == 1 || i2 == 2) && !exitController.isZoomInAction && !exitController.isRotationInAction) {
                        State state2 = gestureController.state;
                        ZoomBounds zoomBounds = gestureController.stateController.zoomBounds;
                        zoomBounds.set(state2);
                        if (State.compare(state2.zoom, zoomBounds.minZoom) <= 0 && settings.boundsDisableCount <= 0) {
                            StateController stateController = gestureController.stateController;
                            RectF rectF = ExitController.tmpArea;
                            MovementBounds movementBounds = stateController.movBounds;
                            movementBounds.set(state);
                            RectF rectF2 = movementBounds.bounds;
                            float f7 = movementBounds.boundsRotation;
                            if (f7 == RecyclerView.DECELERATION_RATE) {
                                rectF.set(rectF2);
                                f3 = 0.0f;
                            } else {
                                Matrix matrix = MovementBounds.tmpMatrix;
                                f3 = 0.0f;
                                matrix.setRotate(f7, movementBounds.boundsPivotX, movementBounds.boundsPivotY);
                                matrix.mapRect(rectF, rectF2);
                            }
                            if ((f5 <= f3 || State.compare(state.y, rectF.bottom) >= f3) && (f5 >= f3 || State.compare(state.y, rectF.top) <= f3)) {
                                exitController.totalScrollX += f4;
                                float f8 = exitController.totalScrollY + f5;
                                exitController.totalScrollY = f8;
                                if (Math.abs(f8) > f6) {
                                    exitController.isScrollDetected = true;
                                    exitController.initialY = state.y;
                                    gestureController.settings.boundsDisableCount++;
                                } else if (Math.abs(exitController.totalScrollX) > f6) {
                                    exitController.skipScrollDetection = true;
                                }
                            }
                            if (exitController.isScrollDetected) {
                                isExitDetected = exitController.isExitDetected();
                            } else {
                                if (exitController.scrollDirection == f3) {
                                    exitController.scrollDirection = Math.signum(f5);
                                }
                                float f9 = (exitController.exitState >= 0.75f || Math.signum(f5) != exitController.scrollDirection) ? f5 : (exitController.exitState / 0.75f) * f5;
                                float f10 = exitController.scrollDirection * 0.5f;
                                boolean z2 = settings.isMovementAreaSpecified;
                                float max = 1.0f - (((state.y + f9) - exitController.initialY) / (f10 * Math.max(z2 ? settings.movementAreaW : settings.viewportW, z2 ? settings.movementAreaH : settings.viewportH)));
                                exitController.exitState = max;
                                Matrix matrix2 = MathUtils.tmpMatrix;
                                float max2 = Math.max(0.01f, Math.min(max, 1.0f));
                                exitController.exitState = max2;
                                if (max2 == 1.0f) {
                                    state.translateTo(state.x, exitController.initialY);
                                } else {
                                    Matrix matrix3 = state.matrix;
                                    State.nonNaN(f3);
                                    State.nonNaN(f9);
                                    matrix3.postTranslate(f3, f9);
                                    state.updateFromMatrix(false, false);
                                }
                                exitController.updateState();
                                if (exitController.exitState == 1.0f) {
                                    exitController.finishDetection();
                                }
                                isExitDetected = true;
                            }
                            if (isExitDetected) {
                                if (!gestureControllerForPager.isScrollDetected) {
                                    float f11 = i;
                                    boolean z3 = Math.abs(motionEvent2.getX() - motionEvent.getX()) > f11 || Math.abs(motionEvent2.getY() - motionEvent.getY()) > f11;
                                    gestureControllerForPager.isScrollDetected = z3;
                                }
                                if (gestureControllerForPager.isScrollDetected) {
                                    State state3 = gestureControllerForPager.state;
                                    Matrix matrix4 = state3.matrix;
                                    State.nonNaN(f4);
                                    State.nonNaN(f5);
                                    matrix4.postTranslate(f4, f5);
                                    state3.updateFromMatrix(false, false);
                                    gestureControllerForPager.isStateChangedDuringTouch = true;
                                }
                                z = gestureControllerForPager.isScrollDetected;
                            } else {
                                z = true;
                            }
                            return z;
                        }
                    }
                }
                f3 = 0.0f;
                if (exitController.isScrollDetected) {
                }
                if (isExitDetected) {
                }
                if (z) {
                }
            }
            z = false;
            if (z) {
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            GestureController gestureController = GestureController.this;
            Settings settings = gestureController.settings;
            if (!settings.isGesturesEnabled() || !settings.isDoubleTapEnabled) {
                return false;
            }
            gestureController.targetView.performClick();
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            GestureController gestureController = GestureController.this;
            Settings settings = gestureController.settings;
            if (settings.isGesturesEnabled() && settings.isDoubleTapEnabled) {
                return false;
            }
            gestureController.targetView.performClick();
            return false;
        }
    }

    public final class LocalAnimationEngine extends zaaq {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LocalAnimationEngine(Object obj, GestureImageView gestureImageView, int i) {
            super(gestureImageView, 1);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // com.google.android.gms.common.api.internal.zaaq
        public final boolean onStep() {
            boolean z;
            int i = this.$r8$classId;
            Object obj = this.this$0;
            boolean z2 = true;
            switch (i) {
                case 0:
                    GestureController gestureController = (GestureController) obj;
                    FloatScroller floatScroller = gestureController.stateScroller;
                    State state = gestureController.state;
                    OverScroller overScroller = gestureController.flingScroller;
                    if (overScroller.isFinished()) {
                        z = false;
                    } else {
                        int currX = overScroller.getCurrX();
                        int currY = overScroller.getCurrY();
                        if (overScroller.computeScrollOffset()) {
                            int currX2 = overScroller.getCurrX() - currX;
                            int currY2 = overScroller.getCurrY() - currY;
                            float f = state.x;
                            float f2 = state.y;
                            float f3 = f + currX2;
                            float f4 = f2 + currY2;
                            if (gestureController.settings.boundsDisableCount <= 0) {
                                MovementBounds movementBounds = gestureController.flingBounds;
                                PointF pointF = GestureController.tmpPointF;
                                movementBounds.restrict(f3, f4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, pointF);
                                f3 = pointF.x;
                                f4 = pointF.y;
                            }
                            state.translateTo(f3, f4);
                            if (State.equals(f, f3) && State.equals(f2, f4)) {
                                gestureController.stopFlingAnimation();
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (overScroller.isFinished()) {
                            gestureController.animateStateTo(state, true);
                            gestureController.notifyStateSourceChanged();
                        }
                    }
                    if (gestureController.isAnimatingState()) {
                        floatScroller.computeScroll();
                        MathUtils.interpolate(gestureController.state, gestureController.stateStart, gestureController.pivotX, gestureController.pivotY, gestureController.stateEnd, gestureController.endPivotX, gestureController.endPivotY, floatScroller.currValue);
                        if (!gestureController.isAnimatingState()) {
                            gestureController.isAnimatingInBounds = false;
                            gestureController.pivotX = Float.NaN;
                            gestureController.pivotY = Float.NaN;
                            gestureController.endPivotX = Float.NaN;
                            gestureController.endPivotY = Float.NaN;
                            gestureController.notifyStateSourceChanged();
                        }
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        gestureController.notifyStateUpdated();
                    }
                    return z2;
                default:
                    ViewPositionAnimator viewPositionAnimator = (ViewPositionAnimator) obj;
                    FloatScroller floatScroller2 = viewPositionAnimator.positionScroller;
                    if (floatScroller2.finished) {
                        return false;
                    }
                    floatScroller2.computeScroll();
                    viewPositionAnimator.position = floatScroller2.currValue;
                    if (floatScroller2.finished) {
                        GestureControllerForPager gestureControllerForPager = viewPositionAnimator.toController;
                        if (viewPositionAnimator.isAnimating) {
                            viewPositionAnimator.isAnimating = false;
                            Settings settings = gestureControllerForPager.settings;
                            settings.boundsDisableCount--;
                            settings.gesturesDisableCount--;
                            gestureControllerForPager.animateStateTo(gestureControllerForPager.state, true);
                        }
                    }
                    return true;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class StateSource {
        public static final /* synthetic */ StateSource[] $VALUES;
        public static final StateSource ANIMATION;
        public static final StateSource NONE;
        public static final StateSource USER;

        static {
            StateSource stateSource = new StateSource("NONE", 0);
            NONE = stateSource;
            StateSource stateSource2 = new StateSource("USER", 1);
            USER = stateSource2;
            StateSource stateSource3 = new StateSource("ANIMATION", 2);
            ANIMATION = stateSource3;
            $VALUES = new StateSource[]{stateSource, stateSource2, stateSource3};
        }

        public static StateSource valueOf(String str) {
            return (StateSource) Enum.valueOf(StateSource.class, str);
        }

        public static StateSource[] values() {
            return (StateSource[]) $VALUES.clone();
        }
    }

    public GestureController(GestureImageView gestureImageView) {
        Context context = gestureImageView.getContext();
        this.targetView = gestureImageView;
        Settings settings = new Settings();
        settings.minZoom = RecyclerView.DECELERATION_RATE;
        settings.maxZoom = 2.0f;
        settings.doubleTapZoom = -1.0f;
        settings.overzoomFactor = 2.0f;
        settings.isFillViewport = false;
        settings.gravity = 17;
        settings.fitMethod = 3;
        settings.boundsType = 1;
        settings.isPanEnabled = true;
        settings.isFlingEnabled = true;
        settings.isZoomEnabled = true;
        settings.isRotationEnabled = false;
        settings.isRestrictRotation = false;
        settings.isDoubleTapEnabled = true;
        settings.exitType = 1;
        settings.animationsDuration = 200L;
        this.settings = settings;
        this.stateController = new StateController(settings);
        this.animationEngine = new LocalAnimationEngine(this, gestureImageView, 0);
        InternalGesturesListener internalGesturesListener = new InternalGesturesListener();
        this.gestureDetector = new GestureDetector(context, internalGesturesListener);
        ScaleGestureDetectorFixed scaleGestureDetectorFixed = new ScaleGestureDetectorFixed(context, internalGesturesListener);
        long currentTimeMillis = System.currentTimeMillis();
        MotionEvent obtain = MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0);
        scaleGestureDetectorFixed.onTouchEvent(obtain);
        obtain.recycle();
        this.scaleDetector = scaleGestureDetectorFixed;
        this.rotateDetector = new RotationGestureDetector(internalGesturesListener);
        this.exitController = new ExitController(gestureImageView, this);
        this.flingScroller = new OverScroller(context);
        this.stateScroller = new FloatScroller();
        this.flingBounds = new MovementBounds(settings);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
        this.minVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.maxVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final boolean animateStateTo(State state, boolean z) {
        if (state != null) {
            stopAllAnimations();
            boolean isNaN = Float.isNaN(this.pivotX);
            Settings settings = this.settings;
            if (isNaN || Float.isNaN(this.pivotY)) {
                GravityUtils.getDefaultPivot(settings, tmpPoint);
                this.pivotX = r1.x;
                this.pivotY = r1.y;
            }
            State state2 = null;
            if (z) {
                float f = this.pivotX;
                float f2 = this.pivotY;
                StateController stateController = this.stateController;
                stateController.getClass();
                State state3 = StateController.tmpState;
                state3.set(state);
                if (stateController.restrictStateBounds(state3, this.prevState, f, f2, false, false, true)) {
                    state2 = new State();
                    state2.set(state3);
                }
            }
            if (state2 != null) {
                state = state2;
            }
            State state4 = this.state;
            if (!state.equals(state4)) {
                this.isAnimatingInBounds = z;
                State state5 = this.stateStart;
                state5.set(state4);
                State state6 = this.stateEnd;
                state6.set(state);
                float f3 = this.pivotX;
                float[] fArr = tmpPointArr;
                fArr[0] = f3;
                fArr[1] = this.pivotY;
                Matrix matrix = MathUtils.tmpMatrix;
                state5.get(matrix);
                Matrix matrix2 = MathUtils.tmpMatrixInverse;
                matrix.invert(matrix2);
                matrix2.mapPoints(fArr);
                matrix.set(state6.matrix);
                matrix.mapPoints(fArr);
                this.endPivotX = fArr[0];
                this.endPivotY = fArr[1];
                long j = settings.animationsDuration;
                FloatScroller floatScroller = this.stateScroller;
                floatScroller.duration = j;
                floatScroller.finished = false;
                floatScroller.startRtc = SystemClock.elapsedRealtime();
                floatScroller.startValue = RecyclerView.DECELERATION_RATE;
                floatScroller.finalValue = 1.0f;
                floatScroller.currValue = RecyclerView.DECELERATION_RATE;
                LocalAnimationEngine localAnimationEngine = this.animationEngine;
                GestureImageView gestureImageView = (GestureImageView) localAnimationEngine.zab;
                gestureImageView.removeCallbacks(localAnimationEngine);
                gestureImageView.postOnAnimation(localAnimationEngine);
                notifyStateSourceChanged();
                return true;
            }
        }
        return false;
    }

    public final boolean isAnimatingState() {
        return !this.stateScroller.finished;
    }

    public final int limitFlingVelocity(float f) {
        if (Math.abs(f) < this.minVelocity) {
            return 0;
        }
        float abs = Math.abs(f);
        int i = this.maxVelocity;
        return abs >= ((float) i) ? ((int) Math.signum(f)) * i : Math.round(f);
    }

    public final void notifyStateReset() {
        ExitController exitController = this.exitController;
        if (exitController.isExitDetected()) {
            exitController.exitState = 1.0f;
            exitController.updateState();
            exitController.finishDetection();
        }
        Iterator it = this.stateListeners.iterator();
        while (it.hasNext()) {
            GestureImageView.AnonymousClass1 anonymousClass1 = (GestureImageView.AnonymousClass1) it.next();
            switch (anonymousClass1.$r8$classId) {
                case 0:
                    GestureImageView gestureImageView = (GestureImageView) anonymousClass1.this$0;
                    Matrix matrix = gestureImageView.imageMatrix;
                    this.state.get(matrix);
                    gestureImageView.setImageMatrix(matrix);
                    break;
                case 1:
                    ViewParent parent = ((GestureImageView) anonymousClass1.this$0).getParent();
                    if (parent == null) {
                        break;
                    } else {
                        parent.requestDisallowInterceptTouchEvent(true);
                        break;
                    }
            }
        }
        notifyStateUpdated();
    }

    public final void notifyStateSourceChanged() {
        StateSource stateSource = (isAnimatingState() || !this.flingScroller.isFinished()) ? StateSource.ANIMATION : (this.isScrollDetected || this.isScaleDetected || this.isRotationDetected) ? StateSource.USER : StateSource.NONE;
        if (this.stateSource != stateSource) {
            this.stateSource = stateSource;
        }
    }

    public final void notifyStateUpdated() {
        State state = this.prevState;
        State state2 = this.state;
        state.set(state2);
        Iterator it = this.stateListeners.iterator();
        while (it.hasNext()) {
            GestureImageView.AnonymousClass1 anonymousClass1 = (GestureImageView.AnonymousClass1) it.next();
            switch (anonymousClass1.$r8$classId) {
                case 0:
                    GestureImageView gestureImageView = (GestureImageView) anonymousClass1.this$0;
                    Matrix matrix = gestureImageView.imageMatrix;
                    state2.get(matrix);
                    gestureImageView.setImageMatrix(matrix);
                    break;
                case 1:
                    state2.getClass();
                    ViewParent parent = ((GestureImageView) anonymousClass1.this$0).getParent();
                    if (parent == null) {
                        break;
                    } else {
                        parent.requestDisallowInterceptTouchEvent(true);
                        break;
                    }
                default:
                    ViewPositionAnimator viewPositionAnimator = (ViewPositionAnimator) anonymousClass1.this$0;
                    GestureControllerForPager gestureControllerForPager = viewPositionAnimator.toController;
                    gestureControllerForPager.stateController.applyZoomPatch(viewPositionAnimator.fromState);
                    gestureControllerForPager.stateController.applyZoomPatch(viewPositionAnimator.toState);
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0210, code lost:
    
        if (r4.isZoomEnabled == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x021b, code lost:
    
        if (r4.isRotationEnabled == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x025d, code lost:
    
        if (r4.boundsDisableCount > 0) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019f  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ExitController exitController;
        boolean isExitDetected;
        State state;
        boolean z;
        State state2;
        GestureControllerForPager gestureControllerForPager = (GestureControllerForPager) this;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-view.getPaddingLeft(), -view.getPaddingTop());
        boolean isLongClickable = view.isLongClickable();
        GestureDetector gestureDetector = gestureControllerForPager.gestureDetector;
        gestureDetector.setIsLongpressEnabled(isLongClickable);
        boolean onTouchEvent = gestureDetector.onTouchEvent(obtain);
        gestureControllerForPager.scaleDetector.onTouchEvent(obtain);
        RotationGestureDetector rotationGestureDetector = gestureControllerForPager.rotateDetector;
        GestureController gestureController = GestureController.this;
        int actionMasked = obtain.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6 && obtain.getPointerCount() == 2) {
                            rotationGestureDetector.cancelRotation();
                        }
                    } else if (obtain.getPointerCount() == 2) {
                        float degrees = (float) Math.toDegrees(Math.atan2(obtain.getY(1) - obtain.getY(0), obtain.getX(1) - obtain.getX(0)));
                        rotationGestureDetector.currAngle = degrees;
                        rotationGestureDetector.prevAngle = degrees;
                        rotationGestureDetector.initialAngle = degrees;
                    }
                }
            } else if (obtain.getPointerCount() >= 2 && (!rotationGestureDetector.isInProgress || rotationGestureDetector.isGestureAccepted)) {
                rotationGestureDetector.currAngle = (float) Math.toDegrees(Math.atan2(obtain.getY(1) - obtain.getY(0), obtain.getX(1) - obtain.getX(0)));
                rotationGestureDetector.focusX = (obtain.getX(0) + obtain.getX(1)) * 0.5f;
                rotationGestureDetector.focusY = (obtain.getY(0) + obtain.getY(1)) * 0.5f;
                boolean z2 = rotationGestureDetector.isInProgress;
                if (!z2 && Math.abs(rotationGestureDetector.initialAngle - rotationGestureDetector.currAngle) >= 5.0f) {
                    rotationGestureDetector.isInProgress = true;
                    GestureControllerForPager gestureControllerForPager2 = (GestureControllerForPager) gestureController;
                    Settings settings = gestureControllerForPager2.settings;
                    boolean z3 = settings.isGesturesEnabled() && settings.isRotationEnabled;
                    gestureControllerForPager2.isRotationDetected = z3;
                    if (z3) {
                        gestureControllerForPager2.exitController.isRotationInAction = true;
                    }
                    rotationGestureDetector.isGestureAccepted = z3;
                }
                if (z2) {
                    if (rotationGestureDetector.isInProgress && rotationGestureDetector.isGestureAccepted) {
                        Settings settings2 = gestureController.settings;
                        if (settings2.isGesturesEnabled() && settings2.isRotationEnabled && !gestureController.isAnimatingState()) {
                            if (!gestureController.exitController.isExitDetected()) {
                                float f = rotationGestureDetector.focusX;
                                gestureController.pivotX = f;
                                float f2 = rotationGestureDetector.focusY;
                                gestureController.pivotY = f2;
                                State state3 = gestureController.state;
                                float f3 = rotationGestureDetector.currAngle - rotationGestureDetector.prevAngle;
                                Matrix matrix = state3.matrix;
                                State.nonNaN(f3);
                                State.nonNaN(f);
                                State.nonNaN(f2);
                                matrix.postRotate(f3, f, f2);
                                state3.updateFromMatrix(false, true);
                                gestureController.isStateChangedDuringTouch = true;
                            }
                        }
                    }
                }
                rotationGestureDetector.prevAngle = rotationGestureDetector.currAngle;
            }
            if (!onTouchEvent && !gestureControllerForPager.isScaleDetected) {
                boolean z4 = gestureControllerForPager.isRotationDetected;
            }
            gestureControllerForPager.notifyStateSourceChanged();
            exitController = gestureControllerForPager.exitController;
            isExitDetected = exitController.isExitDetected();
            State state4 = gestureControllerForPager.prevState;
            state = gestureControllerForPager.state;
            if (isExitDetected && !state.equals(state4)) {
                gestureControllerForPager.notifyStateUpdated();
            }
            if (gestureControllerForPager.isStateChangedDuringTouch) {
                gestureControllerForPager.isStateChangedDuringTouch = false;
                gestureControllerForPager.stateController.restrictStateBounds(gestureControllerForPager.state, gestureControllerForPager.prevState, gestureControllerForPager.pivotX, gestureControllerForPager.pivotY, true, true, false);
                if (!state.equals(state4)) {
                    gestureControllerForPager.notifyStateUpdated();
                }
            }
            z = gestureControllerForPager.isRestrictZoomRequested;
            StateController stateController = gestureControllerForPager.stateController;
            if (!z || gestureControllerForPager.isRestrictRotationRequested) {
                gestureControllerForPager.isRestrictZoomRequested = false;
                gestureControllerForPager.isRestrictRotationRequested = false;
                if (!exitController.isExitDetected()) {
                    float f4 = gestureControllerForPager.pivotX;
                    float f5 = gestureControllerForPager.pivotY;
                    stateController.getClass();
                    State state5 = StateController.tmpState;
                    state5.set(state);
                    if (stateController.restrictStateBounds(state5, gestureControllerForPager.prevState, f4, f5, true, false, true)) {
                        state2 = new State();
                        state2.set(state5);
                    } else {
                        state2 = null;
                    }
                    gestureControllerForPager.animateStateTo(state2, false);
                }
            }
            if (obtain.getActionMasked() != 1 || obtain.getActionMasked() == 3) {
                gestureControllerForPager.isScrollDetected = false;
                gestureControllerForPager.isScaleDetected = false;
                gestureControllerForPager.isRotationDetected = false;
                exitController.finishDetection();
                if (gestureControllerForPager.flingScroller.isFinished() && !gestureControllerForPager.isAnimatingInBounds) {
                    gestureControllerForPager.animateStateTo(state, true);
                }
                gestureControllerForPager.notifyStateSourceChanged();
            }
            if (!gestureControllerForPager.isInterceptTouchDisallowed) {
                if (!exitController.isExitDetected()) {
                    int actionMasked2 = obtain.getActionMasked();
                    Settings settings3 = gestureControllerForPager.settings;
                    if (actionMasked2 == 0 || actionMasked2 == 2) {
                        MovementBounds movementBounds = stateController.movBounds;
                        movementBounds.set(state);
                        RectF rectF = movementBounds.bounds;
                        float f6 = movementBounds.boundsRotation;
                        RectF rectF2 = tmpRectF;
                        if (f6 == RecyclerView.DECELERATION_RATE) {
                            rectF2.set(rectF);
                        } else {
                            Matrix matrix2 = MovementBounds.tmpMatrix;
                            matrix2.setRotate(f6, movementBounds.boundsPivotX, movementBounds.boundsPivotY);
                            matrix2.mapRect(rectF2, rectF);
                        }
                        boolean z5 = State.compare(rectF2.width(), RecyclerView.DECELERATION_RATE) > 0 || State.compare(rectF2.height(), RecyclerView.DECELERATION_RATE) > 0;
                        if (settings3.isPanEnabled()) {
                            if (!z5) {
                            }
                        }
                    } else if (actionMasked2 == 5) {
                        if (settings3.isGesturesEnabled()) {
                        }
                        if (settings3.isGesturesEnabled()) {
                        }
                    }
                }
                gestureControllerForPager.isInterceptTouchDisallowed = true;
                ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            obtain.recycle();
            return this.settings.isEnabled();
        }
        rotationGestureDetector.cancelRotation();
        if (!onTouchEvent) {
            boolean z42 = gestureControllerForPager.isRotationDetected;
        }
        gestureControllerForPager.notifyStateSourceChanged();
        exitController = gestureControllerForPager.exitController;
        isExitDetected = exitController.isExitDetected();
        State state42 = gestureControllerForPager.prevState;
        state = gestureControllerForPager.state;
        if (isExitDetected) {
            gestureControllerForPager.notifyStateUpdated();
        }
        if (gestureControllerForPager.isStateChangedDuringTouch) {
        }
        z = gestureControllerForPager.isRestrictZoomRequested;
        StateController stateController2 = gestureControllerForPager.stateController;
        if (!z) {
        }
        gestureControllerForPager.isRestrictZoomRequested = false;
        gestureControllerForPager.isRestrictRotationRequested = false;
        if (!exitController.isExitDetected()) {
        }
        if (obtain.getActionMasked() != 1) {
        }
        gestureControllerForPager.isScrollDetected = false;
        gestureControllerForPager.isScaleDetected = false;
        gestureControllerForPager.isRotationDetected = false;
        exitController.finishDetection();
        if (gestureControllerForPager.flingScroller.isFinished()) {
            gestureControllerForPager.animateStateTo(state, true);
        }
        gestureControllerForPager.notifyStateSourceChanged();
        if (!gestureControllerForPager.isInterceptTouchDisallowed) {
        }
        obtain.recycle();
        return this.settings.isEnabled();
    }

    public final void resetState() {
        stopAllAnimations();
        StateController stateController = this.stateController;
        stateController.isResetRequired = true;
        if (stateController.updateState(this.state)) {
            notifyStateReset();
        } else {
            notifyStateUpdated();
        }
    }

    public final void stopAllAnimations() {
        if (isAnimatingState()) {
            this.stateScroller.finished = true;
            this.isAnimatingInBounds = false;
            this.pivotX = Float.NaN;
            this.pivotY = Float.NaN;
            this.endPivotX = Float.NaN;
            this.endPivotY = Float.NaN;
            notifyStateSourceChanged();
        }
        stopFlingAnimation();
    }

    public final void stopFlingAnimation() {
        OverScroller overScroller = this.flingScroller;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.forceFinished(true);
        notifyStateSourceChanged();
    }

    public final void updateState() {
        StateController stateController = this.stateController;
        State state = this.state;
        stateController.applyZoomPatch(state);
        stateController.applyZoomPatch(this.prevState);
        stateController.applyZoomPatch(this.stateStart);
        stateController.applyZoomPatch(this.stateEnd);
        ExitController exitController = this.exitController;
        StateController stateController2 = exitController.controller.stateController;
        float f = exitController.initialZoom;
        float f2 = stateController2.zoomPatch;
        if (f2 > RecyclerView.DECELERATION_RATE) {
            f *= f2;
        }
        exitController.initialZoom = f;
        if (stateController.updateState(state)) {
            notifyStateReset();
        } else {
            notifyStateUpdated();
        }
    }
}
