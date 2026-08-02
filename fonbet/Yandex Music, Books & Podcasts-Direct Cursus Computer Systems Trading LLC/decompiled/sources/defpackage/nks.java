package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.alicekit.core.slideup.SlidingBehavior;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;

/* loaded from: classes4.dex */
public final class nks {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final int[] l;
    public final int m;
    public int n = 0;
    public long o = 0;
    public long p;

    public nks(final int[] iArr, final int[] iArr2, int i) {
        this.l = iArr;
        this.m = i;
        a("Not a program", iArr[0] == 1413829430);
        a("Different major version", iArr[1] == 0);
        int i2 = iArr[8];
        a("Invalid ram size", 128 < i2 && i2 < 8388608);
        this.a = iArr[9];
        this.b = iArr[10];
        int i3 = iArr[11];
        this.e = i3;
        this.d = iArr[12];
        this.c = iArr[13];
        this.f = iArr[14];
        this.g = iArr[15];
        this.h = iArr[16];
        int i4 = iArr[18];
        a("Invalid entry points size", i4 > 0 && i4 < 128);
        int i5 = iArr[18];
        int[] iArr3 = new int[i5];
        this.j = iArr3;
        System.arraycopy(iArr, iArr[17], iArr3, 0, i5);
        this.i = iArr[62];
        this.p = System.currentTimeMillis();
        if (iArr2 != null && iArr2.length == iArr[8] && IntStream.range(0, i3).allMatch(new IntPredicate() { // from class: lks
            @Override // java.util.function.IntPredicate
            public final boolean test(int i6) {
                return iArr2[i6] == iArr[i6];
            }
        })) {
            this.k = (int[]) iArr2.clone();
            return;
        }
        int[] iArr4 = new int[iArr[8]];
        this.k = iArr4;
        System.arraycopy(iArr, 0, iArr4, 0, i3);
        e(new int[0], 0);
    }

    public static void a(String str, boolean z) {
        if (!z) {
            throw new yiu(str);
        }
    }

    public final int b(int i) {
        int[] iArr = this.l;
        int[] iArr2 = this.k;
        a("Out of bound", i >= 0 && i < iArr2.length + iArr.length);
        return i < iArr2.length ? iArr2[i] : iArr[i - iArr2.length];
    }

