package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location;

import defpackage.co;
import defpackage.j73;
import defpackage.mvg;
import defpackage.n351;
import defpackage.ny61;
import defpackage.sgy;
import defpackage.svy;
import defpackage.xvy;
import defpackage.yvy;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lco;", "action", "", ClidProvider.STATE, "", "Ln351;", "<anonymous>", "(Lco;Z)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.LiveLocationStateHolder$widgetModelFlow$2", f = "LiveLocationStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LiveLocationStateHolder$widgetModelFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLocationStateHolder$widgetModelFlow$2(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LiveLocationStateHolder$widgetModelFlow$2 liveLocationStateHolder$widgetModelFlow$2 = new LiveLocationStateHolder$widgetModelFlow$2(this.this$0, (Continuation) obj3);
        liveLocationStateHolder$widgetModelFlow$2.L$0 = (co) obj;
        liveLocationStateHolder$widgetModelFlow$2.L$1 = (Boolean) obj2;
        return liveLocationStateHolder$widgetModelFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        co coVar = (co) this.L$0;
        Boolean bool = (Boolean) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        svy svyVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        sgy sgyVar = (coVar == null || bool == null) ? null : new sgy();
        if (coVar != null) {
            this.this$0.c.getClass();
            String str = coVar.a;
            svyVar = bool == null ? new svy(new xvy(str)) : new svy(new yvy(str, bool.booleanValue()));
        }
        return j73.A(new n351[]{sgyVar, svyVar});
    }
}
