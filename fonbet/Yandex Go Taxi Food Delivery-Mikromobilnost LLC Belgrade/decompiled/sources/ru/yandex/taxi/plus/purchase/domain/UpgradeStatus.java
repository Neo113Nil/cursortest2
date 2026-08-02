package ru.yandex.taxi.plus.purchase.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/plus/purchase/domain/UpgradeStatus;", "", "UPGRADE_AVAILABLE", "UPGRADE_UNAVAILABLE", "IN_PROGRESS", "ERROR_UNAVAILABLE", "NETWORK_OR_SERVER_ERROR", "UPGRADED", "UPGRADE_SUCCESS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UpgradeStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpgradeStatus[] $VALUES;
    public static final UpgradeStatus ERROR_UNAVAILABLE;
    public static final UpgradeStatus IN_PROGRESS;
    public static final UpgradeStatus NETWORK_OR_SERVER_ERROR;
    public static final UpgradeStatus UPGRADED;
    public static final UpgradeStatus UPGRADE_AVAILABLE;
    public static final UpgradeStatus UPGRADE_SUCCESS;
    public static final UpgradeStatus UPGRADE_UNAVAILABLE;

    static {
        UpgradeStatus upgradeStatus = new UpgradeStatus("UPGRADE_AVAILABLE", 0);
        UPGRADE_AVAILABLE = upgradeStatus;
        UpgradeStatus upgradeStatus2 = new UpgradeStatus("UPGRADE_UNAVAILABLE", 1);
        UPGRADE_UNAVAILABLE = upgradeStatus2;
        UpgradeStatus upgradeStatus3 = new UpgradeStatus("IN_PROGRESS", 2);
        IN_PROGRESS = upgradeStatus3;
        UpgradeStatus upgradeStatus4 = new UpgradeStatus("ERROR_UNAVAILABLE", 3);
        ERROR_UNAVAILABLE = upgradeStatus4;
        UpgradeStatus upgradeStatus5 = new UpgradeStatus("NETWORK_OR_SERVER_ERROR", 4);
        NETWORK_OR_SERVER_ERROR = upgradeStatus5;
        UpgradeStatus upgradeStatus6 = new UpgradeStatus("UPGRADED", 5);
        UPGRADED = upgradeStatus6;
        UpgradeStatus upgradeStatus7 = new UpgradeStatus("UPGRADE_SUCCESS", 6);
        UPGRADE_SUCCESS = upgradeStatus7;
        UpgradeStatus[] upgradeStatusArr = {upgradeStatus, upgradeStatus2, upgradeStatus3, upgradeStatus4, upgradeStatus5, upgradeStatus6, upgradeStatus7};
        $VALUES = upgradeStatusArr;
        $ENTRIES = kotlin.enums.a.a(upgradeStatusArr);
    }

    public static UpgradeStatus valueOf(String str) {
        return (UpgradeStatus) Enum.valueOf(UpgradeStatus.class, str);
    }

    public static UpgradeStatus[] values() {
        return (UpgradeStatus[]) $VALUES.clone();
    }
}
