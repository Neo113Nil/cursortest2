package ru.CryptoPro.reprov.x509;

import defpackage.lt61;
import defpackage.ny61;
import defpackage.puu0;
import defpackage.wx61;
import defpackage.yci0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;
import ru.CryptoPro.reprov.array.normalizer.Normalizer;
import ru.CryptoPro.reprov.utils.Debug;

/* loaded from: classes4.dex */
public class AVA implements lt61 {
    static final int DEFAULT = 1;
    static final int RFC1779 = 2;
    static final int RFC2253 = 3;
    private static final String hexDigits = "0123456789ABCDEF";
    private static final String specialChars = ",+=\n<>#;";
    private static final String specialChars2253 = ",+\"\\<>;";
    private static final String specialCharsAll = ",=\n+<>#;\\\" ";
    final ObjectIdentifier oid;
    final DerValue value;
    private static final Debug debug = Debug.getInstance(X509CertImpl.NAME, "\t[AVA]");
    private static final boolean PRESERVE_OLD_DC_ENCODING = Boolean.getBoolean(String.valueOf(AccessController.doPrivileged(new puu0(17))));
    private static final List numericOnly = Arrays.asList(X500Name.OGRN_OID, X500Name.SNILS_OID, X500Name.INN_OID, X500Name.OGRNIP_OID);

