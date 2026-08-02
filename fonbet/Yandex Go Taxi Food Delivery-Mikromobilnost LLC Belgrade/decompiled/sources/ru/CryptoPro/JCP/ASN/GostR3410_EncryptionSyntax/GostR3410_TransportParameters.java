package ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_ParamSet;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;

/* loaded from: classes4.dex */
public class GostR3410_TransportParameters extends Asn1Type {
    public Gost28147_89_ParamSet encryptionParamSet;
    public SubjectPublicKeyInfo ephemeralPublicKey;
    public Asn1OctetString ukm;

    public GostR3410_TransportParameters(int[] iArr, SubjectPublicKeyInfo subjectPublicKeyInfo, byte[] bArr) {
        this.encryptionParamSet = new Gost28147_89_ParamSet(iArr);
        this.ephemeralPublicKey = subjectPublicKeyInfo;
        this.ukm = new Asn1OctetString(bArr);
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
        Gost28147_89_ParamSet gost28147_89_ParamSet = new Gost28147_89_ParamSet();
        this.encryptionParamSet = gost28147_89_ParamSet;
        gost28147_89_ParamSet.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
            this.ephemeralPublicKey = subjectPublicKeyInfo;
            subjectPublicKeyInfo.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        this.ukm = asn1OctetString;
        asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (this.ukm.getLength() != 8) {
            throw new Asn1ConsVioException("ukm.getLength()", this.ukm.getLength());
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 0, (short) 0, 4)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        if (this.ukm.getLength() != 8) {
            throw new Asn1ConsVioException("ukm.getLength()", this.ukm.getLength());
        }
        int encode = this.ukm.encode(asn1BerEncodeBuffer, true);
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.ephemeralPublicKey;
        if (subjectPublicKeyInfo != null) {
            int encode2 = subjectPublicKeyInfo.encode(asn1BerEncodeBuffer, false);
            encode = encode + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode2);
        }
        int encode3 = this.encryptionParamSet.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.encryptionParamSet = null;
        this.ephemeralPublicKey = null;
        this.ukm = null;
    }

    public GostR3410_TransportParameters(Gost28147_89_ParamSet gost28147_89_ParamSet, SubjectPublicKeyInfo subjectPublicKeyInfo, Asn1OctetString asn1OctetString) {
        this.encryptionParamSet = gost28147_89_ParamSet;
        this.ephemeralPublicKey = subjectPublicKeyInfo;
        this.ukm = asn1OctetString;
    }

    public GostR3410_TransportParameters(Gost28147_89_ParamSet gost28147_89_ParamSet, Asn1OctetString asn1OctetString) {
        this.encryptionParamSet = gost28147_89_ParamSet;
        this.ukm = asn1OctetString;
    }

    public GostR3410_TransportParameters() {
    }

    public GostR3410_TransportParameters(int[] iArr, byte[] bArr) {
        this.encryptionParamSet = new Gost28147_89_ParamSet(iArr);
        this.ukm = new Asn1OctetString(bArr);
    }
}
