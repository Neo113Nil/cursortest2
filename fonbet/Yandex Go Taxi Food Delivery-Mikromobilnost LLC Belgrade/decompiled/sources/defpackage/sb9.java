package defpackage;

import com.yandex.go.taxi.order.change.destination.a;
import com.yandex.go.taxi.order.change.driver.c;
import com.yandex.go.taxi.order.change.requirements.interactor.b;
import com.yandex.go.taxi.order.change.source.interactor.e;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes14.dex */
public final class sb9 {
    public final e a;
    public final a b;
    public final c c;
    public final sg9 d;
    public final b e;
    public final i3y f = kotlin.a.b(LazyThreadSafetyMode.NONE, new we8(28));

    public sb9(e eVar, a aVar, c cVar, sg9 sg9Var, b bVar) {
        this.a = eVar;
        this.b = aVar;
        this.c = cVar;
        this.d = sg9Var;
        this.e = bVar;
    }

    public final Object a(o2y0 o2y0Var, com.yandex.go.taxi.order.models.api.e eVar, SuspendLambda suspendLambda) {
        ChangeOrderState$Source b = eVar.getB();
        int i = b == null ? -1 : rb9.a[b.ordinal()];
        a aVar = this.b;
        switch (i) {
            case -1:
                a3y0 a3y0Var = (a3y0) this.f.getValue();
                String l = a3y0Var.l(new String[]{"NotificationProcessing"});
                hst hstVar = jst.e;
                String str = a3y0Var.a;
                hstVar.getClass();
                ist m = hstVar.m(l);
                ke00 a = m.b.a();
                if (a != null && a.b(15)) {
                    a.a(15, str, null, "Unexpected changeOrderState source is null", m.a);
                    break;
                }
                break;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                return this.a.b(o2y0Var, eVar, suspendLambda);
            case 2:
                return aVar.a(eVar, suspendLambda);
            case 3:
                return aVar.a(eVar, suspendLambda);
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
                break;
            case 5:
                return this.c.a(eVar, suspendLambda);
            case 9:
                return ((com.yandex.go.taxi.order.change.tariff.a) this.d).a(o2y0Var, eVar, suspendLambda);
            case 12:
                return this.e.a(eVar, suspendLambda);
        }
        return zy11.a;
    }
}
