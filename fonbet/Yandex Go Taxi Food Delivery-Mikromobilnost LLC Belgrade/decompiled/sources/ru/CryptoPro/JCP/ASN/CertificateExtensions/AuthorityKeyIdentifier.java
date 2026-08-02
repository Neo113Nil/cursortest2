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
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.CertificateSerialNumber;

/* loaded from: classes4.dex */
public class AuthorityKeyIdentifier extends Asn1Type {
    public GeneralNames authorityCertIssuer;
    public CertificateSerialNumber authorityCertSerialNumber;
    public KeyIdentifier keyIdentifier;

    public AuthorityKeyIdentifier(byte[] bArr, GeneralNames generalNames, CertificateSerialNumber certificateSerialNumber) {
        this.keyIdentifier = new KeyIdentifier(bArr);
        this.authorityCertIssuer = generalNames;
        this.authorityCertSerialNumber = certificateSerialNumber;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            KeyIdentifier keyIdentifier = new KeyIdentifier();
            this.keyIdentifier = keyIdentifier;
            keyIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            GeneralNames generalNames = new GeneralNames();
            this.authorityCertIssuer = generalNames;
            generalNames.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 2, intHolder, true)) {
            CertificateSerialNumber certificateSerialNumber = new CertificateSerialNumber();
            this.authorityCertSerialNumber = certificateSerialNumber;
            certificateSerialNumber.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 0, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        CertificateSerialNumber certificateSerialNumber = this.authorityCertSerialNumber;
        if (certificateSerialNumber != null) {
            int encode = certificateSerialNumber.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode) + encode;
        } else {
            i = 0;
        }
        GeneralNames generalNames = this.authorityCertIssuer;
        if (generalNames != null) {
            int encode2 = generalNames.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode2);
        }
        KeyIdentifier keyIdentifier = this.keyIdentifier;
        if (keyIdentifier != null) {
            int encode3 = keyIdentifier.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode3);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.keyIdentifier = null;
        this.authorityCertIssuer = null;
        this.authorityCertSerialNumber = null;
    }

    public AuthorityKeyIdentifier(KeyIdentifier keyIdentifier, GeneralNames generalNames, CertificateSerialNumber certificateSerialNumber) {
        this.keyIdentifier = keyIdentifier;
        this.authorityCertIssuer = generalNames;
        this.authorityCertSerialNumber = certificateSerialNumber;
    }

    public AuthorityKeyIdentifier() {
    }
}
