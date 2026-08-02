package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline;

import androidx.compose.runtime.g;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bdz0;
import defpackage.c9n;
import defpackage.cvd0;
import defpackage.dvd0;
import defpackage.izt0;
import defpackage.jzt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.scc;
import defpackage.tcc;
import defpackage.u9n;
import defpackage.v9n;
import defpackage.vng;
import defpackage.w511;
import defpackage.w6f0;
import defpackage.w9n;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zxi;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw6f0;", "Lc9n;", "Lzy11;", "<anonymous>", "(Lw6f0;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.DynamicSearchTimelineKt$DynamicSearchTimeline$1$state$2$1", f = "DynamicSearchTimeline.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DynamicSearchTimelineKt$DynamicSearchTimeline$1$state$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ w9n $model;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicSearchTimelineKt$DynamicSearchTimeline$1$state$2$1(w9n w9nVar, Continuation continuation) {
        super(2, continuation);
        this.$model = w9nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DynamicSearchTimelineKt$DynamicSearchTimeline$1$state$2$1 dynamicSearchTimelineKt$DynamicSearchTimeline$1$state$2$1 = new DynamicSearchTimelineKt$DynamicSearchTimeline$1$state$2$1(this.$model, continuation);
        dynamicSearchTimelineKt$DynamicSearchTimeline$1$state$2$1.L$0 = obj;
        return dynamicSearchTimelineKt$DynamicSearchTimeline$1$state$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicSearchTimelineKt$DynamicSearchTimeline$1$state$2$1) create((w6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0119  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x01a1 -> B:5:0x01a4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        long j;
        int i;
        int i2;
        oz40 oz40Var = (w6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        int i4 = 10;
        if (i3 == 0) {
            kotlin.b.b(obj);
            w9n w9nVar = this.$model;
            if (w9nVar instanceof v9n) {
                List list2 = ((v9n) w9nVar).c;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new dvd0(((jzt0) it2.next()).a));
                }
                bdz0 bdz0Var = new bdz0(0, arrayList);
                int size = list2.size();
                ((g) oz40Var).setValue(new c9n(bdz0Var, new zxi(size, 0, null)));
                return zy11.a;
            }
            if (!(w9nVar instanceof u9n)) {
                w511.b();
                return null;
            }
            long I = vng.I();
            u9n u9nVar = (u9n) this.$model;
            ArrayList arrayList2 = u9nVar.c;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((izt0) obj2).a > 0) {
                    arrayList3.add(obj2);
                }
            }
            long j2 = u9nVar.d;
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                izt0 izt0Var = (izt0) it3.next();
                long j3 = izt0Var.a;
                long f = y6i0.f((j2 + j3) - I, 0L, j3);
                long j4 = izt0Var.a;
                j2 += j4;
                arrayList4.add(new izt0(f, 1.0f - (f / j4), izt0Var.c, izt0Var.d));
            }
            list = arrayList4;
            it = arrayList4.iterator();
            j = I;
            i = 0;
            i2 = 0;
            if (it.hasNext()) {
            }
            return zy11.a;
        }
        if (i3 != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i5 = this.I$1;
        i2 = this.I$0;
        j = this.J$0;
        it = (Iterator) this.L$3;
        list = (List) this.L$1;
        kotlin.b.b(obj);
        int i6 = i5;
        CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
        coroutineSingletons = coroutineSingletons2;
        i = i6;
        i4 = 10;
        if (it.hasNext()) {
            Object next = it.next();
            i6 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            izt0 izt0Var2 = (izt0) next;
            List<izt0> list4 = list;
            ArrayList arrayList5 = new ArrayList(tcc.n(list4, i4));
            for (izt0 izt0Var3 : list4) {
                arrayList5.add(new cvd0(izt0Var3.d, izt0Var3.a, izt0Var3.b));
                oz40Var = oz40Var;
                coroutineSingletons = coroutineSingletons;
            }
            oz40Var = (g) oz40Var;
            oz40Var.setValue(new c9n(new bdz0(i, arrayList5), new zxi(list.size(), i, ((izt0) list.get(i)).c)));
            long j5 = izt0Var2.a;
            this.L$0 = oz40Var;
            this.L$1 = list;
            this.L$2 = null;
            this.L$3 = it;
            this.L$4 = null;
            this.L$5 = null;
            this.J$0 = j;
            this.I$0 = i2;
            this.I$1 = i6;
            this.I$2 = i;
            this.I$3 = 0;
            this.label = 1;
            coroutineSingletons2 = coroutineSingletons;
            if (kotlinx.coroutines.a.i(j5, this) == coroutineSingletons2) {
                return coroutineSingletons2;
            }
            coroutineSingletons = coroutineSingletons2;
            i = i6;
            i4 = 10;
            if (it.hasNext()) {
            }
        }
        return zy11.a;
    }
}
