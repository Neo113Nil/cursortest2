package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kp implements defpackage.hp {
    public final float WDYagTQQm9ns;
    public final float oh71FJcDz6S2;

    public kp(float f, float f2) {
        this.WDYagTQQm9ns = f;
        this.oh71FJcDz6S2 = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kp)) {
            return false;
        }
        defpackage.kp kpVar = (defpackage.kp) obj;
        return java.lang.Float.compare(this.WDYagTQQm9ns, kpVar.WDYagTQQm9ns) == 0 && java.lang.Float.compare(this.oh71FJcDz6S2, kpVar.oh71FJcDz6S2) == 0;
    }

    @Override // defpackage.hp
    public final float giKS3J6vZuNy() {
        return this.WDYagTQQm9ns;
    }

    @Override // defpackage.hp
    public final float h3m55N1URyyK() {
        return this.oh71FJcDz6S2;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh71FJcDz6S2) + (java.lang.Float.hashCode(this.WDYagTQQm9ns) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DensityImpl(density=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(", fontScale=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.oh71FJcDz6S2, ')');
    }
}
