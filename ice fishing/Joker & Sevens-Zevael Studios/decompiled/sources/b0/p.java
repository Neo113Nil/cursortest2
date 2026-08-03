package b0;

import java.util.Comparator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f868b;

    public /* synthetic */ p(q0 q0Var, int i10) {
        this.f867a = i10;
        this.f868b = q0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f867a) {
            case 0:
                Object obj3 = ((a0.t) obj).f126g;
                q0 q0Var = this.f868b;
                return a.a.p(Integer.valueOf(q0Var.b(obj3)), Integer.valueOf(q0Var.b(((a0.t) obj2).f126g)));
            default:
                Object obj4 = ((a0.t) obj2).f126g;
                q0 q0Var2 = this.f868b;
                return a.a.p(Integer.valueOf(q0Var2.b(obj4)), Integer.valueOf(q0Var2.b(((a0.t) obj).f126g)));
        }
    }
}
