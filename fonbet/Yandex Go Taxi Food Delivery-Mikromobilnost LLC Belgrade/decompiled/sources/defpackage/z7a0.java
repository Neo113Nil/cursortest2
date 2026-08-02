package defpackage;

import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class z7a0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SharedAccountType.values().length];
        try {
            iArr[SharedAccountType.BUSINESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
