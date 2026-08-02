package com.google.crypto.tink.aead;

import androidx.datastore.core.SimpleActor;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AesEaxParameters extends AeadParameters {
    public final int ivSizeBytes;
    public final int keySizeBytes;
    public final int tagSizeBytes;
    public final Variant variant;

    public final class Variant {
        public static final Variant CRUNCHY;
        public static final Variant CRUNCHY$1;
        public static final Variant CRUNCHY$2;
        public static final Variant CRUNCHY$3;
        public static final Variant CRUNCHY$4;
        public static final Variant CRUNCHY$5;
        public static final Variant NO_PREFIX;
        public static final Variant NO_PREFIX$1;
        public static final Variant NO_PREFIX$2;
        public static final Variant NO_PREFIX$3;
        public static final Variant NO_PREFIX$4;
        public static final Variant NO_PREFIX$5;
        public static final Variant NO_PREFIX$6;
        public static final Variant SHA1;
        public static final Variant SHA224;
        public static final Variant SHA256;
        public static final Variant SHA384;
        public static final Variant SHA512;
        public static final Variant TINK;
        public static final Variant TINK$1;
        public static final Variant TINK$2;
        public static final Variant TINK$3;
        public static final Variant TINK$4;
        public static final Variant TINK$5;
        public static final Variant TINK$6;
        public final /* synthetic */ int $r8$classId;
        public final String name;

        static {
            int i = 1;
            SHA1 = new Variant("SHA1", i);
            SHA224 = new Variant("SHA224", i);
            SHA256 = new Variant("SHA256", i);
            SHA384 = new Variant("SHA384", i);
            SHA512 = new Variant("SHA512", i);
            int i2 = 2;
            TINK$1 = new Variant("TINK", i2);
            CRUNCHY$1 = new Variant("CRUNCHY", i2);
            NO_PREFIX$1 = new Variant("NO_PREFIX", i2);
            int i3 = 0;
            TINK = new Variant("TINK", i3);
            CRUNCHY = new Variant("CRUNCHY", i3);
            NO_PREFIX = new Variant("NO_PREFIX", i3);
            int i4 = 3;
            TINK$2 = new Variant("TINK", i4);
            CRUNCHY$2 = new Variant("CRUNCHY", i4);
            NO_PREFIX$2 = new Variant("NO_PREFIX", i4);
            int i5 = 4;
            TINK$3 = new Variant("TINK", i5);
            CRUNCHY$3 = new Variant("CRUNCHY", i5);
            NO_PREFIX$3 = new Variant("NO_PREFIX", i5);
            int i6 = 5;
            TINK$4 = new Variant("TINK", i6);
            CRUNCHY$4 = new Variant("CRUNCHY", i6);
            NO_PREFIX$4 = new Variant("NO_PREFIX", i6);
            int i7 = 6;
            TINK$5 = new Variant("TINK", i7);
            NO_PREFIX$5 = new Variant("NO_PREFIX", i7);
            int i8 = 7;
            TINK$6 = new Variant("TINK", i8);
            CRUNCHY$5 = new Variant("CRUNCHY", i8);
            NO_PREFIX$6 = new Variant("NO_PREFIX", i8);
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

    public AesEaxParameters(int i, int i2, int i3, Variant variant) {
        this.keySizeBytes = i;
        this.ivSizeBytes = i2;
        this.tagSizeBytes = i3;
        this.variant = variant;
    }

    public static SimpleActor builder() {
        SimpleActor simpleActor = new SimpleActor(12, false);
        simpleActor.scope = null;
        simpleActor.consumeMessage = null;
        simpleActor.messageQueue = null;
        simpleActor.remainingMessages = Variant.NO_PREFIX;
        return simpleActor;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AesEaxParameters)) {
            return false;
        }
        AesEaxParameters aesEaxParameters = (AesEaxParameters) obj;
        return aesEaxParameters.keySizeBytes == this.keySizeBytes && aesEaxParameters.ivSizeBytes == this.ivSizeBytes && aesEaxParameters.tagSizeBytes == this.tagSizeBytes && aesEaxParameters.variant == this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public final int hashCode() {
        return Objects.hash(AesEaxParameters.class, Integer.valueOf(this.keySizeBytes), Integer.valueOf(this.ivSizeBytes), Integer.valueOf(this.tagSizeBytes), this.variant);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        sb.append(this.ivSizeBytes);
        sb.append("-byte IV, ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tag, and ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.keySizeBytes, "-byte key)", sb);
    }
}
