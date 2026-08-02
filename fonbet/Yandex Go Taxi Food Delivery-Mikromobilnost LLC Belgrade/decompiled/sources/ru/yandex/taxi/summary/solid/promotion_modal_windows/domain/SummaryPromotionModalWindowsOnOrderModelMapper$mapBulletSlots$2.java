package ru.yandex.taxi.summary.solid.promotion_modal_windows.domain;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lxss0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.SummaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2", f = "SummaryPromotionModalWindowsOnOrderModelMapper.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<SlotItemDto> $bulletSlots;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$bulletSlots = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2 summaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2 = new SummaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2(this.$bulletSlots, this.this$0, continuation);
        summaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2.L$0 = obj;
        return summaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<SlotItemDto> list = this.$bulletSlots;
        a aVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new SummaryPromotionModalWindowsOnOrderModelMapper$mapBulletSlots$2$1$1(aVar, (SlotItemDto) it.next(), null), 3));
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
