package defpackage;

/* loaded from: classes7.dex */
public abstract class q35 {
    public final afo a;
    public yeo b;

    public q35(ssr ssrVar, String str) {
        afo afoVar = new afo(ssrVar.c, "flutter_yandex_mapkit/".concat(str));
        this.a = afoVar;
        afoVar.a(new ddf(28, this));
    }

    public abstract void a(Object obj);

    public abstract void b(Object obj);

    public final void c(sls slsVar) {
        yeo yeoVar;
        try {
            Object invoke = slsVar.invoke();
            if (invoke == null || (invoke instanceof zy11) || (yeoVar = this.b) == null) {
                return;
            }
            yeoVar.success(invoke);
        } catch (Throwable th) {
            yeo yeoVar2 = this.b;
            if (yeoVar2 != null) {
                yeoVar2.error(getClass().getSimpleName(), ljo.b(th), null);
            }
        }
    }
}
