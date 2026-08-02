package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIXCRMF.CertId;

/* loaded from: classes4.dex */
public class OOBCertHash extends Asn1Type {
    public CertId certId;
    public AlgorithmIdentifier hashAlg;
    public Asn1BitString hashVal;

    public OOBCertHash(AlgorithmIdentifier algorithmIdentifier, CertId certId, Asn1BitString asn1BitString) {
        this.hashAlg = algorithmIdentifier;
        this.certId = certId;
        this.hashVal = asn1BitString;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
            this.hashAlg = algorithmIdentifier;
            algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            CertId certId = new CertId();
            this.certId = certId;
            certId.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1BitString asn1BitString = new Asn1BitString();
        this.hashVal = asn1BitString;
        asn1BitString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 0, (short) 0, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.hashVal.encode(asn1BerEncodeBuffer, true);
        CertId certId = this.certId;
        if (certId != null) {
            int encode2 = certId.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode2);
        }
        AlgorithmIdentifier algorithmIdentifier = this.hashAlg;
        if (algorithmIdentifier != null) {
            int encode3 = algorithmIdentifier.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode3);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.hashAlg = null;
        this.certId = null;
        this.hashVal = null;
    }

    public OOBCertHash() {
    }

    public OOBCertHash(Asn1BitString asn1BitString) {
        this.hashVal = asn1BitString;
    }
}
