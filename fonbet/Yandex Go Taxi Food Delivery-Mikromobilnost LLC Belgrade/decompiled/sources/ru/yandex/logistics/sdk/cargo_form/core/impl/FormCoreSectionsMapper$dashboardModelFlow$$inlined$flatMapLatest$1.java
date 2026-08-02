package ru.yandex.logistics.sdk.cargo_form.core.impl;

import defpackage.g92;
import defpackage.lqe;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pre;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.ui7;
import defpackage.vpr;
import defpackage.y3s;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1", f = "FormCoreSectionsMapper.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ y3s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1(Continuation continuation, y3s y3sVar) {
        super(3, continuation);
        this.this$0 = y3sVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1 formCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1 = new FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        formCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        formCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return formCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr ui7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            List list = (List) this.L$1;
            y3s y3sVar = this.this$0;
            y3sVar.getClass();
            if (list.isEmpty()) {
                ui7Var = new g92(2, EmptyList.a);
            } else {
                List<lqe> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (lqe lqeVar : list2) {
                    List list3 = lqeVar.a;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(y3sVar.a((pre) it.next()));
                    }
                    arrayList.add(new m0(new ui7((tpr[]) kotlin.collections.a.J0(arrayList2).toArray(new tpr[0]), 5), y3sVar.a.a(lqeVar.c), new FormCoreSectionsMapper$sectionModelFlow$1(lqeVar, y3sVar, null)));
                }
                ui7Var = new ui7((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]), 6);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(ui7Var, vprVar, this) == coroutineSingletons) {
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
