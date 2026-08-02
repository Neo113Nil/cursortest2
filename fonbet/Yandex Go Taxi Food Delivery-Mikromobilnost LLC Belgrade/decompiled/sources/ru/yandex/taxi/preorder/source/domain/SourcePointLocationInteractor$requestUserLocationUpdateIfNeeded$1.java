package ru.yandex.taxi.preorder.source.domain;

import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8z;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointLocationInteractor$requestUserLocationUpdateIfNeeded$1", f = "SourcePointLocationInteractor.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePointLocationInteractor$requestUserLocationUpdateIfNeeded$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointLocationInteractor$requestUserLocationUpdateIfNeeded$1(s sVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointLocationInteractor$requestUserLocationUpdateIfNeeded$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointLocationInteractor$requestUserLocationUpdateIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s sVar;
        s sVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                s sVar3 = this.this$0;
                try {
                    ru.yandex.taxi.location.autolocation.a aVar = sVar3.f;
                    this.L$0 = sVar3;
                    this.L$1 = sVar3;
                    this.label = 1;
                    Object o = ((ru.yandex.taxi.preorder.source.userposition.e) aVar.a).o(this);
                    if (o == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sVar = sVar3;
                    obj = o;
                    sVar2 = sVar;
                } catch (Throwable th) {
                    th = th;
                    sVar = sVar3;
                    sVar.h.getClass();
                    s8z.a("requestUserLocationUpdateIfNeeded", th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sVar = (s) this.L$1;
                sVar2 = (s) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    sVar.h.getClass();
                    s8z.a("requestUserLocationUpdateIfNeeded", th);
                    return zy11.a;
                }
            }
            sVar2.b((mo21) obj, "auto", false, false);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
