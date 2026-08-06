package defpackage;

/* loaded from: classes.dex */
public final class e30 extends defpackage.nj implements defpackage.jn {
    public final android.os.Handler AARZUJiTa;
    public final java.lang.String EXtogiMhuM;
    public final defpackage.e30 SH1y5HwkJhh;
    public final boolean riuEU0zW4;

    public e30(android.os.Handler handler, java.lang.String str, boolean z) {
        this.AARZUJiTa = handler;
        this.EXtogiMhuM = str;
        this.riuEU0zW4 = z;
        this.SH1y5HwkJhh = z ? this : new defpackage.e30(handler, str, true);
    }

    @Override // defpackage.jn
    public final defpackage.kq AARZUJiTa(long j, final defpackage.zg1 zg1Var, defpackage.lj ljVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.AARZUJiTa.postDelayed(zg1Var, j)) {
            return new defpackage.kq() { // from class: c30
                @Override // defpackage.kq
                public final void IHQe1A4L2xu() {
                    defpackage.e30.this.AARZUJiTa.removeCallbacks(zg1Var);
                }
            };
        }
        p4kuH6PDtgom(ljVar, zg1Var);
        return defpackage.pp0.adDC3e2L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.e30)) {
            return false;
        }
        defpackage.e30 e30Var = (defpackage.e30) obj;
        return e30Var.AARZUJiTa == this.AARZUJiTa && e30Var.riuEU0zW4 == this.riuEU0zW4;
    }

    @Override // defpackage.nj
    public final boolean frpfPPIgqM9O(defpackage.lj ljVar) {
        return (this.riuEU0zW4 && defpackage.x70.QoRHpC4k(android.os.Looper.myLooper(), this.AARZUJiTa.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return (this.riuEU0zW4 ? 1231 : 1237) ^ java.lang.System.identityHashCode(this.AARZUJiTa);
    }

    public final void p4kuH6PDtgom(defpackage.lj ljVar, java.lang.Runnable runnable) {
        defpackage.x80.riuEU0zW4(ljVar, new java.util.concurrent.CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        defpackage.bn bnVar = defpackage.bq.IHQe1A4L2xu;
        defpackage.vm.AARZUJiTa.v5iciZok(ljVar, runnable);
    }

    @Override // defpackage.jn
    public final void riuEU0zW4(long j, defpackage.bb bbVar) {
        defpackage.d30 d30Var = new defpackage.d30(bbVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.AARZUJiTa.postDelayed(d30Var, j)) {
            bbVar.QQUzIjv3iOC5(new defpackage.r1MBDhnF(9, this, d30Var));
        } else {
            p4kuH6PDtgom(bbVar.riuEU0zW4, d30Var);
        }
    }

    @Override // defpackage.nj
    public final java.lang.String toString() {
        defpackage.e30 e30Var;
        java.lang.String str;
        defpackage.bn bnVar = defpackage.bq.IHQe1A4L2xu;
        defpackage.e30 e30Var2 = defpackage.jg0.IHQe1A4L2xu;
        if (this == e30Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                e30Var = e30Var2.SH1y5HwkJhh;
            } catch (java.lang.UnsupportedOperationException unused) {
                e30Var = null;
            }
            str = this == e30Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        java.lang.String str2 = this.EXtogiMhuM;
        if (str2 == null) {
            str2 = this.AARZUJiTa.toString();
        }
        if (!this.riuEU0zW4) {
            return str2;
        }
        return str2 + ".immediate";
    }

    @Override // defpackage.nj
    public final void v5iciZok(defpackage.lj ljVar, java.lang.Runnable runnable) {
        if (this.AARZUJiTa.post(runnable)) {
            return;
        }
        p4kuH6PDtgom(ljVar, runnable);
    }

    public e30(android.os.Handler handler) {
        this(handler, null, false);
    }
}
