package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.ALL_PKIX1Explicit88Values;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.ATTRIBUTE_CLASS;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.OtherSigningCertificate;
import ru.CryptoPro.JCP.ASN.PKIXTSP.TimeStampToken;

/* loaded from: classes4.dex */
public class _ETS_ElectronicSignatureFormats_97SyntaxValues {
    public static final ATTRIBUTE_CLASS archiveTimestamp;
    public static final ATTRIBUTE_CLASS certCRLTimestamp;
    public static final ATTRIBUTE_CLASS certValues;
    public static final ATTRIBUTE_CLASS certificateRefs;
    public static final ATTRIBUTE_CLASS contentTimestamp;
    public static final ATTRIBUTE_CLASS escTimeStamp;
    public static final int[] id_aa_ets_archiveTimestamp;
    public static final int[] id_aa_ets_certCRLTimestamp;
    public static final int[] id_aa_ets_certValues;
    public static final int[] id_aa_ets_certificateRefs;
    public static final int[] id_aa_ets_contentTimestamp;
    public static final int[] id_aa_ets_escTimeStamp;
    public static final int[] id_aa_ets_revocationRefs;
    public static final int[] id_aa_ets_revocationValues;
    public static final int[] id_aa_ets_sigPolicyId;
    public static final int[] id_aa_signatureTimeStampToken;
    public static final ATTRIBUTE_CLASS revocationRefs;
    public static final ATTRIBUTE_CLASS revocationValues;
    public static final ATTRIBUTE_CLASS sigPolicyId;
    public static final ATTRIBUTE_CLASS signatureTimeStampToken;
    public static final int[] id_etsi_es_IDUP_Mechanism_v1 = {0, 4, 0, 1733, 1, 4, 1};
    public static final int[] id_spq_ets_uri = {1, 2, 840, 113549, 1, 9, 16, 5, 1};
    public static final int[] id_spq_ets_unotice = {1, 2, 840, 113549, 1, 9, 16, 5, 2};
    public static final int[] id_aa_ets_commitmentType = {1, 2, 840, 113549, 1, 9, 16, 2, 16};
    public static final int[] id_cti_ets_proofOfOrigin = {1, 2, 840, 113549, 1, 9, 16, 6, 1};
    public static final int[] id_cti_ets_proofOfReceipt = {1, 2, 840, 113549, 1, 9, 16, 6, 2};
    public static final int[] id_cti_ets_proofOfDelivery = {1, 2, 840, 113549, 1, 9, 16, 6, 3};
    public static final int[] id_cti_ets_proofOfSender = {1, 2, 840, 113549, 1, 9, 16, 6, 4};
    public static final int[] id_cti_ets_proofOfApproval = {1, 2, 840, 113549, 1, 9, 16, 6, 5};
    public static final int[] id_cti_ets_proofOfCreation = {1, 2, 840, 113549, 1, 9, 16, 6, 6};
    public static final int[] id_aa_ets_signerLocation = {1, 2, 840, 113549, 1, 9, 16, 2, 17};
    public static final int[] id_aa_ets_signerAttr = {1, 2, 840, 113549, 1, 9, 16, 2, 18};
    public static final ATTRIBUTE_CLASS otherSigningCertificate = new ATTRIBUTE_CLASS(new OtherSigningCertificate(), new Asn1ObjectIdentifier(ALL_PKIX1Explicit88Values.id_aa_ets_otherSigCert));
    public static final SIG_POLICY_QUALIFIER[] SupportedSigPolicyQualifiers = new SIG_POLICY_QUALIFIER[0];

    static {
        int[] iArr = {1, 2, 840, 113549, 1, 9, 16, 2, 15};
        id_aa_ets_sigPolicyId = iArr;
        int[] iArr2 = {1, 2, 840, 113549, 1, 9, 16, 2, 20};
        id_aa_ets_contentTimestamp = iArr2;
        int[] iArr3 = {1, 2, 840, 113549, 1, 9, 16, 2, 14};
        id_aa_signatureTimeStampToken = iArr3;
        int[] iArr4 = {1, 2, 840, 113549, 1, 9, 16, 2, 21};
        id_aa_ets_certificateRefs = iArr4;
        int[] iArr5 = {1, 2, 840, 113549, 1, 9, 16, 2, 22};
        id_aa_ets_revocationRefs = iArr5;
        int[] iArr6 = {1, 2, 840, 113549, 1, 9, 16, 2, 23};
        id_aa_ets_certValues = iArr6;
        int[] iArr7 = {1, 2, 840, 113549, 1, 9, 16, 2, 24};
        id_aa_ets_revocationValues = iArr7;
        int[] iArr8 = {1, 2, 840, 113549, 1, 9, 16, 2, 25};
        id_aa_ets_escTimeStamp = iArr8;
        int[] iArr9 = {1, 2, 840, 113549, 1, 9, 16, 2, 26};
        id_aa_ets_certCRLTimestamp = iArr9;
        int[] iArr10 = {1, 2, 840, 113549, 1, 9, 16, 2, 27};
        id_aa_ets_archiveTimestamp = iArr10;
        certificateRefs = new ATTRIBUTE_CLASS(new CompleteCertificateRefs(), new Asn1ObjectIdentifier(iArr4));
        revocationRefs = new ATTRIBUTE_CLASS(new CompleteRevocationRefs(), new Asn1ObjectIdentifier(iArr5));
        certValues = new ATTRIBUTE_CLASS(new CertificateValues(), new Asn1ObjectIdentifier(iArr6));
        revocationValues = new ATTRIBUTE_CLASS(new RevocationValues(), new Asn1ObjectIdentifier(iArr7));
        sigPolicyId = new ATTRIBUTE_CLASS(new SignaturePolicy(), new Asn1ObjectIdentifier(iArr));
        contentTimestamp = new ATTRIBUTE_CLASS(new TimeStampToken(), new Asn1ObjectIdentifier(iArr2));
        signatureTimeStampToken = new ATTRIBUTE_CLASS(new TimeStampToken(), new Asn1ObjectIdentifier(iArr3));
        escTimeStamp = new ATTRIBUTE_CLASS(new TimeStampToken(), new Asn1ObjectIdentifier(iArr8));
        certCRLTimestamp = new ATTRIBUTE_CLASS(new TimeStampToken(), new Asn1ObjectIdentifier(iArr9));
        archiveTimestamp = new ATTRIBUTE_CLASS(new TimeStampToken(), new Asn1ObjectIdentifier(iArr10));
    }
}
