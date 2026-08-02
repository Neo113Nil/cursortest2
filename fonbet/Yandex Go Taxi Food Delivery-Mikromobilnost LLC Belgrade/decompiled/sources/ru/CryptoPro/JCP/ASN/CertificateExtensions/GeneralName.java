package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1IA5String;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Name;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.ORAddress;

/* loaded from: classes4.dex */
public class GeneralName extends Asn1Choice {
    public static final byte _DIRECTORYNAME = 5;
    public static final byte _DNSNAME = 3;
    public static final byte _EDIPARTYNAME = 6;
    public static final byte _IPADDRESS = 8;
    public static final byte _OTHERNAME = 1;
    public static final byte _REGISTEREDID = 9;
    public static final byte _RFC822NAME = 2;
    public static final byte _UNIFORMRESOURCEIDENTIFIER = 7;
    public static final byte _X400ADDRESS = 4;

    public GeneralName(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 128, (short) 32, 0)) {
            asn1BerDecodeBuffer.reset();
            setElement(1, new GeneralName_otherName());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 0, 1)) {
            setElement(2, new Asn1IA5String());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 0, 2)) {
            setElement(3, new Asn1IA5String());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 3)) {
            setElement(4, new ORAddress());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 4)) {
            setElement(5, new Name());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 32, 5)) {
            setElement(6, new EDIPartyName());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            return;
        }
        if (h.equals((short) 128, (short) 0, 6)) {
            setElement(7, new Asn1IA5String());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (h.equals((short) 128, (short) 0, 7)) {
            setElement(8, new Asn1OctetString());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        } else if (!h.equals((short) 128, (short) 0, 8)) {
            x8e.d(asn1BerDecodeBuffer, h);
        } else {
            setElement(9, new Asn1ObjectIdentifier());
            this.element.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode;
        int encodeTagAndLength;
        switch (this.choiceID) {
            case 1:
                return ((GeneralName_otherName) getElement()).encode(asn1BerEncodeBuffer, true);
            case 2:
                encode = ((Asn1IA5String) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode);
                break;
            case 3:
                encode = ((Asn1IA5String) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode);
                break;
            case 4:
                encode = ((ORAddress) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode);
                break;
            case 5:
                encode = ((Name) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode);
                break;
            case 6:
                encode = ((EDIPartyName) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode);
                break;
            case 7:
                encode = ((Asn1IA5String) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 6, encode);
                break;
            case 8:
                encode = ((Asn1OctetString) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 7, encode);
                break;
            case 9:
                encode = ((Asn1ObjectIdentifier) getElement()).encode(asn1BerEncodeBuffer, false);
                encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 8, encode);
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
                return "otherName";
            case 2:
                return "rfc822Name";
            case 3:
                return "dNSName";
            case 4:
                return "x400Address";
            case 5:
                return "directoryName";
            case 6:
                return "ediPartyName";
            case 7:
                return "uniformResourceIdentifier";
            case 8:
                return "iPAddress";
            case 9:
                return "registeredID";
            default:
                return "UNDEFINED";
        }
    }

    public void set_dNSName(Asn1IA5String asn1IA5String) {
        setElement(3, asn1IA5String);
    }

    public void set_directoryName(Name name) {
        setElement(5, name);
    }

    public void set_ediPartyName(EDIPartyName eDIPartyName) {
        setElement(6, eDIPartyName);
    }

    public void set_iPAddress(Asn1OctetString asn1OctetString) {
        setElement(8, asn1OctetString);
    }

    public void set_otherName(GeneralName_otherName generalName_otherName) {
        setElement(1, generalName_otherName);
    }

    public void set_registeredID(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        setElement(9, asn1ObjectIdentifier);
    }

    public void set_rfc822Name(Asn1IA5String asn1IA5String) {
        setElement(2, asn1IA5String);
    }

    public void set_uniformResourceIdentifier(Asn1IA5String asn1IA5String) {
        setElement(7, asn1IA5String);
    }

    public void set_x400Address(ORAddress oRAddress) {
        setElement(4, oRAddress);
    }

    public GeneralName() {
    }
}
