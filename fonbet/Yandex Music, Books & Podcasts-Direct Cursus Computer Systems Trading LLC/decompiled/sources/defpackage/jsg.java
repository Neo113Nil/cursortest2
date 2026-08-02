package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.ContextThemeWrapper;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.NetworkChangeDetector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class jsg implements d2k, xwt, rzb, arr, wa6, bya {
    public static volatile jsg d;
    public final /* synthetic */ int a;
    public int b;
    public static final Object c = new Object();
    public static final float[] e = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] f = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    public jsg(int i, int i2, boolean z) {
        int i3;
        this.a = 10;
        int i4 = 6;
        if (z) {
            int i5 = NetworkChangeDetector.j;
            if (i == 0) {
                switch (i2) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        i3 = 3;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        i3 = 4;
                        break;
                    case 13:
                        i3 = 5;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                i4 = i3;
            } else if (i != 1) {
                if (i != 6) {
                    if (i != 7) {
                        if (i == 9) {
                            i4 = 1;
                        }
                        i3 = 0;
                        i4 = i3;
                    } else {
                        i4 = 7;
                    }
                }
                i3 = 5;
                i4 = i3;
            } else {
                i3 = 2;
                i4 = i3;
            }
        }
        this.b = i4;
    }

    public static jsg j() {
        jsg jsgVar;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new jsg(3, 0);
                }
                jsgVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jsgVar;
    }

    public static String n(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // defpackage.bya
    public int a(Context context, boolean z) {
        return 0;
    }

    @Override // defpackage.wa6
    public void accept(Object obj) {
        lcr lcrVar = (lcr) obj;
        this.b = lcrVar != null ? lcrVar.a : Integer.MAX_VALUE;
    }

    @Override // defpackage.bya
    public int b(Context context) {
        return this.b;
    }

    public xw3 c(Context context, nw3 nw3Var, xx3 xx3Var, g0c g0cVar, boolean z) {
        context.getClass();
        xx3Var.getClass();
        g0cVar.getClass();
        xw3 xw3Var = new xw3(new ContextThemeWrapper(context, this.b), null, 0, 6, null);
        xw3Var.d = g0cVar;
        vw3 vw3Var = new vw3(xw3Var.a, zsd.D(xx3Var), z);
        xw3Var.b = vw3Var;
        int i = 0;
        ww3 ww3Var = new ww3(g0cVar, nw3Var, i);
        vw3Var.c.setInputEventListener(new uw3(ww3Var, i));
        vw3Var.d.setInputEventListener(new uw3(ww3Var, 1));
        vw3Var.e.setInputEventListener(new uw3(ww3Var, 2));
        vw3Var.i = ww3Var;
        xw3Var.c = nw3Var;
        return xw3Var;
    }

    @Override // defpackage.rzb
    public jxt d(Map map) {
        return (jxt) new tb(new jqe(this.b)).a;
    }

    public void e(String str, String str2) {
        if (this.b <= 3) {
            Log.d(str, str2);
        }
    }

    public void f(String str, String str2, Throwable th) {
        if (this.b <= 3) {
            Log.d(str, str2, th);
        }
    }

    public void g(String str, String str2) {
        if (this.b <= 6) {
            Log.e(str, str2);
        }
    }

    @Override // defpackage.arr
    public Object get() {
        return new lcr(this.b);
    }

    public void h(String str, String str2, Throwable th) {
        if (this.b <= 6) {
            Log.e(str, str2, th);
        }
    }

    @Override // defpackage.d2k
    public int i(utf utfVar, int i, int i2) {
        int i3 = this.a;
        utfVar.getClass();
        switch (i3) {
            case 3:
                int i4 = this.b;
                int i5 = (i - ((i4 - 1) * i2)) / i4;
                if (i5 < 0) {
                    return 0;
                }
                return i5;
            default:
                int i6 = this.b;
                if (i6 < 0) {
                    return 0;
                }
                return i6;
        }
    }

    public void k(String str, String str2) {
        if (this.b <= 4) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x008a A[EDGE_INSN: B:117:0x008a->B:47:0x008a BREAK  A[LOOP:0: B:10:0x0034->B:17:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float l(int i, int i2, String str) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        float f2;
        char charAt;
        int i8;
        boolean z3;
        boolean z4;
        char charAt2;
        this.b = i;
        if (i >= i2) {
            return Float.NaN;
        }
        char charAt3 = str.charAt(i);
        if (charAt3 == '+') {
            z = false;
        } else {
            if (charAt3 != '-') {
                z = false;
                int i9 = this.b;
                long j = 0;
                i3 = 0;
                i4 = 0;
                int i10 = 0;
                z2 = false;
                int i11 = 0;
                while (true) {
                    i5 = this.b;
                    if (i5 >= i2) {
                        break;
                    }
                    char charAt4 = str.charAt(i5);
                    if (charAt4 == '0') {
                        if (i3 == 0) {
                            i10++;
                        } else {
                            i4++;
                        }
                    } else if (charAt4 >= '1' && charAt4 <= '9') {
                        int i12 = i3 + i4;
                        while (i4 > 0) {
                            if (j > 922337203685477580L) {
                                return Float.NaN;
                            }
                            j *= 10;
                            i4--;
                        }
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j = (j * 10) + (charAt4 - '0');
                        i3 = i12 + 1;
                        if (j < 0) {
                            return Float.NaN;
                        }
                    } else {
                        if (charAt4 != '.' || z2) {
                            break;
                        }
                        i11 = this.b - i9;
                        z2 = true;
                    }
                    this.b++;
                }
                if (!z2 && this.b == i11 + 1) {
                    return Float.NaN;
                }
                if (i3 == 0) {
                    if (i10 == 0) {
                        return Float.NaN;
                    }
                    i3 = 1;
                }
                if (z2) {
                    i4 = (i11 - i10) - i3;
                }
                i6 = this.b;
                if (i6 < i2 && ((charAt = str.charAt(i6)) == 'E' || charAt == 'e')) {
                    i8 = this.b + 1;
                    this.b = i8;
                    if (i8 != i2) {
                        return Float.NaN;
                    }
                    char charAt5 = str.charAt(i8);
                    if (charAt5 == '+') {
                        z3 = false;
                    } else if (charAt5 != '-') {
                        switch (charAt5) {
                            case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                            case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                            case '2':
                            case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                            case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                            case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                            case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                            case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                            case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                            case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.b--;
                                z4 = true;
                                z3 = false;
                                break;
                        }
                        if (!z4) {
                            int i13 = this.b;
                            int i14 = 0;
                            while (true) {
                                int i15 = this.b;
                                if (i15 < i2 && (charAt2 = str.charAt(i15)) >= '0' && charAt2 <= '9') {
                                    if (i14 > 922337203685477580L) {
                                        return Float.NaN;
                                    }
                                    i14 = (i14 * 10) + (charAt2 - '0');
                                    this.b++;
                                }
                            }
                            if (this.b == i13) {
                                return Float.NaN;
                            }
                            i4 = z3 ? i4 - i14 : i4 + i14;
                        }
                    } else {
                        z3 = true;
                    }
                    this.b++;
                    z4 = false;
                    if (!z4) {
                    }
                }
                i7 = i3 + i4;
                if (i7 <= 39 || i7 < -44) {
                    return Float.NaN;
                }
                float f3 = j;
                if (j != 0) {
                    if (i4 > 0) {
                        f2 = e[i4];
                    } else if (i4 < 0) {
                        if (i4 < -38) {
                            f3 = (float) (f3 * 1.0E-20d);
                            i4 += 20;
                        }
                        f2 = f[-i4];
                    }
                    f3 *= f2;
                }
                return z ? -f3 : f3;
            }
            z = true;
        }
        this.b++;
        int i92 = this.b;
        long j2 = 0;
        i3 = 0;
        i4 = 0;
        int i102 = 0;
        z2 = false;
        int i112 = 0;
        while (true) {
            i5 = this.b;
            if (i5 >= i2) {
            }
            this.b++;
        }
        if (!z2) {
        }
        if (i3 == 0) {
        }
        if (z2) {
        }
        i6 = this.b;
        if (i6 < i2) {
            i8 = this.b + 1;
            this.b = i8;
            if (i8 != i2) {
            }
        }
        i7 = i3 + i4;
        if (i7 <= 39) {
        }
        return Float.NaN;
    }

    public void m(int i) {
        if (i == 0 || i == 0 || i == 2 || i == 1 || i == 3) {
            this.b = i;
        } else {
            Locale locale = Locale.US;
            xq0.x(k5r.i(i, "Invalid environment value "));
        }
    }

    public void o(String str, String str2) {
        if (this.b <= 5) {
            Log.w(str, str2);
        }
    }

    public boolean p(int i) {
        return (this.b & i) == i;
    }

    public boolean q() {
        return !(!p(32) || p(64) || p(128)) || p(64);
    }

    @Override // defpackage.xwt
    public Object r(b7f b7fVar, float f2) {
        int i;
        int i2;
        int argb;
        float f3;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        boolean z = b7fVar.peek() == 1;
        if (z) {
            b7fVar.a();
        }
        while (b7fVar.hasNext()) {
            arrayList.add(Float.valueOf((float) b7fVar.nextDouble()));
        }
        int i5 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.b = 2;
        }
        if (z) {
            b7fVar.g();
        }
        if (this.b == -1) {
            this.b = arrayList.size() / 4;
        }
        int i6 = this.b;
        float[] fArr = new float[i6];
        int[] iArr = new int[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = this.b * 4;
            if (i7 >= i) {
                break;
            }
            int i10 = i7 / 4;
            double floatValue = ((Float) arrayList.get(i7)).floatValue();
            int i11 = i4;
            int i12 = i7 % 4;
            if (i12 == 0) {
                if (i10 > 0) {
                    float f4 = (float) floatValue;
                    if (fArr[i10 - 1] >= f4) {
                        fArr[i10] = f4 + 0.01f;
                    }
                }
                fArr[i10] = (float) floatValue;
            } else if (i12 == i3) {
                i8 = (int) (floatValue * 255.0d);
            } else if (i12 == 2) {
                i9 = (int) (floatValue * 255.0d);
            } else if (i12 == 3) {
                iArr[i10] = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, i8, i9, (int) (floatValue * 255.0d));
            }
            i7++;
            i4 = i11;
            i3 = 1;
        }
        int i13 = i4;
        aod aodVar = new aod(fArr, iArr);
        if (arrayList.size() <= i) {
            return aodVar;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i14 = i13;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i14] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i14] = ((Float) arrayList.get(i)).floatValue();
                i14++;
            }
            i++;
        }
        float[] fArr4 = aodVar.a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i15 = i13;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            while (i15 < length) {
                float f5 = i17 < fArr4.length ? fArr4[i17] : Float.NaN;
                float f6 = i18 < size ? fArr2[i18] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArr5[i15] = f5;
                    i17++;
                } else if (Float.isNaN(f5) || f6 < f5) {
                    fArr5[i15] = f6;
                    i18++;
                } else {
                    fArr5[i15] = f5;
                    i17++;
                    i18++;
                    i16++;
                }
                i15++;
            }
            fArr4 = i16 == 0 ? fArr5 : Arrays.copyOf(fArr5, length - i16);
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        int i19 = i13;
        while (i19 < length2) {
            float f7 = fArr4[i19];
            int binarySearch = Arrays.binarySearch(fArr, f7);
            int binarySearch2 = Arrays.binarySearch(fArr2, f7);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f8 = fArr3[binarySearch2];
                if (i6 >= 2 && f7 != fArr[i13]) {
                    for (int i20 = 1; i20 < i6; i20++) {
                        float f9 = fArr[i20];
                        if (f9 >= f7 || i20 == i6 - 1) {
                            if (i20 != i6 - 1 || f7 < f9) {
                                int i21 = i20 - 1;
                                float f10 = fArr[i21];
                                int D = u2x.D(iArr[i21], (f7 - f10) / (f9 - f10), iArr[i20]);
                                i2 = Color.argb((int) (f8 * 255.0f), Color.red(D), Color.green(D), Color.blue(D));
                            } else {
                                i2 = Color.argb((int) (f8 * 255.0f), Color.red(iArr[i20]), Color.green(iArr[i20]), Color.blue(iArr[i20]));
                            }
                        }
                    }
                    xq0.x("Unreachable code.");
                    return null;
                }
                i2 = iArr[i13];
                iArr2[i19] = i2;
            } else {
                int i22 = iArr[binarySearch];
                if (size >= i5 && f7 > fArr2[i13]) {
                    for (int i23 = 1; i23 < size; i23++) {
                        float f11 = fArr2[i23];
                        if (f11 >= f7 || i23 == size - 1) {
                            if (f11 <= f7) {
                                f3 = fArr3[i23];
                            } else {
                                int i24 = i23 - 1;
                                float f12 = fArr2[i24];
                                f3 = y5i.f(fArr3[i24], fArr3[i23], (f7 - f12) / (f11 - f12));
                            }
                            argb = Color.argb((int) (f3 * 255.0f), Color.red(i22), Color.green(i22), Color.blue(i22));
                        }
                    }
                    xq0.x("Unreachable code.");
                    return null;
                }
                argb = Color.argb((int) (fArr3[i13] * 255.0f), Color.red(i22), Color.green(i22), Color.blue(i22));
                iArr2[i19] = argb;
            }
            i19++;
            i5 = 2;
        }
        return new aod(fArr4, iArr2);
    }

    public /* synthetic */ jsg(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public jsg(owh owhVar) {
        this.a = 21;
        this.b = owhVar.e;
    }

    public jsg() {
        this.a = 16;
        this.b = 3;
    }

    public /* synthetic */ jsg(int i) {
        this.a = i;
    }
}
