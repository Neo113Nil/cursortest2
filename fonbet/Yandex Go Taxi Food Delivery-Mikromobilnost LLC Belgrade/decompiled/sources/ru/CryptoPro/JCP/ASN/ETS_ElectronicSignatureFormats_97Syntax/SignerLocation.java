package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

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
public class SignerLocation extends Asn1Type {
    public SignerLocation_countryName countryName;
    public SignerLocation_localityName localityName;
    public PostalAddress postalAdddress;

    public SignerLocation(SignerLocation_countryName signerLocation_countryName, SignerLocation_localityName signerLocation_localityName, PostalAddress postalAddress) {
        this.countryName = signerLocation_countryName;
        this.localityName = signerLocation_localityName;
        this.postalAdddress = postalAddress;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, false)) {
            SignerLocation_countryName signerLocation_countryName = new SignerLocation_countryName();
            this.countryName = signerLocation_countryName;
            signerLocation_countryName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, false)) {
            SignerLocation_localityName signerLocation_localityName = new SignerLocation_localityName();
            this.localityName = signerLocation_localityName;
            signerLocation_localityName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            PostalAddress postalAddress = new PostalAddress();
            this.postalAdddress = postalAddress;
            postalAddress.decode(asn1BerDecodeBuffer, true, intHolder.value);
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
        PostalAddress postalAddress = this.postalAdddress;
        if (postalAddress != null) {
            int encode = postalAddress.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode) + encode;
        } else {
            i = 0;
        }
        SignerLocation_localityName signerLocation_localityName = this.localityName;
        if (signerLocation_localityName != null) {
            i += signerLocation_localityName.encode(asn1BerEncodeBuffer, true);
        }
        SignerLocation_countryName signerLocation_countryName = this.countryName;
        if (signerLocation_countryName != null) {
            i += signerLocation_countryName.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.countryName = null;
        this.localityName = null;
        this.postalAdddress = null;
    }

    public SignerLocation() {
    }
}
