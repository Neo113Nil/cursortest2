package ru.CryptoPro.JCP.ASN.PKIXCRMF;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class PBMParameter extends Asn1Type {
    public Asn1Integer iterationCount;
    public AlgorithmIdentifier mac;
    public AlgorithmIdentifier owf;
    public Asn1OctetString salt;

    public PBMParameter(byte[] bArr, AlgorithmIdentifier algorithmIdentifier, long j, AlgorithmIdentifier algorithmIdentifier2) {
        this.salt = new Asn1OctetString(bArr);
        this.owf = algorithmIdentifier;
        this.iterationCount = new Asn1Integer(j);
        this.mac = algorithmIdentifier2;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.salt = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
        this.owf = algorithmIdentifier;
        algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.iterationCount = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier();
        this.mac = algorithmIdentifier2;
        algorithmIdentifier2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.salt.encode(asn1BerEncodeBuffer, true) + this.owf.encode(asn1BerEncodeBuffer, true) + this.iterationCount.encode(asn1BerEncodeBuffer, true) + this.mac.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.salt = null;
        this.owf = null;
        this.iterationCount = null;
        this.mac = null;
    }

    public PBMParameter(Asn1OctetString asn1OctetString, AlgorithmIdentifier algorithmIdentifier, Asn1Integer asn1Integer, AlgorithmIdentifier algorithmIdentifier2) {
        this.salt = asn1OctetString;
        this.owf = algorithmIdentifier;
        this.iterationCount = asn1Integer;
        this.mac = algorithmIdentifier2;
    }

    public PBMParameter() {
    }
}
