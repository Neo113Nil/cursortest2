package defpackage;

import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;

/* loaded from: classes.dex */
public abstract /* synthetic */ class rrv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IndicatorParams$Animation.values().length];
        try {
            iArr[IndicatorParams$Animation.SCALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IndicatorParams$Animation.WORM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IndicatorParams$Animation.SLIDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
