package defpackage;

import com.yandex.go.superapp.order.multi.old.h;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class rc80 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ rc80(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                List list = (List) pair.getFirst();
                List list2 = (List) pair.getSecond();
                hVar.G = list;
                ((nc80) hVar.Dg()).updateOrders(list2);
                break;
            case 1:
                ((nc80) hVar.Dg()).setMinHeight(((Number) obj).intValue());
                break;
            default:
                ((nc80) hVar.Dg()).setCollapseRate(((Number) obj).floatValue());
                break;
        }
        return zy11Var;
    }
}
