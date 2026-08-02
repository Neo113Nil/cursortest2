package app.cash.zipline.loader;

import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SignatureAlgorithmId {
    public static final /* synthetic */ SignatureAlgorithmId[] $VALUES = {new SignatureAlgorithmId(EdDSAParameterSpec.Ed25519, 0), new SignatureAlgorithmId("EcdsaP256", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SignatureAlgorithmId EF5;

    public static SignatureAlgorithmId valueOf(String str) {
        return (SignatureAlgorithmId) Enum.valueOf(SignatureAlgorithmId.class, str);
    }

    public static SignatureAlgorithmId[] values() {
        return (SignatureAlgorithmId[]) $VALUES.clone();
    }
}
