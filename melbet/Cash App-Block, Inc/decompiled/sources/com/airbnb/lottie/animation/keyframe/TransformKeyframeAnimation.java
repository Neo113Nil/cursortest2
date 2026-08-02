package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.model.layer.BaseLayer$$ExternalSyntheticLambda0;
import com.airbnb.lottie.utils.Transform3D;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.Collections;

/* loaded from: classes3.dex */
public class TransformKeyframeAnimation {
    private BaseKeyframeAnimation<PointF, PointF> anchorPoint;
    private final boolean autoOrient;
    private BaseKeyframeAnimation<?, Float> endOpacity;
    private BaseKeyframeAnimation<Integer, Integer> opacity;
    private BaseKeyframeAnimation<?, PointF> position;
    private BaseKeyframeAnimation<Float, Float> rotation;
    private FloatKeyframeAnimation rotationX;
    private FloatKeyframeAnimation rotationY;
    private FloatKeyframeAnimation rotationZ;
    private BaseKeyframeAnimation<ScaleXY, ScaleXY> scale;
    private FloatKeyframeAnimation skew;
    private FloatKeyframeAnimation skewAngle;
    private final Matrix skewMatrix1;
    private final Matrix skewMatrix2;
    private final Matrix skewMatrix3;
    private final float[] skewValues;
    private BaseKeyframeAnimation<?, Float> startOpacity;
    private final Matrix matrix = new Matrix();
    private float cachedRotationX = Float.NaN;
    private float cachedRotationY = Float.NaN;
    private float cachedRotationZ = Float.NaN;
    private float cachedCosX = 1.0f;
    private float cachedCosY = 1.0f;
    private boolean rotation3DCacheDirty = true;

    public TransformKeyframeAnimation(AnimatableTransform animatableTransform) {
        this.anchorPoint = animatableTransform.getAnchorPoint() == null ? null : animatableTransform.getAnchorPoint().createAnimation();
        this.position = animatableTransform.getPosition() == null ? null : animatableTransform.getPosition().createAnimation();
        this.scale = animatableTransform.getScale() == null ? null : animatableTransform.getScale().createAnimation();
        this.rotation = animatableTransform.getRotation() == null ? null : animatableTransform.getRotation().createAnimation();
        this.skew = animatableTransform.getSkew() == null ? null : animatableTransform.getSkew().createAnimation();
        this.autoOrient = animatableTransform.isAutoOrient();
        this.rotationX = animatableTransform.getRotationX() == null ? null : animatableTransform.getRotationX().createAnimation();
        this.rotationY = animatableTransform.getRotationY() == null ? null : animatableTransform.getRotationY().createAnimation();
        this.rotationZ = animatableTransform.getRotationZ() == null ? null : animatableTransform.getRotationZ().createAnimation();
        if (this.skew != null) {
            this.skewMatrix1 = new Matrix();
            this.skewMatrix2 = new Matrix();
            this.skewMatrix3 = new Matrix();
            this.skewValues = new float[9];
        } else {
            this.skewMatrix1 = null;
            this.skewMatrix2 = null;
            this.skewMatrix3 = null;
            this.skewValues = null;
        }
        this.skewAngle = animatableTransform.getSkewAngle() == null ? null : animatableTransform.getSkewAngle().createAnimation();
        if (animatableTransform.getOpacity() != null) {
            this.opacity = animatableTransform.getOpacity().createAnimation();
        }
        if (animatableTransform.getStartOpacity() != null) {
            this.startOpacity = animatableTransform.getStartOpacity().createAnimation();
        } else {
            this.startOpacity = null;
        }
        if (animatableTransform.getEndOpacity() != null) {
            this.endOpacity = animatableTransform.getEndOpacity().createAnimation();
        } else {
            this.endOpacity = null;
        }
    }

