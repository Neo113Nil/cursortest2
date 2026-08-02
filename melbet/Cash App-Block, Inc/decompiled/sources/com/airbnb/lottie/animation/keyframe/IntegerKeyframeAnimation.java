package com.airbnb.lottie.animation.keyframe;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class IntegerKeyframeAnimation extends KeyframeAnimation<Integer> {
    public IntegerKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
    }

    public int getIntValue(Keyframe<Integer> keyframe, float f) {
        float f2;
        if (keyframe.startValue == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Missing values for keyframe.");
            return 0;
        }
        int startValueInt = keyframe.endValue == null ? keyframe.getStartValueInt() : keyframe.getEndValueInt();
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback != 0) {
            f2 = f;
            Integer num = (Integer) lottieValueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), keyframe.startValue, Integer.valueOf(startValueInt), f2, getLinearCurrentKeyframeProgress(), getProgress());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        return MiscUtils.lerp(keyframe.getStartValueInt(), startValueInt, f2);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public Integer getValue(Keyframe<Integer> keyframe, float f) {
        return Integer.valueOf(getIntValue(keyframe, f));
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f) {
        return getValue((Keyframe<Integer>) keyframe, f);
    }

    public int getIntValue() {
        return getIntValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
