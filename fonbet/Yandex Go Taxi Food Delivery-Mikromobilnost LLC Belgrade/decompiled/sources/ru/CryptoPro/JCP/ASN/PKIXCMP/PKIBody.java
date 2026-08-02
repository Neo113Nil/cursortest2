package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIXCRMF.CertReqMessages;

/* loaded from: classes4.dex */
public class PKIBody extends Asn1Choice {
    public static final byte _CANN = 17;
    public static final byte _CCP = 15;
    public static final byte _CCR = 14;
    public static final byte _CKUANN = 16;
    public static final byte _CONF = 20;
    public static final byte _CP = 4;
    public static final byte _CR = 3;
    public static final byte _CRLANN = 19;
    public static final byte _ERROR = 24;
    public static final byte _GENM = 22;
    public static final byte _GENP = 23;
    public static final byte _IP = 2;
    public static final byte _IR = 1;
    public static final byte _KRP = 11;
    public static final byte _KRR = 10;
    public static final byte _KUP = 9;
    public static final byte _KUR = 8;
    public static final byte _NESTED = 21;
    public static final byte _P10CR = 5;
    public static final byte _POPDECC = 6;
    public static final byte _POPDECR = 7;
    public static final byte _RANN = 18;
    public static final byte _RP = 13;
    public static final byte _RR = 12;

