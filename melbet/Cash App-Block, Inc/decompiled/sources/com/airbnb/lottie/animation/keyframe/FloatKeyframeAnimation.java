package com.airbnb.lottie.animation.keyframe;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class FloatKeyframeAnimation extends KeyframeAnimation<Float> {
    public FloatKeyframeAnimation(List<Keyframe<Float>> list) {
        super(list);
    }

    public float getFloatValue(Keyframe<Float> keyframe, float f) {
        float f2;
        if (keyframe.startValue == null || keyframe.endValue == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Missing values for keyframe.");
            return RecyclerView.DECELERATION_RATE;
        }
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback != 0) {
            f2 = f;
            Float f3 = (Float) lottieValueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), keyframe.startValue, keyframe.endValue, f2, getLinearCurrentKeyframeProgress(), getProgress());
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        return MiscUtils.lerp(keyframe.getStartValueFloat(), keyframe.getEndValueFloat(), f2);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public Float getValue(Keyframe<Float> keyframe, float f) {
        return Float.valueOf(getFloatValue(keyframe, f));
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f) {
        return getValue((Keyframe<Float>) keyframe, f);
    }

    public float getFloatValue() {
        return getFloatValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
