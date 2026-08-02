package ru.CryptoPro.ssl.util;

/* loaded from: classes4.dex */
public class IPAddressUtil {
    public static byte[] convertFromIPv4MappedAddress(byte[] bArr) {
        if (bArr.length < 16 || bArr[0] != 0 || bArr[1] != 0 || bArr[2] != 0 || bArr[3] != 0 || bArr[4] != 0 || bArr[5] != 0 || bArr[6] != 0 || bArr[7] != 0 || bArr[8] != 0 || bArr[9] != 0 || bArr[10] != -1 || bArr[11] != -1) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 12, bArr2, 0, 4);
        return bArr2;
    }

    public static boolean isIPv4LiteralAddress(String str) {
        return textToNumericFormatV4(str) != null;
    }

    public static boolean isIPv6LiteralAddress(String str) {
        return textToNumericFormatV6(str) != null;
    }

    public static byte[] textToNumericFormatV4(String str) {
        byte[] bArr = new byte[4];
        int length = str.length();
        if (length != 0 && length <= 15) {
            long j = 0;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt != '.') {
                    int digit = Character.digit(charAt, 10);
                    if (digit < 0) {
                        return null;
                    }
                    j = (j * 10) + digit;
                } else {
                    if (j < 0 || j > 255 || i == 3) {
                        return null;
                    }
                    bArr[i] = (byte) (j & 255);
                    j = 0;
                    i++;
                }
            }
            if (j >= 0 && j < (1 << ((4 - i) * 8))) {
                if (i == 0) {
                    bArr[0] = (byte) ((j >> 24) & 255);
                } else if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return bArr;
                        }
                        bArr[3] = (byte) (j & 255);
                        return bArr;
                    }
                    bArr[2] = (byte) ((j >> 8) & 255);
                    bArr[3] = (byte) (j & 255);
                    return bArr;
                }
                bArr[1] = (byte) ((j >> 16) & 255);
                bArr[2] = (byte) ((j >> 8) & 255);
                bArr[3] = (byte) (j & 255);
                return bArr;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c1, code lost:
    
        if (r13 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c5, code lost:
    
        if ((r14 + 2) <= 16) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c7, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c8, code lost:
    
        r0 = r14 + 1;
        r4[r14] = (byte) (((r12 == true ? 1 : 0) >> 8) & 255);
        r14 = r14 + 2;
        r4[r0] = (byte) ((r12 == true ? 1 : 0) & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        if (r15 == (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00da, code lost:
    
        r0 = r14 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00dc, code lost:
    
        if (r14 != 16) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00de, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00df, code lost:
    
        if (r10 > r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e1, code lost:
    
        r3 = (r15 + r0) - r10;
        r4[16 - r10] = r4[r3];
        r4[r3] = r17;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ef, code lost:
    
        r14 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f0, code lost:
    
        if (r14 == 16) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f2, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f3, code lost:
    
        r0 = convertFromIPv4MappedAddress(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f7, code lost:
    
        if (r0 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] textToNumericFormatV6(String str) {
        int i;
        byte[] bArr;
        byte b;
        byte[] textToNumericFormatV4;
        byte[] bArr2 = null;
        if (str.length() >= 2) {
            char[] charArray = str.toCharArray();
            byte[] bArr3 = new byte[16];
            int length = charArray.length;
            int indexOf = str.indexOf("%");
            if (indexOf != length - 1) {
                if (indexOf != -1) {
                    length = indexOf;
                }
                byte b2 = 0;
                int i2 = 1;
                if (charArray[0] != ':') {
                    i = 0;
                } else {
                    if (charArray[1] != ':') {
                        return null;
                    }
                    i = 1;
                }
                int i3 = 0;
                byte b3 = 0;
                int i4 = 0;
                int i5 = -1;
                int i6 = i;
                while (true) {
                    if (i >= length) {
                        bArr = bArr2;
                        b = b2;
                        break;
                    }
                    bArr = bArr2;
                    int i7 = i + 1;
                    char c = charArray[i];
                    b = b2;
                    int digit = Character.digit(c, 16);
                    if (digit != -1) {
                        i3 = ((i3 == true ? 1 : 0) << 4) | digit;
                        if (i3 > 65535) {
                            return bArr;
                        }
                        i = i7;
                        b3 = 1;
                    } else if (c == ':') {
                        if (b3 == 0) {
                            if (i5 != -1) {
                                return bArr;
                            }
                            i = i7;
                            i6 = i;
                            i5 = i4;
                        } else {
                            if (i7 == length || i4 + 2 > 16) {
                                return bArr;
                            }
                            int i8 = i4 + 1;
                            bArr3[i4] = (byte) (((i3 == true ? 1 : 0) >> 8) & 255);
                            i4 += 2;
                            bArr3[i8] = (byte) ((i3 == true ? 1 : 0) & 255);
                            i = i7;
                            i6 = i;
                            bArr2 = bArr;
                            b2 = b;
                            i3 = b2;
                            b3 = i3 == true ? 1 : 0;
                        }
                    } else {
                        if (c != '.' || i4 + 4 > 16) {
                            return bArr;
                        }
                        String substring = str.substring(i6, length);
                        int i9 = b;
                        int i10 = i9;
                        while (true) {
                            int indexOf2 = substring.indexOf(46, i9);
                            if (indexOf2 == -1) {
                                break;
                            }
                            i10++;
                            i9 = indexOf2 + 1;
                        }
                        if (i10 != 3 || (textToNumericFormatV4 = textToNumericFormatV4(substring)) == null) {
                            return bArr;
                        }
                        int i11 = b;
                        while (i11 < 4) {
                            bArr3[i4] = textToNumericFormatV4[i11];
                            i11++;
                            i4++;
                        }
                        b3 = b;
                    }
                    bArr2 = bArr;
                    b2 = b;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
