package com.squareup.cash.cdf.deviceattestation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PlayIntegrityAttestationType {
    public static final /* synthetic */ PlayIntegrityAttestationType[] $VALUES;
    public static final PlayIntegrityAttestationType CLASSIC;
    public static final PlayIntegrityAttestationType STANDARD;

    static {
        PlayIntegrityAttestationType playIntegrityAttestationType = new PlayIntegrityAttestationType("CLASSIC", 0);
        CLASSIC = playIntegrityAttestationType;
        PlayIntegrityAttestationType playIntegrityAttestationType2 = new PlayIntegrityAttestationType("STANDARD", 1);
        STANDARD = playIntegrityAttestationType2;
        $VALUES = new PlayIntegrityAttestationType[]{playIntegrityAttestationType, playIntegrityAttestationType2};
    }

    public static PlayIntegrityAttestationType valueOf(String str) {
        return (PlayIntegrityAttestationType) Enum.valueOf(PlayIntegrityAttestationType.class, str);
    }

    public static PlayIntegrityAttestationType[] values() {
        return (PlayIntegrityAttestationType[]) $VALUES.clone();
    }
}
