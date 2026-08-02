package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class swv extends nsb {
    public final osb C;
    public ymu D;
    public long E;
    public volatile boolean F;

    public swv(kpg kpgVar, npg npgVar, a aVar, int i, Object obj, osb osbVar) {
        super(kpgVar, npgVar, 2, aVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.C = osbVar;
    }

    @Override // defpackage.pyy
    public final void d() {
        this.F = true;
    }

    @Override // defpackage.pyy
    public final void load() {
        if (this.E == 0) {
            ((su6) this.C).b(this.D, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            npg d = this.b.d(this.E);
            x7u0 x7u0Var = this.B;
            kbh kbhVar = new kbh(x7u0Var, d.f, x7u0Var.open(d));
            while (!this.F && ((su6) this.C).c(kbhVar)) {
                try {
                } finally {
                    this.E = kbhVar.w - this.b.f;
                    ((su6) this.C).a();
                }
            }
        } finally {
            yri0.b(this.B);
        }
    }
}
