package ru.CryptoPro.JCP.ASN.PKIXTSP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class Accuracy extends Asn1Type {
    public Asn1Integer micros;
    public Asn1Integer millis;
    public Asn1Integer seconds;

    public Accuracy(long j, long j2, long j3) {
        this.seconds = new Asn1Integer(j);
        this.millis = new Asn1Integer(j2);
        this.micros = new Asn1Integer(j3);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.seconds = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            Asn1Integer asn1Integer2 = new Asn1Integer();
            this.millis = asn1Integer2;
            asn1Integer2.decode(asn1BerDecodeBuffer, false, intHolder.value);
            long j = this.millis.value;
            if (j < 1 || j > 999) {
                throw new Asn1ConsVioException("millis.value", this.millis.value);
            }
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            Asn1Integer asn1Integer3 = new Asn1Integer();
            this.micros = asn1Integer3;
            asn1Integer3.decode(asn1BerDecodeBuffer, false, intHolder.value);
            long j2 = this.micros.value;
            if (j2 < 1 || j2 > 999) {
                throw new Asn1ConsVioException("micros.value", this.micros.value);
            }
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 2) || peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 0, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1Integer asn1Integer = this.micros;
        if (asn1Integer != null) {
            long j = asn1Integer.value;
            if (j < 1 || j > 999) {
                throw new Asn1ConsVioException("micros.value", this.micros.value);
            }
            int encode = asn1Integer.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode) + encode;
        } else {
            i = 0;
        }
        Asn1Integer asn1Integer2 = this.millis;
        if (asn1Integer2 != null) {
            long j2 = asn1Integer2.value;
            if (j2 < 1 || j2 > 999) {
                throw new Asn1ConsVioException("millis.value", this.millis.value);
            }
            int encode2 = asn1Integer2.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2);
        }
        Asn1Integer asn1Integer3 = this.seconds;
        if (asn1Integer3 != null) {
            i += asn1Integer3.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.seconds = null;
        this.millis = null;
        this.micros = null;
    }

    public Accuracy(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, Asn1Integer asn1Integer3) {
        this.seconds = asn1Integer;
        this.millis = asn1Integer2;
        this.micros = asn1Integer3;
    }

    public Accuracy() {
    }
}
