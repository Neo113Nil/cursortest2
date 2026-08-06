package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ca implements defpackage.KN4muQto0Nd5 {
    public final float ZpBGe2uQfcn8;

    public ca(float f) {
        this.ZpBGe2uQfcn8 = f;
    }

    @Override // defpackage.KN4muQto0Nd5
    public final int ZpBGe2uQfcn8(int i, int i2, defpackage.sc0 sc0Var) {
        float f = (i2 - i) / 2.0f;
        defpackage.sc0 sc0Var2 = defpackage.sc0.WDYagTQQm9ns;
        float f2 = this.ZpBGe2uQfcn8;
        if (sc0Var != sc0Var2) {
            f2 *= -1.0f;
        }
        return java.lang.Math.round((1.0f + f2) * f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ca) && java.lang.Float.compare(this.ZpBGe2uQfcn8, ((defpackage.ca) obj).ZpBGe2uQfcn8) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(new java.lang.StringBuilder("Horizontal(bias="), this.ZpBGe2uQfcn8, ')');
    }
}
