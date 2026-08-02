package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.CertificateSerialNumber;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Name;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Time;

/* loaded from: classes4.dex */
public class CertificateAssertion extends Asn1Type {
    public AuthorityKeyIdentifier authorityKeyIdentifier;
    public Time certificateValid;
    public Name issuer;
    public KeyUsage keyUsage;
    public Name pathToName;
    public CertPolicySet policy;
    public Asn1GeneralizedTime privateKeyValid;
    public CertificateSerialNumber serialNumber;
    public AltNameType subjectAltName;
    public SubjectKeyIdentifier subjectKeyIdentifier;
    public Asn1ObjectIdentifier subjectPublicKeyAlgID;

    public CertificateAssertion(CertificateSerialNumber certificateSerialNumber, Name name, byte[] bArr, AuthorityKeyIdentifier authorityKeyIdentifier, Time time, String str, int[] iArr, KeyUsage keyUsage, AltNameType altNameType, CertPolicySet certPolicySet, Name name2) {
        this.serialNumber = certificateSerialNumber;
        this.issuer = name;
        this.subjectKeyIdentifier = new SubjectKeyIdentifier(bArr);
        this.authorityKeyIdentifier = authorityKeyIdentifier;
        this.certificateValid = time;
        this.privateKeyValid = new Asn1GeneralizedTime(str);
        this.subjectPublicKeyAlgID = new Asn1ObjectIdentifier(iArr);
        this.keyUsage = keyUsage;
        this.subjectAltName = altNameType;
        this.policy = certPolicySet;
        this.pathToName = name2;
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
            CertificateSerialNumber certificateSerialNumber = new CertificateSerialNumber();
            this.serialNumber = certificateSerialNumber;
            certificateSerialNumber.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            Name name = new Name();
            this.issuer = name;
            name.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 2, intHolder, true)) {
            SubjectKeyIdentifier subjectKeyIdentifier = new SubjectKeyIdentifier();
            this.subjectKeyIdentifier = subjectKeyIdentifier;
            subjectKeyIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            AuthorityKeyIdentifier authorityKeyIdentifier = new AuthorityKeyIdentifier();
            this.authorityKeyIdentifier = authorityKeyIdentifier;
            authorityKeyIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            Time time = new Time();
            this.certificateValid = time;
            time.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 5, intHolder, true)) {
            Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
            this.privateKeyValid = asn1GeneralizedTime;
            asn1GeneralizedTime.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 6, intHolder, true)) {
            Asn1ObjectIdentifier asn1ObjectIdentifier = new Asn1ObjectIdentifier();
            this.subjectPublicKeyAlgID = asn1ObjectIdentifier;
            asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 7, intHolder, true)) {
            KeyUsage keyUsage = new KeyUsage();
            this.keyUsage = keyUsage;
            keyUsage.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, true)) {
            AltNameType altNameType = new AltNameType();
            this.subjectAltName = altNameType;
            altNameType.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 9, intHolder, true)) {
            CertPolicySet certPolicySet = new CertPolicySet();
            this.policy = certPolicySet;
            certPolicySet.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 10, intHolder, true)) {
            Name name2 = new Name();
            this.pathToName = name2;
            name2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 0, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 0, 5) || peekTag.equals((short) 128, (short) 0, 6) || peekTag.equals((short) 128, (short) 0, 7) || peekTag.equals((short) 128, (short) 32, 8) || peekTag.equals((short) 128, (short) 32, 9) || peekTag.equals((short) 128, (short) 32, 10)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Name name = this.pathToName;
        if (name != null) {
            int encode = name.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 10, encode) + encode;
        } else {
            i = 0;
        }
        CertPolicySet certPolicySet = this.policy;
        if (certPolicySet != null) {
            int encode2 = certPolicySet.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode2);
        }
        AltNameType altNameType = this.subjectAltName;
        if (altNameType != null) {
            int encode3 = altNameType.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode3);
        }
        KeyUsage keyUsage = this.keyUsage;
        if (keyUsage != null) {
            int encode4 = keyUsage.encode(asn1BerEncodeBuffer, false);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 7, encode4);
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier = this.subjectPublicKeyAlgID;
        if (asn1ObjectIdentifier != null) {
            int encode5 = asn1ObjectIdentifier.encode(asn1BerEncodeBuffer, false);
            i = i + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 6, encode5);
        }
        Asn1GeneralizedTime asn1GeneralizedTime = this.privateKeyValid;
        if (asn1GeneralizedTime != null) {
            int encode6 = asn1GeneralizedTime.encode(asn1BerEncodeBuffer, false);
            i = i + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 5, encode6);
        }
        Time time = this.certificateValid;
        if (time != null) {
            int encode7 = time.encode(asn1BerEncodeBuffer, false);
            i = i + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode7);
        }
        AuthorityKeyIdentifier authorityKeyIdentifier = this.authorityKeyIdentifier;
        if (authorityKeyIdentifier != null) {
            int encode8 = authorityKeyIdentifier.encode(asn1BerEncodeBuffer, false);
            i = i + encode8 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode8);
        }
        SubjectKeyIdentifier subjectKeyIdentifier = this.subjectKeyIdentifier;
        if (subjectKeyIdentifier != null) {
            int encode9 = subjectKeyIdentifier.encode(asn1BerEncodeBuffer, false);
            i = i + encode9 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode9);
        }
        Name name2 = this.issuer;
        if (name2 != null) {
            int encode10 = name2.encode(asn1BerEncodeBuffer, false);
            i = i + encode10 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode10);
        }
        CertificateSerialNumber certificateSerialNumber = this.serialNumber;
        if (certificateSerialNumber != null) {
            int encode11 = certificateSerialNumber.encode(asn1BerEncodeBuffer, false);
            i = i + encode11 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode11);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.serialNumber = null;
        this.issuer = null;
        this.subjectKeyIdentifier = null;
        this.authorityKeyIdentifier = null;
        this.certificateValid = null;
        this.privateKeyValid = null;
        this.subjectPublicKeyAlgID = null;
        this.keyUsage = null;
        this.subjectAltName = null;
        this.policy = null;
        this.pathToName = null;
    }

    public CertificateAssertion(CertificateSerialNumber certificateSerialNumber, Name name, SubjectKeyIdentifier subjectKeyIdentifier, AuthorityKeyIdentifier authorityKeyIdentifier, Time time, Asn1GeneralizedTime asn1GeneralizedTime, Asn1ObjectIdentifier asn1ObjectIdentifier, KeyUsage keyUsage, AltNameType altNameType, CertPolicySet certPolicySet, Name name2) {
        this.serialNumber = certificateSerialNumber;
        this.issuer = name;
        this.subjectKeyIdentifier = subjectKeyIdentifier;
        this.authorityKeyIdentifier = authorityKeyIdentifier;
        this.certificateValid = time;
        this.privateKeyValid = asn1GeneralizedTime;
        this.subjectPublicKeyAlgID = asn1ObjectIdentifier;
        this.keyUsage = keyUsage;
        this.subjectAltName = altNameType;
        this.policy = certPolicySet;
        this.pathToName = name2;
    }

    public CertificateAssertion() {
    }
}
