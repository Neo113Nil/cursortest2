package defpackage;

import com.yandex.mapkit.traffic.TrafficColor;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class s901 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrafficColor.values().length];
        try {
            iArr[TrafficColor.RED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrafficColor.YELLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrafficColor.GREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
