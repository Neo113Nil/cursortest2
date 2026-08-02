package defpackage;

import android.util.Pair;
import androidx.media3.common.a;
import java.util.Arrays;
import java.util.Collections;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class t4u implements tqn {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public g001 b;
    public final a201 c;
    public final String d;
    public final ef90 e;
    public final c150 f;
    public final boolean[] g = new boolean[4];
    public final s4u h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public t4u(a201 a201Var, String str) {
        this.c = a201Var;
        this.d = str;
        s4u s4uVar = new s4u();
        s4uVar.d = new byte[128];
        this.h = s4uVar;
        if (a201Var != null) {
            this.f = new c150(178, 0);
            this.e = new ef90();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
    @Override // defpackage.tqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ef90 ef90Var) {
        s4u s4uVar;
        c150 c150Var;
        int i;
        boolean z;
        int i2;
        long j;
        boolean z2;
        boolean z3;
        long j2;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        long j3;
        d6z.z(this.b);
        int i6 = ef90Var.b;
        int i7 = ef90Var.c;
        byte[] bArr = ef90Var.a;
        this.i += ef90Var.a();
        boolean z4 = 0;
        this.b.a(ef90Var, ef90Var.a(), 0);
        while (true) {
            int b = l150.b(bArr, i6, i7, this.g);
            s4uVar = this.h;
            c150Var = this.f;
            if (b == i7) {
                break;
            }
            int i8 = b + 3;
            int i9 = ef90Var.a[i8] & 255;
            int i10 = b - i6;
            if (this.k) {
                i = i7;
            } else {
                if (i10 > 0) {
                    s4uVar.b(i6, b, bArr);
                }
                int i11 = i10 < 0 ? -i10 : z4;
                if (s4uVar.c) {
                    int i12 = s4uVar.a - i11;
                    s4uVar.a = i12;
                    if (s4uVar.b == 0 && i9 == 181) {
                        s4uVar.b = i12;
                        i = i7;
                    } else {
                        s4uVar.c = z4;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf((byte[]) s4uVar.d, s4uVar.a);
                        int i13 = copyOf[4] & 255;
                        byte b2 = copyOf[5];
                        i = i7;
                        int i14 = ((b2 & 255) >> 4) | (i13 << 4);
                        int i15 = (copyOf[6] & 255) | ((b2 & PKIBody._CCP) << 8);
                        int i16 = (copyOf[7] & 240) >> 4;
                        if (i16 == 2) {
                            f = i15 * 4;
                            i4 = i14 * 3;
                        } else if (i16 == 3) {
                            f = i15 * 16;
                            i4 = i14 * 9;
                        } else if (i16 != 4) {
                            f2 = 1.0f;
                            f7s f7sVar = new f7s();
                            f7sVar.a = str;
                            f7sVar.l = eh20.q(this.d);
                            f7sVar.m = eh20.q("video/mpeg2");
                            f7sVar.t = i14;
                            f7sVar.u = i15;
                            f7sVar.x = f2;
                            f7sVar.p = Collections.singletonList(copyOf);
                            a aVar = new a(f7sVar);
                            i5 = (copyOf[7] & PKIBody._CCP) - 1;
                            if (i5 >= 0 || i5 >= 8) {
                                j3 = 0;
                            } else {
                                double d = r[i5];
                                byte b3 = copyOf[s4uVar.b + 9];
                                int i17 = (b3 & 96) >> 5;
                                if (i17 != (b3 & 31)) {
                                    d *= (i17 + 1.0d) / (r6 + 1);
                                }
                                j3 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(aVar, Long.valueOf(j3));
                            this.b.d((a) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f = i15 * Constants.VPN_TRAFFIC;
                            i4 = i14 * 100;
                        }
                        f2 = f / i4;
                        f7s f7sVar2 = new f7s();
                        f7sVar2.a = str;
                        f7sVar2.l = eh20.q(this.d);
                        f7sVar2.m = eh20.q("video/mpeg2");
                        f7sVar2.t = i14;
                        f7sVar2.u = i15;
                        f7sVar2.x = f2;
                        f7sVar2.p = Collections.singletonList(copyOf);
                        a aVar2 = new a(f7sVar2);
                        i5 = (copyOf[7] & PKIBody._CCP) - 1;
                        if (i5 >= 0) {
                        }
                        j3 = 0;
                        Pair create2 = Pair.create(aVar2, Long.valueOf(j3));
                        this.b.d((a) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i7;
                    if (i9 == 179) {
                        s4uVar.c = true;
                    }
                }
                s4uVar.b(0, 3, s4u.e);
            }
            if (c150Var != null) {
                if (i10 > 0) {
                    c150Var.c(i6, b, bArr);
                    i3 = 0;
                } else {
                    i3 = -i10;
                }
                if (c150Var.e(i3)) {
                    int l = l150.l(c150Var.e, c150Var.d);
                    int i18 = tw21.a;
                    byte[] bArr2 = c150Var.d;
                    ef90 ef90Var2 = this.e;
                    ef90Var2.I(l, bArr2);
                    this.c.c(this.o, ef90Var2);
                }
                if (i9 == 178) {
                    z = true;
                    if (ef90Var.a[b + 2] == 1) {
                        c150Var.g(i9);
                    }
                    if (i9 != 0 || i9 == 179) {
                        i2 = i - b;
                        if (this.q && this.k) {
                            j2 = this.o;
                            if (j2 != -9223372036854775807L) {
                                this.b.c(j2, this.p ? 1 : 0, ((int) (this.i - this.n)) - i2, i2, null);
                            }
                        }
                        if (this.j || this.q) {
                            this.n = this.i - i2;
                            j = this.m;
                            if (j == -9223372036854775807L) {
                                long j4 = this.o;
                                j = j4 != -9223372036854775807L ? j4 + this.l : -9223372036854775807L;
                            }
                            this.o = j;
                            z2 = false;
                            this.p = false;
                            this.m = -9223372036854775807L;
                            z3 = true;
                            this.j = true;
                        } else {
                            z3 = true;
                            z2 = false;
                        }
                        this.q = i9 != 0 ? z3 : z2 ? 1 : 0;
                    } else {
                        if (i9 == 184) {
                            this.p = z;
                        }
                        z2 = false;
                    }
                    i6 = i8;
                    i7 = i;
                    z4 = z2;
                }
            }
            z = true;
            if (i9 != 0) {
            }
            i2 = i - b;
            if (this.q) {
                j2 = this.o;
                if (j2 != -9223372036854775807L) {
                }
            }
            if (this.j) {
            }
            this.n = this.i - i2;
            j = this.m;
            if (j == -9223372036854775807L) {
            }
            this.o = j;
            z2 = false;
            this.p = false;
            this.m = -9223372036854775807L;
            z3 = true;
            this.j = true;
            this.q = i9 != 0 ? z3 : z2 ? 1 : 0;
            i6 = i8;
            i7 = i;
            z4 = z2;
        }
        if (!this.k) {
            s4uVar.b(i6, i7, bArr);
        }
        if (c150Var != null) {
            c150Var.c(i6, i7, bArr);
        }
    }

    @Override // defpackage.tqn
    public final void d() {
        l150.a(this.g);
        s4u s4uVar = this.h;
        s4uVar.c = false;
        s4uVar.a = 0;
        s4uVar.b = 0;
        c150 c150Var = this.f;
        if (c150Var != null) {
            c150Var.f();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.tqn
    public final void e(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.tqn
    public final void g(boolean z) {
        d6z.z(this.b);
        if (z) {
            boolean z2 = this.p;
            this.b.c(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // defpackage.tqn
    public final void h(d5p d5pVar, xi11 xi11Var) {
        xi11Var.c();
        xi11Var.d();
        this.a = xi11Var.e;
        xi11Var.d();
        this.b = d5pVar.B(xi11Var.d, 2);
        a201 a201Var = this.c;
        if (a201Var != null) {
            a201Var.e(d5pVar, xi11Var);
        }
    }
}
