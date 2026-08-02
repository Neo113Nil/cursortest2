package defpackage;

import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoState$Stage$Upload$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class zjb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PhotoState$Stage$Upload$Status.values().length];
        try {
            iArr[PhotoState$Stage$Upload$Status.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhotoState$Stage$Upload$Status.ACTIVE_TOO_LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PhotoState$Stage$Upload$Status.ERROR_GENERAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PhotoState$Stage$Upload$Status.ERROR_UPLOAD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
