package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class NameConstraintsSyntax extends Asn1Type {
    public GeneralSubtrees excludedSubtrees;
    public GeneralSubtrees permittedSubtrees;
    public NameForms requiredNameForms;

    public NameConstraintsSyntax(GeneralSubtrees generalSubtrees, GeneralSubtrees generalSubtrees2, NameForms nameForms) {
        this.permittedSubtrees = generalSubtrees;
        this.excludedSubtrees = generalSubtrees2;
        this.requiredNameForms = nameForms;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            GeneralSubtrees generalSubtrees = new GeneralSubtrees();
            this.permittedSubtrees = generalSubtrees;
            generalSubtrees.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            GeneralSubtrees generalSubtrees2 = new GeneralSubtrees();
            this.excludedSubtrees = generalSubtrees2;
            generalSubtrees2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            NameForms nameForms = new NameForms();
            this.requiredNameForms = nameForms;
            nameForms.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        NameForms nameForms = this.requiredNameForms;
        if (nameForms != null) {
            int encode = nameForms.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode) + encode;
        } else {
            i = 0;
        }
        GeneralSubtrees generalSubtrees = this.excludedSubtrees;
        if (generalSubtrees != null) {
            int encode2 = generalSubtrees.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode2);
        }
        GeneralSubtrees generalSubtrees2 = this.permittedSubtrees;
        if (generalSubtrees2 != null) {
            int encode3 = generalSubtrees2.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode3);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.permittedSubtrees = null;
        this.excludedSubtrees = null;
        this.requiredNameForms = null;
    }

    public NameConstraintsSyntax() {
    }
}
