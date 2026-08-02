package ru.yandex.taxi.payments.model.pci_dss;

import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ok21;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/payments/model/pci_dss/UserCardProfileName;", "", "Companion", "ok21", "YANDEX_DEFAULT", "YANGO_COM_DH1", "YANDEX_COM_DH2", "YANGO_COM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UserCardProfileName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserCardProfileName[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ok21 Companion;
    public static final UserCardProfileName YANDEX_COM_DH2;
    public static final UserCardProfileName YANDEX_DEFAULT;
    public static final UserCardProfileName YANGO_COM;
    public static final UserCardProfileName YANGO_COM_DH1;

    static {
        UserCardProfileName userCardProfileName = new UserCardProfileName("YANDEX_DEFAULT", 0);
        YANDEX_DEFAULT = userCardProfileName;
        UserCardProfileName userCardProfileName2 = new UserCardProfileName("YANGO_COM_DH1", 1);
        YANGO_COM_DH1 = userCardProfileName2;
        UserCardProfileName userCardProfileName3 = new UserCardProfileName("YANDEX_COM_DH2", 2);
        YANDEX_COM_DH2 = userCardProfileName3;
        UserCardProfileName userCardProfileName4 = new UserCardProfileName("YANGO_COM", 3);
        YANGO_COM = userCardProfileName4;
        UserCardProfileName[] userCardProfileNameArr = {userCardProfileName, userCardProfileName2, userCardProfileName3, userCardProfileName4};
        $VALUES = userCardProfileNameArr;
        $ENTRIES = a.a(userCardProfileNameArr);
        Companion = new ok21();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gn11(21));
    }

    public static UserCardProfileName valueOf(String str) {
        return (UserCardProfileName) Enum.valueOf(UserCardProfileName.class, str);
    }

    public static UserCardProfileName[] values() {
        return (UserCardProfileName[]) $VALUES.clone();
    }
}
