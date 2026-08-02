package ru.CryptoPro.JCP.ASN.CA_Definitions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes4.dex */
public class CertificateTemplate extends Asn1Type {
    public Asn1ObjectIdentifier templateID;
    public Asn1Integer templateMajorVersion;
    public Asn1Integer templateMinorVersion;

    public CertificateTemplate(int[] iArr, long j, long j2) {
        this.templateID = new Asn1ObjectIdentifier(iArr);
        this.templateMajorVersion = new Asn1Integer(j);
        this.templateMinorVersion = new Asn1Integer(j2);
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
        this.templateID = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.templateMajorVersion = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        long j = this.templateMajorVersion.value;
        if (j < 0 || j > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
            throw new Asn1ConsVioException("templateMajorVersion.value", this.templateMajorVersion.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1Integer asn1Integer2 = new Asn1Integer();
            this.templateMinorVersion = asn1Integer2;
            asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
            long j2 = this.templateMinorVersion.value;
            if (j2 < 0 || j2 > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
                throw new Asn1ConsVioException("templateMinorVersion.value", this.templateMinorVersion.value);
            }
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 0, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1Integer asn1Integer = this.templateMinorVersion;
        if (asn1Integer != null) {
            long j = asn1Integer.value;
            if (j < 0 || j > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
                throw new Asn1ConsVioException("templateMinorVersion.value", this.templateMinorVersion.value);
            }
            i = asn1Integer.encode(asn1BerEncodeBuffer, true);
        } else {
            i = 0;
        }
        Asn1Integer asn1Integer2 = this.templateMajorVersion;
        long j2 = asn1Integer2.value;
        if (j2 < 0 || j2 > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
            throw new Asn1ConsVioException("templateMajorVersion.value", this.templateMajorVersion.value);
        }
        int encode = this.templateID.encode(asn1BerEncodeBuffer, true) + asn1Integer2.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.templateID = null;
        this.templateMajorVersion = null;
        this.templateMinorVersion = null;
    }

    public CertificateTemplate(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Integer asn1Integer, Asn1Integer asn1Integer2) {
        this.templateID = asn1ObjectIdentifier;
        this.templateMajorVersion = asn1Integer;
        this.templateMinorVersion = asn1Integer2;
    }

    public CertificateTemplate(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Integer asn1Integer) {
        this.templateID = asn1ObjectIdentifier;
        this.templateMajorVersion = asn1Integer;
    }

    public CertificateTemplate() {
    }

    public CertificateTemplate(int[] iArr, long j) {
        this.templateID = new Asn1ObjectIdentifier(iArr);
        this.templateMajorVersion = new Asn1Integer(j);
    }
}
