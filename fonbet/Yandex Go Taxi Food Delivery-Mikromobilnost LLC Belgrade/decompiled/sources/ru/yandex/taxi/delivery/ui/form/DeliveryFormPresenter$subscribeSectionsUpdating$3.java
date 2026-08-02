package ru.yandex.taxi.delivery.ui.form;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a22;
import defpackage.ati;
import defpackage.avj0;
import defpackage.bbi;
import defpackage.c2r0;
import defpackage.cni;
import defpackage.dzg0;
import defpackage.fbi;
import defpackage.fki;
import defpackage.fnx0;
import defpackage.fx70;
import defpackage.gbi;
import defpackage.gki;
import defpackage.hai;
import defpackage.j73;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mji0;
import defpackage.mrj;
import defpackage.mvg;
import defpackage.mzg0;
import defpackage.nq0;
import defpackage.nvi;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qv10;
import defpackage.rsn;
import defpackage.scc;
import defpackage.sk2;
import defpackage.tcc;
import defpackage.twh;
import defpackage.vng;
import defpackage.vuh;
import defpackage.w511;
import defpackage.wli;
import defpackage.wls;
import defpackage.x5i;
import defpackage.xmi;
import defpackage.zbi;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.extracted_form_common_data.api.DeliveryDataProvider$UpdateState;
import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;
import ru.yandex.taxi.tariffs.model.DeliveryInformationForm;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrsn;", "Lwli;", "it", "Lzy11;", "<anonymous>", "(Lrsn;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$subscribeSectionsUpdating$3", f = "DeliveryFormPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$subscribeSectionsUpdating$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryFormPresenter$subscribeSectionsUpdating$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryFormPresenter$subscribeSectionsUpdating$3 deliveryFormPresenter$subscribeSectionsUpdating$3 = new DeliveryFormPresenter$subscribeSectionsUpdating$3(this.this$0, continuation);
        deliveryFormPresenter$subscribeSectionsUpdating$3.L$0 = obj;
        return deliveryFormPresenter$subscribeSectionsUpdating$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryFormPresenter$subscribeSectionsUpdating$3 deliveryFormPresenter$subscribeSectionsUpdating$3 = (DeliveryFormPresenter$subscribeSectionsUpdating$3) create((rsn) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryFormPresenter$subscribeSectionsUpdating$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mrj mrjVar;
        twh twhVar;
        DeliveryFormType deliveryFormType;
        pex0 pex0Var;
        ati atiVar;
        DeliveryInformationForm deliveryInformationForm;
        rsn rsnVar = (rsn) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.f0.b();
        wli wliVar = (wli) rsnVar.b;
        wli wliVar2 = (wli) rsnVar.a;
        nvi nviVar = wliVar.b;
        List list = wliVar.c;
        boolean l = jl40.l(nviVar, wliVar2 != null ? wliVar2.b : null);
        boolean l2 = jl40.l(list, wliVar2 != null ? wliVar2.c : null);
        DeliveryFormType deliveryFormType2 = wliVar.d;
        boolean z = deliveryFormType2 != (wliVar2 != null ? wliVar2.d : null);
        x5i x5iVar = wliVar.a;
        if (x5iVar.b == DeliveryDataProvider$UpdateState.NEED_UPDATE || !l || !l2 || z) {
            e eVar = this.this$0;
            cni cniVar = x5iVar.a;
            nvi nviVar2 = wliVar.b;
            gbi gbiVar = eVar.H;
            qv10.B(!cniVar.b.isEmpty(), eVar.o0, null);
            if (deliveryFormType2 == null) {
                fnx0 n = ((k) eVar.W).n();
                DeliveryInformationForm.FormType formType = (n == null || (pex0Var = n.c) == null || (atiVar = pex0Var.Z) == null || (deliveryInformationForm = atiVar.e) == null) ? null : deliveryInformationForm.a;
                int i = formType == null ? -1 : bbi.a[formType.ordinal()];
                if (i == 1) {
                    deliveryFormType = DeliveryFormType.SHORT;
                } else if (i == 2) {
                    deliveryFormType = DeliveryFormType.MINIMAL;
                } else if (i == 3) {
                    deliveryFormType = DeliveryFormType.REDUCED;
                } else if (i != 4) {
                    deliveryFormType2 = null;
                    if (deliveryFormType2 == null) {
                        deliveryFormType2 = gbiVar.a.p;
                    }
                } else {
                    deliveryFormType = DeliveryFormType.FULL;
                }
                deliveryFormType2 = deliveryFormType;
                if (deliveryFormType2 == null) {
                }
            }
            gbiVar.getClass();
            String str = nviVar2.b;
            if (str == null) {
                str = nviVar2.a;
            }
            fx70 fx70Var = nviVar2.k;
            zbi zbiVar = new zbi(str, fx70Var != null ? new sk2(fx70Var.a, !gbiVar.g.a.getThemeType().c() ? fx70Var.b : fx70Var.c) : null);
            nq0 a = gbiVar.a(gki.a, cniVar.a, deliveryFormType2);
            xmi xmiVar = !list.isEmpty() ? new xmi(list) : null;
            List list2 = cniVar.b;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            int i2 = 0;
            for (Object obj2 : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                arrayList.add(gbiVar.a(new fki(i2), (vuh) obj2, deliveryFormType2));
                i2 = i3;
            }
            int i4 = fbi.a[deliveryFormType2.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                a22 a22Var = gbiVar.e;
                if (gbiVar.a.r) {
                    int size = gbiVar.b.a.l().b.size();
                    pex0 m = ((k) gbiVar.i.a).m();
                    mrj mrjVar2 = size < (m != null ? m.o0 : 0) ? new mrj(29, ((avj0) a22Var.a).h(kyh0.delivery_form_add_address_button_title), vng.t(dzg0.ic_plus, ((avj0) a22Var.a).a), null) : null;
                    if (arrayList.size() > 1) {
                        avj0 avj0Var = (avj0) a22Var.a;
                        mrjVar = new mrj(29, avj0Var.h(kyh0.delivery_form_change_order_button_title), vng.t(mzg0.ic_delivery_arrow_sorting, avj0Var.a), avj0Var.i(kyh0.delivery_form_change_order_button_subtitle, nviVar2.e));
                    } else {
                        mrjVar = null;
                    }
                    if (mrjVar2 != null || mrjVar != null) {
                        twhVar = new twh(mrjVar2, mrjVar);
                        c2r0 c2r0Var = new c2r0(5, 1);
                        c2r0Var.a(zbiVar);
                        c2r0Var.a(a);
                        c2r0Var.b(arrayList.toArray(new hai[0]));
                        c2r0Var.a(twhVar);
                        c2r0Var.a(xmiVar);
                        ArrayList arrayList2 = c2r0Var.b;
                        List A = j73.A(arrayList2.toArray(new hai[arrayList2.size()]));
                        r0 r0Var = gbiVar.c.a;
                        mji0 mji0Var = new mji0(A);
                        r0Var.getClass();
                        r0Var.m(null, mji0Var);
                    }
                }
            } else if (i4 != 4) {
                w511.b();
                return null;
            }
            twhVar = null;
            c2r0 c2r0Var2 = new c2r0(5, 1);
            c2r0Var2.a(zbiVar);
            c2r0Var2.a(a);
            c2r0Var2.b(arrayList.toArray(new hai[0]));
            c2r0Var2.a(twhVar);
            c2r0Var2.a(xmiVar);
            ArrayList arrayList22 = c2r0Var2.b;
            List A2 = j73.A(arrayList22.toArray(new hai[arrayList22.size()]));
            r0 r0Var2 = gbiVar.c.a;
            mji0 mji0Var2 = new mji0(A2);
            r0Var2.getClass();
            r0Var2.m(null, mji0Var2);
        }
        return zy11.a;
    }
}
