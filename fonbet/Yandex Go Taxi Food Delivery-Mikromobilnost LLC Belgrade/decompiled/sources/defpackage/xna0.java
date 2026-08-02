package defpackage;

import com.yandex.go.places.impl.data.entities.network.payments.PaymentStatus;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class xna0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentStatus.values().length];
        try {
            iArr[PaymentStatus.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentStatus.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentStatus.USER_INTERACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentStatus.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
