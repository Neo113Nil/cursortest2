package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.qzb0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.ve61;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.PinProcessorGo$compute$2", f = "PinProcessorGo.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinProcessorGo$compute$2 extends SuspendLambda implements wls {
    final /* synthetic */ Set<mwb0> $excludedFromTree;
    final /* synthetic */ List<qzb0> $nonExcludedAdded;
    final /* synthetic */ List<qzb0> $nonExcludedAll;
    final /* synthetic */ List<mwb0> $removedIds;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProcessorGo$compute$2(Set set, b bVar, List list, List list2, List list3, Continuation continuation) {
        super(2, continuation);
        this.$excludedFromTree = set;
        this.this$0 = bVar;
        this.$nonExcludedAll = list;
        this.$nonExcludedAdded = list2;
        this.$removedIds = list3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinProcessorGo$compute$2(this.$excludedFromTree, this.this$0, this.$nonExcludedAll, this.$nonExcludedAdded, this.$removedIds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PinProcessorGo$compute$2 pinProcessorGo$compute$2 = (PinProcessorGo$compute$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pinProcessorGo$compute$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean l = jl40.l(this.$excludedFromTree, this.this$0.t);
        b bVar = this.this$0;
        ve61 ve61Var = bVar.m;
        if (ve61Var.i < ve61Var.h || !l) {
            List<qzb0> list = this.$nonExcludedAll;
            ve61Var.i = (((int) bVar.o) + 1) * ve61Var.g;
            ve61Var.d.clear();
            ve61Var.e.clear();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ve61Var.b((qzb0) it.next());
            }
            ve61Var.d();
            this.this$0.t = this.$excludedFromTree;
        } else {
            if (!this.$nonExcludedAdded.isEmpty()) {
                ve61 ve61Var2 = this.this$0.m;
                List<qzb0> list2 = this.$nonExcludedAdded;
                ve61Var2.getClass();
                if (!list2.isEmpty() && ve61Var2.i >= ve61Var2.h) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ve61Var2.b((qzb0) it2.next());
                    }
                    ve61Var2.d();
                }
            }
            if (!this.$removedIds.isEmpty()) {
                ve61 ve61Var3 = this.this$0.m;
                List<mwb0> list3 = this.$removedIds;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((mwb0) it3.next()).a());
                }
                ve61Var3.getClass();
                if (!arrayList.isEmpty() && ve61Var3.i >= ve61Var3.h) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        ve61Var3.d.remove(next);
                        ve61Var3.e.remove(next);
                    }
                    ve61Var3.d();
                }
            }
        }
        return zy11.a;
    }
}
