package e8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import q7.C4938g;
import r7.AbstractC4978i;

/* loaded from: classes2.dex */
public final class m implements Iterable, F7.a {

    /* renamed from: u, reason: collision with root package name */
    public static final m f37427u = new m(new String[0]);

    /* renamed from: n, reason: collision with root package name */
    public final String[] f37428n;

    public m(String[] namesAndValues) {
        kotlin.jvm.internal.h.e(namesAndValues, "namesAndValues");
        this.f37428n = namesAndValues;
    }

    public final String a(String str) {
        String[] namesAndValues = this.f37428n;
        kotlin.jvm.internal.h.e(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int N8 = com.bumptech.glide.g.N(length, 0, -2);
        if (N8 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(namesAndValues[length])) {
            if (length == N8) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public final String c(int i) {
        String str = (String) AbstractC4978i.O(this.f37428n, i * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final I1.b d() {
        I1.b bVar = new I1.b(4);
        ArrayList arrayList = bVar.f1246n;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        String[] elements = this.f37428n;
        kotlin.jvm.internal.h.e(elements, "elements");
        arrayList.addAll(AbstractC4978i.H(elements));
        return bVar;
    }

    public final String e(int i) {
        String str = (String) AbstractC4978i.O(this.f37428n, (i * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Arrays.equals(this.f37428n, ((m) obj).f37428n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37428n);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C4938g[] c4938gArr = new C4938g[size];
        for (int i = 0; i < size; i++) {
            c4938gArr[i] = new C4938g(c(i), e(i));
        }
        return new Y7.g(c4938gArr);
    }

    public final int size() {
        return this.f37428n.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String c4 = c(i);
            String e6 = e(i);
            sb.append(c4);
            sb.append(": ");
            if (f8.c.i(c4)) {
                e6 = "██";
            }
            sb.append(e6);
            sb.append("\n");
        }
        return sb.toString();
    }
}
