package ru.yandex.taxi.map_common.map.utils;

import android.animation.TypeEvaluator;
import com.yandex.mapkit.geometry.Point;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lru/yandex/taxi/map_common/map/utils/PointEvaluator;", "Landroid/animation/TypeEvaluator;", "Lcom/yandex/mapkit/geometry/Point;", "<init>", "()V", "evaluate", "fraction", "", "startValue", "endValue", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointEvaluator implements TypeEvaluator<Point> {
    @Override // android.animation.TypeEvaluator
    public Point evaluate(float fraction, Point startValue, Point endValue) {
        double d = fraction;
        return new Point(((endValue.getLatitude() - startValue.getLatitude()) * d) + startValue.getLatitude(), ((endValue.getLongitude() - startValue.getLongitude()) * d) + startValue.getLongitude());
    }
}
