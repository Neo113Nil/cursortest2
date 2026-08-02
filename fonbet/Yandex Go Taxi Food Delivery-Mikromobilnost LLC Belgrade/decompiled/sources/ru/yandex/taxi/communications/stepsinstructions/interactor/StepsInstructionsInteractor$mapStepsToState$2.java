package ru.yandex.taxi.communications.stepsinstructions.interactor;

import defpackage.mau0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lnau0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.stepsinstructions.interactor.StepsInstructionsInteractor$mapStepsToState$2", f = "StepsInstructionsInteractor.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StepsInstructionsInteractor$mapStepsToState$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<mau0> $steps;
    final /* synthetic */ ThemeType $themeType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepsInstructionsInteractor$mapStepsToState$2(List list, c cVar, ThemeType themeType, Continuation continuation) {
        super(2, continuation);
        this.$steps = list;
        this.this$0 = cVar;
        this.$themeType = themeType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StepsInstructionsInteractor$mapStepsToState$2 stepsInstructionsInteractor$mapStepsToState$2 = new StepsInstructionsInteractor$mapStepsToState$2(this.$steps, this.this$0, this.$themeType, continuation);
        stepsInstructionsInteractor$mapStepsToState$2.L$0 = obj;
        return stepsInstructionsInteractor$mapStepsToState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StepsInstructionsInteractor$mapStepsToState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
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
        List<mau0> list = this.$steps;
        List<mau0> list2 = list;
        c cVar = this.this$0;
        ThemeType themeType = this.$themeType;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(tje.h(tseVar, null, null, new StepsInstructionsInteractor$mapStepsToState$2$1$1((mau0) obj2, cVar, themeType, i2, list, null), 3));
            i2 = i3;
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
