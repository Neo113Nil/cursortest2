package defpackage;

import com.yandex.go.places.api.navigation.CardRevealing;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class zac0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardRevealing.values().length];
        try {
            iArr[CardRevealing.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardRevealing.COMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
