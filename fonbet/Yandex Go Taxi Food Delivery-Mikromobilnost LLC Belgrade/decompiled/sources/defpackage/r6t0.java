package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.TariffsSelectorView$SelectorMargin;

/* loaded from: classes6.dex */
public final class r6t0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6t0 b;

    public /* synthetic */ r6t0(m6t0 m6t0Var, int i) {
        this.a = i;
        this.b = m6t0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m6t0 m6t0Var = this.b;
        switch (i) {
            case 0:
                m6t0Var.rb((vhv0) obj);
                break;
            default:
                m6t0Var.V3((TariffsSelectorView$SelectorMargin) obj);
                break;
        }
        return zy11Var;
    }
}
