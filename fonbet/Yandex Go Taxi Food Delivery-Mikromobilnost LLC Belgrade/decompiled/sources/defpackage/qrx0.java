package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.SelectionChangeRuleController$ChangeRule;
import com.yandex.go.taxi.tariffs.models.TariffChangeReason;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class qrx0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SelectionChangeRuleController$ChangeRule.values().length];
        try {
            iArr[SelectionChangeRuleController$ChangeRule.NOT_ALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectionChangeRuleController$ChangeRule.ALLOWED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectionChangeRuleController$ChangeRule.ONLY_CAN_BE_DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[TariffChangeReason.values().length];
        try {
            iArr2[TariffChangeReason.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TariffChangeReason.TOLL_ROAD_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
