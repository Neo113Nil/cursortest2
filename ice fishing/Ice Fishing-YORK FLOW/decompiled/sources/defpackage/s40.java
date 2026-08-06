package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class s40 extends defpackage.lm implements defpackage.uo {
    public final defpackage.s40 GE9mJIPrb8gP;
    public final java.lang.String P05cfTpS5W5L;
    public final android.os.Handler QiMR8OkAhezm;
    public final boolean e6mdH7fiFuta;

    public s40(android.os.Handler handler, java.lang.String str, boolean z) {
        this.QiMR8OkAhezm = handler;
        this.P05cfTpS5W5L = str;
        this.e6mdH7fiFuta = z;
        this.GE9mJIPrb8gP = z ? this : new defpackage.s40(handler, str, true);
    }

    public final void IBvW5fLsPuHy(defpackage.jm jmVar, java.lang.Runnable runnable) {
        defpackage.b80.P05cfTpS5W5L(jmVar, new java.util.concurrent.CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        defpackage.jo joVar = defpackage.tq.ZpBGe2uQfcn8;
        defpackage.co.QiMR8OkAhezm.jjTN4uUnoyEn(jmVar, runnable);
    }

    @Override // defpackage.uo
    public final defpackage.cr QiMR8OkAhezm(long j, final defpackage.ho1 ho1Var, defpackage.jm jmVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.QiMR8OkAhezm.postDelayed(ho1Var, j)) {
            return new defpackage.cr() { // from class: r40
                @Override // defpackage.cr
                public final void ZpBGe2uQfcn8() {
                    defpackage.s40.this.QiMR8OkAhezm.removeCallbacks(ho1Var);
                }
            };
        }
        IBvW5fLsPuHy(jmVar, ho1Var);
        return defpackage.zr0.WDYagTQQm9ns;
    }

    @Override // defpackage.uo
    public final void e6mdH7fiFuta(long j, defpackage.dd ddVar) {
        defpackage.vc vcVar = new defpackage.vc(1, ddVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.QiMR8OkAhezm.postDelayed(vcVar, j)) {
            ddVar.oCu53ZX2v4Ju(new defpackage.fWTAfUmVKrZq(14, this, vcVar));
        } else {
            IBvW5fLsPuHy(ddVar.e6mdH7fiFuta, vcVar);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.s40)) {
            return false;
        }
        defpackage.s40 s40Var = (defpackage.s40) obj;
        return s40Var.QiMR8OkAhezm == this.QiMR8OkAhezm && s40Var.e6mdH7fiFuta == this.e6mdH7fiFuta;
    }

    @Override // defpackage.lm
    public final boolean frSwwKIlbUhK(defpackage.jm jmVar) {
        return (this.e6mdH7fiFuta && defpackage.ma0.QiMR8OkAhezm(android.os.Looper.myLooper(), this.QiMR8OkAhezm.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return (this.e6mdH7fiFuta ? 1231 : 1237) ^ java.lang.System.identityHashCode(this.QiMR8OkAhezm);
    }

    @Override // defpackage.lm
    public final void jjTN4uUnoyEn(defpackage.jm jmVar, java.lang.Runnable runnable) {
        if (this.QiMR8OkAhezm.post(runnable)) {
            return;
        }
        IBvW5fLsPuHy(jmVar, runnable);
    }

    @Override // defpackage.lm
    public final java.lang.String toString() {
        defpackage.s40 s40Var;
        java.lang.String str;
        defpackage.jo joVar = defpackage.tq.ZpBGe2uQfcn8;
        defpackage.s40 s40Var2 = defpackage.wj0.ZpBGe2uQfcn8;
        if (this == s40Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                s40Var = s40Var2.GE9mJIPrb8gP;
            } catch (java.lang.UnsupportedOperationException unused) {
                s40Var = null;
            }
            str = this == s40Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        java.lang.String str2 = this.P05cfTpS5W5L;
        if (str2 == null) {
            str2 = this.QiMR8OkAhezm.toString();
        }
        if (!this.e6mdH7fiFuta) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public s40(android.os.Handler handler) {
        this(handler, null, false);
    }
}
