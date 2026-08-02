package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.L;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseKeyframeAnimation<K, A> {
    private final KeyframesWrapper<K> keyframesWrapper;
    protected LottieValueCallback<A> valueCallback;
    final List<AnimationListener> listeners = new ArrayList(1);
    private boolean isDiscrete = false;
    protected float progress = RecyclerView.DECELERATION_RATE;
    private A cachedGetValue = null;
    private float cachedStartDelayProgress = -1.0f;
    private float cachedEndProgress = -1.0f;

    public interface AnimationListener {
        void onValueChanged();
    }

    public static final class EmptyKeyframeWrapper<T> implements KeyframesWrapper<T> {
        private EmptyKeyframeWrapper() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public Keyframe<T> getCurrentKeyframe() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
            return RecyclerView.DECELERATION_RATE;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f) {
            return false;
        }
    }

    public interface KeyframesWrapper<T> {
        Keyframe<T> getCurrentKeyframe();

        float getEndProgress();

        float getStartDelayProgress();

        boolean isCachedValueEnabled(float f);

        boolean isEmpty();

        boolean isValueChanged(float f);
    }

    public static final class KeyframesWrapperImpl<T> implements KeyframesWrapper<T> {
        private Keyframe<T> cachedCurrentKeyframe = null;
        private float cachedInterpolatedProgress = -1.0f;
        private Keyframe<T> currentKeyframe = findKeyframe(RecyclerView.DECELERATION_RATE);
        private final List<? extends Keyframe<T>> keyframes;

        public KeyframesWrapperImpl(List<? extends Keyframe<T>> list) {
            this.keyframes = list;
        }

        private Keyframe<T> findKeyframe(float f) {
            List<? extends Keyframe<T>> list = this.keyframes;
            Keyframe<T> keyframe = list.get(list.size() - 1);
            if (f >= keyframe.getStartProgress()) {
                return keyframe;
            }
            int size = this.keyframes.size() - 2;
            while (true) {
                List<? extends Keyframe<T>> list2 = this.keyframes;
                if (size < 1) {
                    return list2.get(0);
                }
                Keyframe<T> keyframe2 = list2.get(size);
                if (this.currentKeyframe != keyframe2 && keyframe2.containsProgress(f)) {
                    return keyframe2;
                }
                size--;
            }
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public Keyframe<T> getCurrentKeyframe() {
            return this.currentKeyframe;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
            return this.keyframes.get(r1.size() - 1).getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
            return this.keyframes.get(0).getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f) {
            Keyframe<T> keyframe = this.cachedCurrentKeyframe;
            Keyframe<T> keyframe2 = this.currentKeyframe;
            if (keyframe == keyframe2 && this.cachedInterpolatedProgress == f) {
                return true;
            }
            this.cachedCurrentKeyframe = keyframe2;
            this.cachedInterpolatedProgress = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f) {
            if (this.currentKeyframe.containsProgress(f)) {
                return !this.currentKeyframe.isStatic();
            }
            this.currentKeyframe = findKeyframe(f);
            return true;
        }
    }

    public static final class SingleKeyframeWrapper<T> implements KeyframesWrapper<T> {
        private float cachedInterpolatedProgress = -1.0f;
        private final Keyframe<T> keyframe;

        public SingleKeyframeWrapper(List<? extends Keyframe<T>> list) {
            this.keyframe = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public Keyframe<T> getCurrentKeyframe() {
            return this.keyframe;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
            return this.keyframe.getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
            return this.keyframe.getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f) {
            if (this.cachedInterpolatedProgress == f) {
                return true;
            }
            this.cachedInterpolatedProgress = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f) {
            return !this.keyframe.isStatic();
        }
    }

    public BaseKeyframeAnimation(List<? extends Keyframe<K>> list) {
        this.keyframesWrapper = wrap(list);
    }

    private float getStartDelayProgress() {
        if (this.cachedStartDelayProgress == -1.0f) {
            this.cachedStartDelayProgress = this.keyframesWrapper.getStartDelayProgress();
        }
        return this.cachedStartDelayProgress;
    }

    private static <T> KeyframesWrapper<T> wrap(List<? extends Keyframe<T>> list) {
        return list.isEmpty() ? new EmptyKeyframeWrapper() : list.size() == 1 ? new SingleKeyframeWrapper(list) : new KeyframesWrapperImpl(list);
    }

    public void addUpdateListener(AnimationListener animationListener) {
        this.listeners.add(animationListener);
    }

    public Keyframe<K> getCurrentKeyframe() {
        if (L.isTraceEnabled()) {
            L.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        Keyframe<K> currentKeyframe = this.keyframesWrapper.getCurrentKeyframe();
        if (L.isTraceEnabled()) {
            L.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return currentKeyframe;
    }

    public float getEndProgress() {
        if (this.cachedEndProgress == -1.0f) {
            this.cachedEndProgress = this.keyframesWrapper.getEndProgress();
        }
        return this.cachedEndProgress;
    }

    public float getInterpolatedCurrentKeyframeProgress() {
        Interpolator interpolator;
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        return (currentKeyframe == null || currentKeyframe.isStatic() || (interpolator = currentKeyframe.interpolator) == null) ? RecyclerView.DECELERATION_RATE : interpolator.getInterpolation(getLinearCurrentKeyframeProgress());
    }

    public float getLinearCurrentKeyframeProgress() {
        if (this.isDiscrete) {
            return RecyclerView.DECELERATION_RATE;
        }
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        return currentKeyframe.isStatic() ? RecyclerView.DECELERATION_RATE : (this.progress - currentKeyframe.getStartProgress()) / (currentKeyframe.getEndProgress() - currentKeyframe.getStartProgress());
    }

    public float getProgress() {
        return this.progress;
    }

    public A getValue() {
        float linearCurrentKeyframeProgress = getLinearCurrentKeyframeProgress();
        if (this.valueCallback == null && this.keyframesWrapper.isCachedValueEnabled(linearCurrentKeyframeProgress) && !skipCache()) {
            return this.cachedGetValue;
        }
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        Interpolator interpolator = currentKeyframe.xInterpolator;
        A value = (interpolator == null || currentKeyframe.yInterpolator == null) ? getValue(currentKeyframe, getInterpolatedCurrentKeyframeProgress()) : getValue(currentKeyframe, linearCurrentKeyframeProgress, interpolator.getInterpolation(linearCurrentKeyframeProgress), currentKeyframe.yInterpolator.getInterpolation(linearCurrentKeyframeProgress));
        this.cachedGetValue = value;
        return value;
    }

    public abstract A getValue(Keyframe<K> keyframe, float f);

    public boolean hasValueCallback() {
        return this.valueCallback != null;
    }

    public void notifyListeners() {
        if (L.isTraceEnabled()) {
            L.beginSection("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).onValueChanged();
        }
        if (L.isTraceEnabled()) {
            L.endSection("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void setIsDiscrete() {
        this.isDiscrete = true;
    }

    public void setProgress(float f) {
        if (L.isTraceEnabled()) {
            L.beginSection("BaseKeyframeAnimation#setProgress");
        }
        if (this.keyframesWrapper.isEmpty()) {
            if (L.isTraceEnabled()) {
                L.endSection("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f < getStartDelayProgress()) {
            f = getStartDelayProgress();
        } else if (f > getEndProgress()) {
            f = getEndProgress();
        }
        if (f == this.progress) {
            if (L.isTraceEnabled()) {
                L.endSection("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.progress = f;
            if (this.keyframesWrapper.isValueChanged(f)) {
                notifyListeners();
            }
            if (L.isTraceEnabled()) {
                L.endSection("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void setValueCallback(LottieValueCallback<A> lottieValueCallback) {
        LottieValueCallback<A> lottieValueCallback2 = this.valueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.valueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    public boolean skipCache() {
        return false;
    }

    public A getValue(Keyframe<K> keyframe, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
