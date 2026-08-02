package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class Challenge extends Asn1Type {
    public Asn1OctetString challenge;
    public AlgorithmIdentifier owf;
    public Asn1OctetString witness;

    public Challenge(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2) {
        this.owf = algorithmIdentifier;
        this.witness = new Asn1OctetString(bArr);
        this.challenge = new Asn1OctetString(bArr2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
            this.owf = algorithmIdentifier;
            algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.witness = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString2 = new Asn1OctetString();
        this.challenge = asn1OctetString2;
        asn1OctetString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 4)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.witness.encode(asn1BerEncodeBuffer, true) + this.challenge.encode(asn1BerEncodeBuffer, true);
        AlgorithmIdentifier algorithmIdentifier = this.owf;
        if (algorithmIdentifier != null) {
            encode += algorithmIdentifier.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.owf = null;
        this.witness = null;
        this.challenge = null;
    }

    public Challenge(AlgorithmIdentifier algorithmIdentifier, Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2) {
        this.owf = algorithmIdentifier;
        this.witness = asn1OctetString;
        this.challenge = asn1OctetString2;
    }

    public Challenge(Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2) {
        this.witness = asn1OctetString;
        this.challenge = asn1OctetString2;
    }

    public Challenge() {
    }

    public Challenge(byte[] bArr, byte[] bArr2) {
        this.witness = new Asn1OctetString(bArr);
        this.challenge = new Asn1OctetString(bArr2);
    }
}
