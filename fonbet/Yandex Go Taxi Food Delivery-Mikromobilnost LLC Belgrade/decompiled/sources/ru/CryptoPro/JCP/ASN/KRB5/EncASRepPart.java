package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import java.io.IOException;

/* loaded from: classes4.dex */
public class EncASRepPart extends EncKDCRepPart {
    public static final Asn1Tag TAG = new Asn1Tag(64, 32, 25);

    public EncASRepPart() {
    }

    @Override // ru.CryptoPro.JCP.ASN.KRB5.EncKDCRepPart, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        super.decode(asn1BerDecodeBuffer, true, i);
    }

    @Override // ru.CryptoPro.JCP.ASN.KRB5.EncKDCRepPart, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = super.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encode) + encode : encode;
    }

    public EncASRepPart(EncryptionKey encryptionKey, LastReq lastReq, Asn1Integer asn1Integer, KerberosTime kerberosTime, TicketFlags ticketFlags, KerberosTime kerberosTime2, KerberosTime kerberosTime3, KerberosTime kerberosTime4, KerberosTime kerberosTime5, Realm realm, PrincipalName principalName, HostAddresses hostAddresses) {
        super(encryptionKey, lastReq, asn1Integer, kerberosTime, ticketFlags, kerberosTime2, kerberosTime3, kerberosTime4, kerberosTime5, realm, principalName, hostAddresses);
    }

    public EncASRepPart(EncryptionKey encryptionKey, LastReq lastReq, Asn1Integer asn1Integer, TicketFlags ticketFlags, KerberosTime kerberosTime, KerberosTime kerberosTime2, Realm realm, PrincipalName principalName) {
        super(encryptionKey, lastReq, asn1Integer, ticketFlags, kerberosTime, kerberosTime2, realm, principalName);
    }

    public EncASRepPart(EncryptionKey encryptionKey, LastReq lastReq, long j, String str, TicketFlags ticketFlags, String str2, String str3, String str4, String str5, String str6, PrincipalName principalName, HostAddresses hostAddresses) {
        super(encryptionKey, lastReq, j, str, ticketFlags, str2, str3, str4, str5, str6, principalName, hostAddresses);
    }

    public EncASRepPart(EncryptionKey encryptionKey, LastReq lastReq, long j, TicketFlags ticketFlags, String str, String str2, String str3, PrincipalName principalName) {
        super(encryptionKey, lastReq, j, ticketFlags, str, str2, str3, principalName);
    }
}
