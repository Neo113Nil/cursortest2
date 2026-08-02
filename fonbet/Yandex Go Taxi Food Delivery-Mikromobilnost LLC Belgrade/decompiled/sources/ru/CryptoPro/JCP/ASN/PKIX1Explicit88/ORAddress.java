package ru.CryptoPro.JCP.ASN.PKIX1Explicit88;

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
public class ORAddress extends Asn1Type {
    public BuiltInDomainDefinedAttributes built_in_domain_defined_attributes;
    public BuiltInStandardAttributes built_in_standard_attributes;
    public ExtensionAttributes extension_attributes;

    public ORAddress(BuiltInStandardAttributes builtInStandardAttributes, BuiltInDomainDefinedAttributes builtInDomainDefinedAttributes, ExtensionAttributes extensionAttributes) {
        this.built_in_standard_attributes = builtInStandardAttributes;
        this.built_in_domain_defined_attributes = builtInDomainDefinedAttributes;
        this.extension_attributes = extensionAttributes;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        BuiltInStandardAttributes builtInStandardAttributes = new BuiltInStandardAttributes();
        this.built_in_standard_attributes = builtInStandardAttributes;
        builtInStandardAttributes.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            BuiltInDomainDefinedAttributes builtInDomainDefinedAttributes = new BuiltInDomainDefinedAttributes();
            this.built_in_domain_defined_attributes = builtInDomainDefinedAttributes;
            builtInDomainDefinedAttributes.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 17, intHolder, false)) {
            ExtensionAttributes extensionAttributes = new ExtensionAttributes();
            this.extension_attributes = extensionAttributes;
            extensionAttributes.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 32, 17)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        ExtensionAttributes extensionAttributes = this.extension_attributes;
        int encode = extensionAttributes != null ? extensionAttributes.encode(asn1BerEncodeBuffer, true) : 0;
        BuiltInDomainDefinedAttributes builtInDomainDefinedAttributes = this.built_in_domain_defined_attributes;
        if (builtInDomainDefinedAttributes != null) {
            encode += builtInDomainDefinedAttributes.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.built_in_standard_attributes.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.built_in_standard_attributes = null;
        this.built_in_domain_defined_attributes = null;
        this.extension_attributes = null;
    }

    public ORAddress() {
    }

    public ORAddress(BuiltInStandardAttributes builtInStandardAttributes) {
        this.built_in_standard_attributes = builtInStandardAttributes;
    }
}
