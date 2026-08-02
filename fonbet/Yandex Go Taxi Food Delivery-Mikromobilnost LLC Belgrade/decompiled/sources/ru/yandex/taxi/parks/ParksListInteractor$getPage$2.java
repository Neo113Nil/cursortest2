package ru.yandex.taxi.parks;

import defpackage.bf90;
import defpackage.cmt;
import defpackage.he90;
import defpackage.k1f0;
import defpackage.mvg;
import defpackage.n1f0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ze90;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lbf90;", "<anonymous>", "(Ltse;)Lbf90;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.parks.ParksListInteractor$getPage$2", f = "ParksListInteractor.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ParksListInteractor$getPage$2 extends SuspendLambda implements wls {
    final /* synthetic */ Collection<String> $excludedParks;
    final /* synthetic */ int $page;
    int label;
    final /* synthetic */ ze90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParksListInteractor$getPage$2(ze90 ze90Var, int i, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ze90Var;
        this.$page = i;
        this.$excludedParks = collection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ParksListInteractor$getPage$2(this.this$0, this.$page, this.$excludedParks, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ParksListInteractor$getPage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ze90 ze90Var = this.this$0;
            cmt<n1f0> a = ze90Var.a.a(new k1f0(ze90Var.d.a), this.$page);
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.a(a, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        n1f0 n1f0Var = (n1f0) obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (he90 he90Var : n1f0Var.a) {
            if (this.$excludedParks.contains(he90Var.a)) {
                arrayList2.add(he90Var);
            } else {
                arrayList.add(he90Var);
            }
        }
        return new bf90(arrayList, arrayList2, n1f0Var.b != null);
    }
}
