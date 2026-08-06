package J1;

import a.AbstractC0083a;
import h1.C0234d;
import i1.C0245b;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f894a;

    public m(String[] strArr) {
        this.f894a = strArr;
    }

    public final String a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        String[] strArr = this.f894a;
        int length = strArr.length - 2;
        int k2 = AbstractC0083a.k(length, 0, -2);
        if (k2 <= length) {
            while (true) {
                int i2 = length - 2;
                if (name.equalsIgnoreCase(strArr[length])) {
                    return strArr[length + 1];
                }
                if (length == k2) {
                    break;
                }
                length = i2;
            }
        }
        return null;
    }

    public final String b(int i2) {
        return this.f894a[i2 * 2];
    }

    public final l c() {
        l lVar = new l(0);
        i1.o.F(lVar.f893a, this.f894a);
        return lVar;
    }

    public final String d(int i2) {
        return this.f894a[(i2 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (Arrays.equals(this.f894a, ((m) obj).f894a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f894a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C0234d[] c0234dArr = new C0234d[size];
        for (int i2 = 0; i2 < size; i2++) {
            c0234dArr[i2] = new C0234d(b(i2), d(i2));
        }
        return new C0245b(c0234dArr);
    }

    public final int size() {
        return this.f894a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            String b2 = b(i2);
            String d2 = d(i2);
            sb.append(b2);
            sb.append(": ");
            if (K1.b.q(b2)) {
                d2 = "██";
            }
            sb.append(d2);
            sb.append("\n");
            i2 = i3;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
