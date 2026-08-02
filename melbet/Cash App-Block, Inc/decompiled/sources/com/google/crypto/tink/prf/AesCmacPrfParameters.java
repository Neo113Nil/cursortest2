package com.google.crypto.tink.prf;

import com.google.crypto.tink.Parameters;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class AesCmacPrfParameters extends Parameters {
    public final int keySizeBytes;

    public AesCmacPrfParameters(int i) {
        this.keySizeBytes = i;
    }

    public static AesCmacPrfParameters create(int i) {
        if (i == 16 || i == 32) {
            return new AesCmacPrfParameters(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AesCmacPrfParameters) && ((AesCmacPrfParameters) obj).keySizeBytes == this.keySizeBytes;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return false;
    }

    public final int hashCode() {
        return Objects.hash(AesCmacPrfParameters.class, Integer.valueOf(this.keySizeBytes));
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keySizeBytes, "-byte key)", new StringBuilder("AesCmac PRF Parameters ("));
    }
}
