package defpackage;

import android.content.Context;
import com.yandex.go.overdraft.ui.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.ComboOrder;
import ru.yandex.taxi.combo.ui.AcceptComboOrderModalView;
import ru.yandex.taxi.interactor.a;
import ru.yandex.taxi.ui.form.RequirementAddressFormModalView;

/* loaded from: classes5.dex */
public final class sjc implements y880 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ sjc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0195  */
    @Override // defpackage.y880
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(x880 x880Var) {
        String str;
        xb xbVar;
        xb xbVar2;
        switch (this.a) {
            case 0:
                xb xbVar3 = xb.k;
                yb ybVar = (yb) this.c;
                zuj0 zuj0Var = ybVar.b;
                fnx0 n = ((k) ybVar.a).n();
                if (n != null) {
                    pex0 pex0Var = n.c;
                    if (pex0Var.O instanceof ojc) {
                        ComboOrder.PopupProperties popupProperties = pex0Var.f0.a;
                        n7v n7vVar = popupProperties.a;
                        String str2 = popupProperties.b;
                        String str3 = popupProperties.c;
                        String str4 = popupProperties.d;
                        ComboOrder.FakePassengersNumberSelector fakePassengersNumberSelector = popupProperties.f;
                        String str5 = fakePassengersNumberSelector.a;
                        String str6 = fakePassengersNumberSelector.b;
                        int i = fakePassengersNumberSelector.c;
                        int i2 = fakePassengersNumberSelector.d;
                        String str7 = fakePassengersNumberSelector.e;
                        ComboOrder.BufferListItem bufferListItem = popupProperties.e;
                        String str8 = bufferListItem.a;
                        String str9 = bufferListItem.b;
                        ComboOrder.BufferListItem.Companion.getClass();
                        boolean equals = bufferListItem.equals(ComboOrder.BufferListItem.c);
                        jgv jgvVar = ybVar.c;
                        if (equals) {
                            String a = jgvVar.a(n7vVar);
                            str = a != null ? a : "";
                            if (str3.length() == 0) {
                                str3 = ((avj0) zuj0Var).h(kyh0.common_back);
                            }
                            xbVar = new xb(i, i2, str, str2, str5, str6, "", str3, str4.length() == 0 ? ((avj0) zuj0Var).h(kyh0.common_next) : str4, str7);
                        } else {
                            String a2 = jgvVar.a(n7vVar);
                            str = a2 != null ? a2 : "";
                            if (str3.length() == 0) {
                                str3 = ((avj0) zuj0Var).h(kyh0.common_back);
                            }
                            xbVar = new xb(i, i2, str, str2, str8, str9, str5, str3, str4.length() == 0 ? ((avj0) zuj0Var).h(kyh0.common_next) : str4, str7);
                        }
                        if (xbVar.a.length() > 0 && xbVar.b.length() > 0) {
                            xbVar2 = xbVar;
                            if (!xbVar2.equals(xbVar3)) {
                                x880Var.n();
                                break;
                            } else {
                                bc bcVar = (bc) this.b;
                                ((i130) bcVar.b).a().k(new AcceptComboOrderModalView((Context) bcVar.a, (pav) bcVar.c, (pta0) bcVar.w, xbVar2, (zb) bcVar.x).withCallback(new rjc(x880Var)), 2.0f, true);
                                break;
                            }
                        }
                    }
                }
                xbVar2 = xbVar3;
                if (!xbVar2.equals(xbVar3)) {
                }
                break;
            case 1:
                g gVar = (g) this.b;
                rjc rjcVar = new rjc(x880Var);
                gVar.getClass();
                gVar.C = rjcVar;
                if (!((g) this.b).i(((dqe0) this.c).a)) {
                    x880Var.n();
                    break;
                }
                break;
            default:
                if (!((ro0) this.c).a()) {
                    x880Var.n();
                    break;
                } else {
                    fcj0 fcj0Var = (fcj0) this.b;
                    rjc rjcVar2 = new rjc(x880Var);
                    ((wbj0) fcj0Var.b).getClass();
                    wrr wrrVar = ((ecj0) fcj0Var.c).a;
                    ((i130) fcj0Var.e).a().s(new RequirementAddressFormModalView((Context) fcj0Var.a, new dcj0(rjcVar2, (a) ((xvf0) wrrVar.b).get(), (jr10) ((xvf0) wrrVar.c).get(), (ru.yandex.taxi.orderforanother.repository.a) ((v0g) wrrVar.w).get(), (vbj0) ((xvf0) wrrVar.x).get(), (ro0) ((xvf0) wrrVar.y).get(), (gcj0) ((tgb0) wrrVar.z).get(), (pav) ((xvf0) wrrVar.A).get()), (f580) fcj0Var.d), true);
                    break;
                }
        }
    }
}
