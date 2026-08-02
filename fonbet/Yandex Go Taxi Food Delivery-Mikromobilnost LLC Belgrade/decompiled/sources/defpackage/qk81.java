package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.ar;

/* loaded from: classes7.dex */
public final class qk81 implements u871 {
    public final u871 a;
    public final hn61 b;
    public boolean c;
    public long w;

    public qk81(u871 u871Var, hn61 hn61Var) {
        u871Var.getClass();
        this.a = u871Var;
        hn61Var.getClass();
        this.b = hn61Var;
    }

    @Override // defpackage.u871
    public final long Q(no71 no71Var) {
        long Q = this.a.Q(no71Var);
        this.w = Q;
        if (Q == 0) {
            return 0L;
        }
        if (no71Var.f == -1 && Q != -1) {
            no71Var = no71Var.a(0L, Q);
        }
        int i = no71Var.h;
        this.c = true;
        hn61 hn61Var = this.b;
        hn61Var.getClass();
        no71Var.g.getClass();
        if (no71Var.f == -1 && (i & 2) == 2) {
            hn61Var.b = null;
        } else {
            hn61Var.b = no71Var;
            hn61Var.c = (i & 4) == 4 ? 5242880L : ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            hn61Var.g = 0L;
            try {
                hn61Var.b(no71Var);
            } catch (IOException e) {
                throw new ar(e);
            }
        }
        return this.w;
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
        hn61 hn61Var = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (hn61Var.b == null) {
                    return;
                }
                try {
                    hn61Var.a();
                } catch (IOException e) {
                    throw new ar(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                if (hn61Var.b != null) {
                    try {
                        hn61Var.a();
                    } catch (IOException e2) {
                        throw new ar(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.u871
    public final Uri d() {
        return this.a.d();
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        if (this.w == 0) {
            return -1;
        }
        int v = this.a.v(i, i2, bArr);
        if (v > 0) {
            hn61 hn61Var = this.b;
            no71 no71Var = hn61Var.b;
            if (no71Var != null) {
                int i3 = 0;
                while (i3 < v) {
                    try {
                        if (hn61Var.f == hn61Var.c) {
                            hn61Var.a();
                            hn61Var.b(no71Var);
                        }
                        int min = (int) Math.min(v - i3, hn61Var.c - hn61Var.f);
                        k2k0 k2k0Var = hn61Var.e;
                        int i4 = rf71.a;
                        k2k0Var.write(bArr, i + i3, min);
                        i3 += min;
                        long j = min;
                        hn61Var.f += j;
                        hn61Var.g += j;
                    } catch (IOException e) {
                        throw new ar(e);
                    }
                }
            }
            long j2 = this.w;
            if (j2 != -1) {
                this.w = j2 - v;
            }
        }
        return v;
    }
}
