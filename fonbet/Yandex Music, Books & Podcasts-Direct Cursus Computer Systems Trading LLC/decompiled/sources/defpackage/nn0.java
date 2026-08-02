package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class nn0 {
    public static final mn0 a = new mn0("");

    public static mn0 a(String str, c4r c4rVar) {
        return new mn0(str, t75.c(new ln0(c4rVar, 0, str.length())), c5b.a);
    }

    public static final List b(mn0 mn0Var, int i, int i2, d5 d5Var) {
        List list;
        if (i == i2 || (list = mn0Var.a) == null) {
            return null;
        }
        if (i != 0 || i2 < mn0Var.b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ln0 ln0Var = (ln0) list.get(i3);
                if ((d5Var != null ? ((Boolean) d5Var.invoke(ln0Var.a)).booleanValue() : true) && c(i, i2, ln0Var.b, ln0Var.c)) {
                    arrayList.add(new ln0(yhn.d(ln0Var.b, i, i2) - i, yhn.d(ln0Var.c, i, i2) - i, (in0) ln0Var.a, ln0Var.d));
                }
            }
            return arrayList;
        }
        if (d5Var == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) d5Var.invoke(((ln0) obj).a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean c(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
