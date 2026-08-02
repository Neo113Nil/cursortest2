package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class dhi implements Closeable {
    public final ij3 a;
    public final pn3 b;
    public final pn3 c;
    public int d;
    public boolean e;
    public boolean f;
    public chi g;
    public final qwj h;

    public dhi(ij3 ij3Var, String str) {
        this.a = ij3Var;
        hi3 hi3Var = new hi3();
        hi3Var.S0("--");
        hi3Var.S0(str);
        this.b = hi3Var.g0(hi3Var.b);
        hi3 hi3Var2 = new hi3();
        hi3Var2.S0("\r\n--");
        hi3Var2.S0(str);
        this.c = hi3Var2.g0(hi3Var2.b);
        int i = qwj.d;
        pn3 pn3Var = pn3.d;
        this.h = s7g.y(ovn.C("\r\n--" + str + "--"), ovn.C("\r\n"), ovn.C("--"), ovn.C(StringUtil.SPACE), ovn.C(StringUtil.TAB));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j) {
        pn3 pn3Var;
        ij3 ij3Var;
        long j2;
        pn3 pn3Var2 = this.c;
        long d = pn3Var2.d();
        ij3 ij3Var2 = this.a;
        ij3Var2.a0(d);
        hi3 h = ij3Var2.h();
        h.getClass();
        h.getClass();
        pn3Var2.getClass();
        if (pn3Var2.d() > 0) {
            long j3 = 0;
            if (0 >= 0) {
                xap xapVar = h.a;
                if (xapVar != null) {
                    long j4 = h.b;
                    if (j4 - 0 < 0) {
                        while (j4 > 0) {
                            xapVar = xapVar.g;
                            xapVar.getClass();
                            j4 -= xapVar.c - xapVar.b;
                        }
                        byte[] i = pn3Var2.i();
                        byte b = i[0];
                        int d2 = pn3Var2.d();
                        long j5 = (h.b - d2) + 1;
                        long j6 = 0;
                        loop1: while (j4 < j5) {
                            byte[] bArr = xapVar.a;
                            pn3Var = pn3Var2;
                            ij3Var = ij3Var2;
                            int min = (int) Math.min(xapVar.c, (xapVar.b + j5) - j4);
                            for (int i2 = (int) ((xapVar.b + j6) - j4); i2 < min; i2++) {
                                if (bArr[i2] == b && b.a(xapVar, i2 + 1, i, d2)) {
                                    j2 = (i2 - xapVar.b) + j4;
                                    break loop1;
                                }
                            }
                            j4 += xapVar.c - xapVar.b;
                            xapVar = xapVar.f;
                            xapVar.getClass();
                            j6 = j4;
                            pn3Var2 = pn3Var;
                            ij3Var2 = ij3Var;
                        }
                    } else {
                        pn3Var = pn3Var2;
                        ij3Var = ij3Var2;
                        long j7 = 0;
                        while (true) {
                            long j8 = (xapVar.c - xapVar.b) + j3;
                            if (j8 > 0) {
                                break;
                            }
                            xapVar = xapVar.f;
                            xapVar.getClass();
                            j3 = j8;
                        }
                        byte[] i3 = pn3Var.i();
                        byte b2 = i3[0];
                        int d3 = pn3Var.d();
                        long j9 = (h.b - d3) + 1;
                        loop4: while (j3 < j9) {
                            byte[] bArr2 = xapVar.a;
                            int min2 = (int) Math.min(xapVar.c, (xapVar.b + j9) - j3);
                            for (int i4 = (int) ((xapVar.b + j7) - j3); i4 < min2; i4++) {
                                if (bArr2[i4] == b2 && b.a(xapVar, i4 + 1, i3, d3)) {
                                    j2 = (i4 - xapVar.b) + j3;
                                    break loop4;
                                }
                            }
                            j3 += xapVar.c - xapVar.b;
                            xapVar = xapVar.f;
                            xapVar.getClass();
                            j7 = j3;
                        }
                        j2 = -1;
                    }
                    return j2 == -1 ? Math.min(j, (ij3Var.h().b - pn3Var.d()) + 1) : Math.min(j, j2);
                }
                pn3Var = pn3Var2;
                ij3Var = ij3Var2;
                j2 = -1;
                if (j2 == -1) {
                }
            } else {
                pn3Var = pn3Var2;
                ij3Var = ij3Var2;
                xq0.o(dfi.d(0L, "fromIndex < 0: "));
            }
        } else {
            pn3Var = pn3Var2;
            ij3Var = ij3Var2;
            xq0.x("bytes is empty");
        }
        j2 = 0;
        if (j2 == -1) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.g = null;
        this.a.close();
    }
}
