package com.google.crypto.tink.hybrid;

import androidx.datastore.core.SimpleActor;
import com.google.android.gms.internal.measurement.zzabh;
import com.google.crypto.tink.mac.MacParameters;
import java.util.Objects;

/* loaded from: classes.dex */
public final class HpkeParameters extends MacParameters {
    public final AeadId aead;
    public final KdfId kdf;
    public final KemId kem;
    public final Variant variant;

    public final class AeadId extends zzabh {
        public static final AeadId AES_128_GCM = new AeadId("AES_128_GCM", 1);
        public static final AeadId AES_256_GCM = new AeadId("AES_256_GCM", 2);
        public static final AeadId CHACHA20_POLY1305 = new AeadId("CHACHA20_POLY1305", 3);
    }

    public final class KdfId extends zzabh {
        public static final KdfId HKDF_SHA256 = new KdfId("HKDF_SHA256", 1);
        public static final KdfId HKDF_SHA384 = new KdfId("HKDF_SHA384", 2);
        public static final KdfId HKDF_SHA512 = new KdfId("HKDF_SHA512", 3);
    }

    public final class KemId extends zzabh {
        public static final KemId DHKEM_P256_HKDF_SHA256 = new KemId("DHKEM_P256_HKDF_SHA256", 16);
        public static final KemId DHKEM_P384_HKDF_SHA384 = new KemId("DHKEM_P384_HKDF_SHA384", 17);
        public static final KemId DHKEM_P521_HKDF_SHA512 = new KemId("DHKEM_P521_HKDF_SHA512", 18);
        public static final KemId DHKEM_X25519_HKDF_SHA256 = new KemId("DHKEM_X25519_HKDF_SHA256", 32);
    }

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

    public HpkeParameters(KemId kemId, KdfId kdfId, AeadId aeadId, Variant variant) {
        this.kem = kemId;
        this.kdf = kdfId;
        this.aead = aeadId;
        this.variant = variant;
    }

    public static SimpleActor builder() {
        SimpleActor simpleActor = new SimpleActor(14, false);
        simpleActor.scope = null;
        simpleActor.consumeMessage = null;
        simpleActor.messageQueue = null;
        simpleActor.remainingMessages = Variant.NO_PREFIX;
        return simpleActor;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HpkeParameters)) {
            return false;
        }
        HpkeParameters hpkeParameters = (HpkeParameters) obj;
        return this.kem == hpkeParameters.kem && this.kdf == hpkeParameters.kdf && this.aead == hpkeParameters.aead && this.variant == hpkeParameters.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public final int hashCode() {
        return Objects.hash(HpkeParameters.class, this.kem, this.kdf, this.aead, this.variant);
    }

    public final String toString() {
        return "HPKE Parameters (Variant: " + this.variant + ", KemId: " + this.kem + ", KdfId: " + this.kdf + ", AeadId: " + this.aead + ")";
    }
}
