package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class o20 {
    public final n6 GWasM1elztuh;

    public o20(n6 n6Var) {
        this.GWasM1elztuh = n6Var;
    }

    public Object GWasM1elztuh(rx0 rx0Var) {
        Iterable iterable;
        w60 w60Var = (w60) rx0Var.OOA6hdeuvCS;
        StringBuilder sb = new StringBuilder("| (+) '");
        n6 n6Var = this.GWasM1elztuh;
        sb.append(n6Var);
        sb.append('\'');
        String sb2 = sb.toString();
        w60Var.getClass();
        w60Var.Mjvvu5DE(g90.OOA6hdeuvCS, sb2);
        try {
            ao0 ao0Var = (ao0) rx0Var.AvO7iQsrTN;
            if (ao0Var == null) {
                ao0Var = new ao0(3, null);
            }
            return n6Var.X1lG3V04pd.EljAMC1QTz((px0) rx0Var.encWxUiV2, ao0Var);
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e);
            sb3.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            int i = 0;
            while (i < stackTrace.length) {
                String className = stackTrace[i].getClassName();
                className.getClass();
                if (b61.YXi2hvwn7WL(className, "sun.reflect")) {
                    break;
                }
                i++;
            }
            if (i == 0) {
                iterable = xp.OOA6hdeuvCS;
            } else if (i != 1) {
                iterable = Arrays.asList(d5.ZCWXqiC0(stackTrace, 0, i));
                iterable.getClass();
            } else {
                iterable = fb1.HFYAaqMd6(stackTrace[0]);
            }
            sb3.append(rb.WkXHDbKiD(iterable, "\n\t", null, null, null, 62));
            w60Var.Mjvvu5DE(g90.encWxUiV2, "* Instance creation error : could not create instance for '" + n6Var + "': " + sb3.toString());
            throw new vk("Could not create instance for '" + n6Var + '\'', e);
        }
    }

    public abstract Object Yi7zF1RB1(rx0 rx0Var);
}
