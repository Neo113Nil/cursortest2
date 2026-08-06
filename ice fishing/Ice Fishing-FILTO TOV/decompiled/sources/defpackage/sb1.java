package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class sb1 {
    public final o71 GWasM1elztuh;
    public final Object OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final ou Yi7zF1RB1;
    public final int xqGvceK5x;

    public sb1(o71 o71Var, ou ouVar, int i, int i2, Object obj) {
        this.GWasM1elztuh = o71Var;
        this.Yi7zF1RB1 = ouVar;
        this.X1lG3V04pd = i;
        this.xqGvceK5x = i2;
        this.OOA6hdeuvCS = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb1)) {
            return false;
        }
        sb1 sb1Var = (sb1) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, sb1Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, sb1Var.Yi7zF1RB1) && this.X1lG3V04pd == sb1Var.X1lG3V04pd && this.xqGvceK5x == sb1Var.xqGvceK5x && o30.rQPn8YBR(this.OOA6hdeuvCS, sb1Var.OOA6hdeuvCS);
    }

    public final int hashCode() {
        o71 o71Var = this.GWasM1elztuh;
        int Yi7zF1RB1 = mr0.Yi7zF1RB1(this.xqGvceK5x, mr0.Yi7zF1RB1(this.X1lG3V04pd, (((o71Var == null ? 0 : o71Var.hashCode()) * 31) + this.Yi7zF1RB1.OOA6hdeuvCS) * 31, 31), 31);
        Object obj = this.OOA6hdeuvCS;
        return Yi7zF1RB1 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.GWasM1elztuh);
        sb.append(", fontWeight=");
        sb.append(this.Yi7zF1RB1);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.X1lG3V04pd;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.xqGvceK5x;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.OOA6hdeuvCS);
        sb.append(')');
        return sb.toString();
    }
}
