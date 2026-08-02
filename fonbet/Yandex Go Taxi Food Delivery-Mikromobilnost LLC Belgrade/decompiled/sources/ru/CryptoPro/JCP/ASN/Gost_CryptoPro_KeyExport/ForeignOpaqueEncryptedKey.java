package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_KeyExport;

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

/* loaded from: classes4.dex */
public class ForeignOpaqueEncryptedKey extends Asn1Type {
    public Asn1OctetString encryptedKey;
    public Asn1OctetString macKey;

    public ForeignOpaqueEncryptedKey(byte[] bArr, byte[] bArr2) {
        this.encryptedKey = new Asn1OctetString(bArr);
        this.macKey = new Asn1OctetString(bArr2);
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
        this.encryptedKey = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            Asn1OctetString asn1OctetString2 = new Asn1OctetString();
            this.macKey = asn1OctetString2;
            asn1OctetString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 4)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1OctetString asn1OctetString = this.macKey;
        int encode = this.encryptedKey.encode(asn1BerEncodeBuffer, true) + (asn1OctetString != null ? asn1OctetString.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.encryptedKey = null;
        this.macKey = null;
    }

    public ForeignOpaqueEncryptedKey(Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2) {
        this.encryptedKey = asn1OctetString;
        this.macKey = asn1OctetString2;
    }

    public ForeignOpaqueEncryptedKey(Asn1OctetString asn1OctetString) {
        this.encryptedKey = asn1OctetString;
    }

    public ForeignOpaqueEncryptedKey() {
    }

    public ForeignOpaqueEncryptedKey(byte[] bArr) {
        this.encryptedKey = new Asn1OctetString(bArr);
    }
}
