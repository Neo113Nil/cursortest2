package com.google.crypto.tink.aead;

import java.util.Objects;

/* loaded from: classes.dex */
public final class LegacyKmsAeadParameters extends AeadParameters {
    public final String keyUri;
    public final Variant variant;

    /* loaded from: classes4.dex */
    public final class Variant {
        public static final Variant ASSUME_AES_CTR_HMAC;
        public static final Variant ASSUME_AES_EAX;
        public static final Variant ASSUME_AES_GCM;
        public static final Variant ASSUME_AES_GCM_SIV;
        public static final Variant ASSUME_CHACHA20POLY1305;
        public static final Variant ASSUME_XCHACHA20POLY1305;
        public static final Variant NO_PREFIX;
        public static final Variant NO_PREFIX$1;
        public static final Variant TINK;
        public static final Variant TINK$1;
        public final /* synthetic */ int $r8$classId;
        public final String name;

        static {
            int i = 0;
            TINK = new Variant("TINK", i);
            NO_PREFIX = new Variant("NO_PREFIX", i);
            int i2 = 1;
            ASSUME_AES_GCM = new Variant("ASSUME_AES_GCM", i2);
            ASSUME_XCHACHA20POLY1305 = new Variant("ASSUME_XCHACHA20POLY1305", i2);
            ASSUME_CHACHA20POLY1305 = new Variant("ASSUME_CHACHA20POLY1305", i2);
            ASSUME_AES_CTR_HMAC = new Variant("ASSUME_AES_CTR_HMAC", i2);
            ASSUME_AES_EAX = new Variant("ASSUME_AES_EAX", i2);
            ASSUME_AES_GCM_SIV = new Variant("ASSUME_AES_GCM_SIV", i2);
            int i3 = 2;
            TINK$1 = new Variant("TINK", i3);
            NO_PREFIX$1 = new Variant("NO_PREFIX", i3);
        }

        public /* synthetic */ Variant(String str, int i) {
            this.$r8$classId = i;
            this.name = str;
        }

        public final String toString() {
            int i = this.$r8$classId;
            return this.name;
        }
    }

    public LegacyKmsAeadParameters(String str, Variant variant) {
        this.keyUri = str;
        this.variant = variant;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LegacyKmsAeadParameters) {
            LegacyKmsAeadParameters legacyKmsAeadParameters = (LegacyKmsAeadParameters) obj;
            return legacyKmsAeadParameters.keyUri.equals(this.keyUri) && legacyKmsAeadParameters.variant == this.variant;
        }
        return false;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public final int hashCode() {
        return Objects.hash(LegacyKmsAeadParameters.class, this.keyUri, this.variant);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.keyUri + ", variant: " + this.variant + ")";
    }
}
