package com.squareup.cash.account.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SignedInState {
    public static final /* synthetic */ SignedInState[] $VALUES;
    public static final SignedInState SIGNED_IN;
    public static final SignedInState SIGNED_OUT;

    static {
        SignedInState signedInState = new SignedInState("SIGNED_IN", 0);
        SIGNED_IN = signedInState;
        SignedInState signedInState2 = new SignedInState("SIGNED_OUT", 1);
        SIGNED_OUT = signedInState2;
        $VALUES = new SignedInState[]{signedInState, signedInState2};
    }

    public static SignedInState valueOf(String str) {
        return (SignedInState) Enum.valueOf(SignedInState.class, str);
    }

    public static SignedInState[] values() {
        return (SignedInState[]) $VALUES.clone();
    }
}
