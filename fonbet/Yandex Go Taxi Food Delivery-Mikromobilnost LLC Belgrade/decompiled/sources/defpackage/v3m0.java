package defpackage;

import com.ybsdk.feature.savings.internal.entities.SavingsClosingVersion;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class v3m0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SavingsClosingVersion.values().length];
        try {
            iArr[SavingsClosingVersion.V1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingsClosingVersion.V2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
