package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes5.dex */
public class hlr extends glr {
    public static String c(String str, String str2) {
        int i = 7;
        return jhp.g(new o7t(new wz0(i, str), new srp(str2, i)), StringUtil.LF, null, 62);
    }

    public static String d(String str) {
        List list;
        int i;
        k7g k7gVar = new k7g(str);
        if (k7gVar.hasNext()) {
            Object next = k7gVar.next();
            if (k7gVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (k7gVar.hasNext()) {
                    arrayList.add(k7gVar.next());
                }
                list = arrayList;
            } else {
                list = t75.c(next);
            }
        } else {
            list = c5b.a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.U((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
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
                if (!CharsKt.d(str2.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList3.add(Integer.valueOf(i));
        }
        Integer num = (Integer) CollectionsKt.b0(arrayList3);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                StringBuilder sb = new StringBuilder(length2);
                CollectionsKt.V(arrayList4, sb, StringUtil.LF, null, 124);
                return sb.toString();
            }
            Object next2 = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            String str3 = (String) next2;
            String E = ((i == 0 || i == size) && StringsKt.U(str3)) ? null : mlr.E(intValue, str3);
            if (E != null) {
                arrayList4.add(E);
            }
            i = i2;
        }
    }

    public static String e(String str) {
        List list;
        if (StringsKt.U("|")) {
            xq0.x("marginPrefix must be non-blank string.");
            return null;
        }
        k7g k7gVar = new k7g(str);
        if (k7gVar.hasNext()) {
            Object next = k7gVar.next();
            if (k7gVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (k7gVar.hasNext()) {
                    arrayList.add(k7gVar.next());
                }
                list = arrayList;
            } else {
                list = t75.c(next);
            }
        } else {
            list = c5b.a;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                CollectionsKt.V(arrayList2, sb, StringUtil.LF, null, 124);
                return sb.toString();
            }
            Object next2 = it.next();
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            String str3 = (String) next2;
            if ((i != 0 && i != size) || !StringsKt.U(str3)) {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.d(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && c.u(i3, str3, "|", false)) {
                    str2 = str3.substring("|".length() + i3);
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
    }
}
