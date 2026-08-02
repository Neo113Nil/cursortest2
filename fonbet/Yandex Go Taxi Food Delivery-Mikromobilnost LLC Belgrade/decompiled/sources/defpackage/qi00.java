package defpackage;

import com.yandex.mapkit.map.CameraUpdateReason;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class qi00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CameraUpdateReason.values().length];
        try {
            iArr[CameraUpdateReason.GESTURES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CameraUpdateReason.APPLICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
