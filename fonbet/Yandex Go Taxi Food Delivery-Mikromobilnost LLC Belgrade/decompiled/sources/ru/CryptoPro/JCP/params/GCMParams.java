package ru.CryptoPro.JCP.params;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.quz;
import java.io.IOException;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.AlgorithmParametersSpi;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.JCSP.Cipher.GostCipher;

/* loaded from: classes4.dex */
public class GCMParams extends AlgorithmParametersSpi {
    public static final String id_aes128_GCM = "2.16.840.1.101.3.4.1.6";
    public static final String id_aes192_GCM = "2.16.840.1.101.3.4.1.26";
    public static final String id_aes256_GCM = "2.16.840.1.101.3.4.1.46";
    public GCMParameterSpec a = null;

    @Override // java.security.AlgorithmParametersSpi
    public final byte[] engineGetEncoded() {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        try {
            new Asn1GCMParameters(this.a.getIV(), this.a.getTLen() / 8).encode(asn1BerEncodeBuffer);
            return asn1BerEncodeBuffer.getMsgCopy();
        } catch (Asn1Exception e) {
            kbs.r(e);
            return null;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public final AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == GCMParameterSpec.class) {
            return new GCMParameterSpec(this.a.getTLen(), this.a.getIV());
        }
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.a.getIV());
        }
        throw new InvalidParameterSpecException("AlgorithmParameterSpec not supported: ".concat(cls.getName()));
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof GCMParameterSpec)) {
            throw new InvalidParameterSpecException("AlgorithmParameterSpec class not supported: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) algorithmParameterSpec;
        this.a = new GCMParameterSpec(gCMParameterSpec.getTLen(), gCMParameterSpec.getIV());
    }

    @Override // java.security.AlgorithmParametersSpi
    public final String engineToString() {
        return GostCipher.STR_GCM_MODE;
    }

    public static class GCMParamsGen extends AlgorithmParameterGeneratorSpi {
        public SecureRandom a = null;

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = this.a;
            if (secureRandom == null) {
                kbs.g("SecureRandom must be set for AES parameter generation.");
                return null;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("CP_GCM");
                algorithmParameters.init(new GCMParameterSpec(16, bArr));
                return algorithmParameters;
            } catch (NoSuchAlgorithmException e) {
                ny61.j(e);
                return null;
            } catch (InvalidParameterSpecException e2) {
                ny61.j(e2);
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("AlgorithmParameterSpec not supported for AES parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final void engineInit(int i, SecureRandom secureRandom) {
            this.a = secureRandom;
        }
    }

    public static class Asn1GCMParameters extends Asn1Type {
        private Asn1OctetString a;
        private Asn1Integer b;

        public Asn1GCMParameters(byte[] bArr, int i) {
            this.a = null;
            this.b = null;
            this.a = new Asn1OctetString(bArr);
            this.b = new Asn1Integer(i);
        }

        @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
        public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
            if (z) {
                i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
            }
            init();
            Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
            IntHolder intHolder = new IntHolder();
            if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
                Asn1OctetString asn1OctetString = new Asn1OctetString();
                this.a = asn1OctetString;
                asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
            }
            if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
                quz.h(asn1BerDecodeBuffer);
                return;
            }
            Asn1Integer asn1Integer = new Asn1Integer();
            this.b = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
            if (asn1BerDecodeContext.expired()) {
                return;
            }
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 0, (short) 0, 2)) {
                quz.g();
            }
        }

        @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
        public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
            int encode = this.a.encode(asn1BerEncodeBuffer, true) + this.b.encode(asn1BerEncodeBuffer, true);
            return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
        }

        public void init() {
            this.a = null;
            this.b = null;
        }

        public Asn1GCMParameters() {
            this.a = null;
            this.b = null;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public final byte[] engineGetEncoded(String str) {
        if (str == null || str.equals("ASN.1")) {
            return engineGetEncoded();
        }
        ny61.v("Unknown format: ".concat(str));
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(byte[] bArr) {
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(bArr);
        Asn1GCMParameters asn1GCMParameters = new Asn1GCMParameters();
        try {
            asn1GCMParameters.decode(asn1BerDecodeBuffer);
            this.a = new GCMParameterSpec((int) asn1GCMParameters.b.value, asn1GCMParameters.a.value);
        } catch (Asn1Exception e) {
            kbs.r(e);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(byte[] bArr, String str) {
        if (str == null || str.equals("ASN.1")) {
            engineInit(bArr);
        } else {
            ny61.v("Unknown format: ".concat(str));
        }
    }
}
