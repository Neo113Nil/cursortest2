package defpackage;

import com.ybsdk.feature.dashboard.internal.domain.model.TopButtonTag;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class tmg {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TopButtonTag.values().length];
        try {
            iArr[TopButtonTag.SUPPORT_URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TopButtonTag.PROFILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TopButtonTag.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
