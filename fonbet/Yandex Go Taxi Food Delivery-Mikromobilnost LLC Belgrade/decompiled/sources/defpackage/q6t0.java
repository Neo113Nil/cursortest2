package defpackage;

import com.yandex.go.zone.dto.objects.VerticalMode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class q6t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VerticalMode.values().length];
        try {
            iArr[VerticalMode.SELECTOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerticalMode.WITHOUT_SELECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
