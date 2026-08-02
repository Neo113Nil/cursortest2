package defpackage;

import com.yandex.go.superapp.order.multi.old.a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.badge.b;

/* loaded from: classes14.dex */
public final class u980 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ u980(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                r0 r0Var = aVar.j;
                r0Var.getClass();
                r0Var.m(null, bool);
                Object obj2 = aVar.f;
                bk4 bk4Var = aVar.c;
                wj10 wj10Var = aVar.b;
                if (!booleanValue) {
                    wj10Var.b(true);
                    aVar.g.a(true);
                    ((b) bk4Var).a(obj2);
                    break;
                } else {
                    wj10Var.c();
                    ((b) bk4Var).c(obj2);
                    break;
                }
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ru.yandex.taxi.widget.address.b bVar = aVar.g;
                if (!booleanValue2) {
                    bVar.a(true);
                    break;
                } else {
                    bVar.a.setVisibility(0);
                    bVar.c(true);
                    break;
                }
        }
        return zy11Var;
    }
}
