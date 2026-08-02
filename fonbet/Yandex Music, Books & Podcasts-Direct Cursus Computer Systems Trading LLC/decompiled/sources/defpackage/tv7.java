package defpackage;

/* loaded from: classes5.dex */
public final class tv7 implements rzm {
    public rzm a;

    public static void a(rzm rzmVar, rzm rzmVar2) {
        tv7 tv7Var = (tv7) rzmVar;
        if (tv7Var.a == null) {
            tv7Var.a = rzmVar2;
        } else {
            e7o.n();
        }
    }

    @Override // defpackage.szm
    public final Object get() {
        rzm rzmVar = this.a;
        if (rzmVar != null) {
            return rzmVar.get();
        }
        e7o.n();
        return null;
    }
}
