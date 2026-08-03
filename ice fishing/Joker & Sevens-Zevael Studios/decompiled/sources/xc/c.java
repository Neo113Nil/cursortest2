package xc;

import bc.l;
import bc.m;
import bc.n;
import bc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pc.j;
import wc.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class c extends u5.d {
    public static String m(String str) {
        Comparable comparable;
        String str2;
        j.e(str, "<this>");
        j.e(str, "<this>");
        List r5 = wc.g.r(new wc.d(2, new wc.d(str, new a1.g(5, l.N(new String[]{"\r\n", "\n", "\r"}))), new i(5, str)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : r5) {
            if (!h.t((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(o.O(arrayList));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                }
                if (!u2.b.m(str3.charAt(i12))) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                i12 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i12));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        r5.size();
        int K = n.K(r5);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : r5) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                n.N();
                throw null;
            }
            String str4 = (String) obj3;
            if ((i10 == 0 || i10 == K) && h.t(str4)) {
                str2 = null;
            } else {
                j.e(str4, "<this>");
                if (intValue < 0) {
                    throw new IllegalArgumentException(a4.d.h("Requested character count ", intValue, " is less than zero.").toString());
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str2 = str4.substring(length3);
                j.d(str2, "substring(...)");
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i10 = i13;
        }
        StringBuilder sb = new StringBuilder(length2);
        m.V(arrayList3, sb, "\n", "", "", "...", null);
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }
}
