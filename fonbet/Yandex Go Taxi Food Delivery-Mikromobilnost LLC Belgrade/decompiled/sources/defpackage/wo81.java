package defpackage;

import yads.rn0;

/* loaded from: classes7.dex */
public final class wo81 implements lf81 {
    public final qzt0 a;
    public final rn0 b;
    public gy61 c;
    public lf81 w;
    public boolean x = true;
    public boolean y;

    public wo81(rn0 rn0Var, xb71 xb71Var) {
        this.b = rn0Var;
        this.a = new qzt0(xb71Var);
    }

    @Override // defpackage.lf81
    public final long a() {
        if (this.x) {
            return this.a.a();
        }
        lf81 lf81Var = this.w;
        lf81Var.getClass();
        return lf81Var.a();
    }

    @Override // defpackage.lf81
    public final void e(kv71 kv71Var) {
        lf81 lf81Var = this.w;
        if (lf81Var != null) {
            lf81Var.e(kv71Var);
            kv71Var = this.w.getPlaybackParameters();
        }
        this.a.e(kv71Var);
    }

    @Override // defpackage.lf81
    public final kv71 getPlaybackParameters() {
        lf81 lf81Var = this.w;
        return lf81Var != null ? lf81Var.getPlaybackParameters() : (kv71) this.a.x;
    }
}
