package i8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import u7.C5081g;
import v7.AbstractC5118i;

/* loaded from: classes2.dex */
public final class l implements Iterable, J7.a {

    /* renamed from: u, reason: collision with root package name */
    public static final l f38268u = new l(new String[0]);

    /* renamed from: n, reason: collision with root package name */
    public final String[] f38269n;

    public l(String[] namesAndValues) {
        kotlin.jvm.internal.h.e(namesAndValues, "namesAndValues");
        this.f38269n = namesAndValues;
    }

    public final String a(String str) {
        String[] namesAndValues = this.f38269n;
        kotlin.jvm.internal.h.e(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int e9 = d6.c.e(length, 0, -2);
        if (e9 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(namesAndValues[length])) {
            if (length == e9) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public final String c(int i) {
        String str = (String) AbstractC5118i.A(this.f38269n, i * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final I1.d d() {
        I1.d dVar = new I1.d(3);
        ArrayList arrayList = dVar.f1308n;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        String[] elements = this.f38269n;
        kotlin.jvm.internal.h.e(elements, "elements");
        arrayList.addAll(AbstractC5118i.t(elements));
        return dVar;
    }

    public final String e(int i) {
        String str = (String) AbstractC5118i.A(this.f38269n, (i * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Arrays.equals(this.f38269n, ((l) obj).f38269n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f38269n);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C5081g[] c5081gArr = new C5081g[size];
        for (int i = 0; i < size; i++) {
            c5081gArr[i] = new C5081g(c(i), e(i));
        }
        return new c8.g(c5081gArr);
    }

    public final int size() {
        return this.f38269n.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String c9 = c(i);
            String e9 = e(i);
            sb.append(c9);
            sb.append(": ");
            if (j8.c.i(c9)) {
                e9 = "██";
            }
            sb.append(e9);
            sb.append("\n");
        }
        return sb.toString();
    }
}
