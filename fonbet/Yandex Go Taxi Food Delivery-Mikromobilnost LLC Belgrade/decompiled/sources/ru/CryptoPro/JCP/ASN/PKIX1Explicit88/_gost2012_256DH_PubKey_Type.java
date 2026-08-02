package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Choice;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.n;
import defpackage.x8e;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.GostR3410_2012_PKISyntax.GostR3410_2012_PublicKeyParameters;

/* loaded from: classes4.dex */
public class _gost2012_256DH_PubKey_Type extends Asn1Choice {
    public static final byte _NULL_ = 1;
    public static final byte _PARAMS = 2;

    public _gost2012_256DH_PubKey_Type(byte b, Asn1Type asn1Type) {
        setElement(b, asn1Type);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        Asn1Tag h = n.h(asn1BerDecodeBuffer, 8);
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(h);
        if (h.equals((short) 0, (short) 0, 5)) {
            asn1BerDecodeBuffer.reset();
            setElement(1, new NULLParams());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        } else {
            if (!h.equals((short) 0, (short) 32, 16)) {
                x8e.d(asn1BerDecodeBuffer, h);
                return;
            }
            asn1BerDecodeBuffer.reset();
            setElement(2, new GostR3410_2012_PublicKeyParameters());
            this.element.decode(asn1BerDecodeBuffer, true, decodeTagAndLength);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i = this.choiceID;
        if (i == 1) {
            return ((NULLParams) getElement()).encode(asn1BerEncodeBuffer, true);
        }
        if (i == 2) {
            return ((GostR3410_2012_PublicKeyParameters) getElement()).encode(asn1BerEncodeBuffer, true);
        }
        x8e.b();
        return 0;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Choice
    public String getElemName() {
        int i = this.choiceID;
        return i != 1 ? i != 2 ? "UNDEFINED" : "params" : "null_";
    }

    public void set_null_(NULLParams nULLParams) {
        setElement(1, nULLParams);
    }

    public void set_params(GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters) {
        setElement(2, gostR3410_2012_PublicKeyParameters);
    }

    public _gost2012_256DH_PubKey_Type() {
    }
}
