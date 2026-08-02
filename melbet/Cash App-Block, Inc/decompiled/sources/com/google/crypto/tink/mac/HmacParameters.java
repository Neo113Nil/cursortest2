package com.google.crypto.tink.mac;

import androidx.datastore.core.SimpleActor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class HmacParameters extends MacParameters {
    public final HashType hashType;
    public final int keySizeBytes;
    public final int tagSizeBytes;
    public final Variant variant;

    public final class HashType {
        public static final HashType SHA1 = new HashType("SHA1");
        public static final HashType SHA224 = new HashType("SHA224");
        public static final HashType SHA256 = new HashType("SHA256");
        public static final HashType SHA384 = new HashType("SHA384");
        public static final HashType SHA512 = new HashType("SHA512");
        public final String name;

        public HashType(String str) {
            this.name = str;
        }

        public final String toString() {
            return this.name;
        }
    }

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

    public HmacParameters(int i, int i2, Variant variant, HashType hashType) {
        this.keySizeBytes = i;
        this.tagSizeBytes = i2;
        this.variant = variant;
        this.hashType = hashType;
    }

    public static SimpleActor builder() {
        SimpleActor simpleActor = new SimpleActor(16, false);
        simpleActor.scope = null;
        simpleActor.consumeMessage = null;
        simpleActor.messageQueue = null;
        simpleActor.remainingMessages = Variant.NO_PREFIX;
        return simpleActor;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HmacParameters)) {
            return false;
        }
        HmacParameters hmacParameters = (HmacParameters) obj;
        return hmacParameters.keySizeBytes == this.keySizeBytes && hmacParameters.getTotalTagSizeBytes() == getTotalTagSizeBytes() && hmacParameters.variant == this.variant && hmacParameters.hashType == this.hashType;
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
        return Objects.hash(HmacParameters.class, Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant, this.hashType);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", hashType: ");
        sb.append(this.hashType);
        sb.append(", ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tags, and ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keySizeBytes, "-byte key)", sb);
    }
}
