package ru.yandex.taxi.masstransit.domain;

import defpackage.bvf0;
import defpackage.d370;
import defpackage.hnm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ld370;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtOnlineScheduleInteractor$scheduleFlow$2$1", f = "MtOnlineScheduleInteractor.kt", l = {32, 33}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtOnlineScheduleInteractor$scheduleFlow$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $stopId;
    final /* synthetic */ List<hnm0> $stopRequests;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtOnlineScheduleInteractor$scheduleFlow$2$1(q qVar, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$stopId = str;
        this.$stopRequests = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtOnlineScheduleInteractor$scheduleFlow$2$1 mtOnlineScheduleInteractor$scheduleFlow$2$1 = new MtOnlineScheduleInteractor$scheduleFlow$2$1(this.this$0, this.$stopId, this.$stopRequests, continuation);
        mtOnlineScheduleInteractor$scheduleFlow$2$1.L$0 = obj;
        return mtOnlineScheduleInteractor$scheduleFlow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtOnlineScheduleInteractor$scheduleFlow$2$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        if (r0.emit(r2, r9) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r10 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q qVar = this.this$0;
            String str = this.$stopId;
            List<hnm0> list = this.$stopRequests;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((hnm0) it.next()).b);
            }
            this.L$0 = vprVar;
            this.label = 1;
            qVar.getClass();
            obj = bvf0.n(new MtOnlineScheduleInteractor$combinedSchedules$2(qVar, str, arrayList, null), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        d370 d370Var = new d370(this.$stopId, (Map) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
