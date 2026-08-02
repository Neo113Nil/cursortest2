package ru.yandex.taxi.scooters.domain;

import defpackage.kpm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersDamagePhotosInteractor$uploadPhotos$2", f = "ScootersDamagePhotosInteractor.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDamagePhotosInteractor$uploadPhotos$2 extends SuspendLambda implements tls {
    final /* synthetic */ List<kpm0> $scooterPhotos;
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDamagePhotosInteractor$uploadPhotos$2(f fVar, String str, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$sessionId = str;
        this.$scooterPhotos = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersDamagePhotosInteractor$uploadPhotos$2(this.this$0, this.$sessionId, this.$scooterPhotos, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersDamagePhotosInteractor$uploadPhotos$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            String str = this.$sessionId;
            List<kpm0> list = this.$scooterPhotos;
            this.label = 1;
            if (f.i(fVar, str, list, this) == coroutineSingletons) {
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
