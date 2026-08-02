package ru.CryptoPro.JCP.ASN.Gost_xmldsig;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_EncryptedKey;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.Gost28147_89_KeyWrapParameters;

/* loaded from: classes4.dex */
public class GostR3410_KeyWrap extends Asn1Type {
    public Gost28147_89_EncryptedKey encryptedKey;
    public Gost28147_89_KeyWrapParameters encryptedParameters;

    public GostR3410_KeyWrap(Gost28147_89_EncryptedKey gost28147_89_EncryptedKey, Gost28147_89_KeyWrapParameters gost28147_89_KeyWrapParameters) {
        this.encryptedKey = gost28147_89_EncryptedKey;
        this.encryptedParameters = gost28147_89_KeyWrapParameters;
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
        Gost28147_89_EncryptedKey gost28147_89_EncryptedKey = new Gost28147_89_EncryptedKey();
        this.encryptedKey = gost28147_89_EncryptedKey;
        gost28147_89_EncryptedKey.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Gost28147_89_KeyWrapParameters gost28147_89_KeyWrapParameters = new Gost28147_89_KeyWrapParameters();
        this.encryptedParameters = gost28147_89_KeyWrapParameters;
        gost28147_89_KeyWrapParameters.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 32, 16)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.encryptedKey.encode(asn1BerEncodeBuffer, true) + this.encryptedParameters.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.encryptedKey = null;
        this.encryptedParameters = null;
    }

    public GostR3410_KeyWrap() {
    }
}
