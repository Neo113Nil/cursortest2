package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.sequences.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public class vuu0 extends uuu0 {
    public static String b(String str, String str2) {
        return b.m(new yw01(new h73(4, str), new g8r0(str2, 16)), "\n", null, 62);
    }

    public static String c(String str) {
        int i;
        List M = evu0.M(str);
        List list = M;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!evu0.J((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
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
                if (!rza.b(str2.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Integer num = (Integer) a.h0(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        M.size();
        int f = scc.f(M);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                StringBuilder sb = new StringBuilder(length2);
                a.W(arrayList3, sb, "\n", null, HProv.PP_SAME_MEDIA);
                return sb.toString();
            }
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            String str3 = (String) next;
            String r0 = ((i == 0 || i == f) && evu0.J(str3)) ? null : gvu0.r0(intValue, str3);
            if (r0 != null) {
                arrayList3.add(r0);
            }
            i = i2;
        }
    }

    public static String d(String str) {
        if (evu0.J("|")) {
            ny61.g("marginPrefix must be non-blank string.");
            return null;
        }
        List M = evu0.M(str);
        int length = str.length();
        M.size();
        int f = scc.f(M);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : M) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == f) && evu0.J(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!rza.b(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        a.W(arrayList, sb, "\n", null, HProv.PP_SAME_MEDIA);
        return sb.toString();
    }
}
