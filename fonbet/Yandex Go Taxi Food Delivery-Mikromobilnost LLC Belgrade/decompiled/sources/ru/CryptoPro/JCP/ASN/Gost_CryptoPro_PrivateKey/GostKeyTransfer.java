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
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_MAC;

/* loaded from: classes4.dex */
public class GostKeyTransfer extends Asn1Type {
    public Gost28147_89_MAC hmacKeyTransferContent;
    public GostKeyTransferContent keyTransferContent;

    public GostKeyTransfer(GostKeyTransferContent gostKeyTransferContent, byte[] bArr) {
        this.keyTransferContent = gostKeyTransferContent;
        this.hmacKeyTransferContent = new Gost28147_89_MAC(bArr);
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
        GostKeyTransferContent gostKeyTransferContent = new GostKeyTransferContent();
        this.keyTransferContent = gostKeyTransferContent;
        gostKeyTransferContent.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Gost28147_89_MAC gost28147_89_MAC = new Gost28147_89_MAC();
        this.hmacKeyTransferContent = gost28147_89_MAC;
        gost28147_89_MAC.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 4)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.keyTransferContent.encode(asn1BerEncodeBuffer, true) + this.hmacKeyTransferContent.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.keyTransferContent = null;
        this.hmacKeyTransferContent = null;
    }

    public GostKeyTransfer(GostKeyTransferContent gostKeyTransferContent, Gost28147_89_MAC gost28147_89_MAC) {
        this.keyTransferContent = gostKeyTransferContent;
        this.hmacKeyTransferContent = gost28147_89_MAC;
    }

    public GostKeyTransfer() {
    }
}
