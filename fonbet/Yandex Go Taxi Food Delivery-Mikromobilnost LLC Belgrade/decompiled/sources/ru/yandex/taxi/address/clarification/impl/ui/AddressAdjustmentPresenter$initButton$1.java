package ru.yandex.taxi.address.clarification.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sp0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.map_object.a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.clarification.impl.ui.AddressAdjustmentPresenter$initButton$1", f = "AddressAdjustmentPresenter.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressAdjustmentPresenter$initButton$1 extends SuspendLambda implements wls {
    final /* synthetic */ a0 $screenParam;
    Object L$0;
    int label;
    final /* synthetic */ zp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressAdjustmentPresenter$initButton$1(zp0 zp0Var, a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zp0Var;
        this.$screenParam = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressAdjustmentPresenter$initButton$1(this.this$0, this.$screenParam, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressAdjustmentPresenter$initButton$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sp0 sp0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            sp0 sp0Var2 = (sp0) this.this$0.Dg();
            ru.yandex.taxi.widget.c cVar = this.this$0.B;
            FormattedText formattedText = this.$screenParam.c.a;
            this.L$0 = sp0Var2;
            this.label = 1;
            Object i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, this, 30);
            if (i2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = i2;
            sp0Var = sp0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sp0Var = (sp0) this.L$0;
            kotlin.b.b(obj);
        }
        sp0Var.f1((CharSequence) obj);
        return zy11.a;
    }
}
