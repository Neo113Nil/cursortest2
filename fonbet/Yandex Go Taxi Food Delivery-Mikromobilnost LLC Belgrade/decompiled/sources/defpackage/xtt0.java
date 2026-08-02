package defpackage;

import com.ybsdk.feature.split.deposit.internal.data.network.dto.AutoTopupStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class xtt0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoTopupStatus.values().length];
        try {
            iArr[AutoTopupStatus.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoTopupStatus.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
