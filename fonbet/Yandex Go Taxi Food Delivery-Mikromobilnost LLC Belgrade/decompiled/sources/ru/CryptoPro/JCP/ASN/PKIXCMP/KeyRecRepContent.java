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
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate;

/* loaded from: classes4.dex */
public class KeyRecRepContent extends Asn1Type {
    public KeyRecRepContent_caCerts caCerts;
    public KeyRecRepContent_keyPairHist keyPairHist;
    public Certificate newSigCert;
    public PKIStatusInfo status;

    public KeyRecRepContent(PKIStatusInfo pKIStatusInfo, Certificate certificate, KeyRecRepContent_caCerts keyRecRepContent_caCerts, KeyRecRepContent_keyPairHist keyRecRepContent_keyPairHist) {
        this.status = pKIStatusInfo;
        this.newSigCert = certificate;
        this.caCerts = keyRecRepContent_caCerts;
        this.keyPairHist = keyRecRepContent_keyPairHist;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PKIStatusInfo pKIStatusInfo = new PKIStatusInfo();
        this.status = pKIStatusInfo;
        pKIStatusInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            Certificate certificate = new Certificate();
            this.newSigCert = certificate;
            certificate.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, false)) {
            KeyRecRepContent_caCerts keyRecRepContent_caCerts = new KeyRecRepContent_caCerts();
            this.caCerts = keyRecRepContent_caCerts;
            keyRecRepContent_caCerts.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, false)) {
            KeyRecRepContent_keyPairHist keyRecRepContent_keyPairHist = new KeyRecRepContent_keyPairHist();
            this.keyPairHist = keyRecRepContent_keyPairHist;
            keyRecRepContent_keyPairHist.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        KeyRecRepContent_keyPairHist keyRecRepContent_keyPairHist = this.keyPairHist;
        int encode = keyRecRepContent_keyPairHist != null ? keyRecRepContent_keyPairHist.encode(asn1BerEncodeBuffer, true) : 0;
        KeyRecRepContent_caCerts keyRecRepContent_caCerts = this.caCerts;
        if (keyRecRepContent_caCerts != null) {
            encode += keyRecRepContent_caCerts.encode(asn1BerEncodeBuffer, true);
        }
        Certificate certificate = this.newSigCert;
        if (certificate != null) {
            int encode2 = certificate.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode2);
        }
        int encode3 = this.status.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.status = null;
        this.newSigCert = null;
        this.caCerts = null;
        this.keyPairHist = null;
    }

    public KeyRecRepContent() {
    }

    public KeyRecRepContent(PKIStatusInfo pKIStatusInfo) {
        this.status = pKIStatusInfo;
    }
}
