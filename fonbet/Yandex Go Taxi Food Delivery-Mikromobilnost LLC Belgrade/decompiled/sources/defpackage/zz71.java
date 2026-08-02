package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.aa2;
import yads.ai1;
import yads.bs1;
import yads.cs1;
import yads.gz2;
import yads.hz2;
import yads.lu1;
import yads.vz2;

/* loaded from: classes7.dex */
public final class zz71 implements n771, a871 {
    public static final /* synthetic */ int w = 0;
    public int i;
    public long j;
    public int k;
    public dl81 l;
    public int n;
    public int o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final uq71 f = new uq71();
    public final ArrayList g = new ArrayList();
    public final dl81 d = new dl81(16);
    public final ArrayDeque e = new ArrayDeque();
    public final dl81 a = new dl81(sba1.a);
    public final dl81 b = new dl81(4);
    public final dl81 c = new dl81();
    public int m = -1;
    public yg71 q = yg71.x5;
    public ax71[] r = new ax71[0];

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.q = yg71Var;
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.k = 0;
                return;
            } else {
                uq71 uq71Var = this.f;
                uq71Var.a.clear();
                uq71Var.b = 0;
                this.g.clear();
                return;
            }
        }
        for (ax71 ax71Var : this.r) {
            je81 je81Var = ax71Var.b;
            int t = rf71.t(je81Var.f, j2, false);
            while (true) {
                if (t < 0) {
                    t = -1;
                    break;
                } else if ((je81Var.g[t] & 1) != 0) {
                    break;
                } else {
                    t--;
                }
            }
            if (t == -1) {
                t = je81Var.a(j2);
            }
            ax71Var.e = t;
            c371 c371Var = ax71Var.d;
            if (c371Var != null) {
                c371Var.b = false;
                c371Var.c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7 A[EDGE_INSN: B:68:0x00e7->B:69:0x00e7 BREAK  A[LOOP:1: B:28:0x006b->B:58:0x00e3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc  */
    @Override // defpackage.a871
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v171 d(long j) {
        long j2;
        long j3;
        long j4;
        int i;
        ax71[] ax71VarArr;
        int i2;
        long j5;
        int i3;
        long j6;
        int a;
        ax71[] ax71VarArr2 = this.r;
        int length = ax71VarArr2.length;
        oe71 oe71Var = oe71.c;
        if (length == 0) {
            return new v171(oe71Var, oe71Var);
        }
        int i4 = this.t;
        boolean z = false;
        int i5 = -1;
        long j7 = -1;
        if (i4 != -1) {
            je81 je81Var = ax71VarArr2[i4].b;
            long[] jArr = je81Var.f;
            long[] jArr2 = je81Var.c;
            int t = rf71.t(jArr, j, false);
            while (true) {
                if (t < 0) {
                    t = -1;
                    break;
                }
                if ((je81Var.g[t] & 1) != 0) {
                    break;
                }
                t--;
            }
            if (t == -1) {
                t = je81Var.a(j);
            }
            if (t == -1) {
                return new v171(oe71Var, oe71Var);
            }
            j3 = jArr[t];
            j2 = jArr2[t];
            if (j3 < j && t < je81Var.b - 1 && (a = je81Var.a(j)) != -1 && a != t) {
                j4 = jArr[a];
                j7 = jArr2[a];
                i = 0;
                long j8 = j2;
                while (true) {
                    ax71VarArr = this.r;
                    if (i < ax71VarArr.length) {
                        break;
                    }
                    if (i != this.t) {
                        je81 je81Var2 = ax71VarArr[i].b;
                        long[] jArr3 = je81Var2.f;
                        long[] jArr4 = je81Var2.c;
                        int[] iArr = je81Var2.g;
                        int t2 = rf71.t(jArr3, j3, z);
                        while (true) {
                            if (t2 < 0) {
                                i3 = i5;
                                break;
                            }
                            if ((iArr[t2] & 1) != 0) {
                                i3 = t2;
                                break;
                            }
                            t2--;
                        }
                        if (i3 == i5) {
                            i3 = je81Var2.a(j3);
                        }
                        if (i3 == i5) {
                            j6 = j7;
                        } else {
                            j6 = j7;
                            j8 = Math.min(jArr4[i3], j8);
                        }
                        if (j4 != -9223372036854775807L) {
                            z = false;
                            int t3 = rf71.t(jArr3, j4, false);
                            while (true) {
                                if (t3 < 0) {
                                    t3 = -1;
                                    break;
                                }
                                if ((iArr[t3] & 1) != 0) {
                                    break;
                                }
                                t3--;
                            }
                            i2 = -1;
                            if (t3 == -1) {
                                t3 = je81Var2.a(j4);
                            }
                            if (t3 != -1) {
                                j7 = Math.min(jArr4[t3], j6);
                                i++;
                                i5 = i2;
                            }
                        } else {
                            i2 = -1;
                            z = false;
                        }
                        j5 = j6;
                    } else {
                        i2 = i5;
                        j5 = j7;
                    }
                    j7 = j5;
                    i++;
                    i5 = i2;
                }
                long j9 = j7;
                oe71 oe71Var2 = new oe71(j3, j8);
                return j4 != -9223372036854775807L ? new v171(oe71Var2, oe71Var2) : new v171(oe71Var2, new oe71(j4, j9));
            }
        } else {
            j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            j3 = j;
        }
        j4 = -9223372036854775807L;
        i = 0;
        long j82 = j2;
        while (true) {
            ax71VarArr = this.r;
            if (i < ax71VarArr.length) {
            }
            i++;
            i5 = i2;
        }
        long j92 = j7;
        oe71 oe71Var22 = new oe71(j3, j82);
        if (j4 != -9223372036854775807L) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.n771
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        int i;
        int i2;
        char c;
        boolean z;
        wl81 wl81Var;
        while (true) {
            int i3 = this.h;
            ArrayDeque arrayDeque = this.e;
            dl81 dl81Var = this.c;
            int i4 = 0;
            if (i3 == 0) {
                int i5 = this.k;
                dl81 dl81Var2 = this.d;
                if (i5 == 0) {
                    if (!bb71Var.E(dl81Var2.a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    dl81Var2.m(0);
                    this.j = dl81Var2.t();
                    this.i = dl81Var2.a();
                }
                long j = this.j;
                if (j == 1) {
                    bb71Var.u(8, 8, dl81Var2.a);
                    this.k += 8;
                    this.j = dl81Var2.w();
                } else if (j == 0) {
                    long a = bb71Var.a();
                    if (a == -1 && (wl81Var = (wl81) arrayDeque.peek()) != null) {
                        a = wl81Var.c;
                    }
                    if (a != -1) {
                        this.j = (a - bb71Var.f()) + this.k;
                    }
                }
                long j2 = this.j;
                int i6 = this.k;
                if (j2 < i6) {
                    throw aa2.a("Atom size less than header length (unsupported).");
                }
                int i7 = this.i;
                if (i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1701082227 || i7 == 1835365473) {
                    long f = bb71Var.f();
                    long j3 = this.j;
                    long j4 = this.k;
                    long j5 = (f + j3) - j4;
                    if (j3 != j4 && this.i == 1835365473) {
                        dl81Var.i(8);
                        bb71Var.s(0, 8, dl81Var.a);
                        byte[] bArr = i471.a;
                        int i8 = dl81Var.b;
                        int i9 = i8 + 4;
                        dl81Var.m(i9);
                        if (dl81Var.a() != 1751411826) {
                            i8 = i9;
                        }
                        dl81Var.m(i8);
                        bb71Var.b(dl81Var.b);
                        bb71Var.c();
                    }
                    arrayDeque.push(new wl81(this.i, j5));
                    if (this.j == this.k) {
                        g(j5);
                    } else {
                        this.h = 0;
                        this.k = 0;
                    }
                } else if (i7 != 1835296868 && i7 != 1836476516 && i7 != 1751411826 && i7 != 1937011556 && i7 != 1937011827 && i7 != 1937011571 && i7 != 1668576371 && i7 != 1701606260 && i7 != 1937011555 && i7 != 1937011578 && i7 != 1937013298 && i7 != 1937007471 && i7 != 1668232756 && i7 != 1953196132 && i7 != 1718909296 && i7 != 1969517665 && i7 != 1801812339 && i7 != 1768715124) {
                    long f2 = bb71Var.f();
                    long j6 = this.k;
                    long j7 = f2 - j6;
                    if (this.i == 1836086884) {
                        new lu1(0L, j7, -9223372036854775807L, j7 + j6, this.j - j6);
                    }
                    this.l = null;
                    this.h = 1;
                } else {
                    if (i6 != 8) {
                        ny61.k();
                        return 0;
                    }
                    if (j2 > 2147483647L) {
                        ny61.k();
                        return 0;
                    }
                    dl81 dl81Var3 = new dl81((int) j2);
                    System.arraycopy(dl81Var2.a, 0, dl81Var3.a, 0, 8);
                    this.l = dl81Var3;
                    this.h = 1;
                }
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        long f3 = bb71Var.f();
                        if (this.m == -1) {
                            int i10 = -1;
                            int i11 = -1;
                            boolean z2 = true;
                            boolean z3 = true;
                            int i12 = 0;
                            long j8 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                            long j9 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                            long j10 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                            while (true) {
                                ax71[] ax71VarArr = this.r;
                                if (i12 >= ax71VarArr.length) {
                                    break;
                                }
                                ax71 ax71Var = ax71VarArr[i12];
                                int i13 = ax71Var.e;
                                je81 je81Var = ax71Var.b;
                                if (i13 != je81Var.b) {
                                    long j11 = je81Var.c[i13];
                                    long[][] jArr = this.s;
                                    int i14 = rf71.a;
                                    long j12 = jArr[i12][i13];
                                    long j13 = j11 - f3;
                                    boolean z4 = j13 < 0 || j13 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                    if ((!z4 && z3) || (z4 == z3 && j13 < j10)) {
                                        j9 = j12;
                                        z3 = z4;
                                        i11 = i12;
                                        j10 = j13;
                                    }
                                    if (j12 < j8) {
                                        j8 = j12;
                                        z2 = z4;
                                        i10 = i12;
                                    }
                                }
                                i12++;
                            }
                            if (j8 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED || !z2 || j9 < j8 + 10485760) {
                                i10 = i11;
                            }
                            this.m = i10;
                            if (i10 == -1) {
                                return -1;
                            }
                        }
                        ax71 ax71Var2 = this.r[this.m];
                        fb81 fb81Var = ax71Var2.c;
                        wl71 wl71Var = ax71Var2.a;
                        je81 je81Var2 = ax71Var2.b;
                        int i15 = ax71Var2.e;
                        long j14 = je81Var2.c[i15];
                        int i16 = je81Var2.d[i15];
                        c371 c371Var = ax71Var2.d;
                        long j15 = (j14 - f3) + this.n;
                        if (j15 < 0 || j15 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            jp61Var.a = j14;
                            return 1;
                        }
                        if (wl71Var.g == 1) {
                            j15 += 8;
                            i16 -= 8;
                        }
                        bb71Var.b((int) j15);
                        int i17 = wl71Var.j;
                        if (i17 == 0) {
                            if ("audio/ac4".equals(wl71Var.f.E)) {
                                if (this.o == 0) {
                                    xca1.b(i16, dl81Var);
                                    fb81Var.a(7, dl81Var);
                                    this.o += 7;
                                }
                                i16 += 7;
                            } else if (c371Var != null) {
                                c371Var.a(bb71Var);
                            }
                            while (true) {
                                int i18 = this.o;
                                if (i18 >= i16) {
                                    break;
                                }
                                int c2 = fb81Var.c(bb71Var, i16 - i18, false);
                                this.n += c2;
                                this.o += c2;
                                this.p -= c2;
                            }
                        } else {
                            dl81 dl81Var4 = this.b;
                            byte[] bArr2 = dl81Var4.a;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[2] = 0;
                            int i19 = 4 - i17;
                            while (this.o < i16) {
                                int i20 = this.p;
                                if (i20 == 0) {
                                    bb71Var.u(i19, i17, bArr2);
                                    this.n += i17;
                                    dl81Var4.m(0);
                                    int a2 = dl81Var4.a();
                                    if (a2 < 0) {
                                        dy31.g(null, "Invalid NAL length");
                                        return 0;
                                    }
                                    this.p = a2;
                                    dl81 dl81Var5 = this.a;
                                    dl81Var5.m(0);
                                    fb81Var.a(4, dl81Var5);
                                    this.o += 4;
                                    i16 += i19;
                                } else {
                                    int c3 = fb81Var.c(bb71Var, i20, false);
                                    this.n += c3;
                                    this.o += c3;
                                    this.p -= c3;
                                }
                            }
                        }
                        long j16 = je81Var2.f[i15];
                        int i21 = je81Var2.g[i15];
                        if (c371Var != null) {
                            c371Var.b(fb81Var, j16, i21, i16, 0, null);
                            if (i15 + 1 == je81Var2.b && c371Var.c > 0) {
                                fb81Var.b(c371Var.d, c371Var.e, c371Var.f, c371Var.g, null);
                                c371Var.c = 0;
                            }
                        } else {
                            fb81Var.b(j16, i21, i16, 0, null);
                        }
                        ax71Var2.e++;
                        this.m = -1;
                        this.n = 0;
                        this.o = 0;
                        this.p = 0;
                        return 0;
                    }
                    if (i3 != 3) {
                        ny61.k();
                        return 0;
                    }
                    uq71 uq71Var = this.f;
                    int i22 = uq71Var.b;
                    ArrayList arrayList = uq71Var.a;
                    if (i22 != 0) {
                        if (i22 != 1) {
                            short s = 2192;
                            short s2 = 2816;
                            char c4 = 2817;
                            if (i22 == 2) {
                                long a3 = bb71Var.a();
                                int i23 = uq71Var.c - 20;
                                dl81 dl81Var6 = new dl81(i23);
                                bb71Var.u(0, i23, dl81Var6.a);
                                int i24 = 0;
                                while (i24 < i23 / 12) {
                                    dl81Var6.m(dl81Var6.b + 2);
                                    byte[] bArr3 = dl81Var6.a;
                                    int i25 = dl81Var6.b;
                                    int i26 = i25 + 1;
                                    dl81Var6.b = i26;
                                    int i27 = bArr3[i25] & 255;
                                    dl81Var6.b = i25 + 2;
                                    short s3 = (short) (((bArr3[i26] & 255) << 8) | i27);
                                    if (s3 != s && s3 != s2) {
                                        if (s3 != 2817) {
                                            if (s3 != 2819 && s3 != 2820) {
                                                dl81Var6.m(i25 + 10);
                                                i24++;
                                                s = 2192;
                                                s2 = 2816;
                                            }
                                            arrayList.add(new yn71(dl81Var6.h(), (a3 - uq71Var.c) - dl81Var6.h()));
                                            i24++;
                                            s = 2192;
                                            s2 = 2816;
                                        }
                                    }
                                    arrayList.add(new yn71(dl81Var6.h(), (a3 - uq71Var.c) - dl81Var6.h()));
                                    i24++;
                                    s = 2192;
                                    s2 = 2816;
                                }
                                if (arrayList.isEmpty()) {
                                    jp61Var.a = 0L;
                                } else {
                                    uq71Var.b = 3;
                                    jp61Var.a = ((yn71) arrayList.get(0)).a;
                                }
                            } else {
                                if (i22 != 3) {
                                    ny61.k();
                                    return 0;
                                }
                                long f4 = bb71Var.f();
                                int a4 = (int) ((bb71Var.a() - bb71Var.f()) - uq71Var.c);
                                byte[] bArr4 = new byte[a4];
                                bb71Var.u(0, a4, bArr4);
                                int i28 = 0;
                                while (i28 < arrayList.size()) {
                                    yn71 yn71Var = (yn71) arrayList.get(i28);
                                    int i29 = i4;
                                    int i30 = (int) (yn71Var.a - f4);
                                    if (i30 < 0 || i30 > a4) {
                                        w511.q();
                                        return i29;
                                    }
                                    int i31 = i30 + 4;
                                    if (i31 < 0 || i31 > a4) {
                                        w511.q();
                                        return 0;
                                    }
                                    int i32 = ((bArr4[i30 + 5] & 255) << 8) | (bArr4[i31] & 255);
                                    int i33 = i30 + 7;
                                    int i34 = i32 | ((bArr4[i30 + 6] & 255) << 16);
                                    int i35 = i30 + 8;
                                    int i36 = i34 | ((bArr4[i33] & 255) << 24);
                                    Charset charset = md81.c;
                                    String str = new String(bArr4, i35, i36, charset);
                                    int i37 = i35 + i36;
                                    switch (str.hashCode()) {
                                        case -1711564334:
                                            if (str.equals("SlowMotion_Data")) {
                                                i2 = i29;
                                                break;
                                            }
                                            break;
                                        case -1332107749:
                                            if (str.equals("Super_SlowMotion_Edit_Data")) {
                                                i2 = 1;
                                                break;
                                            }
                                            break;
                                        case -1251387154:
                                            if (str.equals("Super_SlowMotion_Data")) {
                                                i2 = 2;
                                                break;
                                            }
                                            break;
                                        case -830665521:
                                            if (str.equals("Super_SlowMotion_Deflickering_On")) {
                                                i2 = 3;
                                                break;
                                            }
                                            break;
                                        case 1760745220:
                                            if (str.equals("Super_SlowMotion_BGM")) {
                                                i2 = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    i2 = -1;
                                    switch (i2) {
                                        case 0:
                                            c = 2192;
                                            break;
                                        case 1:
                                            c = 2819;
                                            break;
                                        case 2:
                                            c = 2816;
                                            break;
                                        case 3:
                                            c = 2820;
                                            break;
                                        case 4:
                                            c = c4;
                                            break;
                                        default:
                                            dy31.g(null, "Invalid SEF name");
                                            return i29;
                                    }
                                    int i38 = yn71Var.b - (i36 + 8);
                                    if (c == 2192) {
                                        ArrayList arrayList2 = new ArrayList();
                                        String str2 = new String(bArr4, i37, i38, charset);
                                        o3 o3Var = uq71.e;
                                        o3Var.getClass();
                                        sl81 sl81Var = (sl81) o3Var.c;
                                        sl81Var.getClass();
                                        wq81 wq81Var = new wq81(sl81Var, o3Var, str2);
                                        ArrayList arrayList3 = new ArrayList();
                                        while (wq81Var.hasNext()) {
                                            arrayList3.add((String) wq81Var.next());
                                        }
                                        List unmodifiableList = Collections.unmodifiableList(arrayList3);
                                        int i39 = i29;
                                        while (i39 < unmodifiableList.size()) {
                                            o3 o3Var2 = uq71.d;
                                            CharSequence charSequence = (CharSequence) unmodifiableList.get(i39);
                                            o3Var2.getClass();
                                            charSequence.getClass();
                                            sl81 sl81Var2 = (sl81) o3Var2.c;
                                            sl81Var2.getClass();
                                            wq81 wq81Var2 = new wq81(sl81Var2, o3Var2, charSequence);
                                            ArrayList arrayList4 = new ArrayList();
                                            while (wq81Var2.hasNext()) {
                                                arrayList4.add((String) wq81Var2.next());
                                            }
                                            List unmodifiableList2 = Collections.unmodifiableList(arrayList4);
                                            if (unmodifiableList2.size() != 3) {
                                                throw new aa2(null, null, true, 1);
                                            }
                                            try {
                                                arrayList2.add(new gz2(1 << (Integer.parseInt((String) unmodifiableList2.get(2)) - 1), Long.parseLong((String) unmodifiableList2.get(i29)), Long.parseLong((String) unmodifiableList2.get(1))));
                                                i39++;
                                                i29 = 0;
                                            } catch (NumberFormatException e) {
                                                dy31.g(e, null);
                                                return 0;
                                            }
                                        }
                                        this.g.add(new hz2(arrayList2));
                                    } else if (c != 2816 && c != c4 && c != 2819 && c != 2820) {
                                        ny61.k();
                                        return i29;
                                    }
                                    i28++;
                                    c4 = 2817;
                                    i4 = 0;
                                }
                                jp61Var.a = 0L;
                            }
                        } else {
                            dl81 dl81Var7 = new dl81(8);
                            bb71Var.u(0, 8, dl81Var7.a);
                            uq71Var.c = dl81Var7.h() + 8;
                            if (dl81Var7.a() != 1397048916) {
                                jp61Var.a = 0L;
                            } else {
                                jp61Var.a = bb71Var.f() - (uq71Var.c - 12);
                                uq71Var.b = 2;
                            }
                        }
                        i = 1;
                    } else {
                        long a5 = bb71Var.a();
                        jp61Var.a = (a5 == -1 || a5 < 8) ? 0L : a5 - 8;
                        i = 1;
                        uq71Var.b = 1;
                    }
                    if (jp61Var.a != 0) {
                        return i;
                    }
                    this.h = 0;
                    this.k = 0;
                    return i;
                }
                long j17 = this.j - this.k;
                long f5 = bb71Var.f() + j17;
                dl81 dl81Var8 = this.l;
                if (dl81Var8 != null) {
                    bb71Var.u(this.k, (int) j17, dl81Var8.a);
                    if (this.i == 1718909296) {
                        dl81Var8.m(8);
                        int a6 = dl81Var8.a();
                        int i40 = a6 != 1751476579 ? a6 != 1903435808 ? 0 : 1 : 2;
                        if (i40 == 0) {
                            dl81Var8.m(dl81Var8.b + 4);
                            while (true) {
                                if (dl81Var8.c - dl81Var8.b <= 0) {
                                    i40 = 0;
                                    break;
                                }
                                int a7 = dl81Var8.a();
                                i40 = a7 != 1751476579 ? a7 != 1903435808 ? 0 : 1 : 2;
                                if (i40 != 0) {
                                    break;
                                }
                            }
                        }
                        this.v = i40;
                    } else if (!arrayDeque.isEmpty()) {
                        ((wl81) arrayDeque.peek()).d.add(new hp81(this.i, dl81Var8));
                    }
                } else if (j17 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    bb71Var.b((int) j17);
                } else {
                    jp61Var.a = bb71Var.f() + j17;
                    z = true;
                    g(f5);
                    if (z && this.h != 2) {
                        return 1;
                    }
                }
                z = false;
                g(f5);
                if (z) {
                    return 1;
                }
                continue;
            }
        }
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        return wfa1.c(bb71Var, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0205, code lost:
    
        if (r9 != 1885823344) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0207, code lost:
    
        r1 = defpackage.kca1.b(r9, "ITUNESGAPLESS", r8, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0212, code lost:
    
        if (r9 != 1936683886) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0214, code lost:
    
        r1 = defpackage.kca1.d(r9, "TVSHOWSORT", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021e, code lost:
    
        if (r9 != 1953919848) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0220, code lost:
    
        r1 = defpackage.kca1.d(r9, "TVSHOW", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022b, code lost:
    
        if (r9 != 757935405) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022d, code lost:
    
        r9 = defpackage.kca1.e(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d6, code lost:
    
        defpackage.ay4.a(r9);
        r1 = defpackage.nba1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02db, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02dc, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02dd, code lost:
    
        r8.m(r10);
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00f2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0306, code lost:
    
        r8.m(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0309, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00d6, code lost:
    
        r8.m(r8.b + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00e4, code lost:
    
        if (r8.a() != 1684108385) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00e6, code lost:
    
        r8.m(r8.b + 8);
        r1 = r8.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00f9, code lost:
    
        if (r1 <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00fb, code lost:
    
        r9 = defpackage.kca1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00ff, code lost:
    
        if (r1 > 192) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0101, code lost:
    
        r1 = r9[r1 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0107, code lost:
    
        if (r1 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0109, code lost:
    
        r9 = new yads.c43("TCON", null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0116, code lost:
    
        defpackage.nba1.e();
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0106, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00f5, code lost:
    
        defpackage.nba1.e();
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00ca, code lost:
    
        r31 = r4;
        r32 = r15;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0233, code lost:
    
        r1 = r9 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0238, code lost:
    
        if (r1 != 6516084) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x023a, code lost:
    
        r1 = r8.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0245, code lost:
    
        if (r8.a() != 1684108385) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0247, code lost:
    
        r8.m(r8.b + 8);
        r1 = r8.g(r1 - 16);
        r9 = new yads.bx("und", r1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x025e, code lost:
    
        defpackage.ay4.a(r9);
        defpackage.nba1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0269, code lost:
    
        if (r1 == 7233901) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x026e, code lost:
    
        if (r1 != 7631467) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0275, code lost:
    
        if (r1 == 6516589) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x027a, code lost:
    
        if (r1 != 7828084) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0280, code lost:
    
        if (r1 != 6578553) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0282, code lost:
    
        r1 = defpackage.kca1.d(r9, "TDRC", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x028d, code lost:
    
        if (r1 != 4280916) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x028f, code lost:
    
        r1 = defpackage.kca1.d(r9, "TPE1", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x029a, code lost:
    
        if (r1 != 7630703) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x029c, code lost:
    
        r1 = defpackage.kca1.d(r9, "TSSE", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02a7, code lost:
    
        if (r1 != 6384738) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02a9, code lost:
    
        r1 = defpackage.kca1.d(r9, "TALB", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02b4, code lost:
    
        if (r1 != 7108978) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02b6, code lost:
    
        r1 = defpackage.kca1.d(r9, "USLT", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02c1, code lost:
    
        if (r1 != 6776174) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02c3, code lost:
    
        r1 = defpackage.kca1.d(r9, "TCON", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02cc, code lost:
    
        if (r1 != 6779504) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02ce, code lost:
    
        r1 = defpackage.kca1.d(r9, "TIT1", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02e5, code lost:
    
        r1 = defpackage.kca1.d(r9, "TCOM", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02ed, code lost:
    
        r1 = defpackage.kca1.d(r9, "TIT2", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x030a, code lost:
    
        r29 = r1;
        r32 = r15;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0313, code lost:
    
        if (r3.isEmpty() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0316, code lost:
    
        r14 = new yads.cs1(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        r8.m(r4);
        r4 = r4 + r9;
        r8.m(r8.b + 8);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        r9 = r8.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r9 >= r4) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        r10 = r8.a() + r9;
        r9 = r8.a();
        r14 = (r9 >> 24) & 255;
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r14 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r14 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r9 != 1735291493) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0122, code lost:
    
        if (r9 != 1684632427) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0124, code lost:
    
        r1 = defpackage.kca1.a(r9, "TPOS", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012a, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
    
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        r32 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02f5, code lost:
    
        r8.m(r10);
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02f9, code lost:
    
        if (r14 == null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02fb, code lost:
    
        r3.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02fe, code lost:
    
        r1 = r29;
        r4 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
    
        if (r9 != 1953655662) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        r1 = defpackage.kca1.a(r9, "TRCK", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
    
        if (r9 != 1953329263) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013d, code lost:
    
        r31 = r4;
        r1 = defpackage.kca1.b(r9, "TBPM", r8, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0147, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
    
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014f, code lost:
    
        if (r9 != 1668311404) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0151, code lost:
    
        r1 = defpackage.kca1.b(r9, "TCMP", r8, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015b, code lost:
    
        if (r9 != 1668249202) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
    
        r1 = r8.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0168, code lost:
    
        if (r8.a() != 1684108385) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016a, code lost:
    
        r4 = r8.a() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        if (r4 != 13) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
    
        r14 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017f, code lost:
    
        if (r14 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0181, code lost:
    
        defpackage.nba1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011b, code lost:
    
        r32 = r15;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0185, code lost:
    
        r8.m(r8.b + 4);
        r1 = r1 - 16;
        r4 = new byte[r1];
        r8.d(0, r1, r4);
        r32 = r15;
        r1 = new yads.ke(r14, null, 3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019d, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0179, code lost:
    
        if (r4 != 14) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
    
        r14 = "image/png";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a0, code lost:
    
        r32 = r15;
        r15 = null;
        defpackage.nba1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a6, code lost:
    
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a9, code lost:
    
        r32 = r15;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01af, code lost:
    
        if (r9 != 1631670868) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b1, code lost:
    
        r1 = defpackage.kca1.d(r9, "TPE2", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bb, code lost:
    
        if (r9 != 1936682605) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bd, code lost:
    
        r1 = defpackage.kca1.d(r9, "TSOT", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c7, code lost:
    
        if (r9 != 1936679276) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c9, code lost:
    
        r1 = defpackage.kca1.d(r9, "TSO2", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d3, code lost:
    
        if (r9 != 1936679282) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d5, code lost:
    
        r1 = defpackage.kca1.d(r9, "TSOA", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01df, code lost:
    
        if (r9 != 1936679265) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e1, code lost:
    
        r1 = defpackage.kca1.d(r9, "TSOP", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01eb, code lost:
    
        if (r9 != 1936679791) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ed, code lost:
    
        r1 = defpackage.kca1.d(r9, "TSOC", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f7, code lost:
    
        if (r9 != 1920233063) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f9, code lost:
    
        r1 = defpackage.kca1.b(r9, "ITUNESADVISORY", r8, false, false);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:260:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0619 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x062e A[EDGE_INSN: B:334:0x062e->B:335:0x062e BREAK  A[LOOP:8: B:258:0x0508->B:264:0x0624], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x064e A[LOOP:11: B:336:0x064b->B:338:0x064e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x066b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j) {
        ArrayDeque arrayDeque;
        int i;
        int i2;
        cs1 cs1Var;
        cs1 cs1Var2;
        cs1 cs1Var3;
        wl81 wl81Var;
        co71 co71Var;
        cs1 cs1Var4;
        ArrayList e;
        int size;
        int i3;
        long j2;
        ax71[] ax71VarArr;
        int i4;
        int i5;
        ArrayList arrayList;
        int i6;
        int i7;
        cs1 cs1Var5;
        int i8;
        int i9;
        int i10;
        cs1 cs1Var6;
        wl81 wl81Var2;
        int i11;
        co71 co71Var2;
        ai1 ai1Var;
        ArrayDeque arrayDeque2;
        int i12;
        cs1 cs1Var7;
        ArrayDeque arrayDeque3 = this.e;
        while (!arrayDeque3.isEmpty() && ((wl81) arrayDeque3.peek()).c == j) {
            wl81 wl81Var3 = (wl81) arrayDeque3.pop();
            if (wl81Var3.b == 1836019574) {
                ArrayList arrayList2 = this.g;
                ArrayList arrayList3 = new ArrayList();
                boolean z = this.v == 1;
                co71 co71Var3 = new co71();
                hp81 k = wl81Var3.k(1969517665);
                int i13 = 1751411826;
                int i14 = 1835365473;
                int i15 = 12;
                int i16 = 8;
                if (k != null) {
                    byte[] bArr = i471.a;
                    dl81 dl81Var = k.c;
                    dl81Var.m(8);
                    cs1 cs1Var8 = null;
                    cs1 cs1Var9 = null;
                    while (true) {
                        int i17 = dl81Var.c;
                        int i18 = dl81Var.b;
                        if (i17 - i18 < i16) {
                            break;
                        }
                        int a = dl81Var.a();
                        int i19 = i16;
                        int a2 = dl81Var.a();
                        if (a2 == i14) {
                            dl81Var.m(i18);
                            int i20 = i18 + a;
                            dl81Var.m(dl81Var.b + 8);
                            int i21 = dl81Var.b;
                            int i22 = i21 + 4;
                            dl81Var.m(i22);
                            if (dl81Var.a() != i13) {
                                i21 = i22;
                            }
                            dl81Var.m(i21);
                            while (true) {
                                int i23 = dl81Var.b;
                                if (i23 >= i20) {
                                    arrayDeque2 = arrayDeque3;
                                    i12 = a;
                                    cs1Var7 = null;
                                    break;
                                } else {
                                    int a3 = dl81Var.a();
                                    if (dl81Var.a() == 1768715124) {
                                        break;
                                    }
                                    dl81Var.m(i23 + a3);
                                    a = a;
                                }
                            }
                            cs1Var8 = cs1Var7;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            i12 = a;
                            if (a2 == 1936553057) {
                                dl81Var.m(i18);
                                int i24 = i18 + i12;
                                dl81Var.m(dl81Var.b + 12);
                                while (true) {
                                    int i25 = dl81Var.b;
                                    if (i25 >= i24) {
                                        break;
                                    }
                                    int a4 = dl81Var.a();
                                    if (dl81Var.a() != 1935766900) {
                                        dl81Var.m(i25 + a4);
                                        i15 = 12;
                                    } else if (a4 >= 14) {
                                        dl81Var.m(dl81Var.b + 5);
                                        int s = dl81Var.s();
                                        int i26 = i15;
                                        if (s == i26 || s == 13) {
                                            float f = s == i26 ? 240.0f : 120.0f;
                                            dl81Var.m(dl81Var.b + 1);
                                            cs1Var9 = new cs1(new vz2(dl81Var.s(), f));
                                        }
                                    }
                                }
                                cs1Var9 = null;
                            }
                        }
                        dl81Var.m(i18 + i12);
                        i16 = i19;
                        arrayDeque3 = arrayDeque2;
                        i14 = 1835365473;
                        i13 = 1751411826;
                        i15 = 12;
                    }
                    arrayDeque = arrayDeque3;
                    i = i16;
                    Pair create = Pair.create(cs1Var8, cs1Var9);
                    cs1 cs1Var10 = (cs1) create.first;
                    cs1 cs1Var11 = (cs1) create.second;
                    if (cs1Var10 != null) {
                        co71Var3.a(cs1Var10);
                    }
                    cs1Var2 = cs1Var11;
                    cs1Var = cs1Var10;
                    i2 = 1835365473;
                } else {
                    arrayDeque = arrayDeque3;
                    i = 8;
                    i2 = 1835365473;
                    cs1Var = null;
                    cs1Var2 = null;
                }
                wl81 j3 = wl81Var3.j(i2);
                if (j3 != null) {
                    byte[] bArr2 = i471.a;
                    hp81 k2 = j3.k(1751411826);
                    hp81 k3 = j3.k(1801812339);
                    hp81 k4 = j3.k(1768715124);
                    if (k2 != null && k3 != null && k4 != null) {
                        dl81 dl81Var2 = k2.c;
                        dl81Var2.m(16);
                        if (dl81Var2.a() == 1835299937) {
                            dl81 dl81Var3 = k3.c;
                            dl81Var3.m(12);
                            int a5 = dl81Var3.a();
                            String[] strArr = new String[a5];
                            for (int i27 = 0; i27 < a5; i27++) {
                                int a6 = dl81Var3.a();
                                dl81Var3.m(dl81Var3.b + 4);
                                strArr[i27] = dl81Var3.b(a6 - 8, md81.c);
                            }
                            dl81 dl81Var4 = k4.c;
                            int i28 = i;
                            dl81Var4.m(i28);
                            ArrayList arrayList4 = new ArrayList();
                            while (true) {
                                int i29 = dl81Var4.c;
                                int i30 = dl81Var4.b;
                                if (i29 - i30 <= i28) {
                                    break;
                                }
                                int a7 = dl81Var4.a();
                                int a8 = dl81Var4.a() - 1;
                                if (a8 < 0 || a8 >= a5) {
                                    cs1Var6 = cs1Var;
                                    wl81Var2 = wl81Var3;
                                    i11 = a5;
                                    co71Var2 = co71Var3;
                                    nba1.e();
                                } else {
                                    String str = strArr[a8];
                                    int i31 = i30 + a7;
                                    cs1Var6 = cs1Var;
                                    while (true) {
                                        int i32 = dl81Var4.b;
                                        if (i32 >= i31) {
                                            wl81Var2 = wl81Var3;
                                            i11 = a5;
                                            co71Var2 = co71Var3;
                                            ai1Var = null;
                                            break;
                                        }
                                        int a9 = dl81Var4.a();
                                        wl81Var2 = wl81Var3;
                                        if (dl81Var4.a() == 1684108385) {
                                            int a10 = dl81Var4.a();
                                            int a11 = dl81Var4.a();
                                            int i33 = a9 - 16;
                                            i11 = a5;
                                            byte[] bArr3 = new byte[i33];
                                            co71Var2 = co71Var3;
                                            dl81Var4.d(0, i33, bArr3);
                                            ai1Var = new ai1(a11, a10, str, bArr3);
                                            break;
                                        }
                                        dl81Var4.m(i32 + a9);
                                        wl81Var3 = wl81Var2;
                                    }
                                    if (ai1Var != null) {
                                        arrayList4.add(ai1Var);
                                    }
                                }
                                dl81Var4.m(i30 + a7);
                                cs1Var = cs1Var6;
                                wl81Var3 = wl81Var2;
                                a5 = i11;
                                co71Var3 = co71Var2;
                                i28 = 8;
                            }
                            cs1Var3 = cs1Var;
                            wl81Var = wl81Var3;
                            co71Var = co71Var3;
                            if (!arrayList4.isEmpty()) {
                                cs1Var4 = new cs1(arrayList4);
                                co71 co71Var4 = co71Var;
                                e = i471.e(wl81Var, co71Var4, -9223372036854775807L, null, false, z, new su71(4));
                                size = e.size();
                                i3 = 0;
                                long j4 = -9223372036854775807L;
                                int i34 = -1;
                                while (true) {
                                    j2 = 0;
                                    if (i3 >= size) {
                                        break;
                                    }
                                    je81 je81Var = (je81) e.get(i3);
                                    if (je81Var.b == 0) {
                                        cs1Var5 = cs1Var4;
                                        arrayList = e;
                                        i6 = size;
                                    } else {
                                        wl71 wl71Var = je81Var.a;
                                        long j5 = wl71Var.e;
                                        arrayList = e;
                                        qd81 qd81Var = wl71Var.f;
                                        i6 = size;
                                        int i35 = wl71Var.b;
                                        if (j5 == -9223372036854775807L) {
                                            j5 = je81Var.h;
                                        }
                                        long max = Math.max(j4, j5);
                                        ax71 ax71Var = new ax71(wl71Var, je81Var, this.q.l(i3, i35));
                                        boolean equals = "audio/true-hd".equals(qd81Var.E);
                                        int i36 = je81Var.e;
                                        int i37 = equals ? i36 * 16 : i36 + 30;
                                        da81 da81Var = new da81(qd81Var);
                                        da81Var.l = i37;
                                        if (i35 != 2 || j5 <= 0) {
                                            i7 = 1;
                                        } else {
                                            int i38 = je81Var.b;
                                            i7 = 1;
                                            if (i38 > 1) {
                                                da81Var.r = i38 / (j5 / 1000000.0f);
                                            }
                                        }
                                        if (i35 == i7 && (i9 = co71Var4.a) != -1 && (i10 = co71Var4.b) != -1) {
                                            da81Var.A = i9;
                                            da81Var.B = i10;
                                        }
                                        cs1[] cs1VarArr = {cs1Var2, arrayList2.isEmpty() ? null : new cs1(arrayList2)};
                                        cs1 cs1Var12 = new cs1(new bs1[0]);
                                        if (i35 == 1) {
                                            if (cs1Var3 != null) {
                                                cs1Var5 = cs1Var4;
                                                cs1Var12 = cs1Var3;
                                                for (i8 = 0; i8 < 2; i8++) {
                                                    cs1 cs1Var13 = cs1VarArr[i8];
                                                    if (cs1Var13 != null) {
                                                        bs1[] bs1VarArr = cs1Var13.b;
                                                        if (bs1VarArr.length != 0) {
                                                            cs1Var12 = new cs1((bs1[]) rf71.r(cs1Var12.b, bs1VarArr));
                                                        }
                                                    }
                                                }
                                                if (cs1Var12.b.length > 0) {
                                                    da81Var.i = cs1Var12;
                                                }
                                                ax71Var.c.k(new qd81(da81Var));
                                                if (i35 == 2 && i34 == -1) {
                                                    i34 = arrayList3.size();
                                                }
                                                arrayList3.add(ax71Var);
                                                j4 = max;
                                            }
                                            cs1Var5 = cs1Var4;
                                            while (i8 < 2) {
                                            }
                                            if (cs1Var12.b.length > 0) {
                                            }
                                            ax71Var.c.k(new qd81(da81Var));
                                            if (i35 == 2) {
                                                i34 = arrayList3.size();
                                            }
                                            arrayList3.add(ax71Var);
                                            j4 = max;
                                        } else {
                                            if (i35 == 2 && cs1Var4 != null) {
                                                int i39 = 0;
                                                while (true) {
                                                    bs1[] bs1VarArr2 = cs1Var4.b;
                                                    if (i39 >= bs1VarArr2.length) {
                                                        break;
                                                    }
                                                    bs1 bs1Var = bs1VarArr2[i39];
                                                    if (bs1Var instanceof ai1) {
                                                        ai1 ai1Var2 = (ai1) bs1Var;
                                                        cs1Var5 = cs1Var4;
                                                        if ("com.android.capture.fps".equals(ai1Var2.b)) {
                                                            cs1Var12 = new cs1(ai1Var2);
                                                            break;
                                                        }
                                                    } else {
                                                        cs1Var5 = cs1Var4;
                                                    }
                                                    i39++;
                                                    cs1Var4 = cs1Var5;
                                                }
                                                while (i8 < 2) {
                                                }
                                                if (cs1Var12.b.length > 0) {
                                                }
                                                ax71Var.c.k(new qd81(da81Var));
                                                if (i35 == 2) {
                                                }
                                                arrayList3.add(ax71Var);
                                                j4 = max;
                                            }
                                            cs1Var5 = cs1Var4;
                                            while (i8 < 2) {
                                            }
                                            if (cs1Var12.b.length > 0) {
                                            }
                                            ax71Var.c.k(new qd81(da81Var));
                                            if (i35 == 2) {
                                            }
                                            arrayList3.add(ax71Var);
                                            j4 = max;
                                        }
                                    }
                                    i3++;
                                    e = arrayList;
                                    size = i6;
                                    cs1Var4 = cs1Var5;
                                }
                                this.t = i34;
                                this.u = j4;
                                ax71VarArr = (ax71[]) arrayList3.toArray(new ax71[0]);
                                this.r = ax71VarArr;
                                long[][] jArr = new long[ax71VarArr.length][];
                                int[] iArr = new int[ax71VarArr.length];
                                long[] jArr2 = new long[ax71VarArr.length];
                                boolean[] zArr = new boolean[ax71VarArr.length];
                                for (i4 = 0; i4 < ax71VarArr.length; i4++) {
                                    jArr[i4] = new long[ax71VarArr[i4].b.b];
                                    jArr2[i4] = ax71VarArr[i4].b.f[0];
                                }
                                i5 = 0;
                                while (i5 < ax71VarArr.length) {
                                    long j6 = Long.MAX_VALUE;
                                    int i40 = -1;
                                    for (int i41 = 0; i41 < ax71VarArr.length; i41++) {
                                        if (!zArr[i41]) {
                                            long j7 = jArr2[i41];
                                            if (j7 <= j6) {
                                                i40 = i41;
                                                j6 = j7;
                                            }
                                        }
                                    }
                                    int i42 = iArr[i40];
                                    long[] jArr3 = jArr[i40];
                                    jArr3[i42] = j2;
                                    je81 je81Var2 = ax71VarArr[i40].b;
                                    j2 += je81Var2.d[i42];
                                    int i43 = i42 + 1;
                                    iArr[i40] = i43;
                                    if (i43 < jArr3.length) {
                                        jArr2[i40] = je81Var2.f[i43];
                                    } else {
                                        zArr[i40] = true;
                                        i5++;
                                    }
                                }
                                this.s = jArr;
                                this.q.mo495a();
                                this.q.r(this);
                                arrayDeque.clear();
                                this.h = 2;
                            }
                            cs1Var4 = null;
                            co71 co71Var42 = co71Var;
                            e = i471.e(wl81Var, co71Var42, -9223372036854775807L, null, false, z, new su71(4));
                            size = e.size();
                            i3 = 0;
                            long j42 = -9223372036854775807L;
                            int i342 = -1;
                            while (true) {
                                j2 = 0;
                                if (i3 >= size) {
                                }
                                i3++;
                                e = arrayList;
                                size = i6;
                                cs1Var4 = cs1Var5;
                            }
                            this.t = i342;
                            this.u = j42;
                            ax71VarArr = (ax71[]) arrayList3.toArray(new ax71[0]);
                            this.r = ax71VarArr;
                            long[][] jArr4 = new long[ax71VarArr.length][];
                            int[] iArr2 = new int[ax71VarArr.length];
                            long[] jArr22 = new long[ax71VarArr.length];
                            boolean[] zArr2 = new boolean[ax71VarArr.length];
                            while (i4 < ax71VarArr.length) {
                            }
                            i5 = 0;
                            while (i5 < ax71VarArr.length) {
                            }
                            this.s = jArr4;
                            this.q.mo495a();
                            this.q.r(this);
                            arrayDeque.clear();
                            this.h = 2;
                        }
                    }
                }
                cs1Var3 = cs1Var;
                wl81Var = wl81Var3;
                co71Var = co71Var3;
                cs1Var4 = null;
                co71 co71Var422 = co71Var;
                e = i471.e(wl81Var, co71Var422, -9223372036854775807L, null, false, z, new su71(4));
                size = e.size();
                i3 = 0;
                long j422 = -9223372036854775807L;
                int i3422 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                    }
                    i3++;
                    e = arrayList;
                    size = i6;
                    cs1Var4 = cs1Var5;
                }
                this.t = i3422;
                this.u = j422;
                ax71VarArr = (ax71[]) arrayList3.toArray(new ax71[0]);
                this.r = ax71VarArr;
                long[][] jArr42 = new long[ax71VarArr.length][];
                int[] iArr22 = new int[ax71VarArr.length];
                long[] jArr222 = new long[ax71VarArr.length];
                boolean[] zArr22 = new boolean[ax71VarArr.length];
                while (i4 < ax71VarArr.length) {
                }
                i5 = 0;
                while (i5 < ax71VarArr.length) {
                }
                this.s = jArr42;
                this.q.mo495a();
                this.q.r(this);
                arrayDeque.clear();
                this.h = 2;
            } else {
                arrayDeque = arrayDeque3;
                if (!arrayDeque.isEmpty()) {
                    ((wl81) arrayDeque.peek()).e.add(wl81Var3);
                }
            }
            arrayDeque3 = arrayDeque;
        }
        if (this.h != 2) {
            this.h = 0;
            this.k = 0;
        }
    }

    @Override // defpackage.a871
    public final boolean b() {
        return true;
    }

    @Override // defpackage.a871
    public final long c() {
        return this.u;
    }
}
