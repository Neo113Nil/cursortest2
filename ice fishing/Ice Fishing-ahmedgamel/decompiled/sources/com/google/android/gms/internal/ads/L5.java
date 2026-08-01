package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class L5 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f26065a;

    static {
        int i = (((((~349517445) & 1770783991) | 1585637523) + ((349517445 & 828130404) | 441534467)) - 1774508070) ^ (1876855542 % 1069755936);
        int i6 = (((((~396473730) & 280003019) | 1560841089) + ((396473730 & 581959754) | 705178672)) - (-2122415827)) ^ (1447267605 % 1369321801);
        int i9 = (((((~990892921) & 1764437056) | 26530608) + ((990892921 & 2050981056) | 378852004)) - 524777631) ^ (168002245 % 150122846);
        int i10 = (((((~783368690) & 1480833986) | 1027924228) + ((783368690 & 1108040386) | 324812860)) - (-2032723989)) ^ (1189641421 % 1025202362);
        int i11 = (((((~1662981776) & 570576705) | 1321849157) + ((1662981776 & (-264073600)) | (-599138066))) - 1910740440) ^ (882160379 % 11614769);
        int[] iArr = new int[i10];
        iArr[0] = i9;
        iArr[1] = i6;
        iArr[i] = i11;
        iArr[(((((~12260289) & 18423941) | 1391147552) + ((12260289 & 286296197) | 2093276674)) - (-1077194409)) ^ (1503885238 % 1219407971)] = (((((~1204275569) & 228665354) | 424906800) + ((1204275569 & (-1801127910)) | (-1190276491))) - 1826404452) ^ (2069110699 % 712633417);
        f26065a = iArr;
    }

    public static String a(String str) {
        int i;
        int i6 = 0;
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[8];
        int i9 = 0;
        while (i9 < decode.length) {
            int i10 = i9 % 8;
            if (i10 == 0) {
                int i11 = i9 >>> 3;
                int i12 = i6;
                int i13 = i12;
                int i14 = i13;
                int i15 = i14;
                int i16 = i15;
                int i17 = i16;
                int i18 = i17;
                int i19 = i18;
                int i20 = i19;
                int i21 = i20;
                int i22 = i21;
                int i23 = i22;
                int i24 = i23;
                int i25 = i24;
                int i26 = i25;
                int i27 = i26;
                int i28 = i27;
                i = i28;
                int i29 = 1821351989;
                while (true) {
                    if (i29 == 91464932) {
                        int i30 = 751433995 + i29;
                        i29 += 1234789214;
                        if (i12 >= i13) {
                            i29 = i30;
                        }
                    } else if (i29 == 1326254146) {
                        int i31 = i15 >>> i17;
                        int[] iArr = f26065a;
                        i14 += ((i15 << i16) ^ (i31 + i15)) ^ (i18 + iArr[i18 & i19]);
                        i18 += i20;
                        i15 += ((i14 << i16) ^ (i31 + i14)) ^ (i18 + iArr[(i18 >> i21) & i19]);
                        i12++;
                        i29 -= 1234789214;
                    } else {
                        if (i29 != 1821351989) {
                            break;
                        }
                        i29 -= 1729887057;
                        i19 = 3;
                        i17 = 5;
                        i22 = com.anythink.basead.exoplayer.k.p.f8473b;
                        i25 = 2;
                        i21 = 11;
                        i20 = 1340169305;
                        i16 = 4;
                        i13 = 64;
                        i14 = -236335227;
                        i26 = 16;
                        i27 = 6;
                        i28 = 7;
                        i24 = 8;
                        i23 = 24;
                        i15 = i11;
                        i12 = i;
                        i18 = i12;
                    }
                }
                bArr[i] = (byte) (((i14 & i22) << i23) >> i23);
                bArr[1] = (byte) ((((i14 >> i24) & i22) << i23) >> i23);
                bArr[i25] = (byte) ((((i14 >> i26) & i22) << i23) >> i23);
                bArr[i19] = (byte) (i14 >> i23);
                bArr[i16] = (byte) (((i15 & i22) << i23) >> i23);
                bArr[i17] = (byte) ((((i15 >> i24) & i22) << i23) >> i23);
                bArr[i27] = (byte) ((((i15 >> i26) & i22) << i23) >> i23);
                bArr[i28] = (byte) (i15 >> i23);
                i10 = i;
            } else {
                i = i6;
            }
            decode[i9] = (byte) (((decode[i9] ^ bArr[i10]) << 24) >> 24);
            i9++;
            i6 = i;
        }
        return new String(decode, Charset.defaultCharset());
    }
}
