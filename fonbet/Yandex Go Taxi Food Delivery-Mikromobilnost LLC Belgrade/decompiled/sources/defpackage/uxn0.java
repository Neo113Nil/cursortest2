package defpackage;

import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class uxn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LayersAnalyticEventEmmiter.Event.values().length];
        try {
            iArr[LayersAnalyticEventEmmiter.Event.SHOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayersAnalyticEventEmmiter.Event.TAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
