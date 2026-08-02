package ru.yandex.taxi.modal.popup.ui.model;

import defpackage.bvf0;
import defpackage.f8e0;
import defpackage.mvg;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lt7e0;", "<anonymous>", "(Ltse;)Lt7e0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.modal.popup.ui.model.PopupDialogModalVOMapper$mapBullets$2$1$1", f = "PopupDialogModalVOMapper.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PopupDialogModalVOMapper$mapBullets$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ f8e0 $description;
    final /* synthetic */ int $index;
    final /* synthetic */ n8e0 $model;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupDialogModalVOMapper$mapBullets$2$1$1(a aVar, f8e0 f8e0Var, int i, n8e0 n8e0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$description = f8e0Var;
        this.$index = i;
        this.$model = n8e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PopupDialogModalVOMapper$mapBullets$2$1$1(this.this$0, this.$description, this.$index, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PopupDialogModalVOMapper$mapBullets$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        f8e0 f8e0Var = this.$description;
        boolean z = this.$index != scc.f(this.$model.f);
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new PopupDialogModalVOMapper$mapBullet$2(f8e0Var, aVar, z, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
