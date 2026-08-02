package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class bhi extends h0o {
    public static final twh e;
    public static final twh f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final pn3 a;
    public final List b;
    public final twh c;
    public long d;

    static {
        Pattern pattern = twh.e;
        e = q5g.C("multipart/mixed");
        q5g.C("multipart/alternative");
        q5g.C("multipart/digest");
        q5g.C("multipart/parallel");
        f = q5g.C("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public bhi(pn3 pn3Var, twh twhVar, List list) {
        pn3Var.getClass();
        twhVar.getClass();
        list.getClass();
        this.a = pn3Var;
        this.b = list;
        Pattern pattern = twh.e;
        this.c = q5g.C(twhVar + "; boundary=" + pn3Var.u());
        this.d = -1L;
    }

    @Override // defpackage.h0o
    public final long a() {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long e2 = e(null, true);
        this.d = e2;
        return e2;
    }

    @Override // defpackage.h0o
    public final twh b() {
        return this.c;
    }

    @Override // defpackage.h0o
    public final void d(gj3 gj3Var) {
        e(gj3Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(gj3 gj3Var, boolean z) {
        hi3 hi3Var;
        gj3 gj3Var2;
        if (z) {
            gj3Var2 = new hi3();
            hi3Var = gj3Var2;
        } else {
            hi3Var = 0;
            gj3Var2 = gj3Var;
        }
        List list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            pn3 pn3Var = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                gj3Var2.getClass();
                gj3Var2.write(bArr);
                gj3Var2.W(pn3Var);
                gj3Var2.write(bArr);
                gj3Var2.write(bArr2);
                if (!z) {
                    return j;
                }
                hi3Var.getClass();
                long j2 = j + hi3Var.b;
                hi3Var.b();
                return j2;
            }
            ahi ahiVar = (ahi) list.get(i2);
            zvd zvdVar = ahiVar.a;
            h0o h0oVar = ahiVar.b;
            gj3Var2.getClass();
            gj3Var2.write(bArr);
            gj3Var2.W(pn3Var);
            gj3Var2.write(bArr2);
            int size2 = zvdVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                gj3Var2.M(zvdVar.g(i3)).write(g).M(zvdVar.q(i3)).write(bArr2);
            }
            twh b = h0oVar.b();
            if (b != null) {
                gj3Var2.M("Content-Type: ").M(b.a).write(bArr2);
            }
            long a = h0oVar.a();
            if (a != -1) {
                gj3Var2.M("Content-Length: ").c0(a).write(bArr2);
            } else if (z) {
                hi3Var.getClass();
                hi3Var.b();
                return -1L;
            }
            gj3Var2.write(bArr2);
            if (z) {
                j += a;
            } else {
                h0oVar.d(gj3Var2);
            }
            gj3Var2.write(bArr2);
            i2++;
        }
    }
}
