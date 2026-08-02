package defpackage;

import com.yandex.go.something_wrong_screen.domain.entities.SomethingWrongScreenEntryPoint;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class u8t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SomethingWrongScreenEntryPoint.values().length];
        try {
            iArr[SomethingWrongScreenEntryPoint.ORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SomethingWrongScreenEntryPoint.DEEPLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
