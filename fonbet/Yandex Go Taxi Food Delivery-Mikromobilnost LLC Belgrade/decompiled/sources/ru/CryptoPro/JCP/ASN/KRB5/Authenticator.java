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
public class Authenticator extends Asn1Type {
    public static final Asn1Tag TAG = new Asn1Tag(64, 32, 2);
    public Asn1Integer authenticator_vno;
    public AuthorizationData authorization_data;
    public Checksum cksum;
    public PrincipalName cname;
    public Realm crealm;
    public KerberosTime ctime;
    public Asn1Integer cusec;
    public Asn1Integer seq_number;
    public EncryptionKey subkey;

    public Authenticator(long j, String str, PrincipalName principalName, Checksum checksum, long j2, String str2, EncryptionKey encryptionKey, long j3, AuthorizationData authorizationData) {
        this.authenticator_vno = new Asn1Integer(j);
        this.crealm = new Realm(str);
        this.cname = principalName;
        this.cksum = checksum;
        this.cusec = new Asn1Integer(j2);
        this.ctime = new KerberosTime(str2);
        this.subkey = encryptionKey;
        this.seq_number = new Asn1Integer(j3);
        this.authorization_data = authorizationData;
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
        this.authenticator_vno = asn1Integer;
        asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Realm realm = new Realm();
        this.crealm = realm;
        realm.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PrincipalName principalName = new PrincipalName();
        this.cname = principalName;
        principalName.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            Checksum checksum = new Checksum();
            this.cksum = checksum;
            checksum.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 4, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Integer asn1Integer2 = new Asn1Integer();
        this.cusec = asn1Integer2;
        asn1Integer2.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (!asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 5, intHolder, true)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        KerberosTime kerberosTime = new KerberosTime();
        this.ctime = kerberosTime;
        kerberosTime.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 6, intHolder, true)) {
            EncryptionKey encryptionKey = new EncryptionKey();
            this.subkey = encryptionKey;
            encryptionKey.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 7, intHolder, true)) {
            Asn1Integer asn1Integer3 = new Asn1Integer();
            this.seq_number = asn1Integer3;
            asn1Integer3.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 8, intHolder, true)) {
            AuthorizationData authorizationData = new AuthorizationData();
            this.authorization_data = authorizationData;
            authorizationData.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3) || peekTag.equals((short) 128, (short) 32, 4) || peekTag.equals((short) 128, (short) 32, 5) || peekTag.equals((short) 128, (short) 32, 6) || peekTag.equals((short) 128, (short) 32, 7) || peekTag.equals((short) 128, (short) 32, 8)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        AuthorizationData authorizationData = this.authorization_data;
        if (authorizationData != null) {
            int encode = authorizationData.encode(asn1BerEncodeBuffer, true);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 8, encode) + encode;
        } else {
            i = 0;
        }
        Asn1Integer asn1Integer = this.seq_number;
        if (asn1Integer != null) {
            int encode2 = asn1Integer.encode(asn1BerEncodeBuffer, true);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 7, encode2);
        }
        EncryptionKey encryptionKey = this.subkey;
        if (encryptionKey != null) {
            int encode3 = encryptionKey.encode(asn1BerEncodeBuffer, true);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 6, encode3);
        }
        int encode4 = this.ctime.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 5, encode4) + i + encode4;
        int encode5 = this.cusec.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength2 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 4, encode5) + encodeTagAndLength + encode5;
        Checksum checksum = this.cksum;
        if (checksum != null) {
            int encode6 = checksum.encode(asn1BerEncodeBuffer, true);
            encodeTagAndLength2 = encodeTagAndLength2 + encode6 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode6);
        }
        int encode7 = this.cname.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength3 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode7) + encodeTagAndLength2 + encode7;
        int encode8 = this.crealm.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength4 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode8) + encodeTagAndLength3 + encode8;
        int encode9 = this.authenticator_vno.encode(asn1BerEncodeBuffer, true);
        int encodeTagAndLength5 = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode9) + encodeTagAndLength4 + encode9;
        int encodeTagAndLength6 = asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encodeTagAndLength5) + encodeTagAndLength5;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, encodeTagAndLength6) + encodeTagAndLength6 : encodeTagAndLength6;
    }

    public void init() {
        this.authenticator_vno = null;
        this.crealm = null;
        this.cname = null;
        this.cksum = null;
        this.cusec = null;
        this.ctime = null;
        this.subkey = null;
        this.seq_number = null;
        this.authorization_data = null;
    }

    public Authenticator(Asn1Integer asn1Integer, Realm realm, PrincipalName principalName, Checksum checksum, Asn1Integer asn1Integer2, KerberosTime kerberosTime, EncryptionKey encryptionKey, Asn1Integer asn1Integer3, AuthorizationData authorizationData) {
        this.authenticator_vno = asn1Integer;
        this.crealm = realm;
        this.cname = principalName;
        this.cksum = checksum;
        this.cusec = asn1Integer2;
        this.ctime = kerberosTime;
        this.subkey = encryptionKey;
        this.seq_number = asn1Integer3;
        this.authorization_data = authorizationData;
    }

    public Authenticator(Asn1Integer asn1Integer, Realm realm, PrincipalName principalName, Asn1Integer asn1Integer2, KerberosTime kerberosTime) {
        this.authenticator_vno = asn1Integer;
        this.crealm = realm;
        this.cname = principalName;
        this.cusec = asn1Integer2;
        this.ctime = kerberosTime;
    }

    public Authenticator() {
    }

    public Authenticator(long j, String str, PrincipalName principalName, long j2, String str2) {
        this.authenticator_vno = new Asn1Integer(j);
        this.crealm = new Realm(str);
        this.cname = principalName;
        this.cusec = new Asn1Integer(j2);
        this.ctime = new KerberosTime(str2);
    }
}
