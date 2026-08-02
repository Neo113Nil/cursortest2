package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class rb4 implements b5p {
    public final ef90 a;
    public final kb b;
    public final boolean c;
    public final o2v0 d;
    public int e;
    public d5p f;
    public sb4 g;
    public long h;
    public rsb[] i;
    public long j;
    public rsb k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public rb4(int i, o2v0 o2v0Var) {
        this.d = o2v0Var;
        this.c = (i & 1) == 0;
        this.a = new ef90(12);
        this.b = new kb();
        this.f = new zc60();
        this.i = new rsb[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (rsb rsbVar : this.i) {
            if (rsbVar.k == 0) {
                rsbVar.i = 0;
            } else {
                rsbVar.i = rsbVar.n[tw21.e(rsbVar.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.e = 0;
        if (this.c) {
            d5pVar = new kzo(d5pVar, this.d);
        }
        this.f = d5pVar;
        this.j = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        boolean z;
        int i;
        rsb rsbVar;
        long j;
        int i2;
        int i3;
        rsb rsbVar2;
        int i4 = 0;
        if (this.j != -1) {
            long position = c5pVar.getPosition();
            long j2 = this.j;
            if (j2 < position || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                xde0Var.a = j2;
                z = true;
                this.j = -1L;
                if (!z) {
                    return 1;
                }
                int i5 = this.e;
                int i6 = 4;
                rsb rsbVar3 = null;
                kb kbVar = this.b;
                int i7 = 2;
                ef90 ef90Var = this.a;
                switch (i5) {
                    case 0:
                        if (!h(c5pVar)) {
                            throw ParserException.a(null, "AVI Header List not found");
                        }
                        c5pVar.O(12);
                        this.e = 1;
                        return 0;
                    case 1:
                        c5pVar.readFully(ef90Var.a, 0, 12);
                        ef90Var.K(0);
                        kbVar.getClass();
                        kbVar.a = ef90Var.m();
                        kbVar.b = ef90Var.m();
                        kbVar.c = 0;
                        if (kbVar.a != 1414744396) {
                            throw ParserException.a(null, "LIST expected, found: " + kbVar.a);
                        }
                        int m = ef90Var.m();
                        kbVar.c = m;
                        if (m == 1819436136) {
                            this.l = kbVar.b;
                            this.e = 2;
                            return 0;
                        }
                        throw ParserException.a(null, "hdrl expected, found: " + kbVar.c);
                    case 2:
                        int i8 = this.l - 4;
                        ef90 ef90Var2 = new ef90(i8);
                        c5pVar.readFully(ef90Var2.a, 0, i8);
                        sqy b = sqy.b(1819436136, ef90Var2);
                        int i9 = b.b;
                        if (i9 != 1819436136) {
                            throw ParserException.a(null, "Unexpected header list type " + i9);
                        }
                        sb4 sb4Var = (sb4) b.a(sb4.class);
                        if (sb4Var == null) {
                            throw ParserException.a(null, "AviHeader not found");
                        }
                        this.g = sb4Var;
                        this.h = sb4Var.c * sb4Var.a;
                        ArrayList arrayList = new ArrayList();
                        piv listIterator = b.a.listIterator(0);
                        int i10 = 0;
                        while (listIterator.hasNext()) {
                            pb4 pb4Var = (pb4) listIterator.next();
                            if (pb4Var.getType() == 1819440243) {
                                sqy sqyVar = (sqy) pb4Var;
                                int i11 = i10 + 1;
                                tb4 tb4Var = (tb4) sqyVar.a(tb4.class);
                                cru0 cru0Var = (cru0) sqyVar.a(cru0.class);
                                if (tb4Var == null) {
                                    lk91.j("Missing Stream Header");
                                } else if (cru0Var == null) {
                                    lk91.j("Missing Stream Format");
                                } else {
                                    i = i11;
                                    long j3 = tb4Var.c;
                                    int i12 = tw21.a;
                                    long e0 = tw21.e0(tb4Var.d, tb4Var.b * 1000000, j3, RoundingMode.DOWN);
                                    a aVar = cru0Var.a;
                                    f7s a = aVar.a();
                                    a.a = Integer.toString(i10);
                                    int i13 = tb4Var.e;
                                    if (i13 != 0) {
                                        a.n = i13;
                                    }
                                    fru0 fru0Var = (fru0) sqyVar.a(fru0.class);
                                    if (fru0Var != null) {
                                        a.b = fru0Var.a;
                                    }
                                    int i14 = eh20.i(aVar.n);
                                    if (i14 == 1 || i14 == i7) {
                                        g001 B = this.f.B(i10, i14);
                                        smw0.u(a, B);
                                        this.h = Math.max(this.h, e0);
                                        rsbVar = new rsb(i10, tb4Var, B);
                                        if (rsbVar != null) {
                                            arrayList.add(rsbVar);
                                        }
                                        i10 = i;
                                    }
                                    rsbVar = null;
                                    if (rsbVar != null) {
                                    }
                                    i10 = i;
                                }
                                i = i11;
                                rsbVar = null;
                                if (rsbVar != null) {
                                }
                                i10 = i;
                            }
                            i4 = 0;
                            i7 = 2;
                        }
                        int i15 = i4;
                        this.i = (rsb[]) arrayList.toArray(new rsb[i15]);
                        this.f.A();
                        this.e = 3;
                        return i15;
                    case 3:
                        if (this.m != -1) {
                            long position2 = c5pVar.getPosition();
                            long j4 = this.m;
                            if (position2 != j4) {
                                this.j = j4;
                                return 0;
                            }
                        }
                        c5pVar.g(0, 12, ef90Var.a);
                        c5pVar.J();
                        ef90Var.K(0);
                        kbVar.getClass();
                        kbVar.a = ef90Var.m();
                        kbVar.b = ef90Var.m();
                        kbVar.c = 0;
                        int m2 = ef90Var.m();
                        int i16 = kbVar.a;
                        if (i16 == 1179011410) {
                            c5pVar.O(12);
                            return 0;
                        }
                        if (i16 != 1414744396 || m2 != 1769369453) {
                            this.j = c5pVar.getPosition() + kbVar.b + 8;
                            return 0;
                        }
                        long position3 = c5pVar.getPosition();
                        this.m = position3;
                        this.n = position3 + kbVar.b + 8;
                        if (!this.p) {
                            sb4 sb4Var2 = this.g;
                            sb4Var2.getClass();
                            if ((sb4Var2.b & 16) == 16) {
                                this.e = 4;
                                this.j = this.n;
                                return 0;
                            }
                            this.f.w(new qb4(this.h));
                            this.p = true;
                        }
                        this.j = c5pVar.getPosition() + 12;
                        this.e = 6;
                        return 0;
                    case 4:
                        c5pVar.readFully(ef90Var.a, 0, 8);
                        ef90Var.K(0);
                        int m3 = ef90Var.m();
                        int m4 = ef90Var.m();
                        if (m3 != 829973609) {
                            this.j = c5pVar.getPosition() + m4;
                            return 0;
                        }
                        this.e = 5;
                        this.o = m4;
                        return 0;
                    case 5:
                        ef90 ef90Var3 = new ef90(this.o);
                        c5pVar.readFully(ef90Var3.a, 0, this.o);
                        if (ef90Var3.a() < 16) {
                            j = 0;
                        } else {
                            int i17 = ef90Var3.b;
                            ef90Var3.L(8);
                            long m5 = ef90Var3.m();
                            long j5 = this.m;
                            j = m5 > j5 ? 0L : j5 + 8;
                            ef90Var3.K(i17);
                        }
                        while (ef90Var3.a() >= 16) {
                            int m6 = ef90Var3.m();
                            int m7 = ef90Var3.m();
                            long m8 = ef90Var3.m() + j;
                            ef90Var3.L(i6);
                            rsb[] rsbVarArr = this.i;
                            int length = rsbVarArr.length;
                            while (true) {
                                if (i3 < length) {
                                    rsbVar2 = rsbVarArr[i3];
                                    i3 = (rsbVar2.c == m6 || rsbVar2.d == m6) ? 0 : i3 + 1;
                                } else {
                                    rsbVar2 = null;
                                }
                            }
                            if (rsbVar2 != null) {
                                boolean z2 = (m7 & 16) == 16;
                                if (rsbVar2.l == -1) {
                                    rsbVar2.l = m8;
                                }
                                if (z2) {
                                    if (rsbVar2.k == rsbVar2.n.length) {
                                        long[] jArr = rsbVar2.m;
                                        rsbVar2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = rsbVar2.n;
                                        rsbVar2.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = rsbVar2.m;
                                    int i18 = rsbVar2.k;
                                    jArr2[i18] = m8;
                                    rsbVar2.n[i18] = rsbVar2.j;
                                    rsbVar2.k = i18 + 1;
                                }
                                rsbVar2.j++;
                            }
                            i6 = 4;
                        }
                        for (rsb rsbVar4 : this.i) {
                            rsbVar4.m = Arrays.copyOf(rsbVar4.m, rsbVar4.k);
                            rsbVar4.n = Arrays.copyOf(rsbVar4.n, rsbVar4.k);
                            if ((rsbVar4.c & 1651965952) == 1651965952 && rsbVar4.a.f != 0 && (i2 = rsbVar4.k) > 0) {
                                rsbVar4.f = i2;
                            }
                        }
                        this.p = true;
                        int length2 = this.i.length;
                        d5p d5pVar = this.f;
                        long j6 = this.h;
                        if (length2 == 0) {
                            d5pVar.w(new qb4(j6));
                        } else {
                            d5pVar.w(new qb4(this, j6, 0));
                        }
                        this.e = 6;
                        this.j = this.m;
                        return 0;
                    case 6:
                        if (c5pVar.getPosition() >= this.n) {
                            return -1;
                        }
                        rsb rsbVar5 = this.k;
                        if (rsbVar5 != null) {
                            int i19 = rsbVar5.h;
                            int b2 = i19 - rsbVar5.b.b(c5pVar, i19, false);
                            rsbVar5.h = b2;
                            boolean z3 = b2 == 0;
                            if (z3) {
                                if (rsbVar5.g > 0) {
                                    g001 g001Var = rsbVar5.b;
                                    int i20 = rsbVar5.i;
                                    g001Var.c((rsbVar5.e * i20) / rsbVar5.f, Arrays.binarySearch(rsbVar5.n, i20) >= 0 ? 1 : 0, rsbVar5.g, 0, null);
                                }
                                rsbVar5.i++;
                            }
                            if (z3) {
                                this.k = null;
                            }
                            return 0;
                        }
                        if ((c5pVar.getPosition() & 1) == 1) {
                            c5pVar.O(1);
                        }
                        c5pVar.g(0, 12, ef90Var.a);
                        ef90Var.K(0);
                        int m9 = ef90Var.m();
                        if (m9 == 1414744396) {
                            ef90Var.K(8);
                            c5pVar.O(ef90Var.m() == 1769369453 ? 12 : 8);
                            c5pVar.J();
                            return 0;
                        }
                        int m10 = ef90Var.m();
                        if (m9 == 1263424842) {
                            this.j = c5pVar.getPosition() + m10 + 8;
                            return 0;
                        }
                        c5pVar.O(8);
                        c5pVar.J();
                        for (rsb rsbVar6 : this.i) {
                            if (rsbVar6.c == m9 || rsbVar6.d == m9) {
                                rsbVar3 = rsbVar6;
                                if (rsbVar3 != null) {
                                    this.j = c5pVar.getPosition() + m10;
                                    return 0;
                                }
                                rsbVar3.g = m10;
                                rsbVar3.h = m10;
                                this.k = rsbVar3;
                                return 0;
                            }
                        }
                        if (rsbVar3 != null) {
                        }
                        break;
                    default:
                        ny61.w();
                        return 0;
                }
            } else {
                c5pVar.O((int) (j2 - position));
            }
        }
        z = false;
        this.j = -1L;
        if (!z) {
        }
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        ef90 ef90Var = this.a;
        c5pVar.g(0, 12, ef90Var.a);
        ef90Var.K(0);
        if (ef90Var.m() == 1179011410) {
            ef90Var.L(4);
            if (ef90Var.m() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b5p
    public final void release() {
    }

    @Deprecated
    public rb4() {
        this(1, o2v0.d4);
    }
}
