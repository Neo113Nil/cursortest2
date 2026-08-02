package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.text.c;

/* loaded from: classes5.dex */
public final class zvd implements Iterable, j9f {
    public final String[] a;

    public zvd(String[] strArr) {
        this.a = strArr;
    }

    public final String a(String str) {
        str.getClass();
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int s = hag.s(length, 0, -2);
        if (s > length) {
            return null;
        }
        while (!c.o(str, strArr[length], true)) {
            if (length == s) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zvd) {
            return Arrays.equals(this.a, ((zvd) obj).a);
        }
        return false;
    }

    public final String g(int i) {
        return this.a[i * 2];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(g(i), q(i));
        }
        return new c7(pairArr);
    }

    public final pv9 m() {
        pv9 pv9Var = new pv9(9);
        z75.u((ArrayList) pv9Var.b, this.a);
        return pv9Var;
    }

    public final TreeMap o() {
        ekr.a.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String g = g(i);
            Locale locale = Locale.US;
            String s = ouj.s(locale, g, locale);
            List list = (List) treeMap.get(s);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(s, list);
            }
            list.add(q(i));
        }
        return treeMap;
    }

    public final String q(int i) {
        return this.a[(i * 2) + 1];
    }

    public final List r(String str) {
        str.getClass();
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (c.o(str, g(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(q(i));
            }
        }
        if (arrayList == null) {
            return c5b.a;
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String g = g(i);
            String q = q(i);
            sb.append(g);
            sb.append(": ");
            if (cvt.q(g)) {
                q = "██";
            }
            sb.append(q);
            sb.append(StringUtil.LF);
        }
        return sb.toString();
    }
}
