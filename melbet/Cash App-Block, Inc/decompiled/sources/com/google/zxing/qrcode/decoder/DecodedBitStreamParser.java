package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes4.dex */
public abstract class DecodedBitStreamParser {
    public static final char[] ALPHANUMERIC_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, ' ', '$', '%', '*', '+', '-', '.', '/', ':'};

    public static void decodeAlphanumericSegment(BitSource bitSource, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (bitSource.available() < 11) {
                throw FormatException.getFormatInstance();
            }
            int readBits = bitSource.readBits(11);
            sb.append(toAlphaNumericChar(readBits / 45));
            sb.append(toAlphaNumericChar(readBits % 45));
            i -= 2;
        }
        if (i == 1) {
            if (bitSource.available() < 6) {
                throw FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(bitSource.readBits(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void decodeByteSegment(BitSource bitSource, StringBuilder sb, int i, CharacterSetECI characterSetECI, ArrayList arrayList) {
        Charset forName;
        boolean z;
        byte b;
        if (i * 8 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) bitSource.readBits(8);
        }
        if (characterSetECI == null) {
            Charset charset = StringUtils.SHIFT_JIS_CHARSET;
            boolean z2 = true;
            if (i <= 2 || !(((b = bArr[0]) == -2 && bArr[1] == -1) || (b == -1 && bArr[1] == -2))) {
                boolean z3 = charset != null;
                boolean z4 = i > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z5 = z3;
                boolean z6 = true;
                while (i6 < i && (z2 || z5 || z6)) {
                    Charset charset2 = charset;
                    byte b2 = bArr[i6];
                    boolean z7 = z2;
                    int i15 = b2 & 255;
                    if (z6) {
                        if (i7 <= 0) {
                            z = z6;
                            if ((b2 & 128) != 0) {
                                if ((b2 & 64) != 0) {
                                    int i16 = i7 + 1;
                                    if ((b2 & PnmConstants.PNM_SEPARATOR) == 0) {
                                        i9++;
                                    } else {
                                        i16 = i7 + 2;
                                        if ((b2 & 16) == 0) {
                                            i10++;
                                        } else {
                                            i7 += 3;
                                            if ((b2 & 8) == 0) {
                                                i11++;
                                            }
                                        }
                                    }
                                    i7 = i16;
                                }
                            }
                        } else if ((b2 & 128) != 0) {
                            i7--;
                            if (z7) {
                                if (i15 > 127 && i15 < 160) {
                                    z7 = false;
                                } else if (i15 > 159 && (i15 < 192 || i15 == 215 || i15 == 247)) {
                                    i12++;
                                }
                            }
                            if (z5) {
                                if (i8 > 0) {
                                    if (i15 >= 64 && i15 != 127 && i15 <= 252) {
                                        i8--;
                                    }
                                    z5 = false;
                                } else {
                                    if (i15 != 128 && i15 != 160 && i15 <= 239) {
                                        if (i15 <= 160 || i15 >= 224) {
                                            if (i15 > 127) {
                                                i8++;
                                                int i17 = i13 + 1;
                                                if (i17 > i4) {
                                                    i4 = i17;
                                                    i13 = i4;
                                                } else {
                                                    i13 = i17;
                                                }
                                            } else {
                                                i13 = 0;
                                            }
                                            i14 = 0;
                                        } else {
                                            i5++;
                                            int i18 = i14 + 1;
                                            if (i18 > i2) {
                                                i2 = i18;
                                                i14 = i2;
                                            } else {
                                                i14 = i18;
                                            }
                                            i13 = 0;
                                        }
                                    }
                                    z5 = false;
                                }
                            }
                            i6++;
                            charset = charset2;
                            z2 = z7;
                        }
                        z6 = false;
                        if (z7) {
                        }
                        if (z5) {
                        }
                        i6++;
                        charset = charset2;
                        z2 = z7;
                    } else {
                        z = z6;
                    }
                    z6 = z;
                    if (z7) {
                    }
                    if (z5) {
                    }
                    i6++;
                    charset = charset2;
                    z2 = z7;
                }
                Charset charset3 = charset;
                boolean z8 = z2;
                boolean z9 = z6;
                boolean z10 = (!z9 || i7 <= 0) ? z9 : false;
                boolean z11 = (!z5 || i8 <= 0) ? z5 : false;
                if (!z10 || (!z4 && i9 + i10 + i11 <= 0)) {
                    if (!z11 || (!StringUtils.ASSUME_SHIFT_JIS && i2 < 3 && i4 < 3)) {
                        if (z8 && z11) {
                            if ((i2 != 2 || i5 != 2) && i12 * 10 < i) {
                                forName = StandardCharsets.ISO_8859_1;
                            }
                        } else if (z8) {
                            forName = StandardCharsets.ISO_8859_1;
                        } else if (!z11) {
                            forName = z10 ? StandardCharsets.UTF_8 : StringUtils.PLATFORM_DEFAULT_ENCODING;
                        }
                    }
                    forName = charset3;
                } else {
                    forName = StandardCharsets.UTF_8;
                }
            } else {
                forName = StandardCharsets.UTF_16;
            }
        } else {
            forName = Charset.forName(characterSetECI.name());
        }
        sb.append(new String(bArr, forName));
        arrayList.add(bArr);
    }

    public static void decodeHanziSegment(BitSource bitSource, StringBuilder sb, int i) {
        if (StringUtils.GB2312_CHARSET == null) {
            throw FormatException.getFormatInstance();
        }
        if (i * 13 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int readBits = bitSource.readBits(13);
            int i3 = (readBits % 96) | ((readBits / 96) << 8);
            int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
            bArr[i2] = (byte) ((i4 >> 8) & 255);
            bArr[i2 + 1] = (byte) (i4 & 255);
            i2 += 2;
            i--;
        }
        sb.append(new String(bArr, StringUtils.GB2312_CHARSET));
    }

    public static void decodeKanjiSegment(BitSource bitSource, StringBuilder sb, int i) {
        if (StringUtils.SHIFT_JIS_CHARSET == null) {
            throw FormatException.getFormatInstance();
        }
        if (i * 13 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int readBits = bitSource.readBits(13);
            int i3 = (readBits % 192) | ((readBits / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        sb.append(new String(bArr, StringUtils.SHIFT_JIS_CHARSET));
    }

    public static void decodeNumericSegment(BitSource bitSource, StringBuilder sb, int i) {
        while (i >= 3) {
            if (bitSource.available() < 10) {
                throw FormatException.getFormatInstance();
            }
            int readBits = bitSource.readBits(10);
            if (readBits >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(readBits / 100));
            sb.append(toAlphaNumericChar((readBits / 10) % 10));
            sb.append(toAlphaNumericChar(readBits % 10));
            i -= 3;
        }
        if (i == 2) {
            if (bitSource.available() < 7) {
                throw FormatException.getFormatInstance();
            }
            int readBits2 = bitSource.readBits(7);
            if (readBits2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(readBits2 / 10));
            sb.append(toAlphaNumericChar(readBits2 % 10));
            return;
        }
        if (i == 1) {
            if (bitSource.available() < 4) {
                throw FormatException.getFormatInstance();
            }
            int readBits3 = bitSource.readBits(4);
            if (readBits3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(readBits3));
        }
    }

    public static char toAlphaNumericChar(int i) {
        if (i < 45) {
            return ALPHANUMERIC_CHARS[i];
        }
        throw FormatException.getFormatInstance();
    }
}
