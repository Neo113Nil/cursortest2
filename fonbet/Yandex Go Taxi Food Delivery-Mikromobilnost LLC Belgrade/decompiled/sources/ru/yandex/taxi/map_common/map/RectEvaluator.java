package ru.yandex.taxi.map_common.map;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/map_common/map/RectEvaluator;", "Landroid/animation/TypeEvaluator;", "Landroid/graphics/Rect;", "<init>", "()V", "rect", "evaluate", "fraction", "", "startValue", "endValue", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect = new Rect();

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float fraction, Rect startValue, Rect endValue) {
        this.rect.set(startValue.left + ((int) ((endValue.left - r0) * fraction)), startValue.top + ((int) ((endValue.top - r1) * fraction)), startValue.right + ((int) ((endValue.right - r2) * fraction)), startValue.bottom + ((int) ((endValue.bottom - r6) * fraction)));
        return this.rect;
    }
}
