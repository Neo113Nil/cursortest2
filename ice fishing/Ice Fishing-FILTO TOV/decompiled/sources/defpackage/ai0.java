package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ai0 {
    public Object EljAMC1QTz;
    public int GWasM1elztuh;
    public Object OOA6hdeuvCS;
    public Object Yi7zF1RB1 = new sz[32];
    public Object X1lG3V04pd = new float[32];
    public Object xqGvceK5x = new byte[32];

    public ai0() {
        ig0 ig0Var = lx0.GWasM1elztuh;
        this.OOA6hdeuvCS = new ig0();
        this.EljAMC1QTz = new ig0();
    }

    public wh0 GWasM1elztuh(String str) {
        vh0 vh0Var;
        str.getClass();
        m71 m71Var = (m71) this.EljAMC1QTz;
        if (m71Var == null || (vh0Var = (vh0) m71Var.getValue()) == null) {
            return null;
        }
        int i = xh0.mOu10nynGul;
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle xqGvceK5x = vh0Var.xqGvceK5x(parse, (LinkedHashMap) this.xqGvceK5x);
        if (xqGvceK5x == null) {
            return null;
        }
        return new wh0((xh0) this.Yi7zF1RB1, xqGvceK5x, vh0Var.E7jCp8Ls, vh0Var.Yi7zF1RB1(parse), false);
    }
}
