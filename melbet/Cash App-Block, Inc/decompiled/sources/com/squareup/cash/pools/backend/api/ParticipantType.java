package com.squareup.cash.pools.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ParticipantType {
    public static final /* synthetic */ ParticipantType[] $VALUES;
    public static final ParticipantType CASH_APP_USER;
    public static final ParticipantType OUT_OF_NETWORK;
    public static final ParticipantType UNSPECIFIED;

    static {
        ParticipantType participantType = new ParticipantType("UNSPECIFIED", 0);
        UNSPECIFIED = participantType;
        ParticipantType participantType2 = new ParticipantType("CASH_APP_USER", 1);
        CASH_APP_USER = participantType2;
        ParticipantType participantType3 = new ParticipantType("OUT_OF_NETWORK", 2);
        OUT_OF_NETWORK = participantType3;
        $VALUES = new ParticipantType[]{participantType, participantType2, participantType3};
    }

    public static ParticipantType valueOf(String str) {
        return (ParticipantType) Enum.valueOf(ParticipantType.class, str);
    }

    public static ParticipantType[] values() {
        return (ParticipantType[]) $VALUES.clone();
    }
}
