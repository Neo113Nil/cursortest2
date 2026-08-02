package defpackage;

import com.yandex.go.navigator.alt_select.traffic.TrafficLevel;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class u901 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrafficLevel.values().length];
        try {
            iArr[TrafficLevel.FREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrafficLevel.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrafficLevel.HARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
