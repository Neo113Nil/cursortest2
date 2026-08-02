package defpackage;

import com.appsflyer.internal.k;

/* loaded from: classes4.dex */
public final class lj3 implements ta7 {
    public final so3 a;
    public final xol b;
    public final boolean c;
    public final boolean d;
    public final byte[] e;
    public int f;
    public int g;
    public nb7 h;
    public rc6 i;

    public lj3(so3 so3Var, xol xolVar, boolean z, boolean z2) {
        xolVar.getClass();
        this.a = so3Var;
        this.b = xolVar;
        this.c = z;
        this.d = z2;
        this.e = new byte[524288];
    }

    @Override // defpackage.ta7
    public final void a(nb7 nb7Var) {
        if (!nb7Var.c(4)) {
            throw new Exception("DataSpec disallowed cache fragmentation");
        }
        this.h = nb7Var;
        this.f = 0;
        this.g = 0;
    }

    public final void b(int i) {
        jq3 g;
        nb7 nb7Var = this.h;
        nb7Var.getClass();
        String str = nb7Var.h;
        long j = 0;
        long j2 = i;
        long j3 = 0;
        long j4 = nb7Var.f + this.g;
        while (true) {
            if (j2 <= j) {
                break;
            }
            boolean z = this.c;
            so3 so3Var = this.a;
            if (z) {
                str.getClass();
                g = so3Var.f(j4, j2, str);
            } else {
                str.getClass();
                g = so3Var.g(j4, j2, str);
            }
            jq3 jq3Var = g;
            if (jq3Var == null) {
                long j5 = j4 + j2;
                StringBuilder q = k.q("skip: fragment '", j4, str, "' in range [");
                q.append(", ");
                q.append(j5);
                q.append("] is locked");
                ssg.a(3, "SharedPlayerImpl:BufferingDataSink", q.toString(), null);
                break;
            }
            nb7 nb7Var2 = nb7Var;
            long j6 = jq3Var.c;
            long j7 = j2;
            if (jq3Var.d) {
                j6 -= j4 - jq3Var.b;
                StringBuilder q2 = k.q("skip: fragment '", j4, str, "' in range [");
                q2.append(", ");
                q2.append(j4 + j6);
                q2.append("] already cached");
                String sb = q2.toString();
                so3Var = null;
                ssg.a(3, "SharedPlayerImpl:BufferingDataSink", sb, null);
            } else {
                try {
                    hp3 hp3Var = new hp3(so3Var, 524288);
                    mb7 a = nb7Var2.a();
                    a.f = j4;
                    a.g = j6;
                    hp3Var.a(a.a());
                    hp3Var.write(this.e, (int) j3, (int) j6);
                    rc6 rc6Var = this.i;
                    if (rc6Var != null) {
                        str.getClass();
                        so3Var.l(str, rc6Var);
                    }
                    hp3Var.close();
                } catch (oo3 e) {
                    if (!this.d) {
                        throw e;
                    }
                    this.b.c(e);
                }
                so3Var.b(jq3Var);
            }
            try {
                j3 += j6;
                j4 += j6;
                j2 = j7 - j6;
                nb7Var = nb7Var2;
                j = 0;
            } catch (Throwable th) {
                so3Var.b(jq3Var);
                throw th;
            }
        }
        this.f = 0;
        this.g += i;
    }

    @Override // defpackage.ta7
    public final void close() {
        if (this.h == null) {
            return;
        }
        int i = this.f;
        if (i > 0) {
            b(i);
        }
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.ta7
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int i3 = 0;
        while (i3 < i2) {
            if (this.f == 524288) {
                b(524288);
            }
            int i4 = i2 - i3;
            int i5 = this.f;
            int i6 = 524288 - i5;
            if (i4 > i6) {
                i4 = i6;
            }
            System.arraycopy(bArr, i + i3, this.e, i5, i4);
            i3 += i4;
            this.f += i4;
        }
    }
}
