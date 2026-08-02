package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.timeline;

import defpackage.mvg;
import defpackage.ncz0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.t701;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isDarkTheme", "Lt701;", ClidProvider.STATE, "", "Lmcz0;", "<anonymous>", "(ZLt701;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.timeline.TimelineStateHolder$widgetModelFlow$1", f = "TimelineStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TimelineStateHolder$widgetModelFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineStateHolder$widgetModelFlow$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TimelineStateHolder$widgetModelFlow$1 timelineStateHolder$widgetModelFlow$1 = new TimelineStateHolder$widgetModelFlow$1(this.this$0, (Continuation) obj3);
        timelineStateHolder$widgetModelFlow$1.Z$0 = booleanValue;
        timelineStateHolder$widgetModelFlow$1.L$0 = (t701) obj2;
        return timelineStateHolder$widgetModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        t701 t701Var = (t701) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ncz0 ncz0Var = t701Var.a.p;
        return scc.h(ncz0Var != null ? this.this$0.a.r(ncz0Var, z) : null);
    }
}
