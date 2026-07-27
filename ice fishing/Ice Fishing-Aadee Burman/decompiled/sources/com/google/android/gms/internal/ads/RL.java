package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public abstract class RL {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27197a = 0;

    static {
        int i = BK.f23877a;
    }

    public static boolean a(byte[] bArr, int i, int i6) {
        while (i < i6 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i6) {
            return true;
        }
        while (i < i6) {
            int i9 = i + 1;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                i = i9;
            } else if (b9 < -32) {
                if (i9 >= i6 || b9 < -62) {
                    return false;
                }
                i += 2;
                if (bArr[i9] > -65) {
                    return false;
                }
            } else if (b9 < -16) {
                if (i9 >= i6 - 1) {
                    return false;
                }
                int i10 = i + 2;
                byte b10 = bArr[i9];
                if (b10 > -65) {
                    return false;
                }
                if (b9 == -32 && b10 < -96) {
                    return false;
                }
                if (b9 == -19 && b10 >= -96) {
                    return false;
                }
                i += 3;
                if (bArr[i10] > -65) {
                    return false;
                }
            } else {
                if (i9 >= i6 - 2) {
                    return false;
                }
                int i11 = i + 2;
                byte b11 = bArr[i9];
                if (b11 > -65) {
                    return false;
                }
                if ((((b11 + 112) + (b9 << 28)) >> 30) != 0) {
                    return false;
                }
                int i12 = i + 3;
                if (bArr[i11] > -65) {
                    return false;
                }
                i += 4;
                if (bArr[i12] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return r12 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(byte[] bArr, int i, int i6, String str) {
        int i9;
        int i10;
        int length;
        int i11;
        char charAt;
        int length2 = str.length();
        int i12 = 0;
        while (true) {
            i9 = i + i6;
            if (i12 >= length2 || (i11 = i12 + i) >= i9 || (charAt = str.charAt(i12)) >= 128) {
                break;
            }
            bArr[i11] = (byte) charAt;
            i12++;
        }
        int i13 = i + i12;
        while (i12 < length2) {
            char charAt2 = str.charAt(i12);
            if (charAt2 < 128 && i13 < i9) {
                bArr[i13] = (byte) charAt2;
                i13++;
            } else if (charAt2 < 2048 && i13 <= i9 - 2) {
                bArr[i13] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                i13 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i13 > i9 - 3) {
                    if (i13 <= i9 - 4) {
                        i12++;
                        if (i12 != str.length()) {
                            char charAt3 = str.charAt(i12);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int i14 = i13 + 3;
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i13 += 4;
                                bArr[i14] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes.length;
                        if (length - i > i6) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i, length);
                    } else {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i10 = i12 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i10)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes2.length;
                        if (length - i > i6) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i, length);
                    }
                    return i + length;
                }
                bArr[i13] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i13 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i13 + 2] = (byte) ((charAt2 & '?') | 128);
                i13 += 3;
            }
            i12++;
        }
        return i13;
    }

    public static String c(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i) - i6) | i | i6) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i6)));
        }
        int i9 = i + i6;
        char[] cArr = new char[i6];
        int i10 = 0;
        while (i < i9) {
            byte b9 = bArr[i];
            if (b9 < 0) {
                break;
            }
            i++;
            cArr[i10] = (char) b9;
            i10++;
        }
        while (i < i9) {
            int i11 = i + 1;
            byte b10 = bArr[i];
            if (b10 >= 0) {
                cArr[i10] = (char) b10;
                i10++;
                i = i11;
                while (i < i9) {
                    byte b11 = bArr[i];
                    if (b11 >= 0) {
                        i++;
                        cArr[i10] = (char) b11;
                        i10++;
                    }
                }
            } else {
                if (b10 >= -32) {
                    if (b10 < -16) {
                        if (i11 >= i9 - 1) {
                            throw new C3295hL("Protocol message had invalid UTF-8.");
                        }
                        int i12 = i10 + 1;
                        int i13 = i + 2;
                        byte b12 = bArr[i11];
                        i += 3;
                        byte b13 = bArr[i13];
                        if (!AbstractC4094wD.j(b12)) {
                            if (b10 == -32) {
                                if (b12 >= -96) {
                                    b10 = -32;
                                }
                            }
                            if (b10 == -19) {
                                if (b12 < -96) {
                                    b10 = -19;
                                }
                            }
                            if (!AbstractC4094wD.j(b13)) {
                                cArr[i10] = (char) (((b12 & com.anythink.core.common.s.a.c.f16318c) << 6) | ((b10 & 15) << 12) | (b13 & com.anythink.core.common.s.a.c.f16318c));
                                i10 = i12;
                            }
                        }
                        throw new C3295hL("Protocol message had invalid UTF-8.");
                    }
                    if (i11 >= i9 - 2) {
                        throw new C3295hL("Protocol message had invalid UTF-8.");
                    }
                    byte b14 = bArr[i11];
                    int i14 = i + 3;
                    byte b15 = bArr[i + 2];
                    i += 4;
                    byte b16 = bArr[i14];
                    if (!AbstractC4094wD.j(b14)) {
                        if ((((b14 + 112) + (b10 << 28)) >> 30) == 0 && !AbstractC4094wD.j(b15) && !AbstractC4094wD.j(b16)) {
                            int i15 = ((b14 & com.anythink.core.common.s.a.c.f16318c) << 12) | ((b10 & 7) << 18) | ((b15 & com.anythink.core.common.s.a.c.f16318c) << 6) | (b16 & com.anythink.core.common.s.a.c.f16318c);
                            cArr[i10] = (char) ((i15 >>> 10) + 55232);
                            cArr[i10 + 1] = (char) ((i15 & 1023) + 56320);
                            i10 += 2;
                        }
                    }
                    throw new C3295hL("Protocol message had invalid UTF-8.");
                }
                if (i11 >= i9) {
                    throw new C3295hL("Protocol message had invalid UTF-8.");
                }
                int i16 = i10 + 1;
                i += 2;
                byte b17 = bArr[i11];
                if (b10 < -62 || AbstractC4094wD.j(b17)) {
                    throw new C3295hL("Protocol message had invalid UTF-8.");
                }
                cArr[i10] = (char) ((b17 & com.anythink.core.common.s.a.c.f16318c) | ((b10 & 31) << 6));
                i10 = i16;
            }
        }
        return new String(cArr, 0, i10);
    }
}
