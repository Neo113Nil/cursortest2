package ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PBECryptoProGostParameters extends Asn1Type {
    public Asn1Integer iterationCount;
    public Asn1OctetString iv;
    public Asn1OctetString salt;

    public PBECryptoProGostParameters(byte[] bArr, long j, byte[] bArr2) {
        this.salt = new Asn1OctetString(bArr);
        this.iterationCount = new Asn1Integer(j);
        this.iv = new Asn1OctetString(bArr2);
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
        if (this.salt.getLength() != 16) {
            throw new Asn1ConsVioException("salt.getLength()", this.salt.getLength());
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.iterationCount = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString2 = new Asn1OctetString();
        this.iv = asn1OctetString2;
        asn1OctetString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (this.iv.getLength() != 8) {
            throw new Asn1ConsVioException("iv.getLength()", this.iv.getLength());
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 0, (short) 0, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (this.iv.getLength() != 8) {
            throw new Asn1ConsVioException("iv.getLength()", this.iv.getLength());
        }
        int encode = this.iterationCount.encode(asn1BerEncodeBuffer, true) + this.iv.encode(asn1BerEncodeBuffer, true);
        if (this.salt.getLength() != 16) {
            throw new Asn1ConsVioException("salt.getLength()", this.salt.getLength());
        }
        int encode2 = this.salt.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.salt = null;
        this.iterationCount = null;
        this.iv = null;
    }

    public PBECryptoProGostParameters(Asn1OctetString asn1OctetString, Asn1Integer asn1Integer, Asn1OctetString asn1OctetString2) {
        this.salt = asn1OctetString;
        this.iterationCount = asn1Integer;
        this.iv = asn1OctetString2;
    }

    public PBECryptoProGostParameters() {
    }
}
