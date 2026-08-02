package defpackage;

import com.ybsdk.feature.dashboard.api.model.SupportState;
import com.ybsdk.feature.dashboard.internal.domain.model.TopButtonTag;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class wmg {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

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
        int[] iArr2 = new int[SupportState.values().length];
        try {
            iArr2[SupportState.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SupportState.HAS_UNREAD_MESSAGES.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
