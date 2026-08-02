package ru.CryptoPro.JCP.ASN.CPPKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Enumerated;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1InvalidEnumException;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PKIAuditType extends Asn1Enumerated {
    public static final int addCertificate = 28;
    public static final int addLicense = 19;
    public static final int addOfficial = 25;
    public static final int addOrganization = 16;
    public static final int addPolicy = 22;
    public static final int affiliation = 10;
    public static final int archiveCert = 7;
    public static final int authorizedPersonStart = 12;
    public static final int cessationCert = 5;
    public static final int changeCertificate = 29;
    public static final int changeLicense = 20;
    public static final int changeOfficial = 26;
    public static final int changeOrganization = 17;
    public static final int changePolicy = 23;
    public static final int deleteCert = 8;
    public static final int deleteCertificate = 30;
    public static final int deleteKey = 13;
    public static final int deleteLicense = 21;
    public static final int deleteOfficial = 27;
    public static final int deleteOrganization = 18;
    public static final int deletePolicy = 24;
    public static final int newAuthorizedPerson = 11;
    public static final int processCRL = 2;
    public static final int processCert = 1;
    public static final int rejectCert = 3;
    public static final int resumeCert = 6;
    public static final int revokeCert = 4;
    public static final int startSession = 9;
    public static final int startSessionNewPin = 15;
    public static final int stopSession = 14;
    public static final int unspecified = 0;

    public PKIAuditType() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1Enumerated, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        int i2 = this.value;
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7 && i2 != 8 && i2 != 9 && i2 != 10 && i2 != 11 && i2 != 12 && i2 != 13 && i2 != 14 && i2 != 15 && i2 != 16 && i2 != 17 && i2 != 18 && i2 != 19 && i2 != 20 && i2 != 21 && i2 != 22 && i2 != 23 && i2 != 24 && i2 != 25 && i2 != 26 && i2 != 27 && i2 != 28 && i2 != 29 && i2 != 30) {
            throw new Asn1InvalidEnumException(this.value);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Enumerated, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = this.value;
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17 || i == 18 || i == 19 || i == 20 || i == 21 || i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 27 || i == 28 || i == 29 || i == 30) {
            return super.encode(asn1BerEncodeBuffer, z);
        }
        throw new Asn1InvalidEnumException(this.value);
    }

    public PKIAuditType(int i) {
        super(i);
    }
}
