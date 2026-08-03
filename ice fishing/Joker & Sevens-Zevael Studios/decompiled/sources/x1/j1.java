package x1;

import java.util.Comparator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j1 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f8086b = new j1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8087a;

    public /* synthetic */ j1(int i10) {
        this.f8087a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8087a) {
            case 0:
                g0 g0Var = (g0) obj;
                g0 g0Var2 = (g0) obj2;
                int f10 = pc.j.f(g0Var2.f8054t, g0Var.f8054t);
                return f10 != 0 ? f10 : pc.j.f(g0Var.hashCode(), g0Var2.hashCode());
            default:
                g0 g0Var3 = (g0) obj;
                g0 g0Var4 = (g0) obj2;
                int f11 = pc.j.f(g0Var3.f8054t, g0Var4.f8054t);
                return f11 != 0 ? f11 : pc.j.f(g0Var3.hashCode(), g0Var4.hashCode());
        }
    }
}
