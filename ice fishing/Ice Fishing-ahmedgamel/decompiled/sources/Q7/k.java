package Q7;

import N3.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.AbstractC5119j;
import v7.AbstractC5120k;
import v7.AbstractC5121l;
import v7.C5125p;

/* loaded from: classes2.dex */
public abstract class k extends C {
    public static String X(String str) {
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
                list = Z2.d.n(next);
            }
        } else {
            list = C5125p.f41221n;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!j.s0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC5121l.w(arrayList2, 10));
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
                if (!A8.b.o(str2.charAt(i))) {
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
        int s9 = AbstractC5120k.s(list);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i4 = i + 1;
            if (i < 0) {
                AbstractC5120k.v();
                throw null;
            }
            String str3 = (String) obj2;
            String m0 = ((i == 0 || i == s9) && j.s0(str3)) ? null : j.m0(intValue, str3);
            if (m0 != null) {
                arrayList4.add(m0);
            }
            i = i4;
        }
        StringBuilder sb = new StringBuilder(length2);
        AbstractC5119j.A(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String Y(String str) {
        List list;
        kotlin.jvm.internal.h.e(str, "<this>");
        if (j.s0(com.anythink.expressad.foundation.g.a.bU)) {
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
                list = Z2.d.n(next);
            }
        } else {
            list = C5125p.f41221n;
        }
        int length = str.length();
        list.size();
        int s9 = AbstractC5120k.s(list);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i4 = i + 1;
            String str2 = null;
            if (i < 0) {
                AbstractC5120k.v();
                throw null;
            }
            String str3 = (String) obj;
            if ((i != 0 && i != s9) || !j.s0(str3)) {
                int length2 = str3.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        i6 = -1;
                        break;
                    }
                    if (!A8.b.o(str3.charAt(i6))) {
                        break;
                    }
                    i6++;
                }
                if (i6 != -1 && q.g0(str3, i6, com.anythink.expressad.foundation.g.a.bU, false)) {
                    str2 = str3.substring(com.anythink.expressad.foundation.g.a.bU.length() + i6);
                    kotlin.jvm.internal.h.d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i4;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC5119j.A(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
