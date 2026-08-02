package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

/* loaded from: classes11.dex */
public final class t390 implements fc51 {
    public static vz5 b(int i, byte[][] bArr) {
        int i2 = i * 2;
        int length = bArr[0].length + i2;
        int length2 = bArr.length + i2;
        vz5 vz5Var = new vz5(length, length2);
        int[] iArr = vz5Var.w;
        int length3 = iArr.length;
        for (int i3 = 0; i3 < length3; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (length2 - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    vz5Var.c(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return vz5Var;
    }

    public static byte[][] c(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x026d, code lost:
    
        r10 = r10 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02a5, code lost:
    
        if (r10 != 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a7, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a8, code lost:
    
        if (r30 == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02aa, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02bc, code lost:
    
        if (r2 != null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02be, code lost:
    
        if (r10 == 1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c5, code lost:
    
        if (r0 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02c7, code lost:
    
        if (r30 == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c9, code lost:
    
        defpackage.s390.b(r6, 1, 0, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e2, code lost:
    
        r6 = r6 + r10;
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ce, code lost:
    
        defpackage.s390.a(1, 0, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02d3, code lost:
    
        if (r30 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d5, code lost:
    
        defpackage.s390.b(r6, r6 + r10, r0, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02df, code lost:
    
        r0 = 1;
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02db, code lost:
    
        defpackage.s390.a(r2.length, r0, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02c0, code lost:
    
        if (r2 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02c3, code lost:
    
        if (r2.length != 1) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02ad, code lost:
    
        r2 = r5.subSequence(r6, r6 + r10).toString().getBytes(r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04ce A[LOOP:14: B:273:0x04cc->B:274:0x04ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x057c  */
    @Override // defpackage.fc51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vz5 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        boolean z;
        int i3;
        int i4;
        man manVar;
        int i5;
        String str2;
        int i6;
        char c;
        char c2;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int[][] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char charAt;
        int i16;
        int i17;
        char charAt2;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            kbs.f(barcodeFormat, "Can only encode PDF_417, but got ");
            return null;
        }
        q390 q390Var = new q390();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                q390Var.b = Boolean.parseBoolean(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                q390Var.c = Compaction.valueOf(map.get(encodeHintType2).toString());
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                ((ukj) map.get(encodeHintType3)).getClass();
                q390Var.e = 20;
                q390Var.f = 3;
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            i3 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            i4 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                q390Var.d = Charset.forName(map.get(encodeHintType6).toString());
            }
            EncodeHintType encodeHintType7 = EncodeHintType.PDF417_AUTO_ECI;
            z = map.containsKey(encodeHintType7) && Boolean.parseBoolean(map.get(encodeHintType7).toString());
        } else {
            z = false;
            i3 = 30;
            i4 = 2;
        }
        String str3 = "Error correction level must be between 0 and 8!";
        if (i4 < 0 || i4 > 8) {
            ny61.g("Error correction level must be between 0 and 8!");
            return null;
        }
        int i18 = 1 << (i4 + 1);
        Compaction compaction = q390Var.c;
        Charset charset = q390Var.d;
        Charset charset2 = s390.e;
        if (str.isEmpty()) {
            throw new WriterException("Empty message not allowed");
        }
        if (charset == null && !z) {
            int i19 = 0;
            while (i19 < str.length()) {
                boolean z3 = z;
                if (str.charAt(i19) > 255) {
                    throw new WriterException("Non-encodable character detected: " + str.charAt(i19) + " (Unicode: " + ((int) str.charAt(i19)) + "). Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET.");
                }
                i19++;
                z = z3;
            }
        }
        boolean z4 = z;
        StringBuilder sb = new StringBuilder(str.length());
        if (z4) {
            manVar = new l6w(str, charset, -1);
        } else {
            mf1 mf1Var = new mf1(16);
            mf1Var.b = str;
            if (charset == null) {
                charset = charset2;
                manVar = mf1Var;
            } else {
                manVar = mf1Var;
                if (!charset2.equals(charset)) {
                    CharacterSetECI a = CharacterSetECI.a(charset);
                    manVar = mf1Var;
                    if (a != null) {
                        s390.e(sb, a.f());
                        manVar = mf1Var;
                    }
                }
            }
        }
        int length = manVar.length();
        int i20 = r390.a[compaction.ordinal()];
        if (i20 == 1) {
            i5 = i3;
            str2 = "Error correction level must be between 0 and 8!";
            i6 = i18;
            s390.d(0, length, 0, manVar, sb);
        } else if (i20 == 2) {
            i5 = i3;
            str2 = "Error correction level must be between 0 and 8!";
            i6 = i18;
            if (z4) {
                s390.b(0, manVar.length(), 0, manVar, sb);
            } else {
                byte[] bytes = manVar.toString().getBytes(charset);
                s390.a(bytes.length, 1, sb, bytes);
            }
        } else if (i20 != 3) {
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i22 < length) {
                while (i22 < length && manVar.b(i22)) {
                    s390.e(sb, manVar.a(i22));
                    i22++;
                    i23 = i23;
                }
                int i24 = i23;
                if (i22 >= length) {
                    break;
                }
                int length2 = manVar.length();
                String str4 = str3;
                if (i22 < length2) {
                    int i25 = i22;
                    int i26 = 0;
                    while (i25 < length2 && !manVar.b(i25)) {
                        int i27 = length2;
                        char charAt3 = manVar.charAt(i25);
                        int i28 = i25;
                        if (charAt3 < '0' || charAt3 > '9') {
                            break;
                        }
                        i26++;
                        i25 = i28 + 1;
                        length2 = i27;
                    }
                    i10 = i26;
                } else {
                    i10 = 0;
                }
                if (i10 < 13) {
                    int length3 = manVar.length();
                    i11 = i3;
                    int i29 = i22;
                    while (i29 < length3) {
                        int i30 = 0;
                        while (true) {
                            i16 = 13;
                            if (i30 >= 13) {
                                i17 = length3;
                                break;
                            }
                            if (i29 >= length3 || manVar.b(i29)) {
                                break;
                            }
                            char charAt4 = manVar.charAt(i29);
                            i17 = length3;
                            if (charAt4 < '0' || charAt4 > '9') {
                                break;
                            }
                            i30++;
                            i29++;
                            length3 = i17;
                        }
                        i17 = length3;
                        i16 = 13;
                        if (i30 >= i16) {
                            i12 = (i29 - i22) - i30;
                            break;
                        }
                        if (i30 <= 0) {
                            if (manVar.b(i29) || ((charAt2 = manVar.charAt(i29)) != '\t' && charAt2 != '\n' && charAt2 != '\r' && (charAt2 < ' ' || charAt2 > '~'))) {
                                break;
                            }
                            i29++;
                        }
                        length3 = i17;
                    }
                    i12 = i29 - i22;
                    if (i12 < 5 && i10 != length) {
                        Charset charset3 = z4 ? null : charset;
                        CharsetEncoder newEncoder = charset3 == null ? null : charset3.newEncoder();
                        int length4 = manVar.length();
                        int i31 = i22;
                        while (true) {
                            if (i31 >= length4) {
                                i13 = i18;
                                break;
                            }
                            int i32 = i31;
                            i13 = i18;
                            int i33 = 0;
                            while (i33 < 13 && !manVar.b(i32) && (charAt = manVar.charAt(i32)) >= '0') {
                                if (charAt > '9' || (i32 = i31 + (i33 = i33 + 1)) >= length4) {
                                    break;
                                }
                            }
                            if (i33 >= 13) {
                                break;
                            }
                            if (newEncoder != null && !newEncoder.canEncode(manVar.charAt(i31))) {
                                char charAt5 = manVar.charAt(i31);
                                throw new WriterException("Non-encodable character detected: " + charAt5 + " (Unicode: " + ((int) charAt5) + ')');
                            }
                            i31++;
                            i18 = i13;
                        }
                    } else {
                        i13 = i18;
                        if (i21 != 0) {
                            sb.append((char) 900);
                            i15 = 0;
                            i14 = 0;
                        } else {
                            i14 = i21;
                            i15 = i24;
                        }
                        int d = s390.d(i22, i12, i15, manVar, sb);
                        i22 += i12;
                        i23 = d;
                        i21 = i14;
                    }
                } else {
                    sb.append((char) 902);
                    s390.c(manVar, i22, i10, sb);
                    i22 += i10;
                    i11 = i3;
                    i13 = i18;
                    i21 = 2;
                    i23 = 0;
                }
                str3 = str4;
                i3 = i11;
                i18 = i13;
            }
            i5 = i3;
            str2 = str3;
            i6 = i18;
        } else {
            i5 = i3;
            str2 = "Error correction level must be between 0 and 8!";
            i6 = i18;
            sb.append((char) 902);
            s390.c(manVar, 0, length, sb);
        }
        String sb2 = sb.toString();
        int length5 = sb2.length();
        float f = 0.0f;
        int[] iArr2 = null;
        for (int i34 = 2; i34 <= q390Var.e; i34++) {
            int i35 = length5 + 1 + i6;
            int i36 = i35 / i34;
            int i37 = i36 + 1;
            if (i34 * i37 < i35 + i34) {
                i36 = i37;
            }
            if (i36 < q390Var.f) {
                break;
            }
            if (i36 <= 30) {
                float f2 = (((i34 * 17) + 69) * 0.357f) / (i36 * 2.0f);
                if (iArr2 == null || Math.abs(f2 - 3.0f) <= Math.abs(f - 3.0f)) {
                    iArr2 = new int[]{i34, i36};
                    f = f2;
                }
            }
        }
        if (iArr2 == null) {
            int i38 = length5 + 1 + i6;
            int i39 = i38 / 2;
            int i40 = i39 + 1;
            if (2 * i40 < i38 + 2) {
                i39 = i40;
            }
            int i41 = q390Var.f;
            if (i39 < i41) {
                c = 0;
                c2 = 1;
                iArr2 = new int[]{2, i41};
                if (iArr2 != null) {
                    throw new WriterException("Unable to fit message in columns");
                }
                int i42 = iArr2[c];
                int i43 = iArr2[c2];
                int i44 = (i42 * i43) - i6 > length5 + 1 ? (r5 - length5) - 1 : 0;
                if (length5 + i6 + 1 > 929) {
                    throw new WriterException("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
                }
                int i45 = length5 + i44 + 1;
                StringBuilder sb3 = new StringBuilder(i45);
                sb3.append((char) i45);
                sb3.append(sb2);
                for (int i46 = 0; i46 < i44; i46++) {
                    sb3.append((char) 900);
                }
                String sb4 = sb3.toString();
                if (i4 < 0 || i4 > 8) {
                    ny61.g(str2);
                    return null;
                }
                int i47 = i6;
                char[] cArr = new char[i47];
                int length6 = sb4.length();
                for (int i48 = 0; i48 < length6; i48++) {
                    int i49 = i47 - 1;
                    int charAt6 = (sb4.charAt(i48) + cArr[i49]) % 929;
                    while (true) {
                        iArr = zm91.a;
                        if (i49 >= 1) {
                            cArr[i49] = (char) ((cArr[i49 - 1] + (929 - ((iArr[i4][i49] * charAt6) % 929))) % 929);
                            i49--;
                        }
                    }
                    cArr[0] = (char) ((929 - ((charAt6 * iArr[i4][0]) % 929)) % 929);
                }
                StringBuilder sb5 = new StringBuilder(i47);
                for (int i50 = i47 - 1; i50 >= 0; i50--) {
                    char c3 = cArr[i50];
                    if (c3 != 0) {
                        cArr[i50] = (char) (929 - c3);
                    }
                    sb5.append(cArr[i50]);
                }
                String sb6 = sb5.toString();
                q390Var.a = new qv4(i43, i42);
                String concat = sb4.concat(sb6);
                qv4 qv4Var = q390Var.a;
                int i51 = 0;
                for (int i52 = 0; i52 < i43; i52++) {
                    int i53 = i52 % 3;
                    qv4Var.b++;
                    q390.a(130728, 17, qv4Var.b());
                    if (i53 == 0) {
                        int i54 = (i52 / 3) * 30;
                        i7 = x4e.c(i43, 1, 3, i54);
                        i8 = (i42 - 1) + i54;
                    } else if (i53 == 1) {
                        int i55 = (i52 / 3) * 30;
                        int i56 = i43 - 1;
                        i7 = (i56 % 3) + (i4 * 3) + i55;
                        i8 = (i56 / 3) + i55;
                    } else {
                        int i57 = (i52 / 3) * 30;
                        i7 = (i42 - 1) + i57;
                        i8 = (i4 * 3) + i57 + ((i43 - 1) % 3);
                        int[][] iArr3 = q390.g;
                        q390.a(iArr3[i53][i7], 17, qv4Var.b());
                        for (i9 = 0; i9 < i42; i9++) {
                            q390.a(iArr3[i53][concat.charAt(i51)], 17, qv4Var.b());
                            i51++;
                        }
                        if (q390Var.b) {
                            q390.a(iArr3[i53][i8], 17, qv4Var.b());
                            q390.a(260649, 18, qv4Var.b());
                        } else {
                            q390.a(260649, 1, qv4Var.b());
                        }
                    }
                    int[][] iArr32 = q390.g;
                    q390.a(iArr32[i53][i7], 17, qv4Var.b());
                    while (i9 < i42) {
                    }
                    if (q390Var.b) {
                    }
                }
                byte[][] c4 = q390Var.a.c(1, 4);
                if ((i2 > i) != (c4[0].length < c4.length)) {
                    c4 = c(c4);
                    z2 = true;
                } else {
                    z2 = false;
                }
                int min = Math.min(i / c4[0].length, i2 / c4.length);
                if (min <= 1) {
                    return b(i5, c4);
                }
                byte[][] c5 = q390Var.a.c(min, min * 4);
                if (z2) {
                    c5 = c(c5);
                }
                return b(i5, c5);
            }
        }
        c = 0;
        c2 = 1;
        if (iArr2 != null) {
        }
    }
}
