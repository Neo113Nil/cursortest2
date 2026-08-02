package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Key;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_MAC;

/* loaded from: classes4.dex */
public class GostPrivateKeys extends Asn1Type {
    public Gost28147_89_MAC hmacKey;
    public Gost28147_89_Key primaryKey;
    public Gost28147_89_Key secondaryKey;

    public GostPrivateKeys(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.primaryKey = new Gost28147_89_Key(bArr);
        this.secondaryKey = new Gost28147_89_Key(bArr2);
        this.hmacKey = new Gost28147_89_MAC(bArr3);
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
        this.primaryKey = gost28147_89_Key;
        gost28147_89_Key.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            Gost28147_89_Key gost28147_89_Key2 = new Gost28147_89_Key();
            this.secondaryKey = gost28147_89_Key2;
            gost28147_89_Key2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            Gost28147_89_MAC gost28147_89_MAC = new Gost28147_89_MAC();
            this.hmacKey = gost28147_89_MAC;
            gost28147_89_MAC.decode(asn1BerDecodeBuffer, true, intHolder.value);
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
        Gost28147_89_MAC gost28147_89_MAC = this.hmacKey;
        int encode = gost28147_89_MAC != null ? gost28147_89_MAC.encode(asn1BerEncodeBuffer, true) : 0;
        Gost28147_89_Key gost28147_89_Key = this.secondaryKey;
        if (gost28147_89_Key != null) {
            int encode2 = gost28147_89_Key.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2);
        }
        int encode3 = this.primaryKey.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.primaryKey = null;
        this.secondaryKey = null;
        this.hmacKey = null;
    }

    public GostPrivateKeys(Gost28147_89_Key gost28147_89_Key, Gost28147_89_Key gost28147_89_Key2, Gost28147_89_MAC gost28147_89_MAC) {
        this.primaryKey = gost28147_89_Key;
        this.secondaryKey = gost28147_89_Key2;
        this.hmacKey = gost28147_89_MAC;
    }

    public GostPrivateKeys(Gost28147_89_Key gost28147_89_Key) {
        this.primaryKey = gost28147_89_Key;
    }

    public GostPrivateKeys() {
    }

    public GostPrivateKeys(byte[] bArr) {
        this.primaryKey = new Gost28147_89_Key(bArr);
    }
}
