package defpackage;

import java.util.Arrays;
import java.util.Vector;

/* loaded from: classes4.dex */
public class uw61 {
    public final Vector a = new Vector(1);

    public final int a(int i) {
        Vector vector;
        int i2 = i / 8;
        int i3 = i % 8;
        if ((i3 == 0 ? 0 : 1) + i2 > 2048) {
            w511.q();
            return 0;
        }
        int i4 = 0;
        int i5 = -1;
        while (true) {
            vector = this.a;
            if (i4 >= vector.size() || (i5 = ((kw61) vector.elementAt(i4)).a(i)) != -1) {
                break;
            }
            i4++;
        }
        if (i5 == -1) {
            kw61 kw61Var = new kw61();
            kw61Var.a = new int[65536];
            kw61Var.b = new byte[2048];
            kw61Var.c = 0;
            vector.add(kw61Var);
            i5 = ((kw61) vector.elementAt(i4)).a(i);
        }
        int i6 = -1 == i5 ? -1 : (i4 * 2048) + i5;
        if (i6 != -1) {
            kw61 kw61Var2 = (kw61) vector.elementAt(i6 >>> 11);
            int i7 = i6 & 2047;
            kw61Var2.getClass();
            int i8 = i2 + (i3 != 0 ? 1 : 0);
            Arrays.fill(kw61Var2.b, i7, i7 + i8, (byte) 1);
            int i9 = kw61Var2.c;
            if (i7 == i9) {
                kw61Var2.c = i9 + i8;
            }
        }
        return i6;
    }
}
