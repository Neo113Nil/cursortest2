package ru.yandex.taxi.carplates.model;

import defpackage.b64;
import defpackage.e78;
import defpackage.scc;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* loaded from: classes14.dex */
public final class a {
    public final e78 a;
    public final String b;

    public a(e78 e78Var, String str) {
        this.a = e78Var;
        this.b = str;
    }

    public static LinkedHashMap a(int i, String str) {
        Collection collection;
        if (!Pattern.compile(String.format(Locale.US, "(.*)((\\$\\d)(\\$.*)){1,%d}", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1))).matcher(str).matches()) {
            throw new CarPlatesFormatterGenerator$WrongFormatException(b64.j(str, " is a wrong format!"));
        }
        List l = new Regex("\\$").l(0, str);
        if (!l.isEmpty()) {
            ListIterator listIterator = l.listIterator(l.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = kotlin.collections.a.A0(l, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = EmptyList.a;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        List J = kotlin.collections.a.J(scc.g(Arrays.copyOf(strArr, strArr.length)), 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < J.size() - 1; i2 += 2) {
            linkedHashMap.put(J.get(i2), J.get(i2 + 1));
        }
        linkedHashMap.put(J.get(J.size() - 1), "");
        return linkedHashMap;
    }
}
