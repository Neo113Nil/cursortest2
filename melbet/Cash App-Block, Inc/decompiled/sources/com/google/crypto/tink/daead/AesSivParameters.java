package com.google.crypto.tink.daead;

import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Parameters;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AesSivParameters extends Parameters {
    public final int keySizeBytes;
    public final Variant variant;

    public final class Variant {
        public final String name;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.name = str;
        }

        public final String toString() {
            return this.name;
        }
    }

    public AesSivParameters(int i, Variant variant) {
        this.keySizeBytes = i;
        this.variant = variant;
    }

    public static KeysetHandle builder() {
        KeysetHandle keysetHandle = new KeysetHandle(5, false);
        keysetHandle.entries = null;
        keysetHandle.annotationsMap = Variant.NO_PREFIX;
        return keysetHandle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AesSivParameters)) {
            return false;
        }
        AesSivParameters aesSivParameters = (AesSivParameters) obj;
        return aesSivParameters.keySizeBytes == this.keySizeBytes && aesSivParameters.variant == this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public final int hashCode() {
        return Objects.hash(AesSivParameters.class, Integer.valueOf(this.keySizeBytes), this.variant);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesSiv Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keySizeBytes, "-byte key)", sb);
    }
}
