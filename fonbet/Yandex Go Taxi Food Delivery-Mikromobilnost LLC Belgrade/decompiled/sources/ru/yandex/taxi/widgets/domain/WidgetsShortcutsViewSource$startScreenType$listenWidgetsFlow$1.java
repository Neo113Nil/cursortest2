package ru.yandex.taxi.widgets.domain;

import defpackage.bjz;
import defpackage.c151;
import defpackage.d380;
import defpackage.d3p;
import defpackage.ew2;
import defpackage.gc80;
import defpackage.jem;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu6;
import defpackage.q351;
import defpackage.q6o0;
import defpackage.q6y0;
import defpackage.qc20;
import defpackage.qg50;
import defpackage.v7y0;
import defpackage.w201;
import defpackage.w511;
import defpackage.xda;
import defpackage.y2y0;
import defpackage.yaf0;
import defpackage.z4y0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.order.analytics.model.WidgetType;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lw201;", "widgets", "Lzy11;", "<unused var>", "<anonymous>", "(Ljava/util/List;V)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.domain.WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$1", f = "WidgetsShortcutsViewSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ yaf0 $screenType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$1(yaf0 yaf0Var, Continuation continuation, m mVar) {
        super(3, continuation);
        this.this$0 = mVar;
        this.$screenType = yaf0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m mVar = this.this$0;
        WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$1 widgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$1 = new WidgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$1(this.$screenType, (Continuation) obj3, mVar);
        widgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$1.L$0 = (List) obj;
        return widgetsShortcutsViewSource$startScreenType$listenWidgetsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        List<w201> list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m mVar = this.this$0;
        c151 c151Var = mVar.e;
        qc20 qc20Var = mVar.i;
        qc20Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (w201 w201Var : list) {
            if (w201Var instanceof pu6) {
                pair = new Pair(WidgetType.SOME_ORDERS, ((pu6) w201Var).w());
            } else {
                if (!(w201Var instanceof q6y0) && !(w201Var instanceof z4y0) && !(w201Var instanceof y2y0) && !(w201Var instanceof v7y0) && !(w201Var instanceof jem) && !(w201Var instanceof q6o0) && !(w201Var instanceof bjz) && !(w201Var instanceof xda) && !(w201Var instanceof d3p) && !(w201Var instanceof qg50)) {
                    w511.b();
                    return null;
                }
                pair = new Pair(WidgetType.ONE_ORDER, Collections.singletonList(w201Var));
            }
            WidgetType widgetType = (WidgetType) pair.getFirst();
            List list2 = (List) pair.getSecond();
            gc80 gc80Var = (gc80) qc20Var.a;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                d380 a = gc80Var.a((w201) it.next());
                if (a != null) {
                    arrayList3.add(a);
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList.addAll(arrayList3);
                arrayList2.add(new q351(w201Var.getId(), widgetType, arrayList3));
            }
        }
        ew2 ew2Var = new ew2(arrayList, arrayList2);
        yaf0 yaf0Var = this.$screenType;
        c151Var.getClass();
        c151Var.a(ew2Var, yaf0Var);
        return list;
    }
}
