package defpackage;

import com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.CounterChange;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class s0f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CounterChange.values().length];
        try {
            iArr[CounterChange.Up.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CounterChange.Down.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
