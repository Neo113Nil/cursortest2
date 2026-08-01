package r;

import java.util.ConcurrentModificationException;
import s.AbstractC0346a;

/* renamed from: r.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0341i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4318a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4319b = new Object();

    public static final void a(C0343k c0343k) {
        int i = c0343k.f4326d;
        int[] iArr = c0343k.f4324b;
        Object[] objArr = c0343k.f4325c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f4319b) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        c0343k.f4323a = false;
        c0343k.f4326d = i2;
    }

    public static final int b(C0339g c0339g, Object obj, int i) {
        D1.i.e(c0339g, "<this>");
        int i2 = c0339g.f4313c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = AbstractC0346a.a(c0339g.f4313c, i, c0339g.f4311a);
            if (a2 < 0 || D1.i.a(obj, c0339g.f4312b[a2])) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && c0339g.f4311a[i3] == i) {
                if (D1.i.a(obj, c0339g.f4312b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && c0339g.f4311a[i4] == i; i4--) {
                if (D1.i.a(obj, c0339g.f4312b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
