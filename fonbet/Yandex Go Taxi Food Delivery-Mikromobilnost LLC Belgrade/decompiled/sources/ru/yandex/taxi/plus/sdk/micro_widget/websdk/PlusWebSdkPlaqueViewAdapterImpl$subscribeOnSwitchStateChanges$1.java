package ru.yandex.taxi.plus.sdk.micro_widget.websdk;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.plus.home.plaque.feature.internal.presentation.d;
import defpackage.bkc0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zrd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.micro_widget.websdk.PlusWebSdkPlaqueViewAdapterImpl$subscribeOnSwitchStateChanges$1", f = "PlusWebSdkPlaqueViewAdapterImpl.kt", l = {SubsamplingScaleImageView.ORIENTATION_270}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlusWebSdkPlaqueViewAdapterImpl$subscribeOnSwitchStateChanges$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ zrd0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusWebSdkPlaqueViewAdapterImpl$subscribeOnSwitchStateChanges$1(zrd0 zrd0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zrd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusWebSdkPlaqueViewAdapterImpl$subscribeOnSwitchStateChanges$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusWebSdkPlaqueViewAdapterImpl$subscribeOnSwitchStateChanges$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            mth mthVar = new mth(((d) ((bkc0) this.this$0.m.a).n.getValue()).k, 13);
            this.this$0.h.getClass();
            tpr F = e.F(mthVar, uyj.a);
            zrd0 zrd0Var = this.this$0;
            o oVar = new o(F, new PlusWebSdkPlaqueViewAdapterImpl$subscribeOnSwitchStateChanges$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            ocz oczVar = new ocz(29, zrd0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(oczVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
