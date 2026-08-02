package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class xhs0 extends z35 {
    public final int H;
    public final a I;
    public long J;
    public boolean K;

    public xhs0(kpg kpgVar, npg npgVar, a aVar, int i, Object obj, long j, long j2, long j3, int i2, a aVar2) {
        super(kpgVar, npgVar, aVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.H = i2;
        this.I = aVar2;
    }

    @Override // defpackage.ib10
    public final boolean b() {
        return this.K;
    }

    @Override // defpackage.pyy
    public final void d() {
    }

    @Override // defpackage.pyy
    public final void load() {
        x7u0 x7u0Var = this.B;
        ymu ymuVar = this.F;
        d6z.z(ymuVar);
        ymuVar.F(0L);
        g001 K = ymuVar.K(this.H);
        K.d(this.I);
        try {
            long open = x7u0Var.open(this.b.d(this.J));
            if (open != -1) {
                open += this.J;
            }
            kbh kbhVar = new kbh(this.B, this.J, open);
            int i = 0;
            while (true) {
                long j = this.J;
                if (i == -1) {
                    K.c(this.z, 1, (int) j, 0, null);
                    yri0.b(x7u0Var);
                    this.K = true;
                    return;
                }
                this.J = j + i;
                i = K.b(kbhVar, Integer.MAX_VALUE, true);
            }
        } catch (Throwable th) {
            yri0.b(x7u0Var);
            throw th;
        }
    }
}
