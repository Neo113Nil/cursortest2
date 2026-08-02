package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o9n0;
import defpackage.pan0;
import defpackage.qan0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.scooters.domain.m;
import ru.yandex.taxi.scooters.domain.model.ScootersPhotoShootingException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoPresenter$realTakePicture$1", f = "ScootersCompletionTakePhotoPresenter.kt", l = {120, Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionTakePhotoPresenter$realTakePicture$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionTakePhotoPresenter$realTakePicture$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCompletionTakePhotoPresenter$realTakePicture$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCompletionTakePhotoPresenter$realTakePicture$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                dVar = this.this$0;
                try {
                    m mVar = dVar.x;
                    qan0 qan0Var = new qan0(0, dVar.D);
                    this.L$0 = dVar;
                    this.L$1 = dVar;
                    this.label = 1;
                    if (mVar.a.a(qan0Var, this) != coroutineSingletons) {
                        dVar3 = dVar;
                    }
                    return coroutineSingletons;
                } catch (Throwable unused) {
                    dVar2 = dVar;
                    ((pan0) dVar2.Dg()).v3();
                    ((o9n0) dVar2.E).b(new ScootersPhotoShootingException(), null, null);
                    return zy11.a;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar2 = (d) this.L$1;
                dVar4 = (d) this.L$0;
                try {
                    kotlin.b.b(obj);
                    ((pan0) dVar4.Dg()).v3();
                    ((pan0) dVar4.Dg()).success();
                } catch (Throwable unused2) {
                    ((pan0) dVar2.Dg()).v3();
                    ((o9n0) dVar2.E).b(new ScootersPhotoShootingException(), null, null);
                    return zy11.a;
                }
                return zy11.a;
            }
            dVar3 = (d) this.L$1;
            d dVar5 = (d) this.L$0;
            try {
                kotlin.b.b(obj);
                dVar = dVar5;
            } catch (Throwable unused3) {
                dVar2 = dVar3;
                ((pan0) dVar2.Dg()).v3();
                ((o9n0) dVar2.E).b(new ScootersPhotoShootingException(), null, null);
                return zy11.a;
            }
            this.L$0 = dVar;
            this.L$1 = dVar3;
            this.label = 2;
            if (d.Lg(dVar, this) != coroutineSingletons) {
                dVar4 = dVar;
                dVar2 = dVar3;
                ((pan0) dVar4.Dg()).v3();
                ((pan0) dVar4.Dg()).success();
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
