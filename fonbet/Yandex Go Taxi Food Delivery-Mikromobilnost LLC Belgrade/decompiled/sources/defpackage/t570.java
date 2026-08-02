package defpackage;

import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class t570 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusTarifficatorPurchase.Type.values().length];
        try {
            iArr[PlusTarifficatorPurchase.Type.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusTarifficatorPurchase.Type.SILENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
