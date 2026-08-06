package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w00 implements java.lang.Comparable {
    public static final defpackage.w00 GE9mJIPrb8gP;
    public static final defpackage.w00 Ns0WNyEWdPsk;
    public static final defpackage.w00 P05cfTpS5W5L;
    public static final defpackage.w00 QiMR8OkAhezm;
    public static final defpackage.w00 e6mdH7fiFuta;
    public static final defpackage.w00 oh71FJcDz6S2;
    public final int WDYagTQQm9ns;

    static {
        defpackage.w00 w00Var = new defpackage.w00(100);
        defpackage.w00 w00Var2 = new defpackage.w00(200);
        defpackage.w00 w00Var3 = new defpackage.w00(300);
        defpackage.w00 w00Var4 = new defpackage.w00(400);
        oh71FJcDz6S2 = w00Var4;
        defpackage.w00 w00Var5 = new defpackage.w00(500);
        QiMR8OkAhezm = w00Var5;
        defpackage.w00 w00Var6 = new defpackage.w00(600);
        P05cfTpS5W5L = w00Var6;
        defpackage.w00 w00Var7 = new defpackage.w00(700);
        defpackage.w00 w00Var8 = new defpackage.w00(800);
        defpackage.w00 w00Var9 = new defpackage.w00(900);
        e6mdH7fiFuta = w00Var4;
        GE9mJIPrb8gP = w00Var5;
        Ns0WNyEWdPsk = w00Var7;
        defpackage.ma0.oCu53ZX2v4Ju(w00Var, w00Var2, w00Var3, w00Var4, w00Var5, w00Var6, w00Var7, w00Var8, w00Var9);
    }

    public w00(int i) {
        this.WDYagTQQm9ns = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        defpackage.f80.ZpBGe2uQfcn8("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* renamed from: ZpBGe2uQfcn8, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.w00 w00Var) {
        return defpackage.ma0.fNwYGHIYeJcR(this.WDYagTQQm9ns, w00Var.WDYagTQQm9ns);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.w00) {
            return this.WDYagTQQm9ns == ((defpackage.w00) obj).WDYagTQQm9ns;
        }
        return false;
    }

    public final int hashCode() {
        return this.WDYagTQQm9ns;
    }

    public final java.lang.String toString() {
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(new java.lang.StringBuilder("FontWeight(weight="), this.WDYagTQQm9ns, ')');
    }
}
