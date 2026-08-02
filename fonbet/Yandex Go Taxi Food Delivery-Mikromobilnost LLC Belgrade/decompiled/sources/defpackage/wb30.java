package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public final class wb30 implements b5p, f7q0 {
    public static final /* synthetic */ int G = 0;
    public vb30[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public va30 F;
    public final o2v0 a;
    public final int b;
    public final ef90 c;
    public final ef90 d;
    public final ef90 e;
    public final ef90 f;
    public final ArrayDeque g;
    public final r7q0 h;
    public final ArrayList i;
    public ImmutableList j;
    public int k;
    public int l;
    public long m;
    public int n;
    public ef90 o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public long w;
    public boolean x;
    public long y;
    public d5p z;

    public wb30(int i, o2v0 o2v0Var) {
        this.a = o2v0Var;
        this.b = i;
        this.j = ImmutableList.p();
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new r7q0();
        this.i = new ArrayList();
        this.f = new ef90(16);
        this.g = new ArrayDeque();
        this.c = new ef90(l150.a);
        this.d = new ef90(6);
        this.e = new ef90();
        this.p = -1;
        this.z = d5p.f2;
        this.A = new vb30[0];
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j == 0) {
            if (this.k != 3) {
                this.k = 0;
                this.n = 0;
                return;
            } else {
                r7q0 r7q0Var = this.h;
                r7q0Var.a.clear();
                r7q0Var.b = 0;
                this.i.clear();
                return;
            }
        }
        for (vb30 vb30Var : this.A) {
            k001 k001Var = vb30Var.b;
            int e = tw21.e(k001Var.f, j2, false);
            while (true) {
                if (e < 0) {
                    e = -1;
                    break;
                } else if ((k001Var.g[e] & 1) != 0) {
                    break;
                } else {
                    e--;
                }
            }
            if (e == -1) {
                e = k001Var.a(j2);
            }
            vb30Var.e = e;
            vf11 vf11Var = vb30Var.d;
            if (vf11Var != null) {
                vf11Var.b = false;
                vf11Var.c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4 A[EDGE_INSN: B:70:0x00e4->B:71:0x00e4 BREAK  A[LOOP:1: B:29:0x006b->B:58:0x00e0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    @Override // defpackage.f7q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e7q0 b(long j) {
        long j2;
        long j3;
        long j4;
        int i;
        vb30[] vb30VarArr;
        int i2;
        int i3;
        long j5;
        int a;
        vb30[] vb30VarArr2 = this.A;
        int length = vb30VarArr2.length;
        h7q0 h7q0Var = h7q0.c;
        if (length == 0) {
            return new e7q0(h7q0Var, h7q0Var);
        }
        int i4 = this.C;
        boolean z = false;
        int i5 = -1;
        long j6 = -1;
        if (i4 != -1) {
            k001 k001Var = vb30VarArr2[i4].b;
            long[] jArr = k001Var.f;
            int e = tw21.e(jArr, j, false);
            while (true) {
                if (e < 0) {
                    e = -1;
                    break;
                }
                if ((k001Var.g[e] & 1) != 0) {
                    break;
                }
                e--;
            }
            if (e == -1) {
                e = k001Var.a(j);
            }
            long[] jArr2 = k001Var.c;
            if (e == -1) {
                return new e7q0(h7q0Var, h7q0Var);
            }
            j3 = jArr[e];
            j2 = jArr2[e];
            if (j3 < j && e < k001Var.b - 1 && (a = k001Var.a(j)) != -1 && a != e) {
                j4 = jArr[a];
                j6 = jArr2[a];
                i = 0;
                long j7 = j2;
                while (true) {
                    vb30VarArr = this.A;
                    if (i < vb30VarArr.length) {
                        break;
                    }
                    if (i != this.C) {
                        k001 k001Var2 = vb30VarArr[i].b;
                        long[] jArr3 = k001Var2.c;
                        int[] iArr = k001Var2.g;
                        long[] jArr4 = k001Var2.f;
                        int e2 = tw21.e(jArr4, j3, z);
                        while (true) {
                            if (e2 < 0) {
                                i3 = i5;
                                break;
                            }
                            if ((iArr[e2] & 1) != 0) {
                                i3 = e2;
                                break;
                            }
                            e2--;
                        }
                        if (i3 == i5) {
                            i3 = k001Var2.a(j3);
                        }
                        if (i3 == i5) {
                            j5 = j6;
                        } else {
                            j5 = j6;
                            j7 = Math.min(jArr3[i3], j7);
                        }
                        if (j4 != -9223372036854775807L) {
                            z = false;
                            int e3 = tw21.e(jArr4, j4, false);
                            while (true) {
                                if (e3 < 0) {
                                    e3 = -1;
                                    break;
                                }
                                if ((iArr[e3] & 1) != 0) {
                                    break;
                                }
                                e3--;
                            }
                            i2 = -1;
                            if (e3 == -1) {
                                e3 = k001Var2.a(j4);
                            }
                            j6 = e3 == -1 ? j5 : Math.min(jArr3[e3], j5);
                        } else {
                            j6 = j5;
                            z = false;
                            i2 = -1;
                        }
                    } else {
                        i2 = i5;
                    }
                    i++;
                    i5 = i2;
                }
                h7q0 h7q0Var2 = new h7q0(j3, j7);
                return j4 != -9223372036854775807L ? new e7q0(h7q0Var2, h7q0Var2) : new e7q0(h7q0Var2, new h7q0(j4, j6));
            }
        } else {
            j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            j3 = j;
        }
        j4 = -9223372036854775807L;
        i = 0;
        long j72 = j2;
        while (true) {
            vb30VarArr = this.A;
            if (i < vb30VarArr.length) {
            }
            i++;
            i5 = i2;
        }
        h7q0 h7q0Var22 = new h7q0(j3, j72);
        if (j4 != -9223372036854775807L) {
        }
    }

    @Override // defpackage.f7q0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.b5p
    public final List d() {
        return this.j;
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        if ((this.b & 16) == 0) {
            d5pVar = new kzo(d5pVar, this.a);
        }
        this.z = d5pVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x050a  */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        ef90 ef90Var;
        int i5;
        char c3;
        boolean z;
        int i6;
        boolean z2;
        tb30 tb30Var;
        while (true) {
            int i7 = this.k;
            ArrayDeque arrayDeque = this.g;
            int i8 = this.b;
            ef90 ef90Var2 = this.e;
            int i9 = 4;
            int i10 = 0;
            char c4 = 2;
            if (i7 == 0) {
                int i11 = this.n;
                ef90 ef90Var3 = this.f;
                if (i11 == 0) {
                    if (!c5pVar.y(ef90Var3.a, 0, 8, true)) {
                        if (this.E != 2 || (i8 & 2) == 0) {
                            return -1;
                        }
                        g001 B = this.z.B(0, 4);
                        va30 va30Var = this.F;
                        w820 w820Var = va30Var == null ? null : new w820(va30Var);
                        f7s f7sVar = new f7s();
                        f7sVar.k = w820Var;
                        smw0.u(f7sVar, B);
                        this.z.A();
                        this.z.w(new qb4(-9223372036854775807L));
                        return -1;
                    }
                    this.n = 8;
                    ef90Var3.K(0);
                    this.m = ef90Var3.A();
                    this.l = ef90Var3.k();
                }
                long j2 = this.m;
                if (j2 == 1) {
                    c5pVar.readFully(ef90Var3.a, 8, 8);
                    this.n += 8;
                    this.m = ef90Var3.D();
                } else if (j2 == 0) {
                    long length = c5pVar.getLength();
                    if (length == -1 && (tb30Var = (tb30) arrayDeque.peek()) != null) {
                        length = tb30Var.c;
                    }
                    if (length != -1) {
                        this.m = (length - c5pVar.getPosition()) + this.n;
                    }
                }
                long j3 = this.m;
                int i12 = this.n;
                if (j3 < i12) {
                    throw ParserException.c("Atom size less than header length (unsupported).");
                }
                int i13 = this.l;
                if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1701082227 || i13 == 1835365473 || i13 == 1635284069) {
                    long position = c5pVar.getPosition();
                    long j4 = this.m;
                    long j5 = this.n;
                    long j6 = (position + j4) - j5;
                    if (j4 != j5 && this.l == 1835365473) {
                        ef90Var2.H(8);
                        c5pVar.g(0, 8, ef90Var2.a);
                        byte[] bArr = aj6.a;
                        int i14 = ef90Var2.b;
                        ef90Var2.L(4);
                        if (ef90Var2.k() != 1751411826) {
                            i14 += 4;
                        }
                        ef90Var2.K(i14);
                        c5pVar.O(ef90Var2.b);
                        c5pVar.J();
                    }
                    arrayDeque.push(new tb30(this.l, j6));
                    if (this.m == this.n) {
                        l(j6);
                    } else {
                        this.k = 0;
                        this.n = 0;
                    }
                } else if (i13 == 1835296868 || i13 == 1836476516 || i13 == 1751411826 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1937011571 || i13 == 1668576371 || i13 == 1701606260 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1953196132 || i13 == 1718909296 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124) {
                    d6z.x(i12 == 8);
                    d6z.x(this.m <= 2147483647L);
                    ef90 ef90Var4 = new ef90((int) this.m);
                    System.arraycopy(ef90Var3.a, 0, ef90Var4.a, 0, 8);
                    this.o = ef90Var4;
                    this.k = 1;
                } else {
                    long position2 = c5pVar.getPosition();
                    long j7 = this.n;
                    long j8 = position2 - j7;
                    if (this.l == 1836086884) {
                        this.F = new va30(0L, j8, -9223372036854775807L, j8 + j7, this.m - j7);
                    }
                    this.o = null;
                    this.k = 1;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            ny61.k();
                            return 0;
                        }
                        r7q0 r7q0Var = this.h;
                        ArrayList arrayList = r7q0Var.a;
                        int i15 = r7q0Var.b;
                        if (i15 != 0) {
                            if (i15 != 1) {
                                short s = 2817;
                                short s2 = 2816;
                                short s3 = 2192;
                                if (i15 == 2) {
                                    long length2 = c5pVar.getLength();
                                    int i16 = r7q0Var.c - 20;
                                    ef90 ef90Var5 = new ef90(i16);
                                    c5pVar.readFully(ef90Var5.a, 0, i16);
                                    int i17 = 0;
                                    while (i17 < i16 / 12) {
                                        ef90Var5.L(2);
                                        short o = ef90Var5.o();
                                        if (o != s3 && o != s2 && o != s && o != 2819) {
                                            if (o != 2820) {
                                                ef90Var5.L(8);
                                                j = length2;
                                                ef90Var = ef90Var5;
                                                i17++;
                                                length2 = j;
                                                ef90Var5 = ef90Var;
                                                s3 = 2192;
                                                s = 2817;
                                                s2 = 2816;
                                            }
                                        }
                                        j = length2;
                                        ef90Var = ef90Var5;
                                        arrayList.add(new q7q0((j - r7q0Var.c) - ef90Var5.m(), ef90Var.m()));
                                        i17++;
                                        length2 = j;
                                        ef90Var5 = ef90Var;
                                        s3 = 2192;
                                        s = 2817;
                                        s2 = 2816;
                                    }
                                    if (arrayList.isEmpty()) {
                                        xde0Var.a = 0L;
                                    } else {
                                        r7q0Var.b = 3;
                                        xde0Var.a = ((q7q0) arrayList.get(0)).a;
                                    }
                                } else {
                                    if (i15 != 3) {
                                        ny61.k();
                                        return 0;
                                    }
                                    long position3 = c5pVar.getPosition();
                                    int length3 = (int) ((c5pVar.getLength() - c5pVar.getPosition()) - r7q0Var.c);
                                    ef90 ef90Var6 = new ef90(length3);
                                    c5pVar.readFully(ef90Var6.a, 0, length3);
                                    int i18 = 0;
                                    while (i18 < arrayList.size()) {
                                        q7q0 q7q0Var = (q7q0) arrayList.get(i18);
                                        int i19 = i10;
                                        ef90Var6.K((int) (q7q0Var.a - position3));
                                        ef90Var6.L(i9);
                                        int m = ef90Var6.m();
                                        Charset charset = StandardCharsets.UTF_8;
                                        int i20 = i19;
                                        String w = ef90Var6.w(m, charset);
                                        switch (w.hashCode()) {
                                            case -1711564334:
                                                if (w.equals("SlowMotion_Data")) {
                                                    i5 = i20;
                                                    break;
                                                }
                                                i5 = -1;
                                                break;
                                            case -1332107749:
                                                if (w.equals("Super_SlowMotion_Edit_Data")) {
                                                    i5 = 1;
                                                    break;
                                                }
                                                i5 = -1;
                                                break;
                                            case -1251387154:
                                                if (w.equals("Super_SlowMotion_Data")) {
                                                    i5 = 2;
                                                    break;
                                                }
                                                i5 = -1;
                                                break;
                                            case -830665521:
                                                if (w.equals("Super_SlowMotion_Deflickering_On")) {
                                                    i5 = 3;
                                                    break;
                                                }
                                                i5 = -1;
                                                break;
                                            case 1760745220:
                                                if (w.equals("Super_SlowMotion_BGM")) {
                                                    i5 = 4;
                                                    break;
                                                }
                                                i5 = -1;
                                                break;
                                            default:
                                                i5 = -1;
                                                break;
                                        }
                                        switch (i5) {
                                            case 0:
                                                c3 = 2192;
                                                break;
                                            case 1:
                                                c3 = 2819;
                                                break;
                                            case 2:
                                                c3 = 2816;
                                                break;
                                            case 3:
                                                c3 = 2820;
                                                break;
                                            case 4:
                                                c3 = 2817;
                                                break;
                                            default:
                                                throw ParserException.a(null, "Invalid SEF name");
                                        }
                                        int i21 = q7q0Var.b - (m + 8);
                                        if (c3 == 2192) {
                                            ArrayList arrayList2 = new ArrayList();
                                            List v = r7q0.e.v(ef90Var6.w(i21, charset));
                                            int i22 = i20;
                                            while (i22 < v.size()) {
                                                List v2 = r7q0.d.v((CharSequence) v.get(i22));
                                                if (v2.size() != 3) {
                                                    throw ParserException.a(null, null);
                                                }
                                                try {
                                                    arrayList2.add(new rws0(1 << (Integer.parseInt((String) v2.get(2)) - 1), Long.parseLong((String) v2.get(i20)), Long.parseLong((String) v2.get(1))));
                                                    i22++;
                                                    i20 = 0;
                                                } catch (NumberFormatException e) {
                                                    throw ParserException.a(e, null);
                                                }
                                            }
                                            this.i.add(new sws0(arrayList2));
                                        } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                            ny61.k();
                                            return i20;
                                        }
                                        i18++;
                                        i10 = 0;
                                        i9 = 4;
                                    }
                                    xde0Var.a = 0L;
                                }
                            } else {
                                ef90 ef90Var7 = new ef90(8);
                                c5pVar.readFully(ef90Var7.a, 0, 8);
                                r7q0Var.c = ef90Var7.m() + 8;
                                if (ef90Var7.k() != 1397048916) {
                                    xde0Var.a = 0L;
                                } else {
                                    xde0Var.a = c5pVar.getPosition() - (r7q0Var.c - 12);
                                    r7q0Var.b = 2;
                                }
                            }
                            i4 = 1;
                        } else {
                            long length4 = c5pVar.getLength();
                            xde0Var.a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                            i4 = 1;
                            r7q0Var.b = 1;
                        }
                        if (xde0Var.a != 0) {
                            return i4;
                        }
                        this.k = 0;
                        this.n = 0;
                        return i4;
                    }
                    long position4 = c5pVar.getPosition();
                    if (this.p == -1) {
                        int i23 = 0;
                        int i24 = -1;
                        int i25 = -1;
                        boolean z3 = true;
                        boolean z4 = true;
                        long j9 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                        long j10 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                        long j11 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                        while (true) {
                            vb30[] vb30VarArr = this.A;
                            if (i23 >= vb30VarArr.length) {
                                break;
                            }
                            vb30 vb30Var = vb30VarArr[i23];
                            int i26 = vb30Var.e;
                            k001 k001Var = vb30Var.b;
                            char c5 = c4;
                            if (i26 != k001Var.b) {
                                long j12 = k001Var.c[i26];
                                long[][] jArr = this.B;
                                int i27 = tw21.a;
                                long j13 = jArr[i23][i26];
                                long j14 = j12 - position4;
                                boolean z5 = j14 < 0 || j14 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if ((!z5 && z3) || (z5 == z3 && j14 < j11)) {
                                    i25 = i23;
                                    z3 = z5;
                                    j10 = j13;
                                    j11 = j14;
                                }
                                if (j13 < j9) {
                                    i24 = i23;
                                    z4 = z5;
                                    j9 = j13;
                                }
                            }
                            i23++;
                            c4 = c5;
                        }
                        c = c4;
                        if (j9 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED || !z4 || j10 < j9 + 10485760) {
                            i24 = i25;
                        }
                        this.p = i24;
                        if (i24 == -1) {
                            return -1;
                        }
                    } else {
                        c = 2;
                    }
                    vb30 vb30Var2 = this.A[this.p];
                    g001 g001Var = vb30Var2.c;
                    k001 k001Var2 = vb30Var2.b;
                    uzz0 uzz0Var = vb30Var2.a;
                    int i28 = vb30Var2.e;
                    long[] jArr2 = k001Var2.c;
                    int[] iArr = k001Var2.d;
                    long j15 = jArr2[i28] + this.y;
                    int i29 = iArr[i28];
                    vf11 vf11Var = vb30Var2.d;
                    long j16 = (j15 - position4) + this.q;
                    if (j16 < 0 || j16 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        xde0Var.a = j15;
                        return 1;
                    }
                    int i30 = uzz0Var.h;
                    int i31 = uzz0Var.k;
                    a aVar = uzz0Var.g;
                    if (i30 == 1) {
                        j16 += 8;
                        i29 -= 8;
                    }
                    c5pVar.O((int) j16);
                    String str = aVar.n;
                    String str2 = aVar.n;
                    if (!Objects.equals(str, "video/avc") ? !(!Objects.equals(str2, "video/hevc") || (i8 & 128) == 0) : (i8 & 32) != 0) {
                        c2 = 1;
                        this.t = true;
                    } else {
                        c2 = 1;
                    }
                    if (i31 == 0) {
                        if ("audio/ac4".equals(str2)) {
                            if (this.r == 0) {
                                eg3.h(i29, ef90Var2);
                                g001Var.a(ef90Var2, 7, 0);
                                this.r += 7;
                            }
                            i29 += 7;
                        } else if (vf11Var != null) {
                            vf11Var.c(c5pVar);
                        }
                        while (true) {
                            int i32 = this.r;
                            if (i32 >= i29) {
                                break;
                            }
                            int b = g001Var.b(c5pVar, i29 - i32, false);
                            this.q += b;
                            this.r += b;
                            this.s -= b;
                        }
                    } else {
                        ef90 ef90Var8 = this.d;
                        byte[] bArr2 = ef90Var8.a;
                        bArr2[0] = 0;
                        bArr2[c2] = 0;
                        bArr2[c] = 0;
                        int i33 = 4 - i31;
                        i29 += i33;
                        while (this.r < i29) {
                            int i34 = this.s;
                            if (i34 == 0) {
                                if (this.t || l150.d(aVar) + i31 > iArr[i28] - this.q) {
                                    i2 = i31;
                                    i3 = 0;
                                } else {
                                    int d = l150.d(aVar);
                                    i2 = i31 + d;
                                    i3 = d;
                                }
                                c5pVar.readFully(bArr2, i33, i2);
                                this.q += i2;
                                ef90Var8.K(0);
                                int k = ef90Var8.k();
                                if (k < 0) {
                                    throw ParserException.a(null, "Invalid NAL length");
                                }
                                this.s = k - i3;
                                ef90 ef90Var9 = this.c;
                                ef90Var9.K(0);
                                i = i33;
                                g001Var.a(ef90Var9, 4, 0);
                                this.r += 4;
                                if (i3 > 0) {
                                    g001Var.a(ef90Var8, i3, 0);
                                    this.r += i3;
                                    if (l150.c(bArr2, i3, aVar)) {
                                        this.t = true;
                                    }
                                }
                            } else {
                                i = i33;
                                int b2 = g001Var.b(c5pVar, i34, false);
                                this.q += b2;
                                this.r += b2;
                                this.s -= b2;
                            }
                            i33 = i;
                        }
                    }
                    int i35 = i29;
                    long j17 = k001Var2.f[i28];
                    int i36 = k001Var2.g[i28];
                    if (!this.t) {
                        i36 |= SelfTester_JCP.DECRYPT_CBC;
                    }
                    int i37 = i36;
                    if (vf11Var != null) {
                        vf11Var.b(g001Var, j17, i37, i35, 0, null);
                        if (i28 + 1 == k001Var2.b) {
                            vf11Var.a(g001Var, null);
                        }
                    } else {
                        g001Var.c(j17, i37, i35, 0, null);
                    }
                    vb30Var2.e++;
                    this.p = -1;
                    this.q = 0;
                    this.r = 0;
                    this.s = 0;
                    this.t = false;
                    return 0;
                }
                long j18 = this.m - this.n;
                long position5 = c5pVar.getPosition() + j18;
                ef90 ef90Var10 = this.o;
                if (ef90Var10 != null) {
                    c5pVar.readFully(ef90Var10.a, this.n, (int) j18);
                    if (this.l == 1718909296) {
                        this.u = true;
                        ef90Var10.K(8);
                        int k2 = ef90Var10.k();
                        int i38 = k2 != 1751476579 ? k2 != 1903435808 ? 0 : 1 : 2;
                        if (i38 == 0) {
                            ef90Var10.L(4);
                            while (true) {
                                if (ef90Var10.a() <= 0) {
                                    i38 = 0;
                                    break;
                                }
                                int k3 = ef90Var10.k();
                                i38 = k3 != 1751476579 ? k3 != 1903435808 ? 0 : 1 : 2;
                                if (i38 != 0) {
                                    break;
                                }
                            }
                        }
                        this.E = i38;
                    } else if (!arrayDeque.isEmpty()) {
                        ((tb30) arrayDeque.peek()).d.add(new ub30(this.l, ef90Var10));
                    }
                } else {
                    if (!this.u && this.l == 1835295092) {
                        this.E = 1;
                    }
                    if (j18 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        c5pVar.O((int) j18);
                    } else {
                        xde0Var.a = c5pVar.getPosition() + j18;
                        z = true;
                        l(position5);
                        if (this.v) {
                            i6 = 1;
                            z2 = z;
                        } else {
                            i6 = 1;
                            this.x = true;
                            xde0Var.a = this.w;
                            this.v = false;
                            z2 = true;
                        }
                        if (z2 && this.k != 2) {
                            return i6;
                        }
                    }
                }
                z = false;
                l(position5);
                if (this.v) {
                }
                if (z2) {
                    return i6;
                }
                continue;
            }
        }
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        r3t0 g = k0a1.g(c5pVar, false, (this.b & 2) != 0);
        this.j = g != null ? ImmutableList.r(g) : ImmutableList.p();
        return g == null;
    }

    @Override // defpackage.f7q0
    public final long k() {
        return this.D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x020d, code lost:
    
        r7.K(r8);
        r8 = r8 + r15;
        r7.L(8);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021b, code lost:
    
        r9 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021d, code lost:
    
        if (r9 >= r8) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021f, code lost:
    
        r9 = r7.k() + r9;
        r13 = r7.k();
        r32 = r1;
        r1 = (r13 >> 24) & 255;
        r33 = r8;
        r34 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0239, code lost:
    
        if (r1 == 169) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x023d, code lost:
    
        if (r1 != 253) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0246, code lost:
    
        if (r13 != 1735291493) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0271, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0276, code lost:
    
        if (r13 != 1684632427) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0278, code lost:
    
        r13 = defpackage.jlb1.d(r13, r7, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x027e, code lost:
    
        r7.K(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0480, code lost:
    
        if (r13 == null) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0482, code lost:
    
        r3.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0485, code lost:
    
        r1 = r32;
        r8 = r33;
        r11 = r34;
        r31 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x028c, code lost:
    
        if (r13 != 1953655662) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x028e, code lost:
    
        r13 = defpackage.jlb1.d(r13, r7, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0298, code lost:
    
        if (r13 != 1953329263) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x029a, code lost:
    
        r13 = defpackage.jlb1.f(r13, "TBPM", r7, r31, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a7, code lost:
    
        if (r13 != 1668311404) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02a9, code lost:
    
        r13 = defpackage.jlb1.f(r13, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b4, code lost:
    
        if (r13 != 1668249202) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b6, code lost:
    
        r13 = defpackage.jlb1.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02be, code lost:
    
        if (r13 != 1631670868) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c0, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02ca, code lost:
    
        if (r13 != 1936682605) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02cc, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d6, code lost:
    
        if (r13 != 1936679276) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02d8, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02e2, code lost:
    
        if (r13 != 1936679282) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02e4, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ee, code lost:
    
        if (r13 != 1936679265) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f0, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02fa, code lost:
    
        if (r13 != 1936679791) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02fc, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0307, code lost:
    
        if (r13 != 1920233063) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0309, code lost:
    
        r13 = defpackage.jlb1.f(r13, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0315, code lost:
    
        if (r13 != 1885823344) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0317, code lost:
    
        r13 = defpackage.jlb1.f(r13, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0324, code lost:
    
        if (r13 != 1936683886) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0326, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0331, code lost:
    
        if (r13 != 1953919848) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0333, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x033e, code lost:
    
        if (r13 != 757935405) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0340, code lost:
    
        r1 = null;
        r13 = null;
        r8 = -1;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0345, code lost:
    
        r15 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0347, code lost:
    
        if (r15 >= r9) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0349, code lost:
    
        r35 = r7.k();
        r36 = r11;
        r11 = r7.k();
        r7.L(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x035c, code lost:
    
        if (r11 != 1835360622) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x036b, code lost:
    
        if (r11 != 1851878757) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0377, code lost:
    
        if (r11 != 1684108385) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0379, code lost:
    
        r11 = r35;
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0380, code lost:
    
        r7.L(r35 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x037e, code lost:
    
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x036d, code lost:
    
        r1 = r7.u(r35 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0365, code lost:
    
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x035e, code lost:
    
        r13 = r7.u(r35 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0386, code lost:
    
        r36 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0388, code lost:
    
        if (r13 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x038a, code lost:
    
        if (r1 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x038d, code lost:
    
        if (r8 != (-1)) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0390, code lost:
    
        r7.K(r8);
        r7.L(16);
        r13 = new defpackage.vrw(r13, r1, r7.u(r36 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03a6, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0461, code lost:
    
        defpackage.lk91.d("Skipped unknown metadata entry: ".concat(defpackage.ay4.d(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x046c, code lost:
    
        r7.K(r9);
        r13 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0248, code lost:
    
        r1 = defpackage.z5v.a(defpackage.jlb1.e(r7) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0252, code lost:
    
        if (r1 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0254, code lost:
    
        r13 = null;
        r8 = new defpackage.bpy0("TCON", null, com.google.common.collect.ImmutableList.r(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0266, code lost:
    
        r7.K(r9);
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x025f, code lost:
    
        r13 = null;
        defpackage.lk91.j("Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0265, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0286, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0492, code lost:
    
        r7.K(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0495, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x023f, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03af, code lost:
    
        r1 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03b6, code lost:
    
        if (r1 != 6516084) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03b8, code lost:
    
        r1 = r7.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03c3, code lost:
    
        if (r7.k() != 1684108385) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03c5, code lost:
    
        r7.L(8);
        r1 = r7.u(r1 - 16);
        r13 = new defpackage.gmc("und", r1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03e9, code lost:
    
        r7.K(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03da, code lost:
    
        defpackage.lk91.j("Failed to parse comment attribute: ".concat(defpackage.ay4.d(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03e7, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03f6, code lost:
    
        if (r1 == 7233901) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03fb, code lost:
    
        if (r1 != 7631467) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0402, code lost:
    
        if (r1 == 6516589) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0407, code lost:
    
        if (r1 != 7828084) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x040e, code lost:
    
        if (r1 != 6578553) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0410, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0416, code lost:
    
        r7.K(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x041e, code lost:
    
        if (r1 != 4280916) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0420, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x042a, code lost:
    
        if (r1 != 7630703) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x042c, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0436, code lost:
    
        if (r1 != 6384738) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0438, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0442, code lost:
    
        if (r1 != 7108978) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0444, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x044e, code lost:
    
        if (r1 != 6776174) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0450, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0458, code lost:
    
        if (r1 != 6779504) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x045a, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0472, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0479, code lost:
    
        r13 = defpackage.jlb1.g(r13, r7, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0496, code lost:
    
        r32 = r1;
        r34 = r11;
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04a3, code lost:
    
        if (r3.isEmpty() == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04a8, code lost:
    
        r13 = new defpackage.w820(r3);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0855 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(long j) {
        ArrayList arrayList;
        w820 w820Var;
        ArrayDeque arrayDeque;
        boolean z;
        w820 w820Var2;
        w820 w820Var3;
        ArrayList arrayList2;
        String str;
        w820 w820Var4;
        w820 w820Var5;
        w820 w820Var6;
        ArrayList arrayList3;
        int i;
        int i2;
        ArrayDeque arrayDeque2;
        boolean z2;
        int i3;
        w820 w820Var7;
        w820 b;
        w820 w820Var8;
        int i4;
        w820 w820Var9;
        z810 b2;
        z810 z810Var;
        while (true) {
            ArrayDeque arrayDeque3 = this.g;
            if (arrayDeque3.isEmpty() || ((tb30) arrayDeque3.peek()).c != j) {
                break;
            }
            tb30 tb30Var = (tb30) arrayDeque3.pop();
            if (tb30Var.b == 1836019574) {
                tb30 j2 = tb30Var.j(1835365473);
                ArrayList arrayList4 = new ArrayList();
                boolean z3 = true;
                int i5 = 4;
                int i6 = 1684108385;
                int i7 = this.b;
                int i8 = 8;
                if (j2 != null) {
                    byte[] bArr = aj6.a;
                    ub30 k = j2.k(1751411826);
                    ub30 k2 = j2.k(1801812339);
                    ub30 k3 = j2.k(1768715124);
                    if (k != null && k2 != null && k3 != null) {
                        ef90 ef90Var = k.c;
                        ef90Var.K(16);
                        if (ef90Var.k() == 1835299937) {
                            ef90 ef90Var2 = k2.c;
                            ef90Var2.K(12);
                            int k4 = ef90Var2.k();
                            String[] strArr = new String[k4];
                            int i9 = 0;
                            while (i9 < k4) {
                                int k5 = ef90Var2.k();
                                ef90Var2.L(i5);
                                strArr[i9] = ef90Var2.w(k5 - 8, StandardCharsets.UTF_8);
                                i9++;
                                i5 = 4;
                            }
                            ef90 ef90Var3 = k3.c;
                            ef90Var3.K(8);
                            ArrayList arrayList5 = new ArrayList();
                            while (ef90Var3.a() > i8) {
                                int i10 = ef90Var3.b;
                                int k6 = ef90Var3.k();
                                int k7 = ef90Var3.k() - 1;
                                if (k7 < 0 || k7 >= k4) {
                                    xvz.v(k7, "Skipped metadata with unknown key index: ");
                                } else {
                                    String str2 = strArr[k7];
                                    int i11 = i10 + k6;
                                    while (true) {
                                        int i12 = ef90Var3.b;
                                        if (i12 >= i11) {
                                            z810Var = null;
                                            break;
                                        }
                                        int k8 = ef90Var3.k();
                                        if (ef90Var3.k() == i6) {
                                            int k9 = ef90Var3.k();
                                            int k10 = ef90Var3.k();
                                            int i13 = k8 - 16;
                                            byte[] bArr2 = new byte[i13];
                                            ef90Var3.i(0, i13, bArr2);
                                            z810Var = new z810(k10, k9, str2, bArr2);
                                            break;
                                        }
                                        ef90Var3.K(i12 + k8);
                                        i6 = 1684108385;
                                    }
                                    if (z810Var != null) {
                                        arrayList5.add(z810Var);
                                    }
                                }
                                ef90Var3.K(i10 + k6);
                                i8 = 8;
                                i6 = 1684108385;
                            }
                            if (!arrayList5.isEmpty()) {
                                w820Var = new w820(arrayList5);
                                if (this.x) {
                                    if (w820Var != null && (i7 & 64) != 0 && (b2 = jlb1.b(w820Var, "auxiliary.tracks.offset")) != null) {
                                        long D = new ef90(b2.b).D();
                                        if (D > 0) {
                                            this.w = D;
                                            this.v = true;
                                            arrayDeque = arrayDeque3;
                                            arrayDeque.clear();
                                            if (this.v) {
                                                this.k = 2;
                                            }
                                        }
                                    }
                                    arrayList = arrayList4;
                                } else {
                                    d6z.z(w820Var);
                                    z810 b3 = jlb1.b(w820Var, "auxiliary.tracks.interleaved");
                                    if (b3 != null && b3.b[0] == 0) {
                                        this.y = this.w + 16;
                                    }
                                    z810 b4 = jlb1.b(w820Var, "auxiliary.tracks.map");
                                    d6z.z(b4);
                                    ArrayList a = b4.a();
                                    ArrayList arrayList6 = new ArrayList(a.size());
                                    for (int i14 = 0; i14 < a.size(); i14++) {
                                        int intValue = ((Integer) a.get(i14)).intValue();
                                        arrayList6.add(Integer.valueOf(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? 0 : 4 : 3 : 2 : 1));
                                    }
                                    arrayList = arrayList6;
                                }
                            }
                        }
                    }
                    w820Var = null;
                    if (this.x) {
                    }
                } else {
                    arrayList = arrayList4;
                    w820Var = null;
                }
                ArrayList arrayList7 = new ArrayList();
                boolean z4 = this.E == 1;
                jts jtsVar = new jts();
                ub30 k11 = tb30Var.k(1969517665);
                if (k11 != null) {
                    byte[] bArr3 = aj6.a;
                    ef90 ef90Var4 = k11.c;
                    int i15 = 8;
                    ef90Var4.K(8);
                    w820 w820Var10 = new w820(new s820[0]);
                    while (ef90Var4.a() >= i15) {
                        int i16 = ef90Var4.b;
                        int k12 = ef90Var4.k();
                        int k13 = ef90Var4.k();
                        if (k13 == 1835365473) {
                            ef90Var4.K(i16);
                            int i17 = i16 + k12;
                            ef90Var4.L(i15);
                            int i18 = ef90Var4.b;
                            ef90Var4.L(4);
                            if (ef90Var4.k() != 1751411826) {
                                i18 += 4;
                            }
                            ef90Var4.K(i18);
                            while (true) {
                                int i19 = ef90Var4.b;
                                if (i19 >= i17) {
                                    arrayDeque2 = arrayDeque3;
                                    z2 = z4;
                                    w820Var9 = null;
                                    break;
                                } else {
                                    int k14 = ef90Var4.k();
                                    boolean z5 = z3;
                                    if (ef90Var4.k() == 1768715124) {
                                        break;
                                    }
                                    ef90Var4.K(i19 + k14);
                                    z3 = true;
                                }
                            }
                            w820 w820Var11 = w820Var9;
                            w820Var10 = w820Var10.b(w820Var11);
                            i3 = 8;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            z2 = z4;
                            if (k13 == 1936553057) {
                                ef90Var4.K(i16);
                                int i20 = i16 + k12;
                                ef90Var4.L(12);
                                while (true) {
                                    int i21 = ef90Var4.b;
                                    if (i21 >= i20) {
                                        i3 = 8;
                                        break;
                                    }
                                    int k15 = ef90Var4.k();
                                    if (ef90Var4.k() != 1935766900) {
                                        ef90Var4.K(i21 + k15);
                                    } else if (k15 < 16) {
                                        w820Var8 = null;
                                        i3 = 8;
                                    } else {
                                        ef90Var4.L(4);
                                        int i22 = -1;
                                        int i23 = 0;
                                        for (int i24 = 0; i24 < 2; i24++) {
                                            int y = ef90Var4.y();
                                            int y2 = ef90Var4.y();
                                            if (y == 0) {
                                                i22 = y2;
                                            } else if (y == 1) {
                                                i23 = y2;
                                            }
                                        }
                                        if (i22 == 12) {
                                            i4 = PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC;
                                        } else if (i22 == 13) {
                                            i4 = 120;
                                        } else if (i22 != 21) {
                                            i4 = -2147483647;
                                        } else {
                                            i3 = 8;
                                            if (ef90Var4.a() >= 8 && ef90Var4.b + 8 <= i20) {
                                                int k16 = ef90Var4.k();
                                                int k17 = ef90Var4.k();
                                                if (k16 >= 12 && k17 == 1936877170) {
                                                    i4 = ef90Var4.z();
                                                    if (i4 != -2147483647) {
                                                        w820Var8 = new w820(new h0t0(i4, i23));
                                                    }
                                                }
                                            }
                                            i4 = -2147483647;
                                            if (i4 != -2147483647) {
                                            }
                                        }
                                        i3 = 8;
                                        if (i4 != -2147483647) {
                                        }
                                    }
                                }
                                w820Var8 = null;
                                b = w820Var10.b(w820Var8);
                            } else {
                                i3 = 8;
                                if (k13 == -1451722374) {
                                    short v = ef90Var4.v();
                                    ef90Var4.L(2);
                                    String w = ef90Var4.w(v, StandardCharsets.UTF_8);
                                    int max = Math.max(w.lastIndexOf(43), w.lastIndexOf(45));
                                    try {
                                        w820Var7 = new w820(new xb30(Float.parseFloat(w.substring(0, max)), Float.parseFloat(w.substring(max, w.length() - 1))));
                                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                        w820Var7 = null;
                                    }
                                    b = w820Var10.b(w820Var7);
                                }
                            }
                            w820Var10 = b;
                        }
                        ef90Var4.K(i16 + k12);
                        i15 = i3;
                        arrayDeque3 = arrayDeque2;
                        z4 = z2;
                        z3 = true;
                    }
                    arrayDeque = arrayDeque3;
                    z = z4;
                    w820Var2 = null;
                    jtsVar.b(w820Var10);
                    w820Var3 = w820Var10;
                } else {
                    arrayDeque = arrayDeque3;
                    z = z4;
                    w820Var2 = null;
                    w820Var3 = null;
                }
                ub30 k18 = tb30Var.k(1836476516);
                k18.getClass();
                w820 w820Var12 = new w820(aj6.d(k18.c));
                ArrayList g = aj6.g(tb30Var, jtsVar, -9223372036854775807L, null, (i7 & 1) != 0, z, new ak00(16));
                if (this.x) {
                    boolean z6 = arrayList.size() == g.size();
                    Locale locale = Locale.US;
                    d6z.w(b64.d(arrayList.size(), g.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", Extension.C_BRAKE), z6);
                }
                String d = rlb1.d(g);
                long j3 = -9223372036854775807L;
                int i25 = 0;
                int i26 = -1;
                int i27 = 0;
                while (i25 < g.size()) {
                    k001 k001Var = (k001) g.get(i25);
                    if (k001Var.b == 0) {
                        w820Var6 = w820Var3;
                        w820Var5 = w820Var;
                        w820Var4 = w820Var12;
                        arrayList2 = g;
                        str = d;
                        arrayList3 = arrayList7;
                    } else {
                        uzz0 uzz0Var = k001Var.a;
                        arrayList2 = g;
                        str = d;
                        d5p d5pVar = this.z;
                        int i28 = i27 + 1;
                        ArrayList arrayList8 = arrayList7;
                        int i29 = uzz0Var.b;
                        w820 w820Var13 = w820Var;
                        a aVar = uzz0Var.g;
                        g001 B = d5pVar.B(i27, i29);
                        vb30 vb30Var = new vb30(uzz0Var, k001Var, B);
                        long j4 = uzz0Var.e;
                        if (j4 == -9223372036854775807L) {
                            j4 = k001Var.h;
                        }
                        B.getClass();
                        j3 = Math.max(j3, j4);
                        boolean equals = "audio/true-hd".equals(aVar.n);
                        int i30 = k001Var.e;
                        int i31 = equals ? i30 * 16 : i30 + 30;
                        f7s a2 = aVar.a();
                        a2.n = i31;
                        if (i29 == 2) {
                            int i32 = aVar.f;
                            if ((i7 & 8) != 0) {
                                i32 |= i26 == -1 ? 1 : 2;
                            }
                            if (this.x) {
                                i32 |= 32768;
                                a2.g = ((Integer) arrayList.get(i25)).intValue();
                            }
                            a2.f = i32;
                        }
                        if (i29 == 1 && (i = jtsVar.a) != -1 && (i2 = jtsVar.b) != -1) {
                            a2.F = i;
                            a2.G = i2;
                        }
                        w820 w820Var14 = aVar.l;
                        ArrayList arrayList9 = this.i;
                        w820[] w820VarArr = {arrayList9.isEmpty() ? w820Var2 : new w820(arrayList9), w820Var3, w820Var12};
                        if (w820Var14 == null) {
                            w820Var14 = new w820(new s820[0]);
                        }
                        if (w820Var13 != null) {
                            w820Var5 = w820Var13;
                            int i33 = 0;
                            w820Var6 = w820Var3;
                            while (true) {
                                s820[] s820VarArr = w820Var5.a;
                                w820Var4 = w820Var12;
                                if (i33 >= s820VarArr.length) {
                                    break;
                                }
                                s820 s820Var = s820VarArr[i33];
                                if (s820Var instanceof z810) {
                                    z810 z810Var2 = (z810) s820Var;
                                    if (!z810Var2.a.equals("com.android.capture.fps")) {
                                        w820Var14 = w820Var14.a(z810Var2);
                                    } else if (i29 == 2) {
                                        w820Var14 = w820Var14.a(z810Var2);
                                    }
                                }
                                i33++;
                                w820Var12 = w820Var4;
                            }
                        } else {
                            w820Var4 = w820Var12;
                            w820Var5 = w820Var13;
                            w820Var6 = w820Var3;
                        }
                        for (int i34 = 0; i34 < 3; i34++) {
                            w820Var14 = w820Var14.b(w820VarArr[i34]);
                        }
                        if (w820Var14.a.length > 0) {
                            a2.k = w820Var14;
                        }
                        a2.l = eh20.q(str);
                        smw0.u(a2, vb30Var.c);
                        if (i29 == 2 && i26 == -1) {
                            i26 = arrayList8.size();
                        }
                        arrayList3 = arrayList8;
                        arrayList3.add(vb30Var);
                        i27 = i28;
                    }
                    i25++;
                    arrayList7 = arrayList3;
                    w820Var = w820Var5;
                    g = arrayList2;
                    d = str;
                    w820Var3 = w820Var6;
                    w820Var12 = w820Var4;
                }
                this.C = i26;
                this.D = j3;
                vb30[] vb30VarArr = (vb30[]) arrayList7.toArray(new vb30[0]);
                this.A = vb30VarArr;
                long[][] jArr = new long[vb30VarArr.length][];
                int[] iArr = new int[vb30VarArr.length];
                long[] jArr2 = new long[vb30VarArr.length];
                boolean[] zArr = new boolean[vb30VarArr.length];
                for (int i35 = 0; i35 < vb30VarArr.length; i35++) {
                    jArr[i35] = new long[vb30VarArr[i35].b.b];
                    jArr2[i35] = vb30VarArr[i35].b.f[0];
                }
                long j5 = 0;
                int i36 = 0;
                while (i36 < vb30VarArr.length) {
                    long j6 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                    int i37 = -1;
                    for (int i38 = 0; i38 < vb30VarArr.length; i38++) {
                        if (!zArr[i38]) {
                            long j7 = jArr2[i38];
                            if (j7 <= j6) {
                                i37 = i38;
                                j6 = j7;
                            }
                        }
                    }
                    int i39 = iArr[i37];
                    long[] jArr3 = jArr[i37];
                    jArr3[i39] = j5;
                    k001 k001Var2 = vb30VarArr[i37].b;
                    j5 += k001Var2.d[i39];
                    int i40 = i39 + 1;
                    iArr[i37] = i40;
                    if (i40 < jArr3.length) {
                        jArr2[i37] = k001Var2.f[i40];
                    } else {
                        zArr[i37] = true;
                        i36++;
                    }
                }
                this.B = jArr;
                this.z.A();
                this.z.w(this);
                arrayDeque.clear();
                if (this.v) {
                }
            } else if (!arrayDeque3.isEmpty()) {
                ((tb30) arrayDeque3.peek()).e.add(tb30Var);
            }
        }
        if (this.k != 2) {
            this.k = 0;
            this.n = 0;
        }
    }

    @Override // defpackage.b5p
    public final void release() {
    }

    @Deprecated
    public wb30() {
        this(16, o2v0.d4);
    }
}
