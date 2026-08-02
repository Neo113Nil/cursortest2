package defpackage;

import com.ybsdk.api.pro.entities.RegistrationType$OngoingOperation;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class qqi0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RegistrationType$OngoingOperation.values().length];
        try {
            iArr[RegistrationType$OngoingOperation.REGISTRATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RegistrationType$OngoingOperation.PRODUCT_OPENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
