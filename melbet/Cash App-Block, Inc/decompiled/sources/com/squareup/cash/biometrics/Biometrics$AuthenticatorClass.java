package com.squareup.cash.biometrics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Biometrics$AuthenticatorClass {
    public static final /* synthetic */ Biometrics$AuthenticatorClass[] $VALUES;
    public static final Biometrics$AuthenticatorClass STRONG;
    public static final Biometrics$AuthenticatorClass WEAK;

    static {
        Biometrics$AuthenticatorClass biometrics$AuthenticatorClass = new Biometrics$AuthenticatorClass("STRONG", 0);
        STRONG = biometrics$AuthenticatorClass;
        Biometrics$AuthenticatorClass biometrics$AuthenticatorClass2 = new Biometrics$AuthenticatorClass("WEAK", 1);
        WEAK = biometrics$AuthenticatorClass2;
        $VALUES = new Biometrics$AuthenticatorClass[]{biometrics$AuthenticatorClass, biometrics$AuthenticatorClass2};
    }

    public static Biometrics$AuthenticatorClass valueOf(String str) {
        return (Biometrics$AuthenticatorClass) Enum.valueOf(Biometrics$AuthenticatorClass.class, str);
    }

    public static Biometrics$AuthenticatorClass[] values() {
        return (Biometrics$AuthenticatorClass[]) $VALUES.clone();
    }
}
