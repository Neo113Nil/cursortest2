package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate;
import com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate;
import com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;
import com.google.android.material.progressindicator.IndeterminateDrawable;
import com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import com.google.mlkit.vision.text.Text;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ViewUtils {
    public static final AnonymousClass1 TRANSITION_ALPHA = new AnonymousClass1(0, Float.class, "translationAlpha");
    public static final AnonymousClass1 CLIP_BOUNDS = new AnonymousClass1(8, Rect.class, "clipBounds");

    /* renamed from: androidx.transition.ViewUtils$1, reason: invalid class name */
    public final class AnonymousClass1 extends Property {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Class cls, String str) {
            super(cls, str);
            this.$r8$classId = i;
        }

        @Override // android.util.Property
        public final Object get(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return Float.valueOf(((View) obj).getTransitionAlpha());
                case 1:
                    return Float.valueOf(((SwitchCompat) obj).mThumbPosition);
                case 2:
                    return null;
                case 3:
                    return null;
                case 4:
                    return null;
                case 5:
                    return null;
                case 6:
                    return null;
                case 7:
                    return null;
                case 8:
                    return ((View) obj).getClipBounds();
                case 9:
                    ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                    int alpha = Color.alpha(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), 0));
                    return Float.valueOf(alpha != 0 ? Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / alpha : RecyclerView.DECELERATION_RATE);
                case 10:
                    return Float.valueOf(((View) obj).getLayoutParams().width);
                case 11:
                    return Float.valueOf(((View) obj).getLayoutParams().height);
                case 12:
                    return Float.valueOf(((View) obj).getPaddingStart());
                case 13:
                    return Float.valueOf(((View) obj).getPaddingEnd());
                case 14:
                    return Float.valueOf(((CircularIndeterminateAdvanceAnimatorDelegate) obj).animationFraction);
                case 15:
                    return Float.valueOf(((CircularIndeterminateAdvanceAnimatorDelegate) obj).completeEndFraction);
                case 16:
                    return Float.valueOf(((CircularIndeterminateRetreatAnimatorDelegate) obj).animationFraction);
                case 17:
                    return Float.valueOf(((CircularIndeterminateRetreatAnimatorDelegate) obj).completeEndFraction);
                case 18:
                    return Float.valueOf(((DrawableWithAnimatedVisibilityChange) obj).getGrowFraction());
                case 19:
                    return Float.valueOf(((LinearIndeterminateContiguousAnimatorDelegate) obj).animationFraction);
                default:
                    return Float.valueOf(((LinearIndeterminateDisjointAnimatorDelegate) obj).animationFraction);
            }
        }

        @Override // android.util.Property
        public final void set(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                    break;
                case 1:
                    SwitchCompat switchCompat = (SwitchCompat) obj;
                    switchCompat.mThumbPosition = ((Float) obj2).floatValue();
                    switchCompat.invalidate();
                    break;
                case 2:
                    ChangeBounds.ViewBounds viewBounds = (ChangeBounds.ViewBounds) obj;
                    PointF pointF = (PointF) obj2;
                    viewBounds.getClass();
                    viewBounds.mLeft = Math.round(pointF.x);
                    int round = Math.round(pointF.y);
                    viewBounds.mTop = round;
                    int i = viewBounds.mTopLeftCalls + 1;
                    viewBounds.mTopLeftCalls = i;
                    if (i == viewBounds.mBottomRightCalls) {
                        View view = viewBounds.mView;
                        int i2 = viewBounds.mLeft;
                        int i3 = viewBounds.mRight;
                        int i4 = viewBounds.mBottom;
                        AnonymousClass1 anonymousClass1 = ViewUtils.TRANSITION_ALPHA;
                        view.setLeftTopRightBottom(i2, round, i3, i4);
                        viewBounds.mTopLeftCalls = 0;
                        viewBounds.mBottomRightCalls = 0;
                        break;
                    }
                    break;
                case 3:
                    ChangeBounds.ViewBounds viewBounds2 = (ChangeBounds.ViewBounds) obj;
                    PointF pointF2 = (PointF) obj2;
                    viewBounds2.getClass();
                    viewBounds2.mRight = Math.round(pointF2.x);
                    int round2 = Math.round(pointF2.y);
                    viewBounds2.mBottom = round2;
                    int i5 = viewBounds2.mBottomRightCalls + 1;
                    viewBounds2.mBottomRightCalls = i5;
                    if (viewBounds2.mTopLeftCalls == i5) {
                        View view2 = viewBounds2.mView;
                        int i6 = viewBounds2.mLeft;
                        int i7 = viewBounds2.mTop;
                        int i8 = viewBounds2.mRight;
                        AnonymousClass1 anonymousClass12 = ViewUtils.TRANSITION_ALPHA;
                        view2.setLeftTopRightBottom(i6, i7, i8, round2);
                        viewBounds2.mTopLeftCalls = 0;
                        viewBounds2.mBottomRightCalls = 0;
                        break;
                    }
                    break;
                case 4:
                    View view3 = (View) obj;
                    PointF pointF3 = (PointF) obj2;
                    int left = view3.getLeft();
                    int top = view3.getTop();
                    int round3 = Math.round(pointF3.x);
                    int round4 = Math.round(pointF3.y);
                    AnonymousClass1 anonymousClass13 = ViewUtils.TRANSITION_ALPHA;
                    view3.setLeftTopRightBottom(left, top, round3, round4);
                    break;
                case 5:
                    View view4 = (View) obj;
                    PointF pointF4 = (PointF) obj2;
                    int round5 = Math.round(pointF4.x);
                    int round6 = Math.round(pointF4.y);
                    int right = view4.getRight();
                    int bottom = view4.getBottom();
                    AnonymousClass1 anonymousClass14 = ViewUtils.TRANSITION_ALPHA;
                    view4.setLeftTopRightBottom(round5, round6, right, bottom);
                    break;
                case 6:
                    View view5 = (View) obj;
                    PointF pointF5 = (PointF) obj2;
                    int round7 = Math.round(pointF5.x);
                    int round8 = Math.round(pointF5.y);
                    int width = view5.getWidth() + round7;
                    int height = view5.getHeight() + round8;
                    AnonymousClass1 anonymousClass15 = ViewUtils.TRANSITION_ALPHA;
                    view5.setLeftTopRightBottom(round7, round8, width, height);
                    break;
                case 7:
                    ((ImageView) obj).animateTransform((Matrix) obj2);
                    break;
                case 8:
                    ((View) obj).setClipBounds((Rect) obj2);
                    break;
                case 9:
                    ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                    Float f = (Float) obj2;
                    if (f.floatValue() == 1.0f) {
                        extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
                        break;
                    } else {
                        extendedFloatingActionButton.silentlyUpdateTextColor(ColorStateList.valueOf(ColorUtils.setAlphaComponent(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), 0), Math.round(AnimationUtils.lerp(RecyclerView.DECELERATION_RATE, Color.alpha(r13), f.floatValue())))));
                        break;
                    }
                case 10:
                    View view6 = (View) obj;
                    view6.getLayoutParams().width = ((Float) obj2).intValue();
                    view6.requestLayout();
                    break;
                case 11:
                    View view7 = (View) obj;
                    view7.getLayoutParams().height = ((Float) obj2).intValue();
                    view7.requestLayout();
                    break;
                case 12:
                    View view8 = (View) obj;
                    view8.setPaddingRelative(((Float) obj2).intValue(), view8.getPaddingTop(), view8.getPaddingEnd(), view8.getPaddingBottom());
                    break;
                case 13:
                    View view9 = (View) obj;
                    view9.setPaddingRelative(view9.getPaddingStart(), view9.getPaddingTop(), ((Float) obj2).intValue(), view9.getPaddingBottom());
                    break;
                case 14:
                    CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = (CircularIndeterminateAdvanceAnimatorDelegate) obj;
                    float floatValue = ((Float) obj2).floatValue();
                    circularIndeterminateAdvanceAnimatorDelegate.animationFraction = floatValue;
                    int i9 = (int) (floatValue * 5400.0f);
                    FastOutSlowInInterpolator fastOutSlowInInterpolator = circularIndeterminateAdvanceAnimatorDelegate.interpolator;
                    ArrayList arrayList = (ArrayList) circularIndeterminateAdvanceAnimatorDelegate.zzd;
                    DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = (DrawingDelegate$ActiveIndicator) arrayList.get(0);
                    float f2 = circularIndeterminateAdvanceAnimatorDelegate.animationFraction * 1520.0f;
                    drawingDelegate$ActiveIndicator.startFraction = (-20.0f) + f2;
                    drawingDelegate$ActiveIndicator.endFraction = f2;
                    for (int i10 = 0; i10 < 4; i10++) {
                        drawingDelegate$ActiveIndicator.endFraction = (fastOutSlowInInterpolator.getInterpolation(Text.TextBase.getFractionInRange(i9, CircularIndeterminateAdvanceAnimatorDelegate.DELAY_TO_EXPAND_IN_MS[i10], 667)) * 250.0f) + drawingDelegate$ActiveIndicator.endFraction;
                        drawingDelegate$ActiveIndicator.startFraction = (fastOutSlowInInterpolator.getInterpolation(Text.TextBase.getFractionInRange(i9, CircularIndeterminateAdvanceAnimatorDelegate.DELAY_TO_COLLAPSE_IN_MS[i10], 667)) * 250.0f) + drawingDelegate$ActiveIndicator.startFraction;
                    }
                    float f3 = drawingDelegate$ActiveIndicator.startFraction;
                    float f4 = drawingDelegate$ActiveIndicator.endFraction;
                    drawingDelegate$ActiveIndicator.startFraction = (((f4 - f3) * circularIndeterminateAdvanceAnimatorDelegate.completeEndFraction) + f3) / 360.0f;
                    drawingDelegate$ActiveIndicator.endFraction = f4 / 360.0f;
                    int i11 = 0;
                    while (true) {
                        if (i11 < 4) {
                            float fractionInRange = Text.TextBase.getFractionInRange(i9, CircularIndeterminateAdvanceAnimatorDelegate.DELAY_TO_FADE_IN_MS[i11], 333);
                            if (fractionInRange <= RecyclerView.DECELERATION_RATE || fractionInRange >= 1.0f) {
                                i11++;
                            } else {
                                int i12 = i11 + circularIndeterminateAdvanceAnimatorDelegate.indicatorColorIndexOffset;
                                int[] iArr = circularIndeterminateAdvanceAnimatorDelegate.baseSpec.indicatorColors;
                                int length = i12 % iArr.length;
                                int length2 = (length + 1) % iArr.length;
                                ((DrawingDelegate$ActiveIndicator) arrayList.get(0)).color = ArgbEvaluatorCompat.evaluate(Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2]), fastOutSlowInInterpolator.getInterpolation(fractionInRange)).intValue();
                            }
                        }
                    }
                    ((IndeterminateDrawable) circularIndeterminateAdvanceAnimatorDelegate.zza).invalidateSelf();
                    break;
                case 15:
                    ((CircularIndeterminateAdvanceAnimatorDelegate) obj).completeEndFraction = ((Float) obj2).floatValue();
                    break;
                case 16:
                    CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate = (CircularIndeterminateRetreatAnimatorDelegate) obj;
                    float floatValue2 = ((Float) obj2).floatValue();
                    circularIndeterminateRetreatAnimatorDelegate.animationFraction = floatValue2;
                    int i13 = (int) (floatValue2 * 6000.0f);
                    TimeInterpolator timeInterpolator = circularIndeterminateRetreatAnimatorDelegate.standardInterpolator;
                    ArrayList arrayList2 = (ArrayList) circularIndeterminateRetreatAnimatorDelegate.zzd;
                    DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator2 = (DrawingDelegate$ActiveIndicator) arrayList2.get(0);
                    float f5 = circularIndeterminateRetreatAnimatorDelegate.animationFraction * 1080.0f;
                    int[] iArr2 = CircularIndeterminateRetreatAnimatorDelegate.DELAY_SPINS_IN_MS;
                    float f6 = 0.0f;
                    for (int i14 : iArr2) {
                        f6 += timeInterpolator.getInterpolation(Text.TextBase.getFractionInRange(i13, i14, 500)) * 90.0f;
                    }
                    drawingDelegate$ActiveIndicator2.rotationDegree = f5 + f6;
                    float interpolation = timeInterpolator.getInterpolation(Text.TextBase.getFractionInRange(i13, 0, 3000)) - timeInterpolator.getInterpolation(Text.TextBase.getFractionInRange(i13, 3000, 3000));
                    drawingDelegate$ActiveIndicator2.startFraction = RecyclerView.DECELERATION_RATE;
                    float[] fArr = CircularIndeterminateRetreatAnimatorDelegate.END_FRACTION_RANGE;
                    float lerp = MathUtils.lerp(fArr[0], fArr[1], interpolation);
                    drawingDelegate$ActiveIndicator2.endFraction = lerp;
                    float f7 = circularIndeterminateRetreatAnimatorDelegate.completeEndFraction;
                    if (f7 > RecyclerView.DECELERATION_RATE) {
                        drawingDelegate$ActiveIndicator2.endFraction = (1.0f - f7) * lerp;
                    }
                    int i15 = 0;
                    while (true) {
                        if (i15 < iArr2.length) {
                            float fractionInRange2 = Text.TextBase.getFractionInRange(i13, iArr2[i15], 100);
                            if (fractionInRange2 < RecyclerView.DECELERATION_RATE || fractionInRange2 > 1.0f) {
                                i15++;
                            } else {
                                int i16 = i15 + circularIndeterminateRetreatAnimatorDelegate.indicatorColorIndexOffset;
                                int[] iArr3 = circularIndeterminateRetreatAnimatorDelegate.baseSpec.indicatorColors;
                                int length3 = i16 % iArr3.length;
                                int length4 = (length3 + 1) % iArr3.length;
                                ((DrawingDelegate$ActiveIndicator) arrayList2.get(0)).color = ArgbEvaluatorCompat.evaluate(Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4]), timeInterpolator.getInterpolation(fractionInRange2)).intValue();
                            }
                        }
                    }
                    ((IndeterminateDrawable) circularIndeterminateRetreatAnimatorDelegate.zza).invalidateSelf();
                    break;
                case 17:
                    ((CircularIndeterminateRetreatAnimatorDelegate) obj).completeEndFraction = ((Float) obj2).floatValue();
                    break;
                case 18:
                    DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) obj;
                    float floatValue3 = ((Float) obj2).floatValue();
                    if (drawableWithAnimatedVisibilityChange.growFraction != floatValue3) {
                        drawableWithAnimatedVisibilityChange.growFraction = floatValue3;
                        drawableWithAnimatedVisibilityChange.invalidateSelf();
                        break;
                    }
                    break;
                case 19:
                    LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = (LinearIndeterminateContiguousAnimatorDelegate) obj;
                    float floatValue4 = ((Float) obj2).floatValue();
                    linearIndeterminateContiguousAnimatorDelegate.animationFraction = floatValue4;
                    ArrayList arrayList3 = (ArrayList) linearIndeterminateContiguousAnimatorDelegate.zzd;
                    ((DrawingDelegate$ActiveIndicator) arrayList3.get(0)).startFraction = RecyclerView.DECELERATION_RATE;
                    float fractionInRange3 = Text.TextBase.getFractionInRange((int) (floatValue4 * 333.0f), 0, 667);
                    DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator3 = (DrawingDelegate$ActiveIndicator) arrayList3.get(0);
                    DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator4 = (DrawingDelegate$ActiveIndicator) arrayList3.get(1);
                    FastOutSlowInInterpolator fastOutSlowInInterpolator2 = linearIndeterminateContiguousAnimatorDelegate.interpolator;
                    float interpolation2 = fastOutSlowInInterpolator2.getInterpolation(fractionInRange3);
                    drawingDelegate$ActiveIndicator4.startFraction = interpolation2;
                    drawingDelegate$ActiveIndicator3.endFraction = interpolation2;
                    DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator5 = (DrawingDelegate$ActiveIndicator) arrayList3.get(1);
                    DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator6 = (DrawingDelegate$ActiveIndicator) arrayList3.get(2);
                    float interpolation3 = fastOutSlowInInterpolator2.getInterpolation(fractionInRange3 + 0.49925038f);
                    drawingDelegate$ActiveIndicator6.startFraction = interpolation3;
                    drawingDelegate$ActiveIndicator5.endFraction = interpolation3;
                    ((DrawingDelegate$ActiveIndicator) arrayList3.get(2)).endFraction = 1.0f;
                    if (linearIndeterminateContiguousAnimatorDelegate.dirtyColors && ((DrawingDelegate$ActiveIndicator) arrayList3.get(1)).endFraction < 1.0f) {
                        ((DrawingDelegate$ActiveIndicator) arrayList3.get(2)).color = ((DrawingDelegate$ActiveIndicator) arrayList3.get(1)).color;
                        ((DrawingDelegate$ActiveIndicator) arrayList3.get(1)).color = ((DrawingDelegate$ActiveIndicator) arrayList3.get(0)).color;
                        ((DrawingDelegate$ActiveIndicator) arrayList3.get(0)).color = linearIndeterminateContiguousAnimatorDelegate.baseSpec.indicatorColors[linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex];
                        linearIndeterminateContiguousAnimatorDelegate.dirtyColors = false;
                    }
                    ((IndeterminateDrawable) linearIndeterminateContiguousAnimatorDelegate.zza).invalidateSelf();
                    break;
                default:
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = (LinearIndeterminateDisjointAnimatorDelegate) obj;
                    float floatValue5 = ((Float) obj2).floatValue();
                    linearIndeterminateDisjointAnimatorDelegate.animationFraction = floatValue5;
                    int i17 = (int) (floatValue5 * 1800.0f);
                    Interpolator[] interpolatorArr = linearIndeterminateDisjointAnimatorDelegate.interpolatorArray;
                    ArrayList arrayList4 = (ArrayList) linearIndeterminateDisjointAnimatorDelegate.zzd;
                    for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                        DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator7 = (DrawingDelegate$ActiveIndicator) arrayList4.get(i18);
                        int[] iArr4 = LinearIndeterminateDisjointAnimatorDelegate.DELAY_TO_MOVE_SEGMENT_ENDS;
                        int i19 = i18 * 2;
                        int i20 = iArr4[i19];
                        int[] iArr5 = LinearIndeterminateDisjointAnimatorDelegate.DURATION_TO_MOVE_SEGMENT_ENDS;
                        drawingDelegate$ActiveIndicator7.startFraction = androidx.core.math.MathUtils.clamp(interpolatorArr[i19].getInterpolation(Text.TextBase.getFractionInRange(i17, i20, iArr5[i19])), RecyclerView.DECELERATION_RATE, 1.0f);
                        int i21 = i19 + 1;
                        drawingDelegate$ActiveIndicator7.endFraction = androidx.core.math.MathUtils.clamp(interpolatorArr[i21].getInterpolation(Text.TextBase.getFractionInRange(i17, iArr4[i21], iArr5[i21])), RecyclerView.DECELERATION_RATE, 1.0f);
                    }
                    if (linearIndeterminateDisjointAnimatorDelegate.dirtyColors) {
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            ((DrawingDelegate$ActiveIndicator) it.next()).color = linearIndeterminateDisjointAnimatorDelegate.baseSpec.indicatorColors[linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex];
                        }
                        linearIndeterminateDisjointAnimatorDelegate.dirtyColors = false;
                    }
                    ((IndeterminateDrawable) linearIndeterminateDisjointAnimatorDelegate.zza).invalidateSelf();
                    break;
            }
        }
    }
}
