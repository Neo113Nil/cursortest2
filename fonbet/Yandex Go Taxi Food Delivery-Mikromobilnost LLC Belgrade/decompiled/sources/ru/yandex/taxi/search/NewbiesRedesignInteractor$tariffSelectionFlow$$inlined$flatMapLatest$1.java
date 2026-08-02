package ru.yandex.taxi.search;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.internal.repository.o;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.NewbiesRedesignInteractor$tariffSelectionFlow$$inlined$flatMapLatest$1", f = "NewbiesRedesignInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class NewbiesRedesignInteractor$tariffSelectionFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewbiesRedesignInteractor$tariffSelectionFlow$$inlined$flatMapLatest$1(Continuation continuation, c cVar) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NewbiesRedesignInteractor$tariffSelectionFlow$$inlined$flatMapLatest$1 newbiesRedesignInteractor$tariffSelectionFlow$$inlined$flatMapLatest$1 = new NewbiesRedesignInteractor$tariffSelectionFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        newbiesRedesignInteractor$tariffSelectionFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        newbiesRedesignInteractor$tariffSelectionFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return newbiesRedesignInteractor$tariffSelectionFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr oVar = (this.this$0.c.e() || this.this$0.c.h()) ? new o(((k) this.this$0.b).j.b) : ((k) this.this$0.b).g();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(oVar, vprVar, this) == coroutineSingletons) {
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
