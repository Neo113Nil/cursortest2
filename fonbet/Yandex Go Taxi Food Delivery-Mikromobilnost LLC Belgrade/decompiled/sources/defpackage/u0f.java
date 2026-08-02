package defpackage;

import ru.yandex.taxi.logistics.sdk.ui.component.control.CounterSize;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class u0f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CounterSize.values().length];
        try {
            iArr[CounterSize.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CounterSize.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CounterSize.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CounterSize.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
