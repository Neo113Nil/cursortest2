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
public class GostKeyTransportKExp15 extends Asn1Type {
    public Asn1OctetString encryptedKeyData;
    public Asn1OctetString encryptedMac;
    public Asn1OctetString ukm;

    public GostKeyTransportKExp15(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.ukm = new Asn1OctetString(bArr);
        this.encryptedKeyData = new Asn1OctetString(bArr2);
        this.encryptedMac = new Asn1OctetString(bArr3);
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
        this.ukm = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString2 = new Asn1OctetString();
        this.encryptedKeyData = asn1OctetString2;
        asn1OctetString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString3 = new Asn1OctetString();
        this.encryptedMac = asn1OctetString3;
        asn1OctetString3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 4)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.ukm.encode(asn1BerEncodeBuffer, true) + this.encryptedKeyData.encode(asn1BerEncodeBuffer, true) + this.encryptedMac.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.ukm = null;
        this.encryptedKeyData = null;
        this.encryptedMac = null;
    }

    public GostKeyTransportKExp15(Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2, Asn1OctetString asn1OctetString3) {
        this.ukm = asn1OctetString;
        this.encryptedKeyData = asn1OctetString2;
        this.encryptedMac = asn1OctetString3;
    }

    public GostKeyTransportKExp15() {
    }
}
