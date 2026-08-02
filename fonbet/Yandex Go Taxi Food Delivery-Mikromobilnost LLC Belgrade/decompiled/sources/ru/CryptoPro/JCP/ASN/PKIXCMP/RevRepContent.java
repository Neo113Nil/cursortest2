package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class RevRepContent extends Asn1Type {
    public RevRepContent_crls crls;
    public RevRepContent_revCerts revCerts;
    public RevRepContent_status status;

    public RevRepContent(RevRepContent_status revRepContent_status, RevRepContent_revCerts revRepContent_revCerts, RevRepContent_crls revRepContent_crls) {
        this.status = revRepContent_status;
        this.revCerts = revRepContent_revCerts;
        this.crls = revRepContent_crls;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        RevRepContent_status revRepContent_status = new RevRepContent_status();
        this.status = revRepContent_status;
        revRepContent_status.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, false)) {
            RevRepContent_revCerts revRepContent_revCerts = new RevRepContent_revCerts();
            this.revCerts = revRepContent_revCerts;
            revRepContent_revCerts.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, false)) {
            RevRepContent_crls revRepContent_crls = new RevRepContent_crls();
            this.crls = revRepContent_crls;
            revRepContent_crls.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        RevRepContent_crls revRepContent_crls = this.crls;
        int encode = revRepContent_crls != null ? revRepContent_crls.encode(asn1BerEncodeBuffer, true) : 0;
        RevRepContent_revCerts revRepContent_revCerts = this.revCerts;
        if (revRepContent_revCerts != null) {
            encode += revRepContent_revCerts.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.status.encode(asn1BerEncodeBuffer, true) + encode;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.status = null;
        this.revCerts = null;
        this.crls = null;
    }

    public RevRepContent() {
    }

    public RevRepContent(RevRepContent_status revRepContent_status) {
        this.status = revRepContent_status;
    }
}
