package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class SJaTq1YjP6B8 implements defpackage.m20, java.io.Serializable {
    public final int GE9mJIPrb8gP;
    public final int Ns0WNyEWdPsk;
    public final java.lang.String P05cfTpS5W5L;
    public final java.lang.String QiMR8OkAhezm;
    public final java.lang.Object WDYagTQQm9ns;
    public final boolean e6mdH7fiFuta = false;
    public final java.lang.Class oh71FJcDz6S2;

    public SJaTq1YjP6B8(int i, int i2, java.lang.Class cls, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        this.WDYagTQQm9ns = obj;
        this.oh71FJcDz6S2 = cls;
        this.QiMR8OkAhezm = str;
        this.P05cfTpS5W5L = str2;
        this.GE9mJIPrb8gP = i;
        this.Ns0WNyEWdPsk = i2 >> 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.SJaTq1YjP6B8)) {
            return false;
        }
        defpackage.SJaTq1YjP6B8 sJaTq1YjP6B8 = (defpackage.SJaTq1YjP6B8) obj;
        return this.e6mdH7fiFuta == sJaTq1YjP6B8.e6mdH7fiFuta && this.GE9mJIPrb8gP == sJaTq1YjP6B8.GE9mJIPrb8gP && this.Ns0WNyEWdPsk == sJaTq1YjP6B8.Ns0WNyEWdPsk && this.WDYagTQQm9ns.equals(sJaTq1YjP6B8.WDYagTQQm9ns) && this.oh71FJcDz6S2.equals(sJaTq1YjP6B8.oh71FJcDz6S2) && this.QiMR8OkAhezm.equals(sJaTq1YjP6B8.QiMR8OkAhezm) && this.P05cfTpS5W5L.equals(sJaTq1YjP6B8.P05cfTpS5W5L);
    }

    @Override // defpackage.m20
    public final int fWTAfUmVKrZq() {
        return this.GE9mJIPrb8gP;
    }

    public final int hashCode() {
        return ((((((this.P05cfTpS5W5L.hashCode() + ((this.QiMR8OkAhezm.hashCode() + ((this.oh71FJcDz6S2.hashCode() + (this.WDYagTQQm9ns.hashCode() * 31)) * 31)) * 31)) * 31) + (this.e6mdH7fiFuta ? 1231 : 1237)) * 31) + this.GE9mJIPrb8gP) * 31) + this.Ns0WNyEWdPsk;
    }

    public final java.lang.String toString() {
        defpackage.b41.ZpBGe2uQfcn8.getClass();
        return defpackage.c41.ZpBGe2uQfcn8(this);
    }
}
