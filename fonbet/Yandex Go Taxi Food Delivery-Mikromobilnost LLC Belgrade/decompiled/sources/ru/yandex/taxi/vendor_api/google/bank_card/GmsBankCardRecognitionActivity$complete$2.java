package ru.yandex.taxi.vendor_api.google.bank_card;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.vendor_api.google.bank_card.GmsBankCardRecognitionActivity$complete$2", f = "GmsBankCardRecognitionActivity.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class GmsBankCardRecognitionActivity$complete$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ GmsBankCardRecognitionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmsBankCardRecognitionActivity$complete$2(GmsBankCardRecognitionActivity gmsBankCardRecognitionActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gmsBankCardRecognitionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GmsBankCardRecognitionActivity$complete$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GmsBankCardRecognitionActivity$complete$2 gmsBankCardRecognitionActivity$complete$2 = (GmsBankCardRecognitionActivity$complete$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        gmsBankCardRecognitionActivity$complete$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.finish();
        return zy11.a;
    }
}
