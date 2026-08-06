package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class vv extends i9 implements uv, o40, tv {
    public final int rQPn8YBR;

    public vv(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.rQPn8YBR = i;
    }

    @Override // defpackage.uv
    public final int Yi7zF1RB1() {
        return this.rQPn8YBR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o40] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vv) {
            vv vvVar = (vv) obj;
            return this.encWxUiV2.equals(vvVar.encWxUiV2) && this.mOu10nynGul.equals(vvVar.mOu10nynGul) && o30.rQPn8YBR(this.EljAMC1QTz, vvVar.EljAMC1QTz) && OOA6hdeuvCS().equals(vvVar.OOA6hdeuvCS());
        }
        if (!(obj instanceof vv)) {
            return false;
        }
        ?? r0 = this.OOA6hdeuvCS;
        if (r0 == 0) {
            xqGvceK5x();
            this.OOA6hdeuvCS = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        OOA6hdeuvCS();
        return this.mOu10nynGul.hashCode() + ((this.encWxUiV2.hashCode() + (OOA6hdeuvCS().hashCode() * 31)) * 31);
    }

    public final String toString() {
        o40 o40Var = this.OOA6hdeuvCS;
        if (o40Var == null) {
            xqGvceK5x();
            this.OOA6hdeuvCS = this;
            o40Var = this;
        }
        if (o40Var != this) {
            return o40Var.toString();
        }
        String str = this.encWxUiV2;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.i9
    public final o40 xqGvceK5x() {
        st0.GWasM1elztuh.getClass();
        return this;
    }

    public vv(int i, Class cls, String str, String str2, int i2) {
        this(i, h9.OOA6hdeuvCS, cls, str, str2, i2, 0);
    }
}
