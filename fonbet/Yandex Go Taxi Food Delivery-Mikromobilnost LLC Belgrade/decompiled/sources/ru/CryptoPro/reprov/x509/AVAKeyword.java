package ru.CryptoPro.reprov.x509;

import com.samsung.android.sdk.samsungpay.v2.card.IdvVerifyInfo;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.wx61;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
class AVAKeyword {
    private String keyword;
    private ObjectIdentifier oid;
    private boolean rfc1779Compliant;
    private boolean rfc2253Compliant;
    private static final Map oidMap = new HashMap();
    private static final Map keywordMap = new HashMap();

    static {
        new AVAKeyword("CN", X500Name.commonName_oid, true, true);
        new AVAKeyword(CA20Status.STATUS_REQUEST_C, X500Name.countryName_oid, true, true);
        new AVAKeyword("L", X500Name.localityName_oid, true, true);
        ObjectIdentifier objectIdentifier = X500Name.stateName_oid;
        new AVAKeyword("S", objectIdentifier, false, false);
        new AVAKeyword("ST", objectIdentifier, true, true);
        new AVAKeyword("O", X500Name.orgName_oid, true, true);
        new AVAKeyword("OU", X500Name.orgUnitName_oid, true, true);
        new AVAKeyword("T", X500Name.title_oid, false, false);
        new AVAKeyword("IP", X500Name.ipAddress_oid, false, false);
        new AVAKeyword("STREET", X500Name.streetAddress_oid, true, true);
        new AVAKeyword("DC", X500Name.DOMAIN_COMPONENT_OID, false, true);
        ObjectIdentifier objectIdentifier2 = X500Name.DNQUALIFIER_OID;
        new AVAKeyword("DNQUALIFIER", objectIdentifier2, false, false);
        new AVAKeyword("DNQ", objectIdentifier2, false, false);
        ObjectIdentifier objectIdentifier3 = X500Name.SURNAME_OID;
        new AVAKeyword("SURNAME", objectIdentifier3, false, false);
        new AVAKeyword("SN", objectIdentifier3, false, false);
        ObjectIdentifier objectIdentifier4 = X500Name.GIVENNAME_OID;
        new AVAKeyword("GIVENNAME", objectIdentifier4, false, false);
        new AVAKeyword("G", objectIdentifier4, false, false);
        new AVAKeyword("INITIALS", X500Name.INITIALS_OID, false, false);
        new AVAKeyword("GENERATION", X500Name.GENERATIONQUALIFIER_OID, false, false);
        ObjectIdentifier objectIdentifier5 = wx61.b;
        new AVAKeyword("E", objectIdentifier5, false, false);
        new AVAKeyword(IdvVerifyInfo.IDV_TYPE_EMAIL, objectIdentifier5, false, false);
        new AVAKeyword("EMAILADDRESS", objectIdentifier5, false, false);
        new AVAKeyword("UID", X500Name.userid_oid, false, true);
        new AVAKeyword("SERIALNUMBER", X500Name.SERIALNUMBER_OID, false, false);
        new AVAKeyword("ОГРН", X500Name.OGRN_OID, false, false);
        new AVAKeyword("СНИЛС", X500Name.SNILS_OID, false, false);
        new AVAKeyword("ОГРНИП", X500Name.OGRNIP_OID, false, false);
        new AVAKeyword("INN", X500Name.INN_OID, false, false);
        new AVAKeyword("ИНН ЮЛ", X500Name.KPP_OID, false, false);
        new AVAKeyword("РНС ФСС", X500Name.RNS_FSS_OID, false, false);
        new AVAKeyword("КП ФСС", X500Name.KP_FSS_OID, false, false);
    }

    private AVAKeyword(String str, ObjectIdentifier objectIdentifier, boolean z, boolean z2) {
        this.keyword = str;
        this.oid = objectIdentifier;
        this.rfc1779Compliant = z;
        this.rfc2253Compliant = z2;
        oidMap.put(objectIdentifier, this);
        keywordMap.put(str, this);
    }

