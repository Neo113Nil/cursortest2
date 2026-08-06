package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class tn0 {
    public static final List GWasM1elztuh;

    static {
        long j = ac.EljAMC1QTz;
        long j2 = ac.AvO7iQsrTN;
        long j3 = ac.mOu10nynGul;
        xy0 xy0Var = new xy0(j, j2, j3, ki1.xqGvceK5x(4279118372L), ki1.xqGvceK5x(4278652952L));
        long j4 = ac.JFJ3QoxA;
        GWasM1elztuh = fb1.rezfBrjOrqK(xy0Var, new xy0(j4, ki1.xqGvceK5x(4291097087L), ac.encWxUiV2, ki1.xqGvceK5x(4279051064L), ki1.xqGvceK5x(4278586648L)), new xy0(ac.rQPn8YBR, ki1.xqGvceK5x(4294955694L), j3, ki1.xqGvceK5x(4281537804L), ki1.xqGvceK5x(4279502597L)), new xy0(ac.E7jCp8Ls, ki1.xqGvceK5x(4293646847L), j4, ki1.xqGvceK5x(4280554296L), ki1.xqGvceK5x(4278912534L)));
    }

    public static xy0 GWasM1elztuh(int i) {
        Integer num = 0;
        List list = GWasM1elztuh;
        x20 k8h8IjolWQ = fb1.k8h8IjolWQ(list);
        int i2 = k8h8IjolWQ.EljAMC1QTz;
        if (k8h8IjolWQ.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + k8h8IjolWQ + '.');
        }
        if (i < num.intValue()) {
            i = num.intValue();
        } else if (i > Integer.valueOf(i2).intValue()) {
            i = Integer.valueOf(i2).intValue();
        }
        return (xy0) list.get(i);
    }
}
