package d1;

import java.util.Comparator;
import x1.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final s f1613a = new s();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        int i10 = 0;
        if (e.r(rVar) && e.r(rVar2)) {
            g0 v10 = x1.f.v(rVar);
            g0 v11 = x1.f.v(rVar2);
            if (!pc.j.a(v10, v11)) {
                g0[] g0VarArr = new g0[16];
                int i11 = 0;
                while (v10 != null) {
                    int i12 = i11 + 1;
                    if (g0VarArr.length < i12) {
                        int length = g0VarArr.length;
                        ?? r5 = new Object[Math.max(i12, length * 2)];
                        System.arraycopy(g0VarArr, 0, r5, 0, length);
                        g0VarArr = r5;
                    }
                    if (i11 != 0) {
                        System.arraycopy(g0VarArr, 0, g0VarArr, 0 + 1, i11 + 0);
                    }
                    g0VarArr[0] = v10;
                    i11++;
                    v10 = v10.s();
                }
                g0[] g0VarArr2 = new g0[16];
                int i13 = 0;
                while (v11 != null) {
                    int i14 = i13 + 1;
                    if (g0VarArr2.length < i14) {
                        int length2 = g0VarArr2.length;
                        ?? r52 = new Object[Math.max(i14, length2 * 2)];
                        System.arraycopy(g0VarArr2, 0, r52, 0, length2);
                        g0VarArr2 = r52;
                    }
                    if (i13 != 0) {
                        System.arraycopy(g0VarArr2, 0, g0VarArr2, 0 + 1, i13 + 0);
                    }
                    g0VarArr2[0] = v11;
                    i13++;
                    v11 = v11.s();
                }
                int min = Math.min(i11 - 1, i13 - 1);
                if (min >= 0) {
                    while (pc.j.a(g0VarArr[i10], g0VarArr2[i10])) {
                        if (i10 != min) {
                            i10++;
                        }
                    }
                    return pc.j.f(g0VarArr[i10].t(), g0VarArr2[i10].t());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (e.r(rVar)) {
                return -1;
            }
            if (e.r(rVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
