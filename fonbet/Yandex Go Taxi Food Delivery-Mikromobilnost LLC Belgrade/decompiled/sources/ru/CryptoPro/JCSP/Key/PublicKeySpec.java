package ru.CryptoPro.JCSP.Key;

import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Null;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.dy31;
import defpackage.w511;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.SignatureException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.ShortBufferException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_ParamSet;
import ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax.GostR3410_2001_PublicKey;
import ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax.GostR3410_2001_PublicKeyParameters;
import ru.CryptoPro.JCP.ASN.GostR3410_2012_PKISyntax.GostR3410_2012_256_PublicKey;
import ru.CryptoPro.JCP.ASN.GostR3410_2012_PKISyntax.GostR3410_2012_512_PublicKey;
import ru.CryptoPro.JCP.ASN.GostR3410_2012_PKISyntax.GostR3410_2012_PublicKeyParameters;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.MasterKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.EllipticParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class PublicKeySpec implements JCSPPublicKeyInterface, JCSPSecretKeyInterface, JCSPSignatureKeyPreHashInterface {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCP.tools.resources.checker";
    private static final String a;
    public static final ResourceBundle resource;
    private PublicKeyBlob b;
    private PublicKeyLazyStartHolder c;
    private ParamsInterface d;
    private boolean e;
    private boolean f;
    private final AlgorithmGroups.KeyAlgorithmGroup g;
    private boolean h;

    public class PublicKeyLazyStartHolder implements Destroyable {
        private volatile PublicKeySpecWrapperBase b = null;

        public PublicKeyLazyStartHolder() {
        }

        public void clear() {
            if (this.b != null) {
                this.b.b();
            }
        }

        @Override // javax.security.auth.Destroyable
        public void destroy() throws DestroyFailedException {
            if (this.b != null) {
                this.b.destroy();
            }
        }

        public PublicKeySpecWrapperBase getPublicKeyWrapper() {
            PublicKeySpecWrapperBase publicKeySpecWrapperBase;
            PublicKeySpecWrapperBase publicKeySpecWrapperBase2 = this.b;
            if (publicKeySpecWrapperBase2 != null) {
                return publicKeySpecWrapperBase2;
            }
            synchronized (this) {
                try {
                    publicKeySpecWrapperBase = this.b;
                    if (publicKeySpecWrapperBase == null) {
                        publicKeySpecWrapperBase = PublicKeySpecWrapperFast.USE_PUBLIC_KEY_FAST ? new PublicKeySpecWrapperFast(PublicKeySpec.this.b, PublicKeySpec.this.e, PublicKeySpec.this.f) : PublicKeySpecWrapperPoolContext.USE_PUBLIC_CONTEXT_POOL ? new PublicKeySpecWrapperPoolContext(PublicKeySpec.this.b, PublicKeySpec.this.e, PublicKeySpec.this.f) : new PublicKeySpecWrapper(PublicKeySpec.this.b, PublicKeySpec.this.e, PublicKeySpec.this.f);
                        this.b = publicKeySpecWrapperBase;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return publicKeySpecWrapperBase;
        }

        @Override // javax.security.auth.Destroyable
        public boolean isDestroyed() {
            if (this.b != null) {
                return this.b.isDestroyed();
            }
            return true;
        }

        public void setPublicKeyWrapper(PublicKeySpecWrapperBase publicKeySpecWrapperBase) {
            this.b = publicKeySpecWrapperBase;
        }
    }

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("ru.CryptoPro.JCP.tools.resources.checker", Locale.getDefault());
        resource = bundle;
        a = bundle.getString("encrypt.not.support");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PublicKeySpec(byte[] bArr, boolean z, boolean z2) throws InvalidAlgorithmParameterException {
        byte[] bArr2;
        Asn1OctetString gostR3410_2012_512_PublicKey;
        Asn1DerDecodeBuffer asn1DerDecodeBuffer;
        OID oid;
        OID oid2;
        OID oid3;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
        this.h = false;
        SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
        try {
            Asn1DerDecodeBuffer asn1DerDecodeBuffer2 = new Asn1DerDecodeBuffer(bArr);
            subjectPublicKeyInfo.decode(asn1DerDecodeBuffer2, true, 0);
            asn1DerDecodeBuffer2.reset();
            OID oid4 = new OID(subjectPublicKeyInfo.algorithm.algorithm.value);
            boolean z3 = oid4.equals(AlgIdSpec.OID_19) || oid4.equals(AlgIdSpec.OID_98);
            boolean z4 = oid4.equals(AlgIdSpec.OID_PARAMS_SIG_2012_256) || oid4.equals(AlgIdSpec.OID_PARAMS_EXC_2012_256);
            boolean z5 = oid4.equals(AlgIdSpec.OID_PARAMS_SIG_2012_512) || oid4.equals(AlgIdSpec.OID_PARAMS_EXC_2012_512);
            AlgorithmGroups.KeyAlgorithmGroup a2 = AlgorithmGroups.a(oid4);
            this.g = a2;
            this.f = z2;
            try {
                if (z3) {
                    gostR3410_2012_512_PublicKey = new GostR3410_2001_PublicKey();
                    asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(subjectPublicKeyInfo.subjectPublicKey.value);
                } else if (z4) {
                    gostR3410_2012_512_PublicKey = new GostR3410_2012_256_PublicKey();
                    asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(subjectPublicKeyInfo.subjectPublicKey.value);
                } else {
                    if (!z5) {
                        if (a2 != AlgorithmGroups.KeyAlgorithmGroup.RSA && a2 != AlgorithmGroups.KeyAlgorithmGroup.EDDSA) {
                            if (a2 != AlgorithmGroups.KeyAlgorithmGroup.ECDSA) {
                                throw new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
                            }
                            byte[] bArr3 = subjectPublicKeyInfo.subjectPublicKey.value;
                            if (bArr3[0] != 4) {
                                throw new IOException("Only uncompressed point format supported");
                            }
                            int length = bArr3.length - 1;
                            byte[] bArr4 = new byte[length];
                            Array.copy(bArr3, 1, bArr4, 0, length);
                            int i = length / 2;
                            byte[] bArr5 = new byte[i];
                            int i2 = length / 2;
                            byte[] bArr6 = new byte[i2];
                            Array.copy(bArr4, 0, bArr5, 0, i);
                            Array.copy(bArr4, i, bArr6, 0, i2);
                            Array.invByteOrder(bArr5);
                            Array.invByteOrder(bArr6);
                            Array.copy(bArr5, 0, bArr4, 0, i);
                            Array.copy(bArr6, 0, bArr4, i, i2);
                            bArr2 = bArr4;
                            Asn1Type asn1Type = subjectPublicKeyInfo.algorithm.parameters;
                            if (!z3) {
                                if (!(asn1Type instanceof Asn1Null)) {
                                    if (asn1Type instanceof Asn1OpenType) {
                                        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
                                        try {
                                            asn1ObjectIdentifier.decode(new Asn1DerDecodeBuffer(((Asn1OpenType) asn1Type).value));
                                            oid3 = new OID(asn1ObjectIdentifier.value);
                                        } catch (Exception unused) {
                                            oid3 = null;
                                        }
                                        oid = null;
                                        oid2 = null;
                                    } else {
                                        Asn1Choice asn1Choice = (Asn1Choice) asn1Type;
                                        if (asn1Choice != null && asn1Choice.getElement() != null && !(asn1Choice.getElement() instanceof Asn1Null)) {
                                            GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters = (GostR3410_2012_PublicKeyParameters) asn1Choice.getElement();
                                            Asn1ObjectIdentifier asn1ObjectIdentifier2 = gostR3410_2012_PublicKeyParameters.publicKeyParamSet;
                                            OID oid5 = asn1ObjectIdentifier2 == null ? null : new OID(asn1ObjectIdentifier2.value);
                                            oid = CryptParamsSpec.OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet;
                                            if (!z4 && !z5) {
                                                Asn1ObjectIdentifier asn1ObjectIdentifier3 = gostR3410_2012_PublicKeyParameters.digestParamSet;
                                                oid2 = asn1ObjectIdentifier3 == null ? null : new OID(asn1ObjectIdentifier3.value);
                                                Asn1ObjectIdentifier asn1ObjectIdentifier4 = gostR3410_2012_PublicKeyParameters.encryptionParamSet;
                                                oid = asn1ObjectIdentifier4 != null ? new OID(asn1ObjectIdentifier4.value) : null;
                                            } else {
                                                if (oid5 == null || !EllipticParamsSpec.isShortNewOID(oid5)) {
                                                    if ((oid5 == null || !EllipticParamsSpec.is256OID_A(oid5)) && !z5) {
                                                        Asn1ObjectIdentifier asn1ObjectIdentifier5 = gostR3410_2012_PublicKeyParameters.digestParamSet;
                                                        OID oid6 = asn1ObjectIdentifier5 == null ? null : new OID(asn1ObjectIdentifier5.value);
                                                        if (oid6 != null && !oid6.equals(DigestParamsSpec.OID_Gost2012_256)) {
                                                            w511.l("Invalid digest parameter ", oid6, " for ", oid4);
                                                            throw null;
                                                        }
                                                        Asn1ObjectIdentifier asn1ObjectIdentifier6 = gostR3410_2012_PublicKeyParameters.encryptionParamSet;
                                                        oid = asn1ObjectIdentifier6 != null ? new OID(asn1ObjectIdentifier6.value) : null;
                                                        r1 = oid5;
                                                        oid2 = oid6;
                                                    } else {
                                                        Asn1ObjectIdentifier asn1ObjectIdentifier7 = gostR3410_2012_PublicKeyParameters.digestParamSet;
                                                        OID oid7 = asn1ObjectIdentifier7 == null ? null : new OID(asn1ObjectIdentifier7.value);
                                                        if (z5) {
                                                            if (oid7 != null && !oid7.equals(DigestParamsSpec.OID_Gost2012_512)) {
                                                                w511.l("Invalid digest parameter ", oid7, " for ", oid4);
                                                                throw null;
                                                            }
                                                        } else if (oid7 != null && !oid7.equals(DigestParamsSpec.OID_Gost2012_256)) {
                                                            w511.l("Invalid digest parameter ", oid7, " for ", oid4);
                                                            throw null;
                                                        }
                                                        Asn1ObjectIdentifier asn1ObjectIdentifier8 = gostR3410_2012_PublicKeyParameters.encryptionParamSet;
                                                        r1 = asn1ObjectIdentifier8 != null ? new OID(asn1ObjectIdentifier8.value) : null;
                                                        oid = r1 == null ? oid : r1;
                                                        r1 = oid5;
                                                        oid2 = oid7;
                                                    }
                                                    AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup = this.g;
                                                    a(bArr2, (keyAlgorithmGroup != AlgorithmGroups.KeyAlgorithmGroup.RSA || keyAlgorithmGroup == AlgorithmGroups.KeyAlgorithmGroup.EDDSA) ? new AlgIdSpecForeign(oid4) : keyAlgorithmGroup == AlgorithmGroups.KeyAlgorithmGroup.ECDSA ? new AlgIdSpecForeign(oid4, r1) : new AlgIdSpec(oid4, r1, oid2, oid), z);
                                                }
                                                oid2 = DigestParamsSpec.OID_Gost2012_256;
                                            }
                                            r1 = oid5;
                                            AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup2 = this.g;
                                            a(bArr2, (keyAlgorithmGroup2 != AlgorithmGroups.KeyAlgorithmGroup.RSA || keyAlgorithmGroup2 == AlgorithmGroups.KeyAlgorithmGroup.EDDSA) ? new AlgIdSpecForeign(oid4) : keyAlgorithmGroup2 == AlgorithmGroups.KeyAlgorithmGroup.ECDSA ? new AlgIdSpecForeign(oid4, r1) : new AlgIdSpec(oid4, r1, oid2, oid), z);
                                        }
                                    }
                                }
                                oid = null;
                                oid2 = null;
                                AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup22 = this.g;
                                a(bArr2, (keyAlgorithmGroup22 != AlgorithmGroups.KeyAlgorithmGroup.RSA || keyAlgorithmGroup22 == AlgorithmGroups.KeyAlgorithmGroup.EDDSA) ? new AlgIdSpecForeign(oid4) : keyAlgorithmGroup22 == AlgorithmGroups.KeyAlgorithmGroup.ECDSA ? new AlgIdSpecForeign(oid4, r1) : new AlgIdSpec(oid4, r1, oid2, oid), z);
                            }
                            Asn1Choice asn1Choice2 = (Asn1Choice) asn1Type;
                            if (asn1Choice2.getElement() instanceof Asn1Null) {
                                oid3 = null;
                                oid2 = null;
                            } else {
                                GostR3410_2001_PublicKeyParameters gostR3410_2001_PublicKeyParameters = (GostR3410_2001_PublicKeyParameters) asn1Choice2.getElement();
                                Gost28147_89_ParamSet gost28147_89_ParamSet = gostR3410_2001_PublicKeyParameters.encryptionParamSet;
                                OID oid8 = gost28147_89_ParamSet == null ? null : new OID(gost28147_89_ParamSet.value);
                                Asn1ObjectIdentifier asn1ObjectIdentifier9 = gostR3410_2001_PublicKeyParameters.digestParamSet;
                                oid2 = asn1ObjectIdentifier9 == null ? null : new OID(asn1ObjectIdentifier9.value);
                                Asn1ObjectIdentifier asn1ObjectIdentifier10 = gostR3410_2001_PublicKeyParameters.publicKeyParamSet;
                                oid3 = asn1ObjectIdentifier10 != null ? new OID(asn1ObjectIdentifier10.value) : null;
                                r1 = oid8;
                            }
                            oid = r1;
                            r1 = oid3;
                            AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup222 = this.g;
                            a(bArr2, (keyAlgorithmGroup222 != AlgorithmGroups.KeyAlgorithmGroup.RSA || keyAlgorithmGroup222 == AlgorithmGroups.KeyAlgorithmGroup.EDDSA) ? new AlgIdSpecForeign(oid4) : keyAlgorithmGroup222 == AlgorithmGroups.KeyAlgorithmGroup.ECDSA ? new AlgIdSpecForeign(oid4, r1) : new AlgIdSpec(oid4, r1, oid2, oid), z);
                        }
                        bArr2 = subjectPublicKeyInfo.subjectPublicKey.value;
                        Asn1Type asn1Type2 = subjectPublicKeyInfo.algorithm.parameters;
                        if (!z3) {
                        }
                        r1 = oid3;
                        AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup2222 = this.g;
                        a(bArr2, (keyAlgorithmGroup2222 != AlgorithmGroups.KeyAlgorithmGroup.RSA || keyAlgorithmGroup2222 == AlgorithmGroups.KeyAlgorithmGroup.EDDSA) ? new AlgIdSpecForeign(oid4) : keyAlgorithmGroup2222 == AlgorithmGroups.KeyAlgorithmGroup.ECDSA ? new AlgIdSpecForeign(oid4, r1) : new AlgIdSpec(oid4, r1, oid2, oid), z);
                    }
                    gostR3410_2012_512_PublicKey = new GostR3410_2012_512_PublicKey();
                    asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(subjectPublicKeyInfo.subjectPublicKey.value);
                }
                gostR3410_2012_512_PublicKey.decode(asn1DerDecodeBuffer);
                bArr2 = gostR3410_2012_512_PublicKey.value;
                Asn1Type asn1Type22 = subjectPublicKeyInfo.algorithm.parameters;
                if (!z3) {
                }
                r1 = oid3;
                AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup22222 = this.g;
                a(bArr2, (keyAlgorithmGroup22222 != AlgorithmGroups.KeyAlgorithmGroup.RSA || keyAlgorithmGroup22222 == AlgorithmGroups.KeyAlgorithmGroup.EDDSA) ? new AlgIdSpecForeign(oid4) : keyAlgorithmGroup22222 == AlgorithmGroups.KeyAlgorithmGroup.ECDSA ? new AlgIdSpecForeign(oid4, r1) : new AlgIdSpec(oid4, r1, oid2, oid), z);
            } catch (Asn1Exception unused2) {
                throw new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
            } catch (IOException unused3) {
                throw new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
            }
        } catch (Asn1Exception unused4) {
            throw new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
        } catch (IOException unused5) {
            throw new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
        }
    }

    private void a(byte[] bArr, AlgIdInterface algIdInterface, boolean z) throws InvalidAlgorithmParameterException {
        try {
            this.b = new PublicKeyBlob(bArr, algIdInterface, this.g);
            this.e = z;
            if (!checkPublic()) {
                throw new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
            }
        } catch (InvalidKeyException unused) {
            throw new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.NOT_GOST));
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void changeKey(CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface, ru.CryptoPro.JCP.Key.PublicKeyInterface
    public final boolean checkPublic() throws InvalidAlgorithmParameterException {
        this.c = new PublicKeyLazyStartHolder();
        this.d = this.b.getParams().getDigestParams();
        return true;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface, ru.CryptoPro.JCP.Key.PublicKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void clear() {
        this.c.clear();
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface, ru.CryptoPro.JCP.Key.PublicKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        try {
            return new PublicKeySpec(new PublicKeyBlob(this.b.getBlob(), this.b.ifSignature()), this.e, this.f, this.h);
        } catch (InvalidAlgorithmParameterException e) {
            JCSPLogger.subThrown(e);
            return null;
        } catch (InvalidKeyException e2) {
            JCSPLogger.subThrown(e2);
            return null;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public Object clone2() throws CloneNotSupportedException {
        return new PublicKeySpec(this);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void decrypt(byte[] bArr, int[] iArr, boolean z) throws InvalidKeyException, ShortBufferException {
        if (this.g == AlgorithmGroups.KeyAlgorithmGroup.GOST) {
            dy31.v("Unsupported method.");
            return;
        }
        try {
            this.c.getPublicKeyWrapper().b(z, bArr, iArr, 0);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int decryptLength(int i, boolean z) throws InvalidKeyException {
        if (this.g == AlgorithmGroups.KeyAlgorithmGroup.GOST) {
            dy31.v("Unsupported method.");
            return 0;
        }
        try {
            return this.c.getPublicKeyWrapper().b(z, i);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
            return 0;
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        this.c.destroy();
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void diversKey(byte[] bArr) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void diversKey2012(byte[] bArr) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface, ru.CryptoPro.JCP.Key.PublicKeyInterface
    public byte[] encode() {
        if (!this.h) {
            return this.b.getKey();
        }
        try {
            return new PublicKeyBlob(this.c.getPublicKeyWrapper().j(), false).getKey();
        } catch (InvalidKeyException e) {
            JCSPLogger.thrown(e);
            return null;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void encrypt(byte[] bArr, int[] iArr, boolean z) throws InvalidKeyException, ShortBufferException {
        if (this.g == AlgorithmGroups.KeyAlgorithmGroup.GOST) {
            dy31.v("Unsupported method.");
            return;
        }
        try {
            this.c.getPublicKeyWrapper().a(z, bArr, iArr, 0);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int encryptLength(int i, boolean z) throws InvalidKeyException {
        if (this.g == AlgorithmGroups.KeyAlgorithmGroup.GOST) {
            dy31.v("Unsupported method.");
            return 0;
        }
        try {
            return this.c.getPublicKeyWrapper().a(z, i);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
            return 0;
        }
    }

    public void finalize() throws Throwable {
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int getAlgorithmIdentifier() {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int getAppropriateCryptMode() {
        throw new IllegalArgumentException("Unsupported method.");
    }

    public byte[] getBlob() {
        return this.b.getBlob();
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int getEncryptMode() {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] getIV() {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public byte[] getIV_blob() throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public byte[] getIV_byte() throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface
    public AlgorithmGroups.KeyAlgorithmGroup getKeyAlgorithmGroup() {
        return this.g;
    }

    public int getKeyLength() {
        return this.c.getPublicKeyWrapper().i();
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface
    public int getKeyProvType() {
        return this.g.ordinal();
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public byte[] getKeyX() throws InvalidKeyException {
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public boolean getMixMode() {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int getPadding() {
        return this.c.getPublicKeyWrapper().getPadding();
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface, ru.CryptoPro.JCP.Key.PublicKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public ParamsInterface getParams() {
        return this.b.getParams();
    }

    public HKey getPublicKey() {
        return this.c.getPublicKeyWrapper().g();
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public byte[] getTag() throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface getWorkKey() {
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void imita(int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.c.isDestroyed();
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface
    public boolean isRSA() {
        return this.g == AlgorithmGroups.KeyAlgorithmGroup.RSA;
    }

    public boolean isStrictExport() {
        return this.h;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface, ru.CryptoPro.JCP.Key.PublicKeyInterface
    public boolean isTrusted() {
        return this.e;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface
    public boolean isUseDefaultCSPProvider() {
        return this.f;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public HHash makeNewHMAC(int i, OID oid) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public HHash makeNewMac(int i, int i2) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void methodGOSTR3411PRF(byte[][] bArr, byte[] bArr2, boolean z) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public MasterKeyInterface preHashMaster(byte[] bArr, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException(a);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSignatureKeyPreHashInterface
    public HHash prepareHash(int i, DigestParamsSpec digestParamsSpec, boolean z) {
        return this.c.getPublicKeyWrapper().prepareHash(i, digestParamsSpec);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setAAD(byte[] bArr) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setAlgorithmIdentifier(int i) throws InvalidKeyException {
        this.c.getPublicKeyWrapper().b(i);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setAlgorithmIdentifierByCryptMode(int i) throws InvalidKeyException {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setEncryptMode(int i, boolean z) {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void setIVLen(int i) {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setIV_blob(byte[] bArr) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setIV_byte(byte[] bArr) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setMixMode(boolean z) {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setModeBits(int i) {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setPadding(int i) {
        this.c.getPublicKeyWrapper().setPadding(i);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface, ru.CryptoPro.JCP.Key.PublicKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void setParams(ParamsInterface paramsInterface) {
        throw new IllegalArgumentException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setTag(byte[] bArr) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, String str, byte[] bArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public boolean updateTLSKey(long j, int i) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface, ru.CryptoPro.JCP.Key.PublicKeyInterface
    public boolean verifySignature(SignValue signValue, byte[] bArr) throws SignatureException {
        int i;
        JCSPLogger.subEnter();
        switch (this.c.getPublicKeyWrapper().h()) {
            case HProv.CALG_GR3410 /* 11806 */:
            case HProv.CALG_GR3410EL /* 11811 */:
            case HProv.CALG_DH_EL_SF /* 43556 */:
            case HProv.CALG_DH_EL_EPHEM /* 43557 */:
                i = 32798;
                break;
            case HProv.CALG_GR3410_12_512 /* 11837 */:
            case HProv.CALG_DH_GR3410_12_512_SF /* 43586 */:
            case HProv.CALG_DH_GR3410_12_512_EPHEM /* 43587 */:
                i = 32802;
                break;
            case HProv.CALG_GR3410_12_256 /* 11849 */:
            case HProv.CALG_DH_GR3410_12_256_SF /* 43590 */:
            case HProv.CALG_DH_GR3410_12_256_EPHEM /* 43591 */:
                i = 32801;
                break;
            default:
                throw new SignatureException("Invalid key algorithm");
        }
        JCSPLogger.subExit();
        return verifySignature(signValue, bArr, i, 0);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface) throws InvalidKeyException {
        return this.c.getPublicKeyWrapper().a(secretKeyInterface);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void imita(int[] iArr, byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public MasterKeyInterface preHashMaster(byte[] bArr, byte[] bArr2, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public JCSPMasterKeyInterface preHashMaster(byte[] bArr, int i, int i2, int i3, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException(a);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public JCSPSecretKeyInterface unwrap(byte[] bArr, int i, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public JCSPMasterKeyInterface preHashMaster(byte[] bArr, byte[] bArr2, int i, int i2, int i3, boolean z) throws InvalidKeyException, KeyManagementException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, byte[] bArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new InvalidKeyException("Unsupported method.");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void decrypt(byte[] bArr, int[] iArr, boolean z, int i) throws InvalidKeyException, ShortBufferException {
        if (this.g == AlgorithmGroups.KeyAlgorithmGroup.GOST) {
            dy31.v("Unsupported method.");
            return;
        }
        try {
            this.c.getPublicKeyWrapper().b(z, bArr, iArr, i);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void encrypt(byte[] bArr, int[] iArr, boolean z, int i) throws InvalidKeyException, ShortBufferException {
        if (this.g == AlgorithmGroups.KeyAlgorithmGroup.GOST) {
            dy31.v("Unsupported method.");
            return;
        }
        try {
            this.c.getPublicKeyWrapper().a(z, bArr, iArr, i);
        } catch (IllegalArgumentException e) {
            dy31.s(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface
    public boolean verifySignature(SignValue signValue, HHash hHash, int i) throws SignatureException {
        JCSPLogger.subEnter();
        try {
            boolean a2 = this.c.getPublicKeyWrapper().a(hHash, signValue.encode(), i);
            JCSPLogger.subExit();
            return a2;
        } catch (Exception e) {
            JCSPLogger.dump("Validation failed, public key: ", ByteBuffer.wrap(this.encode()));
            throw e;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface
    public boolean verifySignature(SignValue signValue, byte[] bArr, int i, int i2) throws SignatureException {
        JCSPLogger.subEnter();
        try {
            boolean a2 = this.c.getPublicKeyWrapper().a(i, bArr, this.d, signValue.encode(), i2);
            JCSPLogger.subExit();
            return a2;
        } catch (Exception e) {
            JCSPLogger.dump("Validation failed, public key: ", ByteBuffer.wrap(this.encode()));
            throw e;
        }
    }

    public PublicKeySpec(PublicKeyBlob publicKeyBlob, boolean z, boolean z2) throws InvalidAlgorithmParameterException {
        this.c = null;
        this.d = null;
        this.f = false;
        this.h = false;
        this.b = publicKeyBlob;
        this.e = z;
        this.g = publicKeyBlob.getKeyAlgorithmGroup();
        this.h = z2;
        if (!checkPublic()) {
            throw new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
        }
    }

    public PublicKeySpec(PublicKeyBlob publicKeyBlob, boolean z, boolean z2, boolean z3) throws InvalidAlgorithmParameterException {
        this.c = null;
        this.d = null;
        this.f = false;
        this.h = false;
        this.b = publicKeyBlob;
        this.e = z;
        this.g = publicKeyBlob.getKeyAlgorithmGroup();
        this.f = z2;
        this.h = z3;
        if (!checkPublic()) {
            throw new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
        }
    }

    public PublicKeySpec(PublicKeySpec publicKeySpec) throws CloneNotSupportedException {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
        this.h = false;
        this.b = publicKeySpec.b;
        this.e = publicKeySpec.e;
        this.g = publicKeySpec.g;
        this.f = publicKeySpec.f;
        this.h = publicKeySpec.h;
        this.d = publicKeySpec.d;
        PublicKeyLazyStartHolder publicKeyLazyStartHolder = new PublicKeyLazyStartHolder();
        this.c = publicKeyLazyStartHolder;
        publicKeyLazyStartHolder.setPublicKeyWrapper(publicKeySpec.c.getPublicKeyWrapper().d());
    }

    public PublicKeySpec(byte[] bArr, ParamsInterface paramsInterface, boolean z, AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup) throws InvalidAlgorithmParameterException {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
        this.h = false;
        if (!(paramsInterface instanceof AlgIdInterface)) {
            throw new InvalidAlgorithmParameterException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.NOT_GOST));
        }
        this.g = keyAlgorithmGroup;
        a(bArr, (AlgIdInterface) paramsInterface, z);
    }

    public PublicKeySpec(byte[] bArr, boolean z) throws InvalidAlgorithmParameterException {
        this(bArr, z, false);
    }

    public PublicKeySpec(PublicKeyBlob publicKeyBlob, boolean z) throws InvalidAlgorithmParameterException {
        this(publicKeyBlob, z, false);
    }
}
