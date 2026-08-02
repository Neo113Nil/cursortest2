package ru.CryptoPro.JCP.ASN.PKIXDVCS;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.ContentInfo;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.CertificateList;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.ESSCertID;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIStatusInfo;
import ru.CryptoPro.JCP.ASN.PKIXOCSP.CertID;
import ru.CryptoPro.JCP.ASN.PKIXOCSP.CertStatus;
import ru.CryptoPro.JCP.ASN.PKIXOCSP.OCSPResponse;
import ru.CryptoPro.JCP.ASN.SecureMimeMessageV3.SMIMECapabilities;
import ru.cprocsp.ACSP.tools.store.util.IUtilHelper;

/* loaded from: classes4.dex */
public class CertEtcToken extends Asn1Choice {
    public static final byte _ASSERTION = 5;
    public static final byte _CAPABILITIES = 10;
    public static final byte _CERTIFICATE = 2;
    public static final byte _CRL = 6;
    public static final byte _ESSCERTID = 3;
    public static final byte _EXTENSION = 1;
    public static final byte _OCSPCERTSTATUS = 7;
    public static final byte _OSCPCERTID = 8;
    public static final byte _OSCPRESPONSE = 9;
    public static final byte _PKISTATUS = 4;

    public CertEtcToken(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 32, 16)) {
            asn1BerDecodeBuffer.reset();
            setElement(1, new Extension());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 0)) {
            setElement(2, new Certificate());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 1)) {
            setElement(3, new ESSCertID());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 2)) {
            setElement(4, new PKIStatusInfo());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 3)) {
            setElement(5, new ContentInfo());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 4)) {
            setElement(6, new CertificateList());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 5)) {
            setElement(7, new CertStatus());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 6)) {
            setElement(8, new CertID());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (h.equals((short) 128, (short) 32, 7)) {
            setElement(9, new OCSPResponse());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 32, 8)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(10, new SMIMECapabilities());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        switch (this.choiceID) {
            case 1:
                return ((Extension) getElement()).encode(asn1BerEncodeBuffer, true);
            case 2:
                encode = ((Certificate) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode);
                break;
            case 3:
                encode = ((ESSCertID) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode);
                break;
            case 4:
                encode = ((PKIStatusInfo) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode);
                break;
            case 5:
                encode = ((ContentInfo) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode);
                break;
            case 6:
                encode = ((CertificateList) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode);
                break;
            case 7:
                encode = ((CertStatus) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode);
                break;
            case 8:
                encode = ((CertID) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode);
                break;
            case 9:
                encode = ((OCSPResponse) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode);
                break;
            case 10:
                encode = ((SMIMECapabilities) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode);
                break;
            default:
                x8e.b();
                return 0;
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        switch (this.choiceID) {
            case 1:
                return "extension";
            case 2:
                return "certificate";
            case 3:
                return "esscertid";
            case 4:
                return "pkistatus";
            case 5:
                return "assertion";
            case 6:
                return IUtilHelper.STORAGE_FILE_CRL;
            case 7:
                return "ocspcertstatus";
            case 8:
                return "oscpcertid";
            case 9:
                return "oscpresponse";
            case 10:
                return "capabilities";
            default:
                return "UNDEFINED";
        }
    }

    public void set_assertion(ContentInfo contentInfo) {
        setElement(5, contentInfo);
    }

    public void set_capabilities(SMIMECapabilities sMIMECapabilities) {
        setElement(10, sMIMECapabilities);
    }

    public void set_certificate(Certificate certificate) {
        setElement(2, certificate);
    }

    public void set_crl(CertificateList certificateList) {
        setElement(6, certificateList);
    }

    public void set_esscertid(ESSCertID eSSCertID) {
        setElement(3, eSSCertID);
    }

    public void set_extension(Extension extension) {
        setElement(1, extension);
    }

    public void set_ocspcertstatus(CertStatus certStatus) {
        setElement(7, certStatus);
    }

    public void set_oscpcertid(CertID certID) {
        setElement(8, certID);
    }

    public void set_oscpresponse(OCSPResponse oCSPResponse) {
        setElement(9, oCSPResponse);
    }

    public void set_pkistatus(PKIStatusInfo pKIStatusInfo) {
        setElement(4, pKIStatusInfo);
    }

    public CertEtcToken() {
    }
}
