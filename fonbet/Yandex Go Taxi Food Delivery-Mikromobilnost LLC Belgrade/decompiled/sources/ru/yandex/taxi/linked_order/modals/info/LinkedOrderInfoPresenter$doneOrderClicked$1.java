package ru.yandex.taxi.linked_order.modals.info;

import defpackage.mvg;
import defpackage.nny;
import defpackage.ny61;
import defpackage.ony;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.linked_order.provider.e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoPresenter$doneOrderClicked$1", f = "LinkedOrderInfoPresenter.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class LinkedOrderInfoPresenter$doneOrderClicked$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ ony this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedOrderInfoPresenter$doneOrderClicked$1(ony onyVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = onyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkedOrderInfoPresenter$doneOrderClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkedOrderInfoPresenter$doneOrderClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ony onyVar = this.this$0;
            String str = onyVar.I;
            if (str != null) {
                e eVar = onyVar.E;
                this.L$0 = null;
                this.label = 1;
                if (eVar.a(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ((nny) this.this$0.Dg()).td(true);
        return zy11.a;
    }
}
