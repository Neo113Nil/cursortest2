package ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1IA5String;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OpenExt;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.Asn1UTF8String;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class RestrictedCSPKeyLicense_tbh extends Asn1Type {
    public Asn1OpenExt extElem1;
    public Asn1Integer idHashConstant;
    public Asn1BitString licenseArea;
    public Asn1UTF8String licenseText;
    public Asn1IA5String licenseUri;

    public RestrictedCSPKeyLicense_tbh(String str, String str2, Asn1BitString asn1BitString) {
        this.licenseUri = new Asn1IA5String(str);
        this.licenseText = new Asn1UTF8String(str2);
        this.licenseArea = asn1BitString;
        this.idHashConstant = new Asn1Integer(0L);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 22, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1IA5String asn1IA5String = new Asn1IA5String();
        this.licenseUri = asn1IA5String;
        asn1IA5String.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 12, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1UTF8String asn1UTF8String = new Asn1UTF8String();
        this.licenseText = asn1UTF8String;
        asn1UTF8String.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1BitString asn1BitString = new Asn1BitString();
        this.licenseArea = asn1BitString;
        asn1BitString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.idHashConstant = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            this.extElem1 = null;
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 22) || peekTag.equals((short) 0, (short) 0, 12) || peekTag.equals((short) 0, (short) 0, 3) || peekTag.equals((short) 128, (short) 0, 0)) {
            quz.g();
            return;
        }
        this.extElem1 = new Asn1OpenExt();
        while (!asn1BerDecodeContext.expired()) {
            this.extElem1.decodeComponent(asn1BerDecodeBuffer);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1OpenExt asn1OpenExt = this.extElem1;
        int encode = asn1OpenExt != null ? asn1OpenExt.encode(asn1BerEncodeBuffer, false) : 0;
        if (!this.idHashConstant.equals(0L)) {
            int encode2 = this.idHashConstant.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2);
        }
        int encode3 = this.licenseUri.encode(asn1BerEncodeBuffer, true) + this.licenseText.encode(asn1BerEncodeBuffer, true) + this.licenseArea.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.licenseUri = null;
        this.licenseText = null;
        this.licenseArea = null;
        this.idHashConstant = new Asn1Integer(0L);
        this.extElem1 = null;
    }

    public RestrictedCSPKeyLicense_tbh(Asn1IA5String asn1IA5String, Asn1UTF8String asn1UTF8String, Asn1BitString asn1BitString, Asn1Integer asn1Integer) {
        this.licenseUri = asn1IA5String;
        this.licenseText = asn1UTF8String;
        this.licenseArea = asn1BitString;
        this.idHashConstant = asn1Integer;
    }

    public RestrictedCSPKeyLicense_tbh(Asn1IA5String asn1IA5String, Asn1UTF8String asn1UTF8String, Asn1BitString asn1BitString) {
        this.licenseUri = asn1IA5String;
        this.licenseText = asn1UTF8String;
        this.licenseArea = asn1BitString;
        this.idHashConstant = new Asn1Integer(0L);
    }

    public RestrictedCSPKeyLicense_tbh(String str, String str2, Asn1BitString asn1BitString, long j) {
        this.licenseUri = new Asn1IA5String(str);
        this.licenseText = new Asn1UTF8String(str2);
        this.licenseArea = asn1BitString;
        this.idHashConstant = new Asn1Integer(j);
    }

    public RestrictedCSPKeyLicense_tbh() {
        this.idHashConstant = new Asn1Integer(0L);
    }
}
