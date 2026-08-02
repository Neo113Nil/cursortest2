package defpackage;

import com.yandex.go.payments.api.transport.TransportPaymentListSource;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class u411 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransportPaymentListSource.values().length];
        try {
            iArr[TransportPaymentListSource.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportPaymentListSource.MOSMETRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
