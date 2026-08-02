package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class zgp0 extends x3 {
    public long c;
    public long[] w;
    public long[] x;

    public zgp0() {
        super(16, new coj());
        this.c = -9223372036854775807L;
        this.w = new long[0];
        this.x = new long[0];
    }

    public static Serializable Ug(int i, ef90 ef90Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(ef90Var.s()));
        }
        if (i == 1) {
            return Boolean.valueOf(ef90Var.y() == 1);
        }
        if (i == 2) {
            return Wg(ef90Var);
        }
        if (i != 3) {
            if (i == 8) {
                return Vg(ef90Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(ef90Var.s()));
                ef90Var.L(2);
                return date;
            }
            int C = ef90Var.C();
            ArrayList arrayList = new ArrayList(C);
            for (int i2 = 0; i2 < C; i2++) {
                Serializable Ug = Ug(ef90Var.y(), ef90Var);
                if (Ug != null) {
                    arrayList.add(Ug);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String Wg = Wg(ef90Var);
            int y = ef90Var.y();
            if (y == 9) {
                return hashMap;
            }
            Serializable Ug2 = Ug(y, ef90Var);
            if (Ug2 != null) {
                hashMap.put(Wg, Ug2);
            }
        }
    }

    public static HashMap Vg(ef90 ef90Var) {
        int C = ef90Var.C();
        HashMap hashMap = new HashMap(C);
        for (int i = 0; i < C; i++) {
            String Wg = Wg(ef90Var);
            Serializable Ug = Ug(ef90Var.y(), ef90Var);
            if (Ug != null) {
                hashMap.put(Wg, Ug);
            }
        }
        return hashMap;
    }

    public static String Wg(ef90 ef90Var) {
        int E = ef90Var.E();
        int i = ef90Var.b;
        ef90Var.L(E);
        return new String(ef90Var.a, i, E);
    }
}
