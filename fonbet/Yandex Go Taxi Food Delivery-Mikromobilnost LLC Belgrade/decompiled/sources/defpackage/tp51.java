package defpackage;

import com.yandex.plus.pay.ui.yb.api.PlusPayYbCardScenario;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class tp51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayYbCardScenario.values().length];
        try {
            iArr[PlusPayYbCardScenario.OPENING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayYbCardScenario.TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
