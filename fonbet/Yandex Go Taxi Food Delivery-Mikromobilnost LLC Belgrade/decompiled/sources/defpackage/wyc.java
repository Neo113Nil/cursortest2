package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.map_common.style.source.e;

/* loaded from: classes14.dex */
public final class wyc implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ xyc b;

    public /* synthetic */ wyc(xyc xycVar, int i) {
        this.a = i;
        this.b = xycVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ((ozc) this.b.Dg()).showDriver(((hxx0) obj).d);
                break;
            default:
                xyc xycVar = this.b;
                xycVar.getClass();
                boolean z = ((TaxiOrder) obj).l.A;
                bt00 bt00Var = xycVar.G;
                if (z) {
                    ((e) bt00Var).d("pedestrian");
                } else {
                    ((e) bt00Var).b();
                }
                break;
        }
        return zy11.a;
    }
}
