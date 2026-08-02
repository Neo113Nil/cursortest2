package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class EncAPRepPart extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(64, 32, 27);
    public KerberosTime ctime;
    public Asn1Integer cusec;
    public Asn1Integer seq_number;
    public EncryptionKey subkey;

    public EncAPRepPart(String str, long j, EncryptionKey encryptionKey, long j2) {
        this.ctime = new KerberosTime(str);
        this.cusec = new Asn1Integer(j);
        this.subkey = encryptionKey;
        this.seq_number = new Asn1Integer(j2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            matchTag(asn1BerDecodeBuffer, TAG);
        }
        int matchTag = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, matchTag);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KerberosTime kerberosTime = new KerberosTime();
        this.ctime = kerberosTime;
        kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.cusec = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            EncryptionKey encryptionKey = new EncryptionKey();
            this.subkey = encryptionKey;
            encryptionKey.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            Asn1Integer asn1Integer2 = new Asn1Integer();
            this.seq_number = asn1Integer2;
            asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1Integer asn1Integer = this.seq_number;
        if (asn1Integer != null) {
            int encode = asn1Integer.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode) + encode;
        } else {
            i = 0;
        }
        EncryptionKey encryptionKey = this.subkey;
        if (encryptionKey != null) {
            int encode2 = encryptionKey.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode2);
        }
        int encode3 = this.cusec.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode3) + i + encode3;
        int encode4 = this.ctime.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode4) + encodeTagAndLength + encode4;
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength2) + encodeTagAndLength2;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength3) + encodeTagAndLength3 : encodeTagAndLength3;
    }

    public void init() {
        this.ctime = null;
        this.cusec = null;
        this.subkey = null;
        this.seq_number = null;
    }

    public EncAPRepPart(KerberosTime kerberosTime, Asn1Integer asn1Integer, EncryptionKey encryptionKey, Asn1Integer asn1Integer2) {
        this.ctime = kerberosTime;
        this.cusec = asn1Integer;
        this.subkey = encryptionKey;
        this.seq_number = asn1Integer2;
    }

    public EncAPRepPart(KerberosTime kerberosTime, Asn1Integer asn1Integer) {
        this.ctime = kerberosTime;
        this.cusec = asn1Integer;
    }

    public EncAPRepPart() {
    }

    public EncAPRepPart(String str, long j) {
        this.ctime = new KerberosTime(str);
        this.cusec = new Asn1Integer(j);
    }
}
