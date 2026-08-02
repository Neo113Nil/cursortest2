package ru.CryptoPro.JCP.ASN.PKIXTSP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BigInteger;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralName;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;

/* loaded from: classes4.dex */
public class TSTInfo extends Asn1Type {
    public Accuracy accuracy;
    public Extensions extensions;
    public Asn1GeneralizedTime genTime;
    public MessageImprint messageImprint;
    public Asn1BigInteger nonce;
    public Asn1Boolean ordering;
    public TSAPolicyId policy;
    public Asn1BigInteger serialNumber;
    public GeneralName tsa;
    public TSTInfo_version version;

    public TSTInfo(TSTInfo_version tSTInfo_version, int[] iArr, MessageImprint messageImprint, Asn1BigInteger asn1BigInteger, String str, Accuracy accuracy, boolean z, Asn1BigInteger asn1BigInteger2, GeneralName generalName, Extensions extensions) {
        this.version = tSTInfo_version;
        this.policy = new TSAPolicyId(iArr);
        this.messageImprint = messageImprint;
        this.serialNumber = asn1BigInteger;
        this.genTime = new Asn1GeneralizedTime(str);
        this.accuracy = accuracy;
        this.ordering = new Asn1Boolean(z);
        this.nonce = asn1BigInteger2;
        this.tsa = generalName;
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
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        TSTInfo_version tSTInfo_version = new TSTInfo_version();
        this.version = tSTInfo_version;
        tSTInfo_version.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        TSAPolicyId tSAPolicyId = new TSAPolicyId();
        this.policy = tSAPolicyId;
        tSAPolicyId.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        MessageImprint messageImprint = new MessageImprint();
        this.messageImprint = messageImprint;
        messageImprint.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1BigInteger asn1BigInteger = new Asn1BigInteger();
        this.serialNumber = asn1BigInteger;
        asn1BigInteger.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 24, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime(true);
        this.genTime = asn1GeneralizedTime;
        asn1GeneralizedTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            Accuracy accuracy = new Accuracy();
            this.accuracy = accuracy;
            accuracy.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 1, intHolder, false)) {
            Asn1Boolean asn1Boolean = new Asn1Boolean();
            this.ordering = asn1Boolean;
            asn1Boolean.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1BigInteger asn1BigInteger2 = new Asn1BigInteger();
            this.nonce = asn1BigInteger2;
            asn1BigInteger2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            GeneralName generalName = new GeneralName();
            this.tsa = generalName;
            generalName.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            Extensions extensions = new Extensions();
            this.extensions = extensions;
            extensions.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 24) || peekTag.equals((short) 0, (short) 0, 1) || peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Extensions extensions = this.extensions;
        if (extensions != null) {
            int encode = extensions.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode) + encode;
        } else {
            i = 0;
        }
        GeneralName generalName = this.tsa;
        if (generalName != null) {
            int encode2 = generalName.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode2);
        }
        Asn1BigInteger asn1BigInteger = this.nonce;
        if (asn1BigInteger != null) {
            i += asn1BigInteger.encode(asn1BerEncodeBuffer, true);
        }
        if (!this.ordering.equals(false)) {
            i += this.ordering.encode(asn1BerEncodeBuffer, true);
        }
        Accuracy accuracy = this.accuracy;
        if (accuracy != null) {
            i += accuracy.encode(asn1BerEncodeBuffer, true);
        }
        int encode3 = this.version.encode(asn1BerEncodeBuffer, true) + this.policy.encode(asn1BerEncodeBuffer, true) + this.messageImprint.encode(asn1BerEncodeBuffer, true) + this.serialNumber.encode(asn1BerEncodeBuffer, true) + this.genTime.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.version = null;
        this.policy = null;
        this.messageImprint = null;
        this.serialNumber = null;
        this.genTime = null;
        this.accuracy = null;
        this.ordering = new Asn1Boolean(false);
        this.nonce = null;
        this.tsa = null;
        this.extensions = null;
    }

    public TSTInfo(TSTInfo_version tSTInfo_version, TSAPolicyId tSAPolicyId, MessageImprint messageImprint, Asn1BigInteger asn1BigInteger, Asn1GeneralizedTime asn1GeneralizedTime, Accuracy accuracy, Asn1Boolean asn1Boolean, Asn1BigInteger asn1BigInteger2, GeneralName generalName, Extensions extensions) {
        this.version = tSTInfo_version;
        this.policy = tSAPolicyId;
        this.messageImprint = messageImprint;
        this.serialNumber = asn1BigInteger;
        this.genTime = asn1GeneralizedTime;
        this.accuracy = accuracy;
        this.ordering = asn1Boolean;
        this.nonce = asn1BigInteger2;
        this.tsa = generalName;
        this.extensions = extensions;
    }

    public TSTInfo(TSTInfo_version tSTInfo_version, TSAPolicyId tSAPolicyId, MessageImprint messageImprint, Asn1BigInteger asn1BigInteger, Asn1GeneralizedTime asn1GeneralizedTime) {
        this.version = tSTInfo_version;
        this.policy = tSAPolicyId;
        this.messageImprint = messageImprint;
        this.serialNumber = asn1BigInteger;
        this.genTime = asn1GeneralizedTime;
        this.ordering = new Asn1Boolean(false);
    }

    public TSTInfo() {
        this.ordering = new Asn1Boolean(false);
    }

    public TSTInfo(TSTInfo_version tSTInfo_version, int[] iArr, MessageImprint messageImprint, Asn1BigInteger asn1BigInteger, String str) {
        this.version = tSTInfo_version;
        this.policy = new TSAPolicyId(iArr);
        this.messageImprint = messageImprint;
        this.serialNumber = asn1BigInteger;
        this.genTime = new Asn1GeneralizedTime(str);
        this.ordering = new Asn1Boolean(false);
    }
}
