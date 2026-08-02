package defpackage;

import com.ybsdk.feature.main.internal.domain.entities.sbpPartners.Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class rhm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Status.values().length];
        try {
            iArr[Status.BINDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Status.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
