package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.yci0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.Principal;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class X500Name implements Principal, GeneralNameInterface {
    private static final int[] DNQUALIFIER_DATA;
    public static final ObjectIdentifier DNQUALIFIER_OID;
    private static final int[] DOMAIN_COMPONENT_DATA;
    public static final ObjectIdentifier DOMAIN_COMPONENT_OID;
    private static final int[] GENERATIONQUALIFIER_DATA;
    public static final ObjectIdentifier GENERATIONQUALIFIER_OID;
    private static final int[] GIVENNAME_DATA;
    public static final ObjectIdentifier GIVENNAME_OID;
    private static final int[] INITIALS_DATA;
    public static final ObjectIdentifier INITIALS_OID;
    private static final int[] INN;
    public static final ObjectIdentifier INN_OID;
    private static final int[] KPP;
    public static final ObjectIdentifier KPP_OID;
    private static final int[] KP_FSS;
    public static final ObjectIdentifier KP_FSS_OID;
    private static final int[] OGRN;
    private static final int[] OGRNIP;
    public static final ObjectIdentifier OGRNIP_OID;
    public static final ObjectIdentifier OGRN_OID;
    private static final int[] RNS_FSS;
    public static final ObjectIdentifier RNS_FSS_OID;
    private static final int[] SERIALNUMBER_DATA;
    public static final ObjectIdentifier SERIALNUMBER_OID;
    private static final int[] SNILS;
    public static final ObjectIdentifier SNILS_OID;
    private static final int[] SURNAME_DATA;
    public static final ObjectIdentifier SURNAME_OID;
    private static final int[] UNSTRUCTURED_NAME;
    public static final ObjectIdentifier UNSTRUCTURED_NAME_OID;
    private static final int[] commonName_data;
    public static final ObjectIdentifier commonName_oid;
    private static final int[] countryName_data;
    public static final ObjectIdentifier countryName_oid;
    private static final Map internedOIDs = new HashMap();
    private static final int[] ipAddress_data;
    public static final ObjectIdentifier ipAddress_oid;
    private static final int[] localityName_data;
    public static final ObjectIdentifier localityName_oid;
    private static final int[] orgName_data;
    public static final ObjectIdentifier orgName_oid;
    private static final int[] orgUnitName_data;
    public static final ObjectIdentifier orgUnitName_oid;
    private static final Constructor principalConstructor;
    private static final Field principalField;
    private static final int[] stateName_data;
    public static final ObjectIdentifier stateName_oid;
    private static final int[] streetAddress_data;
    public static final ObjectIdentifier streetAddress_oid;
    private static final int[] title_data;
    public static final ObjectIdentifier title_oid;
    private static final int[] userid_data;
    public static final ObjectIdentifier userid_oid;
    private volatile List allAvaList;
    private String canonicalDn;
    private String dn;
    private byte[] encoded;
    private RDN[] names;
    private volatile List rdnList;
    private String rfc1779Dn;
    private String rfc2253Dn;
    private X500Principal x500Principal;

    static {
        int[] iArr = {2, 5, 4, 3};
        commonName_data = iArr;
        int[] iArr2 = {2, 5, 4, 4};
        SURNAME_DATA = iArr2;
        int[] iArr3 = {2, 5, 4, 5};
        SERIALNUMBER_DATA = iArr3;
        int[] iArr4 = {2, 5, 4, 6};
        countryName_data = iArr4;
        int[] iArr5 = {2, 5, 4, 7};
        localityName_data = iArr5;
        int[] iArr6 = {2, 5, 4, 8};
        stateName_data = iArr6;
        int[] iArr7 = {2, 5, 4, 9};
        streetAddress_data = iArr7;
        int[] iArr8 = {2, 5, 4, 10};
        orgName_data = iArr8;
        int[] iArr9 = {2, 5, 4, 11};
        orgUnitName_data = iArr9;
        int[] iArr10 = {2, 5, 4, 12};
        title_data = iArr10;
        int[] iArr11 = {2, 5, 4, 42};
        GIVENNAME_DATA = iArr11;
        int[] iArr12 = {2, 5, 4, 43};
        INITIALS_DATA = iArr12;
        int[] iArr13 = {2, 5, 4, 44};
        GENERATIONQUALIFIER_DATA = iArr13;
        int[] iArr14 = {2, 5, 4, 46};
        DNQUALIFIER_DATA = iArr14;
        int[] iArr15 = {1, 3, 6, 1, 4, 1, 42, 2, 11, 2, 1};
        ipAddress_data = iArr15;
        int[] iArr16 = {0, 9, 2342, 19200300, 100, 1, 25};
        DOMAIN_COMPONENT_DATA = iArr16;
        int[] iArr17 = {0, 9, 2342, 19200300, 100, 1, 1};
        userid_data = iArr17;
        int[] iArr18 = {1, 2, 643, 100, 1};
        OGRN = iArr18;
        int[] iArr19 = {1, 2, 643, 100, 3};
        SNILS = iArr19;
        int[] iArr20 = {1, 2, 643, 100, 4};
        KPP = iArr20;
        int[] iArr21 = {1, 2, 643, 100, 5};
        OGRNIP = iArr21;
        int[] iArr22 = {1, 2, 643, 3, HProv.PP_FAST_CODE, 1, 1};
        INN = iArr22;
        int[] iArr23 = {1, 2, 643, 3, 141, 1, 1};
        RNS_FSS = iArr23;
        int[] iArr24 = {1, 2, 643, 3, 141, 1, 2};
        KP_FSS = iArr24;
        int[] iArr25 = {1, 2, 840, 113549, 1, 9, 2};
        UNSTRUCTURED_NAME = iArr25;
        commonName_oid = intern(ObjectIdentifier.newInternal(iArr));
        SERIALNUMBER_OID = intern(ObjectIdentifier.newInternal(iArr3));
        countryName_oid = intern(ObjectIdentifier.newInternal(iArr4));
        localityName_oid = intern(ObjectIdentifier.newInternal(iArr5));
        orgName_oid = intern(ObjectIdentifier.newInternal(iArr8));
        orgUnitName_oid = intern(ObjectIdentifier.newInternal(iArr9));
        stateName_oid = intern(ObjectIdentifier.newInternal(iArr6));
        streetAddress_oid = intern(ObjectIdentifier.newInternal(iArr7));
        title_oid = intern(ObjectIdentifier.newInternal(iArr10));
        DNQUALIFIER_OID = intern(ObjectIdentifier.newInternal(iArr14));
        SURNAME_OID = intern(ObjectIdentifier.newInternal(iArr2));
        GIVENNAME_OID = intern(ObjectIdentifier.newInternal(iArr11));
        INITIALS_OID = intern(ObjectIdentifier.newInternal(iArr12));
        GENERATIONQUALIFIER_OID = intern(ObjectIdentifier.newInternal(iArr13));
        ipAddress_oid = intern(ObjectIdentifier.newInternal(iArr15));
        DOMAIN_COMPONENT_OID = intern(ObjectIdentifier.newInternal(iArr16));
        userid_oid = intern(ObjectIdentifier.newInternal(iArr17));
        OGRN_OID = intern(ObjectIdentifier.newInternal(iArr18));
        SNILS_OID = intern(ObjectIdentifier.newInternal(iArr19));
        KPP_OID = intern(ObjectIdentifier.newInternal(iArr20));
        OGRNIP_OID = intern(ObjectIdentifier.newInternal(iArr21));
        INN_OID = intern(ObjectIdentifier.newInternal(iArr22));
        RNS_FSS_OID = intern(ObjectIdentifier.newInternal(iArr23));
        KP_FSS_OID = intern(ObjectIdentifier.newInternal(iArr24));
        UNSTRUCTURED_NAME_OID = intern(ObjectIdentifier.newInternal(iArr25));
        try {
            Object[] objArr = (Object[]) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.reprov.x509.X500Name.1
                @Override // java.security.PrivilegedExceptionAction
                public Object[] run() throws Exception {
                    Constructor declaredConstructor = X500Principal.class.getDeclaredConstructor(X500Name.class);
                    declaredConstructor.setAccessible(true);
                    Field declaredField = X500Principal.class.getDeclaredField("thisX500Name");
                    declaredField.setAccessible(true);
                    return new Object[]{declaredConstructor, declaredField};
                }
            });
            principalConstructor = (Constructor) objArr[0];
            principalField = (Field) objArr[1];
        } catch (Exception e) {
            throw ((InternalError) new InternalError("Could not obtain X500Principal access").initCause(e));
        }
    }

    public X500Name(String str, String str2, String str3, String str4, String str5, String str6) throws IOException {
        RDN[] rdnArr = new RDN[6];
        this.names = rdnArr;
        rdnArr[5] = new RDN(1);
        this.names[5].assertion[0] = new AVA(commonName_oid, new DerValue(str));
        this.names[4] = new RDN(1);
        this.names[4].assertion[0] = new AVA(orgUnitName_oid, new DerValue(str2));
        this.names[3] = new RDN(1);
        this.names[3].assertion[0] = new AVA(orgName_oid, new DerValue(str3));
        this.names[2] = new RDN(1);
        this.names[2].assertion[0] = new AVA(localityName_oid, new DerValue(str4));
        this.names[1] = new RDN(1);
        this.names[1].assertion[0] = new AVA(stateName_oid, new DerValue(str5));
        this.names[0] = new RDN(1);
        this.names[0].assertion[0] = new AVA(countryName_oid, new DerValue(str6));
    }

    public static X500Name asX500Name(X500Principal x500Principal) {
        try {
            X500Name x500Name = (X500Name) principalField.get(x500Principal);
            x500Name.x500Principal = x500Principal;
            return x500Name;
        } catch (Exception e) {
            ny61.n("Unexpected exception", e);
            return null;
        }
    }

    public static int countQuotes(String str, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            if ((str.charAt(i4) == '\"' && i4 == i) || (str.charAt(i4) == '\"' && str.charAt(i4 - 1) != '\\')) {
                i3++;
            }
        }
        return i3;
    }

    private static boolean escaped(int i, int i2, String str) {
        if (i == 1 && str.charAt(i - 1) == '\\') {
            return true;
        }
        if (i > 1 && str.charAt(i - 1) == '\\' && str.charAt(i - 2) != '\\') {
            return true;
        }
        if (i > 1 && str.charAt(i - 1) == '\\' && str.charAt(i - 2) == '\\') {
            int i3 = 0;
            for (int i4 = i - 1; i4 >= i2; i4--) {
                if (str.charAt(i4) == '\\') {
                    i3++;
                }
            }
            if (i3 % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    private DerValue findAttribute(ObjectIdentifier objectIdentifier) {
        if (this.names == null) {
            return null;
        }
        int i = 0;
        while (true) {
            RDN[] rdnArr = this.names;
            if (i >= rdnArr.length) {
                return null;
            }
            DerValue findAttribute = rdnArr[i].findAttribute(objectIdentifier);
            if (findAttribute != null) {
                return findAttribute;
            }
            i++;
        }
    }

    private void generateDN() {
        String stringBuffer;
        RDN[] rdnArr = this.names;
        if (rdnArr.length == 1) {
            stringBuffer = rdnArr[0].toString();
        } else {
            StringBuffer stringBuffer2 = new StringBuffer(48);
            RDN[] rdnArr2 = this.names;
            if (rdnArr2 != null) {
                for (int length = rdnArr2.length - 1; length >= 0; length--) {
                    if (length != this.names.length - 1) {
                        stringBuffer2.append(ru.CryptoPro.JCP.tools.CertReader.Extension.FIX_SPACE);
                    }
                    stringBuffer2.append(this.names[length].toString());
                }
            }
            stringBuffer = stringBuffer2.toString();
        }
        this.dn = stringBuffer;
    }

    private String generateRFC1779DN(Map map) {
        RDN[] rdnArr = this.names;
        if (rdnArr.length == 1) {
            return rdnArr[0].toRFC1779String(map);
        }
        StringBuffer stringBuffer = new StringBuffer(48);
        RDN[] rdnArr2 = this.names;
        if (rdnArr2 != null) {
            for (int length = rdnArr2.length - 1; length >= 0; length--) {
                if (length != this.names.length - 1) {
                    stringBuffer.append(ru.CryptoPro.JCP.tools.CertReader.Extension.FIX_SPACE);
                }
                stringBuffer.append(this.names[length].toRFC1779String(map));
            }
        }
        return stringBuffer.toString();
    }

    private String generateRFC2253DN(Map map) {
        if (this.names.length == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(48);
        for (int length = this.names.length - 1; length >= 0; length--) {
            if (length < this.names.length - 1) {
                stringBuffer.append(HexString.CHAR_COMMA);
            }
            stringBuffer.append(this.names[length].toRFC2253String(map));
        }
        return stringBuffer.toString();
    }

    private String getString(DerValue derValue) throws IOException {
        if (derValue == null) {
            return null;
        }
        String asString = derValue.getAsString();
        if (asString != null) {
            return asString;
        }
        yci0.s(derValue.tag, "not a DER string encoding, ");
        return null;
    }

    public static ObjectIdentifier intern(ObjectIdentifier objectIdentifier) {
        Map map = internedOIDs;
        ObjectIdentifier objectIdentifier2 = (ObjectIdentifier) map.get(objectIdentifier);
        if (objectIdentifier2 != null) {
            return objectIdentifier2;
        }
        map.put(objectIdentifier, objectIdentifier);
        return objectIdentifier;
    }

    private boolean isWithinSubtree(X500Name x500Name) {
        if (this == x500Name) {
            return true;
        }
        if (x500Name == null) {
            return false;
        }
        RDN[] rdnArr = x500Name.names;
        if (rdnArr.length == 0) {
            return true;
        }
        RDN[] rdnArr2 = this.names;
        if (rdnArr2.length == 0 || rdnArr2.length < rdnArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            RDN[] rdnArr3 = x500Name.names;
            if (i >= rdnArr3.length) {
                return true;
            }
            if (!this.names[i].equals(rdnArr3[i])) {
                return false;
            }
            i++;
        }
    }

    private void parseDER(DerInputStream derInputStream) throws IOException {
        DerValue[] sequence;
        byte[] byteArray = derInputStream.toByteArray();
        try {
            sequence = derInputStream.getSequence(5);
        } catch (IOException unused) {
            sequence = byteArray == null ? null : new DerInputStream(new DerValue((byte) 48, byteArray).toByteArray()).getSequence(5);
        }
        if (sequence == null) {
            this.names = new RDN[0];
            return;
        }
        this.names = new RDN[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            this.names[i] = new RDN(sequence[i]);
        }
    }

    private void parseDN(String str, Map map) throws IOException {
        if (str == null || str.length() == 0) {
            this.names = new RDN[0];
            return;
        }
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(44);
        int indexOf2 = str.indexOf(59);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (indexOf < 0 && indexOf2 < 0) {
                arrayList.add(new RDN(str.substring(i), map));
                Collections.reverse(arrayList);
                this.names = (RDN[]) arrayList.toArray(new RDN[arrayList.size()]);
                return;
            }
            if (indexOf2 >= 0) {
                indexOf = indexOf < 0 ? indexOf2 : Math.min(indexOf, indexOf2);
            }
            int countQuotes = countQuotes(str, i3, indexOf) + i2;
            if (indexOf < 0 || countQuotes == 1 || escaped(indexOf, i3, str)) {
                i2 = countQuotes;
            } else {
                arrayList.add(new RDN(str.substring(i, indexOf), map));
                i = indexOf + 1;
                i2 = 0;
            }
            i3 = indexOf + 1;
            indexOf = str.indexOf(44, i3);
            indexOf2 = str.indexOf(59, i3);
        }
    }

    private void parseRFC2253DN(String str) throws IOException {
        int i = 0;
        if (str.length() == 0) {
            this.names = new RDN[0];
            return;
        }
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(44);
        int i2 = 0;
        while (indexOf >= 0) {
            if (indexOf > 0 && !escaped(indexOf, i2, str)) {
                arrayList.add(new RDN(str.substring(i, indexOf), X500Principal.RFC2253));
                i = indexOf + 1;
            }
            i2 = indexOf + 1;
            indexOf = str.indexOf(44, i2);
        }
        arrayList.add(new RDN(str.substring(i), X500Principal.RFC2253));
        Collections.reverse(arrayList);
        this.names = (RDN[]) arrayList.toArray(new RDN[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public List allAvas() {
        ?? r0 = this.allAvaList;
        if (r0 == 0) {
            r0 = new ArrayList();
            int i = 0;
            while (true) {
                RDN[] rdnArr = this.names;
                if (i >= rdnArr.length) {
                    break;
                }
                r0.addAll(rdnArr[i].avas());
                i++;
            }
        }
        return r0;
    }

    public X500Principal asX500Principal() {
        if (this.x500Principal == null) {
            try {
                this.x500Principal = (X500Principal) principalConstructor.newInstance(this);
            } catch (Exception e) {
                ny61.n("Unexpected exception", e);
                return null;
            }
        }
        return this.x500Principal;
    }

    public int avaSize() {
        return allAvas().size();
    }

    public X500Name commonAncestor(X500Name x500Name) {
        if (x500Name == null) {
            return null;
        }
        int length = x500Name.names.length;
        int length2 = this.names.length;
        if (length2 != 0 && length != 0) {
            if (length2 < length) {
                length = length2;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (this.names[i].equals(x500Name.names[i])) {
                    i++;
                } else if (i == 0) {
                    return null;
                }
            }
            RDN[] rdnArr = new RDN[i];
            for (int i2 = 0; i2 < i; i2++) {
                rdnArr[i2] = this.names[i2];
            }
            try {
                return new X500Name(rdnArr);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) throws UnsupportedOperationException {
        if (generalNameInterface == null || generalNameInterface.getType() != 4) {
            return -1;
        }
        X500Name x500Name = (X500Name) generalNameInterface;
        if (x500Name.equals(this)) {
            return 0;
        }
        if (x500Name.names.length == 0) {
            return 2;
        }
        if (this.names.length == 0 || x500Name.isWithinSubtree(this)) {
            return 1;
        }
        return isWithinSubtree(x500Name) ? 2 : 3;
    }

    public void emit(DerOutputStream derOutputStream) throws IOException {
        encode(derOutputStream);
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        int i = 0;
        while (true) {
            RDN[] rdnArr = this.names;
            if (i >= rdnArr.length) {
                derOutputStream.write((byte) 48, derOutputStream2);
                return;
            } else {
                rdnArr[i].encode(derOutputStream2);
                i++;
            }
        }
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X500Name)) {
            return false;
        }
        X500Name x500Name = (X500Name) obj;
        String str2 = this.canonicalDn;
        if (str2 != null && (str = x500Name.canonicalDn) != null) {
            return str2.equals(str);
        }
        int length = this.names.length;
        if (length != x500Name.names.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (this.names[i].assertion.length != x500Name.names[i].assertion.length) {
                return false;
            }
        }
        return getRFC2253CanonicalName().equals(x500Name.getRFC2253CanonicalName());
    }

    public DerValue findMostSpecificAttribute(ObjectIdentifier objectIdentifier) {
        RDN[] rdnArr = this.names;
        if (rdnArr == null) {
            return null;
        }
        for (int length = rdnArr.length - 1; length >= 0; length--) {
            DerValue findAttribute = this.names[length].findAttribute(objectIdentifier);
            if (findAttribute != null) {
                return findAttribute;
            }
        }
        return null;
    }

    public String getCommonName() throws IOException {
        return getString(findAttribute(commonName_oid));
    }

    public String getCountry() throws IOException {
        return getString(findAttribute(countryName_oid));
    }

    public String getDNQualifier() throws IOException {
        return getString(findAttribute(DNQUALIFIER_OID));
    }

    public String getDomain() throws IOException {
        return getString(findAttribute(DOMAIN_COMPONENT_OID));
    }

    public byte[] getEncoded() throws IOException {
        return (byte[]) getEncodedInternal().clone();
    }

    public byte[] getEncodedInternal() throws IOException {
        if (this.encoded == null) {
            DerOutputStream derOutputStream = new DerOutputStream();
            DerOutputStream derOutputStream2 = new DerOutputStream();
            int i = 0;
            while (true) {
                RDN[] rdnArr = this.names;
                if (i >= rdnArr.length) {
                    break;
                }
                rdnArr[i].encode(derOutputStream2);
                i++;
            }
            derOutputStream.write((byte) 48, derOutputStream2);
            this.encoded = derOutputStream.toByteArray();
        }
        return this.encoded;
    }

    public String getGeneration() throws IOException {
        return getString(findAttribute(GENERATIONQUALIFIER_OID));
    }

    public String getGivenName() throws IOException {
        return getString(findAttribute(GIVENNAME_OID));
    }

    public String getIP() throws IOException {
        return getString(findAttribute(ipAddress_oid));
    }

    public String getInitials() throws IOException {
        return getString(findAttribute(INITIALS_OID));
    }

    public String getLocality() throws IOException {
        return getString(findAttribute(localityName_oid));
    }

    @Override // java.security.Principal
    public String getName() {
        return toString();
    }

    public String getOrganization() throws IOException {
        return getString(findAttribute(orgName_oid));
    }

    public String getOrganizationalUnit() throws IOException {
        return getString(findAttribute(orgUnitName_oid));
    }

    public String getRFC1779Name(Map map) throws IllegalArgumentException {
        if (!map.isEmpty()) {
            return generateRFC1779DN(map);
        }
        String str = this.rfc1779Dn;
        if (str != null) {
            return str;
        }
        String generateRFC1779DN = generateRFC1779DN(map);
        this.rfc1779Dn = generateRFC1779DN;
        return generateRFC1779DN;
    }

    public String getRFC2253CanonicalName() {
        String stringBuffer;
        String str = this.canonicalDn;
        if (str != null) {
            return str;
        }
        if (this.names.length == 0) {
            stringBuffer = "";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer(48);
            for (int length = this.names.length - 1; length >= 0; length--) {
                if (length < this.names.length - 1) {
                    stringBuffer2.append(HexString.CHAR_COMMA);
                }
                stringBuffer2.append(this.names[length].toRFC2253String(true));
            }
            stringBuffer = stringBuffer2.toString();
        }
        this.canonicalDn = stringBuffer;
        return stringBuffer;
    }

    public String getRFC2253Name(Map map) {
        if (!map.isEmpty()) {
            return generateRFC2253DN(map);
        }
        String str = this.rfc2253Dn;
        if (str != null) {
            return str;
        }
        String generateRFC2253DN = generateRFC2253DN(map);
        this.rfc2253Dn = generateRFC2253DN;
        return generateRFC2253DN;
    }

    public String getState() throws IOException {
        return getString(findAttribute(stateName_oid));
    }

    public String getSurname() throws IOException {
        return getString(findAttribute(SURNAME_OID));
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int getType() {
        return 4;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return getRFC2253CanonicalName().hashCode();
    }

    public boolean isEmpty() {
        int length = this.names.length;
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (this.names[i].assertion.length != 0) {
                return false;
            }
        }
        return true;
    }

    public List rdns() {
        List list = this.rdnList;
        if (list != null) {
            return list;
        }
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList(this.names));
        this.rdnList = unmodifiableList;
        return unmodifiableList;
    }

    public int size() {
        return this.names.length;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int subtreeDepth() throws UnsupportedOperationException {
        return this.names.length;
    }

    @Override // java.security.Principal
    public String toString() {
        if (this.dn == null) {
            generateDN();
        }
        return this.dn;
    }

    public String getRFC1779Name() {
        return getRFC1779Name(Collections.EMPTY_MAP);
    }

    public String getRFC2253Name() {
        return getRFC2253Name(Collections.EMPTY_MAP);
    }

    public X500Name(String str, String str2) throws IOException {
        if (str == null) {
            ny61.t("Name must not be null");
            throw null;
        }
        if (str2.equalsIgnoreCase(X500Principal.RFC2253)) {
            parseRFC2253DN(str);
        } else if (str2.equalsIgnoreCase("DEFAULT")) {
            parseDN(str, Collections.EMPTY_MAP);
        } else {
            ny61.v("Unsupported format ".concat(str2));
            throw null;
        }
    }

    public X500Name(String str, String str2, String str3, String str4) throws IOException {
        RDN[] rdnArr = new RDN[4];
        this.names = rdnArr;
        rdnArr[3] = new RDN(1);
        this.names[3].assertion[0] = new AVA(commonName_oid, new DerValue(str));
        this.names[2] = new RDN(1);
        this.names[2].assertion[0] = new AVA(orgUnitName_oid, new DerValue(str2));
        this.names[1] = new RDN(1);
        this.names[1].assertion[0] = new AVA(orgName_oid, new DerValue(str3));
        this.names[0] = new RDN(1);
        this.names[0].assertion[0] = new AVA(countryName_oid, new DerValue(str4));
    }

    public X500Name(String str) throws IOException {
        this(str, Collections.EMPTY_MAP);
    }

    public X500Name(String str, Map map) throws IOException {
        parseDN(str, map);
    }

    public X500Name(DerInputStream derInputStream) throws IOException {
        parseDER(derInputStream);
    }

    public X500Name(DerValue derValue) throws IOException {
        this(derValue.toDerInputStream());
    }

    public X500Name(byte[] bArr) throws IOException {
        parseDER(new DerInputStream(bArr));
    }

    public X500Name(RDN[] rdnArr) throws IOException {
        int i = 0;
        if (rdnArr == null) {
            this.names = new RDN[0];
            return;
        }
        this.names = (RDN[]) rdnArr.clone();
        while (true) {
            RDN[] rdnArr2 = this.names;
            if (i >= rdnArr2.length) {
                return;
            }
            if (rdnArr2[i] == null) {
                ny61.v("Cannot create an X500Name");
                throw null;
            }
            i++;
        }
    }
}
