package s;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6313a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f6314b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f6315c = new Object();

    public static final void a(g gVar, int i10) {
        gVar.f6263g = new int[i10];
        gVar.f6264h = new Object[i10];
    }

    public static final int b(g gVar, Object obj, int i10) {
        int i11 = gVar.f6265i;
        if (i11 == 0) {
            return -1;
        }
        try {
            int a6 = t.a.a(i11, i10, gVar.f6263g);
            if (a6 < 0 || pc.j.a(obj, gVar.f6264h[a6])) {
                return a6;
            }
            int i12 = a6 + 1;
            while (i12 < i11 && gVar.f6263g[i12] == i10) {
                if (pc.j.a(obj, gVar.f6264h[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a6 - 1; i13 >= 0 && gVar.f6263g[i13] == i10; i13--) {
                if (pc.j.a(obj, gVar.f6264h[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
