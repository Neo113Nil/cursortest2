package defpackage;

import com.yandex.xplat.payment.sdk.XTheme;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class zvy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[XTheme.values().length];
        try {
            iArr[XTheme.light.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[XTheme.dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
