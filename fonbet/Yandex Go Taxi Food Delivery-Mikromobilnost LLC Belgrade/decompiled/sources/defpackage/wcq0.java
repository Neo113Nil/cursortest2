package defpackage;

import com.yandex.payment.sdk.ui.view.payment.SelectPaymentAdapter$AdapterMode;
import com.yandex.xplat.payment.sdk.FamilyInfoFrame;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class wcq0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SelectPaymentAdapter$AdapterMode.values().length];
        try {
            iArr[SelectPaymentAdapter$AdapterMode.BankAndPs.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectPaymentAdapter$AdapterMode.PsOnly.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectPaymentAdapter$AdapterMode.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[FamilyInfoFrame.values().length];
        try {
            iArr2[FamilyInfoFrame.day.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FamilyInfoFrame.week.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FamilyInfoFrame.month.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
