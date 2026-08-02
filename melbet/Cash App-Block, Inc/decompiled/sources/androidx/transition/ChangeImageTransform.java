package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.transition.MatrixUtils;
import androidx.transition.Transition;
import androidx.transition.ViewUtils;
import com.squareup.cash.R;
import com.squareup.cash.filament.Vector4Animator;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ChangeImageTransform extends Transition {
    public static final String[] sTransitionProperties = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final AnonymousClass1 NULL_MATRIX_EVALUATOR = new AnonymousClass1(0);
    public static final ViewUtils.AnonymousClass1 ANIMATED_TRANSFORM_PROPERTY = new ViewUtils.AnonymousClass1(7, Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$3, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void captureValues$1(TransitionValues transitionValues, boolean z) {
        Matrix matrix;
        View view = transitionValues.view;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap hashMap = transitionValues.values;
            hashMap.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z ? (Matrix) imageView.getTag(R.id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i = AnonymousClass3.$SwitchMap$android$widget$ImageView$ScaleType[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f2 = intrinsicHeight;
                        float max = Math.max(width / f, height / f2);
                        int round = Math.round((width - (f * max)) / 2.0f);
                        int round2 = Math.round((height - (f2 * max)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(max, max);
                        matrix.postTranslate(round, round2);
                    }
                    matrix2 = matrix;
                }
            }
            hashMap.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        captureValues$1(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        captureValues$1(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        HashMap hashMap = transitionValues.values;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap hashMap2 = transitionValues2.values;
        Rect rect = (Rect) hashMap.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) hashMap.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) hashMap2.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) transitionValues2.view;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        ViewUtils.AnonymousClass1 anonymousClass1 = ANIMATED_TRANSFORM_PROPERTY;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            MatrixUtils.AnonymousClass1 anonymousClass12 = MatrixUtils.IDENTITY_MATRIX;
            return ObjectAnimator.ofObject(imageView, anonymousClass1, NULL_MATRIX_EVALUATOR, anonymousClass12, anonymousClass12);
        }
        if (matrix == null) {
            matrix = MatrixUtils.IDENTITY_MATRIX;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.IDENTITY_MATRIX;
        }
        anonymousClass1.getClass();
        imageView.animateTransform(matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(imageView, anonymousClass1, new TypeEvaluator() { // from class: androidx.transition.TransitionUtils$MatrixEvaluator
            public final float[] mTempStartValues = new float[9];
            public final float[] mTempEndValues = new float[9];
            public final Matrix mTempMatrix = new Matrix();

            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                float[] fArr = this.mTempStartValues;
                ((Matrix) obj).getValues(fArr);
                float[] fArr2 = this.mTempEndValues;
                ((Matrix) obj2).getValues(fArr2);
                for (int i = 0; i < 9; i++) {
                    float f2 = fArr2[i];
                    float f3 = fArr[i];
                    fArr2[i] = CameraState$Type$EnumUnboxingLocalUtility.m(f2, f3, f, f3);
                }
                Matrix matrix3 = this.mTempMatrix;
                matrix3.setValues(fArr2);
                return matrix3;
            }
        }, matrix, matrix2);
        Listener listener = new Listener(imageView, matrix, matrix2);
        ofObject.addListener(listener);
        ofObject.addPauseListener(listener);
        addListener(listener);
        return ofObject;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    public final class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final Matrix mEndMatrix;
        public final ImageView mImageView;
        public boolean mIsBeforeAnimator = true;
        public final Matrix mStartMatrix;

        public Listener(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.mImageView = imageView;
            this.mStartMatrix = matrix;
            this.mEndMatrix = matrix2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.mIsBeforeAnimator = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
            ImageView imageView = this.mImageView;
            imageView.setTag(R.id.transition_image_transform, matrix);
            imageView.animateTransform(this.mEndMatrix);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            ImageView imageView = this.mImageView;
            Matrix matrix = (Matrix) imageView.getTag(R.id.transition_image_transform);
            if (matrix != null) {
                imageView.animateTransform(matrix);
                imageView.setTag(R.id.transition_image_transform, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            this.mIsBeforeAnimator = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause() {
            if (this.mIsBeforeAnimator) {
                ImageView imageView = this.mImageView;
                imageView.setTag(R.id.transition_image_transform, this.mStartMatrix);
                imageView.animateTransform(this.mEndMatrix);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume() {
            ImageView imageView = this.mImageView;
            Matrix matrix = (Matrix) imageView.getTag(R.id.transition_image_transform);
            if (matrix != null) {
                imageView.animateTransform(matrix);
                imageView.setTag(R.id.transition_image_transform, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            this.mIsBeforeAnimator = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.mIsBeforeAnimator = false;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$1, reason: invalid class name */
    public final class AnonymousClass1 implements TypeEvaluator {
        public final /* synthetic */ int $r8$classId;

        public AnonymousClass1(Vector4Animator vector4Animator) {
            this.$r8$classId = 2;
        }

        @Override // android.animation.TypeEvaluator
        public final Object evaluate(float f, Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return null;
                case 1:
                    Quat quat = (Quat) obj;
                    Quat quat2 = (Quat) obj2;
                    quat.getClass();
                    quat2.getClass();
                    return quat.slerp(quat2, f);
                default:
                    Vector4 vector4 = (Vector4) obj;
                    Vector4 vector42 = (Vector4) obj2;
                    vector4.getClass();
                    vector42.getClass();
                    float[] fArr = vector4.vector;
                    float f2 = fArr[0];
                    float[] fArr2 = vector42.vector;
                    return new Vector4((fArr2[0] - f2) * f, (fArr2[1] - fArr[1]) * f, (fArr2[2] - fArr[2]) * f, (fArr2[3] - fArr[3]) * f);
            }
        }

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }
    }
}
