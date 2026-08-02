package ru.yandex.taxi.orderbutton.summary.base.interactors;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.dms;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vi70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lmi31;", "tariffInfo", "", "loadingState", "showPrice", "", "<unused var>", "Lwi70;", "<anonymous>", "(Lmi31;ZZLjava/lang/Object;)Lwi70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orderbutton.summary.base.interactors.SummaryButtonModelInteractor$modelFlow$1", f = "SummaryButtonModelInteractor.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryButtonModelInteractor$modelFlow$1 extends SuspendLambda implements dms {
    final /* synthetic */ boolean $smallSummary;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryButtonModelInteractor$modelFlow$1(i iVar, boolean z, Continuation continuation) {
        super(5, continuation);
        this.this$0 = iVar;
        this.$smallSummary = z;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        SummaryButtonModelInteractor$modelFlow$1 summaryButtonModelInteractor$modelFlow$1 = new SummaryButtonModelInteractor$modelFlow$1(this.this$0, this.$smallSummary, (Continuation) obj5);
        summaryButtonModelInteractor$modelFlow$1.L$0 = (mi31) obj;
        summaryButtonModelInteractor$modelFlow$1.Z$0 = booleanValue;
        summaryButtonModelInteractor$modelFlow$1.Z$1 = booleanValue2;
        return summaryButtonModelInteractor$modelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var = (mi31) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        i iVar = this.this$0;
        vi70 vi70Var = new vi70(mi31Var, iVar.e.a(mi31Var), z, this.$smallSummary, z2);
        this.L$0 = null;
        this.Z$0 = z;
        this.Z$1 = z2;
        this.label = 1;
        Object a = iVar.a(vi70Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
