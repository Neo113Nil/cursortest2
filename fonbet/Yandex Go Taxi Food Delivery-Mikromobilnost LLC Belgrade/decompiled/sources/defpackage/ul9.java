package defpackage;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ul9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersActiveOrderStatus.values().length];
        try {
            iArr[ChargersActiveOrderStatus.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersActiveOrderStatus.FINISHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
