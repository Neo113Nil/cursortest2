package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.DropShadow;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GradientFillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final int CACHE_STEPS_MS = 32;
    private BaseKeyframeAnimation<Float, Float> blurAnimation;
    float blurMaskFilterRadius;
    private final RectF boundsRect;
    private final int cacheSteps;
    private final BaseKeyframeAnimation<GradientColor, GradientColor> colorAnimation;
    private ValueCallbackKeyframeAnimation colorCallbackAnimation;
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> colorFilterAnimation;
    private final BaseKeyframeAnimation<PointF, PointF> endPointAnimation;
    private final boolean hidden;
    private final BaseLayer layer;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<Integer, Integer> opacityAnimation;
    private final Paint paint;
    private final Path path;
    private final List<PathContent> paths;
    private final BaseKeyframeAnimation<PointF, PointF> startPointAnimation;

    /* renamed from: type, reason: collision with root package name */
    private final GradientType f926type;
    private final LongSparseArray linearGradientCache = new LongSparseArray((Object) null);
    private final LongSparseArray radialGradientCache = new LongSparseArray((Object) null);

    public GradientFillContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer, GradientFill gradientFill) {
        Path path = new Path();
        this.path = path;
        this.paint = new LPaint(1);
        this.boundsRect = new RectF();
        this.paths = new ArrayList();
        this.blurMaskFilterRadius = RecyclerView.DECELERATION_RATE;
        this.layer = baseLayer;
        this.name = gradientFill.getName();
        this.hidden = gradientFill.isHidden();
        this.lottieDrawable = lottieDrawable;
        this.f926type = gradientFill.getGradientType();
        path.setFillType(gradientFill.getFillType());
        this.cacheSteps = (int) (lottieComposition.getDuration() / 32.0f);
        BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation = gradientFill.getGradientColor().createAnimation();
        this.colorAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        BaseKeyframeAnimation<Integer, Integer> createAnimation2 = gradientFill.getOpacity().createAnimation();
        this.opacityAnimation = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        BaseKeyframeAnimation<PointF, PointF> createAnimation3 = gradientFill.getStartPoint().createAnimation();
        this.startPointAnimation = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
        BaseKeyframeAnimation<PointF, PointF> createAnimation4 = gradientFill.getEndPoint().createAnimation();
        this.endPointAnimation = createAnimation4;
        createAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation4);
        if (baseLayer.getBlurEffect() != null) {
            FloatKeyframeAnimation createAnimation5 = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.blurAnimation = createAnimation5;
            createAnimation5.addUpdateListener(this);
            baseLayer.addAnimation(this.blurAnimation);
        }
    }

    private int[] applyDynamicColorsIfNeeded(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.colorCallbackAnimation;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.getValue();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int getGradientHash() {
        int round = Math.round(this.startPointAnimation.getProgress() * this.cacheSteps);
        int round2 = Math.round(this.endPointAnimation.getProgress() * this.cacheSteps);
        int round3 = Math.round(this.colorAnimation.getProgress() * this.cacheSteps);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient getLinearGradient() {
        float[] fArr;
        int[] iArr;
        long gradientHash = getGradientHash();
        LinearGradient linearGradient = (LinearGradient) this.linearGradientCache.get(gradientHash);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF value = this.startPointAnimation.getValue();
        PointF value2 = this.endPointAnimation.getValue();
        GradientColor value3 = this.colorAnimation.getValue();
        int[] applyDynamicColorsIfNeeded = applyDynamicColorsIfNeeded(value3.getColors());
        float[] positions = value3.getPositions();
        if (applyDynamicColorsIfNeeded.length < 2) {
            iArr = new int[]{applyDynamicColorsIfNeeded[0], applyDynamicColorsIfNeeded[0]};
            fArr = new float[]{RecyclerView.DECELERATION_RATE, 1.0f};
        } else {
            fArr = positions;
            iArr = applyDynamicColorsIfNeeded;
        }
        LinearGradient linearGradient2 = new LinearGradient(value.x, value.y, value2.x, value2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.linearGradientCache.put(linearGradient2, gradientHash);
        return linearGradient2;
    }

    private RadialGradient getRadialGradient() {
        float[] fArr;
        int[] iArr;
        long gradientHash = getGradientHash();
        RadialGradient radialGradient = (RadialGradient) this.radialGradientCache.get(gradientHash);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF value = this.startPointAnimation.getValue();
        PointF value2 = this.endPointAnimation.getValue();
        GradientColor value3 = this.colorAnimation.getValue();
        int[] applyDynamicColorsIfNeeded = applyDynamicColorsIfNeeded(value3.getColors());
        float[] positions = value3.getPositions();
        if (applyDynamicColorsIfNeeded.length < 2) {
            iArr = new int[]{applyDynamicColorsIfNeeded[0], applyDynamicColorsIfNeeded[0]};
            fArr = new float[]{RecyclerView.DECELERATION_RATE, 1.0f};
        } else {
            fArr = positions;
            iArr = applyDynamicColorsIfNeeded;
        }
        float f = value.x;
        float f2 = value.y;
        float hypot = (float) Math.hypot(value2.x - f, value2.y - f2);
        if (hypot <= RecyclerView.DECELERATION_RATE) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.radialGradientCache.put(radialGradient2, gradientHash);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, LottieValueCallback<T> lottieValueCallback) {
        if (t == LottieProperty.OPACITY) {
            this.opacityAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
            if (baseKeyframeAnimation != null) {
                this.layer.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.colorFilterAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorFilterAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.layer.addAnimation(this.colorFilterAnimation);
            return;
        }
        if (t != LottieProperty.GRADIENT_COLOR) {
            if (t == LottieProperty.BLUR_RADIUS) {
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
                if (baseKeyframeAnimation2 != null) {
                    baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                    return;
                }
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
                this.blurAnimation = valueCallbackKeyframeAnimation2;
                valueCallbackKeyframeAnimation2.addUpdateListener(this);
                this.layer.addAnimation(this.blurAnimation);
                return;
            }
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = this.colorCallbackAnimation;
        if (valueCallbackKeyframeAnimation3 != null) {
            this.layer.removeAnimation(valueCallbackKeyframeAnimation3);
        }
        if (lottieValueCallback == null) {
            this.colorCallbackAnimation = null;
            return;
        }
        this.linearGradientCache.clear();
        this.radialGradientCache.clear();
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
        this.colorCallbackAnimation = valueCallbackKeyframeAnimation4;
        valueCallbackKeyframeAnimation4.addUpdateListener(this);
        this.layer.addAnimation(this.colorCallbackAnimation);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i, DropShadow dropShadow) {
        Path path;
        if (this.hidden) {
            return;
        }
        if (L.isTraceEnabled()) {
            L.beginSection("GradientFillContent#draw");
        }
        this.path.reset();
        int i2 = 0;
        while (true) {
            int size = this.paths.size();
            path = this.path;
            if (i2 >= size) {
                break;
            }
            path.addPath(this.paths.get(i2).getPath(), matrix);
            i2++;
        }
        path.computeBounds(this.boundsRect, false);
        Shader linearGradient = this.f926type == GradientType.LINEAR ? getLinearGradient() : getRadialGradient();
        linearGradient.setLocalMatrix(matrix);
        this.paint.setShader(linearGradient);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
        if (baseKeyframeAnimation != null) {
            this.paint.setColorFilter(baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
        if (baseKeyframeAnimation2 != null) {
            float floatValue = baseKeyframeAnimation2.getValue().floatValue();
            if (floatValue == RecyclerView.DECELERATION_RATE) {
                this.paint.setMaskFilter(null);
            } else if (floatValue != this.blurMaskFilterRadius) {
                this.paint.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.blurMaskFilterRadius = floatValue;
        }
        float intValue = this.opacityAnimation.getValue().intValue() / 100.0f;
        this.paint.setAlpha(MiscUtils.clamp((int) (i * intValue), 0, 255));
        if (dropShadow != null) {
            dropShadow.applyWithAlpha((int) (intValue * 255.0f), this.paint);
        }
        canvas.drawPath(this.path, this.paint);
        if (L.isTraceEnabled()) {
            L.endSection("GradientFillContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.path.reset();
        int i = 0;
        while (true) {
            int size = this.paths.size();
            Path path = this.path;
            if (i >= size) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(this.paths.get(i).getPath(), matrix);
                i++;
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = list2.get(i);
            if (content instanceof PathContent) {
                this.paths.add((PathContent) content);
            }
        }
    }
}
