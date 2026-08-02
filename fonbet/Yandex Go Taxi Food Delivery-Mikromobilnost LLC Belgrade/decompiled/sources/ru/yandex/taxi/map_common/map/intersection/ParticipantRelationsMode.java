package ru.yandex.taxi.map_common.map.intersection;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/map_common/map/intersection/ParticipantRelationsMode;", "", "ONE_TO_ONE", "ONE_TO_MANY", "MANY_TO_ONE", "MANY_TO_MANY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ParticipantRelationsMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ParticipantRelationsMode[] $VALUES;
    public static final ParticipantRelationsMode MANY_TO_MANY;
    public static final ParticipantRelationsMode MANY_TO_ONE;
    public static final ParticipantRelationsMode ONE_TO_MANY;
    public static final ParticipantRelationsMode ONE_TO_ONE;

    static {
        ParticipantRelationsMode participantRelationsMode = new ParticipantRelationsMode("ONE_TO_ONE", 0);
        ONE_TO_ONE = participantRelationsMode;
        ParticipantRelationsMode participantRelationsMode2 = new ParticipantRelationsMode("ONE_TO_MANY", 1);
        ONE_TO_MANY = participantRelationsMode2;
        ParticipantRelationsMode participantRelationsMode3 = new ParticipantRelationsMode("MANY_TO_ONE", 2);
        MANY_TO_ONE = participantRelationsMode3;
        ParticipantRelationsMode participantRelationsMode4 = new ParticipantRelationsMode("MANY_TO_MANY", 3);
        MANY_TO_MANY = participantRelationsMode4;
        ParticipantRelationsMode[] participantRelationsModeArr = {participantRelationsMode, participantRelationsMode2, participantRelationsMode3, participantRelationsMode4};
        $VALUES = participantRelationsModeArr;
        $ENTRIES = kotlin.enums.a.a(participantRelationsModeArr);
    }

    public static ParticipantRelationsMode valueOf(String str) {
        return (ParticipantRelationsMode) Enum.valueOf(ParticipantRelationsMode.class, str);
    }

    public static ParticipantRelationsMode[] values() {
        return (ParticipantRelationsMode[]) $VALUES.clone();
    }
}
