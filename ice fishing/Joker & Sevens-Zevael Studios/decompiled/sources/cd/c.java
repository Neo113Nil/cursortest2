package cd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final fc.d[] f1341a = new fc.d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final dd.w f1342b = new dd.w("NULL", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final dd.w f1343c = new dd.w("UNINITIALIZED", 0);

    public static final Object a(fc.i iVar, Object obj, Object obj2, oc.e eVar, fc.d dVar) {
        Object invoke;
        Object l10 = dd.a.l(iVar, obj2);
        try {
            a0 a0Var = new a0(dVar, iVar);
            if (eVar == null) {
                invoke = bc.a0.M(eVar, obj, a0Var);
            } else {
                pc.v.c(2, eVar);
                invoke = eVar.invoke(obj, a0Var);
            }
            dd.a.f(iVar, l10);
            if (invoke == gc.a.f2559g) {
                pc.j.e(dVar, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            dd.a.f(iVar, l10);
            throw th;
        }
    }
}
