package ru.CryptoPro.JCP.ASN.GostR3411_94_ParamSetSyntax;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_UZ;
import ru.CryptoPro.JCP.ASN.GostR3411_94_DigestSyntax.GostR3411_94_Digest;

/* loaded from: classes4.dex */
public class GostR3411_94_ParamSetParameters extends Asn1Type {
    public GostR3411_94_Digest h0;
    public Gost28147_89_UZ hUZ;

    public GostR3411_94_ParamSetParameters(byte[] bArr, byte[] bArr2) {
        this.hUZ = new Gost28147_89_UZ(bArr);
        this.h0 = new GostR3411_94_Digest(bArr2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Gost28147_89_UZ gost28147_89_UZ = new Gost28147_89_UZ();
        this.hUZ = gost28147_89_UZ;
        gost28147_89_UZ.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 4, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        GostR3411_94_Digest gostR3411_94_Digest = new GostR3411_94_Digest();
        this.h0 = gostR3411_94_Digest;
        gostR3411_94_Digest.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 4)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.hUZ.encode(asn1BerEncodeBuffer, true) + this.h0.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.hUZ = null;
        this.h0 = null;
    }

    public GostR3411_94_ParamSetParameters(Gost28147_89_UZ gost28147_89_UZ, GostR3411_94_Digest gostR3411_94_Digest) {
        this.hUZ = gost28147_89_UZ;
        this.h0 = gostR3411_94_Digest;
    }

    public GostR3411_94_ParamSetParameters() {
    }
}
