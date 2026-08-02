package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes7.dex */
public final class vq81 implements u871 {
    public final u871 a;
    public final int b;
    public final c471 c;
    public final byte[] w;
    public int x;

    public vq81(u871 u871Var, int i, c471 c471Var) {
        if (i <= 0) {
            w511.q();
            throw null;
        }
        this.a = u871Var;
        this.b = i;
        this.c = c471Var;
        this.w = new byte[1];
        this.x = i;
    }

    @Override // defpackage.u871
    public final long Q(no71 no71Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.u871
    public final void S(mr81 mr81Var) {
        mr81Var.getClass();
        this.a.S(mr81Var);
    }

    @Override // defpackage.u871
    public final Map b() {
        return this.a.b();
    }

    @Override // defpackage.u871
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.u871
    public final Uri d() {
        return this.a.d();
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        int i3 = this.x;
        u871 u871Var = this.a;
        if (i3 == 0) {
            int i4 = 0;
            byte[] bArr2 = this.w;
            if (u871Var.v(0, 1, bArr2) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int v = u871Var.v(i4, i6, bArr3);
                        if (v != -1) {
                            i4 += v;
                            i6 -= v;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        dl81 dl81Var = new dl81(bArr3, i5);
                        c471 c471Var = this.c;
                        long max = !c471Var.l ? c471Var.i : Math.max(c471Var.m.b(true), c471Var.i);
                        int i7 = dl81Var.c - dl81Var.b;
                        ed81 ed81Var = c471Var.k;
                        ed81Var.getClass();
                        ed81Var.a(i7, dl81Var);
                        ed81Var.b(max, 1, i7, 0, null);
                        c471Var.l = true;
                    }
                }
                this.x = this.b;
            }
            return -1;
        }
        int v2 = u871Var.v(i, Math.min(this.x, i2), bArr);
        if (v2 != -1) {
            this.x -= v2;
        }
        return v2;
    }
}
