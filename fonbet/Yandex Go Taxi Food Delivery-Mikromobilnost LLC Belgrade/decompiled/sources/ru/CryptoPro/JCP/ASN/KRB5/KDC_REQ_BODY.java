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
public class KDC_REQ_BODY extends Asn1Type {
    public _SeqOfTicket additional_tickets;
    public HostAddresses addresses;
    public PrincipalName cname;
    public EncryptedData enc_authorization_data;
    public KDC_REQ_BODY_etype etype;
    public KerberosTime from;
    public KDCOptions kdc_options;
    public Asn1Integer nonce;
    public Realm realm;
    public KerberosTime rtime;
    public PrincipalName sname;
    public KerberosTime till;

    public KDC_REQ_BODY(KDCOptions kDCOptions, PrincipalName principalName, String str, PrincipalName principalName2, String str2, String str3, String str4, long j, KDC_REQ_BODY_etype kDC_REQ_BODY_etype, HostAddresses hostAddresses, EncryptedData encryptedData, _SeqOfTicket _seqofticket) {
        this.kdc_options = kDCOptions;
        this.cname = principalName;
        this.realm = new Realm(str);
        this.sname = principalName2;
        this.from = new KerberosTime(str2);
        this.till = new KerberosTime(str3);
        this.rtime = new KerberosTime(str4);
        this.nonce = new Asn1Integer(j);
        this.etype = kDC_REQ_BODY_etype;
        this.addresses = hostAddresses;
        this.enc_authorization_data = encryptedData;
        this.additional_tickets = _seqofticket;
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
        KDCOptions kDCOptions = new KDCOptions();
        this.kdc_options = kDCOptions;
        kDCOptions.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            PrincipalName principalName = new PrincipalName();
            this.cname = principalName;
            principalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Realm realm = new Realm();
        this.realm = realm;
        realm.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            PrincipalName principalName2 = new PrincipalName();
            this.sname = principalName2;
            principalName2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            KerberosTime kerberosTime = new KerberosTime();
            this.from = kerberosTime;
            kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KerberosTime kerberosTime2 = new KerberosTime();
        this.till = kerberosTime2;
        kerberosTime2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            KerberosTime kerberosTime3 = new KerberosTime();
            this.rtime = kerberosTime3;
            kerberosTime3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 7, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer = new Asn1Integer();
        this.nonce = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KDC_REQ_BODY_etype kDC_REQ_BODY_etype = new KDC_REQ_BODY_etype();
        this.etype = kDC_REQ_BODY_etype;
        kDC_REQ_BODY_etype.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 9, intHolder, true)) {
            HostAddresses hostAddresses = new HostAddresses();
            this.addresses = hostAddresses;
            hostAddresses.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 10, intHolder, true)) {
            EncryptedData encryptedData = new EncryptedData();
            this.enc_authorization_data = encryptedData;
            encryptedData.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 11, intHolder, true)) {
            _SeqOfTicket _seqofticket = new _SeqOfTicket();
            this.additional_tickets = _seqofticket;
            _seqofticket.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6) || peekTag.equals((short) 128, (short) 32, 7) || peekTag.equals((short) 128, (short) 32, 8) || peekTag.equals((short) 128, (short) 32, 9) || peekTag.equals((short) 128, (short) 32, 10) || peekTag.equals((short) 128, (short) 32, 11)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        _SeqOfTicket _seqofticket = this.additional_tickets;
        if (_seqofticket != null) {
            int encode = _seqofticket.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 11, encode) + encode;
        } else {
            i = 0;
        }
        EncryptedData encryptedData = this.enc_authorization_data;
        if (encryptedData != null) {
            int encode2 = encryptedData.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 10, encode2);
        }
        HostAddresses hostAddresses = this.addresses;
        if (hostAddresses != null) {
            int encode3 = hostAddresses.encode(asn1BerEncodeBuffer, true);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode3);
        }
        int encode4 = this.etype.encode(asn1BerEncodeBuffer, true) + i;
        int encode5 = this.nonce.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode5) + encode4 + encode5;
        KerberosTime kerberosTime = this.rtime;
        if (kerberosTime != null) {
            int encode6 = kerberosTime.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength = encodeTagAndLength + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode6);
        }
        int encode7 = this.till.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode7) + encodeTagAndLength + encode7;
        KerberosTime kerberosTime2 = this.from;
        if (kerberosTime2 != null) {
            int encode8 = kerberosTime2.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode8 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode8);
        }
        PrincipalName principalName = this.sname;
        if (principalName != null) {
            int encode9 = principalName.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode9 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode9);
        }
        int encode10 = this.realm.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode10) + encodeTagAndLength2 + encode10;
        PrincipalName principalName2 = this.cname;
        if (principalName2 != null) {
            int encode11 = principalName2.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength3 = encodeTagAndLength3 + encode11 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode11);
        }
        int encode12 = this.kdc_options.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode12) + encodeTagAndLength3 + encode12;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength4) + encodeTagAndLength4 : encodeTagAndLength4;
    }

    public void init() {
        this.kdc_options = null;
        this.cname = null;
        this.realm = null;
        this.sname = null;
        this.from = null;
        this.till = null;
        this.rtime = null;
        this.nonce = null;
        this.etype = null;
        this.addresses = null;
        this.enc_authorization_data = null;
        this.additional_tickets = null;
    }

    public KDC_REQ_BODY(KDCOptions kDCOptions, PrincipalName principalName, Realm realm, PrincipalName principalName2, KerberosTime kerberosTime, KerberosTime kerberosTime2, KerberosTime kerberosTime3, Asn1Integer asn1Integer, KDC_REQ_BODY_etype kDC_REQ_BODY_etype, HostAddresses hostAddresses, EncryptedData encryptedData, _SeqOfTicket _seqofticket) {
        this.kdc_options = kDCOptions;
        this.cname = principalName;
        this.realm = realm;
        this.sname = principalName2;
        this.from = kerberosTime;
        this.till = kerberosTime2;
        this.rtime = kerberosTime3;
        this.nonce = asn1Integer;
        this.etype = kDC_REQ_BODY_etype;
        this.addresses = hostAddresses;
        this.enc_authorization_data = encryptedData;
        this.additional_tickets = _seqofticket;
    }

    public KDC_REQ_BODY(KDCOptions kDCOptions, Realm realm, KerberosTime kerberosTime, Asn1Integer asn1Integer, KDC_REQ_BODY_etype kDC_REQ_BODY_etype) {
        this.kdc_options = kDCOptions;
        this.realm = realm;
        this.till = kerberosTime;
        this.nonce = asn1Integer;
        this.etype = kDC_REQ_BODY_etype;
    }

    public KDC_REQ_BODY() {
    }

    public KDC_REQ_BODY(KDCOptions kDCOptions, String str, String str2, long j, KDC_REQ_BODY_etype kDC_REQ_BODY_etype) {
        this.kdc_options = kDCOptions;
        this.realm = new Realm(str);
        this.till = new KerberosTime(str2);
        this.nonce = new Asn1Integer(j);
        this.etype = kDC_REQ_BODY_etype;
    }
}
