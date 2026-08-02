package defpackage;

import com.ybsdk.core.common.domain.entities.CommunicationType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class quc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CommunicationType.values().length];
        try {
            iArr[CommunicationType.FULLSCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CommunicationType.EDUCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CommunicationType.SMALL_TOOLTIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
