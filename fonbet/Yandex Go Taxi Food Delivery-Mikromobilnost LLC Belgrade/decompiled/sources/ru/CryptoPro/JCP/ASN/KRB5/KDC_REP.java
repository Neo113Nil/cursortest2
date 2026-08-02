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
public class KDC_REP extends Asn1Type {
    public PrincipalName cname;
    public Realm crealm;
    public EncryptedData enc_part;
    public Asn1Integer msg_type;
    public _SeqOfPA_DATA padata;
    public Asn1Integer pvno;
    public Ticket ticket;

    public KDC_REP(long j, long j2, _SeqOfPA_DATA _seqofpa_data, String str, PrincipalName principalName, Ticket ticket, EncryptedData encryptedData) {
        this.pvno = new Asn1Integer(j);
        this.msg_type = new Asn1Integer(j2);
        this.padata = _seqofpa_data;
        this.crealm = new Realm(str);
        this.cname = principalName;
        this.ticket = ticket;
        this.enc_part = encryptedData;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.pvno = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.msg_type = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            _SeqOfPA_DATA _seqofpa_data = new _SeqOfPA_DATA();
            this.padata = _seqofpa_data;
            _seqofpa_data.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Realm realm = new Realm();
        this.crealm = realm;
        realm.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PrincipalName principalName = new PrincipalName();
        this.cname = principalName;
        principalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Ticket ticket = new Ticket();
        this.ticket = ticket;
        ticket.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        EncryptedData encryptedData = new EncryptedData();
        this.enc_part = encryptedData;
        encryptedData.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int encode = this.enc_part.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode) + encode;
        int encode2 = this.ticket.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode2) + encodeTagAndLength + encode2;
        int encode3 = this.cname.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode3) + encodeTagAndLength2 + encode3;
        int encode4 = this.crealm.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode4) + encodeTagAndLength3 + encode4;
        _SeqOfPA_DATA _seqofpa_data = this.padata;
        if (_seqofpa_data != null) {
            int encode5 = _seqofpa_data.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength4 = encodeTagAndLength4 + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode5);
        }
        int encode6 = this.msg_type.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength5 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode6) + encodeTagAndLength4 + encode6;
        int encode7 = this.pvno.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength6 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode7) + encodeTagAndLength5 + encode7;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength6) + encodeTagAndLength6 : encodeTagAndLength6;
    }

    public void init() {
        this.pvno = null;
        this.msg_type = null;
        this.padata = null;
        this.crealm = null;
        this.cname = null;
        this.ticket = null;
        this.enc_part = null;
    }

    public KDC_REP(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, _SeqOfPA_DATA _seqofpa_data, Realm realm, PrincipalName principalName, Ticket ticket, EncryptedData encryptedData) {
        this.pvno = asn1Integer;
        this.msg_type = asn1Integer2;
        this.padata = _seqofpa_data;
        this.crealm = realm;
        this.cname = principalName;
        this.ticket = ticket;
        this.enc_part = encryptedData;
    }

    public KDC_REP(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, Realm realm, PrincipalName principalName, Ticket ticket, EncryptedData encryptedData) {
        this.pvno = asn1Integer;
        this.msg_type = asn1Integer2;
        this.crealm = realm;
        this.cname = principalName;
        this.ticket = ticket;
        this.enc_part = encryptedData;
    }

    public KDC_REP() {
    }

    public KDC_REP(long j, long j2, String str, PrincipalName principalName, Ticket ticket, EncryptedData encryptedData) {
        this.pvno = new Asn1Integer(j);
        this.msg_type = new Asn1Integer(j2);
        this.crealm = new Realm(str);
        this.cname = principalName;
        this.ticket = ticket;
        this.enc_part = encryptedData;
    }
}
