package defpackage;

import android.content.Context;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.scooters.misc.action_dialog.ScootersActionDialogModalView;
import com.yandex.go.scooters.misc.message.attention.ScootersAttentionMessageModalView;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public final class y71 extends a {
    public final /* synthetic */ int F;
    public final w030 G;
    public final Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y71(oz20 oz20Var, w030 w030Var) {
        super("AddressSuggestSearchModalViewRouter.scope");
        this.F = 0;
        this.H = oz20Var;
        this.G = w030Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        switch (this.F) {
        }
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        int i = this.F;
        int i2 = 0;
        int i3 = 16;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                AddressSearchModalView.Companion.getClass();
                AddressSearchModalView a = p51.a((oz20) obj2);
                a.setOnAddressPickedListener(new x71(i2, this));
                return a;
            case 1:
                wyf a2 = ((g51) obj2).a("order_info", SourcePicker.B_FROM_HOME, false);
                p51 p51Var = AddressSearchModalView.Companion;
                AddressSearchView.Companion.getClass();
                b61 b61Var = new b61(a2);
                b61Var.j = wch0.suggested_destinations;
                b61Var.p = false;
                b61Var.n = ((wg20) obj).a;
                b61Var.u = PointType.DESTINATION;
                b61Var.q = new uhx(i3, this);
                p51Var.getClass();
                AddressSearchModalView a3 = p51.a(b61Var);
                a3.setOnAddressPickedListener(new x71(6, this));
                a3.setAnimateOnAppearing(true);
                return a3;
            case 2:
                iqm0 iqm0Var = (iqm0) obj;
                ndl0 ndl0Var = new ndl0(11, this);
                fcj0 fcj0Var = ((dqm0) obj2).a;
                return new ScootersActionDialogModalView((Context) ((xvf0) fcj0Var.a).get(), (pav) ((j7g) fcj0Var.b).get(), (k7x0) ((xvf0) fcj0Var.c).get(), (pwy0) ((xvf0) fcj0Var.d).get(), (c) ((xvf0) fcj0Var.e).get(), iqm0Var, ndl0Var);
            default:
                czm0 czm0Var = (czm0) obj;
                zym0 zym0Var = new zym0(czm0Var.a, czm0Var.b, czm0Var.c, new j6m0(16, this));
                vx0 vx0Var = ((azm0) obj2).a;
                return new ScootersAttentionMessageModalView((Context) vx0Var.a.get(), (pav) vx0Var.b.get(), (k7x0) vx0Var.c.get(), zym0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y71(g51 g51Var, w030 w030Var) {
        super(null);
        this.F = 1;
        this.H = g51Var;
        this.G = w030Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y71(w030 w030Var, Object obj, int i) {
        super(null);
        this.F = i;
        this.G = w030Var;
        this.H = obj;
    }
}
