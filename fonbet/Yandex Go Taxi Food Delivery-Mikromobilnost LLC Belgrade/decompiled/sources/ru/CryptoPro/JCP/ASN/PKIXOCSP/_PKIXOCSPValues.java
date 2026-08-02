package ru.CryptoPro.JCP.ASN.PKIXOCSP;

import com.objsys.asn1j.runtime.Asn1Null;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.EXTENSION_CLASS;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.NULLParams;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIMessage;

/* loaded from: classes4.dex */
public class _PKIXOCSPValues {
    public static final OCSP_RESPONSE_TYPE[] SupportedOCSPResponseTypes;
    public static final int[] id_CryptoPro_ocsp_crl_locator;
    public static final int[] id_CryptoPro_ocsp_historical_request;
    public static final int[] id_CryptoPro_ocsp_instant_revocation_indicator;
    public static final int[] id_CryptoPro_ocsp_revocation_announcement_reference;
    public static final int[] id_CryptoPro_ocsp_treats_exp_key_or_exp_cert_rev;
    public static final int[] id_pkix_ocsp_archive_cutoff;
    public static final int[] id_pkix_ocsp_basic;
    public static final int[] id_pkix_ocsp_crl;
    public static final int[] id_pkix_ocsp_nocheck;
    public static final int[] id_pkix_ocsp_response;
    public static final int[] id_pkix_ocsp_service_locator;
    public static final EXTENSION_CLASS ocspArchiveCutoff;
    public static final OCSP_RESPONSE_TYPE ocspBasicResponse;
    public static final EXTENSION_CLASS ocspCRLLocator;
    public static final EXTENSION_CLASS ocspCrl;
    public static final EXTENSION_CLASS ocspHistoricalRequest;
    public static final EXTENSION_CLASS ocspInstantRevocationAnnouncementReference;
    public static final EXTENSION_CLASS ocspInstantRevocationIndicator;
    public static final EXTENSION_CLASS ocspNoCheck;
    public static final EXTENSION_CLASS ocspResponse;
    public static final EXTENSION_CLASS ocspServiceLocator;
    public static final EXTENSION_CLASS ocspTreatsExpKeyOrExpCertRev;
    public static final int[] id_kp_OCSPSigning = {1, 3, 6, 1, 5, 5, 7, 3, 9};
    public static final int[] id_pkix_ocsp = {1, 3, 6, 1, 5, 5, 7, 48, 1};
    public static final int[] id_pkix_ocsp_nonce = {1, 3, 6, 1, 5, 5, 7, 48, 1, 2};

    static {
        int[] iArr = {1, 3, 6, 1, 5, 5, 7, 48, 1, 1};
        id_pkix_ocsp_basic = iArr;
        int[] iArr2 = {1, 3, 6, 1, 5, 5, 7, 48, 1, 3};
        id_pkix_ocsp_crl = iArr2;
        int[] iArr3 = {1, 3, 6, 1, 5, 5, 7, 48, 1, 4};
        id_pkix_ocsp_response = iArr3;
        int[] iArr4 = {1, 3, 6, 1, 5, 5, 7, 48, 1, 5};
        id_pkix_ocsp_nocheck = iArr4;
        int[] iArr5 = {1, 3, 6, 1, 5, 5, 7, 48, 1, 6};
        id_pkix_ocsp_archive_cutoff = iArr5;
        int[] iArr6 = {1, 3, 6, 1, 5, 5, 7, 48, 1, 7};
        id_pkix_ocsp_service_locator = iArr6;
        int[] iArr7 = {1, 2, 643, 2, 2, 47, 1};
        id_CryptoPro_ocsp_treats_exp_key_or_exp_cert_rev = iArr7;
        int[] iArr8 = {1, 2, 643, 2, 2, 47, 2};
        id_CryptoPro_ocsp_crl_locator = iArr8;
        int[] iArr9 = {1, 2, 643, 2, 2, 47, 3};
        id_CryptoPro_ocsp_instant_revocation_indicator = iArr9;
        int[] iArr10 = {1, 2, 643, 2, 2, 47, 4};
        id_CryptoPro_ocsp_revocation_announcement_reference = iArr10;
        int[] iArr11 = {1, 2, 643, 2, 2, 47, 5};
        id_CryptoPro_ocsp_historical_request = iArr11;
        ocspCrl = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr2), new CrlID());
        ocspHistoricalRequest = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr11), new CrlID());
        ocspResponse = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr3), new AcceptableResponses());
        ocspNoCheck = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr4), new NULLParams());
        ocspArchiveCutoff = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr5), new ArchiveCutoff());
        ocspServiceLocator = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr6), new ServiceLocator());
        ocspCRLLocator = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr8), new CrlLocator());
        ocspInstantRevocationIndicator = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr9), new PKIMessage());
        ocspInstantRevocationAnnouncementReference = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr10), new PKIMessage());
        ocspTreatsExpKeyOrExpCertRev = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr7), new Asn1Null());
        OCSP_RESPONSE_TYPE ocsp_response_type = new OCSP_RESPONSE_TYPE(new BasicOCSPResponse(), new Asn1ObjectIdentifier(iArr));
        ocspBasicResponse = ocsp_response_type;
        SupportedOCSPResponseTypes = new OCSP_RESPONSE_TYPE[]{ocsp_response_type};
    }
}
