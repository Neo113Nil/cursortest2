package defpackage;

import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class rd1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LayersAnalyticEventEmmiter.Event.values().length];
        try {
            iArr[LayersAnalyticEventEmmiter.Event.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayersAnalyticEventEmmiter.Event.SHOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LayersAnalyticEventEmmiter.Event.SEEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LayersAnalyticEventEmmiter.Event.TAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
