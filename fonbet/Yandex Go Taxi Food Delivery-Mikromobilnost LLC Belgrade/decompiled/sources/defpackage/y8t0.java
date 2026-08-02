package defpackage;

import com.yandex.go.something_wrong_screen.domain.entities.SomethingWrongScreenEntryPoint;
import com.yandex.go.something_wrong_screen.domain.entities.SomethingWrongScreenToggleTapSource;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class y8t0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

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
        int[] iArr2 = new int[SomethingWrongScreenToggleTapSource.values().length];
        try {
            iArr2[SomethingWrongScreenToggleTapSource.MODAL_VIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SomethingWrongScreenToggleTapSource.SAFETY_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
