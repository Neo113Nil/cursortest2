package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_KeyExport;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class ForeignOpaqueSpecific extends Asn1Type {
    public Asn1OctetString cipher_data;
    public Asn1OctetString cipher_data_chk;
    public Asn1Integer effectiveKeyLength;
    public Asn1OctetString finalBlock;
    public GCM_CTX_DATA gcm_ctx;
    public Asn1Boolean isEnc;
    public Asn1Integer num_state;
    public Asn1OctetString salt;

    public ForeignOpaqueSpecific(boolean z, long j, byte[] bArr, byte[] bArr2, long j2, byte[] bArr3, byte[] bArr4, GCM_CTX_DATA gcm_ctx_data) {
        this.isEnc = new Asn1Boolean(z);
        this.effectiveKeyLength = new Asn1Integer(j);
        this.salt = new Asn1OctetString(bArr);
        this.finalBlock = new Asn1OctetString(bArr2);
        this.num_state = new Asn1Integer(j2);
        this.cipher_data = new Asn1OctetString(bArr3);
        this.cipher_data_chk = new Asn1OctetString(bArr4);
        this.gcm_ctx = gcm_ctx_data;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 1, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Boolean asn1Boolean = new Asn1Boolean();
        this.isEnc = asn1Boolean;
        asn1Boolean.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.effectiveKeyLength = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            this.salt = asn1OctetString;
            asn1OctetString.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 2, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1OctetString asn1OctetString2 = new Asn1OctetString();
        this.finalBlock = asn1OctetString2;
        asn1OctetString2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 3, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.num_state = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 4, intHolder, true)) {
            Asn1OctetString asn1OctetString3 = new Asn1OctetString();
            this.cipher_data = asn1OctetString3;
            asn1OctetString3.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 5, intHolder, true)) {
            Asn1OctetString asn1OctetString4 = new Asn1OctetString();
            this.cipher_data_chk = asn1OctetString4;
            asn1OctetString4.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            GCM_CTX_DATA gcm_ctx_data = new GCM_CTX_DATA();
            this.gcm_ctx = gcm_ctx_data;
            gcm_ctx_data.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 1) || peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 0, 1) || peekTag.equals((short) 128, (short) 0, 2) || peekTag.equals((short) 128, (short) 0, 3) || peekTag.equals((short) 128, (short) 0, 4) || peekTag.equals((short) 128, (short) 0, 5) || peekTag.equals((short) 128, (short) 32, 6)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        GCM_CTX_DATA gcm_ctx_data = this.gcm_ctx;
        if (gcm_ctx_data != null) {
            int encode = gcm_ctx_data.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode) + encode;
        } else {
            i = 0;
        }
        Asn1OctetString asn1OctetString = this.cipher_data_chk;
        if (asn1OctetString != null) {
            int encode2 = asn1OctetString.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 5, encode2);
        }
        Asn1OctetString asn1OctetString2 = this.cipher_data;
        if (asn1OctetString2 != null) {
            int encode3 = asn1OctetString2.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 4, encode3);
        }
        int encode4 = this.num_state.encode(asn1BerEncodeBuffer, false);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 3, encode4) + i + encode4;
        int encode5 = this.finalBlock.encode(asn1BerEncodeBuffer, false);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 2, encode5) + encodeTagAndLength + encode5;
        Asn1OctetString asn1OctetString3 = this.salt;
        if (asn1OctetString3 != null) {
            int encode6 = asn1OctetString3.encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength2 = encodeTagAndLength2 + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode6);
        }
        Asn1Integer asn1Integer = this.effectiveKeyLength;
        if (asn1Integer != null) {
            int encode7 = asn1Integer.encode(asn1BerEncodeBuffer, false);
            encodeTagAndLength2 = encodeTagAndLength2 + encode7 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode7);
        }
        int encode8 = this.isEnc.encode(asn1BerEncodeBuffer, true) + encodeTagAndLength2;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode8) + encode8 : encode8;
    }

    public void init() {
        this.isEnc = null;
        this.effectiveKeyLength = null;
        this.salt = null;
        this.finalBlock = null;
        this.num_state = null;
        this.cipher_data = null;
        this.cipher_data_chk = null;
        this.gcm_ctx = null;
    }

    public ForeignOpaqueSpecific(Asn1Boolean asn1Boolean, Asn1Integer asn1Integer, Asn1OctetString asn1OctetString, Asn1OctetString asn1OctetString2, Asn1Integer asn1Integer2, Asn1OctetString asn1OctetString3, Asn1OctetString asn1OctetString4, GCM_CTX_DATA gcm_ctx_data) {
        this.isEnc = asn1Boolean;
        this.effectiveKeyLength = asn1Integer;
        this.salt = asn1OctetString;
        this.finalBlock = asn1OctetString2;
        this.num_state = asn1Integer2;
        this.cipher_data = asn1OctetString3;
        this.cipher_data_chk = asn1OctetString4;
        this.gcm_ctx = gcm_ctx_data;
    }

    public ForeignOpaqueSpecific(Asn1Boolean asn1Boolean, Asn1OctetString asn1OctetString, Asn1Integer asn1Integer) {
        this.isEnc = asn1Boolean;
        this.finalBlock = asn1OctetString;
        this.num_state = asn1Integer;
    }

    public ForeignOpaqueSpecific() {
    }

    public ForeignOpaqueSpecific(boolean z, byte[] bArr, long j) {
        this.isEnc = new Asn1Boolean(z);
        this.finalBlock = new Asn1OctetString(bArr);
        this.num_state = new Asn1Integer(j);
    }
}
