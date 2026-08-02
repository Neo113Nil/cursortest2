package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import ru.CryptoPro.JCP.ASN.PKIXDVCS._PKIXDVCSValues;
import ru.CryptoPro.JCP.ASN.PKIXTSP._PKIXTSPValues;

/* loaded from: classes4.dex */
public class _CryptographicMessageSyntaxValues {
    public static final CONTENT_TYPE[] SupportedContentTypes;
    public static final ECONTENT_TYPE[] SupportedEContentTypes;
    public static final CONTENT_TYPE authData;
    public static final CONTENT_TYPE contentInfo;
    public static final CONTENT_TYPE digestedData;
    public static final ECONTENT_TYPE e_authData;
    public static final ECONTENT_TYPE e_contentInfo;
    public static final ECONTENT_TYPE e_digestedData;
    public static final ECONTENT_TYPE e_encryptedData;
    public static final ECONTENT_TYPE e_envelopedData;
    public static final ECONTENT_TYPE e_signedData;
    public static final CONTENT_TYPE encryptedData;
    public static final CONTENT_TYPE envelopedData;
    public static final int[] id_ct_authData;
    public static final int[] id_ct_contentInfo;
    public static final int[] id_data;
    public static final int[] id_digestedData;
    public static final int[] id_encryptedData;
    public static final int[] id_envelopedData;
    public static final int[] id_signedData;
    public static final CONTENT_TYPE signedData;
    public static final CONTENT_TYPE simpleData;
    public static final int[] sha_1 = {1, 3, 14, 3, 2, 26};
    public static final int[] md5 = {1, 2, 840, 113549, 2, 5};
    public static final int[] dh_public_number = {1, 2, 840, 10046, 2, 1};
    public static final int[] id_alg_ESDH = {1, 2, 840, 113549, 1, 9, 16, 3, 5};
    public static final int[] id_alg_CMS3DESwrap = {1, 2, 840, 113549, 1, 9, 16, 3, 6};
    public static final int[] id_alg_CMSRC2wrap = {1, 2, 840, 113549, 1, 9, 16, 3, 7};
    public static final int[] des_ede3_cbc = {1, 2, 840, 113549, 3, 7};
    public static final int[] rc2_cbc = {1, 2, 840, 113549, 3, 2};
    public static final int[] hMAC_SHA1 = {1, 3, 6, 1, 5, 5, 8, 1, 2};

    static {
        int[] iArr = {1, 2, 840, 113549, 1, 9, 16, 1, 6};
        id_ct_contentInfo = iArr;
        int[] iArr2 = {1, 2, 840, 113549, 1, 7, 1};
        id_data = iArr2;
        int[] iArr3 = {1, 2, 840, 113549, 1, 7, 2};
        id_signedData = iArr3;
        int[] iArr4 = {1, 2, 840, 113549, 1, 7, 3};
        id_envelopedData = iArr4;
        int[] iArr5 = {1, 2, 840, 113549, 1, 7, 5};
        id_digestedData = iArr5;
        int[] iArr6 = {1, 2, 840, 113549, 1, 7, 6};
        id_encryptedData = iArr6;
        int[] iArr7 = {1, 2, 840, 113549, 1, 9, 16, 1, 2};
        id_ct_authData = iArr7;
        CONTENT_TYPE content_type = new CONTENT_TYPE(new Asn1OctetString(), new Asn1ObjectIdentifier(iArr2));
        simpleData = content_type;
        CONTENT_TYPE content_type2 = new CONTENT_TYPE(new SignedData(), new Asn1ObjectIdentifier(iArr3));
        signedData = content_type2;
        CONTENT_TYPE content_type3 = new CONTENT_TYPE(new EnvelopedData(), new Asn1ObjectIdentifier(iArr4));
        envelopedData = content_type3;
        CONTENT_TYPE content_type4 = new CONTENT_TYPE(new DigestedData(), new Asn1ObjectIdentifier(iArr5));
        digestedData = content_type4;
        CONTENT_TYPE content_type5 = new CONTENT_TYPE(new EncryptedData(), new Asn1ObjectIdentifier(iArr6));
        encryptedData = content_type5;
        CONTENT_TYPE content_type6 = new CONTENT_TYPE(new AuthenticatedData(), new Asn1ObjectIdentifier(iArr7));
        authData = content_type6;
        contentInfo = new CONTENT_TYPE(new ContentInfo(), new Asn1ObjectIdentifier(iArr));
        ECONTENT_TYPE econtent_type = new ECONTENT_TYPE(new SignedData(), new Asn1ObjectIdentifier(iArr3));
        e_signedData = econtent_type;
        ECONTENT_TYPE econtent_type2 = new ECONTENT_TYPE(new EnvelopedData(), new Asn1ObjectIdentifier(iArr4));
        e_envelopedData = econtent_type2;
        ECONTENT_TYPE econtent_type3 = new ECONTENT_TYPE(new DigestedData(), new Asn1ObjectIdentifier(iArr5));
        e_digestedData = econtent_type3;
        ECONTENT_TYPE econtent_type4 = new ECONTENT_TYPE(new EncryptedData(), new Asn1ObjectIdentifier(iArr6));
        e_encryptedData = econtent_type4;
        ECONTENT_TYPE econtent_type5 = new ECONTENT_TYPE(new AuthenticatedData(), new Asn1ObjectIdentifier(iArr7));
        e_authData = econtent_type5;
        e_contentInfo = new ECONTENT_TYPE(new ContentInfo(), new Asn1ObjectIdentifier(iArr));
        SupportedContentTypes = new CONTENT_TYPE[]{content_type, content_type2, content_type3, content_type4, content_type5, content_type6};
        SupportedEContentTypes = new ECONTENT_TYPE[]{econtent_type, econtent_type2, econtent_type3, econtent_type4, econtent_type5, _PKIXTSPValues.e_tstInfo, _PKIXDVCSValues.e_dvcsRequest, _PKIXDVCSValues.e_dvcsResponse};
    }
}
