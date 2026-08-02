package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class wul implements p7q, hs6, a80, rc, mbx {
    public static s9p c(rr5 rr5Var) {
        rr5Var.getClass();
        StationId o = StationId.o(rr5Var.a);
        o.getClass();
        return o8g.E(c9g.E(o));
    }

    @Override // defpackage.a80
    public void a(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x060e, code lost:
    
        r0 = new defpackage.n5d[]{r11, r6}[1].b;
        r3 = r1 - r0.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x061c, code lost:
    
        if (r4 >= r3) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x061e, code lost:
    
        r9[r4 + r4] = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0626, code lost:
    
        java.lang.System.arraycopy(r0, 0, r9, r4 + r3, r0.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0754, code lost:
    
        if ((r9 >= 0 && r9 < 8) != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0818, code lost:
    
        if (r8 == false) goto L413;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x089e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x02c2 A[LOOP:40: B:541:0x02c0->B:542:0x02c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0310 A[LOOP:2: B:75:0x030e->B:76:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x23 b(String str, zo2 zo2Var, int i, int i2, EnumMap enumMap) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        fci fciVar;
        int i6;
        q0u a;
        int i7;
        int i8;
        int f;
        int i9;
        w23 w23Var;
        q0u q0uVar;
        je4 a2;
        int length;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        char c;
        q0u q0uVar2;
        w23 w23Var2;
        int i16;
        int i17;
        int i18;
        n5d n5dVar;
        int i19;
        int[] iArr;
        n5d n5dVar2;
        n5d n5dVar3;
        char c2;
        n5d n5dVar4;
        if (str.isEmpty()) {
            xq0.x("Found empty contents");
            return null;
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        int i20 = 4;
        if (enumMap != null) {
            g6b g6bVar = g6b.a;
            if (enumMap.containsKey(g6bVar)) {
                String obj = enumMap.get(g6bVar).toString();
                if (obj == null) {
                    jj4.j("Name is null");
                } else if (!obj.equals("L")) {
                    if (obj.equals("M")) {
                        i4 = 2;
                    } else if (obj.equals("Q")) {
                        i4 = 3;
                    } else if (obj.equals("H")) {
                        i4 = 4;
                    } else {
                        xq0.x("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(obj));
                    }
                    g6b g6bVar2 = g6b.c;
                    i3 = enumMap.containsKey(g6bVar2) ? Integer.parseInt(enumMap.get(g6bVar2).toString()) : 4;
                }
                i4 = 0;
                g6b g6bVar22 = g6b.c;
                if (enumMap.containsKey(g6bVar22)) {
                }
            }
            i4 = 1;
            g6b g6bVar222 = g6b.c;
            if (enumMap.containsKey(g6bVar222)) {
            }
        } else {
            i3 = 4;
            i4 = 1;
        }
        int[] iArr2 = k6b.a;
        if (enumMap != null) {
            g6b g6bVar3 = g6b.g;
            if (enumMap.containsKey(g6bVar3) && Boolean.parseBoolean(enumMap.get(g6bVar3).toString())) {
                z = true;
                if (enumMap != null) {
                    g6b g6bVar4 = g6b.f;
                    if (enumMap.containsKey(g6bVar4) && Boolean.parseBoolean(enumMap.get(g6bVar4).toString())) {
                        z2 = true;
                        Object obj2 = k6b.b;
                        g6b g6bVar5 = g6b.b;
                        boolean z7 = enumMap == null && enumMap.containsKey(g6bVar5);
                        Charset forName = z7 ? Charset.forName(enumMap.get(g6bVar5).toString()) : obj2;
                        int i21 = 2;
                        int i22 = 8;
                        int i23 = 1;
                        if (!z2) {
                            i5 = 0;
                            boolean equals = blr.b.equals(forName);
                            fci fciVar2 = fci.BYTE;
                            if (equals && k6b.b(str)) {
                                fciVar = fci.KANJI;
                            } else {
                                boolean z8 = false;
                                boolean z9 = false;
                                int i24 = 0;
                                while (true) {
                                    if (i24 < str.length()) {
                                        char charAt = str.charAt(i24);
                                        if (charAt < '0' || charAt > '9') {
                                            if ((charAt < '`' ? k6b.a[charAt] : -1) == -1) {
                                                break;
                                            }
                                            z8 = true;
                                        } else {
                                            z9 = true;
                                        }
                                        i24++;
                                    } else if (z8) {
                                        fciVar = fci.ALPHANUMERIC;
                                    } else if (z9) {
                                        fciVar = fci.NUMERIC;
                                    }
                                }
                                fciVar = fciVar2;
                            }
                            w23 w23Var3 = new w23();
                            if (fciVar == fciVar2 && z7 && (a2 = je4.a(forName)) != null) {
                                i6 = 4;
                                w23Var3.c(7, 4);
                                w23Var3.c(a2.a[0], 8);
                            } else {
                                i6 = 4;
                            }
                            if (z) {
                                w23Var3.c(5, i6);
                            }
                            w23Var3.c(fciVar.b, i6);
                            w23 w23Var4 = new w23();
                            k6b.a(str, fciVar, w23Var4, forName);
                            if (enumMap != null) {
                                g6b g6bVar6 = g6b.d;
                                if (enumMap.containsKey(g6bVar6)) {
                                    q0u a3 = q0u.a(Integer.parseInt(enumMap.get(g6bVar6).toString()));
                                    if (!k6b.c(fciVar.a(a3) + w23Var3.b + w23Var4.b, a3, i4)) {
                                        throw new k6w("Data too big for requested version");
                                    }
                                    a = a3;
                                    w23 w23Var5 = new w23();
                                    i7 = w23Var3.b;
                                    w23Var5.d(i7);
                                    for (i8 = 0; i8 < i7; i8++) {
                                        w23Var5.b(w23Var3.e(i8));
                                    }
                                    f = fciVar != fciVar2 ? w23Var4.f() : str.length();
                                    int a4 = fciVar.a(a);
                                    i9 = 1 << a4;
                                    if (f < i9) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(f);
                                        sb.append(" is bigger than ");
                                        sb.append(i9 - 1);
                                        throw new k6w(sb.toString());
                                    }
                                    w23Var5.c(f, a4);
                                    int i25 = w23Var4.b;
                                    w23Var5.d(w23Var5.b + i25);
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        w23Var5.b(w23Var4.e(i26));
                                    }
                                    w23Var = w23Var5;
                                    q0uVar = a;
                                }
                            }
                            int a5 = fciVar.a(q0u.a(1)) + w23Var3.b + w23Var4.b;
                            int i27 = 1;
                            while (i27 <= 40) {
                                q0u a6 = q0u.a(i27);
                                if (k6b.c(a5, a6, i4)) {
                                    int a7 = fciVar.a(a6) + w23Var3.b + w23Var4.b;
                                    int i28 = 1;
                                    while (i28 <= 40) {
                                        a = q0u.a(i28);
                                        if (k6b.c(a7, a, i4)) {
                                            w23 w23Var52 = new w23();
                                            i7 = w23Var3.b;
                                            w23Var52.d(i7);
                                            while (i8 < i7) {
                                            }
                                            if (fciVar != fciVar2) {
                                            }
                                            int a42 = fciVar.a(a);
                                            i9 = 1 << a42;
                                            if (f < i9) {
                                            }
                                        } else {
                                            i28++;
                                            i4 = i4;
                                            i22 = 8;
                                        }
                                    }
                                    throw new k6w("Data too big");
                                }
                                i27++;
                                i4 = i4;
                                i22 = 8;
                            }
                            throw new k6w("Data too big");
                        }
                        if (forName.equals(obj2)) {
                            forName = null;
                        }
                        q5i q5iVar = new q5i();
                        q5iVar.c = str;
                        q5iVar.a = z;
                        q5iVar.d = new eya(str, forName, -1);
                        q5iVar.b = i4;
                        int i29 = q5iVar.b;
                        q0u[] q0uVarArr = {q5i.f(1), q5i.f(2), q5i.f(3)};
                        i5 = 0;
                        ime[] imeVarArr = {q5iVar.e(q0uVarArr[0]), q5iVar.e(q0uVarArr[1]), q5iVar.e(q0uVarArr[2])};
                        int i30 = -1;
                        int i31 = Integer.MAX_VALUE;
                        int i32 = 0;
                        for (int i33 = 3; i32 < i33; i33 = 3) {
                            ime imeVar = imeVarArr[i32];
                            int w = imeVar.w((q0u) imeVar.c);
                            if (k6b.c(w, q0uVarArr[i32], i29) && w < i31) {
                                i31 = w;
                                i30 = i32;
                            }
                            i32++;
                        }
                        if (i30 < 0) {
                            throw new k6w("Data too big for any version");
                        }
                        ime imeVar2 = imeVarArr[i30];
                        w23 w23Var6 = new w23();
                        Iterator it = ((ArrayList) imeVar2.b).iterator();
                        while (it.hasNext()) {
                            p5i p5iVar = (p5i) it.next();
                            int i34 = p5iVar.c;
                            ime imeVar3 = p5iVar.e;
                            q5i q5iVar2 = (q5i) imeVar3.d;
                            fci fciVar3 = p5iVar.a;
                            w23Var6.c(fciVar3.b, i20);
                            int i35 = p5iVar.d;
                            if (i35 > 0) {
                                w23Var6.c(p5iVar.a(), fciVar3.a((q0u) imeVar3.c));
                            }
                            if (fciVar3 == fci.ECI) {
                                w23Var6.c(je4.a(((eya) q5iVar2.d).a[i34].charset()).a[0], 8);
                            } else if (i35 > 0) {
                                String str2 = (String) q5iVar2.c;
                                int i36 = p5iVar.b;
                                k6b.a(str2.substring(i36, i35 + i36), fciVar3, w23Var6, ((eya) q5iVar2.d).a[i34].charset());
                            }
                            i20 = 4;
                        }
                        q0uVar = (q0u) imeVar2.c;
                        w23Var = w23Var6;
                        j4x j4xVar = q0uVar.b[ouj.D(i4)];
                        int i37 = q0uVar.c;
                        int i38 = j4xVar.b;
                        c9n[] c9nVarArr = (c9n[]) j4xVar.c;
                        length = c9nVarArr.length;
                        i10 = i5;
                        int i39 = i10;
                        while (i10 < length) {
                            i39 += c9nVarArr[i10].b;
                            i10++;
                        }
                        int i40 = i37 - (i39 * i38);
                        i11 = i40 * 8;
                        if (w23Var.b > i11) {
                            throw new k6w("data bits cannot fit in the QR Code" + w23Var.b + " > " + i11);
                        }
                        for (int i41 = i5; i41 < 4 && w23Var.b < i11; i41++) {
                            w23Var.b(i5);
                        }
                        boolean z10 = i5;
                        int i42 = w23Var.b & 7;
                        if (i42 > 0) {
                            while (i42 < i22) {
                                w23Var.b(z10);
                                i42++;
                                z10 = 0;
                            }
                        }
                        int f2 = i40 - w23Var.f();
                        for (int i43 = 0; i43 < f2; i43++) {
                            w23Var.c((i43 & 1) == 0 ? 236 : 17, i22);
                        }
                        if (w23Var.b != i11) {
                            throw new k6w("Bits size does not equal capacity");
                        }
                        int i44 = 0;
                        for (c9n c9nVar : c9nVarArr) {
                            i44 += c9nVar.b;
                        }
                        if (w23Var.f() != i40) {
                            throw new k6w("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(i44);
                        int i45 = 0;
                        int i46 = 0;
                        int i47 = 0;
                        int i48 = 0;
                        w23 w23Var7 = w23Var;
                        while (i45 < i44) {
                            int i49 = i3;
                            int i50 = i23;
                            int[] iArr3 = new int[i50];
                            int[] iArr4 = new int[i50];
                            if (i45 >= i44) {
                                throw new k6w("Block ID too large");
                            }
                            int i51 = i37 % i44;
                            int i52 = i44 - i51;
                            int i53 = i37 / i44;
                            int i54 = i40 / i44;
                            int i55 = i54 + 1;
                            int i56 = i53 - i54;
                            int i57 = (i53 + 1) - i55;
                            if (i56 != i57) {
                                throw new k6w("EC bytes mismatch");
                            }
                            if (i44 != i52 + i51) {
                                throw new k6w("RS blocks mismatch");
                            }
                            if (i37 != ((i55 + i57) * i51) + ((i54 + i56) * i52)) {
                                throw new k6w("Total bytes mismatch");
                            }
                            if (i45 < i52) {
                                c = 0;
                                iArr3[0] = i54;
                                iArr4[0] = i56;
                            } else {
                                c = 0;
                                iArr3[0] = i55;
                                iArr4[0] = i57;
                            }
                            int i58 = iArr3[c];
                            byte[] bArr = new byte[i58];
                            int i59 = i46 * 8;
                            int i60 = i45;
                            int i61 = 0;
                            while (i61 < i58) {
                                int i62 = i61;
                                int i63 = i44;
                                int i64 = 0;
                                for (int i65 = 0; i65 < 8; i65++) {
                                    if (w23Var7.e(i59)) {
                                        i64 = (1 << (7 - i65)) | i64;
                                    }
                                    i59++;
                                }
                                bArr[i62] = (byte) i64;
                                i61 = i62 + 1;
                                i44 = i63;
                            }
                            int i66 = i44;
                            int i67 = iArr4[0];
                            int[] iArr5 = new int[i58 + i67];
                            for (int i68 = 0; i68 < i58; i68++) {
                                iArr5[i68] = bArr[i68] & 255;
                            }
                            aqd aqdVar = new aqd(m5d.g);
                            m5d m5dVar = (m5d) aqdVar.b;
                            if (i67 != 0) {
                                w23Var2 = w23Var7;
                                int length2 = iArr5.length - i67;
                                if (length2 > 0) {
                                    ArrayList arrayList2 = (ArrayList) aqdVar.c;
                                    i18 = i4;
                                    if (i67 >= arrayList2.size()) {
                                        n5d n5dVar5 = (n5d) vz1.m(arrayList2, 1);
                                        int size = arrayList2.size();
                                        while (size <= i67) {
                                            int i69 = size;
                                            int[] iArr6 = {1, m5dVar.a[(size - 1) + m5dVar.f]};
                                            if (iArr6[0] == 0) {
                                                q0uVar2 = q0uVar;
                                                int i70 = i21;
                                                int i71 = 1;
                                                while (i71 < i70 && iArr6[i71] == 0) {
                                                    i71++;
                                                }
                                                if (i71 == i70) {
                                                    c2 = 0;
                                                    iArr6 = new int[]{0};
                                                    i16 = i37;
                                                    i17 = i40;
                                                } else {
                                                    c2 = 0;
                                                    i16 = i37;
                                                    int i72 = 2 - i71;
                                                    i17 = i40;
                                                    int[] iArr7 = new int[i72];
                                                    System.arraycopy(iArr6, i71, iArr7, 0, i72);
                                                    iArr6 = iArr7;
                                                }
                                            } else {
                                                q0uVar2 = q0uVar;
                                                i16 = i37;
                                                i17 = i40;
                                                c2 = 0;
                                            }
                                            n5d n5dVar6 = n5dVar5;
                                            m5d m5dVar2 = n5dVar6.a;
                                            if (!m5dVar2.equals(m5dVar)) {
                                                xq0.x("GenericGFPolys do not have same GenericGF field");
                                                break;
                                            }
                                            if (n5dVar6.c() || iArr6[c2] == 0) {
                                                n5dVar4 = m5dVar2.c;
                                            } else {
                                                int[] iArr8 = n5dVar6.b;
                                                int length3 = iArr8.length;
                                                int length4 = iArr6.length;
                                                int[] iArr9 = new int[(length3 + length4) - 1];
                                                int[] iArr10 = iArr6;
                                                int i73 = 0;
                                                while (i73 < length3) {
                                                    int i74 = length3;
                                                    int i75 = iArr8[i73];
                                                    int i76 = i73;
                                                    int i77 = 0;
                                                    while (i77 < length4) {
                                                        int i78 = i76 + i77;
                                                        iArr9[i78] = iArr9[i78] ^ m5dVar2.a(i75, iArr10[i77]);
                                                        i77++;
                                                        length4 = length4;
                                                    }
                                                    i73 = i76 + 1;
                                                    length3 = i74;
                                                }
                                                n5dVar4 = new n5d(m5dVar2, iArr9);
                                            }
                                            arrayList2.add(n5dVar4);
                                            size = i69 + 1;
                                            n5dVar5 = n5dVar4;
                                            q0uVar = q0uVar2;
                                            i37 = i16;
                                            i40 = i17;
                                            i21 = 2;
                                        }
                                    }
                                    q0uVar2 = q0uVar;
                                    i16 = i37;
                                    i17 = i40;
                                    n5d n5dVar7 = (n5d) arrayList2.get(i67);
                                    int[] iArr11 = new int[length2];
                                    System.arraycopy(iArr5, 0, iArr11, 0, length2);
                                    if (length2 != 0) {
                                        if (length2 > 1 && iArr11[0] == 0) {
                                            int i79 = 1;
                                            while (i79 < length2 && iArr11[i79] == 0) {
                                                i79++;
                                            }
                                            if (i79 == length2) {
                                                iArr11 = new int[]{0};
                                            } else {
                                                int i80 = length2 - i79;
                                                int[] iArr12 = new int[i80];
                                                System.arraycopy(iArr11, i79, iArr12, 0, i80);
                                                iArr11 = iArr12;
                                            }
                                        }
                                        if (i67 >= 0) {
                                            int length5 = iArr11.length;
                                            int[] iArr13 = new int[length5 + i67];
                                            int i81 = 0;
                                            while (i81 < length5) {
                                                iArr13[i81] = m5dVar.a(iArr11[i81], 1);
                                                i81++;
                                                iArr11 = iArr11;
                                            }
                                            n5d n5dVar8 = new n5d(m5dVar, iArr13);
                                            m5d m5dVar3 = n5dVar7.a;
                                            int[] iArr14 = n5dVar7.b;
                                            boolean equals2 = m5dVar.equals(m5dVar3);
                                            n5d n5dVar9 = m5dVar.c;
                                            if (equals2) {
                                                if (!n5dVar7.c()) {
                                                    if (iArr14[(iArr14.length - 1) - n5dVar7.b()] == 0) {
                                                        throw new ArithmeticException();
                                                    }
                                                    int i82 = m5dVar.a[(m5dVar.d - m5dVar.b[r6]) - 1];
                                                    n5d n5dVar10 = n5dVar9;
                                                    n5d n5dVar11 = n5dVar8;
                                                    while (true) {
                                                        n5d n5dVar12 = n5dVar9;
                                                        if (n5dVar11.b() < n5dVar7.b() || n5dVar11.c()) {
                                                            break;
                                                        }
                                                        int b = n5dVar11.b() - n5dVar7.b();
                                                        int a8 = m5dVar.a(n5dVar11.b[(r4.length - 1) - n5dVar11.b()], i82);
                                                        m5d m5dVar4 = n5dVar7.a;
                                                        if (b < 0) {
                                                            e7o.e();
                                                            break;
                                                        }
                                                        if (a8 == 0) {
                                                            n5dVar2 = m5dVar4.c;
                                                            n5dVar = n5dVar7;
                                                            i19 = i82;
                                                            iArr = iArr14;
                                                        } else {
                                                            n5dVar = n5dVar7;
                                                            int length6 = iArr14.length;
                                                            i19 = i82;
                                                            int[] iArr15 = new int[length6 + b];
                                                            iArr = iArr14;
                                                            int i83 = 0;
                                                            while (i83 < length6) {
                                                                iArr15[i83] = m5dVar4.a(iArr[i83], a8);
                                                                i83++;
                                                                length6 = length6;
                                                            }
                                                            n5dVar2 = new n5d(m5dVar4, iArr15);
                                                        }
                                                        if (b < 0) {
                                                            e7o.e();
                                                            break;
                                                        }
                                                        if (a8 == 0) {
                                                            n5dVar3 = n5dVar12;
                                                        } else {
                                                            int[] iArr16 = new int[b + 1];
                                                            iArr16[0] = a8;
                                                            n5dVar3 = new n5d(m5dVar, iArr16);
                                                        }
                                                        n5dVar10 = n5dVar10.a(n5dVar3);
                                                        n5dVar11 = n5dVar11.a(n5dVar2);
                                                        n5dVar9 = n5dVar12;
                                                        n5dVar7 = n5dVar;
                                                        i82 = i19;
                                                        iArr14 = iArr;
                                                    }
                                                } else {
                                                    xq0.x("Divide by 0");
                                                }
                                            } else {
                                                xq0.x("GenericGFPolys do not have same GenericGF field");
                                            }
                                        } else {
                                            e7o.e();
                                        }
                                    } else {
                                        e7o.e();
                                    }
                                } else {
                                    q0uVar2 = q0uVar;
                                    i16 = i37;
                                    i17 = i40;
                                    i18 = i4;
                                    xq0.x("No data bytes provided");
                                }
                            } else {
                                q0uVar2 = q0uVar;
                                w23Var2 = w23Var7;
                                i16 = i37;
                                i17 = i40;
                                i18 = i4;
                                xq0.x("No error correction bytes");
                            }
                            byte[] bArr2 = new byte[i67];
                            for (int i84 = 0; i84 < i67; i84++) {
                                bArr2[i84] = (byte) iArr5[i58 + i84];
                            }
                            arrayList.add(new u63(bArr, bArr2));
                            i48 = Math.max(i48, i58);
                            i47 = Math.max(i47, i67);
                            i46 += iArr3[0];
                            i45 = i60 + 1;
                            i3 = i49;
                            w23Var7 = w23Var2;
                            i44 = i66;
                            i4 = i18;
                            q0uVar = q0uVar2;
                            i37 = i16;
                            i40 = i17;
                            i21 = 2;
                            i23 = 1;
                        }
                        q0u q0uVar3 = q0uVar;
                        int i85 = i37;
                        int i86 = i4;
                        int i87 = i3;
                        if (i40 != i46) {
                            throw new k6w("Data bytes does not match offset");
                        }
                        w23 w23Var8 = new w23();
                        for (int i88 = 0; i88 < i48; i88++) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                byte[] bArr3 = ((u63) it2.next()).a;
                                if (i88 < bArr3.length) {
                                    w23Var8.c(bArr3[i88], 8);
                                }
                            }
                        }
                        for (int i89 = 0; i89 < i47; i89++) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                byte[] bArr4 = ((u63) it3.next()).b;
                                if (i89 < bArr4.length) {
                                    w23Var8.c(bArr4[i89], 8);
                                }
                            }
                        }
                        if (i85 != w23Var8.f()) {
                            StringBuilder q = k5r.q(i85, "Interleaving error: ", " and ");
                            q.append(w23Var8.f());
                            q.append(" differ.");
                            throw new k6w(q.toString());
                        }
                        int i90 = (q0uVar3.a * 4) + 17;
                        rnj rnjVar = new rnj(i90, i90, 2);
                        int i91 = rnjVar.c;
                        int i92 = rnjVar.b;
                        if (enumMap != null) {
                            g6b g6bVar7 = g6b.e;
                            if (enumMap.containsKey(g6bVar7)) {
                                i12 = Integer.parseInt(enumMap.get(g6bVar7).toString());
                            }
                        }
                        i12 = -1;
                        if (i12 == -1) {
                            int i93 = -1;
                            int i94 = Integer.MAX_VALUE;
                            int i95 = 0;
                            while (i95 < 8) {
                                int i96 = i86;
                                lg3.H(w23Var8, i96, q0uVar3, i95, rnjVar);
                                int i97 = 0;
                                int h = neg.h(rnjVar, false) + neg.h(rnjVar, true);
                                byte[][] bArr5 = (byte[][]) rnjVar.d;
                                int i98 = 0;
                                int i99 = 0;
                                while (i98 < i91 - 1) {
                                    byte[] bArr6 = bArr5[i98];
                                    while (i97 < i92 - 1) {
                                        byte b2 = bArr6[i97];
                                        int i100 = i97 + 1;
                                        int i101 = i93;
                                        if (b2 == bArr6[i100]) {
                                            byte[] bArr7 = bArr5[i98 + 1];
                                            if (b2 == bArr7[i97] && b2 == bArr7[i100]) {
                                                i99++;
                                            }
                                        }
                                        i93 = i101;
                                        i97 = i100;
                                    }
                                    i98++;
                                    i97 = 0;
                                }
                                int i102 = i93;
                                int i103 = (i99 * 3) + h;
                                int i104 = 0;
                                int i105 = 0;
                                while (i104 < i91) {
                                    int i106 = 0;
                                    while (i106 < i92) {
                                        byte[] bArr8 = bArr5[i104];
                                        int i107 = i106 + 6;
                                        if (i107 < i92) {
                                            i13 = i105;
                                            byte b3 = 1;
                                            if (bArr8[i106] == 1 && bArr8[i106 + 1] == 0 && bArr8[i106 + 2] == 1 && bArr8[i106 + 3] == 1 && bArr8[i106 + 4] == 1 && bArr8[i106 + 5] == 0 && bArr8[i107] == 1) {
                                                int i108 = i106 - 4;
                                                if (i108 >= 0 && bArr8.length >= i106) {
                                                    while (i108 < i106) {
                                                        if (bArr8[i108] != b3) {
                                                            i108++;
                                                            b3 = 1;
                                                        }
                                                    }
                                                    z5 = true;
                                                    if (!z5) {
                                                        int i109 = i106 + 7;
                                                        int i110 = i106 + 11;
                                                        if (i109 >= 0 && bArr8.length >= i110) {
                                                            while (i109 < i110) {
                                                                int i111 = i109;
                                                                if (bArr8[i109] != 1) {
                                                                    i109 = i111 + 1;
                                                                }
                                                            }
                                                            z6 = true;
                                                        }
                                                        z6 = false;
                                                        break;
                                                    }
                                                    i105 = i13 + 1;
                                                    i14 = i104 + 6;
                                                    if (i14 < i91) {
                                                        byte b4 = 1;
                                                        if (bArr5[i104][i106] == 1 && bArr5[i104 + 1][i106] == 0 && bArr5[i104 + 2][i106] == 1 && bArr5[i104 + 3][i106] == 1 && bArr5[i104 + 4][i106] == 1 && bArr5[i104 + 5][i106] == 0 && bArr5[i14][i106] == 1) {
                                                            int i112 = i104 - 4;
                                                            if (i112 >= 0 && bArr5.length >= i104) {
                                                                while (i112 < i104) {
                                                                    if (bArr5[i112][i106] != b4) {
                                                                        i112++;
                                                                        b4 = 1;
                                                                    }
                                                                }
                                                                z3 = true;
                                                                if (z3) {
                                                                    int i113 = i104 + 7;
                                                                    int i114 = i104 + 11;
                                                                    if (i113 < 0 || bArr5.length < i114) {
                                                                        i15 = i104;
                                                                    } else {
                                                                        while (i113 < i114) {
                                                                            i15 = i104;
                                                                            if (bArr5[i113][i106] != 1) {
                                                                                i113++;
                                                                                i104 = i15;
                                                                            }
                                                                        }
                                                                        i15 = i104;
                                                                        z4 = true;
                                                                        if (!z4) {
                                                                            i106++;
                                                                            i104 = i15;
                                                                        }
                                                                    }
                                                                    z4 = false;
                                                                    if (!z4) {
                                                                    }
                                                                } else {
                                                                    i15 = i104;
                                                                }
                                                                i105++;
                                                                i106++;
                                                                i104 = i15;
                                                            }
                                                            z3 = false;
                                                            if (z3) {
                                                            }
                                                            i105++;
                                                            i106++;
                                                            i104 = i15;
                                                        }
                                                    }
                                                    i15 = i104;
                                                    i106++;
                                                    i104 = i15;
                                                }
                                                z5 = false;
                                                if (!z5) {
                                                }
                                                i105 = i13 + 1;
                                                i14 = i104 + 6;
                                                if (i14 < i91) {
                                                }
                                                i15 = i104;
                                                i106++;
                                                i104 = i15;
                                            }
                                        } else {
                                            i13 = i105;
                                        }
                                        i105 = i13;
                                        i14 = i104 + 6;
                                        if (i14 < i91) {
                                        }
                                        i15 = i104;
                                        i106++;
                                        i104 = i15;
                                    }
                                    i104++;
                                }
                                int i115 = (i105 * 40) + i103;
                                int i116 = 0;
                                for (int i117 = 0; i117 < i91; i117++) {
                                    byte[] bArr9 = bArr5[i117];
                                    for (int i118 = 0; i118 < i92; i118++) {
                                        if (bArr9[i118] == 1) {
                                            i116++;
                                        }
                                    }
                                }
                                int i119 = i91 * i92;
                                int abs = (((Math.abs((i116 * 2) - i119) * 10) / i119) * 10) + i115;
                                if (abs < i94) {
                                    i94 = abs;
                                    i93 = i95;
                                } else {
                                    i93 = i102;
                                }
                                i95++;
                                i86 = i96;
                            }
                            i12 = i93;
                        }
                        lg3.H(w23Var8, i86, q0uVar3, i12, rnjVar);
                        int i120 = i87 * 2;
                        int i121 = i92 + i120;
                        int i122 = i120 + i91;
                        int max = Math.max(i, i121);
                        int max2 = Math.max(i2, i122);
                        int min = Math.min(max / i121, max2 / i122);
                        int i123 = (max - (i92 * min)) / 2;
                        int i124 = (max2 - (i91 * min)) / 2;
                        x23 x23Var = new x23();
                        if (max < 1 || max2 < 1) {
                            xq0.x("Both dimensions must be greater than 0");
                            throw null;
                        }
                        x23Var.a = max;
                        x23Var.b = max2;
                        int i125 = (max + 31) / 32;
                        x23Var.c = i125;
                        x23Var.d = new int[i125 * max2];
                        int i126 = 0;
                        while (i126 < i91) {
                            int i127 = i123;
                            int i128 = 0;
                            while (i128 < i92) {
                                if (rnjVar.p(i128, i126) == 1) {
                                    if (i124 < 0 || i127 < 0) {
                                        xq0.x("Left and top must be nonnegative");
                                    } else if (min < 1 || min < 1) {
                                        xq0.x("Height and width must be at least 1");
                                    } else {
                                        int i129 = i127 + min;
                                        int i130 = i124 + min;
                                        if (i130 > x23Var.b || i129 > x23Var.a) {
                                            xq0.x("The region must fit inside the matrix");
                                        } else {
                                            for (int i131 = i124; i131 < i130; i131++) {
                                                int i132 = x23Var.c * i131;
                                                for (int i133 = i127; i133 < i129; i133++) {
                                                    int[] iArr17 = x23Var.d;
                                                    int i134 = (i133 / 32) + i132;
                                                    iArr17[i134] = iArr17[i134] | (1 << (i133 & 31));
                                                }
                                            }
                                        }
                                    }
                                }
                                i128++;
                                i127 += min;
                            }
                            i126++;
                            i124 += min;
                        }
                        return x23Var;
                    }
                }
                z2 = false;
                Object obj22 = k6b.b;
                g6b g6bVar52 = g6b.b;
                if (enumMap == null) {
                }
                if (z7) {
                }
                int i212 = 2;
                int i222 = 8;
                int i232 = 1;
                if (!z2) {
                }
                j4x j4xVar2 = q0uVar.b[ouj.D(i4)];
                int i372 = q0uVar.c;
                int i382 = j4xVar2.b;
                c9n[] c9nVarArr2 = (c9n[]) j4xVar2.c;
                length = c9nVarArr2.length;
                i10 = i5;
                int i392 = i10;
                while (i10 < length) {
                }
                int i402 = i372 - (i392 * i382);
                i11 = i402 * 8;
                if (w23Var.b > i11) {
                }
            }
        }
        z = false;
        if (enumMap != null) {
        }
        z2 = false;
        Object obj222 = k6b.b;
        g6b g6bVar522 = g6b.b;
        if (enumMap == null) {
        }
        if (z7) {
        }
        int i2122 = 2;
        int i2222 = 8;
        int i2322 = 1;
        if (!z2) {
        }
        j4x j4xVar22 = q0uVar.b[ouj.D(i4)];
        int i3722 = q0uVar.c;
        int i3822 = j4xVar22.b;
        c9n[] c9nVarArr22 = (c9n[]) j4xVar22.c;
        length = c9nVarArr22.length;
        i10 = i5;
        int i3922 = i10;
        while (i10 < length) {
        }
        int i4022 = i3722 - (i3922 * i3822);
        i11 = i4022 * 8;
        if (w23Var.b > i11) {
        }
    }

    @Override // defpackage.mbx
    public Object d() {
        throw new IllegalStateException();
    }

    @Override // defpackage.rc
    public String e() {
        return "";
    }

    @Override // defpackage.rc
    public String j() {
        return "";
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return swf.K(szuVar.l.g);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            return swf.K(q7g.I(((jbq) maqVar).b().e()));
        }
        if ((maqVar instanceof eaq) || (maqVar instanceof raq) || (maqVar instanceof vaq)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return null;
    }
}
