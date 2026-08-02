package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes8.dex */
public class uku extends vku {
    public final yyl0 b;
    public final yyl0 c;

    public uku(String str, po6 po6Var) {
        super(str);
        try {
            yyl0 yyl0Var = new yyl0(ByteBuffer.wrap(MessageDigest.getInstance("MD5").digest(str.getBytes(uza.a))).order(ByteOrder.BIG_ENDIAN).getLong(), po6Var);
            this.b = yyl0Var;
            this.c = new yyl0(yyl0Var.a.a, po6Var);
        } catch (NoSuchAlgorithmException e) {
            ny61.o(e);
            throw null;
        }
    }

    @Override // defpackage.vku
    public final void a(int i, int i2) {
        int i3;
        po6 po6Var;
        yyl0 yyl0Var = this.b;
        po6 po6Var2 = yyl0Var.b;
        int i4 = po6Var2.a[0];
        int a = po6Var2.a();
        po6 po6Var3 = yyl0Var.b;
        int i5 = po6Var3.a[a];
        if (i > 2147483646) {
            i = 2147483646;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 <= 0) {
            return;
        }
        int g = yyl0Var.g(i);
        if (yyl0Var.f() == null) {
            int[] iArr = po6Var3.a;
            int i6 = iArr.length < 2 ? Integer.MAX_VALUE : iArr[iArr.length - 2];
            if (bvf0.g(yyl0Var.a.e, g, i2)) {
                int i7 = i < i6 ? i : 0;
                long j = i2;
                yyl0Var.d(i2, i * j, i7 * j);
                if (yyl0Var.f() != null) {
                    yyl0Var.i();
                    return;
                }
                return;
            }
            i3 = i2;
            po6Var = po6Var3;
            yyl0Var.h();
        } else {
            i3 = i2;
            po6Var = po6Var3;
        }
        yyl0Var.f().addAndGet(g, i3);
        int[] iArr2 = po6Var.a;
        long j2 = i3;
        yyl0Var.d(i3, i * j2, j2 * (i < (iArr2.length >= 2 ? iArr2[iArr2.length - 2] : Integer.MAX_VALUE) ? i : 0));
    }

    @Override // defpackage.vku
    public final void b(int i) {
        a(i, 1);
    }

    @Override // defpackage.vku
    public final int d(nlu nluVar) {
        yyl0 yyl0Var = this.b;
        int a = yyl0Var.b.a();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < a) {
            int i4 = yyl0Var.b.a[i];
            if (i2 >= i4) {
                i3 = 2;
            }
            i++;
            i2 = i4;
        }
        po6 po6Var = yyl0Var.b;
        if (po6Var.b != po6Var.b()) {
            i3 |= 1;
        }
        long c = nluVar.a.d.get() - nluVar.c();
        if (c != 0) {
            int i5 = (int) c;
            if (i5 != c) {
                i5 = Integer.MAX_VALUE;
            }
            if (i5 > 0) {
                if (i5 > 5) {
                    return i3 | 4;
                }
            } else if ((-i5) > 5) {
                return i3 | 8;
            }
        }
        return i3;
    }

    @Override // defpackage.vku
    public final boolean e(int i, int i2, int i3) {
        yyl0 yyl0Var = this.b;
        if (i3 != yyl0Var.b.a()) {
            return false;
        }
        po6 po6Var = yyl0Var.b;
        if (i != (po6Var.a() < 2 ? -1 : po6Var.a[1])) {
            return false;
        }
        po6 po6Var2 = yyl0Var.b;
        return i2 == (po6Var2.a() >= 2 ? po6Var2.a[po6Var2.a() - 1] : -1);
    }

    @Override // defpackage.vku
    public final long f() {
        return this.b.a.a;
    }

    @Override // defpackage.vku
    public final nlu g() {
        yyl0 yyl0Var = this.b;
        nlu yyl0Var2 = new yyl0(yyl0Var.a.a, yyl0Var.b);
        yyl0Var2.a(yyl0Var);
        v820 v820Var = yyl0Var2.a;
        yyl0Var.d(-v820Var.d.get(), -v820Var.b.get(), -v820Var.c.get());
        yyl0Var.b(yyl0Var2.e(), 1);
        this.c.a(yyl0Var2);
        return yyl0Var2;
    }
}
