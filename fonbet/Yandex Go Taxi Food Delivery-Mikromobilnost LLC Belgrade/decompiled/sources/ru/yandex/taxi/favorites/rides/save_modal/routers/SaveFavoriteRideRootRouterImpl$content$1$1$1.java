package ru.yandex.taxi.favorites.rides.save_modal.routers;

import defpackage.agd;
import defpackage.d0m0;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzl0;
import defpackage.s6k0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import defpackage.zzl0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$SaveRideModalButtonName;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$SaveRideModalCloseReason;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.rides.save_modal.routers.SaveFavoriteRideRootRouterImpl$content$1$1$1", f = "SaveFavoriteRideRootRouterImpl.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SaveFavoriteRideRootRouterImpl$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ d0m0 $action;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveFavoriteRideRootRouterImpl$content$1$1$1(c cVar, d0m0 d0m0Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$action = d0m0Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SaveFavoriteRideRootRouterImpl$content$1$1$1(this.this$0, this.$action, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SaveFavoriteRideRootRouterImpl$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
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
        ru.yandex.taxi.favorites.rides.save_modal.domain.b bVar = this.this$0.L;
        String str = ((zzl0) this.$action).a;
        rzl0 rzl0Var = (rzl0) ((agd) this.$this_buildContent).a;
        this.label = 1;
        s6k0 s6k0Var = bVar.e;
        s6k0Var.c = FavoritesAnalytics$SaveRideModalCloseReason.Save;
        s6k0Var.e(FavoritesAnalytics$SaveRideModalButtonName.Save, rzl0Var);
        String str2 = rzl0Var.b;
        String str3 = rzl0Var.a;
        if (evu0.J(str) || str.length() > 40) {
            obj2 = zy11Var;
        } else {
            boolean z = rzl0Var.i;
            ru.yandex.taxi.favorites.rides.save_modal.domain.c cVar = bVar.b;
            obj2 = z ? cVar.e(str3, str2, str, this) : cVar.b(str3, str2, str, this);
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
