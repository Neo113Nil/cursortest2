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
public class Attribute extends Asn1Type {
    public Asn1ObjectIdentifier type;
    public Attribute_values values;

    public Attribute(int[] iArr, Attribute_values attribute_values) {
        this.type = new Asn1ObjectIdentifier(iArr);
        this.values = attribute_values;
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
        if (attribute_class == null || !z) {
            return;
        }
        try {
            Asn1Type[] asn1TypeArr = new Asn1Type[this.values.elements.length];
            int i2 = 0;
            while (true) {
                Attribute_values attribute_values = this.values;
                if (i2 >= attribute_values.elements.length) {
                    attribute_values.elements = asn1TypeArr;
                    return;
                }
                Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(((Asn1OpenType) this.values.elements[i2]).value);
                Asn1Type asn1Type = (Asn1Type) attribute_class.Type.getClass().newInstance();
                asn1TypeArr[i2] = asn1Type;
                asn1Type.decode(asn1BerDecodeBuffer, true, 0);
                i2++;
            }
        } catch (Exception unused) {
            quz.s("table constraint: element decode failed");
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
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 17, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Attribute_values attribute_values = new Attribute_values();
        this.values = attribute_values;
        attribute_values.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 32, 17)) {
                quz.g();
                return;
            }
        }
        checkTC(true);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        checkTC(false);
        int encode = this.type.encode(asn1BerEncodeBuffer, true) + this.values.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.type = null;
        this.values = null;
    }

    public Attribute(Asn1ObjectIdentifier asn1ObjectIdentifier, Attribute_values attribute_values) {
        this.type = asn1ObjectIdentifier;
        this.values = attribute_values;
    }

    public Attribute() {
    }
}
