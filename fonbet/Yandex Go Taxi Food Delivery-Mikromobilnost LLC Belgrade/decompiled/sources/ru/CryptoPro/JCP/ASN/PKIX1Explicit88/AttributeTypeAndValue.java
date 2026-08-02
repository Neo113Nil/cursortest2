package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class AttributeTypeAndValue extends Asn1Type {
    public Asn1ObjectIdentifier type;
    public Asn1Type value;

    public AttributeTypeAndValue(int[] iArr, Asn1Type asn1Type) {
        this.type = new Asn1ObjectIdentifier(iArr);
        this.value = asn1Type;
    }

    public void checkTC(boolean z) throws Asn1Exception {
        ATTRIBUTE_CLASS attribute_class;
        int i = 0;
        while (true) {
            ATTRIBUTE_CLASS[] attribute_classArr = _PKIX1Explicit88Values.SupportedAttributes;
            if (i >= attribute_classArr.length) {
                attribute_class = null;
                break;
            } else {
                if (attribute_classArr[i].id.equals(this.type)) {
                    attribute_class = attribute_classArr[i];
                    break;
                }
                i++;
            }
        }
        if (attribute_class != null && z) {
            try {
                Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(((Asn1OpenType) this.value).value);
                Asn1Type asn1Type = (Asn1Type) attribute_class.Type.getClass().newInstance();
                this.value = asn1Type;
                asn1Type.decode(asn1BerDecodeBuffer, true, 0);
            } catch (Exception unused) {
                quz.s("table constraint: value decode failed");
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
        this.type = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OpenType asn1OpenType = new Asn1OpenType();
        this.value = asn1OpenType;
        asn1OpenType.decode(asn1BerDecodeBuffer, true, 0);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 6)) {
            checkTC(true);
        } else {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        checkTC(false);
        int encode = this.type.encode(asn1BerEncodeBuffer, true) + this.value.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.type = null;
        this.value = null;
    }

    public AttributeTypeAndValue(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        this.type = asn1ObjectIdentifier;
        this.value = asn1OpenType;
    }

    public AttributeTypeAndValue() {
    }
}
