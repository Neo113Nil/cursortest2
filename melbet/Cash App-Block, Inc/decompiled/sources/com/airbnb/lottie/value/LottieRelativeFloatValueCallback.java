package com.airbnb.lottie.value;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes3.dex */
public class LottieRelativeFloatValueCallback extends LottieValueCallback<Float> {
    public LottieRelativeFloatValueCallback() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Float getOffset(LottieFrameInfo<Float> lottieFrameInfo) {
        T t = this.value;
        if (t != 0) {
            return (Float) t;
        }
        a$$ExternalSyntheticBUOutline0.m$3("You must provide a static value in the constructor , call setValue, or override getValue.");
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public Float getValue(LottieFrameInfo<Float> lottieFrameInfo) {
        return Float.valueOf(getOffset(lottieFrameInfo).floatValue() + MiscUtils.lerp(lottieFrameInfo.getStartValue().floatValue(), lottieFrameInfo.getEndValue().floatValue(), lottieFrameInfo.getInterpolatedKeyframeProgress()));
    }

    public LottieRelativeFloatValueCallback(Float f) {
        super(f);
    }
}
