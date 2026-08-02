package ru.yandex.taxi.favorites.rides.delete_modal;

import android.content.Context;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.trh;
import defpackage.tse;
import defpackage.urh;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.rides.delete_modal.DeleteModalRouterImpl$onLaunch$1", f = "DeleteModalRouterImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeleteModalRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteModalRouterImpl$onLaunch$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeleteModalRouterImpl$onLaunch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteModalRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.favorites.rides.delete_modal.domain.a aVar = this.this$0.J;
        this.label = 1;
        Context context = aVar.a;
        aVar.d.emit(new urh(context.getString(kyh0.favorite_ride_delete_modal_title), context.getString(kyh0.favorite_ride_delete_modal_subtitle), new trh(true, false, context.getString(kyh0.favorites_delete_modal_view_negative_button_title), null), new trh(true, false, context.getString(kyh0.favorites_delete_modal_view_positive_button_title), context.getString(kyh0.favorites_delete_modal_view_positive_button_title_progress))), this);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
