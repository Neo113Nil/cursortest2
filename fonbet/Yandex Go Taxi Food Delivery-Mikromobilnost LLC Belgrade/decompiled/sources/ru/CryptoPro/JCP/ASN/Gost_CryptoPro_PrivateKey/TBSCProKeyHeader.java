package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.Asn1UTF8String;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;

/* loaded from: classes4.dex */
public class TBSCProKeyHeader extends Asn1Type {
    public CProKCCAttributes attributes;
    public CProSoftAuthInfo authInfo;
    public AlgorithmIdentifier containerAlgoritmIdentifier;
    public Asn1UTF8String containerName;
    public Asn1Integer containerSecurityLevel;
    public Extensions extensions;
    public CProKeyInfo primaryKey;
    public Asn1UTF8String secondaryEncryptionContainerName;
    public CProKeyInfo secondaryKey;

    public TBSCProKeyHeader(AlgorithmIdentifier algorithmIdentifier, String str, CProKCCAttributes cProKCCAttributes, long j, CProSoftAuthInfo cProSoftAuthInfo, CProKeyInfo cProKeyInfo, CProKeyInfo cProKeyInfo2, Extensions extensions, String str2) {
        this.containerAlgoritmIdentifier = algorithmIdentifier;
        this.containerName = new Asn1UTF8String(str);
        this.attributes = cProKCCAttributes;
        this.containerSecurityLevel = new Asn1Integer(j);
        this.authInfo = cProSoftAuthInfo;
        this.primaryKey = cProKeyInfo;
        this.secondaryKey = cProKeyInfo2;
        this.extensions = extensions;
        this.secondaryEncryptionContainerName = new Asn1UTF8String(str2);
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
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 12, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1UTF8String asn1UTF8String = new Asn1UTF8String();
        this.containerName = asn1UTF8String;
        asn1UTF8String.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 3, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CProKCCAttributes cProKCCAttributes = new CProKCCAttributes();
        this.attributes = cProKCCAttributes;
        cProKCCAttributes.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.containerSecurityLevel = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            CProSoftAuthInfo cProSoftAuthInfo = new CProSoftAuthInfo();
            this.authInfo = cProSoftAuthInfo;
            cProSoftAuthInfo.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            CProKeyInfo cProKeyInfo = new CProKeyInfo();
            this.primaryKey = cProKeyInfo;
            cProKeyInfo.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            CProKeyInfo cProKeyInfo2 = new CProKeyInfo();
            this.secondaryKey = cProKeyInfo2;
            cProKeyInfo2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.extensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 5, intHolder, true)) {
            Asn1UTF8String asn1UTF8String2 = new Asn1UTF8String();
            this.secondaryEncryptionContainerName = asn1UTF8String2;
            asn1UTF8String2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 0, (short) 0, 12) || peekTag.equals((short) 0, (short) 0, 3) || peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 0, 5)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1UTF8String asn1UTF8String = this.secondaryEncryptionContainerName;
        if (asn1UTF8String != null) {
            int encode = asn1UTF8String.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 5, encode) + encode;
        } else {
            i = 0;
        }
        Extensions extensions = this.extensions;
        if (extensions != null) {
            int encode2 = extensions.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode2);
        }
        CProKeyInfo cProKeyInfo = this.secondaryKey;
        if (cProKeyInfo != null) {
            int encode3 = cProKeyInfo.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode3);
        }
        CProKeyInfo cProKeyInfo2 = this.primaryKey;
        if (cProKeyInfo2 != null) {
            int encode4 = cProKeyInfo2.encode(asn1BerEncodeBuffer, false);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode4);
        }
        CProSoftAuthInfo cProSoftAuthInfo = this.authInfo;
        if (cProSoftAuthInfo != null) {
            int encode5 = cProSoftAuthInfo.encode(asn1BerEncodeBuffer, false);
            i = i + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode5);
        }
        if (!this.containerSecurityLevel.equals(1L)) {
            i += this.containerSecurityLevel.encode(asn1BerEncodeBuffer, true);
        }
        int encode6 = this.containerName.encode(asn1BerEncodeBuffer, true) + this.attributes.encode(asn1BerEncodeBuffer, true) + i;
        AlgorithmIdentifier algorithmIdentifier = this.containerAlgoritmIdentifier;
        if (algorithmIdentifier != null) {
            int encode7 = algorithmIdentifier.encode(asn1BerEncodeBuffer, false);
            encode6 = encode6 + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode7);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode6) + encode6 : encode6;
    }

    public void init() {
        this.containerAlgoritmIdentifier = null;
        this.containerName = null;
        this.attributes = null;
        this.containerSecurityLevel = new Asn1Integer(1L);
        this.authInfo = null;
        this.primaryKey = null;
        this.secondaryKey = null;
        this.extensions = null;
        this.secondaryEncryptionContainerName = null;
    }

    public TBSCProKeyHeader(AlgorithmIdentifier algorithmIdentifier, Asn1UTF8String asn1UTF8String, CProKCCAttributes cProKCCAttributes, Asn1Integer asn1Integer, CProSoftAuthInfo cProSoftAuthInfo, CProKeyInfo cProKeyInfo, CProKeyInfo cProKeyInfo2, Extensions extensions, Asn1UTF8String asn1UTF8String2) {
        this.containerAlgoritmIdentifier = algorithmIdentifier;
        this.containerName = asn1UTF8String;
        this.attributes = cProKCCAttributes;
        this.containerSecurityLevel = asn1Integer;
        this.authInfo = cProSoftAuthInfo;
        this.primaryKey = cProKeyInfo;
        this.secondaryKey = cProKeyInfo2;
        this.extensions = extensions;
        this.secondaryEncryptionContainerName = asn1UTF8String2;
    }

    public TBSCProKeyHeader(Asn1UTF8String asn1UTF8String, CProKCCAttributes cProKCCAttributes) {
        this.containerName = asn1UTF8String;
        this.attributes = cProKCCAttributes;
        this.containerSecurityLevel = new Asn1Integer(1L);
    }

    public TBSCProKeyHeader() {
        this.containerSecurityLevel = new Asn1Integer(1L);
    }

    public TBSCProKeyHeader(String str, CProKCCAttributes cProKCCAttributes) {
        this.containerName = new Asn1UTF8String(str);
        this.attributes = cProKCCAttributes;
        this.containerSecurityLevel = new Asn1Integer(1L);
    }
}
