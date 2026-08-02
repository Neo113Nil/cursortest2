package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.dij0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qmx0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xmx0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.recycler.TariffRuleV2ViewHolder$onDraw$1", f = "RequirementsV2ViewHolders.kt", l = {NetworkRequestException.TOO_MANY_REQUESTS}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffRuleV2ViewHolder$onDraw$1 extends SuspendLambda implements wls {
    final /* synthetic */ dij0 $actualData;
    int label;
    final /* synthetic */ xmx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffRuleV2ViewHolder$onDraw$1(xmx0 xmx0Var, dij0 dij0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xmx0Var;
        this.$actualData = dij0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffRuleV2ViewHolder$onDraw$1(this.this$0, this.$actualData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffRuleV2ViewHolder$onDraw$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            qmx0 qmx0Var = this.this$0.T;
            dij0 dij0Var = this.$actualData;
            this.label = 1;
            qmx0Var.a.getClass();
            Object k0 = tje.k0(uyj.a, new TariffRuleLastItemShowedInteractor$onTariffRuleLastShowed$2(qmx0Var, dij0Var, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        xmx0 xmx0Var = this.this$0;
        int i2 = xmx0.b0;
        ((ListItemComponent) ((View) xmx0Var.R)).getViewTreeObserver().removeOnDrawListener(this.this$0.Z);
        return zy11Var;
    }
}
