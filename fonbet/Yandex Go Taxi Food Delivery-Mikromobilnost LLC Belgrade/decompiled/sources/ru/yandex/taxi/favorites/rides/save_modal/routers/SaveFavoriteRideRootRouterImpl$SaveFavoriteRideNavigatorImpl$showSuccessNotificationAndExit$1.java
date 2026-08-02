package ru.yandex.taxi.favorites.rides.save_modal.routers;

import defpackage.bdp;
import defpackage.f08;
import defpackage.f1h0;
import defpackage.iik0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wip;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.favorites.notification.FavoriteNotification;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.rides.save_modal.routers.SaveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$showSuccessNotificationAndExit$1", f = "SaveFavoriteRideRootRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SaveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$showSuccessNotificationAndExit$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$showSuccessNotificationAndExit$1(c cVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$title = str;
        this.$subtitle = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SaveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$showSuccessNotificationAndExit$1(this.this$0, this.$title, this.$subtitle, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SaveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$showSuccessNotificationAndExit$1 saveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$showSuccessNotificationAndExit$1 = (SaveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$showSuccessNotificationAndExit$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        saveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$showSuccessNotificationAndExit$1.invokeSuspend(zy11Var);
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
        c cVar = this.this$0;
        wip wipVar = cVar.J;
        String str = this.$title;
        String str2 = this.$subtitle;
        iik0 iik0Var = new iik0(23, cVar);
        wipVar.getClass();
        FavoriteNotification favoriteNotification = new FavoriteNotification(wipVar.a, "FavoriteNotification", str, str2, true, f1h0.ic_success_change);
        ru.yandex.taxi.design.utils.c.z(new bdp(2, iik0Var, wipVar), favoriteNotification);
        favoriteNotification.setExpiresListener(new f08(5, wipVar));
        favoriteNotification.startExpiresTimer(5000L);
        wipVar.b.e(favoriteNotification);
        this.this$0.r(new qu(9));
        return zy11.a;
    }
}