    public static String getKeyword(ObjectIdentifier objectIdentifier, int i, Map map) {
        String str;
        String objectIdentifier2 = objectIdentifier.toString();
        String str2 = (String) map.get(objectIdentifier2);
        if (str2 == null) {
            AVAKeyword aVAKeyword = (AVAKeyword) oidMap.get(objectIdentifier);
            return (aVAKeyword == null || !aVAKeyword.isCompliant(i)) ? i == 3 ? objectIdentifier2 : g8e.o("OID.", objectIdentifier2) : aVAKeyword.keyword;
        }
        if (str2.length() != 0) {
            String trim = str2.trim();
            char charAt = trim.charAt(0);
            if (charAt >= 'A' && charAt <= 'z' && (charAt <= 'Z' || charAt >= 'a')) {
                for (int i2 = 1; i2 < trim.length(); i2++) {
                    char charAt2 = trim.charAt(i2);
                    if ((charAt2 < 'A' || charAt2 > 'z' || (charAt2 > 'Z' && charAt2 < 'a')) && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_')) {
                        str = "keyword character is not a letter, digit, or underscore";
                    }
                }
                return trim;
            }
            str = "keyword does not start with letter";
        } else {
            str = "keyword cannot be empty";
        }
        ny61.g(str);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r4.startsWith("OID.") != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ObjectIdentifier getOID(String str, int i, Map map) throws IOException {
        String str2;
        String str3;
        char charAt;
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        if (i != 3) {
            upperCase = upperCase.trim();
        } else if (upperCase.startsWith(" ") || upperCase.endsWith(" ")) {
            str3 = "Invalid leading or trailing space in keyword \"";
            str2 = oyr.p(str3, upperCase, "\"");
            ny61.v(str2);
            return null;
        }
        String str4 = (String) map.get(upperCase);
        if (str4 != null) {
            return new ObjectIdentifier(str4);
        }
        AVAKeyword aVAKeyword = (AVAKeyword) keywordMap.get(upperCase);
        if (aVAKeyword != null && aVAKeyword.isCompliant(i)) {
            return aVAKeyword.oid;
        }
        if (i != 2) {
            if (i == 1) {
            }
            if (upperCase.length() == 0 && (charAt = upperCase.charAt(0)) >= '0' && charAt <= '9') {
                return new ObjectIdentifier(upperCase);
            }
            str3 = "Invalid keyword \"";
            str2 = oyr.p(str3, upperCase, "\"");
            ny61.v(str2);
            return null;
        }
        if (!upperCase.startsWith("OID.")) {
            str2 = "Invalid RFC1779 keyword: ".concat(upperCase);
            ny61.v(str2);
            return null;
        }
        upperCase = upperCase.substring(4);
        if (upperCase.length() == 0) {
        }
        str3 = "Invalid keyword \"";
        str2 = oyr.p(str3, upperCase, "\"");
        ny61.v(str2);
        return null;
    }

    public static boolean hasKeyword(ObjectIdentifier objectIdentifier, int i) {
        AVAKeyword aVAKeyword = (AVAKeyword) oidMap.get(objectIdentifier);
        if (aVAKeyword == null) {
            return false;
        }
        return aVAKeyword.isCompliant(i);
    }

    private boolean isCompliant(int i) {
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return this.rfc1779Compliant;
        }
        if (i == 3) {
            return this.rfc2253Compliant;
        }
        ny61.g(oyr.i(i, "Invalid standard "));
        return false;
    }

    public static String getKeyword(ObjectIdentifier objectIdentifier, int i) {
        return getKeyword(objectIdentifier, i, Collections.EMPTY_MAP);
    }

    public static ObjectIdentifier getOID(String str, int i) throws IOException {
        return getOID(str, i, Collections.EMPTY_MAP);
    }
}
