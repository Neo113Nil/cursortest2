package m0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f4757a = new f1("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f4758b = new f1("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f4759c = new f1("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final f1 f4760d = new f1("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final f1 f4761e = new f1("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final e3.b f4762f = new e3.b(2);

    public static final void a(ArrayList arrayList, int i10, int i11) {
        int e10 = e(i10, arrayList);
        if (e10 < 0) {
            e10 = -(e10 + 1);
        }
        while (e10 < arrayList.size() && ((s0) arrayList.get(e10)).f4753b < i11) {
        }
    }

    public static final void b(i2 i2Var, ArrayList arrayList, int i10) {
        boolean l10 = i2Var.l(i10);
        int[] iArr = i2Var.f4615b;
        if (l10) {
            arrayList.add(i2Var.n(i10));
            return;
        }
        int i11 = iArr[(i10 * 5) + 3] + i10;
        for (int i12 = i10 + 1; i12 < i11; i12 += iArr[(i12 * 5) + 3]) {
            b(i2Var, arrayList, i12);
        }
    }

    public static final void c(String str) {
        throw new k(a4.d.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new k(a4.d.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int e(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int f10 = pc.j.f(((s0) list.get(i12)).f4753b, i10);
            if (f10 < 0) {
                i11 = i12 + 1;
            } else {
                if (f10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void f(m2 m2Var, int i10, Object obj) {
        int h10 = m2Var.h(i10);
        Object[] objArr = m2Var.f4660c;
        Object obj2 = objArr[h10];
        objArr[h10] = l.f4646a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
