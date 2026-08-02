package ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll;

import defpackage.bvf0;
import defpackage.g92;
import defpackage.goe;
import defpackage.l7;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pip0;
import defpackage.rip0;
import defpackage.sip0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zii0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.ScrollTagStateHolder$tagFlow$$inlined$flatMapLatest$1", f = "ScrollTagStateHolder.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class ScrollTagStateHolder$tagFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ Anchor $targetAnchor$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollTagStateHolder$tagFlow$$inlined$flatMapLatest$1(Continuation continuation, e eVar, Anchor anchor) {
        super(3, continuation);
        this.this$0 = eVar;
        this.$targetAnchor$inlined = anchor;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScrollTagStateHolder$tagFlow$$inlined$flatMapLatest$1 scrollTagStateHolder$tagFlow$$inlined$flatMapLatest$1 = new ScrollTagStateHolder$tagFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$targetAnchor$inlined);
        scrollTagStateHolder$tagFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        scrollTagStateHolder$tagFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return scrollTagStateHolder$tagFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr l7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            Pair pair = (Pair) this.L$1;
            List list = (List) pair.getFirst();
            zii0 zii0Var = (zii0) pair.getSecond();
            if (list.isEmpty()) {
                l7Var = new g92(2, null);
            } else {
                List<pip0> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (pip0 pip0Var : list2) {
                    goe goeVar = this.this$0.b;
                    String str = pip0Var.b;
                    LinkedHashMap linkedHashMap = goeVar.a;
                    Object obj2 = linkedHashMap.get(str);
                    if (obj2 == null) {
                        obj2 = bvf0.c(null);
                        linkedHashMap.put(str, obj2);
                    }
                    arrayList.add(new sip0((n4u0) obj2, 0));
                }
                l7Var = new l7(19, kotlinx.coroutines.flow.e.t(new rip0((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]), this.this$0, list, zii0Var, this.$targetAnchor$inlined)), this.this$0, this.$targetAnchor$inlined);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(l7Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
