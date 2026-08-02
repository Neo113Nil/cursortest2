package ru.yandex.logistics.cargo_form.async.impl.storage;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w2s;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.cargo_form.async.impl.storage.FormActiveTasksClearListener$onUnauthorized$1", f = "FormActiveTasksClearListener.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class FormActiveTasksClearListener$onUnauthorized$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormActiveTasksClearListener$onUnauthorized$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FormActiveTasksClearListener$onUnauthorized$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FormActiveTasksClearListener$onUnauthorized$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0.a;
        this.label = 1;
        Object a = androidx.datastore.preferences.core.b.a(w2s.a(b.c, bVar.a), new FormActiveTasksDataStore$clear$2(2, null), this);
        if (a != coroutineSingletons) {
            a = zy11Var;
        }
        return a == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
