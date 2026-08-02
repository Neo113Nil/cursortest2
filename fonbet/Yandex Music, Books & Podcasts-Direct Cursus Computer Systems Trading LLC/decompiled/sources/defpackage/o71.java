package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class o71 implements t71 {
    public final xdr a;
    public final fkn b;

    public o71(b81 b81Var, List list) {
        n8g b = t75.b();
        if (list.contains(b81.Collection)) {
            b.add(new c81(u75.h(weo.J("Дай мне посмотреть"), weo.J("Сандэй сервис"), weo.J("Слеза"), weo.J("М11"), weo.J("Finesse and Ferb"), weo.J("Incessant"), weo.J("OMYT"), weo.J("Бибис"), weo.J("Привет"), weo.J("Я"), weo.J("Устал"), weo.J("Придумывать"), weo.J("Названия"), weo.J("Треков")), u75.h(weo.I("Улицы гетто 2"), weo.I("Cruiser Aurora")), false));
        }
        if (list.contains(b81.Wave)) {
            b.add(new d81(u75.h(weo.J("i found love in october"), weo.J("el muchacho de los ojos tristes"), weo.J("Ausländer"), weo.J("Que rica"), weo.J("YEEI"), weo.J("Mariposas"), weo.J("tarántula"), weo.J("Two Thousand Nineteen"), weo.J("ночь"), weo.J("Breathe"), weo.J("Я"), weo.J("Устал"), weo.J("Придумывать"), weo.J("Названия"), weo.J("Треков")), false));
        }
        xdr a = ydr.a(new v71(b81Var, t75.a(b), false));
        this.a = a;
        this.b = new fkn(a);
    }

    @Override // defpackage.t71
    public final kle d() {
        return jle.b;
    }

    @Override // defpackage.t71
    public final void e(b81 b81Var) {
        xdr xdrVar;
        Object value;
        do {
            xdrVar = this.a;
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, v71.a((v71) value, b81Var, null, false, 6)));
    }

    @Override // defpackage.t71
    public final bg5 g(mqs mqsVar, int i, ArrayList arrayList, kf1 kf1Var, Context context, mm6 mm6Var) {
        mqsVar.getClass();
        context.getClass();
        mm6Var.getClass();
        return crm.a;
    }

    @Override // defpackage.t71
    public final fkn getState() {
        return this.b;
    }

    @Override // defpackage.t71
    public final bc5 h(oq oqVar, mm6 mm6Var) {
        mm6Var.getClass();
        return arm.a;
    }

    @Override // defpackage.t71
    public final void a() {
    }

    @Override // defpackage.t71
    public final void b() {
    }

    @Override // defpackage.t71
    public final void c() {
    }

    @Override // defpackage.t71
    public final void f() {
    }
}
