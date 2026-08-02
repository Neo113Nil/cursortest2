package ru.CryptoPro.JCP.Key;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.EllipticParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.spec.NameAlgIdSpec;
import ru.CryptoPro.JCP.spec.X509PublicKeySpec;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public abstract class InternalKeyPairGenerator extends KeyPairGenerator {
    protected boolean cryptDhAllowedForSignKey;
    protected boolean exportable;
    protected AlgIdInterface params;

    public InternalKeyPairGenerator(String str) {
        super(str);
        this.exportable = true;
        this.cryptDhAllowedForSignKey = false;
    }

    public static void checkParams(AlgIdInterface algIdInterface, String str, String str2) throws InvalidAlgorithmParameterException {
        if (!(algIdInterface.getSignParams() instanceof EllipticParamsInterface)) {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(str);
            JCPLogger.warning(invalidAlgorithmParameterException);
            throw invalidAlgorithmParameterException;
        }
        if (algIdInterface.getCryptParams() == null || !CryptParamsSpec.isGR34122015(algIdInterface.getCryptParams().getOID())) {
            return;
        }
        InvalidAlgorithmParameterException invalidAlgorithmParameterException2 = new InvalidAlgorithmParameterException(str2);
        JCPLogger.warning(invalidAlgorithmParameterException2);
        throw invalidAlgorithmParameterException2;
    }

    public void checkAdSaveParams(AlgIdInterface algIdInterface, boolean z) {
        OID oid;
        OID oid2;
        OID oid3;
        OID oid4;
        OID oid5;
        OID oid6 = CryptParamsSpec.OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet;
        OID oid7 = algIdInterface.getOID();
        OID oid8 = AlgIdSpec.OID_19;
        if (oid7.equals(oid8) || algIdInterface.getOID().equals(AlgIdSpec.OID_98)) {
            if (!(algIdInterface instanceof NameAlgIdSpec)) {
                if (z) {
                    oid8 = AlgIdSpec.OID_98;
                }
                this.params = new AlgIdSpec(oid8, algIdInterface.getSignParams().getOID(), algIdInterface.getDigestParams().getOID(), algIdInterface.getCryptParams().getOID());
                return;
            }
            NameAlgIdSpec nameAlgIdSpec = (NameAlgIdSpec) algIdInterface;
            boolean isUseDefaultParameters = nameAlgIdSpec.isUseDefaultParameters();
            if (isUseDefaultParameters) {
                oid = this.params.getOID();
            } else {
                if (z) {
                    oid8 = AlgIdSpec.OID_98;
                }
                oid = oid8;
            }
            ParamsInterface signParams = isUseDefaultParameters ? this.params.getSignParams() : algIdInterface.getSignParams();
            ParamsInterface digestParams = isUseDefaultParameters ? this.params.getDigestParams() : algIdInterface.getDigestParams();
            if (isUseDefaultParameters) {
                algIdInterface = this.params;
            }
            this.params = new NameAlgIdSpec(oid, signParams, digestParams, algIdInterface.getCryptParams(), nameAlgIdSpec.getName(), nameAlgIdSpec.isOnlyStoreType(), nameAlgIdSpec.getProviderName());
            return;
        }
        OID oid9 = algIdInterface.getOID();
        OID oid10 = AlgIdSpec.OID_PARAMS_SIG_2012_256;
        if (!oid9.equals(oid10) && !algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256)) {
            OID oid11 = algIdInterface.getOID();
            OID oid12 = AlgIdSpec.OID_PARAMS_SIG_2012_512;
            if (oid11.equals(oid12) || algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
                if (!(algIdInterface instanceof NameAlgIdSpec)) {
                    if (algIdInterface.getCryptParams() != null) {
                        oid6 = algIdInterface.getCryptParams().getOID();
                    }
                    if (z) {
                        oid12 = AlgIdSpec.OID_PARAMS_EXC_2012_512;
                    }
                    this.params = new AlgIdSpec(oid12, algIdInterface.getSignParams().getOID(), DigestParamsSpec.OID_Gost2012_512, oid6);
                    return;
                }
                NameAlgIdSpec nameAlgIdSpec2 = (NameAlgIdSpec) algIdInterface;
                boolean isUseDefaultParameters2 = nameAlgIdSpec2.isUseDefaultParameters();
                if (isUseDefaultParameters2) {
                    oid5 = this.params.getOID();
                } else {
                    if (z) {
                        oid12 = AlgIdSpec.OID_PARAMS_EXC_2012_512;
                    }
                    oid5 = oid12;
                }
                ParamsInterface cryptParams = nameAlgIdSpec2.isUseDefaultParameters() ? this.params.getCryptParams() : algIdInterface.getCryptParams();
                if (cryptParams != null) {
                    oid6 = cryptParams.getOID();
                }
                if (isUseDefaultParameters2) {
                    algIdInterface = this.params;
                }
                this.params = new NameAlgIdSpec(oid5, algIdInterface.getSignParams(), DigestParamsSpec.getInstance(DigestParamsSpec.OID_Gost2012_512), CryptParamsSpec.getInstance(oid6), nameAlgIdSpec2.getName(), nameAlgIdSpec2.isOnlyStoreType(), nameAlgIdSpec2.getProviderName());
                return;
            }
            return;
        }
        OID oid13 = DigestParamsSpec.OID_Gost2012_256;
        DigestParamsSpec digestParamsSpec = DigestParamsSpec.getInstance(oid13);
        OID oid14 = algIdInterface.getSignParams().getOID();
        if (EllipticParamsSpec.isShortNewOID(oid14)) {
            if (!(algIdInterface instanceof NameAlgIdSpec)) {
                if (z) {
                    oid10 = AlgIdSpec.OID_PARAMS_EXC_2012_256;
                }
                this.params = new AlgIdSpec(oid10, oid14, oid13, oid6);
                return;
            }
            NameAlgIdSpec nameAlgIdSpec3 = (NameAlgIdSpec) algIdInterface;
            boolean isUseDefaultParameters3 = nameAlgIdSpec3.isUseDefaultParameters();
            if (isUseDefaultParameters3) {
                oid4 = this.params.getOID();
            } else {
                if (z) {
                    oid10 = AlgIdSpec.OID_PARAMS_EXC_2012_256;
                }
                oid4 = oid10;
            }
            if (isUseDefaultParameters3) {
                algIdInterface = this.params;
            }
            this.params = new NameAlgIdSpec(oid4, algIdInterface.getSignParams(), digestParamsSpec, CryptParamsSpec.getInstance(oid6), nameAlgIdSpec3.getName(), nameAlgIdSpec3.isOnlyStoreType(), nameAlgIdSpec3.getProviderName());
            return;
        }
        if (!EllipticParamsSpec.is256OID_A(oid14)) {
            if (!(algIdInterface instanceof NameAlgIdSpec)) {
                if (z) {
                    oid10 = AlgIdSpec.OID_PARAMS_EXC_2012_256;
                }
                this.params = new AlgIdSpec(oid10, oid14, oid13, algIdInterface.getCryptParams().getOID());
                return;
            }
            NameAlgIdSpec nameAlgIdSpec4 = (NameAlgIdSpec) algIdInterface;
            boolean isUseDefaultParameters4 = nameAlgIdSpec4.isUseDefaultParameters();
            if (isUseDefaultParameters4) {
                oid2 = this.params.getOID();
            } else {
                if (z) {
                    oid10 = AlgIdSpec.OID_PARAMS_EXC_2012_256;
                }
                oid2 = oid10;
            }
            ParamsInterface signParams2 = isUseDefaultParameters4 ? this.params.getSignParams() : algIdInterface.getSignParams();
            if (isUseDefaultParameters4) {
                algIdInterface = this.params;
            }
            this.params = new NameAlgIdSpec(oid2, signParams2, digestParamsSpec, algIdInterface.getCryptParams(), nameAlgIdSpec4.getName(), nameAlgIdSpec4.isOnlyStoreType(), nameAlgIdSpec4.getProviderName());
            return;
        }
        if (!(algIdInterface instanceof NameAlgIdSpec)) {
            if (algIdInterface.getCryptParams() != null) {
                oid6 = algIdInterface.getCryptParams().getOID();
            }
            if (z) {
                oid10 = AlgIdSpec.OID_PARAMS_EXC_2012_256;
            }
            this.params = new AlgIdSpec(oid10, oid14, oid13, oid6);
            return;
        }
        NameAlgIdSpec nameAlgIdSpec5 = (NameAlgIdSpec) algIdInterface;
        boolean isUseDefaultParameters5 = nameAlgIdSpec5.isUseDefaultParameters();
        if (isUseDefaultParameters5) {
            oid3 = this.params.getOID();
        } else {
            if (z) {
                oid10 = AlgIdSpec.OID_PARAMS_EXC_2012_256;
            }
            oid3 = oid10;
        }
        ParamsInterface cryptParams2 = nameAlgIdSpec5.isUseDefaultParameters() ? this.params.getCryptParams() : algIdInterface.getCryptParams();
        if (cryptParams2 != null) {
            oid6 = cryptParams2.getOID();
        }
        if (isUseDefaultParameters5) {
            algIdInterface = this.params;
        }
        this.params = new NameAlgIdSpec(oid3, algIdInterface.getSignParams(), digestParamsSpec, CryptParamsSpec.getInstance(oid6), nameAlgIdSpec5.getName(), nameAlgIdSpec5.isOnlyStoreType(), nameAlgIdSpec5.getProviderName());
    }

    public AlgIdInterface getParams(X509PublicKeySpec x509PublicKeySpec, String str) throws InvalidAlgorithmParameterException {
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(x509PublicKeySpec.getEncoded());
        SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
        try {
            subjectPublicKeyInfo.decode(asn1BerDecodeBuffer);
            asn1BerDecodeBuffer.reset();
            return new AlgIdSpec(subjectPublicKeyInfo.algorithm);
        } catch (Asn1Exception e) {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(str);
            invalidAlgorithmParameterException.initCause(e);
            throw invalidAlgorithmParameterException;
        } catch (IOException e2) {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException2 = new InvalidAlgorithmParameterException(str);
            invalidAlgorithmParameterException2.initCause(e2);
            throw invalidAlgorithmParameterException2;
        }
    }
}
