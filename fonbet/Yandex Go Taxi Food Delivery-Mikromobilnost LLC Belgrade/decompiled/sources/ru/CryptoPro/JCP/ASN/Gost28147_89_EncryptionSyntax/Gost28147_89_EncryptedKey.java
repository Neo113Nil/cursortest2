package ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class Gost28147_89_EncryptedKey extends Asn1Type {
    public Gost28147_89_Key encryptedKey;
    public Gost28147_89_MAC macKey;
    public Gost28147_89_Key maskKey;

    public Gost28147_89_EncryptedKey(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.encryptedKey = new Gost28147_89_Key(bArr);
        this.maskKey = new Gost28147_89_Key(bArr2);
        this.macKey = new Gost28147_89_MAC(bArr3);
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
        this.encryptedKey = gost28147_89_Key;
        gost28147_89_Key.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            Gost28147_89_Key gost28147_89_Key2 = new Gost28147_89_Key();
            this.maskKey = gost28147_89_Key2;
            gost28147_89_Key2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Gost28147_89_MAC gost28147_89_MAC = new Gost28147_89_MAC();
        this.macKey = gost28147_89_MAC;
        gost28147_89_MAC.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (this.macKey.getLength() != 4) {
            throw new Asn1ConsVioException("macKey.getLength()", this.macKey.getLength());
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 128, (short) 0, 0)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (this.macKey.getLength() != 4) {
            throw new Asn1ConsVioException("macKey.getLength()", this.macKey.getLength());
        }
        int encode = this.macKey.encode(asn1BerEncodeBuffer, true);
        Gost28147_89_Key gost28147_89_Key = this.maskKey;
        if (gost28147_89_Key != null) {
            int encode2 = gost28147_89_Key.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2);
        }
        int encode3 = this.encryptedKey.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.encryptedKey = null;
        this.maskKey = null;
        this.macKey = null;
    }

    public Gost28147_89_EncryptedKey(Gost28147_89_Key gost28147_89_Key, Gost28147_89_Key gost28147_89_Key2, Gost28147_89_MAC gost28147_89_MAC) {
        this.encryptedKey = gost28147_89_Key;
        this.maskKey = gost28147_89_Key2;
        this.macKey = gost28147_89_MAC;
    }

    public Gost28147_89_EncryptedKey(Gost28147_89_Key gost28147_89_Key, Gost28147_89_MAC gost28147_89_MAC) {
        this.encryptedKey = gost28147_89_Key;
        this.macKey = gost28147_89_MAC;
    }

    public Gost28147_89_EncryptedKey() {
    }

    public Gost28147_89_EncryptedKey(byte[] bArr, byte[] bArr2) {
        this.encryptedKey = new Gost28147_89_Key(bArr);
        this.macKey = new Gost28147_89_MAC(bArr2);
    }
}
