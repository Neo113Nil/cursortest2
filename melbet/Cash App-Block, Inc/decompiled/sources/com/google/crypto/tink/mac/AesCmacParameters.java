package com.google.crypto.tink.mac;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.wire.GrpcMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AesCmacParameters extends MacParameters {
    public final int keySizeBytes;
    public final int tagSizeBytes;
    public final Variant variant;

    public final class Variant {
        public final String name;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant LEGACY = new Variant("LEGACY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.name = str;
        }

        public final String toString() {
            return this.name;
        }
    }

    public AesCmacParameters(int i, int i2, Variant variant) {
        this.keySizeBytes = i;
        this.tagSizeBytes = i2;
        this.variant = variant;
    }

    public static GrpcMethod builder() {
        GrpcMethod grpcMethod = new GrpcMethod();
        grpcMethod.path = null;
        grpcMethod.requestAdapter = null;
        grpcMethod.responseAdapter = Variant.NO_PREFIX;
        return grpcMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AesCmacParameters)) {
            return false;
        }
        AesCmacParameters aesCmacParameters = (AesCmacParameters) obj;
        return aesCmacParameters.keySizeBytes == this.keySizeBytes && aesCmacParameters.getTotalTagSizeBytes() == getTotalTagSizeBytes() && aesCmacParameters.variant == this.variant;
    }

    public final int getTotalTagSizeBytes() {
        Variant variant = Variant.NO_PREFIX;
        int i = this.tagSizeBytes;
        Variant variant2 = this.variant;
        if (variant2 == variant) {
            return i;
        }
        if (variant2 != Variant.TINK && variant2 != Variant.CRUNCHY && variant2 != Variant.LEGACY) {
            a$$ExternalSyntheticBUOutline0.m$1("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public final int hashCode() {
        return Objects.hash(AesCmacParameters.class, Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tags, and ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keySizeBytes, "-byte key)", sb);
    }
}
