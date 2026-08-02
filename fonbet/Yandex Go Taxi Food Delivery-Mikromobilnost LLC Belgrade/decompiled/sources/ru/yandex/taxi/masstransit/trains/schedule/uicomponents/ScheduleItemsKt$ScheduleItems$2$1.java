package ru.yandex.taxi.masstransit.trains.schedule.uicomponents;

import androidx.compose.foundation.lazy.b;
import defpackage.bb01;
import defpackage.cb01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tig0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.schedule.uicomponents.ScheduleItemsKt$ScheduleItems$2$1", f = "ScheduleItems.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScheduleItemsKt$ScheduleItems$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ b $listState;
    final /* synthetic */ List<cb01> $schedules;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleItemsKt$ScheduleItems$2$1(b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.$listState = bVar;
        this.$schedules = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScheduleItemsKt$ScheduleItems$2$1(this.$listState, this.$schedules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduleItemsKt$ScheduleItems$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.$listState;
            Iterator<cb01> it = this.$schedules.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                cb01 next = it.next();
                if ((next instanceof bb01) && ((bb01) next).k) {
                    break;
                }
                i2++;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            this.label = 1;
            tig0 tig0Var = b.y;
            if (bVar.l(i2, 0, this) == coroutineSingletons) {
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
