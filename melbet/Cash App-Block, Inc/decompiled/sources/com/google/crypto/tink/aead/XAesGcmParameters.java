package com.google.crypto.tink.aead;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.AesEaxParameters;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class XAesGcmParameters extends AeadParameters {
    public final int saltSizeBytes;
    public final AesEaxParameters.Variant variant;

    public XAesGcmParameters(int i, AesEaxParameters.Variant variant) {
        this.variant = variant;
        this.saltSizeBytes = i;
    }

    public static XAesGcmParameters create(int i, AesEaxParameters.Variant variant) {
        if (i >= 8 && i <= 12) {
            return new XAesGcmParameters(i, variant);
        }
        a$$ExternalSyntheticBUOutline0.m$6("Salt size must be between 8 and 12 bytes");
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof XAesGcmParameters)) {
            return false;
        }
        XAesGcmParameters xAesGcmParameters = (XAesGcmParameters) obj;
        return xAesGcmParameters.variant == this.variant && xAesGcmParameters.saltSizeBytes == this.saltSizeBytes;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != AesEaxParameters.Variant.NO_PREFIX$5;
    }

    public final int hashCode() {
        return Objects.hash(XAesGcmParameters.class, this.variant, Integer.valueOf(this.saltSizeBytes));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("X-AES-GCM Parameters (variant: ");
        sb.append(this.variant);
        sb.append("salt_size_bytes: ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.saltSizeBytes, ")", sb);
    }
}
