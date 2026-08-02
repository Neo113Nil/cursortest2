package ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_ParamSet;

/* loaded from: classes4.dex */
public class GostR3410_2001_PublicKeyParameters extends Asn1Type {
    public Asn1ObjectIdentifier digestParamSet;
    public Gost28147_89_ParamSet encryptionParamSet;
    public Asn1ObjectIdentifier publicKeyParamSet;

    public GostR3410_2001_PublicKeyParameters(int[] iArr, int[] iArr2, int[] iArr3) {
        this.publicKeyParamSet = new Asn1ObjectIdentifier(iArr);
        this.digestParamSet = new Asn1ObjectIdentifier(iArr2);
        this.encryptionParamSet = new Gost28147_89_ParamSet(iArr3);
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
        this.publicKeyParamSet = asn1ObjectIdentifier;
        asn1ObjectIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier();
        this.digestParamSet = asn1ObjectIdentifier2;
        asn1ObjectIdentifier2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            Gost28147_89_ParamSet gost28147_89_ParamSet = new Gost28147_89_ParamSet();
            this.encryptionParamSet = gost28147_89_ParamSet;
            gost28147_89_ParamSet.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 6)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Gost28147_89_ParamSet gost28147_89_ParamSet = this.encryptionParamSet;
        int encode = this.publicKeyParamSet.encode(asn1BerEncodeBuffer, true) + this.digestParamSet.encode(asn1BerEncodeBuffer, true) + (gost28147_89_ParamSet != null ? gost28147_89_ParamSet.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.publicKeyParamSet = null;
        this.digestParamSet = null;
        this.encryptionParamSet = null;
    }

    public GostR3410_2001_PublicKeyParameters(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1ObjectIdentifier asn1ObjectIdentifier2, Gost28147_89_ParamSet gost28147_89_ParamSet) {
        this.publicKeyParamSet = asn1ObjectIdentifier;
        this.digestParamSet = asn1ObjectIdentifier2;
        this.encryptionParamSet = gost28147_89_ParamSet;
    }

    public GostR3410_2001_PublicKeyParameters(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1ObjectIdentifier asn1ObjectIdentifier2) {
        this.publicKeyParamSet = asn1ObjectIdentifier;
        this.digestParamSet = asn1ObjectIdentifier2;
    }

    public GostR3410_2001_PublicKeyParameters() {
    }

    public GostR3410_2001_PublicKeyParameters(int[] iArr, int[] iArr2) {
        this.publicKeyParamSet = new Asn1ObjectIdentifier(iArr);
        this.digestParamSet = new Asn1ObjectIdentifier(iArr2);
    }
}
