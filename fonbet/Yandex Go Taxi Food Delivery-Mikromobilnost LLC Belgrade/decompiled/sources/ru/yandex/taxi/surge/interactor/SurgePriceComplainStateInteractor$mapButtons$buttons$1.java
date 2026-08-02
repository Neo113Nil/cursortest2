package ru.yandex.taxi.surge.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pye0;
import defpackage.qye0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "Lmy6;", "Llow0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgePriceComplainStateInteractor$mapButtons$buttons$1", f = "SurgePriceComplainStateInteractor.kt", l = {198}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgePriceComplainStateInteractor$mapButtons$buttons$1 extends SuspendLambda implements wls {
    final /* synthetic */ qye0 $actionButtons;
    final /* synthetic */ boolean $hasCommentOrSelection;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isShimmering;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgePriceComplainStateInteractor$mapButtons$buttons$1(qye0 qye0Var, r rVar, boolean z, boolean z2, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.$actionButtons = qye0Var;
        this.this$0 = rVar;
        this.$isEnabled = z;
        this.$hasCommentOrSelection = z2;
        this.$isShimmering = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgePriceComplainStateInteractor$mapButtons$buttons$1 surgePriceComplainStateInteractor$mapButtons$buttons$1 = new SurgePriceComplainStateInteractor$mapButtons$buttons$1(this.$actionButtons, this.this$0, this.$isEnabled, this.$hasCommentOrSelection, this.$isShimmering, continuation);
        surgePriceComplainStateInteractor$mapButtons$buttons$1.L$0 = obj;
        return surgePriceComplainStateInteractor$mapButtons$buttons$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgePriceComplainStateInteractor$mapButtons$buttons$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ArrayList arrayList = this.$actionButtons.b;
        r rVar = this.this$0;
        boolean z = this.$isEnabled;
        boolean z2 = this.$hasCommentOrSelection;
        boolean z3 = this.$isShimmering;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(tje.h(tseVar, null, null, new SurgePriceComplainStateInteractor$mapButtons$buttons$1$1$1((pye0) it.next(), rVar, z, z2, z3, null), 3));
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList2, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
