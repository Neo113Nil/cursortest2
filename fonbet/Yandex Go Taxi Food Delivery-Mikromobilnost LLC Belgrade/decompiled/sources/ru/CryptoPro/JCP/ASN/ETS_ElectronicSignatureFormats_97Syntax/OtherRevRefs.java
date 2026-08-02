package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

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
public class OtherRevRefs extends Asn1Type {
    public Asn1ObjectIdentifier otherRevRefType;
    public Asn1OpenType otherRevRefs;

    public OtherRevRefs(int[] iArr, Asn1OpenType asn1OpenType) {
        this.otherRevRefType = new Asn1ObjectIdentifier(iArr);
        this.otherRevRefs = asn1OpenType;
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
        this.otherRevRefType = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OpenType asn1OpenType = new Asn1OpenType();
        this.otherRevRefs = asn1OpenType;
        asn1OpenType.decode(asn1BerDecodeBuffer, true, 0);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 6)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.otherRevRefType.encode(asn1BerEncodeBuffer, true) + this.otherRevRefs.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.otherRevRefType = null;
        this.otherRevRefs = null;
    }

    public OtherRevRefs(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        this.otherRevRefType = asn1ObjectIdentifier;
        this.otherRevRefs = asn1OpenType;
    }

    public OtherRevRefs() {
    }
}
