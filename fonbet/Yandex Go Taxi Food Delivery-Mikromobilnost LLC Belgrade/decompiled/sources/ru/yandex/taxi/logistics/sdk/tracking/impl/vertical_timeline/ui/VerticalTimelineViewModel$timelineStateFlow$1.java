package ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui;

import defpackage.mvg;
import defpackage.ncz0;
import defpackage.ny61;
import defpackage.o9z0;
import defpackage.p9z0;
import defpackage.q9z0;
import defpackage.s9z0;
import defpackage.t701;
import defpackage.w511;
import defpackage.w9z0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isDarkTheme", "Lt701;", ClidProvider.STATE, "Lo9z0;", "<anonymous>", "(ZLt701;)Lo9z0;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.VerticalTimelineViewModel$timelineStateFlow$1", f = "VerticalTimelineViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class VerticalTimelineViewModel$timelineStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalTimelineViewModel$timelineStateFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        VerticalTimelineViewModel$timelineStateFlow$1 verticalTimelineViewModel$timelineStateFlow$1 = new VerticalTimelineViewModel$timelineStateFlow$1(this.this$0, (Continuation) obj3);
        verticalTimelineViewModel$timelineStateFlow$1.Z$0 = booleanValue;
        verticalTimelineViewModel$timelineStateFlow$1.L$0 = (t701) obj2;
        return verticalTimelineViewModel$timelineStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w9z0 w9z0Var;
        s9z0 s9z0Var;
        boolean z = this.Z$0;
        t701 t701Var = (t701) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ncz0 ncz0Var = t701Var.a.p;
        q9z0 q9z0Var = (ncz0Var == null || (w9z0Var = this.this$0.y.r(ncz0Var, z).d) == null || (s9z0Var = w9z0Var.e) == null) ? null : s9z0Var.d;
        if (q9z0Var instanceof o9z0) {
            return (o9z0) q9z0Var;
        }
        if (q9z0Var == null || q9z0Var.equals(p9z0.a)) {
            return this.this$0.b.a;
        }
        w511.b();
        return null;
    }
}
