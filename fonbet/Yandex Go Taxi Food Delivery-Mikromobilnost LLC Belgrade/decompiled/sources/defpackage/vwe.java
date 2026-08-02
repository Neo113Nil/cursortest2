package defpackage;

import ru.yandex.taxi.costcenters.api.CostCenterField;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class vwe {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CostCenterField.InputFormat.values().length];
        try {
            iArr[CostCenterField.InputFormat.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CostCenterField.InputFormat.MIXED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CostCenterField.InputFormat.SELECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
