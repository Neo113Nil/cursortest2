package ru.yandex.taxi.delivery.ui.form;

import defpackage.fm2;
import defpackage.gci;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qz10;
import defpackage.sb0;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.delivery.ui.form.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$showEmptyApartmentPopup$1", f = "DeliveryFormPresenter.kt", l = {468}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$showEmptyApartmentPopup$1 extends SuspendLambda implements wls {
    final /* synthetic */ fm2 $apartmentAlertInfo;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryFormPresenter$showEmptyApartmentPopup$1(fm2 fm2Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$apartmentAlertInfo = fm2Var;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryFormPresenter$showEmptyApartmentPopup$1(this.$apartmentAlertInfo, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryFormPresenter$showEmptyApartmentPopup$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [dbi] */
    /* JADX WARN: Type inference failed for: r6v2, types: [dbi] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            final DeliveryFormStepType a = this.$apartmentAlertInfo.a.a();
            gci gciVar = this.this$0.O;
            gciVar.getClass();
            gciVar.a("IncompleteAddressAlert.Shown", a, new qz10(12));
            final e eVar = this.this$0;
            ru.yandex.taxi.delivery.extracted_delivery_form.interactors.a aVar = eVar.A;
            final int i3 = 0;
            ?? r5 = new sls() { // from class: dbi
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i3;
                    zy11 zy11Var = zy11.a;
                    DeliveryFormStepType deliveryFormStepType = a;
                    e eVar2 = eVar;
                    switch (i4) {
                        case 0:
                            gci gciVar2 = eVar2.O;
                            gciVar2.getClass();
                            gciVar2.a("IncompleteAddressAlert.Closed", deliveryFormStepType, new qz10(12));
                            ((wai) eVar2.Dg()).hd();
                            break;
                        default:
                            gci gciVar3 = eVar2.O;
                            gciVar3.getClass();
                            gciVar3.a("IncompleteAddressAlert.Tapped", deliveryFormStepType, new wwb("continue", 10));
                            eVar2.Kg();
                            break;
                    }
                    return zy11Var;
                }
            };
            sb0 sb0Var = new sb0(28, eVar, a, this.$apartmentAlertInfo);
            ?? r6 = new sls() { // from class: dbi
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i2;
                    zy11 zy11Var = zy11.a;
                    DeliveryFormStepType deliveryFormStepType = a;
                    e eVar2 = eVar;
                    switch (i4) {
                        case 0:
                            gci gciVar2 = eVar2.O;
                            gciVar2.getClass();
                            gciVar2.a("IncompleteAddressAlert.Closed", deliveryFormStepType, new qz10(12));
                            ((wai) eVar2.Dg()).hd();
                            break;
                        default:
                            gci gciVar3 = eVar2.O;
                            gciVar3.getClass();
                            gciVar3.a("IncompleteAddressAlert.Tapped", deliveryFormStepType, new wwb("continue", 10));
                            eVar2.Kg();
                            break;
                    }
                    return zy11Var;
                }
            };
            this.L$0 = null;
            this.label = 1;
            if (aVar.a(r5, sb0Var, r6, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
