package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class l00 {
    public static final /* synthetic */ int OOA6hdeuvCS = 0;
    public final boolean GWasM1elztuh;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final gb0 xqGvceK5x;

    static {
        new l00();
    }

    public l00() {
        gb0 gb0Var = gb0.AvO7iQsrTN;
        this.GWasM1elztuh = true;
        this.Yi7zF1RB1 = 1;
        this.X1lG3V04pd = 1;
        this.xqGvceK5x = gb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l00)) {
            return false;
        }
        l00 l00Var = (l00) obj;
        return this.GWasM1elztuh == l00Var.GWasM1elztuh && this.Yi7zF1RB1 == l00Var.Yi7zF1RB1 && this.X1lG3V04pd == l00Var.X1lG3V04pd && o30.rQPn8YBR(this.xqGvceK5x, l00Var.xqGvceK5x);
    }

    public final int hashCode() {
        return this.xqGvceK5x.OOA6hdeuvCS.hashCode() + mr0.Yi7zF1RB1(this.X1lG3V04pd, mr0.Yi7zF1RB1(this.Yi7zF1RB1, mr0.xqGvceK5x(mr0.Yi7zF1RB1(0, Boolean.hashCode(false) * 31, 31), 31, this.GWasM1elztuh), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb.append((Object) "None");
        sb.append(", autoCorrect=");
        sb.append(this.GWasM1elztuh);
        sb.append(", keyboardType=");
        int i = this.Yi7zF1RB1;
        sb.append((Object) (i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i2 = this.X1lG3V04pd;
        if (i2 == -1) {
            str = "Unspecified";
        } else if (i2 != 0) {
            str = i2 == 1 ? "Default" : i2 == 2 ? "Go" : i2 == 3 ? "Search" : i2 == 4 ? "Send" : i2 == 5 ? "Previous" : i2 == 6 ? "Next" : i2 == 7 ? "Done" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.xqGvceK5x);
        sb.append(')');
        return sb.toString();
    }
}
