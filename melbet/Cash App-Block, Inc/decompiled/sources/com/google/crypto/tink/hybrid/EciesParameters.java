package com.google.crypto.tink.hybrid;

import com.google.android.gms.internal.measurement.zzlj;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.daead.AesSivKeyManager$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.mac.MacParameters;
import com.google.crypto.tink.util.Bytes;
import java.util.Objects;
import java.util.Set;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* loaded from: classes.dex */
public final class EciesParameters extends MacParameters {
    public static final Set acceptedDemParameters;
    public final CurveType curveType;
    public final Parameters demParameters;
    public final HashType hashType;
    public final PointFormat nistCurvePointFormat;
    public final Bytes salt;
    public final Variant variant;

    public final class CurveType {
        public static final CurveType NIST_P256 = new CurveType("NIST_P256");
        public static final CurveType NIST_P384 = new CurveType("NIST_P384");
        public static final CurveType NIST_P521 = new CurveType("NIST_P521");
        public static final CurveType X25519 = new CurveType(XDHParameterSpec.X25519);
        public final String name;

        public CurveType(String str) {
            this.name = str;
        }

        public final String toString() {
            return this.name;
        }
    }

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

    public final class PointFormat {
        public final String name;
        public static final PointFormat COMPRESSED = new PointFormat("COMPRESSED");
        public static final PointFormat UNCOMPRESSED = new PointFormat("UNCOMPRESSED");
        public static final PointFormat LEGACY_UNCOMPRESSED = new PointFormat("LEGACY_UNCOMPRESSED");

        public PointFormat(String str) {
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
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.name = str;
        }

        public final String toString() {
            return this.name;
        }
    }

    static {
        try {
            acceptedDemParameters = (Set) new AesSivKeyManager$$ExternalSyntheticLambda0(24).get();
        } catch (Exception e) {
            throw new TinkBugException(e);
        }
    }

    public EciesParameters(CurveType curveType, HashType hashType, PointFormat pointFormat, Parameters parameters, Variant variant, Bytes bytes) {
        this.curveType = curveType;
        this.hashType = hashType;
        this.nistCurvePointFormat = pointFormat;
        this.demParameters = parameters;
        this.variant = variant;
        this.salt = bytes;
    }

    public static zzlj builder() {
        zzlj zzljVar = new zzlj();
        zzljVar.zza = null;
        zzljVar.zzb = null;
        zzljVar.zzc = null;
        zzljVar.zze = null;
        zzljVar.zzd = Variant.NO_PREFIX;
        zzljVar.zzf = null;
        return zzljVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EciesParameters)) {
            return false;
        }
        EciesParameters eciesParameters = (EciesParameters) obj;
        return eciesParameters.curveType == this.curveType && eciesParameters.hashType == this.hashType && eciesParameters.nistCurvePointFormat == this.nistCurvePointFormat && Objects.equals(eciesParameters.demParameters, this.demParameters) && eciesParameters.variant == this.variant && Objects.equals(eciesParameters.salt, this.salt);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public final int hashCode() {
        return Objects.hash(EciesParameters.class, this.curveType, this.hashType, this.nistCurvePointFormat, this.demParameters, this.variant, this.salt);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.curveType, this.hashType, this.nistCurvePointFormat, this.demParameters, this.variant, this.salt);
    }
}
