package r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f5995a = new StackTraceElement[0];

    public static final boolean a(n nVar) {
        return !nVar.f5970h && nVar.f5966d;
    }

    public static final boolean b(n nVar) {
        return nVar.f5970h && !nVar.f5966d;
    }

    public static final long c(n nVar, boolean z10) {
        long f10 = e1.b.f(nVar.f5965c, nVar.f5969g);
        if (z10 || !nVar.b()) {
            return f10;
        }
        return 0L;
    }
}
