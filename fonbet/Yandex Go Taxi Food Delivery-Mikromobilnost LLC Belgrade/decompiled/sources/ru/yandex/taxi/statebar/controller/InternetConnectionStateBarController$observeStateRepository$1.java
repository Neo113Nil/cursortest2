package ru.yandex.taxi.statebar.controller;

import defpackage.b9p;
import defpackage.c9p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qz10;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.statebar.controller.InternetConnectionStateBarController$observeStateRepository$1", f = "InternetConnectionStateBarController.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class InternetConnectionStateBarController$observeStateRepository$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternetConnectionStateBarController$observeStateRepository$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InternetConnectionStateBarController$observeStateRepository$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InternetConnectionStateBarController$observeStateRepository$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c9p c9pVar = this.this$0.n;
            this.label = 1;
            obj = c9pVar.a.b(this);
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
        boolean z = ((b9p) obj).b;
        a aVar = this.this$0;
        if (z) {
            tje.N(aVar.r.c(), null, null, new InternetConnectionStateBarController$observeStateRepository$1$invokeSuspend$$inlined$safeCollectIn$2(aVar.m.z, null, this.this$0), 3);
        } else {
            tje.N(this.this$0.r.c(), null, null, new InternetConnectionStateBarController$observeStateRepository$1$invokeSuspend$$inlined$safeCollectIn$1(e.r(aVar.l.c, new qz10(11)), null, this.this$0), 3);
        }
        return zy11.a;
    }
}
