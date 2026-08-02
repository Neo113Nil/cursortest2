package ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OpenExt;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class Gost28147_89_BlobParameters extends Asn1Type {
    public Gost28147_89_ParamSet encryptionParamSet;
    public Asn1OpenExt extElem1;

    public Gost28147_89_BlobParameters(int[] iArr) {
        this.encryptionParamSet = new Gost28147_89_ParamSet(iArr);
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
        if (asn1BerDecodeContext.expired()) {
            this.extElem1 = null;
        } else {
            if (asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 6)) {
                quz.g();
                return;
            }
            this.extElem1 = new Asn1OpenExt();
            while (!asn1BerDecodeContext.expired()) {
                this.extElem1.decodeComponent(asn1BerDecodeBuffer);
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1OpenExt asn1OpenExt = this.extElem1;
        int encode = this.encryptionParamSet.encode(asn1BerEncodeBuffer, true) + (asn1OpenExt != null ? asn1OpenExt.encode(asn1BerEncodeBuffer, false) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.encryptionParamSet = null;
        this.extElem1 = null;
    }

    public Gost28147_89_BlobParameters(Gost28147_89_ParamSet gost28147_89_ParamSet) {
        this.encryptionParamSet = gost28147_89_ParamSet;
    }

    public Gost28147_89_BlobParameters() {
    }
}
