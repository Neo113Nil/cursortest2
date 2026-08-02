package ru.yandex.taxi.surge.interactor;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.mvg;
import defpackage.ntq;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lotq;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgePriceComplainStateInteractor$mapOptions$2", f = "SurgePriceComplainStateInteractor.kt", l = {BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgePriceComplainStateInteractor$mapOptions$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<ntq> $feedbackOptions;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ Set<String> $selectedOptionsIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgePriceComplainStateInteractor$mapOptions$2(List list, r rVar, Set set, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$feedbackOptions = list;
        this.this$0 = rVar;
        this.$selectedOptionsIds = set;
        this.$isEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgePriceComplainStateInteractor$mapOptions$2 surgePriceComplainStateInteractor$mapOptions$2 = new SurgePriceComplainStateInteractor$mapOptions$2(this.$feedbackOptions, this.this$0, this.$selectedOptionsIds, this.$isEnabled, continuation);
        surgePriceComplainStateInteractor$mapOptions$2.L$0 = obj;
        return surgePriceComplainStateInteractor$mapOptions$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgePriceComplainStateInteractor$mapOptions$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        List<ntq> list = this.$feedbackOptions;
        r rVar = this.this$0;
        Set<String> set = this.$selectedOptionsIds;
        boolean z = this.$isEnabled;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new SurgePriceComplainStateInteractor$mapOptions$2$1$1((ntq) it.next(), rVar, set, z, null), 3));
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
