package com.gamericefishpro.space.mi;

import com.gamericefishpro.space.li.m;
import com.gamericefishpro.space.li.n;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.ph.y;
import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class h extends g {
    public static String b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("    ", "indent");
        Intrinsics.checkNotNullParameter(str, "<this>");
        n nVarD = m.d(new com.gamericefishpro.space.ai.n(3, str), new com.gamericefishpro.space.j7.c(17));
        Intrinsics.checkNotNullParameter(nVarD, "<this>");
        Intrinsics.checkNotNullParameter("\n", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(nVarD, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter("\n", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        Iterator it = nVarD.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object objInvoke = nVarD.c.invoke(it.next());
            i++;
            if (i > 1) {
                buffer.append((CharSequence) "\n");
            }
            g.a(buffer, objInvoke, null);
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    public static String c(String str) {
        Comparable comparable;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        List listW = StringsKt.w(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW) {
            if (!StringsKt.u((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.j(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!CharsKt.a(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
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
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listW.size();
        int iE = x.e(listW);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listW) {
            int i3 = i + 1;
            if (i < 0) {
                x.i();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == iE) && StringsKt.u(str3)) {
                str3 = null;
            } else {
                Intrinsics.checkNotNullParameter(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(y0.f(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                String line = str3.substring(length4);
                Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                    str3 = line;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        CollectionsKt.z(arrayList3, sb, "\n", null, 124);
        return sb.toString();
    }

    public static String d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (StringsKt.u("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listW = StringsKt.w(str);
        int length = str.length();
        listW.size();
        int iE = x.e(listW);
        ArrayList arrayList = new ArrayList();
        Iterator it = listW.iterator();
        int i = 0;
        while (true) {
            String line = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                CollectionsKt.z(arrayList, sb, "\n", null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                x.i();
                throw null;
            }
            String str2 = (String) next;
            if ((i != 0 && i != iE) || !StringsKt.u(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.a(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    Intrinsics.checkNotNullParameter(str2, "<this>");
                    Intrinsics.checkNotNullParameter("|", "prefix");
                    if (str2.startsWith("|", i3)) {
                        line = str2.substring("|".length() + i3);
                        Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                    }
                }
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                } else {
                    line = str2;
                }
            }
            if (line != null) {
                arrayList.add(line);
            }
            i = i2;
        }
    }
}
