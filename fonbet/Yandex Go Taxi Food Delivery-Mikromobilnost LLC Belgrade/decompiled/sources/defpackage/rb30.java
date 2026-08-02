package defpackage;

import androidx.media3.common.a;
import java.io.EOFException;
import java.math.RoundingMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class rb30 implements b5p {
    public final long a;
    public final ef90 b;
    public final bc30 c;
    public final jts d;
    public final y5v e;
    public final coj f;
    public d5p g;
    public g001 h;
    public g001 i;
    public int j;
    public w820 k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public j7q0 q;
    public boolean r;
    public boolean s;
    public long t;

    public rb30(long j) {
        this.a = j;
        this.b = new ef90(10);
        this.c = new bc30();
        this.d = new jts();
        this.l = -9223372036854775807L;
        this.e = new y5v();
        coj cojVar = new coj();
        this.f = cojVar;
        this.i = cojVar;
        this.o = -1L;
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.p = 0;
        this.t = j2;
        if (this.q instanceof grv) {
            throw null;
        }
    }

    public final void b() {
        j7q0 j7q0Var = this.q;
        if ((j7q0Var instanceof s6e) && ((s6e) j7q0Var).c()) {
            long j = this.o;
            if (j == -1 || j == this.q.i()) {
                return;
            }
            s6e s6eVar = (s6e) this.q;
            this.q = new s6e(s6eVar.i, s6eVar.j, this.o, s6eVar.h, s6eVar.k);
            d5p d5pVar = this.g;
            d5pVar.getClass();
            d5pVar.w(this.q);
            this.h.getClass();
            this.q.k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.L() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(c5p c5pVar) {
        j7q0 j7q0Var = this.q;
        if (j7q0Var != null) {
            long i = j7q0Var.i();
            if (i != -1) {
            }
        }
        try {
            return !c5pVar.H(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.g = d5pVar;
        g001 B = d5pVar.B(0, 1);
        this.h = B;
        this.i = B;
        this.g.A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
    
        if (r18 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        r17.O(r3 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        r16.j = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        r17.J();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(c5p c5pVar, boolean z) {
        int i;
        int i2;
        int b;
        int i3 = z ? 32768 : 131072;
        c5pVar.J();
        if (c5pVar.getPosition() == 0) {
            w820 a = this.e.a(c5pVar, null);
            this.k = a;
            if (a != null) {
                this.d.b(a);
            }
            i = (int) c5pVar.L();
            if (!z) {
                c5pVar.O(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!c(c5pVar)) {
                ef90 ef90Var = this.b;
                ef90Var.K(0);
                int k = ef90Var.k();
                if ((i2 == 0 || ((-128000) & k) == (i2 & (-128000))) && (b = bl91.b(k)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(k);
                        i2 = k;
                    }
                    c5pVar.N(b - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        b();
                        ny61.b();
                        return false;
                    }
                    if (z) {
                        c5pVar.J();
                        c5pVar.N(i + i6);
                    } else {
                        c5pVar.O(1);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                b();
                ny61.b();
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (r3 != 1231971951) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a0  */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        Throwable th;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        int i3;
        int i4;
        jts jtsVar;
        int k;
        long A;
        long[] jArr;
        int i5;
        int i6;
        long position;
        long j4;
        j7q0 s6eVar;
        long j5;
        w820 w820Var;
        wk20 wk20Var;
        j7q0 s6eVar2;
        long j6;
        long j7;
        int y;
        d6z.z(this.h);
        int i7 = tw21.a;
        int i8 = this.j;
        bc30 bc30Var = this.c;
        if (i8 == 0) {
            try {
                f(c5pVar, false);
            } catch (EOFException unused) {
                th = null;
                i = -1;
                i2 = -1;
                j = 1000000;
            }
        }
        j7q0 j7q0Var = this.q;
        ef90 ef90Var = this.b;
        if (j7q0Var == null) {
            ef90 ef90Var2 = new ef90(bc30Var.c);
            j = 1000000;
            c5pVar.g(0, bc30Var.c, ef90Var2.a);
            int i9 = bc30Var.a & 1;
            int i10 = bc30Var.e;
            th = null;
            if (i9 != 0) {
                if (i10 != 1) {
                    i3 = 36;
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    if (ef90Var2.c >= i3 + 4) {
                        ef90Var2.K(i3);
                        i4 = ef90Var2.k();
                        if (i4 != 1483304551) {
                        }
                        jtsVar = this.d;
                        if (i4 != 1231971951) {
                            if (i4 == 1447187017) {
                                long length = c5pVar.getLength();
                                long position2 = c5pVar.getPosition();
                                ef90Var2.L(6);
                                long k2 = bc30Var.c + position2 + ef90Var2.k();
                                int k3 = ef90Var2.k();
                                if (k3 > 0) {
                                    long c0 = tw21.c0(bc30Var.d, (k3 * bc30Var.g) - 1);
                                    int E = ef90Var2.E();
                                    int E2 = ef90Var2.E();
                                    int E3 = ef90Var2.E();
                                    ef90Var2.L(2);
                                    long j8 = position2 + bc30Var.c;
                                    long[] jArr2 = new long[E];
                                    long[] jArr3 = new long[E];
                                    int i11 = 0;
                                    while (i11 < E) {
                                        long j9 = j8;
                                        int i12 = i11;
                                        jArr2[i12] = (i11 * c0) / E;
                                        jArr3[i12] = j9;
                                        if (E3 != 1) {
                                            j7 = j9;
                                            if (E3 == 2) {
                                                y = ef90Var2.E();
                                            } else if (E3 == 3) {
                                                y = ef90Var2.B();
                                            } else if (E3 == 4) {
                                                y = ef90Var2.C();
                                            }
                                        } else {
                                            j7 = j9;
                                            y = ef90Var2.y();
                                        }
                                        j8 = (E2 * y) + j7;
                                        i11 = i12 + 1;
                                        jArr2 = jArr2;
                                    }
                                    long j10 = j8;
                                    long[] jArr4 = jArr2;
                                    if (length != -1 && length != k2) {
                                        StringBuilder w = unr0.w(length, "VBRI data size mismatch: ", Extension.FIX_SPACE);
                                        w.append(k2);
                                        lk91.j(w.toString());
                                    }
                                    if (k2 != j10) {
                                        StringBuilder w2 = unr0.w(k2, "VBRI bytes and ToC mismatch (using max): ", Extension.FIX_SPACE);
                                        w2.append(j10);
                                        w2.append("\nSeeking will be inaccurate.");
                                        lk91.j(w2.toString());
                                        k2 = Math.max(k2, j10);
                                    }
                                    s6eVar = new r431(jArr4, jArr3, c0, k2, bc30Var.f);
                                    c5pVar.O(bc30Var.c);
                                    w820Var = this.k;
                                    long position3 = c5pVar.getPosition();
                                    if (w820Var != null) {
                                    }
                                    wk20Var = null;
                                    if (this.r) {
                                    }
                                    this.q = s6eVar2;
                                    this.g.w(s6eVar2);
                                    f7s f7sVar = new f7s();
                                    f7sVar.l = eh20.q("audio/mpeg");
                                    f7sVar.m = eh20.q(bc30Var.b);
                                    f7sVar.n = 4096;
                                    f7sVar.C = bc30Var.e;
                                    f7sVar.D = bc30Var.d;
                                    f7sVar.F = jtsVar.a;
                                    f7sVar.G = jtsVar.b;
                                    f7sVar.k = this.k;
                                    if (this.q.j() != -2147483647) {
                                    }
                                    this.i.d(new a(f7sVar));
                                    this.n = c5pVar.getPosition();
                                }
                                s6eVar = null;
                                c5pVar.O(bc30Var.c);
                                w820Var = this.k;
                                long position32 = c5pVar.getPosition();
                                if (w820Var != null) {
                                }
                                wk20Var = null;
                                if (this.r) {
                                }
                                this.q = s6eVar2;
                                this.g.w(s6eVar2);
                                f7s f7sVar2 = new f7s();
                                f7sVar2.l = eh20.q("audio/mpeg");
                                f7sVar2.m = eh20.q(bc30Var.b);
                                f7sVar2.n = 4096;
                                f7sVar2.C = bc30Var.e;
                                f7sVar2.D = bc30Var.d;
                                f7sVar2.F = jtsVar.a;
                                f7sVar2.G = jtsVar.b;
                                f7sVar2.k = this.k;
                                if (this.q.j() != -2147483647) {
                                }
                                this.i.d(new a(f7sVar2));
                                this.n = c5pVar.getPosition();
                            } else if (i4 != 1483304551) {
                                c5pVar.J();
                                s6eVar = null;
                                w820Var = this.k;
                                long position322 = c5pVar.getPosition();
                                if (w820Var != null) {
                                    for (s820 s820Var : w820Var.a) {
                                        if (s820Var instanceof vk20) {
                                            int[] iArr = ((vk20) s820Var).x;
                                            if (w820Var != null) {
                                                for (s820 s820Var2 : w820Var.a) {
                                                    if (s820Var2 instanceof bpy0) {
                                                        bpy0 bpy0Var = (bpy0) s820Var2;
                                                        if (bpy0Var.a.equals("TLEN")) {
                                                            j6 = tw21.W(Long.parseLong((String) bpy0Var.c.get(0)));
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            j6 = -9223372036854775807L;
                                            int length2 = iArr.length;
                                            int i13 = length2 + 1;
                                            long[] jArr5 = new long[i13];
                                            long[] jArr6 = new long[i13];
                                            jArr5[0] = position322;
                                            jArr6[0] = 0;
                                            long j11 = 0;
                                            int i14 = 1;
                                            while (i14 <= length2) {
                                                int i15 = i14 - 1;
                                                position322 += r11.c + iArr[i15];
                                                j11 += r11.w + r11.y[i15];
                                                jArr5[i14] = position322;
                                                jArr6[i14] = j11;
                                                i14++;
                                                iArr = iArr;
                                                length2 = length2;
                                            }
                                            wk20Var = new wk20(j6, jArr5, jArr6);
                                            if (this.r) {
                                                if (wk20Var != null) {
                                                    s6eVar = wk20Var;
                                                } else if (s6eVar == null) {
                                                    s6eVar = null;
                                                }
                                                if (s6eVar != null) {
                                                    s6eVar.c();
                                                    s6eVar2 = s6eVar;
                                                } else {
                                                    c5pVar.g(0, 4, ef90Var.a);
                                                    ef90Var.K(0);
                                                    bc30Var.a(ef90Var.k());
                                                    s6eVar2 = new s6e(bc30Var.f, bc30Var.c, c5pVar.getLength(), c5pVar.getPosition(), false);
                                                }
                                                g001 g001Var = this.h;
                                                s6eVar2.k();
                                                g001Var.getClass();
                                            } else {
                                                s6eVar2 = new i7q0();
                                            }
                                            this.q = s6eVar2;
                                            this.g.w(s6eVar2);
                                            f7s f7sVar22 = new f7s();
                                            f7sVar22.l = eh20.q("audio/mpeg");
                                            f7sVar22.m = eh20.q(bc30Var.b);
                                            f7sVar22.n = 4096;
                                            f7sVar22.C = bc30Var.e;
                                            f7sVar22.D = bc30Var.d;
                                            f7sVar22.F = jtsVar.a;
                                            f7sVar22.G = jtsVar.b;
                                            f7sVar22.k = this.k;
                                            if (this.q.j() != -2147483647) {
                                                f7sVar22.h = this.q.j();
                                            }
                                            this.i.d(new a(f7sVar22));
                                            this.n = c5pVar.getPosition();
                                        }
                                    }
                                }
                                wk20Var = null;
                                if (this.r) {
                                }
                                this.q = s6eVar2;
                                this.g.w(s6eVar2);
                                f7s f7sVar222 = new f7s();
                                f7sVar222.l = eh20.q("audio/mpeg");
                                f7sVar222.m = eh20.q(bc30Var.b);
                                f7sVar222.n = 4096;
                                f7sVar222.C = bc30Var.e;
                                f7sVar222.D = bc30Var.d;
                                f7sVar222.F = jtsVar.a;
                                f7sVar222.G = jtsVar.b;
                                f7sVar222.k = this.k;
                                if (this.q.j() != -2147483647) {
                                }
                                this.i.d(new a(f7sVar222));
                                this.n = c5pVar.getPosition();
                            }
                        }
                        k = ef90Var2.k();
                        int C = (k & 1) == 0 ? ef90Var2.C() : -1;
                        A = (k & 2) == 0 ? ef90Var2.A() : -1L;
                        if ((k & 4) != 4) {
                            long[] jArr7 = new long[100];
                            int i16 = 0;
                            for (int i17 = 100; i16 < i17; i17 = 100) {
                                long[] jArr8 = jArr7;
                                jArr8[i16] = ef90Var2.y();
                                i16++;
                                jArr7 = jArr8;
                            }
                            jArr = jArr7;
                        } else {
                            jArr = null;
                        }
                        if ((k & 8) != 0) {
                            ef90Var2.L(4);
                        }
                        if (ef90Var2.a() < 24) {
                            ef90Var2.L(21);
                            int B = ef90Var2.B();
                            i6 = (16773120 & B) >> 12;
                            i5 = B & 4095;
                        } else {
                            i5 = -1;
                            i6 = -1;
                        }
                        long j12 = C;
                        bc30 bc30Var2 = new bc30();
                        bc30Var2.a = bc30Var.a;
                        bc30Var2.b = bc30Var.b;
                        bc30Var2.c = bc30Var.c;
                        bc30Var2.d = bc30Var.d;
                        bc30Var2.e = bc30Var.e;
                        bc30Var2.f = bc30Var.f;
                        bc30Var2.g = bc30Var.g;
                        if ((jtsVar.a != -1 || jtsVar.b == -1) && i6 != -1 && i5 != -1) {
                            jtsVar.a = i6;
                            jtsVar.b = i5;
                        }
                        position = c5pVar.getPosition();
                        if (c5pVar.getLength() != -1 && A != -1) {
                            j5 = position + A;
                            if (c5pVar.getLength() != j5) {
                                lk91.h("Mp3Extractor", "Data size mismatch between stream (" + c5pVar.getLength() + ") and Xing frame (" + j5 + "), using Xing value.");
                            }
                        }
                        c5pVar.O(bc30Var.c);
                        if (i4 != 1483304551) {
                            long c02 = (j12 == -1 || j12 == 0) ? -9223372036854775807L : tw21.c0(bc30Var2.d, (j12 * bc30Var2.g) - 1);
                            if (c02 != -9223372036854775807L) {
                                s6eVar = (A == -1 || jArr == null) ? new qd51(position, bc30Var2.c, c02, bc30Var2.f, -1L, null) : new qd51(position, bc30Var2.c, c02, bc30Var2.f, A, jArr);
                                w820Var = this.k;
                                long position3222 = c5pVar.getPosition();
                                if (w820Var != null) {
                                }
                                wk20Var = null;
                                if (this.r) {
                                }
                                this.q = s6eVar2;
                                this.g.w(s6eVar2);
                                f7s f7sVar2222 = new f7s();
                                f7sVar2222.l = eh20.q("audio/mpeg");
                                f7sVar2222.m = eh20.q(bc30Var.b);
                                f7sVar2222.n = 4096;
                                f7sVar2222.C = bc30Var.e;
                                f7sVar2222.D = bc30Var.d;
                                f7sVar2222.F = jtsVar.a;
                                f7sVar2222.G = jtsVar.b;
                                f7sVar2222.k = this.k;
                                if (this.q.j() != -2147483647) {
                                }
                                this.i.d(new a(f7sVar2222));
                                this.n = c5pVar.getPosition();
                            }
                            s6eVar = null;
                            w820Var = this.k;
                            long position32222 = c5pVar.getPosition();
                            if (w820Var != null) {
                            }
                            wk20Var = null;
                            if (this.r) {
                            }
                            this.q = s6eVar2;
                            this.g.w(s6eVar2);
                            f7s f7sVar22222 = new f7s();
                            f7sVar22222.l = eh20.q("audio/mpeg");
                            f7sVar22222.m = eh20.q(bc30Var.b);
                            f7sVar22222.n = 4096;
                            f7sVar22222.C = bc30Var.e;
                            f7sVar22222.D = bc30Var.d;
                            f7sVar22222.F = jtsVar.a;
                            f7sVar22222.G = jtsVar.b;
                            f7sVar22222.k = this.k;
                            if (this.q.j() != -2147483647) {
                            }
                            this.i.d(new a(f7sVar22222));
                            this.n = c5pVar.getPosition();
                        } else {
                            long length3 = c5pVar.getLength();
                            long c03 = (j12 == -1 || j12 == 0) ? -9223372036854775807L : tw21.c0(bc30Var2.d, (bc30Var2.g * j12) - 1);
                            if (c03 != -9223372036854775807L) {
                                if (A != -1) {
                                    length3 = position + A;
                                    j4 = A - bc30Var2.c;
                                } else if (length3 != -1) {
                                    j4 = (length3 - position) - bc30Var2.c;
                                }
                                long j13 = length3;
                                long j14 = j4;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                s6eVar = new s6e(com.google.common.primitives.a.b(tw21.e0(j14, 8000000L, c03, roundingMode)), com.google.common.primitives.a.b(ygb1.c(j14, j12, roundingMode)), j13, position + bc30Var2.c, false);
                                w820Var = this.k;
                                long position322222 = c5pVar.getPosition();
                                if (w820Var != null) {
                                }
                                wk20Var = null;
                                if (this.r) {
                                }
                                this.q = s6eVar2;
                                this.g.w(s6eVar2);
                                f7s f7sVar222222 = new f7s();
                                f7sVar222222.l = eh20.q("audio/mpeg");
                                f7sVar222222.m = eh20.q(bc30Var.b);
                                f7sVar222222.n = 4096;
                                f7sVar222222.C = bc30Var.e;
                                f7sVar222222.D = bc30Var.d;
                                f7sVar222222.F = jtsVar.a;
                                f7sVar222222.G = jtsVar.b;
                                f7sVar222222.k = this.k;
                                if (this.q.j() != -2147483647) {
                                }
                                this.i.d(new a(f7sVar222222));
                                this.n = c5pVar.getPosition();
                            }
                            s6eVar = null;
                            w820Var = this.k;
                            long position3222222 = c5pVar.getPosition();
                            if (w820Var != null) {
                            }
                            wk20Var = null;
                            if (this.r) {
                            }
                            this.q = s6eVar2;
                            this.g.w(s6eVar2);
                            f7s f7sVar2222222 = new f7s();
                            f7sVar2222222.l = eh20.q("audio/mpeg");
                            f7sVar2222222.m = eh20.q(bc30Var.b);
                            f7sVar2222222.n = 4096;
                            f7sVar2222222.C = bc30Var.e;
                            f7sVar2222222.D = bc30Var.d;
                            f7sVar2222222.F = jtsVar.a;
                            f7sVar2222222.G = jtsVar.b;
                            f7sVar2222222.k = this.k;
                            if (this.q.j() != -2147483647) {
                            }
                            this.i.d(new a(f7sVar2222222));
                            this.n = c5pVar.getPosition();
                        }
                    }
                    if (ef90Var2.c >= 40) {
                        ef90Var2.K(36);
                        if (ef90Var2.k() == 1447187017) {
                            i4 = 1447187017;
                            jtsVar = this.d;
                            if (i4 != 1231971951) {
                            }
                            k = ef90Var2.k();
                            if ((k & 1) == 0) {
                            }
                            if ((k & 2) == 0) {
                            }
                            if ((k & 4) != 4) {
                            }
                            if ((k & 8) != 0) {
                            }
                            if (ef90Var2.a() < 24) {
                            }
                            long j122 = C;
                            bc30 bc30Var22 = new bc30();
                            bc30Var22.a = bc30Var.a;
                            bc30Var22.b = bc30Var.b;
                            bc30Var22.c = bc30Var.c;
                            bc30Var22.d = bc30Var.d;
                            bc30Var22.e = bc30Var.e;
                            bc30Var22.f = bc30Var.f;
                            bc30Var22.g = bc30Var.g;
                            if (jtsVar.a != -1) {
                            }
                            jtsVar.a = i6;
                            jtsVar.b = i5;
                            position = c5pVar.getPosition();
                            if (c5pVar.getLength() != -1) {
                                j5 = position + A;
                                if (c5pVar.getLength() != j5) {
                                }
                            }
                            c5pVar.O(bc30Var.c);
                            if (i4 != 1483304551) {
                            }
                        }
                    }
                    i4 = 0;
                    jtsVar = this.d;
                    if (i4 != 1231971951) {
                    }
                    k = ef90Var2.k();
                    if ((k & 1) == 0) {
                    }
                    if ((k & 2) == 0) {
                    }
                    if ((k & 4) != 4) {
                    }
                    if ((k & 8) != 0) {
                    }
                    if (ef90Var2.a() < 24) {
                    }
                    long j1222 = C;
                    bc30 bc30Var222 = new bc30();
                    bc30Var222.a = bc30Var.a;
                    bc30Var222.b = bc30Var.b;
                    bc30Var222.c = bc30Var.c;
                    bc30Var222.d = bc30Var.d;
                    bc30Var222.e = bc30Var.e;
                    bc30Var222.f = bc30Var.f;
                    bc30Var222.g = bc30Var.g;
                    if (jtsVar.a != -1) {
                    }
                    jtsVar.a = i6;
                    jtsVar.b = i5;
                    position = c5pVar.getPosition();
                    if (c5pVar.getLength() != -1) {
                    }
                    c5pVar.O(bc30Var.c);
                    if (i4 != 1483304551) {
                    }
                }
                i3 = 21;
                j2 = -9223372036854775807L;
                j3 = 0;
                if (ef90Var2.c >= i3 + 4) {
                }
                if (ef90Var2.c >= 40) {
                }
                i4 = 0;
                jtsVar = this.d;
                if (i4 != 1231971951) {
                }
                k = ef90Var2.k();
                if ((k & 1) == 0) {
                }
                if ((k & 2) == 0) {
                }
                if ((k & 4) != 4) {
                }
                if ((k & 8) != 0) {
                }
                if (ef90Var2.a() < 24) {
                }
                long j12222 = C;
                bc30 bc30Var2222 = new bc30();
                bc30Var2222.a = bc30Var.a;
                bc30Var2222.b = bc30Var.b;
                bc30Var2222.c = bc30Var.c;
                bc30Var2222.d = bc30Var.d;
                bc30Var2222.e = bc30Var.e;
                bc30Var2222.f = bc30Var.f;
                bc30Var2222.g = bc30Var.g;
                if (jtsVar.a != -1) {
                }
                jtsVar.a = i6;
                jtsVar.b = i5;
                position = c5pVar.getPosition();
                if (c5pVar.getLength() != -1) {
                }
                c5pVar.O(bc30Var.c);
                if (i4 != 1483304551) {
                }
            } else {
                if (i10 == 1) {
                    i3 = 13;
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    if (ef90Var2.c >= i3 + 4) {
                    }
                    if (ef90Var2.c >= 40) {
                    }
                    i4 = 0;
                    jtsVar = this.d;
                    if (i4 != 1231971951) {
                    }
                    k = ef90Var2.k();
                    if ((k & 1) == 0) {
                    }
                    if ((k & 2) == 0) {
                    }
                    if ((k & 4) != 4) {
                    }
                    if ((k & 8) != 0) {
                    }
                    if (ef90Var2.a() < 24) {
                    }
                    long j122222 = C;
                    bc30 bc30Var22222 = new bc30();
                    bc30Var22222.a = bc30Var.a;
                    bc30Var22222.b = bc30Var.b;
                    bc30Var22222.c = bc30Var.c;
                    bc30Var22222.d = bc30Var.d;
                    bc30Var22222.e = bc30Var.e;
                    bc30Var22222.f = bc30Var.f;
                    bc30Var22222.g = bc30Var.g;
                    if (jtsVar.a != -1) {
                    }
                    jtsVar.a = i6;
                    jtsVar.b = i5;
                    position = c5pVar.getPosition();
                    if (c5pVar.getLength() != -1) {
                    }
                    c5pVar.O(bc30Var.c);
                    if (i4 != 1483304551) {
                    }
                }
                i3 = 21;
                j2 = -9223372036854775807L;
                j3 = 0;
                if (ef90Var2.c >= i3 + 4) {
                }
                if (ef90Var2.c >= 40) {
                }
                i4 = 0;
                jtsVar = this.d;
                if (i4 != 1231971951) {
                }
                k = ef90Var2.k();
                if ((k & 1) == 0) {
                }
                if ((k & 2) == 0) {
                }
                if ((k & 4) != 4) {
                }
                if ((k & 8) != 0) {
                }
                if (ef90Var2.a() < 24) {
                }
                long j1222222 = C;
                bc30 bc30Var222222 = new bc30();
                bc30Var222222.a = bc30Var.a;
                bc30Var222222.b = bc30Var.b;
                bc30Var222222.c = bc30Var.c;
                bc30Var222222.d = bc30Var.d;
                bc30Var222222.e = bc30Var.e;
                bc30Var222222.f = bc30Var.f;
                bc30Var222222.g = bc30Var.g;
                if (jtsVar.a != -1) {
                }
                jtsVar.a = i6;
                jtsVar.b = i5;
                position = c5pVar.getPosition();
                if (c5pVar.getLength() != -1) {
                }
                c5pVar.O(bc30Var.c);
                if (i4 != 1483304551) {
                }
            }
        } else {
            th = null;
            j = 1000000;
            j2 = -9223372036854775807L;
            j3 = 0;
            if (this.n != 0) {
                long position4 = c5pVar.getPosition();
                long j15 = this.n;
                if (position4 < j15) {
                    c5pVar.O((int) (j15 - position4));
                }
            }
        }
        if (this.p == 0) {
            c5pVar.J();
            if (!c(c5pVar)) {
                ef90Var.K(0);
                int k4 = ef90Var.k();
                if (((-128000) & k4) != (this.j & (-128000)) || bl91.b(k4) == -1) {
                    c5pVar.O(1);
                    this.j = 0;
                    i = 0;
                    i2 = -1;
                    if (i == i2) {
                        j7q0 j7q0Var2 = this.q;
                        if (j7q0Var2 instanceof grv) {
                            if (j7q0Var2.k() != ((this.m * j) / bc30Var.d) + this.l) {
                                ((grv) this.q).getClass();
                                throw th;
                            }
                        }
                    }
                    return i;
                }
                bc30Var.a(k4);
                if (this.l == j2) {
                    this.l = this.q.f(c5pVar.getPosition());
                    long j16 = this.a;
                    if (j16 != j2) {
                        this.l = (j16 - this.q.f(j3)) + this.l;
                    }
                }
                this.p = bc30Var.c;
                this.o = c5pVar.getPosition() + bc30Var.c;
                if (this.q instanceof grv) {
                    long j17 = ((this.m + bc30Var.g) * j) / bc30Var.d;
                    throw th;
                }
            }
            i = -1;
            i2 = -1;
            if (i == i2) {
            }
            return i;
        }
        int b = this.i.b(c5pVar, this.p, true);
        if (b != -1) {
            int i18 = this.p - b;
            this.p = i18;
            if (i18 <= 0) {
                this.i.c(((this.m * j) / bc30Var.d) + this.l, 1, bc30Var.c, 0, null);
                this.m += bc30Var.g;
                i = 0;
                this.p = 0;
                i2 = -1;
                if (i == i2) {
                }
                return i;
            }
            i = 0;
            i2 = -1;
            if (i == i2) {
            }
            return i;
        }
        i = -1;
        i2 = -1;
        if (i == i2) {
        }
        return i;
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        return f(c5pVar, true);
    }

    @Override // defpackage.b5p
    public final void release() {
    }

    public rb30(int i) {
        this(-9223372036854775807L);
    }

    public rb30() {
        this(0);
    }
}