    public final void c(int i, String str) {
        Object obj;
        int i2;
        if (i <= 0 || i > this.m) {
            return;
        }
        b2c b2cVar = irg.b;
        if (i <= 0) {
            return;
        }
        irg.b.getClass();
        Iterator it = irg.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((irg) obj).a == i) {
                    break;
                }
            }
        }
        irg irgVar = (irg) obj;
        if (irgVar == null) {
            irgVar = irg.c;
        }
        switch (irgVar.ordinal()) {
            case 0:
            case 1:
            case 2:
                i2 = 6;
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 3;
                break;
            case 6:
            case 7:
                i2 = 2;
                break;
            default:
                b6e.s();
                return;
        }
        ssg.a(i2, "TinyMlRecommender", str, null);
    }

    public final String d(int i) {
        int[] f = f(i);
        int g = g(i);
        int i2 = 0;
        while (i2 < 8192 && f[g + i2] != 0) {
            i2++;
        }
        a("Invalid string literal: len >= MAX_STRING_LENGTH", f[g + i2] == 0);
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) f[g + i3];
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:441:0x0d34, code lost:
    
        if (r3 != 0) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0d3a, code lost:
    
        return r4[r30.h];
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0d50, code lost:
    
        throw new defpackage.yiu("Illegal VM end state: " + r4[r10]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(int[] iArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float abs;
        double d;
        Comparator<? super Integer> comparingDouble;
        int i9;
        int i10;
        int i11;
        int floatToIntBits;
        int i12;
        int i13 = this.j[i];
        final int[] iArr2 = this.k;
        int i14 = this.a;
        iArr2[i14] = i13;
        int i15 = this.b;
        int i16 = this.c;
        iArr2[i15] = i16;
        int i17 = 0;
        iArr2[i16] = 0;
        int i18 = 1;
        System.arraycopy(iArr, 0, iArr2, i16 + 1, iArr.length);
        this.o = System.nanoTime();
        int i19 = 7;
        int[] iArr3 = new int[7];
        this.n = 0;
        while (true) {
            int i20 = iArr2[i14];
            if (this.f <= i20 && i20 < this.g) {
                a("Too many steps in this run!", this.n < 16777216 ? i18 : i17);
                a("Stack overflow!", iArr2[i15] < this.i ? i18 : i17);
                int length = iArr2[i14] - iArr2.length;
                int[] iArr4 = this.l;
                int i21 = iArr4[length];
                int i22 = i21 & 127;
                int i23 = (i21 >> 28) & i19;
                int i24 = i17;
                while (true) {
                    int i25 = i19;
                    int i26 = i17;
                    int i27 = 2;
                    if (i24 < i23) {
                        int i28 = iArr4[length + 1 + i24];
                        int i29 = (i21 >> ((i24 * 3) + 7)) & 7;
                        if (i29 != 0) {
                            if (i29 == i18) {
                                i28 = b(i28);
                            } else if (i29 == 2) {
                                i28 = b(b(i28));
                            } else if (i29 == 3) {
                                i28 += iArr2[i15];
                            } else if (i29 == 4) {
                                i28 = b(iArr2[i15] + i28);
                            } else {
                                if (i29 != 5) {
                                    throw new yiu(k5r.i(i29, "Unknown argument mode: "));
                                }
                                i28 = b(b(iArr2[i15] + i28));
                            }
                        }
                        iArr3[i24] = i28;
                        i24++;
                        i19 = i25;
                        i17 = i26;
                    } else {
                        int i30 = i23 + 1 + iArr2[i14];
                        iArr2[i14] = i30;
                        switch (i22) {
                            case 1:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] + iArr3[2];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 2:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = Float.floatToIntBits(Float.intBitsToFloat(iArr3[2]) + Float.intBitsToFloat(iArr3[i4]));
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 3:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] - iArr3[2];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 4:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = Float.floatToIntBits(Float.intBitsToFloat(iArr3[i4]) - Float.intBitsToFloat(iArr3[2]));
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 5:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] * iArr3[2];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 6:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = Float.floatToIntBits(Float.intBitsToFloat(iArr3[2]) * Float.intBitsToFloat(iArr3[i4]));
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 7:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] / iArr3[2];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 8:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = Float.floatToIntBits(Float.intBitsToFloat(iArr3[i4]) / Float.intBitsToFloat(iArr3[2]));
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 9:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] % iArr3[2];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 10:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = (int) Float.intBitsToFloat(iArr3[i4]);
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 11:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = Float.floatToIntBits(iArr3[i4]);
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 12:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] > iArr3[2] ? i4 : i2;
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 13:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = Float.intBitsToFloat(iArr3[i4]) > Float.intBitsToFloat(iArr3[2]) ? i4 : i2;
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 14:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] >= iArr3[2] ? i4 : i2;
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 15:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = Float.intBitsToFloat(iArr3[i4]) >= Float.intBitsToFloat(iArr3[2]) ? i4 : i2;
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 16:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] == iArr3[2] ? i4 : i2;
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 17:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = Float.intBitsToFloat(iArr3[i4]) == Float.intBitsToFloat(iArr3[2]) ? i4 : i2;
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 18:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] != iArr3[2] ? i4 : i2;
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 19:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = Float.intBitsToFloat(iArr3[i4]) != Float.intBitsToFloat(iArr3[2]) ? i4 : i2;
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 20:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] & iArr3[2];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 21:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] | iArr3[2];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 22:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = ~iArr3[i4];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 23:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] << iArr3[2];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 24:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4] >> iArr3[2];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 25:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[iArr3[i2]] = iArr3[i4];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 26:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                iArr2[i14] = iArr3[i2];
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 27:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                if (iArr3[i2] > iArr3[i4]) {
                                    i30 = iArr3[2];
                                }
                                iArr2[i14] = i30;
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                i3 = i15;
                                i4 = i18;
                                iArr2[i14] = Float.intBitsToFloat(iArr3[i26]) > Float.intBitsToFloat(iArr3[i4]) ? iArr3[2] : iArr2[i14];
                                break;
                            case 29:
                                i2 = i26;
                                i3 = i15;
                                i4 = i18;
                                if (iArr3[i2] >= iArr3[i4]) {
                                    i30 = iArr3[2];
                                }
                                iArr2[i14] = i30;
                                continue;
                                this.n++;
                                i19 = i25;
                                i17 = i2;
                                i18 = i4;
                                i15 = i3;
                            case 30:
                                i3 = i15;
                                i4 = i18;
                                iArr2[i14] = Float.intBitsToFloat(iArr3[i26]) >= Float.intBitsToFloat(iArr3[i4]) ? iArr3[2] : iArr2[i14];
                                break;
                            default:
                                switch (i22) {
                                    case 32:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = i18;
                                        iArr2[iArr3[i5]] = Float.floatToIntBits((float) Math.exp(Float.intBitsToFloat(iArr3[i4])));
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = i18;
                                        iArr2[iArr3[i5]] = Float.floatToIntBits((float) Math.log(Math.abs(Float.intBitsToFloat(iArr3[i4]))));
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = i18;
                                        iArr2[iArr3[i5]] = Float.floatToIntBits((float) Math.sin(Float.intBitsToFloat(iArr3[i4])));
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case 35:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = i18;
                                        iArr2[iArr3[i5]] = Float.floatToIntBits((float) Math.cos(Float.intBitsToFloat(iArr3[i4])));
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = i18;
                                        iArr2[iArr3[i5]] = Float.floatToIntBits((float) Math.atan(Float.intBitsToFloat(iArr3[i4])));
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case 37:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = i18;
                                        c(iArr3[i5], d(iArr3[i4]));
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case 38:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = i18;
                                        c(iArr3[i5], String.format(d(iArr3[i4]), Integer.valueOf(iArr3[2])));
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case 39:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = i18;
                                        c(iArr3[i5], String.format(d(iArr3[i4]), Float.valueOf(Float.intBitsToFloat(iArr3[2]))));
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case 40:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = i18;
                                        c(iArr3[i5], String.format(d(iArr3[i4]), d(iArr3[2])));
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case 41:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = i18;
                                        c(iArr3[i5], String.format(d(iArr3[i4]), Integer.valueOf(iArr3[2]), Integer.valueOf(iArr3[3])));
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case 42:
                                        i5 = i26;
                                        i3 = i15;
                                        i4 = 1;
                                        a(d(iArr3[1]), iArr3[i5] != 0 ? 1 : i5);
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                                        i6 = i26;
                                        i3 = i15;
                                        iArr2[iArr3[i6]] = (int) (System.currentTimeMillis() / 1000);
                                        i2 = i6;
                                        i4 = 1;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                                        i3 = i15;
                                        int i31 = iArr3[i26];
                                        long j = this.p - 7046029254386353131L;
                                        this.p = j;
                                        long j2 = (j ^ (j >> 30)) * (-4658895280553007687L);
                                        long j3 = (j2 ^ (j2 >> 27)) * (-7723592293110705685L);
                                        iArr2[i31] = (int) ((j3 ^ (j3 >> 31)) & 2147483647L);
                                        i2 = 0;
                                        i4 = 1;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                                        i6 = i26;
                                        i3 = i15;
                                        this.p = iArr3[i6];
                                        i2 = i6;
                                        i4 = 1;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                                        i5 = i26;
                                        i3 = i15;
                                        System.arraycopy(iArr3, 1, iArr2, iArr3[i5], 6);
                                        i4 = 1;
                                        i2 = i5;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                                        i6 = i26;
                                        i3 = i15;
                                        iArr2[iArr3[i6]] = (int) ((System.nanoTime() - this.o) / 1000);
                                        i2 = i6;
                                        i4 = 1;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                                        i6 = i26;
                                        i3 = i15;
                                        iArr2[iArr3[i6]] = 20250901;
                                        i2 = i6;
                                        i4 = 1;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                                        i6 = i26;
                                        i3 = i15;
                                        iArr2[iArr3[i6]] = this.m;
                                        i2 = i6;
                                        i4 = 1;
                                        this.n++;
                                        i19 = i25;
                                        i17 = i2;
                                        i18 = i4;
                                        i15 = i3;
                                    default:
                                        switch (i22) {
                                            case SQLiteDatabase.OPEN_URI /* 64 */:
                                                i3 = i15;
                                                int i32 = i18;
                                                i6 = 0;
                                                System.arraycopy(f(iArr3[i32]), g(iArr3[i32]), iArr2, iArr3[0], iArr3[2]);
                                                i2 = i6;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 65:
                                                i3 = i15;
                                                int i33 = iArr3[i26];
                                                int i34 = iArr3[1];
                                                int i35 = iArr3[2];
                                                int i36 = iArr3[3];
                                                for (int i37 = 0; i37 < i35; i37++) {
                                                    iArr2[(i37 * i34) + i33] = i36;
                                                }
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 66:
                                                i3 = i15;
                                                int i38 = iArr3[i26];
                                                int i39 = iArr3[1];
                                                int i40 = iArr3[2];
                                                float intBitsToFloat = Float.intBitsToFloat(iArr3[3]);
                                                float intBitsToFloat2 = Float.intBitsToFloat(iArr3[4]);
                                                for (int i41 = 0; i41 < i40; i41++) {
                                                    int i42 = (i41 * i39) + i38;
                                                    iArr2[i42] = Float.floatToIntBits((Float.intBitsToFloat(iArr2[i42]) * intBitsToFloat) + intBitsToFloat2);
                                                }
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 67:
                                                i3 = i15;
                                                int i43 = iArr3[i26];
                                                int i44 = iArr3[1];
                                                int[] f = f(iArr3[2]);
                                                int g = g(iArr3[2]);
                                                int i45 = iArr3[3];
                                                int i46 = iArr3[4];
                                                float intBitsToFloat3 = Float.intBitsToFloat(iArr3[5]);
                                                float intBitsToFloat4 = Float.intBitsToFloat(iArr3[6]);
                                                for (int i47 = 0; i47 < i46; i47++) {
                                                    int i48 = (i47 * i44) + i43;
                                                    iArr2[i48] = Float.floatToIntBits((Float.intBitsToFloat(f[(i47 * i45) + g]) * intBitsToFloat4) + (Float.intBitsToFloat(iArr2[i48]) * intBitsToFloat3));
                                                }
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 68:
                                                i3 = i15;
                                                int i49 = iArr3[i26];
                                                int i50 = iArr3[1];
                                                int[] f2 = f(iArr3[2]);
                                                int g2 = g(iArr3[2]);
                                                int i51 = iArr3[3];
                                                int i52 = iArr3[4];
                                                for (int i53 = 0; i53 < i52; i53++) {
                                                    int i54 = (i53 * i50) + i49;
                                                    iArr2[i54] = Float.floatToIntBits(Float.intBitsToFloat(f2[(i53 * i51) + g2]) * Float.intBitsToFloat(iArr2[i54]));
                                                }
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 69:
                                                i3 = i15;
                                                int i55 = iArr3[i26];
                                                int[] f3 = f(iArr3[1]);
                                                int g3 = g(iArr3[1]);
                                                int i56 = iArr3[2];
                                                int[] f4 = f(iArr3[3]);
                                                int g4 = g(iArr3[3]);
                                                int i57 = iArr3[4];
                                                int i58 = 0;
                                                double d2 = 0.0d;
                                                while (i58 < iArr3[5]) {
                                                    d2 += Float.intBitsToFloat(f4[(i58 * i57) + g4]) * Float.intBitsToFloat(f3[(i58 * i56) + g3]);
                                                    i58++;
                                                    i55 = i55;
                                                    g4 = g4;
                                                }
                                                iArr2[i55] = Float.floatToIntBits((float) d2);
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                                                i3 = i15;
                                                int i59 = iArr3[i26];
                                                int[] f5 = f(iArr3[1]);
                                                int g5 = g(iArr3[1]);
                                                int i60 = iArr3[2];
                                                double d3 = 0.0d;
                                                for (int i61 = 0; i61 < iArr3[3]; i61++) {
                                                    d3 += Float.intBitsToFloat(f5[(i61 * i60) + g5]);
                                                }
                                                iArr2[i59] = Float.floatToIntBits((float) d3);
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 71:
                                                i3 = i15;
                                                int i62 = iArr3[i26];
                                                int[] f6 = f(iArr3[1]);
                                                int g6 = g(iArr3[1]);
                                                int i63 = iArr3[2];
                                                int i64 = iArr3[3];
                                                float intBitsToFloat5 = Float.intBitsToFloat(iArr3[4]);
                                                int i65 = 0;
                                                double d4 = 0.0d;
                                                while (i65 < i64) {
                                                    int floatToIntBits2 = Float.floatToIntBits(intBitsToFloat5);
                                                    if (floatToIntBits2 == 1065353216) {
                                                        i7 = i64;
                                                        i8 = i62;
                                                        abs = Math.abs(Float.intBitsToFloat(f6[(i65 * i63) + g6]));
                                                    } else if (floatToIntBits2 != 1073741824) {
                                                        i7 = i64;
                                                        i8 = i62;
                                                        d = Math.pow(Math.abs(Float.intBitsToFloat(f6[(i65 * i63) + g6])), intBitsToFloat5);
                                                        d4 += d;
                                                        i65++;
                                                        i62 = i8;
                                                        i64 = i7;
                                                    } else {
                                                        i7 = i64;
                                                        i8 = i62;
                                                        int i66 = (i65 * i63) + g6;
                                                        abs = Float.intBitsToFloat(f6[i66]) * Float.intBitsToFloat(f6[i66]);
                                                    }
                                                    d = abs;
                                                    d4 += d;
                                                    i65++;
                                                    i62 = i8;
                                                    i64 = i7;
                                                }
                                                iArr2[i62] = Float.floatToIntBits((float) Math.pow(d4, 1.0f / intBitsToFloat5));
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 72:
                                                i3 = i15;
                                                int i67 = iArr3[i26];
                                                int i68 = iArr3[1];
                                                int[] f7 = f(iArr3[2]);
                                                int g7 = g(iArr3[2]);
                                                int i69 = iArr3[3];
                                                int i70 = iArr3[4];
                                                float intBitsToFloat6 = Float.intBitsToFloat(iArr3[5]);
                                                float intBitsToFloat7 = Float.intBitsToFloat(iArr3[6]);
                                                for (int i71 = 0; i71 < i70; i71++) {
                                                    int i72 = (f7[(i71 * i69) + g7] * i68) + i67;
                                                    iArr2[i72] = Float.floatToIntBits((Float.intBitsToFloat(iArr2[i72]) * intBitsToFloat6) + intBitsToFloat7);
                                                }
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 73:
                                                i3 = i15;
                                                int i73 = iArr3[i26];
                                                int i74 = iArr3[1];
                                                int[] f8 = f(iArr3[2]);
                                                int g8 = g(iArr3[2]);
                                                int i75 = iArr3[3];
                                                int[] f9 = f(iArr3[4]);
                                                int g9 = g(iArr3[4]);
                                                int i76 = iArr3[5];
                                                int i77 = iArr3[6];
                                                for (int i78 = 0; i78 < i77; i78++) {
                                                    iArr2[(i78 * i74) + i73] = f8[(f9[(i78 * i76) + g9] * i75) + g8];
                                                }
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 74:
                                                i3 = i15;
                                                final int[] f10 = f(iArr3[i26]);
                                                final int g10 = g(iArr3[i26]);
                                                final int i79 = iArr3[1];
                                                int i80 = iArr3[2];
                                                int i81 = iArr3[3];
                                                int i82 = iArr3[4];
                                                final int i83 = iArr3[5];
                                                int i84 = iArr3[6];
                                                a("Invalid size in argsort", i82 >= 0 && i82 < iArr2.length);
                                                if (i84 <= 0) {
                                                    final int i85 = 1;
                                                    comparingDouble = Comparator.comparingDouble(new ToDoubleFunction() { // from class: kks
                                                        @Override // java.util.function.ToDoubleFunction
                                                        public final double applyAsDouble(Object obj) {
                                                            Integer num = (Integer) obj;
                                                            switch (i85) {
                                                                case 0:
                                                                    return Float.intBitsToFloat(f10[(num.intValue() * i79) + g10]) * i83;
                                                                case 1:
                                                                    return Float.intBitsToFloat(f10[(num.intValue() * i79) + g10]) * i83;
                                                                default:
                                                                    return i83 * f10[(num.intValue() * i79) + g10];
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i86 = 2;
                                                    comparingDouble = Comparator.comparingDouble(new ToDoubleFunction() { // from class: kks
                                                        @Override // java.util.function.ToDoubleFunction
                                                        public final double applyAsDouble(Object obj) {
                                                            Integer num = (Integer) obj;
                                                            switch (i86) {
                                                                case 0:
                                                                    return Float.intBitsToFloat(f10[(num.intValue() * i79) + g10]) * i83;
                                                                case 1:
                                                                    return Float.intBitsToFloat(f10[(num.intValue() * i79) + g10]) * i83;
                                                                default:
                                                                    return i83 * f10[(num.intValue() * i79) + g10];
                                                            }
                                                        }
                                                    });
                                                }
                                                int[] array = IntStream.range(0, i82).boxed().sorted(comparingDouble).mapToInt(new mks()).toArray();
                                                for (int i87 = 0; i87 < i82; i87++) {
                                                    iArr2[(i87 * i81) + i80] = array[i87];
                                                }
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                                break;
                                            case 75:
                                                i3 = i15;
                                                final int i88 = iArr3[i26];
                                                final int i89 = iArr3[1];
                                                final int[] f11 = f(iArr3[2]);
                                                final int g11 = g(iArr3[2]);
                                                final int i90 = iArr3[3];
                                                int i91 = iArr3[4];
                                                a("Invalid size in applyPermutation", i91 >= 0 && i91 < iArr2.length);
                                                int[] array2 = IntStream.range(0, i91).map(new IntUnaryOperator() { // from class: jks
                                                    @Override // java.util.function.IntUnaryOperator
                                                    public final int applyAsInt(int i92) {
                                                        return iArr2[(f11[(i92 * i90) + g11] * i89) + i88];
                                                    }
                                                }).toArray();
                                                for (int i92 = 0; i92 < i91; i92++) {
                                                    iArr2[(i92 * i89) + i88] = array2[i92];
                                                }
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                                break;
                                            case 76:
                                                i3 = i15;
                                                int i93 = iArr3[i26];
                                                final int[] f12 = f(iArr3[1]);
                                                final int g12 = g(iArr3[1]);
                                                final int i94 = iArr3[2];
                                                int i95 = iArr3[3];
                                                final int i96 = iArr3[4];
                                                final int i97 = 0;
                                                iArr2[i93] = IntStream.range(i26, i95).boxed().max(Comparator.comparingDouble(new ToDoubleFunction() { // from class: kks
                                                    @Override // java.util.function.ToDoubleFunction
                                                    public final double applyAsDouble(Object obj) {
                                                        Integer num = (Integer) obj;
                                                        switch (i97) {
                                                            case 0:
                                                                return Float.intBitsToFloat(f12[(num.intValue() * i94) + g12]) * i96;
                                                            case 1:
                                                                return Float.intBitsToFloat(f12[(num.intValue() * i94) + g12]) * i96;
                                                            default:
                                                                return i96 * f12[(num.intValue() * i94) + g12];
                                                        }
                                                    }
                                                })).orElse(-1).intValue();
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 77:
                                                i3 = i15;
                                                int i98 = iArr3[i26];
                                                int i99 = iArr3[1];
                                                int i100 = iArr3[2];
                                                for (int i101 = 0; i101 < i100 / 2; i101++) {
                                                    int i102 = (i101 * i99) + i98;
                                                    int i103 = iArr2[i102];
                                                    int i104 = (((i100 - 1) - i101) * i99) + i98;
                                                    iArr2[i102] = iArr2[i104];
                                                    iArr2[i104] = i103;
                                                }
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            case 78:
                                                i3 = i15;
                                                int i105 = iArr3[i26];
                                                int[] f13 = f(iArr3[1]);
                                                int g13 = g(iArr3[1]);
                                                int i106 = iArr3[2];
                                                int i107 = iArr3[3];
                                                int i108 = iArr3[4];
                                                int i109 = iArr3[5];
                                                int i110 = iArr3[6];
                                                int i111 = i107;
                                                int i112 = 0;
                                                while (i112 < i111) {
                                                    int b = ouj.b(i111, i112, i27, i112);
                                                    if (i110 <= 0) {
                                                        float f14 = i109;
                                                        if (Float.intBitsToFloat(f13[(b * i106) + g13]) * f14 < Float.intBitsToFloat(i108) * f14) {
                                                            i10 = b + 1;
                                                            i9 = i27;
                                                            i112 = i10;
                                                            i27 = i9;
                                                        }
                                                    }
                                                    if (i110 > 0) {
                                                        i9 = i27;
                                                        if (f13[(b * i106) + g13] * i109 < i109 * i108) {
                                                            i10 = b + 1;
                                                            i112 = i10;
                                                            i27 = i9;
                                                        }
                                                    } else {
                                                        i9 = i27;
                                                    }
                                                    i111 = b;
                                                    i27 = i9;
                                                }
                                                iArr2[i105] = i112;
                                                i2 = 0;
                                                i4 = 1;
                                                this.n++;
                                                i19 = i25;
                                                i17 = i2;
                                                i18 = i4;
                                                i15 = i3;
                                            default:
                                                switch (i22) {
                                                    case SlidingBehavior.WIDE_EXPANDED_PERCENTAGE /* 80 */:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                        i3 = i15;
                                                        int i113 = i18;
                                                        int i114 = iArr3[i26];
                                                        int i115 = iArr3[i113];
                                                        int i116 = iArr3[2];
                                                        int i117 = i22 - 80;
                                                        int i118 = iArr3[3];
                                                        int i119 = 0;
                                                        while (i119 < i116) {
                                                            int i120 = (i119 * i115) + i114;
                                                            if (i117 == 0) {
                                                                i11 = i119 + i118;
                                                            } else if (i117 == i113) {
                                                                i11 = Float.floatToIntBits(i119 + i118);
                                                            } else if (i117 == 2) {
                                                                i11 = Float.floatToIntBits(1.0f / (Float.intBitsToFloat(iArr2[i120]) + Float.intBitsToFloat(i118)));
                                                            } else if (i117 == 3) {
                                                                i11 = Float.intBitsToFloat(iArr2[i120]) >= Float.intBitsToFloat(i118) ? Float.floatToIntBits(1.0f) : Float.floatToIntBits(0.0f);
                                                            } else {
                                                                if (i117 != 4) {
                                                                    throw new yiu(k5r.i(i117, "Unknown func code in apply: "));
                                                                }
                                                                i11 = iArr2[i120] >= i118 ? 1 : 0;
                                                            }
                                                            iArr2[i120] = i11;
                                                            i119++;
                                                            i113 = 1;
                                                        }
                                                        i2 = 0;
                                                        i4 = 1;
                                                        this.n++;
                                                        i19 = i25;
                                                        i17 = i2;
                                                        i18 = i4;
                                                        i15 = i3;
                                                    default:
                                                        switch (i22) {
                                                            case 90:
                                                            case 91:
                                                            case 92:
                                                            case 93:
                                                            case 94:
                                                            case 95:
                                                            case 96:
                                                                i3 = i15;
                                                                i4 = i18;
                                                                int i121 = iArr3[i26];
                                                                int i122 = iArr3[i4];
                                                                int i123 = iArr3[2];
                                                                int i124 = i22 - 90;
                                                                for (int i125 = 0; i125 < i123; i125++) {
                                                                    int i126 = (i125 * i122) + i121;
                                                                    switch (i124) {
                                                                        case 0:
                                                                            floatToIntBits = Float.floatToIntBits(Math.abs(Float.intBitsToFloat(iArr2[i126])));
                                                                            break;
                                                                        case 1:
                                                                            floatToIntBits = Float.floatToIntBits((float) Math.exp(Float.intBitsToFloat(iArr2[i126])));
                                                                            break;
                                                                        case 2:
                                                                            floatToIntBits = Float.floatToIntBits((float) Math.log(Math.abs(Float.intBitsToFloat(iArr2[i126]))));
                                                                            break;
                                                                        case 3:
                                                                            floatToIntBits = (int) Float.intBitsToFloat(iArr2[i126]);
                                                                            break;
                                                                        case 4:
                                                                            floatToIntBits = Float.floatToIntBits(iArr2[i126]);
                                                                            break;
                                                                        case 5:
                                                                            if (Float.intBitsToFloat(iArr2[i126]) >= 0.0f) {
                                                                                floatToIntBits = iArr2[i126];
                                                                                break;
                                                                            } else {
                                                                                floatToIntBits = Float.floatToIntBits(Float.intBitsToFloat(0));
                                                                                break;
                                                                            }
                                                                        case 6:
                                                                            if (Float.intBitsToFloat(iArr2[i126]) >= 0.0f) {
                                                                                floatToIntBits = iArr2[i126];
                                                                                break;
                                                                            } else {
                                                                                floatToIntBits = Float.floatToIntBits((float) (Math.exp(Float.intBitsToFloat(iArr2[i126])) - 1.0d));
                                                                                break;
                                                                            }
                                                                        default:
                                                                            throw new yiu(k5r.i(i124, "Unknown func code in apply: "));
                                                                    }
                                                                    iArr2[i126] = floatToIntBits;
                                                                }
                                                                break;
                                                            default:
                                                                switch (i22) {
                                                                    case 100:
                                                                        i3 = i15;
                                                                        i4 = i18;
                                                                        int i127 = iArr3[i26];
                                                                        int[] f15 = f(iArr3[i4]);
                                                                        int g14 = g(iArr3[i4]);
                                                                        int[] f16 = f(iArr3[2]);
                                                                        int g15 = g(iArr3[2]);
                                                                        float intBitsToFloat8 = Float.intBitsToFloat(iArr3[3]);
                                                                        float intBitsToFloat9 = Float.intBitsToFloat(iArr3[4]);
                                                                        int i128 = iArr3[5];
                                                                        int i129 = iArr2[i128];
                                                                        int i130 = iArr2[i128 + 1];
                                                                        int i131 = iArr2[i128 + 2];
                                                                        int i132 = iArr2[i128 + 3] != 0 ? i4 : 0;
                                                                        int i133 = iArr2[i128 + 4];
                                                                        int i134 = iArr2[i128 + 5];
                                                                        int i135 = 0;
                                                                        while (true) {
                                                                            int[] iArr5 = f15;
                                                                            if (i135 >= (i132 != 0 ? i134 : i133)) {
                                                                                break;
                                                                            } else {
                                                                                int i136 = 0;
                                                                                double d5 = 0.0d;
                                                                                while (true) {
                                                                                    i12 = i135;
                                                                                    if (i136 < (i132 != 0 ? i133 : i134)) {
                                                                                        d5 += Float.intBitsToFloat(i132 != 0 ? iArr5[(i12 * i130) + g14 + i136] : iArr5[(i136 * i130) + g14 + i12]) * Float.intBitsToFloat(f16[(i136 * i131) + g15]);
                                                                                        i136++;
                                                                                        i135 = i12;
                                                                                    }
                                                                                }
                                                                                iArr2[(i12 * i129) + i127] = Float.floatToIntBits((float) ((intBitsToFloat8 * d5) + (Float.intBitsToFloat(iArr2[r2]) * intBitsToFloat9)));
                                                                                i135 = i12 + 1;
                                                                                f15 = iArr5;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 101:
                                                                        i3 = i15;
                                                                        i4 = i18;
                                                                        int i137 = iArr3[i26];
                                                                        int i138 = iArr3[i4];
                                                                        int[] f17 = f(iArr3[2]);
                                                                        int g16 = g(iArr3[2]);
                                                                        int[] f18 = f(iArr3[3]);
                                                                        int g17 = g(iArr3[3]);
                                                                        float intBitsToFloat10 = Float.intBitsToFloat(iArr3[4]);
                                                                        int i139 = iArr3[5];
                                                                        int i140 = iArr2[i139];
                                                                        int i141 = iArr2[i139 + 1];
                                                                        int i142 = iArr2[i139 + 2];
                                                                        int i143 = iArr2[i139 + 3];
                                                                        int i144 = 0;
                                                                        while (i144 < i143) {
                                                                            float intBitsToFloat11 = Float.intBitsToFloat(f18[(i144 * i141) + g17]) * intBitsToFloat10;
                                                                            int i145 = i143;
                                                                            for (int i146 = 0; i146 < i142; i146++) {
                                                                                int i147 = (i144 * i138) + i137 + i146;
                                                                                iArr2[i147] = Float.floatToIntBits((Float.intBitsToFloat(f17[(i146 * i140) + g16]) * intBitsToFloat11) + Float.intBitsToFloat(iArr2[i147]));
                                                                            }
                                                                            i144++;
                                                                            i143 = i145;
                                                                        }
                                                                        break;
                                                                    case 102:
                                                                        int i148 = iArr3[i26];
                                                                        int[] f19 = f(iArr3[i18]);
                                                                        int g18 = g(iArr3[i18]);
                                                                        int[] f20 = f(iArr3[2]);
                                                                        int g19 = g(iArr3[2]);
                                                                        float intBitsToFloat12 = Float.intBitsToFloat(iArr3[3]);
                                                                        float intBitsToFloat13 = Float.intBitsToFloat(iArr3[4]);
                                                                        int i149 = iArr3[5];
                                                                        int i150 = iArr2[i149];
                                                                        int i151 = iArr2[i149 + 1];
                                                                        int i152 = iArr2[i149 + 2];
                                                                        int i153 = iArr2[i149 + 3];
                                                                        int i154 = iArr2[i149 + 4];
                                                                        int i155 = iArr2[i149 + 5];
                                                                        int i156 = iArr3[6];
                                                                        int i157 = iArr2[i156] != 0 ? i18 : 0;
                                                                        int i158 = iArr2[i156 + 1] != 0 ? i18 : 0;
                                                                        i4 = i18;
                                                                        int i159 = 0;
                                                                        while (i159 < i154) {
                                                                            int i160 = i15;
                                                                            int i161 = 0;
                                                                            while (i161 < i153) {
                                                                                int i162 = i161;
                                                                                int i163 = 0;
                                                                                double d6 = 0.0d;
                                                                                while (i163 < i155) {
                                                                                    d6 += Float.intBitsToFloat(i158 != 0 ? f20[(i163 * i152) + g19 + i159] : f20[(i159 * i152) + g19 + i163]) * Float.intBitsToFloat(i157 != 0 ? f19[(i162 * i151) + g18 + i163] : f19[(i163 * i151) + g18 + i162]);
                                                                                    i163++;
                                                                                    i155 = i155;
                                                                                }
                                                                                int i164 = i155;
                                                                                iArr2[(i159 * i150) + i148 + i162] = Float.floatToIntBits((float) ((intBitsToFloat12 * d6) + (Float.intBitsToFloat(iArr2[r3]) * intBitsToFloat13)));
                                                                                i161 = i162 + 1;
                                                                                i155 = i164;
                                                                            }
                                                                            i159++;
                                                                            i15 = i160;
                                                                        }
                                                                        i3 = i15;
                                                                        break;
                                                                    case 103:
                                                                        int i165 = iArr3[i26];
                                                                        int i166 = iArr3[i18];
                                                                        int i167 = iArr3[2];
                                                                        a("Invalid (m, n) in transpose", (((i166 >= 0 ? i18 : i26) & (i167 >= 0 ? i18 : i26)) == 0 || i166 * i167 >= iArr2.length) ? i26 : i18);
                                                                        int i168 = i166 * i167;
                                                                        int[] iArr6 = new int[i168];
                                                                        System.arraycopy(iArr2, i165, iArr6, i26, i168);
                                                                        for (int i169 = 0; i169 < i167; i169++) {
                                                                            for (int i170 = 0; i170 < i166; i170++) {
                                                                                iArr2[(i169 * i166) + i165 + i170] = iArr6[(i170 * i167) + i169];
                                                                            }
                                                                        }
                                                                        i3 = i15;
                                                                        i4 = i18;
                                                                        break;
                                                                    default:
                                                                        throw new yiu(k5r.i(i22, "Unknown command code: "));
                                                                }
                                                        }
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        i2 = 0;
                        this.n++;
                        i19 = i25;
                        i17 = i2;
                        i18 = i4;
                        i15 = i3;
                    }
                }
            }
        }
    }

    public final int[] f(int i) {
        int[] iArr = this.k;
        return i < iArr.length ? iArr : this.l;
    }

    public final int g(int i) {
        int[] iArr = this.k;
        return i < iArr.length ? i : i - iArr.length;
    }
}