    public AVA(Reader reader, int i, Map map) throws IOException {
        int read;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int readChar = readChar(reader, "Incorrect AVA format");
            if (readChar == 61) {
                break;
            } else {
                stringBuffer.append((char) readChar);
            }
        }
        this.oid = AVAKeyword.getOID(stringBuffer.toString(), i, map);
        stringBuffer.setLength(0);
        if (i != 3) {
            while (true) {
                read = reader.read();
                if (read != 32 && read != 10) {
                    break;
                }
            }
        } else {
            read = reader.read();
            if (read == 32) {
                ny61.v("Incorrect AVA RFC2253 format - leading space must be escaped");
                throw null;
            }
        }
        this.value = read == -1 ? new DerValue("") : read == 35 ? parseHexString(reader, i) : (read != 34 || i == 3) ? parseString(reader, read, i, stringBuffer) : parseQuotedString(reader, stringBuffer);
    }

    private static Byte getEmbeddedHexPair(int i, Reader reader) throws IOException {
        char c = (char) i;
        if (hexDigits.indexOf(Character.toUpperCase(c)) < 0) {
            return null;
        }
        char readChar = (char) readChar(reader, "unexpected EOF - escaped hex value must include two valid digits");
        if (hexDigits.indexOf(Character.toUpperCase(readChar)) < 0) {
            ny61.v("escaped hex value must include two valid digits");
            return null;
        }
        return new Byte((byte) ((Character.digit(c, 16) << 4) + Character.digit(readChar, 16)));
    }

    private static String getEmbeddedHexString(List list) throws IOException {
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = ((Byte) list.get(i)).byteValue();
        }
        return new String(bArr, "UTF8");
    }

    private static boolean isDerString(DerValue derValue, boolean z) {
        byte b = derValue.tag;
        if (z) {
            return b == 12 || b == 18 || b == 19;
        }
        if (b != 12 && b != 22 && b != 27 && b != 30) {
            switch (b) {
                case 18:
                case 19:
                case 20:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private static boolean isTerminator(int i, int i2) {
        if (i != -1) {
            if (i == 59 || i == 62) {
                return i2 != 3;
            }
            if (i != 43 && i != 44) {
                return false;
            }
        }
        return true;
    }

    private static DerValue parseHexString(Reader reader, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        byte b = 0;
        while (true) {
            int read = reader.read();
            if (isTerminator(read, i)) {
                if (i2 == 0) {
                    ny61.v("AVA parse, zero hex digits");
                    return null;
                }
                if (i2 % 2 != 1) {
                    return new DerValue(byteArrayOutputStream.toByteArray());
                }
                ny61.v("AVA parse, odd number of hex digits");
                return null;
            }
            char c = (char) read;
            int indexOf = hexDigits.indexOf(Character.toUpperCase(c));
            if (indexOf == -1) {
                throw new IOException("AVA parse, invalid hex digit: " + c);
            }
            if (i2 % 2 == 1) {
                b = (byte) ((b * PKIBody._CKUANN) + ((byte) indexOf));
                byteArrayOutputStream.write(b);
            } else {
                b = (byte) indexOf;
            }
            i2++;
        }
    }

    private DerValue parseQuotedString(Reader reader, StringBuffer stringBuffer) throws IOException {
        int read;
        int readChar = readChar(reader, "Quoted string did not end in quote");
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        while (readChar != 34) {
            if (readChar == 92) {
                readChar = readChar(reader, "Quoted string did not end in quote");
                Byte embeddedHexPair = getEmbeddedHexPair(readChar, reader);
                if (embeddedHexPair != null) {
                    arrayList.add(embeddedHexPair);
                    readChar = reader.read();
                    z = false;
                } else if (readChar != 92 && readChar != 34) {
                    char c = (char) readChar;
                    if (specialChars.indexOf(c) < 0) {
                        throw new IOException("Invalid escaped character in AVA: " + c);
                    }
                }
            }
            if (arrayList.size() > 0) {
                stringBuffer.append(getEmbeddedHexString(arrayList));
                arrayList.clear();
            }
            char c2 = (char) readChar;
            z &= DerValue.isPrintableStringChar(c2);
            stringBuffer.append(c2);
            readChar = readChar(reader, "Quoted string did not end in quote");
        }
        if (arrayList.size() > 0) {
            stringBuffer.append(getEmbeddedHexString(arrayList));
            arrayList.clear();
        }
        while (true) {
            read = reader.read();
            if (read != 10 && read != 32) {
                break;
            }
        }
        if (read == -1) {
            return (this.oid.equals(wx61.b) || (this.oid.equals(X500Name.DOMAIN_COMPONENT_OID) && !PRESERVE_OLD_DC_ENCODING)) ? new DerValue((byte) 22, stringBuffer.toString().trim()) : numericOnly.contains(this.oid) ? new DerValue((byte) 18, stringBuffer.toString().trim()) : (this.oid.equals(X500Name.countryName_oid) && z) ? new DerValue(stringBuffer.toString().trim()) : new DerValue((byte) 12, stringBuffer.toString().trim());
        }
        ny61.v("AVA had characters other than whitespace after terminating quote");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
    
        throw new java.io.IOException("Invalid escaped character in AVA: '" + ((char) r7) + "'");
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x018b A[LOOP:0: B:2:0x0013->B:9:0x018b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DerValue parseString(Reader reader, int i, int i2, StringBuffer stringBuffer) throws IOException {
        DerValue derValue;
        boolean z;
        String str;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = i;
        boolean z2 = true;
        boolean z3 = true;
        int i5 = 0;
        while (true) {
            if (i4 == 92) {
                i4 = readChar(reader, "Invalid trailing backslash");
                derValue = null;
                Byte embeddedHexPair = getEmbeddedHexPair(i4, reader);
                if (embeddedHexPair != null) {
                    arrayList.add(embeddedHexPair);
                    i4 = reader.read();
                    z2 = false;
                    if (isTerminator(i4, i2)) {
                        i3 = 1;
                        z3 = false;
                    } else {
                        if (i2 != 3 || i5 <= 0) {
                            if (arrayList.size() > 0) {
                                stringBuffer.append(getEmbeddedHexString(arrayList));
                                arrayList.clear();
                            }
                            return (this.oid.equals(wx61.b) || (this.oid.equals(X500Name.DOMAIN_COMPONENT_OID) && !PRESERVE_OLD_DC_ENCODING)) ? new DerValue((byte) 22, stringBuffer.toString()) : numericOnly.contains(this.oid) ? new DerValue((byte) 18, stringBuffer.toString()) : (this.oid.equals(X500Name.countryName_oid) && z2) ? new DerValue(stringBuffer.toString()) : new DerValue((byte) 12, stringBuffer.toString());
                        }
                        str = "Incorrect AVA RFC2253 format - trailing space must be escaped";
                    }
                } else if ((i2 != i3 || specialCharsAll.indexOf((char) i4) != -1) && (i2 != 2 || specialChars.indexOf((char) i4) != -1 || i4 == 92 || i4 == 34)) {
                    if (i2 == 3) {
                        if (i4 != 32) {
                            if (i4 == 35) {
                                if (!z3) {
                                    str = "Invalid escaped '#' character in AVA.  Only a leading '#' can be escaped.";
                                    break;
                                }
                            } else {
                                char c = (char) i4;
                                if (specialChars2253.indexOf(c) == -1) {
                                    throw new IOException("Invalid escaped character in AVA: '" + c + "'");
                                }
                            }
                        } else if (!z3 && !trailingSpace(reader)) {
                            str = "Invalid escaped space character in AVA.  Only a leading or trailing space character can be escaped.";
                            break;
                        }
                    }
                    z = true;
                }
            } else {
                derValue = null;
                if (i2 == 3) {
                    char c2 = (char) i4;
                    if (specialChars2253.indexOf(c2) != -1) {
                        throw new IOException("Character '" + c2 + "' in AVA appears without escape");
                    }
                }
                z = false;
            }
            if (arrayList.size() > 0) {
                for (int i6 = 0; i6 < i5; i6++) {
                    stringBuffer.append(" ");
                }
                stringBuffer.append(getEmbeddedHexString(arrayList));
                arrayList.clear();
                i5 = 0;
            }
            char c3 = (char) i4;
            z2 &= DerValue.isPrintableStringChar(c3);
            if (i4 != 32 || z) {
                for (int i7 = 0; i7 < i5; i7++) {
                    stringBuffer.append(" ");
                }
                stringBuffer.append(c3);
                i5 = 0;
            } else {
                i5++;
            }
            i4 = reader.read();
            if (isTerminator(i4, i2)) {
            }
        }
        ny61.v(str);
        return derValue;
    }

    private static int readChar(Reader reader, String str) throws IOException {
        int read = reader.read();
        if (read != -1) {
            return read;
        }
        ny61.v(str);
        return 0;
    }

    private String toKeyword(int i, Map map) {
        return AVAKeyword.getKeyword(this.oid, i, map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e1, code lost:
    
        if (r9 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
    
        if (r14 == ' ') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (r14 == '\n') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00eb, code lost:
    
        if (",+=\n<>#;\\\"".indexOf(r14) < 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String toKeywordValueString(String str) {
        char charAt;
        boolean z;
        StringBuffer stringBuffer = new StringBuffer(40);
        stringBuffer.append(str);
        stringBuffer.append("=");
        try {
            String asString = this.value.getAsString();
            if (asString == null) {
                byte[] byteArray = this.value.toByteArray();
                stringBuffer.append('#');
                for (int i = 0; i < byteArray.length; i++) {
                    stringBuffer.append(hexDigits.charAt((byteArray[i] >> 4) & 15));
                    stringBuffer.append(hexDigits.charAt(byteArray[i] & PKIBody._CCP));
                }
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                int length = asString.length();
                boolean z2 = true;
                boolean z3 = length > 1 && asString.charAt(0) == '\"' && asString.charAt(length + (-1)) == '\"';
                int i2 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (i2 < length) {
                    char charAt2 = asString.charAt(i2);
                    if (z3 && (i2 == 0 || i2 == length - 1)) {
                        stringBuffer2.append(charAt2);
                        z = z2;
                    } else {
                        z = z2;
                        if (!DerValue.isPrintableStringChar(charAt2) && ",+=\n<>#;\\\"".indexOf(charAt2) < 0) {
                            if (debug == null || !Debug.isOn("ava")) {
                                stringBuffer2.append(charAt2);
                            } else {
                                byte[] bytes = Character.toString(charAt2).getBytes("UTF8");
                                for (int i3 = 0; i3 < bytes.length; i3++) {
                                    stringBuffer2.append(CSPStore.UNIQUE_SEPARATOR);
                                    stringBuffer2.append(Character.toUpperCase(Character.forDigit((bytes[i3] >>> 4) & 15, 16)));
                                    stringBuffer2.append(Character.toUpperCase(Character.forDigit(bytes[i3] & PKIBody._CCP, 16)));
                                }
                            }
                            z5 = false;
                        }
                        if (charAt2 == ' ' || charAt2 == '\n') {
                            if (!z4 && z5) {
                                z4 = z;
                            }
                            z5 = z;
                        } else {
                            if (charAt2 == '\"' || charAt2 == '\\') {
                                stringBuffer2.append(CSPStore.UNIQUE_SEPARATOR);
                            }
                            z5 = false;
                        }
                        stringBuffer2.append(charAt2);
                    }
                    i2++;
                    z2 = z;
                }
                stringBuffer.append((z3 || !((stringBuffer2.length() <= 0 || !((charAt = stringBuffer2.charAt(stringBuffer2.length() + (-1))) == ' ' || charAt == '\n')) ? z4 : z2)) ? stringBuffer2.toString() : "\"" + stringBuffer2.toString() + "\"");
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            ny61.g("DER Value conversion");
            return null;
        }
    }

    private static boolean trailingSpace(Reader reader) throws IOException {
        boolean z = true;
        if (!reader.markSupported()) {
            return true;
        }
        reader.mark(9999);
        while (true) {
            int read = reader.read();
            if (read == -1) {
                break;
            }
            if (read != 32 && (read != 92 || reader.read() != 32)) {
                break;
            }
        }
        z = false;
        reader.reset();
        return z;
    }

    @Override // defpackage.lt61
    public void derEncode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream.putOID(this.oid);
        this.value.encode(derOutputStream);
        derOutputStream2.write((byte) 48, derOutputStream);
        outputStream.write(derOutputStream2.toByteArray());
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derEncode(derOutputStream);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AVA) {
            return toRFC2253CanonicalString().equals(((AVA) obj).toRFC2253CanonicalString());
        }
        return false;
    }

    public DerValue getDerValue() {
        return this.value;
    }

    public ObjectIdentifier getOID() {
        return this.oid;
    }

    public String getValueString() {
        try {
            String asString = this.value.getAsString();
            if (asString != null) {
                return asString;
            }
            throw new RuntimeException("AVA string is null");
        } catch (IOException e) {
            throw new RuntimeException("AVA error: " + e, e);
        }
    }

    public boolean hasRFC2253Keyword() {
        return AVAKeyword.hasKeyword(this.oid, 3);
    }

    public int hashCode() {
        return toRFC2253CanonicalString().hashCode();
    }

    public String toRFC1779String(Map map) {
        return toKeywordValueString(toKeyword(2, map));
    }

    public String toRFC2253CanonicalString() {
        StringBuffer stringBuffer = new StringBuffer(40);
        stringBuffer.append(toKeyword(3, Collections.EMPTY_MAP));
        stringBuffer.append('=');
        if ((stringBuffer.charAt(0) < '0' || stringBuffer.charAt(0) > '9') && isDerString(this.value, true)) {
            try {
                String str = new String(this.value.getDataBytes(), "UTF8");
                StringBuffer stringBuffer2 = new StringBuffer();
                boolean z = false;
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (DerValue.isPrintableStringChar(charAt) || ",+<>;\"\\".indexOf(charAt) >= 0 || (i == 0 && charAt == '#')) {
                        if ((i == 0 && charAt == '#') || ",+<>;\"\\".indexOf(charAt) >= 0) {
                            stringBuffer2.append(CSPStore.UNIQUE_SEPARATOR);
                        }
                        if (Character.isWhitespace(charAt)) {
                            if (!z) {
                                stringBuffer2.append(charAt);
                                z = true;
                            }
                        }
                    } else if (debug != null && Debug.isOn("ava")) {
                        try {
                            byte[] bytes = Character.toString(charAt).getBytes("UTF8");
                            for (int i2 = 0; i2 < bytes.length; i2++) {
                                stringBuffer2.append(CSPStore.UNIQUE_SEPARATOR);
                                stringBuffer2.append(Character.forDigit((bytes[i2] >>> 4) & 15, 16));
                                stringBuffer2.append(Character.forDigit(bytes[i2] & PKIBody._CCP, 16));
                            }
                            z = false;
                        } catch (IOException unused) {
                            ny61.g("DER Value conversion");
                            return null;
                        }
                    }
                    stringBuffer2.append(charAt);
                    z = false;
                }
                stringBuffer.append(stringBuffer2.toString().trim());
            } catch (IOException unused2) {
                ny61.g("DER Value conversion");
                return null;
            }
        } else {
            try {
                byte[] byteArray = this.value.toByteArray();
                stringBuffer.append('#');
                for (byte b : byteArray) {
                    stringBuffer.append(Character.forDigit((b >>> 4) & 15, 16));
                    stringBuffer.append(Character.forDigit(b & PKIBody._CCP, 16));
                }
            } catch (IOException unused3) {
                ny61.g("DER Value conversion");
                return null;
            }
        }
        String stringBuffer3 = stringBuffer.toString();
        Locale locale = Locale.US;
        return Normalizer.normalize(stringBuffer3.toUpperCase(locale).toLowerCase(locale), Normalizer.DECOMP_COMPAT, 0);
    }

    public String toRFC2253String(Map map) {
        char c;
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(toKeyword(3, map));
        stringBuffer.append('=');
        int i = 0;
        if ((stringBuffer.charAt(0) < '0' || stringBuffer.charAt(0) > '9') && isDerString(this.value, false)) {
            try {
                String str = new String(this.value.getDataBytes(), "UTF8");
                StringBuffer stringBuffer2 = new StringBuffer();
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (!DerValue.isPrintableStringChar(charAt) && ",=+<>#;\"\\".indexOf(charAt) < 0) {
                        if (charAt == 0) {
                            stringBuffer2.append("\\00");
                        } else if (debug != null && Debug.isOn("ava")) {
                            try {
                                byte[] bytes = Character.toString(charAt).getBytes("UTF8");
                                for (int i3 = 0; i3 < bytes.length; i3++) {
                                    stringBuffer2.append(CSPStore.UNIQUE_SEPARATOR);
                                    stringBuffer2.append(Character.toUpperCase(Character.forDigit((bytes[i3] >>> 4) & 15, 16)));
                                    stringBuffer2.append(Character.toUpperCase(Character.forDigit(bytes[i3] & PKIBody._CCP, 16)));
                                }
                            } catch (IOException unused) {
                                ny61.g("DER Value conversion");
                                return null;
                            }
                        }
                    } else if (",=+<>#;\"\\".indexOf(charAt) >= 0) {
                        stringBuffer2.append(CSPStore.UNIQUE_SEPARATOR);
                    }
                    stringBuffer2.append(charAt);
                }
                char[] charArray = stringBuffer2.toString().toCharArray();
                StringBuffer stringBuffer3 = new StringBuffer();
                int i4 = 0;
                while (i4 < charArray.length && ((c = charArray[i4]) == ' ' || c == '\r')) {
                    i4++;
                }
                int length = charArray.length - 1;
                while (length >= 0) {
                    char c2 = charArray[length];
                    if (c2 != ' ' && c2 != '\r') {
                        break;
                    }
                    length--;
                }
                while (i < charArray.length) {
                    char c3 = charArray[i];
                    if (i < i4 || i > length) {
                        stringBuffer3.append(CSPStore.UNIQUE_SEPARATOR);
                    }
                    stringBuffer3.append(c3);
                    i++;
                }
                stringBuffer.append(stringBuffer3.toString());
            } catch (IOException unused2) {
                ny61.g("DER Value conversion");
                return null;
            }
        } else {
            try {
                byte[] byteArray = this.value.toByteArray();
                stringBuffer.append('#');
                while (i < byteArray.length) {
                    byte b = byteArray[i];
                    stringBuffer.append(Character.forDigit((b >>> 4) & 15, 16));
                    stringBuffer.append(Character.forDigit(b & PKIBody._CCP, 16));
                    i++;
                }
            } catch (IOException unused3) {
                ny61.g("DER Value conversion");
                return null;
            }
        }
        return stringBuffer.toString();
    }

    public String toString() {
        return toKeywordValueString(toKeyword(1, Collections.EMPTY_MAP));
    }

    public String toRFC1779String() {
        return toRFC1779String(Collections.EMPTY_MAP);
    }

    public AVA(Reader reader, int i) throws IOException {
        this(reader, i, Collections.EMPTY_MAP);
    }

    public AVA(Reader reader) throws IOException {
        this(reader, 1);
    }

    public AVA(Reader reader, Map map) throws IOException {
        this(reader, 1, map);
    }

    public AVA(DerInputStream derInputStream) throws IOException {
        this(derInputStream.getDerValue());
    }

    public AVA(DerValue derValue) throws IOException {
        if (derValue.tag != 48) {
            ny61.v("AVA not a sequence");
            throw null;
        }
        this.oid = X500Name.intern(derValue.data.getOID());
        this.value = derValue.data.getDerValue();
        if (derValue.data.available() == 0) {
            return;
        }
        yci0.s(derValue.data.available(), "AVA, extra bytes = ");
        throw null;
    }

    public AVA(ObjectIdentifier objectIdentifier, DerValue derValue) {
        if (objectIdentifier == null || derValue == null) {
            throw null;
        }
        this.oid = objectIdentifier;
        this.value = derValue;
    }

    public String toRFC2253String() {
        return toRFC2253String(Collections.EMPTY_MAP);
    }
}
