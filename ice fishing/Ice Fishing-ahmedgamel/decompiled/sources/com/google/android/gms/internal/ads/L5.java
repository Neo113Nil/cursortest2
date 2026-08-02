package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class L5 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f26865a;

    static {
        int i = (((((~349517445) & 1770783991) | 1585637523) + ((349517445 & 828130404) | 441534467)) - 1774508070) ^ (1876855542 % 1069755936);
        int i4 = (((((~396473730) & 280003019) | 1560841089) + ((396473730 & 581959754) | 705178672)) - (-2122415827)) ^ (1447267605 % 1369321801);
        int i6 = (((((~990892921) & 1764437056) | 26530608) + ((990892921 & 2050981056) | 378852004)) - 524777631) ^ (168002245 % 150122846);
        int i9 = (((((~783368690) & 1480833986) | 1027924228) + ((783368690 & 1108040386) | 324812860)) - (-2032723989)) ^ (1189641421 % 1025202362);
        int i10 = (((((~1662981776) & 570576705) | 1321849157) + ((1662981776 & (-264073600)) | (-599138066))) - 1910740440) ^ (882160379 % 11614769);
        int[] iArr = new int[i9];
        iArr[0] = i6;
        iArr[1] = i4;
        iArr[i] = i10;
        iArr[(((((~12260289) & 18423941) | 1391147552) + ((12260289 & 286296197) | 2093276674)) - (-1077194409)) ^ (1503885238 % 1219407971)] = (((((~1204275569) & 228665354) | 424906800) + ((1204275569 & (-1801127910)) | (-1190276491))) - 1826404452) ^ (2069110699 % 712633417);
        f26865a = iArr;
    }

    public static String a(String str) {
        int i;
        int i4 = 0;
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[8];
        int i6 = 0;
        while (i6 < decode.length) {
            int i9 = i6 % 8;
            if (i9 == 0) {
                int i10 = i6 >>> 3;
                int i11 = i4;
                int i12 = i11;
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
                i = i27;
                int i28 = 1821351989;
                while (true) {
                    if (i28 == 91464932) {
                        int i29 = 751433995 + i28;
                        i28 += 1234789214;
                        if (i11 >= i12) {
                            i28 = i29;
                        }
                    } else if (i28 == 1326254146) {
                        int i30 = i14 >>> i16;
                        int[] iArr = f26865a;
                        i13 += ((i14 << i15) ^ (i30 + i14)) ^ (i17 + iArr[i17 & i18]);
                        i17 += i19;
                        i14 += ((i13 << i15) ^ (i30 + i13)) ^ (i17 + iArr[(i17 >> i20) & i18]);
                        i11++;
                        i28 -= 1234789214;
                    } else {
                        if (i28 != 1821351989) {
                            break;
                        }
                        i28 -= 1729887057;
                        i18 = 3;
                        i16 = 5;
                        i21 = com.anythink.basead.exoplayer.k.p.f9259b;
                        i24 = 2;
                        i20 = 11;
                        i19 = 1340169305;
                        i15 = 4;
                        i12 = 64;
                        i13 = -236335227;
                        i25 = 16;
                        i26 = 6;
                        i27 = 7;
                        i23 = 8;
                        i22 = 24;
                        i14 = i10;
                        i11 = i;
                        i17 = i11;
                    }
                }
                bArr[i] = (byte) (((i13 & i21) << i22) >> i22);
                bArr[1] = (byte) ((((i13 >> i23) & i21) << i22) >> i22);
                bArr[i24] = (byte) ((((i13 >> i25) & i21) << i22) >> i22);
                bArr[i18] = (byte) (i13 >> i22);
                bArr[i15] = (byte) (((i14 & i21) << i22) >> i22);
                bArr[i16] = (byte) ((((i14 >> i23) & i21) << i22) >> i22);
                bArr[i26] = (byte) ((((i14 >> i25) & i21) << i22) >> i22);
                bArr[i27] = (byte) (i14 >> i22);
                i9 = i;
            } else {
                i = i4;
            }
            decode[i6] = (byte) (((decode[i6] ^ bArr[i9]) << 24) >> 24);
            i6++;
            i4 = i;
        }
        return new String(decode, Charset.defaultCharset());
    }
}
