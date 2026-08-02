package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CPPKIXCMP.PKIFreeText;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralName;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.KeyIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class PKIHeader extends Asn1Type {
    public PKIFreeText freeText;
    public PKIHeader_generalInfo generalInfo;
    public Asn1GeneralizedTime messageTime;
    public AlgorithmIdentifier protectionAlg;
    public PKIHeader_pvno pvno;
    public KeyIdentifier recipKID;
    public Asn1OctetString recipNonce;
    public GeneralName recipient;
    public GeneralName sender;
    public KeyIdentifier senderKID;
    public Asn1OctetString senderNonce;
    public Asn1OctetString transactionID;

    public PKIHeader(long j, GeneralName generalName, GeneralName generalName2, String str, AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, PKIFreeText pKIFreeText, PKIHeader_generalInfo pKIHeader_generalInfo) {
        this.pvno = new PKIHeader_pvno(j);
        this.sender = generalName;
        this.recipient = generalName2;
        this.messageTime = new Asn1GeneralizedTime(str);
        this.protectionAlg = algorithmIdentifier;
        this.senderKID = new KeyIdentifier(bArr);
        this.recipKID = new KeyIdentifier(bArr2);
        this.transactionID = new Asn1OctetString(bArr3);
        this.senderNonce = new Asn1OctetString(bArr4);
        this.recipNonce = new Asn1OctetString(bArr5);
        this.freeText = pKIFreeText;
        this.generalInfo = pKIHeader_generalInfo;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        int matchTag = z ? matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE) : i;
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, matchTag);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PKIHeader_pvno pKIHeader_pvno = new PKIHeader_pvno();
        this.pvno = pKIHeader_pvno;
        pKIHeader_pvno.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 128, (short) 32, 0) && !peekTag.equals((short) 128, (short) 0, 1) && !peekTag.equals((short) 128, (short) 0, 2) && !peekTag.equals((short) 128, (short) 32, 3) && !peekTag.equals((short) 128, (short) 32, 4) && !peekTag.equals((short) 128, (short) 32, 5) && !peekTag.equals((short) 128, (short) 0, 6) && !peekTag.equals((short) 128, (short) 0, 7) && !peekTag.equals((short) 128, (short) 0, 8)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        GeneralName generalName = new GeneralName();
        this.sender = generalName;
        generalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (!peekTag2.equals((short) 128, (short) 32, 0) && !peekTag2.equals((short) 128, (short) 0, 1) && !peekTag2.equals((short) 128, (short) 0, 2) && !peekTag2.equals((short) 128, (short) 32, 3) && !peekTag2.equals((short) 128, (short) 32, 4) && !peekTag2.equals((short) 128, (short) 32, 5) && !peekTag2.equals((short) 128, (short) 0, 6) && !peekTag2.equals((short) 128, (short) 0, 7) && !peekTag2.equals((short) 128, (short) 0, 8)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        GeneralName generalName2 = new GeneralName();
        this.recipient = generalName2;
        generalName2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
            this.messageTime = asn1GeneralizedTime;
            asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
            this.protectionAlg = algorithmIdentifier;
            algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            KeyIdentifier keyIdentifier = new KeyIdentifier();
            this.senderKID = keyIdentifier;
            keyIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            KeyIdentifier keyIdentifier2 = new KeyIdentifier();
            this.recipKID = keyIdentifier2;
            keyIdentifier2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            this.transactionID = asn1OctetString;
            asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            Asn1OctetString asn1OctetString2 = new Asn1OctetString();
            this.senderNonce = asn1OctetString2;
            asn1OctetString2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            Asn1OctetString asn1OctetString3 = new Asn1OctetString();
            this.recipNonce = asn1OctetString3;
            asn1OctetString3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 7, intHolder, true)) {
            PKIFreeText pKIFreeText = new PKIFreeText();
            this.freeText = pKIFreeText;
            pKIFreeText.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, false)) {
            PKIHeader_generalInfo pKIHeader_generalInfo = new PKIHeader_generalInfo();
            this.generalInfo = pKIHeader_generalInfo;
            pKIHeader_generalInfo.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag3 = asn1BerDecodeBuffer.peekTag();
        if (peekTag3.equals((short) 0, (short) 0, 2) || peekTag3.equals((short) 128, (short) 32, 0) || peekTag3.equals((short) 128, (short) 32, 1) || peekTag3.equals((short) 128, (short) 32, 2) || peekTag3.equals((short) 128, (short) 32, 3) || peekTag3.equals((short) 128, (short) 32, 4) || peekTag3.equals((short) 128, (short) 32, 5) || peekTag3.equals((short) 128, (short) 32, 6) || peekTag3.equals((short) 128, (short) 32, 7) || peekTag3.equals((short) 128, (short) 32, 8)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        PKIHeader_generalInfo pKIHeader_generalInfo = this.generalInfo;
        int encode = pKIHeader_generalInfo != null ? pKIHeader_generalInfo.encode(asn1BerEncodeBuffer, true) : 0;
        PKIFreeText pKIFreeText = this.freeText;
        if (pKIFreeText != null) {
            int encode2 = pKIFreeText.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode2);
        }
        Asn1OctetString asn1OctetString = this.recipNonce;
        if (asn1OctetString != null) {
            int encode3 = asn1OctetString.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode3);
        }
        Asn1OctetString asn1OctetString2 = this.senderNonce;
        if (asn1OctetString2 != null) {
            int encode4 = asn1OctetString2.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode4);
        }
        Asn1OctetString asn1OctetString3 = this.transactionID;
        if (asn1OctetString3 != null) {
            int encode5 = asn1OctetString3.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode5);
        }
        KeyIdentifier keyIdentifier = this.recipKID;
        if (keyIdentifier != null) {
            int encode6 = keyIdentifier.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode6);
        }
        KeyIdentifier keyIdentifier2 = this.senderKID;
        if (keyIdentifier2 != null) {
            int encode7 = keyIdentifier2.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode7);
        }
        AlgorithmIdentifier algorithmIdentifier = this.protectionAlg;
        if (algorithmIdentifier != null) {
            int encode8 = algorithmIdentifier.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode8 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode8);
        }
        Asn1GeneralizedTime asn1GeneralizedTime = this.messageTime;
        if (asn1GeneralizedTime != null) {
            int encode9 = asn1GeneralizedTime.encode(asn1BerEncodeBuffer, true);
            encode = encode + encode9 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode9);
        }
        int encode10 = this.pvno.encode(asn1BerEncodeBuffer, true) + this.sender.encode(asn1BerEncodeBuffer, true) + this.recipient.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode10) + encode10 : encode10;
    }

    public void init() {
        this.pvno = null;
        this.sender = null;
        this.recipient = null;
        this.messageTime = null;
        this.protectionAlg = null;
        this.senderKID = null;
        this.recipKID = null;
        this.transactionID = null;
        this.senderNonce = null;
        this.recipNonce = null;
        this.freeText = null;
        this.generalInfo = null;
    }

    public PKIHeader(PKIHeader_pvno pKIHeader_pvno, GeneralName generalName, GeneralName generalName2, Asn1GeneralizedTime asn1GeneralizedTime, AlgorithmIdentifier algorithmIdentifier, KeyIdentifier keyIdentifier, KeyIdentifier keyIdentifier2, Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2, Asn1OctetString asn1OctetString3, PKIFreeText pKIFreeText, PKIHeader_generalInfo pKIHeader_generalInfo) {
        this.pvno = pKIHeader_pvno;
        this.sender = generalName;
        this.recipient = generalName2;
        this.messageTime = asn1GeneralizedTime;
        this.protectionAlg = algorithmIdentifier;
        this.senderKID = keyIdentifier;
        this.recipKID = keyIdentifier2;
        this.transactionID = asn1OctetString;
        this.senderNonce = asn1OctetString2;
        this.recipNonce = asn1OctetString3;
        this.freeText = pKIFreeText;
        this.generalInfo = pKIHeader_generalInfo;
    }

    public PKIHeader(PKIHeader_pvno pKIHeader_pvno, GeneralName generalName, GeneralName generalName2) {
        this.pvno = pKIHeader_pvno;
        this.sender = generalName;
        this.recipient = generalName2;
    }

    public PKIHeader() {
    }

    public PKIHeader(long j, GeneralName generalName, GeneralName generalName2) {
        this.pvno = new PKIHeader_pvno(j);
        this.sender = generalName;
        this.recipient = generalName2;
    }
}
