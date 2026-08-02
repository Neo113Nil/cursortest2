package ru.yandex.taxi.settings.main.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/settings/main/data/PaymentMenuItemAppearance;", "", "HIDDEN", "ENABLED", "DISABLED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentMenuItemAppearance {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMenuItemAppearance[] $VALUES;
    public static final PaymentMenuItemAppearance DISABLED;
    public static final PaymentMenuItemAppearance ENABLED;
    public static final PaymentMenuItemAppearance HIDDEN;

    static {
        PaymentMenuItemAppearance paymentMenuItemAppearance = new PaymentMenuItemAppearance("HIDDEN", 0);
        HIDDEN = paymentMenuItemAppearance;
        PaymentMenuItemAppearance paymentMenuItemAppearance2 = new PaymentMenuItemAppearance("ENABLED", 1);
        ENABLED = paymentMenuItemAppearance2;
        PaymentMenuItemAppearance paymentMenuItemAppearance3 = new PaymentMenuItemAppearance("DISABLED", 2);
        DISABLED = paymentMenuItemAppearance3;
        PaymentMenuItemAppearance[] paymentMenuItemAppearanceArr = {paymentMenuItemAppearance, paymentMenuItemAppearance2, paymentMenuItemAppearance3};
        $VALUES = paymentMenuItemAppearanceArr;
        $ENTRIES = a.a(paymentMenuItemAppearanceArr);
    }

    public static PaymentMenuItemAppearance valueOf(String str) {
        return (PaymentMenuItemAppearance) Enum.valueOf(PaymentMenuItemAppearance.class, str);
    }

    public static PaymentMenuItemAppearance[] values() {
        return (PaymentMenuItemAppearance[]) $VALUES.clone();
    }
}
