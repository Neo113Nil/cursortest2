package ru.yandex.taxi.favorites.rides.save_modal.routers;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzl0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.rides.save_modal.routers.SaveFavoriteRideRootRouterImpl$onLaunch$2", f = "SaveFavoriteRideRootRouterImpl.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SaveFavoriteRideRootRouterImpl$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ b $navigator;
    final /* synthetic */ rzl0 $payload;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveFavoriteRideRootRouterImpl$onLaunch$2(c cVar, b bVar, rzl0 rzl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$navigator = bVar;
        this.$payload = rzl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SaveFavoriteRideRootRouterImpl$onLaunch$2(this.this$0, this.$navigator, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SaveFavoriteRideRootRouterImpl$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.favorites.rides.save_modal.domain.b bVar = this.this$0.L;
            b bVar2 = this.$navigator;
            rzl0 rzl0Var = this.$payload;
            this.label = 1;
            if (bVar.d(bVar2, rzl0Var, this) == coroutineSingletons) {
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
