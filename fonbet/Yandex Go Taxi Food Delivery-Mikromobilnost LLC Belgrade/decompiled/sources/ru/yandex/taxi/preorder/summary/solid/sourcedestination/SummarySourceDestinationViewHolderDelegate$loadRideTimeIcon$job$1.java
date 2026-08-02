package ru.yandex.taxi.preorder.summary.solid.sourcedestination;

import android.graphics.drawable.BitmapDrawable;
import defpackage.cpv0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zov0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.sourcedestination.SummarySourceDestinationViewHolderDelegate$loadRideTimeIcon$job$1", f = "SummarySourceDestinationViewHolderDelegate.kt", l = {250}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummarySourceDestinationViewHolderDelegate$loadRideTimeIcon$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $iconTag;
    int label;
    final /* synthetic */ cpv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySourceDestinationViewHolderDelegate$loadRideTimeIcon$job$1(cpv0 cpv0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cpv0Var;
        this.$iconTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummarySourceDestinationViewHolderDelegate$loadRideTimeIcon$job$1(this.this$0, this.$iconTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummarySourceDestinationViewHolderDelegate$loadRideTimeIcon$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.q;
            String str = this.$iconTag;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, this, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        if (jl40.l(this.this$0.y.j, this.$iconTag)) {
            r0 r0Var = this.this$0.B;
            zov0 zov0Var = new zov0(bitmapDrawable, this.$iconTag);
            r0Var.getClass();
            r0Var.m(null, zov0Var);
        }
        return zy11.a;
    }
}
