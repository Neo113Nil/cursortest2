package ru.CryptoPro.JCP.ASN.PKIXCRMF;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BigInteger;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Name;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.UniqueIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Version;

/* loaded from: classes4.dex */
public class CertTemplate extends Asn1Type {
    public Extensions extensions;
    public Name issuer;
    public UniqueIdentifier issuerUID;
    public SubjectPublicKeyInfo publicKey;
    public Asn1BigInteger serialNumber;
    public AlgorithmIdentifier signingAlg;
    public Name subject;
    public UniqueIdentifier subjectUID;
    public OptionalValidity validity;
    public Version version;

    public CertTemplate(long j, Asn1BigInteger asn1BigInteger, AlgorithmIdentifier algorithmIdentifier, Name name, OptionalValidity optionalValidity, Name name2, SubjectPublicKeyInfo subjectPublicKeyInfo, UniqueIdentifier uniqueIdentifier, UniqueIdentifier uniqueIdentifier2, Extensions extensions) {
        this.version = new Version(j);
        this.serialNumber = asn1BigInteger;
        this.signingAlg = algorithmIdentifier;
        this.issuer = name;
        this.validity = optionalValidity;
        this.subject = name2;
        this.publicKey = subjectPublicKeyInfo;
        this.issuerUID = uniqueIdentifier;
        this.subjectUID = uniqueIdentifier2;
        this.extensions = extensions;
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
            Version version = new Version();
            this.version = version;
            version.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            Asn1BigInteger asn1BigInteger = new Asn1BigInteger();
            this.serialNumber = asn1BigInteger;
            asn1BigInteger.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
            this.signingAlg = algorithmIdentifier;
            algorithmIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            Name name = new Name();
            this.issuer = name;
            name.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            OptionalValidity optionalValidity = new OptionalValidity();
            this.validity = optionalValidity;
            optionalValidity.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            Name name2 = new Name();
            this.subject = name2;
            name2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
            this.publicKey = subjectPublicKeyInfo;
            subjectPublicKeyInfo.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 7, intHolder, true)) {
            UniqueIdentifier uniqueIdentifier = new UniqueIdentifier();
            this.issuerUID = uniqueIdentifier;
            uniqueIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 8, intHolder, true)) {
            UniqueIdentifier uniqueIdentifier2 = new UniqueIdentifier();
            this.subjectUID = uniqueIdentifier2;
            uniqueIdentifier2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 9, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.extensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 0, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6) || peekTag.equals((short) 128, (short) 0, 7) || peekTag.equals((short) 128, (short) 0, 8) || peekTag.equals((short) 128, (short) 32, 9)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Extensions extensions = this.extensions;
        if (extensions != null) {
            int encode = extensions.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode) + encode;
        } else {
            i = 0;
        }
        UniqueIdentifier uniqueIdentifier = this.subjectUID;
        if (uniqueIdentifier != null) {
            int encode2 = uniqueIdentifier.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 8, encode2);
        }
        UniqueIdentifier uniqueIdentifier2 = this.issuerUID;
        if (uniqueIdentifier2 != null) {
            int encode3 = uniqueIdentifier2.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 7, encode3);
        }
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.publicKey;
        if (subjectPublicKeyInfo != null) {
            int encode4 = subjectPublicKeyInfo.encode(asn1BerEncodeBuffer, false);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode4);
        }
        Name name = this.subject;
        if (name != null) {
            int encode5 = name.encode(asn1BerEncodeBuffer, false);
            i = i + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode5);
        }
        OptionalValidity optionalValidity = this.validity;
        if (optionalValidity != null) {
            int encode6 = optionalValidity.encode(asn1BerEncodeBuffer, false);
            i = i + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode6);
        }
        Name name2 = this.issuer;
        if (name2 != null) {
            int encode7 = name2.encode(asn1BerEncodeBuffer, false);
            i = i + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode7);
        }
        AlgorithmIdentifier algorithmIdentifier = this.signingAlg;
        if (algorithmIdentifier != null) {
            int encode8 = algorithmIdentifier.encode(asn1BerEncodeBuffer, false);
            i = i + encode8 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode8);
        }
        Asn1BigInteger asn1BigInteger = this.serialNumber;
        if (asn1BigInteger != null) {
            int encode9 = asn1BigInteger.encode(asn1BerEncodeBuffer, false);
            i = i + encode9 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode9);
        }
        Version version = this.version;
        if (version != null) {
            int encode10 = version.encode(asn1BerEncodeBuffer, false);
            i = i + encode10 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode10);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.version = null;
        this.serialNumber = null;
        this.signingAlg = null;
        this.issuer = null;
        this.validity = null;
        this.subject = null;
        this.publicKey = null;
        this.issuerUID = null;
        this.subjectUID = null;
        this.extensions = null;
    }

    public CertTemplate(Version version, Asn1BigInteger asn1BigInteger, AlgorithmIdentifier algorithmIdentifier, Name name, OptionalValidity optionalValidity, Name name2, SubjectPublicKeyInfo subjectPublicKeyInfo, UniqueIdentifier uniqueIdentifier, UniqueIdentifier uniqueIdentifier2, Extensions extensions) {
        this.version = version;
        this.serialNumber = asn1BigInteger;
        this.signingAlg = algorithmIdentifier;
        this.issuer = name;
        this.validity = optionalValidity;
        this.subject = name2;
        this.publicKey = subjectPublicKeyInfo;
        this.issuerUID = uniqueIdentifier;
        this.subjectUID = uniqueIdentifier2;
        this.extensions = extensions;
    }

    public CertTemplate() {
    }
}
