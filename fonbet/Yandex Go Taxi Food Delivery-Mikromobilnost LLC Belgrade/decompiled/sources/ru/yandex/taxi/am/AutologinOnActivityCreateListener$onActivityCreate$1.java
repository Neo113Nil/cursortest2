package ru.yandex.taxi.am;

import androidx.lifecycle.Lifecycle;
import defpackage.cey;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yvi0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AutologinOnActivityCreateListener$onActivityCreate$1", f = "AutologinOnActivityCreateListener.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AutologinOnActivityCreateListener$onActivityCreate$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutologinOnActivityCreateListener$onActivityCreate$1(v vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutologinOnActivityCreateListener$onActivityCreate$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutologinOnActivityCreateListener$onActivityCreate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.preload.e eVar = this.this$0.b;
            this.label = 1;
            eVar.c(this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        final v vVar = this.this$0;
        cey.b(vVar.c, Lifecycle.Event.ON_START, new Runnable() { // from class: ru.yandex.taxi.am.u
            @Override // java.lang.Runnable
            public final void run() {
                v vVar2 = v.this;
                vVar2.a.r = new yvi0(vVar2);
                com.yandex.go.coroutines.b.g(vVar2.d, null, null, new AutologinOnActivityCreateListener$onActivityCreate$1$1$2(vVar2, null), 3);
            }
        });
        return zy11Var;
    }
}
