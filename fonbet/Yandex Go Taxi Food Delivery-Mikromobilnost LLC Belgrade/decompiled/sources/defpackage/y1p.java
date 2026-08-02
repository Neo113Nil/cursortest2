package defpackage;

import com.yandex.go.superapp.api.loading_tracker.EatsKitOpenType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class y1p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EatsKitOpenType.values().length];
        try {
            iArr[EatsKitOpenType.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EatsKitOpenType.CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
