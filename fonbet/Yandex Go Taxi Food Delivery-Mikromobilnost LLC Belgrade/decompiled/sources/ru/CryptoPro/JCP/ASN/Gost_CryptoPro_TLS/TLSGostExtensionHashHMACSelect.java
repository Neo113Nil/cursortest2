package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_TLS;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class TLSGostExtensionHashHMACSelect extends Asn1Type {
    public AlgorithmIdentifier hashAlgorithm;
    public AlgorithmIdentifier hmacAlgorithm;
    public AlgorithmIdentifier prfAlgorithm;

    public TLSGostExtensionHashHMACSelect(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, AlgorithmIdentifier algorithmIdentifier3) {
        this.hashAlgorithm = algorithmIdentifier;
        this.hmacAlgorithm = algorithmIdentifier2;
        this.prfAlgorithm = algorithmIdentifier3;
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
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
        this.hashAlgorithm = algorithmIdentifier;
        algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier();
        this.hmacAlgorithm = algorithmIdentifier2;
        algorithmIdentifier2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AlgorithmIdentifier algorithmIdentifier3 = new AlgorithmIdentifier();
        this.prfAlgorithm = algorithmIdentifier3;
        algorithmIdentifier3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 32, 16)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.hashAlgorithm.encode(asn1BerEncodeBuffer, true) + this.hmacAlgorithm.encode(asn1BerEncodeBuffer, true) + this.prfAlgorithm.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.hashAlgorithm = null;
        this.hmacAlgorithm = null;
        this.prfAlgorithm = null;
    }

    public TLSGostExtensionHashHMACSelect() {
    }
}
