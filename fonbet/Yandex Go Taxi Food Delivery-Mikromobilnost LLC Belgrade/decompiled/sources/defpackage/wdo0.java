package defpackage;

import com.yandex.go.scooters.passes.data.model.actions.ScootersBuyPassAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class wdo0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersBuyPassAction.PassPurchaseType.values().length];
        try {
            iArr[ScootersBuyPassAction.PassPurchaseType.PACKAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersBuyPassAction.PassPurchaseType.SUPERPASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
