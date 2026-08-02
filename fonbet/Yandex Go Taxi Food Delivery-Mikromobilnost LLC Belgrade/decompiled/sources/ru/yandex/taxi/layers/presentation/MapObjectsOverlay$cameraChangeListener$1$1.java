package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.map.CameraPosition;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$cameraChangeListener$1$1", f = "MapObjectsOverlay.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectsOverlay$cameraChangeListener$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ CameraPosition $cameraPosition;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$cameraChangeListener$1$1(f fVar, CameraPosition cameraPosition, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$cameraPosition = cameraPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapObjectsOverlay$cameraChangeListener$1$1(this.this$0, this.$cameraPosition, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MapObjectsOverlay$cameraChangeListener$1$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            CameraPosition cameraPosition = this.$cameraPosition;
            this.label = 1;
            if (f.Ig(fVar, cameraPosition, this) == coroutineSingletons) {
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
