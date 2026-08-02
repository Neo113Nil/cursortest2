package defpackage;

import com.yandex.messaging.internal.BackendCompatibilityStatus;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class uwc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BackendCompatibilityStatus.values().length];
        a = iArr;
        try {
            iArr[BackendCompatibilityStatus.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[BackendCompatibilityStatus.PARTIALLY_OUTDATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[BackendCompatibilityStatus.FULL_OUTDATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
