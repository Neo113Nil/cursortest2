package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import java.io.IOException;

/* loaded from: classes4.dex */
public class AS_REP extends KDC_REP {
    public static final Asn1Tag TAG = new Asn1Tag(64, 32, 11);

    public AS_REP() {
    }

    @Override // ru.CryptoPro.JCP.ASN.KRB5.KDC_REP, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        super.decode(asn1BerDecodeBuffer, true, i);
    }

    @Override // ru.CryptoPro.JCP.ASN.KRB5.KDC_REP, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = super.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encode) + encode : encode;
    }

    public AS_REP(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, _SeqOfPA_DATA _seqofpa_data, Realm realm, PrincipalName principalName, Ticket ticket, EncryptedData encryptedData) {
        super(asn1Integer, asn1Integer2, _seqofpa_data, realm, principalName, ticket, encryptedData);
    }

    public AS_REP(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, Realm realm, PrincipalName principalName, Ticket ticket, EncryptedData encryptedData) {
        super(asn1Integer, asn1Integer2, realm, principalName, ticket, encryptedData);
    }

    public AS_REP(long j, long j2, _SeqOfPA_DATA _seqofpa_data, String str, PrincipalName principalName, Ticket ticket, EncryptedData encryptedData) {
        super(j, j2, _seqofpa_data, str, principalName, ticket, encryptedData);
    }

    public AS_REP(long j, long j2, String str, PrincipalName principalName, Ticket ticket, EncryptedData encryptedData) {
        super(j, j2, str, principalName, ticket, encryptedData);
    }
}
