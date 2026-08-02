package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public abstract class RL {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27953a = 0;

    static {
        int i = BK.f24648a;
    }

    public static boolean a(byte[] bArr, int i, int i4) {
        while (i < i4 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i4) {
            return true;
        }
        while (i < i4) {
            int i6 = i + 1;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                i = i6;
            } else if (b9 < -32) {
                if (i6 >= i4 || b9 < -62) {
                    return false;
                }
                i += 2;
                if (bArr[i6] > -65) {
                    return false;
                }
            } else if (b9 < -16) {
                if (i6 >= i4 - 1) {
                    return false;
                }
                int i9 = i + 2;
                byte b10 = bArr[i6];
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
                if (bArr[i9] > -65) {
                    return false;
                }
            } else {
                if (i6 >= i4 - 2) {
                    return false;
                }
                int i10 = i + 2;
                byte b11 = bArr[i6];
                if (b11 > -65) {
                    return false;
                }
                if ((((b11 + 112) + (b9 << 28)) >> 30) != 0) {
                    return false;
                }
                int i11 = i + 3;
                if (bArr[i10] > -65) {
                    return false;
                }
                i += 4;
                if (bArr[i11] > -65) {
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
    public static int b(byte[] bArr, int i, int i4, String str) {
        int i6;
        int i9;
        int length;
        int i10;
        char charAt;
        int length2 = str.length();
        int i11 = 0;
        while (true) {
            i6 = i + i4;
            if (i11 >= length2 || (i10 = i11 + i) >= i6 || (charAt = str.charAt(i11)) >= 128) {
                break;
            }
            bArr[i10] = (byte) charAt;
            i11++;
        }
        int i12 = i + i11;
        while (i11 < length2) {
            char charAt2 = str.charAt(i11);
            if (charAt2 < 128 && i12 < i6) {
                bArr[i12] = (byte) charAt2;
                i12++;
            } else if (charAt2 < 2048 && i12 <= i6 - 2) {
                bArr[i12] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i12 + 1] = (byte) ((charAt2 & '?') | 128);
                i12 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i12 > i6 - 3) {
                    if (i12 <= i6 - 4) {
                        i11++;
                        if (i11 != str.length()) {
                            char charAt3 = str.charAt(i11);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int i13 = i12 + 3;
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i12] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i12 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i12 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i12 += 4;
                                bArr[i13] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes.length;
                        if (length - i > i4) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i, length);
                    } else {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i9 = i11 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i9)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes2.length;
                        if (length - i > i4) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i, length);
                    }
                    return i + length;
                }
                bArr[i12] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i12 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i12 + 2] = (byte) ((charAt2 & '?') | 128);
                i12 += 3;
            }
            i11++;
        }
        return i12;
    }

    public static String c(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i) - i4) | i | i4) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i4)));
        }
        int i6 = i + i4;
        char[] cArr = new char[i4];
        int i9 = 0;
        while (i < i6) {
            byte b9 = bArr[i];
            if (b9 < 0) {
                break;
            }
            i++;
            cArr[i9] = (char) b9;
            i9++;
        }
        while (i < i6) {
            int i10 = i + 1;
            byte b10 = bArr[i];
            if (b10 >= 0) {
                cArr[i9] = (char) b10;
                i9++;
                i = i10;
                while (i < i6) {
                    byte b11 = bArr[i];
                    if (b11 >= 0) {
                        i++;
                        cArr[i9] = (char) b11;
                        i9++;
                    }
                }
            } else {
                if (b10 >= -32) {
                    if (b10 < -16) {
                        if (i10 >= i6 - 1) {
                            throw new C3318hL("Protocol message had invalid UTF-8.");
                        }
                        int i11 = i9 + 1;
                        int i12 = i + 2;
                        byte b12 = bArr[i10];
                        i += 3;
                        byte b13 = bArr[i12];
                        if (!AbstractC4117wD.j(b12)) {
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
                            if (!AbstractC4117wD.j(b13)) {
                                cArr[i9] = (char) (((b12 & com.anythink.core.common.s.a.c.f17105c) << 6) | ((b10 & 15) << 12) | (b13 & com.anythink.core.common.s.a.c.f17105c));
                                i9 = i11;
                            }
                        }
                        throw new C3318hL("Protocol message had invalid UTF-8.");
                    }
                    if (i10 >= i6 - 2) {
                        throw new C3318hL("Protocol message had invalid UTF-8.");
                    }
                    byte b14 = bArr[i10];
                    int i13 = i + 3;
                    byte b15 = bArr[i + 2];
                    i += 4;
                    byte b16 = bArr[i13];
                    if (!AbstractC4117wD.j(b14)) {
                        if ((((b14 + 112) + (b10 << 28)) >> 30) == 0 && !AbstractC4117wD.j(b15) && !AbstractC4117wD.j(b16)) {
                            int i14 = ((b14 & com.anythink.core.common.s.a.c.f17105c) << 12) | ((b10 & 7) << 18) | ((b15 & com.anythink.core.common.s.a.c.f17105c) << 6) | (b16 & com.anythink.core.common.s.a.c.f17105c);
                            cArr[i9] = (char) ((i14 >>> 10) + 55232);
                            cArr[i9 + 1] = (char) ((i14 & 1023) + 56320);
                            i9 += 2;
                        }
                    }
                    throw new C3318hL("Protocol message had invalid UTF-8.");
                }
                if (i10 >= i6) {
                    throw new C3318hL("Protocol message had invalid UTF-8.");
                }
                int i15 = i9 + 1;
                i += 2;
                byte b17 = bArr[i10];
                if (b10 < -62 || AbstractC4117wD.j(b17)) {
                    throw new C3318hL("Protocol message had invalid UTF-8.");
                }
                cArr[i9] = (char) ((b17 & com.anythink.core.common.s.a.c.f17105c) | ((b10 & 31) << 6));
                i9 = i15;
            }
        }
        return new String(cArr, 0, i9);
    }
}
