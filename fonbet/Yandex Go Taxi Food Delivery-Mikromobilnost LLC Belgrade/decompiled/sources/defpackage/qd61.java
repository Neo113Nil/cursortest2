package defpackage;

import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class qd61 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TariffOrderFlow.values().length];
        try {
            iArr[TariffOrderFlow.DRIVE_FLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TariffOrderFlow.SHUTTLE_FLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
