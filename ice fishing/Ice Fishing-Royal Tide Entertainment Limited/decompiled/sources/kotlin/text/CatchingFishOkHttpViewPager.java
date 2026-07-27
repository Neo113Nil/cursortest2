package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpViewPager {
    public static final CatchingFishOkHttpViewPager CatchingFishCoroutine = new CatchingFishOkHttpViewPager(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public final /* synthetic */ int CatchingFishParcelableFAB = 1;
    public float[] CatchingFishSnackbar;

    public /* synthetic */ CatchingFishOkHttpViewPager() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:365:0x0175, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x02f4  */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList CatchingFishParcelableFAB(CatchingFishOkHttpViewPager catchingFishOkHttpViewPager, String str) {
        int i;
        int i2;
        char charAt;
        char c;
        int i3;
        ?? r20;
        int i4;
        long j;
        char c2;
        int i5;
        int i6;
        int i7;
        char c3;
        char c4;
        int i8;
        int i9;
        int i10;
        float[] fArr;
        int i11;
        int i12;
        long j2;
        boolean z;
        long j3;
        int floatToRawIntBits;
        long j4;
        int i13;
        int i14;
        int i15;
        long j5;
        long floatToRawIntBits2;
        char c5;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i16 = 0;
        while (true) {
            i = 32;
            if (i16 >= length || CatchingFishFirebaseDagger.CatchingFishJetpackCompose(str.charAt(i16), 32) > 0) {
                break;
            }
            i16++;
        }
        while (length > i16 && CatchingFishFirebaseDagger.CatchingFishJetpackCompose(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i17 = 0;
        while (i16 < length) {
            while (true) {
                i2 = i16 + 1;
                charAt = str.charAt(i16);
                int i18 = charAt | ' ';
                if ((i18 - 122) * (i18 - 97) > 0 || i18 == 101) {
                    if (i2 >= length) {
                        charAt = 0;
                    } else {
                        i16 = i2;
                    }
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i17 = 0;
                    while (true) {
                        if (i2 >= length || CatchingFishFirebaseDagger.CatchingFishJetpackCompose(str.charAt(i2), i) > 0) {
                            float[] fArr2 = CatchingFishFirebaseDagger.CatchingFishViewModelScope;
                            if (i2 == length) {
                                i3 = i;
                                i4 = i17;
                                j4 = (Float.floatToRawIntBits(Float.NaN) & 4294967295L) | (i2 << i);
                                c = charAt;
                                j = 4294967295L;
                                r20 = 1;
                            } else {
                                i3 = i;
                                i4 = i17;
                                char charAt2 = str.charAt(i2);
                                boolean z2 = charAt2 == '-';
                                r20 = 1;
                                r20 = 1;
                                r20 = 1;
                                char c6 = '\n';
                                if (z2) {
                                    i5 = i2 + 1;
                                    if (i5 == length) {
                                        j4 = (i5 << i3) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                        c = charAt;
                                        j = 4294967295L;
                                    } else {
                                        j = 4294967295L;
                                        c2 = str.charAt(i5);
                                        if (((char) (c2 - '0')) >= '\n' && c2 != '.') {
                                            j5 = i5 << i3;
                                            floatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            j4 = j5 | (floatToRawIntBits2 & j);
                                            c = charAt;
                                        }
                                    }
                                } else {
                                    j = 4294967295L;
                                    c2 = charAt2;
                                    i5 = i2;
                                }
                                int length2 = str.length();
                                int i19 = i5;
                                long j6 = 0;
                                while (i19 != length) {
                                    int i20 = c2 - '0';
                                    if (((char) i20) < c6) {
                                        j6 = (j6 * 10) + i20;
                                        i19++;
                                        c2 = i19 < length2 ? str.charAt(i19) : (char) 0;
                                        c6 = '\n';
                                    } else {
                                        i6 = i19 - i5;
                                        if (i19 == length && c2 == '.') {
                                            int i21 = i19 + 1;
                                            i9 = i21;
                                            c3 = 16;
                                            while (true) {
                                                c4 = '0';
                                                if (length - i9 >= 4) {
                                                    i7 = i19;
                                                    int i22 = i9;
                                                    long charAt3 = str.charAt(i9) | (str.charAt(i9 + 1) << 16) | (str.charAt(i22 + 2) << i3) | (str.charAt(i22 + 3) << 48);
                                                    long j7 = charAt3 - 13511005043687472L;
                                                    int i23 = (((charAt3 + 19703549022044230L) | j7) & (-35747867511423104L)) != 0 ? -1 : (int) ((j7 * 281475406208040961L) >>> 48);
                                                    if (i23 >= 0) {
                                                        j6 = (j6 * 10000) + i23;
                                                        i9 = i22 + 4;
                                                        i19 = i7;
                                                    } else {
                                                        i9 = i22;
                                                    }
                                                } else {
                                                    i7 = i19;
                                                }
                                            }
                                            if (i9 < length2) {
                                                c5 = str.charAt(i9);
                                                while (i9 != length) {
                                                    int i24 = c5 - '0';
                                                    if (((char) i24) < '\n') {
                                                        j6 = (j6 * 10) + i24;
                                                        i9++;
                                                        if (i9 < length2) {
                                                            c5 = str.charAt(i9);
                                                        }
                                                    } else {
                                                        i10 = i21 - i9;
                                                        i6 -= i10;
                                                        c2 = c5;
                                                        i8 = i21;
                                                    }
                                                }
                                                i10 = i21 - i9;
                                                i6 -= i10;
                                                c2 = c5;
                                                i8 = i21;
                                            }
                                            c5 = 0;
                                        } else {
                                            i7 = i19;
                                            c3 = 16;
                                            c4 = '0';
                                            i8 = i7;
                                            i9 = i8;
                                            i10 = 0;
                                        }
                                        if (i6 != 0) {
                                            j5 = i9 << i3;
                                            floatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            j4 = j5 | (floatToRawIntBits2 & j);
                                            c = charAt;
                                        } else {
                                            if ((c2 | ' ') == 101) {
                                                i11 = i9 + 1;
                                                char charAt4 = i11 < length2 ? str.charAt(i11) : (char) 0;
                                                boolean z3 = charAt4 == '-';
                                                fArr = fArr2;
                                                if (z3 || charAt4 == '+') {
                                                    i11 = i9 + 2;
                                                }
                                                char charAt5 = str.charAt(i11);
                                                i12 = 0;
                                                while (true) {
                                                    if (i11 != length) {
                                                        int i25 = charAt5 - '0';
                                                        i15 = i10;
                                                        if (((char) i25) < '\n') {
                                                            if (i12 < 1024) {
                                                                i12 = (i12 * 10) + i25;
                                                            }
                                                            i11++;
                                                            charAt5 = i11 < length2 ? str.charAt(i11) : (char) 0;
                                                            i10 = i15;
                                                        }
                                                    } else {
                                                        i15 = i10;
                                                    }
                                                }
                                                if (z3) {
                                                    i12 = -i12;
                                                }
                                                i10 = i15 + i12;
                                            } else {
                                                fArr = fArr2;
                                                i11 = i9;
                                                i12 = 0;
                                            }
                                            int i26 = 19;
                                            if (i6 > 19) {
                                                char charAt6 = str.charAt(i5);
                                                int i27 = i5;
                                                while (true) {
                                                    if (i11 != length) {
                                                        if (charAt6 == c4 || charAt6 == '.') {
                                                            if (charAt6 == '0') {
                                                                i6--;
                                                            }
                                                            int i28 = i27 + 1;
                                                            charAt6 = i28 < length2 ? str.charAt(i28) : (char) 0;
                                                            i27 = i28;
                                                            i26 = 19;
                                                            c4 = '0';
                                                        } else {
                                                            i26 = 19;
                                                        }
                                                    }
                                                }
                                                if (i6 > i26) {
                                                    char charAt7 = str.charAt(i5);
                                                    long j8 = 0;
                                                    while (true) {
                                                        i13 = i7;
                                                        if (i5 != i13) {
                                                            char c7 = charAt7;
                                                            c = charAt;
                                                            if (Long.compare(j8 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                j8 = (j8 * 10) + (c7 - '0');
                                                                i5++;
                                                                charAt7 = i5 < length2 ? str.charAt(i5) : (char) 0;
                                                                i7 = i13;
                                                                charAt = c;
                                                            }
                                                        } else {
                                                            c = charAt;
                                                        }
                                                    }
                                                    if (Long.compare(j8 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                        i10 = (i13 - i5) + i12;
                                                    } else {
                                                        char charAt8 = str.charAt(i8);
                                                        int i29 = i8;
                                                        while (true) {
                                                            if (i29 != i9) {
                                                                char c8 = charAt8;
                                                                i14 = i29;
                                                                if (Long.compare(j8 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                    j8 = (j8 * 10) + (c8 - '0');
                                                                    i29 = i14 + 1;
                                                                    charAt8 = i29 < length2 ? str.charAt(i29) : (char) 0;
                                                                }
                                                            } else {
                                                                i14 = i29;
                                                            }
                                                        }
                                                        i10 = (i8 - i14) + i12;
                                                    }
                                                    z = true;
                                                    j2 = j8;
                                                    if (-10 > i10 && i10 < 11 && !z && Long.compare(j2 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                                                        float f = j2;
                                                        float f2 = i10 < 0 ? f / fArr[-i10] : f * fArr[i10];
                                                        if (z2) {
                                                            f2 = -f2;
                                                        }
                                                        j3 = i11 << i3;
                                                        floatToRawIntBits = Float.floatToRawIntBits(f2);
                                                    } else if (j2 != 0) {
                                                        j3 = i11 << i3;
                                                        floatToRawIntBits = Float.floatToRawIntBits(z2 ? -0.0f : 0.0f);
                                                    } else if (-126 > i10 || i10 >= 128) {
                                                        String substring = str.substring(i2, i11);
                                                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(substring, "substring(...)");
                                                        j3 = i11 << i3;
                                                        floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring));
                                                    } else {
                                                        long j9 = CatchingFishFirebaseDagger.CatchingFishViewModelFAB[i10 + 325];
                                                        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
                                                        long j10 = j2 << numberOfLeadingZeros;
                                                        long j11 = j10 & j;
                                                        long j12 = j10 >>> i3;
                                                        long j13 = j9 & j;
                                                        long j14 = j9 >>> i3;
                                                        long j15 = j12 * j14;
                                                        long j16 = j14 * j11;
                                                        long j17 = j15 + ((((j12 * j13) + ((j11 * j13) >>> i3)) + (j16 & j)) >>> i3) + (j16 >>> i3);
                                                        int i30 = (int) (j17 >>> 63);
                                                        long j18 = j17 >>> (i30 + 9);
                                                        int i31 = numberOfLeadingZeros + (i30 ^ 1);
                                                        long j19 = j17 & 511;
                                                        if (j19 == 511 || (j19 == 0 && (j18 & 3) == 1)) {
                                                            String substring2 = str.substring(i2, i11);
                                                            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(substring2, "substring(...)");
                                                            j3 = i11 << i3;
                                                            floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring2));
                                                        } else {
                                                            long j20 = (j18 + 1) >>> 1;
                                                            if (j20 >= 9007199254740992L) {
                                                                i31--;
                                                                j20 = 4503599627370496L;
                                                            }
                                                            long j21 = j20 & (-4503599627370497L);
                                                            long j22 = ((((i10 * 217706) >> c3) + 1024) + 63) - i31;
                                                            if (j22 < 1 || j22 > 2046) {
                                                                String substring3 = str.substring(i2, i11);
                                                                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(substring3, "substring(...)");
                                                                j3 = i11 << i3;
                                                                floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring3));
                                                            } else {
                                                                j3 = i11 << i3;
                                                                floatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble((j22 << 52) | j21 | (z2 ? Long.MIN_VALUE : 0L)));
                                                            }
                                                        }
                                                    }
                                                    j4 = j3 | (floatToRawIntBits & j);
                                                }
                                            }
                                            c = charAt;
                                            j2 = j6;
                                            z = false;
                                            if (-10 > i10) {
                                            }
                                            if (j2 != 0) {
                                            }
                                            j4 = j3 | (floatToRawIntBits & j);
                                        }
                                    }
                                }
                                i6 = i19 - i5;
                                if (i19 == length) {
                                }
                                i7 = i19;
                                c3 = 16;
                                c4 = '0';
                                i8 = i7;
                                i9 = i8;
                                i10 = 0;
                                if (i6 != 0) {
                                }
                            }
                            int i32 = (int) (j4 >>> i3);
                            float intBitsToFloat = Float.intBitsToFloat((int) (j4 & j));
                            if (Float.isNaN(intBitsToFloat)) {
                                i2 = i32;
                                i17 = i4;
                            } else {
                                float[] fArr3 = catchingFishOkHttpViewPager.CatchingFishSnackbar;
                                i17 = i4 + 1;
                                fArr3[i4] = intBitsToFloat;
                                if (i17 >= fArr3.length) {
                                    float[] fArr4 = new float[i17 * 2];
                                    catchingFishOkHttpViewPager.CatchingFishSnackbar = fArr4;
                                    System.arraycopy(fArr3, 0, fArr4, 0, fArr3.length);
                                }
                                i2 = i32;
                            }
                            while (i2 < length && str.charAt(i2) == ',') {
                                i2++;
                            }
                            if (i2 < length && !Float.isNaN(intBitsToFloat)) {
                                i = i3;
                                charAt = c;
                            }
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = charAt;
                    i3 = i;
                    r20 = 1;
                }
                i16 = i2;
                float[] fArr5 = catchingFishOkHttpViewPager.CatchingFishSnackbar;
                int i33 = 2;
                switch (c) {
                    case 'A':
                        int i34 = i17 - 7;
                        for (int i35 = 0; i35 <= i34; i35 += 7) {
                            arrayList.add(new CatchingFishLayoutHandler(fArr5[i35], fArr5[i35 + 1], fArr5[i35 + 2], Float.compare(fArr5[i35 + 3], 0.0f) != 0 ? r20 : false, Float.compare(fArr5[i35 + 4], 0.0f) != 0 ? r20 : false, fArr5[i35 + 5], fArr5[i35 + 6]));
                        }
                        i = i3;
                        break;
                    case 'C':
                        int i36 = i17 - 6;
                        for (int i37 = 0; i37 <= i36; i37 += 6) {
                            arrayList.add(new CatchingFishAndroidXToolbar(fArr5[i37], fArr5[i37 + 1], fArr5[i37 + 2], fArr5[i37 + 3], fArr5[i37 + 4], fArr5[i37 + 5]));
                        }
                        i = i3;
                        break;
                    case 'H':
                        int i38 = i17 - 1;
                        for (int i39 = 0; i39 <= i38; i39++) {
                            arrayList.add(new CatchingFishJUnitPayPal(fArr5[i39]));
                        }
                        i = i3;
                        break;
                    case 'L':
                        int i40 = i17 - 2;
                        for (int i41 = 0; i41 <= i40; i41 += 2) {
                            arrayList.add(new CatchingFishViewDaggerMoshi(fArr5[i41], fArr5[i41 + 1]));
                        }
                        i = i3;
                        break;
                    case 'M':
                        int i42 = i17 - 2;
                        if (i42 >= 0) {
                            arrayList.add(new CatchingFishAdMobRoomToast(fArr5[0], fArr5[r20]));
                            while (i33 <= i42) {
                                arrayList.add(new CatchingFishViewDaggerMoshi(fArr5[i33], fArr5[i33 + 1]));
                                i33 += 2;
                            }
                            i = i3;
                            break;
                        }
                        i = i3;
                    case 'Q':
                        int i43 = i17 - 4;
                        for (int i44 = 0; i44 <= i43; i44 += 4) {
                            arrayList.add(new CatchingFishLayoutDagger(fArr5[i44], fArr5[i44 + 1], fArr5[i44 + 2], fArr5[i44 + 3]));
                        }
                        i = i3;
                        break;
                    case 'S':
                        int i45 = i17 - 4;
                        for (int i46 = 0; i46 <= i45; i46 += 4) {
                            arrayList.add(new CatchingFishToastRealm(fArr5[i46], fArr5[i46 + 1], fArr5[i46 + 2], fArr5[i46 + 3]));
                        }
                        i = i3;
                        break;
                    case 'T':
                        int i47 = i17 - 2;
                        for (int i48 = 0; i48 <= i47; i48 += 2) {
                            arrayList.add(new CatchingFishDaggerRedux(fArr5[i48], fArr5[i48 + 1]));
                        }
                        i = i3;
                        break;
                    case 'V':
                        int i49 = i17 - 1;
                        for (int i50 = 0; i50 <= i49; i50++) {
                            arrayList.add(new CatchingFishJUnitGsonBundle(fArr5[i50]));
                        }
                        i = i3;
                        break;
                    case 'Z':
                    case 'z':
                        arrayList.add(CatchingFishDaggerHiltMoshi.CatchingFishCoroutine);
                        i = i3;
                        break;
                    case 'a':
                        int i51 = i17 - 7;
                        for (int i52 = 0; i52 <= i51; i52 += 7) {
                            arrayList.add(new CatchingFishReduxPicasso(fArr5[i52], fArr5[i52 + 1], fArr5[i52 + 2], Float.compare(fArr5[i52 + 3], 0.0f) != 0 ? r20 : false, Float.compare(fArr5[i52 + 4], 0.0f) != 0 ? r20 : false, fArr5[i52 + 5], fArr5[i52 + 6]));
                        }
                        i = i3;
                        break;
                    case 'c':
                        int i53 = i17 - 6;
                        for (int i54 = 0; i54 <= i53; i54 += 6) {
                            arrayList.add(new CatchingFishAdMobGlideHilt(fArr5[i54], fArr5[i54 + 1], fArr5[i54 + 2], fArr5[i54 + 3], fArr5[i54 + 4], fArr5[i54 + 5]));
                        }
                        i = i3;
                        break;
                    case 'h':
                        int i55 = i17 - 1;
                        for (int i56 = 0; i56 <= i55; i56++) {
                            arrayList.add(new CatchingFishFirebaseHandler(fArr5[i56]));
                        }
                        i = i3;
                        break;
                    case 'l':
                        int i57 = i17 - 2;
                        for (int i58 = 0; i58 <= i57; i58 += 2) {
                            arrayList.add(new CatchingFishIntentStripeAPI(fArr5[i58], fArr5[i58 + 1]));
                        }
                        i = i3;
                        break;
                    case 'm':
                        int i59 = i17 - 2;
                        if (i59 >= 0) {
                            arrayList.add(new CatchingFishLayoutMVI(fArr5[0], fArr5[r20]));
                            while (i33 <= i59) {
                                arrayList.add(new CatchingFishIntentStripeAPI(fArr5[i33], fArr5[i33 + 1]));
                                i33 += 2;
                            }
                        }
                        i = i3;
                        break;
                    case 'q':
                        int i60 = i17 - 4;
                        for (int i61 = 0; i61 <= i60; i61 += 4) {
                            arrayList.add(new CatchingFishSpannableRealm(fArr5[i61], fArr5[i61 + 1], fArr5[i61 + 2], fArr5[i61 + 3]));
                        }
                        i = i3;
                        break;
                    case 's':
                        int i62 = i17 - 4;
                        for (int i63 = 0; i63 <= i62; i63 += 4) {
                            arrayList.add(new CatchingFishHiltExoPlayer(fArr5[i63], fArr5[i63 + 1], fArr5[i63 + 2], fArr5[i63 + 3]));
                        }
                        i = i3;
                        break;
                    case 't':
                        int i64 = i17 - 2;
                        for (int i65 = 0; i65 <= i64; i65 += 2) {
                            arrayList.add(new CatchingFishCameraXFirebase(fArr5[i65], fArr5[i65 + 1]));
                        }
                        i = i3;
                        break;
                    case 'v':
                        int i66 = i17 - 1;
                        for (int i67 = 0; i67 <= i66; i67++) {
                            arrayList.add(new CatchingFishWidgetOkHttp(fArr5[i67]));
                        }
                        i = i3;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + c);
                }
            } else {
                i16 = i2;
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    public CatchingFishOkHttpViewPager(float[] fArr) {
        this.CatchingFishSnackbar = fArr;
    }
}
