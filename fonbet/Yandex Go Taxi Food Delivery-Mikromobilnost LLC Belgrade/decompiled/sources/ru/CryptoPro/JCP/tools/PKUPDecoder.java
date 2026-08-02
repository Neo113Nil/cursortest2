package ru.CryptoPro.JCP.tools;

import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.security.KeyManagementException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.ALL_CertificateExtensionsValues;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PrivateKeyUsagePeriod;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.PrivateKeyTimeValidityControlMode;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public class PKUPDecoder {
    public static void a(byte[] bArr, PrivateKeyUsagePeriod privateKeyUsagePeriod) {
        try {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            asn1OctetString.decode(new Asn1DerDecodeBuffer(bArr));
            privateKeyUsagePeriod.decode(new Asn1DerDecodeBuffer(asn1OctetString.value));
        } catch (Exception e) {
            throw new KeyManagementException(e);
        }
    }

    public static boolean decodeExtension(Extension extension, PrivateKeyUsagePeriod privateKeyUsagePeriod) {
        if (extension == null) {
            return true;
        }
        try {
            privateKeyUsagePeriod.decode(new Asn1DerDecodeBuffer(extension.extnValue.value));
            return true;
        } catch (Exception e) {
            try {
                throw new KeyManagementException(e);
            } catch (Exception e2) {
                JCPLogger.subThrown(e2);
                return false;
            }
        }
    }

    public static byte[] getPrivateKeyUsagePeriodFromCertificate(Certificate certificate) {
        return ((X509Certificate) certificate).getExtensionValue(new OID(ALL_CertificateExtensionsValues.id_ce_privateKeyUsagePeriod).toString());
    }

    public static boolean decodeExtension(Certificate certificate, PrivateKeyUsagePeriod privateKeyUsagePeriod) {
        if (certificate == null) {
            return true;
        }
        try {
            a(getPrivateKeyUsagePeriodFromCertificate(certificate), privateKeyUsagePeriod);
            return true;
        } catch (Exception e) {
            JCPLogger.subThrown(e);
            return false;
        }
    }

    public static boolean decodeExtension(Extension extension, PrivateKeyTimeValidityControlMode privateKeyTimeValidityControlMode) {
        if (extension == null) {
            return true;
        }
        try {
            privateKeyTimeValidityControlMode.decode(new Asn1DerDecodeBuffer(extension.extnValue.value));
            return true;
        } catch (Exception e) {
            try {
                throw new KeyManagementException(e);
            } catch (Exception e2) {
                JCPLogger.subThrown(e2);
                return false;
            }
        }
    }

    public static boolean decodeExtension(byte[] bArr, PrivateKeyUsagePeriod privateKeyUsagePeriod) {
        if (bArr == null) {
            return true;
        }
        try {
            a(bArr, privateKeyUsagePeriod);
            return true;
        } catch (Exception e) {
            JCPLogger.subThrown(e);
            return false;
        }
    }
}
