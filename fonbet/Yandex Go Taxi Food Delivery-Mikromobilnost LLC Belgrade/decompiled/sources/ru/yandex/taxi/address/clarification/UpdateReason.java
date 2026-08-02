package ru.yandex.taxi.address.clarification;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/address/clarification/UpdateReason;", "", "NEW_FINAL_SUGGEST", "UPDATE_PICKUP_POINT_BY_CLICK_IN_LIST", "UPDATE_PICKUP_POINT_BY_MOVE_PIN_ON_MAP", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UpdateReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpdateReason[] $VALUES;
    public static final UpdateReason NEW_FINAL_SUGGEST;
    public static final UpdateReason UNKNOWN;
    public static final UpdateReason UPDATE_PICKUP_POINT_BY_CLICK_IN_LIST;
    public static final UpdateReason UPDATE_PICKUP_POINT_BY_MOVE_PIN_ON_MAP;

    static {
        UpdateReason updateReason = new UpdateReason("NEW_FINAL_SUGGEST", 0);
        NEW_FINAL_SUGGEST = updateReason;
        UpdateReason updateReason2 = new UpdateReason("UPDATE_PICKUP_POINT_BY_CLICK_IN_LIST", 1);
        UPDATE_PICKUP_POINT_BY_CLICK_IN_LIST = updateReason2;
        UpdateReason updateReason3 = new UpdateReason("UPDATE_PICKUP_POINT_BY_MOVE_PIN_ON_MAP", 2);
        UPDATE_PICKUP_POINT_BY_MOVE_PIN_ON_MAP = updateReason3;
        UpdateReason updateReason4 = new UpdateReason("UNKNOWN", 3);
        UNKNOWN = updateReason4;
        UpdateReason[] updateReasonArr = {updateReason, updateReason2, updateReason3, updateReason4};
        $VALUES = updateReasonArr;
        $ENTRIES = kotlin.enums.a.a(updateReasonArr);
    }

    public static UpdateReason valueOf(String str) {
        return (UpdateReason) Enum.valueOf(UpdateReason.class, str);
    }

    public static UpdateReason[] values() {
        return (UpdateReason[]) $VALUES.clone();
    }
}
