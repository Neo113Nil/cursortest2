package ru.yandex.taxi.navigation.single_guidance_coordinator;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/navigation/single_guidance_coordinator/GuidanceOwnerId;", "", "AUTO_NAVIGATION", "WALKING_NAVIGATION", "SCOOTERS_NAVIGATION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GuidanceOwnerId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GuidanceOwnerId[] $VALUES;
    public static final GuidanceOwnerId AUTO_NAVIGATION;
    public static final GuidanceOwnerId SCOOTERS_NAVIGATION;
    public static final GuidanceOwnerId WALKING_NAVIGATION;

    static {
        GuidanceOwnerId guidanceOwnerId = new GuidanceOwnerId("AUTO_NAVIGATION", 0);
        AUTO_NAVIGATION = guidanceOwnerId;
        GuidanceOwnerId guidanceOwnerId2 = new GuidanceOwnerId("WALKING_NAVIGATION", 1);
        WALKING_NAVIGATION = guidanceOwnerId2;
        GuidanceOwnerId guidanceOwnerId3 = new GuidanceOwnerId("SCOOTERS_NAVIGATION", 2);
        SCOOTERS_NAVIGATION = guidanceOwnerId3;
        GuidanceOwnerId[] guidanceOwnerIdArr = {guidanceOwnerId, guidanceOwnerId2, guidanceOwnerId3};
        $VALUES = guidanceOwnerIdArr;
        $ENTRIES = a.a(guidanceOwnerIdArr);
    }

    public static GuidanceOwnerId valueOf(String str) {
        return (GuidanceOwnerId) Enum.valueOf(GuidanceOwnerId.class, str);
    }

    public static GuidanceOwnerId[] values() {
        return (GuidanceOwnerId[]) $VALUES.clone();
    }
}
