package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Key;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_MAC;

/* loaded from: classes4.dex */
public class GostPrivateMasks extends Asn1Type {
    public Gost28147_89_MAC hmacRandom;
    public Gost28147_89_Key mask;
    public Asn1OctetString randomStatus;

    public GostPrivateMasks(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.mask = new Gost28147_89_Key(bArr);
        this.randomStatus = new Asn1OctetString(bArr2);
        this.hmacRandom = new Gost28147_89_MAC(bArr3);
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
        Gost28147_89_Key gost28147_89_Key = new Gost28147_89_Key();
        this.mask = gost28147_89_Key;
        gost28147_89_Key.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.randomStatus = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (this.randomStatus.getLength() < 12 || this.randomStatus.getLength() > 16) {
            throw new Asn1ConsVioException("randomStatus.getLength()", this.randomStatus.getLength());
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Gost28147_89_MAC gost28147_89_MAC = new Gost28147_89_MAC();
        this.hmacRandom = gost28147_89_MAC;
        gost28147_89_MAC.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 4)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.hmacRandom.encode(asn1BerEncodeBuffer, true);
        if (this.randomStatus.getLength() < 12 || this.randomStatus.getLength() > 16) {
            throw new Asn1ConsVioException("randomStatus.getLength()", this.randomStatus.getLength());
        }
        int encode2 = this.mask.encode(asn1BerEncodeBuffer, true) + this.randomStatus.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.mask = null;
        this.randomStatus = null;
        this.hmacRandom = null;
    }

    public GostPrivateMasks(Gost28147_89_Key gost28147_89_Key, Asn1OctetString asn1OctetString, Gost28147_89_MAC gost28147_89_MAC) {
        this.mask = gost28147_89_Key;
        this.randomStatus = asn1OctetString;
        this.hmacRandom = gost28147_89_MAC;
    }

    public GostPrivateMasks() {
    }
}
