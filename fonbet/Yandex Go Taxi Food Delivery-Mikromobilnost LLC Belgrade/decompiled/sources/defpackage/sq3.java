package defpackage;

import defpackage.c3f;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class sq3 implements ip60 {
    public static final sq3 a = new sq3();
    public static final lxq b = lxq.c(ClidProvider.TIMESTAMP);
    public static final lxq c = lxq.c("type");
    public static final lxq d = lxq.c("app");
    public static final lxq e = lxq.c("device");
    public static final lxq f = lxq.c("log");
    public static final lxq g = lxq.c("rollouts");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d dVar = (c3f.e.d) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.e(b, dVar.e());
        jp60Var.f(c, dVar.f());
        jp60Var.f(d, dVar.a());
        jp60Var.f(e, dVar.b());
        jp60Var.f(f, dVar.c());
        jp60Var.f(g, dVar.d());
    }
}
