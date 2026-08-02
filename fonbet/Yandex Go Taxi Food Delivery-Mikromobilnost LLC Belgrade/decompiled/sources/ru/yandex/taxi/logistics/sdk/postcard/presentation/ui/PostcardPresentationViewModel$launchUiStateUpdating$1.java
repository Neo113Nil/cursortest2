package ru.yandex.taxi.logistics.sdk.postcard.presentation.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.t701;
import defpackage.tqi;
import defpackage.uqi;
import defpackage.w511;
import defpackage.yfe0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt701;", "trackingState", "", "isFirstOpening", "Lzy11;", "<anonymous>", "(Lt701;Z)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.PostcardPresentationViewModel$launchUiStateUpdating$1", f = "PostcardPresentationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PostcardPresentationViewModel$launchUiStateUpdating$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostcardPresentationViewModel$launchUiStateUpdating$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PostcardPresentationViewModel$launchUiStateUpdating$1 postcardPresentationViewModel$launchUiStateUpdating$1 = new PostcardPresentationViewModel$launchUiStateUpdating$1(this.this$0, (Continuation) obj3);
        postcardPresentationViewModel$launchUiStateUpdating$1.L$0 = (t701) obj;
        postcardPresentationViewModel$launchUiStateUpdating$1.Z$0 = booleanValue;
        zy11 zy11Var = zy11.a;
        postcardPresentationViewModel$launchUiStateUpdating$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t701 t701Var = (t701) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tqi tqiVar = t701Var.a.o;
        uqi uqiVar = tqiVar != null ? tqiVar.a : null;
        if (uqiVar != null) {
            r0 r0Var = this.this$0.y;
            yfe0 yfe0Var = new yfe0(uqiVar.a, tqiVar.d, tqiVar.c, z);
            r0Var.getClass();
            r0Var.m(null, yfe0Var);
        } else if (uqiVar != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
