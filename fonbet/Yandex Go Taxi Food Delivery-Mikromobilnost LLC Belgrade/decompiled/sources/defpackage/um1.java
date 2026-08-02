package defpackage;

import com.yandex.messaging.internal.view.timeline.a;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;

/* loaded from: classes15.dex */
public final class um1 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ um1(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.w = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                a aVar = (a) obj2;
                zoy0 zoy0Var = a.i;
                aVar.d(aVar.b(i3, i2, intValue));
                break;
            case 1:
                ((tls) obj2).invoke(new euk0(i3 + i2, ((Number) obj).intValue() + i2));
                break;
            case 2:
                ((TariffsRibbonView) obj2).scrollToItem(i3, i2);
                break;
            default:
                ((VerticalInternalTariffView) obj2).scrollToItem(i3, i2);
                break;
        }
        return zy11Var;
    }
}
