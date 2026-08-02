package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wls;
import defpackage.yo0;
import defpackage.zg9;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyo0;", "selectedTariffs", "Lzy11;", "<anonymous>", "(Lyo0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.AddressActionsOnSummaryInteractor$handleSelectionChange$7", f = "AddressActionsOnSummaryInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddressActionsOnSummaryInteractor$handleSelectionChange$7 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressActionsOnSummaryInteractor$handleSelectionChange$7(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressActionsOnSummaryInteractor$handleSelectionChange$7 addressActionsOnSummaryInteractor$handleSelectionChange$7 = new AddressActionsOnSummaryInteractor$handleSelectionChange$7(this.this$0, continuation);
        addressActionsOnSummaryInteractor$handleSelectionChange$7.L$0 = obj;
        return addressActionsOnSummaryInteractor$handleSelectionChange$7;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressActionsOnSummaryInteractor$handleSelectionChange$7 addressActionsOnSummaryInteractor$handleSelectionChange$7 = (AddressActionsOnSummaryInteractor$handleSelectionChange$7) create((yo0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressActionsOnSummaryInteractor$handleSelectionChange$7.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yo0 yo0Var = (yo0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.preorder.source.domain.a aVar = this.this$0.c;
        Set a = yo0Var.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(new zg9((String) it.next()));
        }
        aVar.f(kotlin.collections.a.N0(arrayList));
        return zy11.a;
    }
}
