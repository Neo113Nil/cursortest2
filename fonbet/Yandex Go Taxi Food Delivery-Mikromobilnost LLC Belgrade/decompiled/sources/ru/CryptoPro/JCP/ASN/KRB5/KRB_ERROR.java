package ru.CryptoPro.JCP.ASN.KRB5;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralString;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class KRB_ERROR extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(64, 32, 30);
    public PrincipalName cname;
    public Realm crealm;
    public KerberosTime ctime;
    public Asn1Integer cusec;
    public Asn1OctetString e_data;
    public Asn1GeneralString e_text;
    public Asn1Integer error_code;
    public Asn1Integer msg_type;
    public Asn1Integer pvno;
    public Realm realm;
    public PrincipalName sname;
    public KerberosTime stime;
    public Asn1Integer susec;

    public KRB_ERROR(long j, long j2, String str, long j3, String str2, long j4, long j5, String str3, PrincipalName principalName, String str4, PrincipalName principalName2, String str5, byte[] bArr) {
        this.pvno = new Asn1Integer(j);
        this.msg_type = new Asn1Integer(j2);
        this.ctime = new KerberosTime(str);
        this.cusec = new Asn1Integer(j3);
        this.stime = new KerberosTime(str2);
        this.susec = new Asn1Integer(j4);
        this.error_code = new Asn1Integer(j5);
        this.crealm = new Realm(str3);
        this.cname = principalName;
        this.realm = new Realm(str4);
        this.sname = principalName2;
        this.e_text = new Asn1GeneralString(str5);
        this.e_data = new Asn1OctetString(bArr);
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
            KerberosTime kerberosTime = new KerberosTime();
            this.ctime = kerberosTime;
            kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            Asn1Integer asn1Integer3 = new Asn1Integer();
            this.cusec = asn1Integer3;
            asn1Integer3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KerberosTime kerberosTime2 = new KerberosTime();
        this.stime = kerberosTime2;
        kerberosTime2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer4 = new Asn1Integer();
        this.susec = asn1Integer4;
        asn1Integer4.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer5 = new Asn1Integer();
        this.error_code = asn1Integer5;
        asn1Integer5.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 7, intHolder, true)) {
            Realm realm = new Realm();
            this.crealm = realm;
            realm.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, true)) {
            PrincipalName principalName = new PrincipalName();
            this.cname = principalName;
            principalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 9, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Realm realm2 = new Realm();
        this.realm = realm2;
        realm2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 10, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PrincipalName principalName2 = new PrincipalName();
        this.sname = principalName2;
        principalName2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 11, intHolder, true)) {
            Asn1GeneralString asn1GeneralString = new Asn1GeneralString();
            this.e_text = asn1GeneralString;
            asn1GeneralString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 12, intHolder, true)) {
            Asn1OctetString asn1OctetString = new Asn1OctetString();
            this.e_data = asn1OctetString;
            asn1OctetString.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6) || peekTag.equals((short) 128, (short) 32, 7) || peekTag.equals((short) 128, (short) 32, 8) || peekTag.equals((short) 128, (short) 32, 9) || peekTag.equals((short) 128, (short) 32, 10) || peekTag.equals((short) 128, (short) 32, 11) || peekTag.equals((short) 128, (short) 32, 12)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1OctetString asn1OctetString = this.e_data;
        if (asn1OctetString != null) {
            int encode = asn1OctetString.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 12, encode) + encode;
        } else {
            i = 0;
        }
        Asn1GeneralString asn1GeneralString = this.e_text;
        if (asn1GeneralString != null) {
            int encode2 = asn1GeneralString.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 11, encode2);
        }
        int encode3 = this.sname.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 10, encode3) + i + encode3;
        int encode4 = this.realm.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 9, encode4) + encodeTagAndLength + encode4;
        PrincipalName principalName = this.cname;
        if (principalName != null) {
            int encode5 = principalName.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode5 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode5);
        }
        Realm realm = this.crealm;
        if (realm != null) {
            int encode6 = realm.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode6);
        }
        int encode7 = this.error_code.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode7) + encodeTagAndLength2 + encode7;
        int encode8 = this.susec.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode8) + encodeTagAndLength3 + encode8;
        int encode9 = this.stime.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength5 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode9) + encodeTagAndLength4 + encode9;
        Asn1Integer asn1Integer = this.cusec;
        if (asn1Integer != null) {
            int encode10 = asn1Integer.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength5 = encodeTagAndLength5 + encode10 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode10);
        }
        KerberosTime kerberosTime = this.ctime;
        if (kerberosTime != null) {
            int encode11 = kerberosTime.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength5 = encodeTagAndLength5 + encode11 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode11);
        }
        int encode12 = this.msg_type.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength6 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode12) + encodeTagAndLength5 + encode12;
        int encode13 = this.pvno.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength7 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode13) + encodeTagAndLength6 + encode13;
        int encodeTagAndLength8 = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength7) + encodeTagAndLength7;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength8) + encodeTagAndLength8 : encodeTagAndLength8;
    }

    public void init() {
        this.pvno = null;
        this.msg_type = null;
        this.ctime = null;
        this.cusec = null;
        this.stime = null;
        this.susec = null;
        this.error_code = null;
        this.crealm = null;
        this.cname = null;
        this.realm = null;
        this.sname = null;
        this.e_text = null;
        this.e_data = null;
    }

    public KRB_ERROR(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, KerberosTime kerberosTime, Asn1Integer asn1Integer3, KerberosTime kerberosTime2, Asn1Integer asn1Integer4, Asn1Integer asn1Integer5, Realm realm, PrincipalName principalName, Realm realm2, PrincipalName principalName2, Asn1GeneralString asn1GeneralString, Asn1OctetString asn1OctetString) {
        this.pvno = asn1Integer;
        this.msg_type = asn1Integer2;
        this.ctime = kerberosTime;
        this.cusec = asn1Integer3;
        this.stime = kerberosTime2;
        this.susec = asn1Integer4;
        this.error_code = asn1Integer5;
        this.crealm = realm;
        this.cname = principalName;
        this.realm = realm2;
        this.sname = principalName2;
        this.e_text = asn1GeneralString;
        this.e_data = asn1OctetString;
    }

    public KRB_ERROR(Asn1Integer asn1Integer, Asn1Integer asn1Integer2, KerberosTime kerberosTime, Asn1Integer asn1Integer3, Asn1Integer asn1Integer4, Realm realm, PrincipalName principalName) {
        this.pvno = asn1Integer;
        this.msg_type = asn1Integer2;
        this.stime = kerberosTime;
        this.susec = asn1Integer3;
        this.error_code = asn1Integer4;
        this.realm = realm;
        this.sname = principalName;
    }

    public KRB_ERROR() {
    }

    public KRB_ERROR(long j, long j2, String str, long j3, long j4, String str2, PrincipalName principalName) {
        this.pvno = new Asn1Integer(j);
        this.msg_type = new Asn1Integer(j2);
        this.stime = new KerberosTime(str);
        this.susec = new Asn1Integer(j3);
        this.error_code = new Asn1Integer(j4);
        this.realm = new Realm(str2);
        this.sname = principalName;
    }
}
