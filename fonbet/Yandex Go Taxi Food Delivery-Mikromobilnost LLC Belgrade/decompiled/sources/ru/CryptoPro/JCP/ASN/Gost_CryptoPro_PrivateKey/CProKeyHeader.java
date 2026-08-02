package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

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

/* loaded from: classes4.dex */
public class CProKeyHeader extends Asn1Type {
    public Asn1BitString signature;
    public AlgorithmIdentifier signatureAlgorithm;
    public TBSCProKeyHeader tbsCProKeyHeader;

    public CProKeyHeader(TBSCProKeyHeader tBSCProKeyHeader, AlgorithmIdentifier algorithmIdentifier, Asn1BitString asn1BitString) {
        this.tbsCProKeyHeader = tBSCProKeyHeader;
        this.signatureAlgorithm = algorithmIdentifier;
        this.signature = asn1BitString;
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
        TBSCProKeyHeader tBSCProKeyHeader = new TBSCProKeyHeader();
        this.tbsCProKeyHeader = tBSCProKeyHeader;
        tBSCProKeyHeader.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
            this.signatureAlgorithm = algorithmIdentifier;
            algorithmIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            Asn1BitString asn1BitString = new Asn1BitString();
            this.signature = asn1BitString;
            asn1BitString.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 0, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1BitString asn1BitString = this.signature;
        if (asn1BitString != null) {
            int encode = asn1BitString.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode) + encode;
        } else {
            i = 0;
        }
        AlgorithmIdentifier algorithmIdentifier = this.signatureAlgorithm;
        if (algorithmIdentifier != null) {
            int encode2 = algorithmIdentifier.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode2);
        }
        int encode3 = this.tbsCProKeyHeader.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.tbsCProKeyHeader = null;
        this.signatureAlgorithm = null;
        this.signature = null;
    }

    public CProKeyHeader() {
    }

    public CProKeyHeader(TBSCProKeyHeader tBSCProKeyHeader) {
        this.tbsCProKeyHeader = tBSCProKeyHeader;
    }
}