    public PKIBody(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 128, (short) 32, 0)) {
            setElement(1, new CertReqMessages());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 1)) {
            setElement(2, new CertRepMessage());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 2)) {
            setElement(3, new CertReqMessages());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 3)) {
            setElement(4, new CertRepMessage());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 4)) {
            setElement(5, new CertificationRequest());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 5)) {
            setElement(6, new POPODecKeyChallContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 6)) {
            setElement(7, new POPODecKeyRespContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 7)) {
            setElement(8, new CertReqMessages());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 8)) {
            setElement(9, new CertRepMessage());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 9)) {
            setElement(10, new CertReqMessages());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 10)) {
            setElement(11, new KeyRecRepContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 11)) {
            setElement(12, new RevReqContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 12)) {
            setElement(13, new RevRepContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 13)) {
            setElement(14, new CertReqMessages());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 14)) {
            setElement(15, new CertRepMessage());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 15)) {
            setElement(16, new CAKeyUpdAnnContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 16)) {
            setElement(17, new CertAnnContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 17)) {
            setElement(18, new RevAnnContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 18)) {
            setElement(19, new CRLAnnContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 19)) {
            setElement(20, new PKIConfirmContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 20)) {
            setElement(21, new NestedMessageContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 21)) {
            setElement(22, new GenMsgContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else if (h.equals((short) 128, (short) 32, 22)) {
            setElement(23, new GenRepContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 32, 23)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(24, new ErrorMsgContent());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        switch (this.choiceID) {
            case 1:
                encode = ((CertReqMessages) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode);
                break;
            case 2:
                encode = ((CertRepMessage) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode);
                break;
            case 3:
                encode = ((CertReqMessages) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode);
                break;
            case 4:
                encode = ((CertRepMessage) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode);
                break;
            case 5:
                encode = ((CertificationRequest) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode);
                break;
            case 6:
                encode = ((POPODecKeyChallContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode);
                break;
            case 7:
                encode = ((POPODecKeyRespContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode);
                break;
            case 8:
                encode = ((CertReqMessages) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode);
                break;
            case 9:
                encode = ((CertRepMessage) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode);
                break;
            case 10:
                encode = ((CertReqMessages) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode);
                break;
            case 11:
                encode = ((KeyRecRepContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 10, encode);
                break;
            case 12:
                encode = ((RevReqContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 11, encode);
                break;
            case 13:
                encode = ((RevRepContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 12, encode);
                break;
            case 14:
                encode = ((CertReqMessages) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 13, encode);
                break;
            case 15:
                encode = ((CertRepMessage) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 14, encode);
                break;
            case 16:
                encode = ((CAKeyUpdAnnContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 15, encode);
                break;
            case 17:
                encode = ((CertAnnContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 16, encode);
                break;
            case 18:
                encode = ((RevAnnContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 17, encode);
                break;
            case 19:
                encode = ((CRLAnnContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 18, encode);
                break;
            case 20:
                encode = ((PKIConfirmContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 19, encode);
                break;
            case 21:
                encode = ((NestedMessageContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 20, encode);
                break;
            case 22:
                encode = ((GenMsgContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 21, encode);
                break;
            case 23:
                encode = ((GenRepContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 22, encode);
                break;
            case 24:
                encode = ((ErrorMsgContent) getElement()).encode(asn1BerEncodeBuffer, true);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 23, encode);
                break;
            default:
                x8e.b();
                return 0;
        }
        return encodeTagAndLength + encode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        switch (this.choiceID) {
            case 1:
                return "ir";
            case 2:
                return "ip";
            case 3:
                return "cr";
            case 4:
                return "cp";
            case 5:
                return "p10cr";
            case 6:
                return "popdecc";
            case 7:
                return "popdecr";
            case 8:
                return "kur";
            case 9:
                return "kup";
            case 10:
                return "krr";
            case 11:
                return "krp";
            case 12:
                return "rr";
            case 13:
                return "rp";
            case 14:
                return "ccr";
            case 15:
                return "ccp";
            case 16:
                return "ckuann";
            case 17:
                return "cann";
            case 18:
                return "rann";
            case 19:
                return "crlann";
            case 20:
                return "conf";
            case 21:
                return "nested";
            case 22:
                return "genm";
            case 23:
                return "genp";
            case 24:
                return "error";
            default:
                return "UNDEFINED";
        }
    }

    public void set_cann(CertAnnContent certAnnContent) {
        setElement(17, certAnnContent);
    }

    public void set_ccp(CertRepMessage certRepMessage) {
        setElement(15, certRepMessage);
    }

    public void set_ccr(CertReqMessages certReqMessages) {
        setElement(14, certReqMessages);
    }

    public void set_ckuann(CAKeyUpdAnnContent cAKeyUpdAnnContent) {
        setElement(16, cAKeyUpdAnnContent);
    }

    public void set_conf(PKIConfirmContent pKIConfirmContent) {
        setElement(20, pKIConfirmContent);
    }

    public void set_cp(CertRepMessage certRepMessage) {
        setElement(4, certRepMessage);
    }

    public void set_cr(CertReqMessages certReqMessages) {
        setElement(3, certReqMessages);
    }

    public void set_crlann(CRLAnnContent cRLAnnContent) {
        setElement(19, cRLAnnContent);
    }

    public void set_error(ErrorMsgContent errorMsgContent) {
        setElement(24, errorMsgContent);
    }

    public void set_genm(GenMsgContent genMsgContent) {
        setElement(22, genMsgContent);
    }

    public void set_genp(GenRepContent genRepContent) {
        setElement(23, genRepContent);
    }

    public void set_ip(CertRepMessage certRepMessage) {
        setElement(2, certRepMessage);
    }

    public void set_ir(CertReqMessages certReqMessages) {
        setElement(1, certReqMessages);
    }

    public void set_krp(KeyRecRepContent keyRecRepContent) {
        setElement(11, keyRecRepContent);
    }

    public void set_krr(CertReqMessages certReqMessages) {
        setElement(10, certReqMessages);
    }

    public void set_kup(CertRepMessage certRepMessage) {
        setElement(9, certRepMessage);
    }

    public void set_kur(CertReqMessages certReqMessages) {
        setElement(8, certReqMessages);
    }

    public void set_nested(NestedMessageContent nestedMessageContent) {
        setElement(21, nestedMessageContent);
    }

    public void set_p10cr(CertificationRequest certificationRequest) {
        setElement(5, certificationRequest);
    }

    public void set_popdecc(POPODecKeyChallContent pOPODecKeyChallContent) {
        setElement(6, pOPODecKeyChallContent);
    }

    public void set_popdecr(POPODecKeyRespContent pOPODecKeyRespContent) {
        setElement(7, pOPODecKeyRespContent);
    }

    public void set_rann(RevAnnContent revAnnContent) {
        setElement(18, revAnnContent);
    }

    public void set_rp(RevRepContent revRepContent) {
        setElement(13, revRepContent);
    }

    public void set_rr(RevReqContent revReqContent) {
        setElement(12, revReqContent);
    }

    public PKIBody() {
    }
}
