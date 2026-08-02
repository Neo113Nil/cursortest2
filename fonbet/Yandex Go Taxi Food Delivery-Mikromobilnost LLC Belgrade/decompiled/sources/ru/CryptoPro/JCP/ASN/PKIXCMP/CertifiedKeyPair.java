package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIXCRMF.EncryptedValue;
import ru.CryptoPro.JCP.ASN.PKIXCRMF.PKIPublicationInfo;

/* loaded from: classes4.dex */
public class CertifiedKeyPair extends Asn1Type {
    public CertOrEncCert certOrEncCert;
    public EncryptedValue privateKey;
    public PKIPublicationInfo publicationInfo;

    public CertifiedKeyPair(CertOrEncCert certOrEncCert, EncryptedValue encryptedValue, PKIPublicationInfo pKIPublicationInfo) {
        this.certOrEncCert = certOrEncCert;
        this.privateKey = encryptedValue;
        this.publicationInfo = pKIPublicationInfo;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 128, (short) 32, 0) && !peekTag.equals((short) 128, (short) 32, 1)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertOrEncCert certOrEncCert = new CertOrEncCert();
        this.certOrEncCert = certOrEncCert;
        certOrEncCert.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            EncryptedValue encryptedValue = new EncryptedValue();
            this.privateKey = encryptedValue;
            encryptedValue.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            PKIPublicationInfo pKIPublicationInfo = new PKIPublicationInfo();
            this.publicationInfo = pKIPublicationInfo;
            pKIPublicationInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (peekTag2.equals((short) 128, (short) 32, 0) || peekTag2.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        PKIPublicationInfo pKIPublicationInfo = this.publicationInfo;
        if (pKIPublicationInfo != null) {
            int encode = pKIPublicationInfo.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        } else {
            i = 0;
        }
        EncryptedValue encryptedValue = this.privateKey;
        if (encryptedValue != null) {
            int encode2 = encryptedValue.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode2);
        }
        int encode3 = this.certOrEncCert.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.certOrEncCert = null;
        this.privateKey = null;
        this.publicationInfo = null;
    }

    public CertifiedKeyPair() {
    }

    public CertifiedKeyPair(CertOrEncCert certOrEncCert) {
        this.certOrEncCert = certOrEncCert;
    }
}
