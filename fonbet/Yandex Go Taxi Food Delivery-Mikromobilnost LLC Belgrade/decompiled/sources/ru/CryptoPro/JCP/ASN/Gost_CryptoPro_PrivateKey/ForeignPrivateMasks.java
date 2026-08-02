package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

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
public class ForeignPrivateMasks extends Asn1Type {
    public Asn1OctetString macRandom;
    public Asn1OctetString primaryIV;
    public Asn1OctetString randomSeed;
    public Asn1OctetString randomStatus;
    public Asn1OctetString secondaryIV;

    public ForeignPrivateMasks(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.randomSeed = new Asn1OctetString(bArr);
        this.randomStatus = new Asn1OctetString(bArr2);
        this.macRandom = new Asn1OctetString(bArr3);
        this.primaryIV = new Asn1OctetString(bArr4);
        this.secondaryIV = new Asn1OctetString(bArr5);
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
        this.randomSeed = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString2 = new Asn1OctetString();
        this.randomStatus = asn1OctetString2;
        asn1OctetString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString3 = new Asn1OctetString();
        this.macRandom = asn1OctetString3;
        asn1OctetString3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            Asn1OctetString asn1OctetString4 = new Asn1OctetString();
            this.primaryIV = asn1OctetString4;
            asn1OctetString4.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            Asn1OctetString asn1OctetString5 = new Asn1OctetString();
            this.secondaryIV = asn1OctetString5;
            asn1OctetString5.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 0, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1OctetString asn1OctetString = this.secondaryIV;
        if (asn1OctetString != null) {
            int encode = asn1OctetString.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode) + encode;
        } else {
            i = 0;
        }
        Asn1OctetString asn1OctetString2 = this.primaryIV;
        if (asn1OctetString2 != null) {
            int encode2 = asn1OctetString2.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2);
        }
        int encode3 = this.randomSeed.encode(asn1BerEncodeBuffer, true) + this.randomStatus.encode(asn1BerEncodeBuffer, true) + this.macRandom.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.randomSeed = null;
        this.randomStatus = null;
        this.macRandom = null;
        this.primaryIV = null;
        this.secondaryIV = null;
    }

    public ForeignPrivateMasks(Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2, Asn1OctetString asn1OctetString3, Asn1OctetString asn1OctetString4, Asn1OctetString asn1OctetString5) {
        this.randomSeed = asn1OctetString;
        this.randomStatus = asn1OctetString2;
        this.macRandom = asn1OctetString3;
        this.primaryIV = asn1OctetString4;
        this.secondaryIV = asn1OctetString5;
    }

    public ForeignPrivateMasks(Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2, Asn1OctetString asn1OctetString3) {
        this.randomSeed = asn1OctetString;
        this.randomStatus = asn1OctetString2;
        this.macRandom = asn1OctetString3;
    }

    public ForeignPrivateMasks() {
    }

    public ForeignPrivateMasks(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.randomSeed = new Asn1OctetString(bArr);
        this.randomStatus = new Asn1OctetString(bArr2);
        this.macRandom = new Asn1OctetString(bArr3);
    }
}
