package defpackage;

import com.yandex.payment.sdk.core.MetricaSwitch;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class vb20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MetricaSwitch.values().length];
        try {
            iArr[MetricaSwitch.DEPENDENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MetricaSwitch.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
