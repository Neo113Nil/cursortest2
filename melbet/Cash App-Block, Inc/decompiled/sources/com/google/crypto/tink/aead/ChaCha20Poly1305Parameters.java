package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.AesEaxParameters;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ChaCha20Poly1305Parameters extends AeadParameters {
    public final AesEaxParameters.Variant variant;

    public ChaCha20Poly1305Parameters(AesEaxParameters.Variant variant) {
        this.variant = variant;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ChaCha20Poly1305Parameters) && ((ChaCha20Poly1305Parameters) obj).variant == this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != AesEaxParameters.Variant.NO_PREFIX$4;
    }

    public final int hashCode() {
        return Objects.hash(ChaCha20Poly1305Parameters.class, this.variant);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.variant + ")";
    }
}
