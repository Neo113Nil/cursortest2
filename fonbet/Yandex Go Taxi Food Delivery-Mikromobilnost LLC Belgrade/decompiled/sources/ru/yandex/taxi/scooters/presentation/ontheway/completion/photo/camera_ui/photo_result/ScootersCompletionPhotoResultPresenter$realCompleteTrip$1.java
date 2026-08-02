package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result;

import defpackage.a6o0;
import defpackage.b6o0;
import defpackage.h6o0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o9n0;
import defpackage.pib0;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.domain.m;
import ru.yandex.taxi.scooters.presentation.detailed_order.ScootersOrderLifecycleAnalytics$OrderCloseReason;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.AbortAttemptByBleException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.ScootersCompletionPhotoResultPresenter$realCompleteTrip$1", f = "ScootersCompletionPhotoResultPresenter.kt", l = {119}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoResultPresenter$realCompleteTrip$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoResultPresenter$realCompleteTrip$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCompletionPhotoResultPresenter$realCompleteTrip$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCompletionPhotoResultPresenter$realCompleteTrip$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: all -> 0x0097, TryCatch #2 {all -> 0x0097, blocks: (B:24:0x008b, B:26:0x008f, B:27:0x0099, B:39:0x00a2), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #2 {all -> 0x0097, blocks: (B:24:0x008b, B:26:0x008f, B:27:0x0099, B:39:0x00a2), top: B:2:0x0005 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons, zc5] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        c cVar3;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar4 = this.this$0;
                try {
                    m mVar = cVar4.B;
                    a6o0 a6o0Var = cVar4.H;
                    this.L$0 = cVar4;
                    this.L$1 = cVar4;
                    this.L$2 = cVar4;
                    this.label = 1;
                    if (mVar.a(a6o0Var, this) == r0) {
                        return r0;
                    }
                    cVar3 = cVar4;
                    cVar = cVar3;
                    cVar2 = cVar;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cVar = cVar4;
                    cVar2 = cVar;
                    if (th instanceof AbortAttemptByBleException) {
                        ((o9n0) cVar2.J).b(th, null, null);
                    } else {
                        jst.e.n("User declined attempt to use ble connection");
                    }
                    ((pib0) cVar.Dg()).W7();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$2;
                cVar2 = (c) this.L$1;
                cVar3 = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof AbortAttemptByBleException) {
                    }
                    ((pib0) cVar.Dg()).W7();
                    return zy11.a;
                }
            }
            h6o0 h6o0Var = cVar3.z;
            a6o0 a6o0Var2 = cVar3.H;
            h6o0Var.a(a6o0Var2 instanceof b6o0 ? ScootersOrderLifecycleAnalytics$OrderCloseReason.NORMAL : cVar3.G == ScootersErrorCode.SCOOTER_IS_NOT_IN_FIX_FINISH_AREA ? ScootersOrderLifecycleAnalytics$OrderCloseReason.FIX_FORCE_COMPLETION : ScootersOrderLifecycleAnalytics$OrderCloseReason.FORCE_COMPLETION, a6o0Var2.a().getNumber(), a6o0Var2.a().m());
            ((o9n0) cVar3.J).b.r(new qu(9));
            ((pib0) cVar.Dg()).W7();
            return zy11.a;
        } catch (Throwable th3) {
            ((pib0) r0.Dg()).W7();
            throw th3;
        }
    }
}
