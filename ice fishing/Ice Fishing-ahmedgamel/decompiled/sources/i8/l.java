package i8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import u7.C5089g;
import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class l implements Iterable, J7.a {

    /* renamed from: u, reason: collision with root package name */
    public static final l f38149u = new l(new String[0]);

    /* renamed from: n, reason: collision with root package name */
    public final String[] f38150n;

    public l(String[] namesAndValues) {
        kotlin.jvm.internal.h.e(namesAndValues, "namesAndValues");
        this.f38150n = namesAndValues;
    }

    public final String a(String str) {
        String[] namesAndValues = this.f38150n;
        kotlin.jvm.internal.h.e(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int p9 = t8.g.p(length, 0, -2);
        if (p9 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(namesAndValues[length])) {
            if (length == p9) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public final String c(int i) {
        String str = (String) AbstractC5128i.x(this.f38150n, i * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final G1.e d() {
        G1.e eVar = new G1.e(3);
        ArrayList arrayList = eVar.f1056a;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        String[] elements = this.f38150n;
        kotlin.jvm.internal.h.e(elements, "elements");
        arrayList.addAll(AbstractC5128i.q(elements));
        return eVar;
    }

    public final String e(int i) {
        String str = (String) AbstractC5128i.x(this.f38150n, (i * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Arrays.equals(this.f38150n, ((l) obj).f38150n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f38150n);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C5089g[] c5089gArr = new C5089g[size];
        for (int i = 0; i < size; i++) {
            c5089gArr[i] = new C5089g(c(i), e(i));
        }
        return new c8.g(c5089gArr);
    }

    public final int size() {
        return this.f38150n.length / 2;
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
