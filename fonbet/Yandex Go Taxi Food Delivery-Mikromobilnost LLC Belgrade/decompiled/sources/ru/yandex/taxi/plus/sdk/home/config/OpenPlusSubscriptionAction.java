package ru.yandex.taxi.plus.sdk.home.config;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/plus/sdk/home/config/OpenPlusSubscriptionAction;", "", "BUY_SUBSCRIPTION", "UPGRADE_SUBSCRIPTION", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OpenPlusSubscriptionAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OpenPlusSubscriptionAction[] $VALUES;
    public static final OpenPlusSubscriptionAction BUY_SUBSCRIPTION;
    public static final OpenPlusSubscriptionAction NONE;
    public static final OpenPlusSubscriptionAction UPGRADE_SUBSCRIPTION;

    static {
        OpenPlusSubscriptionAction openPlusSubscriptionAction = new OpenPlusSubscriptionAction("BUY_SUBSCRIPTION", 0);
        BUY_SUBSCRIPTION = openPlusSubscriptionAction;
        OpenPlusSubscriptionAction openPlusSubscriptionAction2 = new OpenPlusSubscriptionAction("UPGRADE_SUBSCRIPTION", 1);
        UPGRADE_SUBSCRIPTION = openPlusSubscriptionAction2;
        OpenPlusSubscriptionAction openPlusSubscriptionAction3 = new OpenPlusSubscriptionAction(JCP.RAW_PREFIX, 2);
        NONE = openPlusSubscriptionAction3;
        OpenPlusSubscriptionAction[] openPlusSubscriptionActionArr = {openPlusSubscriptionAction, openPlusSubscriptionAction2, openPlusSubscriptionAction3};
        $VALUES = openPlusSubscriptionActionArr;
        $ENTRIES = a.a(openPlusSubscriptionActionArr);
    }

    public static OpenPlusSubscriptionAction valueOf(String str) {
        return (OpenPlusSubscriptionAction) Enum.valueOf(OpenPlusSubscriptionAction.class, str);
    }

    public static OpenPlusSubscriptionAction[] values() {
        return (OpenPlusSubscriptionAction[]) $VALUES.clone();
    }
}
