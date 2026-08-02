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

/* loaded from: classes4.dex */
public class Gost28147_89_KeyWrapParameters extends Asn1Type {
    public Gost28147_89_ParamSet encryptionParamSet;
    public Asn1OctetString ukm;

    public Gost28147_89_KeyWrapParameters(int[] iArr, byte[] bArr) {
        this.encryptionParamSet = new Gost28147_89_ParamSet(iArr);
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
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            this.ukm = asn1OctetString;
            asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
            if (this.ukm.getLength() != 8) {
                throw new Asn1ConsVioException("ukm.getLength()", this.ukm.getLength());
            }
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 0, 4)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1OctetString asn1OctetString = this.ukm;
        if (asn1OctetString == null) {
            i = 0;
        } else {
            if (asn1OctetString.getLength() != 8) {
                throw new Asn1ConsVioException("ukm.getLength()", this.ukm.getLength());
            }
            i = this.ukm.encode(asn1BerEncodeBuffer, true);
        }
        int encode = this.encryptionParamSet.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.encryptionParamSet = null;
        this.ukm = null;
    }

    public Gost28147_89_KeyWrapParameters(Gost28147_89_ParamSet gost28147_89_ParamSet, Asn1OctetString asn1OctetString) {
        this.encryptionParamSet = gost28147_89_ParamSet;
        this.ukm = asn1OctetString;
    }

    public Gost28147_89_KeyWrapParameters(Gost28147_89_ParamSet gost28147_89_ParamSet) {
        this.encryptionParamSet = gost28147_89_ParamSet;
    }

    public Gost28147_89_KeyWrapParameters() {
    }

    public Gost28147_89_KeyWrapParameters(int[] iArr) {
        this.encryptionParamSet = new Gost28147_89_ParamSet(iArr);
    }
}
