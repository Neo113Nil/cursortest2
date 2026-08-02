package com.datadog.android.core.internal.system;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class SystemInfo {
    public final boolean batteryFullOrCharging;
    public final int batteryLevel;
    public final boolean onExternalPowerSource;
    public final boolean powerSaveMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BatteryStatus {
        public static final /* synthetic */ BatteryStatus[] $VALUES;
        public static final BatteryStatus CHARGING;
        public static final BatteryStatus DISCHARGING;
        public static final BatteryStatus FULL;
        public static final BatteryStatus NOT_CHARGING;
        public static final BatteryStatus UNKNOWN;

        static {
            BatteryStatus batteryStatus = new BatteryStatus("UNKNOWN", 0);
            UNKNOWN = batteryStatus;
            BatteryStatus batteryStatus2 = new BatteryStatus("CHARGING", 1);
            CHARGING = batteryStatus2;
            BatteryStatus batteryStatus3 = new BatteryStatus("DISCHARGING", 2);
            DISCHARGING = batteryStatus3;
            BatteryStatus batteryStatus4 = new BatteryStatus("NOT_CHARGING", 3);
            NOT_CHARGING = batteryStatus4;
            BatteryStatus batteryStatus5 = new BatteryStatus("FULL", 4);
            FULL = batteryStatus5;
            $VALUES = new BatteryStatus[]{batteryStatus, batteryStatus2, batteryStatus3, batteryStatus4, batteryStatus5};
        }

        public static BatteryStatus valueOf(String str) {
            return (BatteryStatus) Enum.valueOf(BatteryStatus.class, str);
        }

        public static BatteryStatus[] values() {
            return (BatteryStatus[]) $VALUES.clone();
        }
    }

    public SystemInfo(int i, boolean z, boolean z2, boolean z3) {
        this.batteryFullOrCharging = z;
        this.batteryLevel = i;
        this.powerSaveMode = z2;
        this.onExternalPowerSource = z3;
    }

    public static SystemInfo copy$default(SystemInfo systemInfo, boolean z, int i, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            z = systemInfo.batteryFullOrCharging;
        }
        if ((i2 & 2) != 0) {
            i = systemInfo.batteryLevel;
        }
        if ((i2 & 4) != 0) {
            z2 = systemInfo.powerSaveMode;
        }
        if ((i2 & 8) != 0) {
            z3 = systemInfo.onExternalPowerSource;
        }
        systemInfo.getClass();
        return new SystemInfo(i, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemInfo)) {
            return false;
        }
        SystemInfo systemInfo = (SystemInfo) obj;
        return this.batteryFullOrCharging == systemInfo.batteryFullOrCharging && this.batteryLevel == systemInfo.batteryLevel && this.powerSaveMode == systemInfo.powerSaveMode && this.onExternalPowerSource == systemInfo.onExternalPowerSource;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.onExternalPowerSource) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.batteryLevel, Boolean.hashCode(this.batteryFullOrCharging) * 31, 31), 31, this.powerSaveMode);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemInfo(batteryFullOrCharging=");
        sb.append(this.batteryFullOrCharging);
        sb.append(", batteryLevel=");
        sb.append(this.batteryLevel);
        sb.append(", powerSaveMode=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.powerSaveMode, ", onExternalPowerSource=", this.onExternalPowerSource, ")");
    }

    public /* synthetic */ SystemInfo() {
        this(-1, false, false, false);
    }
}
