package ru.yandex.taxi.plus.sdk.micro_widget.composite;

import defpackage.bms;
import defpackage.df20;
import defpackage.g1d0;
import defpackage.imo;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rg20;
import defpackage.s2c;
import defpackage.soc0;
import defpackage.t2c;
import defpackage.tcc;
import defpackage.ve20;
import defpackage.xe20;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lt2c;", "clientContext", "", "", "closedBadgeIds", "", "shouldSuppress", "Lve20;", "<anonymous>", "(Lt2c;Ljava/util/List;Z)Lve20;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.micro_widget.composite.MicroWidgetBadgeInteractor$currentMicroWidgetBadgeModel$1$2", f = "MicroWidgetBadgeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MicroWidgetBadgeInteractor$currentMicroWidgetBadgeModel$1$2 extends SuspendLambda implements bms {
    final /* synthetic */ List<g1d0> $badges;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ xe20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroWidgetBadgeInteractor$currentMicroWidgetBadgeModel$1$2(xe20 xe20Var, List list, Continuation continuation) {
        super(4, continuation);
        this.this$0 = xe20Var;
        this.$badges = list;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        MicroWidgetBadgeInteractor$currentMicroWidgetBadgeModel$1$2 microWidgetBadgeInteractor$currentMicroWidgetBadgeModel$1$2 = new MicroWidgetBadgeInteractor$currentMicroWidgetBadgeModel$1$2(this.this$0, this.$badges, (Continuation) obj4);
        microWidgetBadgeInteractor$currentMicroWidgetBadgeModel$1$2.L$0 = (t2c) obj;
        microWidgetBadgeInteractor$currentMicroWidgetBadgeModel$1$2.L$1 = (List) obj2;
        microWidgetBadgeInteractor$currentMicroWidgetBadgeModel$1$2.Z$0 = booleanValue;
        return microWidgetBadgeInteractor$currentMicroWidgetBadgeModel$1$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g1d0 g1d0Var;
        g1d0 next;
        t2c t2cVar = (t2c) this.L$0;
        List list = (List) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        xe20 xe20Var = this.this$0;
        List<g1d0> list2 = this.$badges;
        rg20 rg20Var = xe20Var.d;
        rg20Var.getClass();
        boolean z2 = t2cVar.f;
        String str = t2cVar.a;
        s2c s2cVar = t2cVar.d;
        if (z2 || z) {
            g1d0Var = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (!list.contains(((g1d0) obj2).a.b)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                df20 df20Var = ((g1d0) next2).c;
                List list3 = df20Var.b;
                List list4 = df20Var.a;
                if (list3.isEmpty() || df20Var.b.contains(t2cVar.b)) {
                    List list5 = df20Var.g;
                    List list6 = df20Var.c;
                    if (list4.isEmpty() || list4.contains(str)) {
                        if (list6.isEmpty() || list6.contains(s2cVar.a)) {
                            if (!df20Var.a().isEmpty()) {
                                ArrayList a = df20Var.a();
                                if (!a.isEmpty()) {
                                    Iterator it2 = a.iterator();
                                    while (it2.hasNext()) {
                                        if (jl40.l((s2c) it2.next(), s2cVar)) {
                                        }
                                    }
                                }
                            }
                            List list7 = t2cVar.e;
                            List<df20.a> list8 = df20Var.e;
                            ArrayList arrayList3 = new ArrayList(tcc.n(list8, 10));
                            for (df20.a aVar : list8) {
                                arrayList3.add(new s2c(aVar.a, aVar.b));
                            }
                            Iterator it3 = arrayList3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    s2c s2cVar2 = (s2c) it3.next();
                                    List list9 = list7;
                                    if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                                        Iterator it4 = list9.iterator();
                                        while (it4.hasNext()) {
                                            if (jl40.l((s2c) it4.next(), s2cVar2)) {
                                                break;
                                            }
                                        }
                                    }
                                } else if (list5.isEmpty() || list5.contains(t2cVar.c)) {
                                    List list10 = df20Var.f;
                                    if (!list10.isEmpty()) {
                                        ArrayList a2 = rg20Var.a.a.a();
                                        List list11 = list10;
                                        ArrayList arrayList4 = new ArrayList(tcc.n(a2, 10));
                                        Iterator it5 = a2.iterator();
                                        while (it5.hasNext()) {
                                            arrayList4.add(((imo) it5.next()).a);
                                        }
                                        if (!kotlin.collections.a.U(list11, arrayList4).isEmpty()) {
                                        }
                                    }
                                    arrayList2.add(next2);
                                }
                            }
                        }
                    }
                }
            }
            Iterator it6 = arrayList2.iterator();
            if (it6.hasNext()) {
                next = it6.next();
                if (it6.hasNext()) {
                    int i = ((g1d0) next).d;
                    do {
                        Object next3 = it6.next();
                        int i2 = ((g1d0) next3).d;
                        next = next;
                        if (i < i2) {
                            next = next3;
                            i = i2;
                        }
                    } while (it6.hasNext());
                }
            } else {
                next = 0;
            }
            g1d0Var = next;
        }
        return g1d0Var == null ? new ve20(null, null, str) : new ve20(g1d0Var.a, new soc0(g1d0Var.b, g1d0Var.e, g1d0Var.f), str);
    }
}
