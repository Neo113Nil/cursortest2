package Q7;

import L3.F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.AbstractC5129j;
import v7.AbstractC5130k;
import v7.AbstractC5131l;
import v7.C5135p;

/* loaded from: classes2.dex */
public abstract class k extends O3.b {
    public static String H(String str) {
        List list;
        int i;
        Comparable comparable;
        kotlin.jvm.internal.h.e(str, "<this>");
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
                list = d6.c.k(next);
            }
        } else {
            list = C5135p.f41439n;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!j.c0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC5131l.y(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!F.n(str2.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList3.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
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
        list.size();
        int u3 = AbstractC5130k.u(list);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i6 = i + 1;
            if (i < 0) {
                AbstractC5130k.x();
                throw null;
            }
            String str3 = (String) obj2;
            String W8 = ((i == 0 || i == u3) && j.c0(str3)) ? null : j.W(intValue, str3);
            if (W8 != null) {
                arrayList4.add(W8);
            }
            i = i6;
        }
        StringBuilder sb = new StringBuilder(length2);
        AbstractC5129j.C(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String I(String str) {
        List list;
        kotlin.jvm.internal.h.e(str, "<this>");
        if (j.c0(com.anythink.expressad.foundation.g.a.bU)) {
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
                list = d6.c.k(next);
            }
        } else {
            list = C5135p.f41439n;
        }
        int length = str.length();
        list.size();
        int u3 = AbstractC5130k.u(list);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i6 = i + 1;
            String str2 = null;
            if (i < 0) {
                AbstractC5130k.x();
                throw null;
            }
            String str3 = (String) obj;
            if ((i != 0 && i != u3) || !j.c0(str3)) {
                int length2 = str3.length();
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        i9 = -1;
                        break;
                    }
                    if (!F.n(str3.charAt(i9))) {
                        break;
                    }
                    i9++;
                }
                if (i9 != -1 && q.Q(str3, i9, com.anythink.expressad.foundation.g.a.bU, false)) {
                    str2 = str3.substring(com.anythink.expressad.foundation.g.a.bU.length() + i9);
                    kotlin.jvm.internal.h.d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i6;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC5129j.C(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
