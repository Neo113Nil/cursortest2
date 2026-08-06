package z1;

import a.AbstractC0083a;
import i1.AbstractC0252i;
import i1.AbstractC0253j;
import i1.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends R1.l {
    public static String L(String str) {
        List list;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (g.a0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        d dVar = new d(str);
        if (dVar.hasNext()) {
            Object next = dVar.next();
            if (dVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (dVar.hasNext()) {
                    arrayList.add(dVar.next());
                }
                list = arrayList;
            } else {
                list = AbstractC0083a.m(next);
            }
        } else {
            list = r.f3416a;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            String str2 = null;
            if (i2 < 0) {
                AbstractC0253j.D();
                throw null;
            }
            String str3 = (String) obj;
            if ((i2 != 0 && i2 != size) || !g.a0(str3)) {
                int length2 = str3.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!R1.d.x(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1 && o.Q(i4, str3, "|", false)) {
                    str2 = str3.substring("|".length() + i4);
                    kotlin.jvm.internal.i.d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC0252i.I(arrayList2, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }
}
