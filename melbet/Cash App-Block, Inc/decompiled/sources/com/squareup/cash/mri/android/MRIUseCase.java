package com.squareup.cash.mri.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class MRIUseCase {
    public static final /* synthetic */ MRIUseCase[] $VALUES;
    public static final MRIUseCase DIDV;
    public static final MRIUseCase INITIATE_SESSION;
    public static final MRIUseCase RISK;
    public static final MRIUseCase TTP;

    static {
        MRIUseCase mRIUseCase = new MRIUseCase("RISK", 0);
        RISK = mRIUseCase;
        MRIUseCase mRIUseCase2 = new MRIUseCase("TTP", 1);
        TTP = mRIUseCase2;
        MRIUseCase mRIUseCase3 = new MRIUseCase("INITIATE_SESSION", 2);
        INITIATE_SESSION = mRIUseCase3;
        MRIUseCase mRIUseCase4 = new MRIUseCase("DIDV", 3);
        DIDV = mRIUseCase4;
        $VALUES = new MRIUseCase[]{mRIUseCase, mRIUseCase2, mRIUseCase3, mRIUseCase4};
    }

    public static MRIUseCase valueOf(String str) {
        return (MRIUseCase) Enum.valueOf(MRIUseCase.class, str);
    }

    public static MRIUseCase[] values() {
        return (MRIUseCase[]) $VALUES.clone();
    }
}
