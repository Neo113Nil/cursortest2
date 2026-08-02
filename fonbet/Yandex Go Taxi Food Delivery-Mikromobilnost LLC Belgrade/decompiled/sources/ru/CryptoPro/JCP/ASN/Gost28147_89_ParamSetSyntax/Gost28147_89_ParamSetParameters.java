package ru.CryptoPro.JCP.ASN.Gost28147_89_ParamSetSyntax;

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
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class Gost28147_89_ParamSetParameters extends Asn1Type {
    public Gost28147_89_UZ eUZ;
    public AlgorithmIdentifier keyMeshing;
    public Gost28147_89_ParamSetParameters_mode mode;
    public Gost28147_89_ParamSetParameters_shiftBits shiftBits;

    public Gost28147_89_ParamSetParameters(byte[] bArr, long j, long j2, AlgorithmIdentifier algorithmIdentifier) {
        this.eUZ = new Gost28147_89_UZ(bArr);
        this.mode = new Gost28147_89_ParamSetParameters_mode(j);
        this.shiftBits = new Gost28147_89_ParamSetParameters_shiftBits(j2);
        this.keyMeshing = algorithmIdentifier;
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
        this.eUZ = gost28147_89_UZ;
        gost28147_89_UZ.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Gost28147_89_ParamSetParameters_mode gost28147_89_ParamSetParameters_mode = new Gost28147_89_ParamSetParameters_mode();
        this.mode = gost28147_89_ParamSetParameters_mode;
        gost28147_89_ParamSetParameters_mode.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Gost28147_89_ParamSetParameters_shiftBits gost28147_89_ParamSetParameters_shiftBits = new Gost28147_89_ParamSetParameters_shiftBits();
        this.shiftBits = gost28147_89_ParamSetParameters_shiftBits;
        gost28147_89_ParamSetParameters_shiftBits.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier();
        this.keyMeshing = algorithmIdentifier;
        algorithmIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 4) || peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.eUZ.encode(asn1BerEncodeBuffer, true) + this.mode.encode(asn1BerEncodeBuffer, true) + this.shiftBits.encode(asn1BerEncodeBuffer, true) + this.keyMeshing.encode(asn1BerEncodeBuffer, true);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.eUZ = null;
        this.mode = null;
        this.shiftBits = null;
        this.keyMeshing = null;
    }

    public Gost28147_89_ParamSetParameters(Gost28147_89_UZ gost28147_89_UZ, Gost28147_89_ParamSetParameters_mode gost28147_89_ParamSetParameters_mode, Gost28147_89_ParamSetParameters_shiftBits gost28147_89_ParamSetParameters_shiftBits, AlgorithmIdentifier algorithmIdentifier) {
        this.eUZ = gost28147_89_UZ;
        this.mode = gost28147_89_ParamSetParameters_mode;
        this.shiftBits = gost28147_89_ParamSetParameters_shiftBits;
        this.keyMeshing = algorithmIdentifier;
    }

    public Gost28147_89_ParamSetParameters() {
    }
}
