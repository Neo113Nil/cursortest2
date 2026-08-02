package ru.yandex.taxi.logistics.sdk.tracking.uuid_store;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvpr;", "", "", "Ljava/util/UUID;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.uuid_store.TrackingLocalUuidPreferences$localUuidsMapFlow$2", f = "TrackingLocalUuidPreferences.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TrackingLocalUuidPreferences$localUuidsMapFlow$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackingLocalUuidPreferences$localUuidsMapFlow$2 trackingLocalUuidPreferences$localUuidsMapFlow$2 = new TrackingLocalUuidPreferences$localUuidsMapFlow$2(3, (Continuation) obj3);
        trackingLocalUuidPreferences$localUuidsMapFlow$2.L$0 = (vpr) obj;
        return trackingLocalUuidPreferences$localUuidsMapFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Map f = kotlin.collections.b.f();
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(f, this) == coroutineSingletons) {
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
