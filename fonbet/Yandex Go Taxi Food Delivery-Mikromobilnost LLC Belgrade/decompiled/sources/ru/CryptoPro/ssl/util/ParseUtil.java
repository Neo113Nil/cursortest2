package ru.CryptoPro.ssl.util;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.w511;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.BitSet;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class ParseUtil {
    public static final BitSet a;
    public static final char[] b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;

    static {
        BitSet bitSet = new BitSet(256);
        a = bitSet;
        bitSet.set(61);
        bitSet.set(59);
        bitSet.set(63);
        bitSet.set(47);
        bitSet.set(35);
        bitSet.set(32);
        bitSet.set(60);
        bitSet.set(62);
        bitSet.set(37);
        bitSet.set(34);
        bitSet.set(HProv.PP_PASSWD_TERM);
        bitSet.set(HProv.PP_DELETE_KEYSET);
        bitSet.set(HProv.PP_SAME_MEDIA);
        bitSet.set(92);
        bitSet.set(94);
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(96);
        for (int i2 = 0; i2 < 32; i2++) {
            a.set(i2);
        }
        a.set(HProv.PP_VERSION_TIMESTAMP);
        b = new char[]{MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        long j2 = 0;
        for (int max = Math.max(Math.min(48, 63), 0); max <= Math.max(Math.min(57, 63), 0); max++) {
            j2 |= 1 << max;
        }
        c = j2;
        d = f('A', 'F') | f('a', 'f');
        long f2 = f('A', 'Z') | f('a', 'z');
        long b2 = b("-_.!~*'()") | j2;
        long g2 = g("-_.!~*'()") | f2;
        long b3 = b(";/?:@&=+$,[]");
        long g3 = g(";/?:@&=+$,[]");
        long b4 = b("-");
        long g4 = g("-");
        e = b3 | b2 | 1;
        f = g3 | g2;
        long j3 = 1 | b2;
        long b5 = b(":@&=+$,") | j3;
        long g5 = g(":@&=+$,") | g2;
        g = b5 | b(";/");
        h = g(";/") | g5;
        long b6 = b(";:&=+$,") | j3;
        long g6 = g(";:&=+$,") | g2;
        i = j3 | b("$,;:@&=+");
        j = g("$,;:@&=+") | g2;
        k = b6 | j2 | b4 | b(".:@[]");
        l = f2 | g6 | g4 | g(".:@[]");
    }

    public static int a(char[] cArr, char c2, int i2) {
        cArr[i2] = '%';
        int i3 = i2 + 2;
        cArr[i2 + 1] = Character.forDigit((c2 >> 4) & 15, 16);
        int i4 = i2 + 3;
        cArr[i3] = Character.forDigit(c2 & 15, 16);
        return i4;
    }

    public static long b(String str) {
        int length = str.length();
        long j2 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < '@') {
                j2 |= 1 << charAt;
            }
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (e(r20.charAt(r14), r4, r0) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(long j2, long j3, String str) {
        ByteBuffer byteBuffer;
        long j4 = j2;
        str.getClass();
        boolean z = (1 & j4) != 0;
        int i2 = 0;
        StringBuffer stringBuffer = null;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            char[] cArr = b;
            if (charAt < 128) {
                if (!e(charAt, j4, j3)) {
                    int i3 = i2 + 2;
                    if (str.length() > i3 && str.charAt(i2) == '%') {
                        char charAt2 = str.charAt(i2 + 1);
                        long j5 = c;
                        long j6 = d;
                        if (e(charAt2, j5, j6)) {
                        }
                    }
                    if (stringBuffer == null) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append(str.substring(0, i2));
                        stringBuffer = stringBuffer2;
                    }
                    byte b2 = (byte) charAt;
                    stringBuffer.append('%');
                    stringBuffer.append(cArr[(b2 >> 4) & 15]);
                    stringBuffer.append(cArr[b2 & PKIBody._CCP]);
                }
                if (stringBuffer != null) {
                    stringBuffer.append(charAt);
                }
            } else if (z && (Character.isSpaceChar(charAt) || Character.isISOControl(charAt))) {
                if (stringBuffer == null) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(str.substring(0, i2));
                    stringBuffer = stringBuffer3;
                }
                try {
                    byteBuffer = ThreadLocalCoders.encoderFor("UTF-8").encode(CharBuffer.wrap("" + charAt));
                } catch (CharacterCodingException unused) {
                    byteBuffer = null;
                }
                while (byteBuffer.hasRemaining()) {
                    int i4 = byteBuffer.get() & 255;
                    if (i4 >= 128) {
                        byte b3 = (byte) i4;
                        stringBuffer.append('%');
                        stringBuffer.append(cArr[(b3 >> 4) & 15]);
                        stringBuffer.append(cArr[b3 & PKIBody._CCP]);
                    } else {
                        stringBuffer.append((char) i4);
                    }
                }
            } else if (stringBuffer != null) {
                stringBuffer.append(charAt);
            }
            i2++;
            j4 = j2;
        }
        return stringBuffer == null ? str : stringBuffer.toString();
    }

    public static URI d(String str, String str2, String str3, String str4, String str5) {
        String c2;
        String substring;
        String str6 = str2;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
            stringBuffer.append(':');
        }
        if (str6 != null) {
            stringBuffer.append("//");
            boolean startsWith = str6.startsWith("[");
            long j2 = l;
            long j3 = j;
            long j4 = k;
            long j5 = i;
            if (startsWith) {
                int indexOf = str6.indexOf("]");
                if (indexOf != -1 && str6.indexOf(":") != -1) {
                    if (indexOf == str6.length()) {
                        substring = "";
                    } else {
                        int i2 = indexOf + 1;
                        String substring2 = str6.substring(0, i2);
                        substring = str6.substring(i2);
                        str6 = substring2;
                    }
                    stringBuffer.append(str6);
                    c2 = c(j5 | j4, j2 | j3, substring);
                }
            } else {
                c2 = c(j5 | j4, j2 | j3, str6);
            }
            stringBuffer.append(c2);
        }
        if (str3 != null) {
            stringBuffer.append(c(g, h, str3));
        }
        long j6 = f;
        long j7 = e;
        if (str4 != null) {
            stringBuffer.append('?');
            stringBuffer.append(c(j7, j6, str4));
        }
        if (str5 != null) {
            stringBuffer.append('#');
            stringBuffer.append(c(j7, j6, str5));
        }
        String stringBuffer2 = stringBuffer.toString();
        if (str == null || str3 == null || str3.length() <= 0 || str3.charAt(0) == '/') {
            return new URI(stringBuffer2);
        }
        throw new URISyntaxException(stringBuffer2, "Relative path in absolute URI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0036, code lost:
    
        r2.append(r7);
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String decode(String str) {
        int length = str.length();
        if (length == 0 || str.indexOf(37) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length);
        ByteBuffer allocate = ByteBuffer.allocate(length);
        CharBuffer allocate2 = CharBuffer.allocate(length);
        CharsetDecoder decoderFor = ThreadLocalCoders.decoderFor("UTF-8");
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        CharsetDecoder onUnmappableCharacter = decoderFor.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        int i2 = 0;
        loop0: do {
            char charAt = str.charAt(i2);
            while (true) {
                if (i2 >= length) {
                    break loop0;
                }
                if (charAt != '%') {
                    break;
                }
                allocate.clear();
                do {
                    int i3 = i2 + 1;
                    i2 += 3;
                    try {
                        allocate.put((byte) Integer.parseInt(str.substring(i3, i2), 16));
                        if (i2 >= length) {
                            break;
                        }
                        charAt = str.charAt(i2);
                    } catch (NumberFormatException unused) {
                        w511.q();
                        return null;
                    }
                } while (charAt == '%');
                allocate.flip();
                allocate2.clear();
                onUnmappableCharacter.reset();
                if (onUnmappableCharacter.decode(allocate, allocate2, true).isError()) {
                    ny61.g("Error decoding percent encoded characters");
                    return null;
                }
                if (onUnmappableCharacter.flush(allocate2).isError()) {
                    ny61.g("Error decoding percent encoded characters");
                    return null;
                }
                sb.append(allocate2.flip().toString());
            }
        } while (i2 < length);
        return sb.toString();
    }

    public static boolean e(char c2, long j2, long j3) {
        return c2 < '@' ? ((1 << c2) & j2) != 0 : c2 < 128 && ((1 << (c2 - 64)) & j3) != 0;
    }

    public static String encodePath(String str, boolean z) {
        int i2;
        int i3;
        char[] cArr = new char[(str.length() * 2) + 16];
        char[] charArray = str.toCharArray();
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char c2 = charArray[i5];
            if ((z || c2 != '/') && !(z && c2 == File.separatorChar)) {
                if (c2 <= 127) {
                    if ((c2 >= 'a' && c2 <= 'z') || ((c2 >= 'A' && c2 <= 'Z') || (c2 >= '0' && c2 <= '9'))) {
                        i3 = i4 + 1;
                        cArr[i4] = c2;
                    } else if (!a.get(c2)) {
                        i3 = i4 + 1;
                        cArr[i4] = c2;
                    }
                    i4 = i3;
                } else {
                    if (c2 > 2047) {
                        i4 = a(cArr, (char) (((c2 >> '\f') & 15) | 224), i4);
                        i2 = ((c2 >> 6) & 63) | 128;
                    } else {
                        i2 = ((c2 >> 6) & 31) | 192;
                    }
                    i4 = a(cArr, (char) i2, i4);
                    c2 = (char) ((c2 & '?') | 128);
                }
                i4 = a(cArr, c2, i4);
            } else {
                cArr[i4] = '/';
                i4++;
            }
            if (i4 + 9 > cArr.length) {
                int length2 = (cArr.length * 2) + 16;
                if (length2 < 0) {
                    length2 = Integer.MAX_VALUE;
                }
                char[] cArr2 = new char[length2];
                System.arraycopy(cArr, 0, cArr2, 0, i4);
                cArr = cArr2;
            }
        }
        return new String(cArr, 0, i4);
    }

    public static long f(char c2, char c3) {
        long j2 = 0;
        for (int max = Math.max(Math.min((int) c2, HProv.PP_VERSION_TIMESTAMP), 64) - 64; max <= Math.max(Math.min((int) c3, HProv.PP_VERSION_TIMESTAMP), 64) - 64; max++) {
            j2 |= 1 << max;
        }
        return j2;
    }

    public static URL fileToEncodedURL(File file) throws MalformedURLException {
        String encodePath = encodePath(file.getAbsolutePath());
        if (!encodePath.startsWith("/")) {
            encodePath = "/".concat(encodePath);
        }
        if (!encodePath.endsWith("/") && file.isDirectory()) {
            encodePath = encodePath.concat("/");
        }
        return new URL("file", "", encodePath);
    }

    public static long g(String str) {
        int length = str.length();
        long j2 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= '@' && charAt < 128) {
                j2 |= 1 << (charAt - '@');
            }
        }
        return j2;
    }

    public static URI toURI(URL url) {
        String protocol = url.getProtocol();
        String authority = url.getAuthority();
        String path = url.getPath();
        String query = url.getQuery();
        String ref = url.getRef();
        if (path != null && !path.startsWith("/")) {
            path = "/".concat(path);
        }
        if (authority != null && authority.endsWith(":-1")) {
            authority = oyr.g(3, 0, authority);
        }
        try {
            return d(protocol, authority, path, query, ref);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public String canonizeString(String str) {
        str.getClass();
        while (true) {
            int indexOf = str.indexOf("/../");
            if (indexOf < 0) {
                break;
            }
            int lastIndexOf = str.lastIndexOf(47, indexOf - 1);
            str = lastIndexOf >= 0 ? str.substring(0, lastIndexOf).concat(str.substring(indexOf + 3)) : str.substring(indexOf + 3);
        }
        while (true) {
            int indexOf2 = str.indexOf("/./");
            if (indexOf2 < 0) {
                break;
            }
            str = str.substring(0, indexOf2).concat(str.substring(indexOf2 + 2));
        }
        while (str.endsWith("/..")) {
            int indexOf3 = str.indexOf("/..");
            int lastIndexOf2 = str.lastIndexOf(47, indexOf3 - 1);
            str = lastIndexOf2 >= 0 ? str.substring(0, lastIndexOf2 + 1) : str.substring(0, indexOf3);
        }
        return str.endsWith("/.") ? oyr.g(1, 0, str) : str;
    }

    public static String encodePath(String str) {
        return encodePath(str, true);
    }
}
