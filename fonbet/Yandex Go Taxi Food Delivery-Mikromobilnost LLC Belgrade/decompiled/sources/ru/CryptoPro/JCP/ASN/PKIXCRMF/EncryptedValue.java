package ru.CryptoPro.JCP.ASN.PKIXCRMF;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class EncryptedValue extends Asn1Type {
    public Asn1BitString encSymmKey;
    public Asn1BitString encValue;
    public AlgorithmIdentifier intendedAlg;
    public AlgorithmIdentifier keyAlg;
    public AlgorithmIdentifier symmAlg;
    public Asn1OctetString valueHint;

    public EncryptedValue(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, Asn1BitString asn1BitString, AlgorithmIdentifier algorithmIdentifier3, byte[] bArr, Asn1BitString asn1BitString2) {
        this.intendedAlg = algorithmIdentifier;
        this.symmAlg = algorithmIdentifier2;
        this.encSymmKey = asn1BitString;
        this.keyAlg = algorithmIdentifier3;
        this.valueHint = new Asn1OctetString(bArr);
        this.encValue = asn1BitString2;
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
            this.intendedAlg = algorithmIdentifier;
            algorithmIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier();
            this.symmAlg = algorithmIdentifier2;
            algorithmIdentifier2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 2, intHolder, true)) {
            Asn1BitString asn1BitString = new Asn1BitString();
            this.encSymmKey = asn1BitString;
            asn1BitString.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            AlgorithmIdentifier algorithmIdentifier3 = new AlgorithmIdentifier();
            this.keyAlg = algorithmIdentifier3;
            algorithmIdentifier3.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 4, intHolder, true)) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            this.valueHint = asn1OctetString;
            asn1OctetString.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1BitString asn1BitString2 = new Asn1BitString();
        this.encValue = asn1BitString2;
        asn1BitString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 0, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 0, 4) || peekTag.equals((short) 0, (short) 0, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.encValue.encode(asn1BerEncodeBuffer, true);
        Asn1OctetString asn1OctetString = this.valueHint;
        if (asn1OctetString != null) {
            int encode2 = asn1OctetString.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 4, encode2);
        }
        AlgorithmIdentifier algorithmIdentifier = this.keyAlg;
        if (algorithmIdentifier != null) {
            int encode3 = algorithmIdentifier.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode3);
        }
        Asn1BitString asn1BitString = this.encSymmKey;
        if (asn1BitString != null) {
            int encode4 = asn1BitString.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode4);
        }
        AlgorithmIdentifier algorithmIdentifier2 = this.symmAlg;
        if (algorithmIdentifier2 != null) {
            int encode5 = algorithmIdentifier2.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode5);
        }
        AlgorithmIdentifier algorithmIdentifier3 = this.intendedAlg;
        if (algorithmIdentifier3 != null) {
            int encode6 = algorithmIdentifier3.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode6);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.intendedAlg = null;
        this.symmAlg = null;
        this.encSymmKey = null;
        this.keyAlg = null;
        this.valueHint = null;
        this.encValue = null;
    }

    public EncryptedValue(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, Asn1BitString asn1BitString, AlgorithmIdentifier algorithmIdentifier3, Asn1OctetString asn1OctetString, Asn1BitString asn1BitString2) {
        this.intendedAlg = algorithmIdentifier;
        this.symmAlg = algorithmIdentifier2;
        this.encSymmKey = asn1BitString;
        this.keyAlg = algorithmIdentifier3;
        this.valueHint = asn1OctetString;
        this.encValue = asn1BitString2;
    }

    public EncryptedValue(Asn1BitString asn1BitString) {
        this.encValue = asn1BitString;
    }

    public EncryptedValue() {
    }
}