    private void clearSkewValues() {
        for (int i = 0; i < 9; i++) {
            this.skewValues[i] = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addListener$0() {
        this.rotation3DCacheDirty = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addListener$1() {
        this.rotation3DCacheDirty = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addListener$2() {
        this.rotation3DCacheDirty = true;
    }

    public void addAnimationsToLayer(BaseLayer baseLayer) {
        baseLayer.addAnimation(this.opacity);
        baseLayer.addAnimation(this.startOpacity);
        baseLayer.addAnimation(this.endOpacity);
        baseLayer.addAnimation(this.anchorPoint);
        baseLayer.addAnimation(this.position);
        baseLayer.addAnimation(this.scale);
        baseLayer.addAnimation(this.rotation);
        baseLayer.addAnimation(this.skew);
        baseLayer.addAnimation(this.skewAngle);
        baseLayer.addAnimation(this.rotationX);
        baseLayer.addAnimation(this.rotationY);
        baseLayer.addAnimation(this.rotationZ);
    }

    public void addListener(BaseKeyframeAnimation.AnimationListener animationListener) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.opacity;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.startOpacity;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.endOpacity;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.anchorPoint;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.position;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation6 = this.scale;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.rotation;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.addUpdateListener(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.skew;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.addUpdateListener(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.skewAngle;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.addUpdateListener(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation3 = this.rotationX;
        if (floatKeyframeAnimation3 != null) {
            floatKeyframeAnimation3.addUpdateListener(animationListener);
            this.rotationX.addUpdateListener(new BaseLayer$$ExternalSyntheticLambda0(this, 1));
        }
        FloatKeyframeAnimation floatKeyframeAnimation4 = this.rotationY;
        if (floatKeyframeAnimation4 != null) {
            floatKeyframeAnimation4.addUpdateListener(animationListener);
            this.rotationY.addUpdateListener(new BaseLayer$$ExternalSyntheticLambda0(this, 2));
        }
        FloatKeyframeAnimation floatKeyframeAnimation5 = this.rotationZ;
        if (floatKeyframeAnimation5 != null) {
            floatKeyframeAnimation5.addUpdateListener(animationListener);
            this.rotationZ.addUpdateListener(new BaseLayer$$ExternalSyntheticLambda0(this, 3));
        }
    }

    public <T> boolean applyValueCallback(T t, LottieValueCallback<T> lottieValueCallback) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(RecyclerView.DECELERATION_RATE);
        if (t == LottieProperty.TRANSFORM_ANCHOR_POINT) {
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation = this.anchorPoint;
            if (baseKeyframeAnimation == null) {
                this.anchorPoint = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_POSITION) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation2 = this.position;
            if (baseKeyframeAnimation2 == null) {
                this.position = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_POSITION_X) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation3 = this.position;
            if (baseKeyframeAnimation3 instanceof SplitDimensionPathKeyframeAnimation) {
                ((SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation3).setXValueCallback(lottieValueCallback);
                return true;
            }
        }
        if (t == LottieProperty.TRANSFORM_POSITION_Y) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation4 = this.position;
            if (baseKeyframeAnimation4 instanceof SplitDimensionPathKeyframeAnimation) {
                ((SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation4).setYValueCallback(lottieValueCallback);
                return true;
            }
        }
        if (t == LottieProperty.TRANSFORM_SCALE) {
            BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation5 = this.scale;
            if (baseKeyframeAnimation5 == null) {
                this.scale = new ValueCallbackKeyframeAnimation(lottieValueCallback, new ScaleXY());
                return true;
            }
            baseKeyframeAnimation5.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_ROTATION) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation6 = this.rotation;
            if (baseKeyframeAnimation6 == null) {
                this.rotation = new ValueCallbackKeyframeAnimation(lottieValueCallback, valueOf2);
                return true;
            }
            baseKeyframeAnimation6.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_OPACITY) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation7 = this.opacity;
            if (baseKeyframeAnimation7 == null) {
                this.opacity = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            baseKeyframeAnimation7.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_START_OPACITY) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation8 = this.startOpacity;
            if (baseKeyframeAnimation8 == null) {
                this.startOpacity = new ValueCallbackKeyframeAnimation(lottieValueCallback, valueOf);
                return true;
            }
            baseKeyframeAnimation8.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_END_OPACITY) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation9 = this.endOpacity;
            if (baseKeyframeAnimation9 == null) {
                this.endOpacity = new ValueCallbackKeyframeAnimation(lottieValueCallback, valueOf);
                return true;
            }
            baseKeyframeAnimation9.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_SKEW) {
            if (this.skew == null) {
                this.skew = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(valueOf2)));
            }
            this.skew.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_SKEW_ANGLE) {
            if (this.skewAngle == null) {
                this.skewAngle = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(valueOf2)));
            }
            this.skewAngle.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_ROTATION_X) {
            if (this.rotationX == null) {
                this.rotationX = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(valueOf2)));
            }
            this.rotationX.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_ROTATION_Y) {
            if (this.rotationY == null) {
                this.rotationY = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(valueOf2)));
            }
            this.rotationY.setValueCallback(lottieValueCallback);
            return true;
        }
        if (t != LottieProperty.TRANSFORM_ROTATION_Z) {
            return false;
        }
        if (this.rotationZ == null) {
            this.rotationZ = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(valueOf2)));
        }
        this.rotationZ.setValueCallback(lottieValueCallback);
        return true;
    }

    public BaseKeyframeAnimation<?, Float> getEndOpacity() {
        return this.endOpacity;
    }

    public Matrix getMatrix() {
        FloatKeyframeAnimation floatKeyframeAnimation;
        FloatKeyframeAnimation floatKeyframeAnimation2;
        PointF value;
        ScaleXY value2;
        PointF value3;
        this.matrix.reset();
        FloatKeyframeAnimation floatKeyframeAnimation3 = this.rotationX;
        if ((floatKeyframeAnimation3 != null && floatKeyframeAnimation3.getFloatValue() != RecyclerView.DECELERATION_RATE) || (((floatKeyframeAnimation = this.rotationY) != null && floatKeyframeAnimation.getFloatValue() != RecyclerView.DECELERATION_RATE) || ((floatKeyframeAnimation2 = this.rotationZ) != null && floatKeyframeAnimation2.getFloatValue() != RecyclerView.DECELERATION_RATE))) {
            FloatKeyframeAnimation floatKeyframeAnimation4 = this.rotationX;
            float floatValue = floatKeyframeAnimation4 != null ? floatKeyframeAnimation4.getFloatValue() : 0.0f;
            FloatKeyframeAnimation floatKeyframeAnimation5 = this.rotationY;
            float floatValue2 = floatKeyframeAnimation5 != null ? floatKeyframeAnimation5.getFloatValue() : 0.0f;
            FloatKeyframeAnimation floatKeyframeAnimation6 = this.rotationZ;
            float floatValue3 = floatKeyframeAnimation6 != null ? floatKeyframeAnimation6.getFloatValue() : 0.0f;
            if (this.rotation3DCacheDirty || floatValue != this.cachedRotationX || floatValue2 != this.cachedRotationY || floatValue3 != this.cachedRotationZ) {
                this.cachedRotationX = floatValue;
                this.cachedRotationY = floatValue2;
                this.cachedRotationZ = floatValue3;
                if (floatValue != RecyclerView.DECELERATION_RATE) {
                    this.cachedCosX = (float) Math.cos(Math.toRadians(floatValue));
                } else {
                    this.cachedCosX = 1.0f;
                }
                if (floatValue2 != RecyclerView.DECELERATION_RATE) {
                    this.cachedCosY = (float) Math.cos(Math.toRadians(floatValue2));
                } else {
                    this.cachedCosY = 1.0f;
                }
                this.rotation3DCacheDirty = false;
            }
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation = this.anchorPoint;
            PointF value4 = baseKeyframeAnimation == null ? null : baseKeyframeAnimation.getValue();
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation2 = this.position;
            PointF value5 = baseKeyframeAnimation2 == null ? null : baseKeyframeAnimation2.getValue();
            BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation3 = this.scale;
            ScaleXY value6 = baseKeyframeAnimation3 != null ? baseKeyframeAnimation3.getValue() : null;
            Transform3D.applyTransform(this.matrix, value4, value5, value6 != null ? value6.getScaleX() : 1.0f, value6 != null ? value6.getScaleY() : 1.0f, floatValue, floatValue2, floatValue3, this.cachedCosX, this.cachedCosY);
            return this.matrix;
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation4 = this.position;
        if (baseKeyframeAnimation4 != null && (value3 = baseKeyframeAnimation4.getValue()) != null) {
            float f = value3.x;
            if (f != RecyclerView.DECELERATION_RATE || value3.y != RecyclerView.DECELERATION_RATE) {
                this.matrix.preTranslate(f, value3.y);
            }
        }
        if (!this.autoOrient) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.rotation;
            if (baseKeyframeAnimation5 != null) {
                float floatValue4 = baseKeyframeAnimation5 instanceof ValueCallbackKeyframeAnimation ? baseKeyframeAnimation5.getValue().floatValue() : ((FloatKeyframeAnimation) baseKeyframeAnimation5).getFloatValue();
                if (floatValue4 != RecyclerView.DECELERATION_RATE) {
                    this.matrix.preRotate(floatValue4);
                }
            }
        } else if (baseKeyframeAnimation4 != null) {
            float progress = baseKeyframeAnimation4.getProgress();
            PointF value7 = baseKeyframeAnimation4.getValue();
            float f2 = value7.x;
            float f3 = value7.y;
            baseKeyframeAnimation4.setProgress(1.0E-4f + progress);
            PointF value8 = baseKeyframeAnimation4.getValue();
            baseKeyframeAnimation4.setProgress(progress);
            this.matrix.preRotate((float) Math.toDegrees(Math.atan2(value8.y - f3, value8.x - f2)));
        }
        if (this.skew != null) {
            float cos = this.skewAngle == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.getFloatValue()) + 90.0f));
            float sin = this.skewAngle == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.getFloatValue()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.getFloatValue()));
            clearSkewValues();
            float[] fArr = this.skewValues;
            fArr[0] = cos;
            fArr[1] = sin;
            float f4 = -sin;
            fArr[3] = f4;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.skewMatrix1.setValues(fArr);
            clearSkewValues();
            float[] fArr2 = this.skewValues;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.skewMatrix2.setValues(fArr2);
            clearSkewValues();
            float[] fArr3 = this.skewValues;
            fArr3[0] = cos;
            fArr3[1] = f4;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.skewMatrix3.setValues(fArr3);
            this.skewMatrix2.preConcat(this.skewMatrix1);
            this.skewMatrix3.preConcat(this.skewMatrix2);
            this.matrix.preConcat(this.skewMatrix3);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation6 = this.scale;
        if (baseKeyframeAnimation6 != null && (value2 = baseKeyframeAnimation6.getValue()) != null && (value2.getScaleX() != 1.0f || value2.getScaleY() != 1.0f)) {
            this.matrix.preScale(value2.getScaleX(), value2.getScaleY());
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation7 = this.anchorPoint;
        if (baseKeyframeAnimation7 != null && (value = baseKeyframeAnimation7.getValue()) != null) {
            float f5 = value.x;
            if (f5 != RecyclerView.DECELERATION_RATE || value.y != RecyclerView.DECELERATION_RATE) {
                this.matrix.preTranslate(-f5, -value.y);
            }
        }
        return this.matrix;
    }

    public Matrix getMatrixForRepeater(float f) {
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.position;
        PointF value = baseKeyframeAnimation == null ? null : baseKeyframeAnimation.getValue();
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation2 = this.scale;
        ScaleXY value2 = baseKeyframeAnimation2 == null ? null : baseKeyframeAnimation2.getValue();
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation3 = this.anchorPoint;
        PointF value3 = baseKeyframeAnimation3 != null ? baseKeyframeAnimation3.getValue() : null;
        this.matrix.reset();
        if (value != null) {
            this.matrix.preTranslate(value.x * f, value.y * f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.rotationX;
        float f2 = RecyclerView.DECELERATION_RATE;
        float floatValue = floatKeyframeAnimation != null ? floatKeyframeAnimation.getFloatValue() * f : 0.0f;
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.rotationY;
        float floatValue2 = floatKeyframeAnimation2 != null ? floatKeyframeAnimation2.getFloatValue() * f : 0.0f;
        FloatKeyframeAnimation floatKeyframeAnimation3 = this.rotationZ;
        float floatValue3 = floatKeyframeAnimation3 != null ? floatKeyframeAnimation3.getFloatValue() * f : 0.0f;
        if (floatValue == RecyclerView.DECELERATION_RATE && floatValue2 == RecyclerView.DECELERATION_RATE && floatValue3 == RecyclerView.DECELERATION_RATE) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.rotation;
            if (baseKeyframeAnimation4 != null) {
                float floatValue4 = baseKeyframeAnimation4.getValue().floatValue();
                Matrix matrix = this.matrix;
                float f3 = floatValue4 * f;
                float f4 = value3 == null ? 0.0f : value3.x;
                if (value3 != null) {
                    f2 = value3.y;
                }
                matrix.preRotate(f3, f4, f2);
            }
        } else {
            float cos = floatValue != RecyclerView.DECELERATION_RATE ? (float) Math.cos(Math.toRadians(floatValue)) : 1.0f;
            float cos2 = floatValue2 != RecyclerView.DECELERATION_RATE ? (float) Math.cos(Math.toRadians(floatValue2)) : 1.0f;
            if (floatValue3 != RecyclerView.DECELERATION_RATE) {
                Matrix matrix2 = this.matrix;
                float f5 = value3 == null ? 0.0f : value3.x;
                if (value3 != null) {
                    f2 = value3.y;
                }
                matrix2.preRotate(floatValue3, f5, f2);
            }
            Transform3D.apply3DRotations(this.matrix, floatValue, floatValue2, RecyclerView.DECELERATION_RATE, cos, cos2);
        }
        if (value2 != null) {
            double d = f;
            this.matrix.preScale((float) Math.pow(value2.getScaleX(), d), (float) Math.pow(value2.getScaleY(), d));
        }
        return this.matrix;
    }

    public BaseKeyframeAnimation<?, Integer> getOpacity() {
        return this.opacity;
    }

    public BaseKeyframeAnimation<?, Float> getStartOpacity() {
        return this.startOpacity;
    }

    public void setProgress(float f) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.opacity;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.setProgress(f);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.startOpacity;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.setProgress(f);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.endOpacity;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.setProgress(f);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.anchorPoint;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.setProgress(f);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.position;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.setProgress(f);
        }
        BaseKeyframeAnimation<ScaleXY, ScaleXY> baseKeyframeAnimation6 = this.scale;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.setProgress(f);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.rotation;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.setProgress(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.skew;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.setProgress(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.skewAngle;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.setProgress(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation3 = this.rotationX;
        if (floatKeyframeAnimation3 != null) {
            floatKeyframeAnimation3.setProgress(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation4 = this.rotationY;
        if (floatKeyframeAnimation4 != null) {
            floatKeyframeAnimation4.setProgress(f);
        }
        FloatKeyframeAnimation floatKeyframeAnimation5 = this.rotationZ;
        if (floatKeyframeAnimation5 != null) {
            floatKeyframeAnimation5.setProgress(f);
        }
    }
}
