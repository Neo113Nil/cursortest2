package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.c;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cost_detail.b;

/* loaded from: classes5.dex */
public final class qy8 implements v7p {
    public final /* synthetic */ int a;
    public final eqh b;
    public final p1g c;

    public /* synthetic */ qy8(p1g p1gVar, eqh eqhVar, int i) {
        this.a = i;
        this.c = p1gVar;
        this.b = eqhVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        eqh eqhVar = this.b;
        p1g p1gVar = this.c;
        switch (i) {
            case 0:
                return new c((q8s) p1gVar.get(), (a) eqhVar.get());
            case 1:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cart.a((q8s) p1gVar.get(), (a) eqhVar.get());
            case 2:
                return new b((q8s) p1gVar.get(), (a) eqhVar.get());
            case 3:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.discount.b((q8s) p1gVar.get(), (a) eqhVar.get());
            case 4:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.main_header.a((q8s) p1gVar.get(), (a) eqhVar.get());
            case 5:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address.b((q8s) p1gVar.get(), (a) eqhVar.get());
            case 6:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input.b((q8s) p1gVar.get(), (a) eqhVar.get());
            case 7:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.progress_bar.a((q8s) p1gVar.get(), (a) eqhVar.get());
            case 8:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scalable_selector.b((q8s) p1gVar.get(), (a) eqhVar.get());
            case 9:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scenario_selector.b((q8s) p1gVar.get(), (a) eqhVar.get());
            case 10:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items.b((q8s) p1gVar.get(), (a) eqhVar.get());
            case 11:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slider_button.a((q8s) p1gVar.get(), (a) eqhVar.get());
            default:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.b((q8s) p1gVar.get(), (a) eqhVar.get());
        }
    }

    public /* synthetic */ qy8(eqh eqhVar, p1g p1gVar, int i) {
        this.a = i;
        this.b = eqhVar;
        this.c = p1gVar;
    }
}
