package ru.yandex.taxi.preorder.source.mode.interactor;

import defpackage.mvg;
import defpackage.nwx0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.mode.interactor.SourcePointBadgeVisibilityInteractor$updateBadgeVisibilityBasedOnMode$3$1", f = "SourcePointBadgeVisibilityInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePointBadgeVisibilityInteractor$updateBadgeVisibilityBasedOnMode$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isBadgeUnavailable;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointBadgeVisibilityInteractor$updateBadgeVisibilityBasedOnMode$3$1(d dVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$isBadgeUnavailable = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointBadgeVisibilityInteractor$updateBadgeVisibilityBasedOnMode$3$1(this.this$0, this.$isBadgeUnavailable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SourcePointBadgeVisibilityInteractor$updateBadgeVisibilityBasedOnMode$3$1 sourcePointBadgeVisibilityInteractor$updateBadgeVisibilityBasedOnMode$3$1 = (SourcePointBadgeVisibilityInteractor$updateBadgeVisibilityBasedOnMode$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sourcePointBadgeVisibilityInteractor$updateBadgeVisibilityBasedOnMode$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((nwx0) this.this$0.c).a.c();
        boolean z = this.$isBadgeUnavailable;
        d dVar = this.this$0;
        if (z) {
            ((nwx0) dVar.c).a.c().o9();
        } else {
            ((nwx0) dVar.c).a.c().Nd();
        }
        return zy11.a;
    }
}
