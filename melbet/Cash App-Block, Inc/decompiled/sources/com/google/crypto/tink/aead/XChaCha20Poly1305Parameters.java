package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.AesEaxParameters;
import java.util.Objects;

/* loaded from: classes.dex */
public final class XChaCha20Poly1305Parameters extends AeadParameters {
    public final AesEaxParameters.Variant variant;

    public XChaCha20Poly1305Parameters(AesEaxParameters.Variant variant) {
        this.variant = variant;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof XChaCha20Poly1305Parameters) && ((XChaCha20Poly1305Parameters) obj).variant == this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != AesEaxParameters.Variant.NO_PREFIX$6;
    }

    public final int hashCode() {
        return Objects.hash(XChaCha20Poly1305Parameters.class, this.variant);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.variant + ")";
    }
}
