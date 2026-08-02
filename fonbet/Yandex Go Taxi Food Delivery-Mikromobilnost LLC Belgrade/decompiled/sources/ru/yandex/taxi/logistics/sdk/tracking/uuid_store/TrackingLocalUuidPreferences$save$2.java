package ru.yandex.taxi.logistics.sdk.tracking.uuid_store;

import defpackage.ez40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", "it", "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.uuid_store.TrackingLocalUuidPreferences$save$2", f = "TrackingLocalUuidPreferences.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TrackingLocalUuidPreferences$save$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, UUID> $map;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingLocalUuidPreferences$save$2(b bVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$map = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackingLocalUuidPreferences$save$2 trackingLocalUuidPreferences$save$2 = new TrackingLocalUuidPreferences$save$2(this.this$0, this.$map, continuation);
        trackingLocalUuidPreferences$save$2.L$0 = obj;
        return trackingLocalUuidPreferences$save$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TrackingLocalUuidPreferences$save$2 trackingLocalUuidPreferences$save$2 = (TrackingLocalUuidPreferences$save$2) create((ez40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        trackingLocalUuidPreferences$save$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ez40 ez40Var = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        ez40Var.g(bVar.b, bVar.c.toJson(this.$map));
        return zy11.a;
    }
}
