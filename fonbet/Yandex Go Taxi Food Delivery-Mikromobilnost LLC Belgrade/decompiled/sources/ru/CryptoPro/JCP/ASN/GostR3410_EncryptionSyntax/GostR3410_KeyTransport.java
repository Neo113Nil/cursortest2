package ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax;

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

/* loaded from: classes4.dex */
public class GostR3410_KeyTransport extends Asn1Type {
    public Gost28147_89_EncryptedKey sessionEncryptedKey;
    public GostR3410_TransportParameters transportParameters;

    public GostR3410_KeyTransport(Gost28147_89_EncryptedKey gost28147_89_EncryptedKey, GostR3410_TransportParameters gostR3410_TransportParameters) {
        this.sessionEncryptedKey = gost28147_89_EncryptedKey;
        this.transportParameters = gostR3410_TransportParameters;
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
        this.sessionEncryptedKey = gost28147_89_EncryptedKey;
        gost28147_89_EncryptedKey.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            GostR3410_TransportParameters gostR3410_TransportParameters = new GostR3410_TransportParameters();
            this.transportParameters = gostR3410_TransportParameters;
            gostR3410_TransportParameters.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 32, 0)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        GostR3410_TransportParameters gostR3410_TransportParameters = this.transportParameters;
        int i = 0;
        if (gostR3410_TransportParameters != null) {
            int encode = gostR3410_TransportParameters.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode) + encode;
        }
        int encode2 = this.sessionEncryptedKey.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.sessionEncryptedKey = null;
        this.transportParameters = null;
    }

    public GostR3410_KeyTransport() {
    }

    public GostR3410_KeyTransport(Gost28147_89_EncryptedKey gost28147_89_EncryptedKey) {
        this.sessionEncryptedKey = gost28147_89_EncryptedKey;
    }
}
