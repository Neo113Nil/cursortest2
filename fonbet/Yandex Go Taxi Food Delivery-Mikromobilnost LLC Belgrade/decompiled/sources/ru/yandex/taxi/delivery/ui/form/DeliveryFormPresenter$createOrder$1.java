package ru.yandex.taxi.delivery.ui.form;

import defpackage.cbi;
import defpackage.h3i;
import defpackage.mvg;
import defpackage.nvi;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wai;
import defpackage.wls;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$createOrder$1", f = "DeliveryFormPresenter.kt", l = {509}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$createOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $offerId;
    final /* synthetic */ String $tariff;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryFormPresenter$createOrder$1(e eVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$offerId = str;
        this.$tariff = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryFormPresenter$createOrder$1(this.this$0, this.$offerId, this.$tariff, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryFormPresenter$createOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            ru.yandex.taxi.delivery.interactors.b bVar = eVar.e0;
            String str = this.$offerId;
            String str2 = this.$tariff;
            nvi nviVar = (nvi) eVar.Mg().getValue();
            h3i h3iVar = new h3i(str, str2, nviVar != null ? nviVar.l : null);
            cbi cbiVar = new cbi(this.this$0);
            this.label = 1;
            obj = bVar.a(h3iVar, cbiVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        UUID uuid = (UUID) obj;
        if (uuid != null) {
            e eVar2 = this.this$0;
            eVar2.x.a();
            eVar2.B.a("order_button");
            ((wai) eVar2.Dg()).close();
            eVar2.D.a(uuid);
        }
        return zy11.a;
    }
}
