package ru.yandex.taxi.contacts;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/content/Intent;", "<anonymous>", "(Ltse;)Landroid/content/Intent;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.contacts.GetContactsInteractor$openContactsForResult$2$waitResultAsync$1", f = "GetContactsInteractor.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class GetContactsInteractor$openContactsForResult$2$waitResultAsync$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetContactsInteractor$openContactsForResult$2$waitResultAsync$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetContactsInteractor$openContactsForResult$2$waitResultAsync$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetContactsInteractor$openContactsForResult$2$waitResultAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.activity.g gVar = this.this$0.c;
            this.label = 1;
            obj = gVar.d(13, this);
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
        r40 r40Var = (r40) obj;
        if (r40Var.a != -1) {
            return null;
        }
        return r40Var.c;
    }
}
