package ru.yandex.taxi.logistics.sdk.ui.component.misc;

/* loaded from: classes5.dex */
public final class c {
    public static Quarter a(double d) {
        double f = b.f(d);
        return (0.0d > f || f > 1.5707963267948966d) ? (1.5707963267948966d > f || f > 3.141592653589793d) ? (-1.5707963267948966d > f || f > 0.0d) ? Quarter.UPPER_LEFT : Quarter.UPPER_RIGHT : Quarter.LOWER_LEFT : Quarter.LOWER_RIGHT;
    }
}
