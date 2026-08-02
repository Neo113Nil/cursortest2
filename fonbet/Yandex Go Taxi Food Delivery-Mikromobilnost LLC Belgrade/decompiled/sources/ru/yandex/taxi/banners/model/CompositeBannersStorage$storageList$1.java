package ru.yandex.taxi.banners.model;

import defpackage.ctf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lctf0;", "Lru/yandex/taxi/promotions/model/Promotion;", "Lru/yandex/taxi/communications/api/dto/Banner;", "<anonymous>", "()Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.CompositeBannersStorage$storageList$1", f = "CompositeBannersStorage.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class CompositeBannersStorage$storageList$1 extends SuspendLambda implements tls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeBannersStorage$storageList$1(e eVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CompositeBannersStorage$storageList$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CompositeBannersStorage$storageList$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar;
        Iterator it;
        Iterable iterable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List g = scc.g(((h) this.this$0.a.get()).i, ((g) this.this$0.b.get()).d);
            eVar = this.this$0;
            it = g.iterator();
            iterable = g;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$4;
            iterable = (Iterable) this.L$2;
            eVar = (e) this.L$1;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            ctf0 ctf0Var = (ctf0) it.next();
            CompositeBannersStorage$storageList$1$1$1 compositeBannersStorage$storageList$1$1$1 = new CompositeBannersStorage$storageList$1$1$1(eVar, ctf0Var, null);
            this.L$0 = null;
            this.L$1 = eVar;
            this.L$2 = iterable;
            this.L$3 = null;
            this.L$4 = it;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 1;
            if (ctf0Var.f(compositeBannersStorage$storageList$1$1$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return iterable;
    }
}
