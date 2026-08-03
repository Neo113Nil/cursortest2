package f8;

import a4.f;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import androidx.profileinstaller.ProfileInstallReceiver;
import bd.e;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import g7.d;
import h3.c0;
import j0.f0;
import j0.h0;
import j0.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import l.h;
import l.m;
import l1.a0;
import l1.i;
import l1.k;
import l1.n;
import l1.o;
import l1.p;
import l1.q;
import l1.r;
import l1.s;
import l1.t;
import l1.u;
import l1.v;
import l1.w;
import l1.x;
import l1.y;
import l1.z;
import m.l;
import m.p0;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class c implements f, e, g7.e, d, g7.b, p0, m, l {

    /* renamed from: i, reason: collision with root package name */
    public static volatile c f2338i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2339g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2340h;

    public /* synthetic */ c(int i10, Object obj) {
        this.f2339g = i10;
        this.f2340h = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0403 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03f4  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList r(c cVar, String str) {
        int i10;
        int i11;
        char charAt;
        char c3;
        int i12;
        ?? r20;
        int i13;
        long j3;
        boolean z10;
        char c7;
        int i14;
        int i15;
        char c10;
        char c11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        long j6;
        boolean z11;
        long j10;
        int floatToRawIntBits;
        long j11;
        long j12;
        int i22;
        long j13;
        long floatToRawIntBits2;
        int i23;
        boolean z12;
        float intBitsToFloat;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i24 = 0;
        while (true) {
            i10 = 32;
            if (i24 >= length || j.f(str.charAt(i24), 32) > 0) {
                break;
            }
            i24++;
        }
        while (length > i24 && j.f(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i25 = 0;
        while (i24 < length) {
            while (true) {
                i11 = i24 + 1;
                charAt = str.charAt(i24);
                int i26 = charAt | ' ';
                if ((i26 - 122) * (i26 - 97) > 0 || i26 == 101) {
                    if (i11 >= length) {
                        charAt = 0;
                    } else {
                        i24 = i11;
                    }
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i25 = 0;
                    while (true) {
                        if (i11 >= length || j.f(str.charAt(i11), i10) > 0) {
                            if (i11 == length) {
                                int i27 = i10;
                                i13 = i25;
                                j11 = (i11 << i27) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                c3 = charAt;
                                i12 = i27;
                            } else {
                                int i28 = i10;
                                i13 = i25;
                                char charAt2 = str.charAt(i11);
                                boolean z13 = charAt2 == '-';
                                i12 = i28;
                                if (z13) {
                                    i14 = i11 + 1;
                                    if (i14 == length) {
                                        j11 = (i14 << i12) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                        c3 = charAt;
                                    } else {
                                        z10 = true;
                                        z12 = true;
                                        z10 = true;
                                        c7 = str.charAt(i14);
                                        j3 = 4294967295L;
                                        if (((char) (c7 - '0')) >= '\n' && c7 != '.') {
                                            j13 = i14 << i12;
                                            floatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            j11 = j13 | (floatToRawIntBits2 & j3);
                                            c3 = charAt;
                                            r20 = z12;
                                            int i29 = (int) (j11 >>> i12);
                                            intBitsToFloat = Float.intBitsToFloat((int) (j11 & j3));
                                            if (Float.isNaN(intBitsToFloat)) {
                                                i11 = i29;
                                                i25 = i13;
                                            } else {
                                                float[] fArr = (float[]) cVar.f2340h;
                                                i25 = i13 + 1;
                                                fArr[i13] = intBitsToFloat;
                                                if (i25 >= fArr.length) {
                                                    float[] fArr2 = new float[i25 * 2];
                                                    cVar.f2340h = fArr2;
                                                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                                }
                                                i11 = i29;
                                            }
                                            while (i11 < length && str.charAt(i11) == ',') {
                                                i11++;
                                            }
                                            if (i11 >= length && !Float.isNaN(intBitsToFloat)) {
                                                i10 = i12;
                                                charAt = c3;
                                            }
                                        }
                                    }
                                } else {
                                    j3 = 4294967295L;
                                    z10 = true;
                                    c7 = charAt2;
                                    i14 = i11;
                                }
                                int length2 = str.length();
                                int i30 = i14;
                                long j14 = 0;
                                while (i30 != length) {
                                    int i31 = c7 - '0';
                                    if (((char) i31) < '\n') {
                                        int i32 = i11;
                                        j14 = (j14 * 10) + i31;
                                        i30++;
                                        c7 = i30 < length2 ? str.charAt(i30) : (char) 0;
                                        i11 = i32;
                                    } else {
                                        int i33 = i11;
                                        i15 = i30 - i14;
                                        if (i30 == length && c7 == '.') {
                                            int i34 = i30 + 1;
                                            i16 = i34;
                                            c10 = 16;
                                            while (true) {
                                                c11 = '0';
                                                if (length - i16 >= 4) {
                                                    i23 = i34;
                                                    long charAt3 = str.charAt(i16) | (str.charAt(i16 + 1) << 16) | (str.charAt(i16 + 2) << i12) | (str.charAt(i16 + 3) << 48);
                                                    long j15 = charAt3 - 13511005043687472L;
                                                    int i35 = (((charAt3 + 19703549022044230L) | j15) & (-35747867511423104L)) != 0 ? -1 : (int) ((j15 * 281475406208040961L) >>> 48);
                                                    if (i35 >= 0) {
                                                        j14 = (j14 * 10000) + i35;
                                                        i16 += 4;
                                                        i34 = i23;
                                                    }
                                                } else {
                                                    i23 = i34;
                                                }
                                            }
                                            char charAt4 = i16 < length2 ? str.charAt(i16) : (char) 0;
                                            while (true) {
                                                c7 = charAt4;
                                                while (i16 != length) {
                                                    int i36 = c7 - '0';
                                                    if (((char) i36) < '\n') {
                                                        j14 = (j14 * 10) + i36;
                                                        i16++;
                                                        if (i16 < length2) {
                                                            break;
                                                        }
                                                        c7 = 0;
                                                    }
                                                }
                                                charAt4 = str.charAt(i16);
                                            }
                                            int i37 = i23 - i16;
                                            i15 -= i37;
                                            i18 = i37;
                                            i17 = i23;
                                        } else {
                                            c10 = 16;
                                            c11 = '0';
                                            i16 = i30;
                                            i17 = i16;
                                            i18 = 0;
                                        }
                                        if (i15 != 0) {
                                            j13 = i16 << i12;
                                            floatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            z12 = z10;
                                            j11 = j13 | (floatToRawIntBits2 & j3);
                                            c3 = charAt;
                                            r20 = z12;
                                            int i292 = (int) (j11 >>> i12);
                                            intBitsToFloat = Float.intBitsToFloat((int) (j11 & j3));
                                            if (Float.isNaN(intBitsToFloat)) {
                                            }
                                            while (i11 < length) {
                                                i11++;
                                            }
                                            if (i11 >= length) {
                                                i10 = i12;
                                                charAt = c3;
                                            }
                                        } else {
                                            if ((c7 | ' ') == 101) {
                                                i20 = i16 + 1;
                                                char charAt5 = i20 < length2 ? str.charAt(i20) : (char) 0;
                                                boolean z14 = charAt5 == '-' ? z10 ? 1 : 0 : false;
                                                i19 = i33;
                                                if (z14 || charAt5 == '+') {
                                                    i20 = i16 + 2;
                                                }
                                                char charAt6 = str.charAt(i20);
                                                int i38 = 0;
                                                while (true) {
                                                    if (i20 != length) {
                                                        int i39 = charAt6 - '0';
                                                        i22 = i18;
                                                        if (((char) i39) < '\n') {
                                                            if (i38 < 1024) {
                                                                i38 = (i38 * 10) + i39;
                                                            }
                                                            i20++;
                                                            charAt6 = i20 < length2 ? str.charAt(i20) : (char) 0;
                                                            i18 = i22;
                                                        }
                                                    } else {
                                                        i22 = i18;
                                                    }
                                                }
                                                i21 = z14 ? -i38 : i38;
                                                i18 = i22 + i21;
                                            } else {
                                                i19 = i33;
                                                i20 = i16;
                                                i21 = 0;
                                            }
                                            int i40 = 19;
                                            if (i15 > 19) {
                                                char charAt7 = str.charAt(i14);
                                                int i41 = i14;
                                                while (true) {
                                                    if (i20 != length) {
                                                        if (charAt7 == c11 || charAt7 == '.') {
                                                            if (charAt7 == '0') {
                                                                i15--;
                                                            }
                                                            int i42 = i41 + 1;
                                                            charAt7 = i42 < length2 ? str.charAt(i42) : (char) 0;
                                                            i41 = i42;
                                                            i40 = 19;
                                                            c11 = '0';
                                                        } else {
                                                            i40 = 19;
                                                        }
                                                    }
                                                }
                                                if (i15 > i40) {
                                                    char charAt8 = str.charAt(i14);
                                                    int i43 = i21;
                                                    c3 = charAt;
                                                    j6 = 0;
                                                    while (true) {
                                                        if (i14 != i30 && Long.compareUnsigned(j6, 1000000000000000000L) < 0) {
                                                            j6 = (j6 * 10) + (charAt8 - '0');
                                                            i14++;
                                                            charAt8 = i14 < length2 ? str.charAt(i14) : (char) 0;
                                                        }
                                                    }
                                                    if (Long.compareUnsigned(j6, 1000000000000000000L) >= 0) {
                                                        i18 = (i30 - i14) + i43;
                                                    } else {
                                                        char charAt9 = str.charAt(i17);
                                                        int i44 = i17;
                                                        for (j12 = 1000000000000000000L; i44 != i16 && Long.compareUnsigned(j6, j12) < 0; j12 = 1000000000000000000L) {
                                                            j6 = (j6 * 10) + (charAt9 - '0');
                                                            i44++;
                                                            charAt9 = i44 < length2 ? str.charAt(i44) : (char) 0;
                                                        }
                                                        i18 = (i17 - i44) + i43;
                                                    }
                                                    z11 = z10 ? 1 : 0;
                                                    if (-10 > i18 && i18 < 11 && !z11 && Long.compareUnsigned(j6, 16777216L) <= 0) {
                                                        float f10 = j6;
                                                        float[] fArr3 = l1.b.f3930a;
                                                        float f11 = i18 < 0 ? f10 / fArr3[-i18] : f10 * fArr3[i18];
                                                        if (z13) {
                                                            f11 = -f11;
                                                        }
                                                        j10 = i20 << i12;
                                                        floatToRawIntBits = Float.floatToRawIntBits(f11);
                                                    } else if (j6 != 0) {
                                                        j10 = i20 << i12;
                                                        floatToRawIntBits = Float.floatToRawIntBits(z13 ? -0.0f : 0.0f);
                                                    } else if (-126 > i18 || i18 >= 128) {
                                                        String substring = str.substring(i19, i20);
                                                        j.d(substring, "substring(...)");
                                                        j10 = i20 << i12;
                                                        floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring));
                                                    } else {
                                                        long j16 = l1.b.f3931b[i18 + 325];
                                                        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j6);
                                                        long j17 = j6 << numberOfLeadingZeros;
                                                        long j18 = j17 & j3;
                                                        long j19 = j17 >>> i12;
                                                        long j20 = j16 & j3;
                                                        long j21 = j16 >>> i12;
                                                        long j22 = j19 * j21;
                                                        long j23 = j21 * j18;
                                                        long j24 = j22 + ((((j19 * j20) + ((j18 * j20) >>> i12)) + (j23 & j3)) >>> i12) + (j23 >>> i12);
                                                        int i45 = (int) (j24 >>> 63);
                                                        long j25 = j24 >>> (i45 + 9);
                                                        int i46 = numberOfLeadingZeros + (i45 ^ 1);
                                                        long j26 = j24 & 511;
                                                        if (j26 == 511 || (j26 == 0 && (3 & j25) == 1)) {
                                                            String substring2 = str.substring(i19, i20);
                                                            j.d(substring2, "substring(...)");
                                                            j10 = i20 << i12;
                                                            floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring2));
                                                        } else {
                                                            long j27 = (j25 + 1) >>> (z10 ? 1L : 0L);
                                                            if (j27 >= 9007199254740992L) {
                                                                i46--;
                                                                j27 = 4503599627370496L;
                                                            }
                                                            long j28 = j27 & (-4503599627370497L);
                                                            long j29 = ((((i18 * 217706) >> c10) + 1024) + 63) - i46;
                                                            if (j29 < 1 || j29 > 2046) {
                                                                String substring3 = str.substring(i19, i20);
                                                                j.d(substring3, "substring(...)");
                                                                j10 = i20 << i12;
                                                                floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring3));
                                                            } else {
                                                                j10 = i20 << i12;
                                                                floatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble((j29 << 52) | j28 | (z13 ? Long.MIN_VALUE : 0L)));
                                                            }
                                                        }
                                                    }
                                                    j11 = j10 | (floatToRawIntBits & j3);
                                                    r20 = z10;
                                                    int i2922 = (int) (j11 >>> i12);
                                                    intBitsToFloat = Float.intBitsToFloat((int) (j11 & j3));
                                                    if (Float.isNaN(intBitsToFloat)) {
                                                    }
                                                    while (i11 < length) {
                                                    }
                                                    if (i11 >= length) {
                                                    }
                                                }
                                            }
                                            c3 = charAt;
                                            j6 = j14;
                                            z11 = false;
                                            if (-10 > i18) {
                                            }
                                            if (j6 != 0) {
                                            }
                                            j11 = j10 | (floatToRawIntBits & j3);
                                            r20 = z10;
                                            int i29222 = (int) (j11 >>> i12);
                                            intBitsToFloat = Float.intBitsToFloat((int) (j11 & j3));
                                            if (Float.isNaN(intBitsToFloat)) {
                                            }
                                            while (i11 < length) {
                                            }
                                            if (i11 >= length) {
                                            }
                                        }
                                    }
                                }
                                int i332 = i11;
                                i15 = i30 - i14;
                                if (i30 == length) {
                                }
                                c10 = 16;
                                c11 = '0';
                                i16 = i30;
                                i17 = i16;
                                i18 = 0;
                                if (i15 != 0) {
                                }
                            }
                            j3 = 4294967295L;
                            r20 = 1;
                            int i292222 = (int) (j11 >>> i12);
                            intBitsToFloat = Float.intBitsToFloat((int) (j11 & j3));
                            if (Float.isNaN(intBitsToFloat)) {
                            }
                            while (i11 < length) {
                            }
                            if (i11 >= length) {
                            }
                        } else {
                            i11++;
                        }
                    }
                } else {
                    c3 = charAt;
                    i12 = i10;
                    r20 = 1;
                }
                i24 = i11;
                float[] fArr4 = (float[]) cVar.f2340h;
                int i47 = 2;
                switch (c3) {
                    case 'A':
                        int i48 = i25 - 7;
                        for (int i49 = 0; i49 <= i48; i49 += 7) {
                            arrayList.add(new i(fArr4[i49], fArr4[i49 + 1], fArr4[i49 + 2], Float.compare(fArr4[i49 + 3], 0.0f) != 0 ? r20 : false, Float.compare(fArr4[i49 + 4], 0.0f) != 0 ? r20 : false, fArr4[i49 + 5], fArr4[i49 + 6]));
                        }
                        i10 = i12;
                        break;
                    case 'C':
                        int i50 = i25 - 6;
                        for (int i51 = 0; i51 <= i50; i51 += 6) {
                            arrayList.add(new k(fArr4[i51], fArr4[i51 + 1], fArr4[i51 + 2], fArr4[i51 + 3], fArr4[i51 + 4], fArr4[i51 + 5]));
                        }
                        i10 = i12;
                        break;
                    case 'H':
                        int i52 = i25 - 1;
                        for (int i53 = 0; i53 <= i52; i53++) {
                            arrayList.add(new l1.l(fArr4[i53]));
                        }
                        i10 = i12;
                        break;
                    case 'L':
                        int i54 = i25 - 2;
                        for (int i55 = 0; i55 <= i54; i55 += 2) {
                            arrayList.add(new l1.m(fArr4[i55], fArr4[i55 + 1]));
                        }
                        i10 = i12;
                        break;
                    case 'M':
                        int i56 = i25 - 2;
                        if (i56 >= 0) {
                            arrayList.add(new n(fArr4[0], fArr4[r20]));
                            while (i47 <= i56) {
                                arrayList.add(new l1.m(fArr4[i47], fArr4[i47 + 1]));
                                i47 += 2;
                            }
                            i10 = i12;
                            break;
                        }
                        i10 = i12;
                    case 'Q':
                        int i57 = i25 - 4;
                        for (int i58 = 0; i58 <= i57; i58 += 4) {
                            arrayList.add(new o(fArr4[i58], fArr4[i58 + 1], fArr4[i58 + 2], fArr4[i58 + 3]));
                        }
                        i10 = i12;
                        break;
                    case 'S':
                        int i59 = i25 - 4;
                        for (int i60 = 0; i60 <= i59; i60 += 4) {
                            arrayList.add(new p(fArr4[i60], fArr4[i60 + 1], fArr4[i60 + 2], fArr4[i60 + 3]));
                        }
                        i10 = i12;
                        break;
                    case 'T':
                        int i61 = i25 - 2;
                        for (int i62 = 0; i62 <= i61; i62 += 2) {
                            arrayList.add(new q(fArr4[i62], fArr4[i62 + 1]));
                        }
                        i10 = i12;
                        break;
                    case 'V':
                        int i63 = i25 - 1;
                        for (int i64 = 0; i64 <= i63; i64++) {
                            arrayList.add(new a0(fArr4[i64]));
                        }
                        i10 = i12;
                        break;
                    case 'Z':
                    case 'z':
                        arrayList.add(l1.j.f4042c);
                        i10 = i12;
                        break;
                    case 'a':
                        int i65 = i25 - 7;
                        for (int i66 = 0; i66 <= i65; i66 += 7) {
                            arrayList.add(new r(fArr4[i66], fArr4[i66 + 1], fArr4[i66 + 2], Float.compare(fArr4[i66 + 3], 0.0f) != 0 ? r20 : false, Float.compare(fArr4[i66 + 4], 0.0f) != 0 ? r20 : false, fArr4[i66 + 5], fArr4[i66 + 6]));
                        }
                        i10 = i12;
                        break;
                    case 'c':
                        int i67 = i25 - 6;
                        for (int i68 = 0; i68 <= i67; i68 += 6) {
                            arrayList.add(new s(fArr4[i68], fArr4[i68 + 1], fArr4[i68 + 2], fArr4[i68 + 3], fArr4[i68 + 4], fArr4[i68 + 5]));
                        }
                        i10 = i12;
                        break;
                    case 'h':
                        int i69 = i25 - 1;
                        for (int i70 = 0; i70 <= i69; i70++) {
                            arrayList.add(new t(fArr4[i70]));
                        }
                        i10 = i12;
                        break;
                    case 'l':
                        int i71 = i25 - 2;
                        for (int i72 = 0; i72 <= i71; i72 += 2) {
                            arrayList.add(new u(fArr4[i72], fArr4[i72 + 1]));
                        }
                        i10 = i12;
                        break;
                    case 'm':
                        int i73 = i25 - 2;
                        if (i73 >= 0) {
                            arrayList.add(new v(fArr4[0], fArr4[r20]));
                            while (i47 <= i73) {
                                arrayList.add(new u(fArr4[i47], fArr4[i47 + 1]));
                                i47 += 2;
                            }
                        }
                        i10 = i12;
                        break;
                    case 'q':
                        int i74 = i25 - 4;
                        for (int i75 = 0; i75 <= i74; i75 += 4) {
                            arrayList.add(new w(fArr4[i75], fArr4[i75 + 1], fArr4[i75 + 2], fArr4[i75 + 3]));
                        }
                        i10 = i12;
                        break;
                    case 's':
                        int i76 = i25 - 4;
                        for (int i77 = 0; i77 <= i76; i77 += 4) {
                            arrayList.add(new x(fArr4[i77], fArr4[i77 + 1], fArr4[i77 + 2], fArr4[i77 + 3]));
                        }
                        i10 = i12;
                        break;
                    case 't':
                        int i78 = i25 - 2;
                        for (int i79 = 0; i79 <= i78; i79 += 2) {
                            arrayList.add(new y(fArr4[i79], fArr4[i79 + 1]));
                        }
                        i10 = i12;
                        break;
                    case 'v':
                        int i80 = i25 - 1;
                        for (int i81 = 0; i81 <= i80; i81++) {
                            arrayList.add(new z(fArr4[i81]));
                        }
                        i10 = i12;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + c3);
                }
            } else {
                i24 = i11;
            }
        }
        return arrayList;
    }

    @Override // l.m
    public void a(h hVar, boolean z10) {
        if (hVar instanceof l.r) {
            ((l.r) hVar).f3768v.j().c(false);
        }
        m mVar = ((m.i) this.f2340h).f4316k;
        if (mVar != null) {
            mVar.a(hVar, z10);
        }
    }

    @Override // g7.b
    public void b() {
        ((CountDownLatch) this.f2340h).countDown();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Type inference failed for: r6v4, types: [hc.j, oc.e] */
    @Override // bd.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(bd.f fVar, fc.d dVar) {
        bd.a aVar;
        int i10;
        Throwable th;
        cd.w wVar;
        switch (this.f2339g) {
            case 6:
                if (dVar instanceof bd.a) {
                    aVar = (bd.a) dVar;
                    int i11 = aVar.f1075j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        aVar.f1075j = i11 - Integer.MIN_VALUE;
                        Object obj = aVar.f1073h;
                        i10 = aVar.f1075j;
                        ac.o oVar = ac.o.f277a;
                        if (i10 != 0) {
                            v6.a.W(obj);
                            cd.w wVar2 = new cd.w(fVar, aVar.getContext());
                            try {
                                aVar.f1072g = wVar2;
                                aVar.f1075j = 1;
                                Object invoke = ((hc.j) this.f2340h).invoke(wVar2, aVar);
                                gc.a aVar2 = gc.a.f2559g;
                                if (invoke != aVar2) {
                                    invoke = oVar;
                                }
                                if (invoke == aVar2) {
                                    return aVar2;
                                }
                                wVar = wVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                wVar = wVar2;
                                wVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            wVar = aVar.f1072g;
                            try {
                                v6.a.W(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                wVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        wVar.releaseIntercepted();
                        return oVar;
                    }
                }
                aVar = new bd.a(this, dVar);
                Object obj2 = aVar.f1073h;
                i10 = aVar.f1075j;
                ac.o oVar2 = ac.o.f277a;
                if (i10 != 0) {
                }
                wVar.releaseIntercepted();
                return oVar2;
            case 17:
                Object c3 = ((x4.e) this.f2340h).c(new id.c(fVar, 1), dVar);
                return c3 == gc.a.f2559g ? c3 : ac.o.f277a;
            default:
                Object c7 = ((x4.c) this.f2340h).c(new id.c(fVar, 2), dVar);
                return c7 == gc.a.f2559g ? c7 : ac.o.f277a;
        }
    }

    @Override // g7.e
    public void d(Object obj) {
        ((CountDownLatch) this.f2340h).countDown();
    }

    @Override // m.p0
    public void e(h hVar, l.i iVar) {
        l.e eVar = (l.e) this.f2340h;
        Handler handler = eVar.f3668l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f3670n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (hVar == ((l.d) arrayList.get(i10)).f3662b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new c0(this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, iVar, hVar, 1), hVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // l.m
    public boolean f(h hVar) {
        m.i iVar = (m.i) this.f2340h;
        if (hVar == iVar.f4314i) {
            return false;
        }
        ((l.r) hVar).f3769w.getClass();
        iVar.getClass();
        m mVar = iVar.f4316k;
        if (mVar != null) {
            return mVar.f(hVar);
        }
        return false;
    }

    @Override // m.p0
    public void g(h hVar, MenuItem menuItem) {
        ((l.e) this.f2340h).f3668l.removeCallbacksAndMessages(hVar);
    }

    @Override // a4.f
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // a4.f
    public void i(int i10, Object obj) {
        String str;
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f2340h).setResultCode(i10);
    }

    @Override // g7.d
    public void j(Exception exc) {
        ((CountDownLatch) this.f2340h).countDown();
    }

    public i3.d m(int i10) {
        return null;
    }

    public void n() {
        ((m0.v) this.f2340h).getClass();
    }

    public i3.d o(int i10) {
        return null;
    }

    public void p(float f10, float f11, float f12, float f13) {
        a5.c cVar = (a5.c) this.f2340h;
        f1.o t3 = cVar.t();
        float intBitsToFloat = Float.intBitsToFloat((int) (cVar.x() >> 32)) - (f12 + f10);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.x() & 4294967295L)) - (f13 + f11)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) >= 0.0f)) {
            f1.x.a("Width and height must be greater than or equal to zero");
        }
        cVar.Q(floatToRawIntBits);
        t3.e(f10, f11);
    }

    public long q() {
        switch (this.f2339g) {
            case 19:
                j0.p pVar = (j0.p) this.f2340h;
                long q10 = pVar.f3430z.q();
                if (q10 != 16) {
                    return q10;
                }
                f0 f0Var = (f0) x1.f.i(pVar, h0.f3342b);
                if (f0Var != null) {
                    long j3 = f0Var.f3330a;
                    if (j3 != 16) {
                        return j3;
                    }
                }
                return ((f1.q) x1.f.i(pVar, j0.n.f3409a)).f2285a;
            default:
                return ((i0) this.f2340h).f3354c;
        }
    }

    public boolean s(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void t(float f10, float f11, long j3) {
        f1.o t3 = ((a5.c) this.f2340h).t();
        int i10 = (int) (j3 >> 32);
        int i11 = (int) (j3 & 4294967295L);
        t3.e(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        t3.a(f10, f11);
        t3.e(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    public void u(float f10, float f11) {
        ((a5.c) this.f2340h).t().e(f10, f11);
    }

    public /* synthetic */ c(int i10, boolean z10) {
        this.f2339g = i10;
    }

    public c(int i10) {
        Object iVar;
        this.f2339g = i10;
        switch (i10) {
            case 9:
                this.f2340h = new Region();
                break;
            case 11:
                this.f2340h = new CountDownLatch(1);
                break;
            case 15:
                this.f2340h = new i3.e(this);
                break;
            case 16:
                this.f2340h = null;
                break;
            case 21:
                if (Build.VERSION.SDK_INT >= 28) {
                    iVar = new u7.d();
                } else {
                    iVar = new m6.i(10);
                }
                this.f2340h = iVar;
                break;
            default:
                this.f2340h = new HashSet();
                break;
        }
    }

    public c(d.e eVar) {
        this.f2339g = 13;
        this.f2340h = new CopyOnWriteArrayList();
        new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(oc.e eVar) {
        this.f2339g = 6;
        this.f2340h = (hc.j) eVar;
    }

    public void k(int i10, i3.d dVar, String str, Bundle bundle) {
    }
}
