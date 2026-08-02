package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.AddressDetailsState;

/* loaded from: classes5.dex */
public final /* synthetic */ class q61 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r61 c;
    public final /* synthetic */ ju0 w;

    public /* synthetic */ q61(r61 r61Var, boolean z, ju0 ju0Var) {
        this.c = r61Var;
        this.b = z;
        this.w = ju0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ju0 ju0Var = this.w;
        r61 r61Var = this.c;
        switch (i) {
            case 0:
                boj0 boj0Var = r61Var.g;
                int index = ju0Var.getIndex();
                boj0.i(boj0Var, this.b, index, (sls) obj, null, 24);
                break;
            default:
                if (this.b) {
                    r61Var.e.a = AddressDetailsState.LOADING;
                }
                a.a(r61Var.h, Integer.valueOf(ju0Var.getIndex()), null, 2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ q61(boolean z, r61 r61Var, ju0 ju0Var) {
        this.b = z;
        this.c = r61Var;
        this.w = ju0Var;
    }
}
