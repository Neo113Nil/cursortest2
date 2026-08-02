package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.wheel_picker;

import defpackage.bms;
import defpackage.by41;
import defpackage.cy41;
import defpackage.dy41;
import defpackage.ey41;
import defpackage.fy41;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.m1y;
import defpackage.mvg;
import defpackage.n1y;
import defpackage.ny61;
import defpackage.o1y;
import defpackage.p1y;
import defpackage.q1y;
import defpackage.r1y;
import defpackage.s1y;
import defpackage.t1y;
import defpackage.tcc;
import defpackage.u0z;
import defpackage.vx41;
import defpackage.w511;
import defpackage.wx41;
import defpackage.x2s;
import defpackage.x9x0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "<unused var>", "Lfy41;", "coreWidget", "Lj6s;", ClidProvider.STATE, "", "Ln351;", "<anonymous>", "(ZLfy41;Lj6s;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.wheel_picker.WheelPickerStateHolder$getWidgets$1", f = "WheelPickerStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WheelPickerStateHolder$getWidgets$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WheelPickerStateHolder$getWidgets$1(b bVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj).booleanValue();
        WheelPickerStateHolder$getWidgets$1 wheelPickerStateHolder$getWidgets$1 = new WheelPickerStateHolder$getWidgets$1(this.this$0, (Continuation) obj4);
        wheelPickerStateHolder$getWidgets$1.L$0 = (fy41) obj2;
        wheelPickerStateHolder$getWidgets$1.L$1 = (j6s) obj3;
        return wheelPickerStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p1y o1yVar;
        vx41 vx41Var;
        fy41 fy41Var = (fy41) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        vx41 vx41Var2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (fy41Var == null || this.this$0.e.C(fy41Var)) {
            return EmptyList.a;
        }
        u0z u0zVar = this.this$0.c;
        u0zVar.getClass();
        Map map = j6sVar.a;
        ArrayList<wx41> arrayList = fy41Var.c;
        ArrayList arrayList2 = new ArrayList();
        for (wx41 wx41Var : arrayList) {
            ArrayList arrayList3 = wx41Var.b;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                List<ey41> list = ((dy41) obj2).c;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (ey41 ey41Var : list) {
                        if (!jl40.l(map.get(ey41Var.a), ey41Var.b)) {
                            break;
                        }
                    }
                }
                arrayList4.add(obj2);
            }
            boolean isEmpty = arrayList4.isEmpty();
            ?? r8 = arrayList4;
            if (isEmpty) {
                r8 = vx41Var2;
            }
            if (r8 == 0) {
                vx41Var = vx41Var2;
            } else {
                Object orDefault = map.getOrDefault(wx41Var.a, vx41Var2);
                Iterator it = r8.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (jl40.l(((dy41) it.next()).a, orDefault)) {
                        break;
                    }
                    i++;
                }
                ?? r7 = Integer.valueOf(i);
                if (i == -1) {
                    r7 = vx41Var2;
                }
                int intValue = r7 != 0 ? r7.intValue() : 0;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = u0zVar.a;
                t1y t1yVar = wx41Var.c;
                aVar.getClass();
                if (t1yVar instanceof r1y) {
                    o1yVar = n1y.a;
                } else if (t1yVar instanceof q1y) {
                    o1yVar = new m1y(((q1y) t1yVar).a);
                } else {
                    if (!(t1yVar instanceof s1y)) {
                        vx41 vx41Var3 = vx41Var2;
                        w511.b();
                        return vx41Var3;
                    }
                    o1yVar = new o1y((float) ((s1y) t1yVar).a);
                }
                ArrayList arrayList5 = new ArrayList(tcc.n(r8, 10));
                for (dy41 dy41Var : r8) {
                    arrayList5.add(new cy41(dy41Var.b, new x9x0(null, wx41Var.a, dy41Var.a, null, 9)));
                    vx41Var2 = vx41Var2;
                }
                vx41Var = vx41Var2;
                vx41Var2 = new vx41(intValue, arrayList5, o1yVar);
            }
            if (vx41Var2 != null) {
                arrayList2.add(vx41Var2);
            }
            vx41Var2 = vx41Var;
        }
        return Collections.singletonList(new by41(new x2s(fy41Var.b, vx41Var2), fy41Var.a, arrayList2));
    }
}
