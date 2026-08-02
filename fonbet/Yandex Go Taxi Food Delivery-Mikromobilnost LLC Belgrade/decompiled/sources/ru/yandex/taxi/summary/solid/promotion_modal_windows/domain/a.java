package ru.yandex.taxi.summary.solid.promotion_modal_windows.domain;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.dbl0;
import defpackage.elv0;
import defpackage.fef;
import defpackage.flv0;
import defpackage.irs0;
import defpackage.mdh;
import defpackage.mth;
import defpackage.ny61;
import defpackage.qbl0;
import defpackage.sjh;
import defpackage.sqs0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yal0;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class a {
    public final tt2 a;
    public final irs0 b;
    public final e c;
    public final qbl0 d;
    public final elv0 e = new elv0();

    public a(tt2 tt2Var, irs0 irs0Var, e eVar, qbl0 qbl0Var) {
        this.a = tt2Var;
        this.b = irs0Var;
        this.c = eVar;
        this.d = qbl0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, SlotItemDto slotItemDto, ContinuationImpl continuationImpl) {
        SummaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1 summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1;
        int i;
        irs0 irs0Var;
        sqs0 sqs0Var;
        Object e;
        yal0 yal0Var;
        aVar.getClass();
        if (continuationImpl instanceof SummaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1) {
            summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1 = (SummaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1) continuationImpl;
            int i2 = summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.label;
                if (i != 0) {
                    b.b(obj);
                    irs0Var = aVar.b;
                    elv0 elv0Var = aVar.e;
                    mth a = aVar.d.a();
                    summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$0 = null;
                    summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$1 = irs0Var;
                    summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$2 = slotItemDto;
                    summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$3 = elv0Var;
                    summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.I$0 = 0;
                    summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.I$1 = 0;
                    summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.label = 1;
                    Object A = kotlinx.coroutines.flow.e.A(a, summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1);
                    if (A != coroutineSingletons) {
                        obj = A;
                        sqs0Var = elv0Var;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                sqs0Var = (sqs0) summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$3;
                slotItemDto = (SlotItemDto) summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$2;
                irs0Var = (irs0) summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$1;
                b.b(obj);
                dbl0 dbl0Var = (dbl0) obj;
                fef g = (dbl0Var != null || (yal0Var = dbl0Var.a) == null) ? null : yal0Var.g();
                summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$0 = null;
                summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$1 = null;
                summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$2 = null;
                summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$3 = null;
                summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.label = 2;
                e = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto, sqs0Var, false, false, g, summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1);
                return e != coroutineSingletons ? coroutineSingletons : e;
            }
        }
        summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1 = new SummaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1(aVar, continuationImpl);
        Object obj2 = summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.label;
        if (i != 0) {
        }
        dbl0 dbl0Var2 = (dbl0) obj2;
        if (dbl0Var2 != null) {
        }
        summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$0 = null;
        summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$1 = null;
        summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$2 = null;
        summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.L$3 = null;
        summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1.label = 2;
        e = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto, sqs0Var, false, false, g, summaryPromotionModalWindowsOnOrderModelMapper$mapSlot$1);
        if (e != coroutineSingletons2) {
        }
    }

    public final Object b(flv0 flv0Var, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SummaryPromotionModalWindowsOnOrderModelMapper$toUiState$2(flv0Var, null, this), continuation);
    }
}
