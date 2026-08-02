package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1IA5String;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_EncryptedKey;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_MAC;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;

/* loaded from: classes4.dex */
public class GostKeyContainerContent extends Asn1Type {
    public GostKeyContainerContentAttributes attributes;
    public AlgorithmIdentifier containerAlgoritmIdentifier;
    public Asn1IA5String containerName;
    public Asn1Integer containerSecurityLevel;
    public Asn1IA5String encryptionContainerName;
    public Extensions extensions;
    public Gost28147_89_MAC hmacPassword;
    public PasswordPolicy passwordPolicy;
    public CertificateLink primaryCertificateLink;
    public Asn1OctetString primaryFP;
    public CProPrivateKeyParameters primaryPrivateKeyParameters;
    public Asn1OctetString primary_certificate;
    public CertificateLink secondaryCertificateLink;
    public Gost28147_89_EncryptedKey secondaryEncryptedPrivateKey;
    public Asn1IA5String secondaryEncryptionContainerName;
    public Asn1OctetString secondaryFP;
    public CProPrivateKeyParameters secondaryPrivateKeyParameters;
    public Asn1OctetString secondary_certificate;

    public GostKeyContainerContent(AlgorithmIdentifier algorithmIdentifier, String str, GostKeyContainerContentAttributes gostKeyContainerContentAttributes, CProPrivateKeyParameters cProPrivateKeyParameters, byte[] bArr, Gost28147_89_EncryptedKey gost28147_89_EncryptedKey, CProPrivateKeyParameters cProPrivateKeyParameters2, byte[] bArr2, byte[] bArr3, String str2, CertificateLink certificateLink, CertificateLink certificateLink2, byte[] bArr4, byte[] bArr5, PasswordPolicy passwordPolicy, long j, Extensions extensions, String str3) {
        this.containerAlgoritmIdentifier = algorithmIdentifier;
        this.containerName = new Asn1IA5String(str);
        this.attributes = gostKeyContainerContentAttributes;
        this.primaryPrivateKeyParameters = cProPrivateKeyParameters;
        this.hmacPassword = new Gost28147_89_MAC(bArr);
        this.secondaryEncryptedPrivateKey = gost28147_89_EncryptedKey;
        this.secondaryPrivateKeyParameters = cProPrivateKeyParameters2;
        this.primary_certificate = new Asn1OctetString(bArr2);
        this.secondary_certificate = new Asn1OctetString(bArr3);
        this.encryptionContainerName = new Asn1IA5String(str2);
        this.primaryCertificateLink = certificateLink;
        this.secondaryCertificateLink = certificateLink2;
        this.primaryFP = new Asn1OctetString(bArr4);
        this.secondaryFP = new Asn1OctetString(bArr5);
        this.passwordPolicy = passwordPolicy;
        this.containerSecurityLevel = new Asn1Integer(j);
        this.extensions = extensions;
        this.secondaryEncryptionContainerName = new Asn1IA5String(str3);
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
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
            this.containerAlgoritmIdentifier = algorithmIdentifier;
            algorithmIdentifier.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 22, intHolder, false)) {
            Asn1IA5String asn1IA5String = new Asn1IA5String();
            this.containerName = asn1IA5String;
            asn1IA5String.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        GostKeyContainerContentAttributes gostKeyContainerContentAttributes = new GostKeyContainerContentAttributes();
        this.attributes = gostKeyContainerContentAttributes;
        gostKeyContainerContentAttributes.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CProPrivateKeyParameters cProPrivateKeyParameters = new CProPrivateKeyParameters();
        this.primaryPrivateKeyParameters = cProPrivateKeyParameters;
        cProPrivateKeyParameters.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 2, intHolder, true)) {
            Gost28147_89_MAC gost28147_89_MAC = new Gost28147_89_MAC();
            this.hmacPassword = gost28147_89_MAC;
            gost28147_89_MAC.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            Gost28147_89_EncryptedKey gost28147_89_EncryptedKey = new Gost28147_89_EncryptedKey();
            this.secondaryEncryptedPrivateKey = gost28147_89_EncryptedKey;
            gost28147_89_EncryptedKey.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            CProPrivateKeyParameters cProPrivateKeyParameters2 = new CProPrivateKeyParameters();
            this.secondaryPrivateKeyParameters = cProPrivateKeyParameters2;
            cProPrivateKeyParameters2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 5, intHolder, true)) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            this.primary_certificate = asn1OctetString;
            asn1OctetString.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 6, intHolder, true)) {
            Asn1OctetString asn1OctetString2 = new Asn1OctetString();
            this.secondary_certificate = asn1OctetString2;
            asn1OctetString2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 7, intHolder, true)) {
            Asn1IA5String asn1IA5String2 = new Asn1IA5String();
            this.encryptionContainerName = asn1IA5String2;
            asn1IA5String2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, true)) {
            CertificateLink certificateLink = new CertificateLink();
            this.primaryCertificateLink = certificateLink;
            certificateLink.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 9, intHolder, true)) {
            CertificateLink certificateLink2 = new CertificateLink();
            this.secondaryCertificateLink = certificateLink2;
            certificateLink2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 10, intHolder, true)) {
            Asn1OctetString asn1OctetString3 = new Asn1OctetString();
            this.primaryFP = asn1OctetString3;
            asn1OctetString3.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 11, intHolder, true)) {
            Asn1OctetString asn1OctetString4 = new Asn1OctetString();
            this.secondaryFP = asn1OctetString4;
            asn1OctetString4.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            PasswordPolicy passwordPolicy = new PasswordPolicy();
            this.passwordPolicy = passwordPolicy;
            passwordPolicy.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.containerSecurityLevel = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 12, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.extensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 13, intHolder, true)) {
            Asn1IA5String asn1IA5String3 = new Asn1IA5String();
            this.secondaryEncryptionContainerName = asn1IA5String3;
            asn1IA5String3.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 0, (short) 0, 22) || peekTag.equals((short) 0, (short) 0, 3) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 0, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 0, 5) || peekTag.equals((short) 128, (short) 0, 6) || peekTag.equals((short) 128, (short) 0, 7) || peekTag.equals((short) 128, (short) 32, 8) || peekTag.equals((short) 128, (short) 32, 9) || peekTag.equals((short) 128, (short) 0, 10) || peekTag.equals((short) 128, (short) 0, 11) || peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 128, (short) 32, 12) || peekTag.equals((short) 128, (short) 0, 13)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1IA5String asn1IA5String = this.secondaryEncryptionContainerName;
        if (asn1IA5String != null) {
            int encode = asn1IA5String.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 13, encode) + encode;
        } else {
            i = 0;
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            int encode2 = extensions.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 12, encode2);
        }
        if (!this.containerSecurityLevel.equals(1L)) {
            i += this.containerSecurityLevel.encode(asn1BerEncodeBuffer, true);
        }
        PasswordPolicy passwordPolicy = this.passwordPolicy;
        if (passwordPolicy != null) {
            i += passwordPolicy.encode(asn1BerEncodeBuffer, true);
        }
        Asn1OctetString asn1OctetString = this.secondaryFP;
        if (asn1OctetString != null) {
            int encode3 = asn1OctetString.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 11, encode3);
        }
        Asn1OctetString asn1OctetString2 = this.primaryFP;
        if (asn1OctetString2 != null) {
            int encode4 = asn1OctetString2.encode(asn1BerEncodeBuffer, false);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 10, encode4);
        }
        CertificateLink certificateLink = this.secondaryCertificateLink;
        if (certificateLink != null) {
            int encode5 = certificateLink.encode(asn1BerEncodeBuffer, false);
            i = i + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode5);
        }
        CertificateLink certificateLink2 = this.primaryCertificateLink;
        if (certificateLink2 != null) {
            int encode6 = certificateLink2.encode(asn1BerEncodeBuffer, false);
            i = i + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode6);
        }
        Asn1IA5String asn1IA5String2 = this.encryptionContainerName;
        if (asn1IA5String2 != null) {
            int encode7 = asn1IA5String2.encode(asn1BerEncodeBuffer, false);
            i = i + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 7, encode7);
        }
        Asn1OctetString asn1OctetString3 = this.secondary_certificate;
        if (asn1OctetString3 != null) {
            int encode8 = asn1OctetString3.encode(asn1BerEncodeBuffer, false);
            i = i + encode8 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 6, encode8);
        }
        Asn1OctetString asn1OctetString4 = this.primary_certificate;
        if (asn1OctetString4 != null) {
            int encode9 = asn1OctetString4.encode(asn1BerEncodeBuffer, false);
            i = i + encode9 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 5, encode9);
        }
        CProPrivateKeyParameters cProPrivateKeyParameters = this.secondaryPrivateKeyParameters;
        if (cProPrivateKeyParameters != null) {
            int encode10 = cProPrivateKeyParameters.encode(asn1BerEncodeBuffer, false);
            i = i + encode10 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode10);
        }
        Gost28147_89_EncryptedKey gost28147_89_EncryptedKey = this.secondaryEncryptedPrivateKey;
        if (gost28147_89_EncryptedKey != null) {
            int encode11 = gost28147_89_EncryptedKey.encode(asn1BerEncodeBuffer, false);
            i = i + encode11 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode11);
        }
        Gost28147_89_MAC gost28147_89_MAC = this.hmacPassword;
        if (gost28147_89_MAC != null) {
            int encode12 = gost28147_89_MAC.encode(asn1BerEncodeBuffer, false);
            i = i + encode12 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode12);
        }
        int encode13 = this.attributes.encode(asn1BerEncodeBuffer, true) + this.primaryPrivateKeyParameters.encode(asn1BerEncodeBuffer, true) + i;
        Asn1IA5String asn1IA5String3 = this.containerName;
        if (asn1IA5String3 != null) {
            encode13 += asn1IA5String3.encode(asn1BerEncodeBuffer, true);
        }
        AlgorithmIdentifier algorithmIdentifier = this.containerAlgoritmIdentifier;
        if (algorithmIdentifier != null) {
            int encode14 = algorithmIdentifier.encode(asn1BerEncodeBuffer, false);
            encode13 = encode13 + encode14 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode14);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode13) + encode13 : encode13;
    }

    public void init() {
        this.containerAlgoritmIdentifier = null;
        this.containerName = null;
        this.attributes = null;
        this.primaryPrivateKeyParameters = null;
        this.hmacPassword = null;
        this.secondaryEncryptedPrivateKey = null;
        this.secondaryPrivateKeyParameters = null;
        this.primary_certificate = null;
        this.secondary_certificate = null;
        this.encryptionContainerName = null;
        this.primaryCertificateLink = null;
        this.secondaryCertificateLink = null;
        this.primaryFP = null;
        this.secondaryFP = null;
        this.passwordPolicy = null;
        this.containerSecurityLevel = new Asn1Integer(1L);
        this.extensions = null;
        this.secondaryEncryptionContainerName = null;
    }

    public GostKeyContainerContent(AlgorithmIdentifier algorithmIdentifier, Asn1IA5String asn1IA5String, GostKeyContainerContentAttributes gostKeyContainerContentAttributes, CProPrivateKeyParameters cProPrivateKeyParameters, Gost28147_89_MAC gost28147_89_MAC, Gost28147_89_EncryptedKey gost28147_89_EncryptedKey, CProPrivateKeyParameters cProPrivateKeyParameters2, Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2, Asn1IA5String asn1IA5String2, CertificateLink certificateLink, CertificateLink certificateLink2, Asn1OctetString asn1OctetString3, Asn1OctetString asn1OctetString4, PasswordPolicy passwordPolicy, Asn1Integer asn1Integer, Extensions extensions, Asn1IA5String asn1IA5String3) {
        this.containerAlgoritmIdentifier = algorithmIdentifier;
        this.containerName = asn1IA5String;
        this.attributes = gostKeyContainerContentAttributes;
        this.primaryPrivateKeyParameters = cProPrivateKeyParameters;
        this.hmacPassword = gost28147_89_MAC;
        this.secondaryEncryptedPrivateKey = gost28147_89_EncryptedKey;
        this.secondaryPrivateKeyParameters = cProPrivateKeyParameters2;
        this.primary_certificate = asn1OctetString;
        this.secondary_certificate = asn1OctetString2;
        this.encryptionContainerName = asn1IA5String2;
        this.primaryCertificateLink = certificateLink;
        this.secondaryCertificateLink = certificateLink2;
        this.primaryFP = asn1OctetString3;
        this.secondaryFP = asn1OctetString4;
        this.passwordPolicy = passwordPolicy;
        this.containerSecurityLevel = asn1Integer;
        this.extensions = extensions;
        this.secondaryEncryptionContainerName = asn1IA5String3;
    }

    public GostKeyContainerContent(GostKeyContainerContentAttributes gostKeyContainerContentAttributes, CProPrivateKeyParameters cProPrivateKeyParameters) {
        this.attributes = gostKeyContainerContentAttributes;
        this.primaryPrivateKeyParameters = cProPrivateKeyParameters;
        this.containerSecurityLevel = new Asn1Integer(1L);
    }

    public GostKeyContainerContent() {
        this.containerSecurityLevel = new Asn1Integer(1L);
    }
}
