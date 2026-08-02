package ru.yandex.taxi.summary.solid.preview_card.data;

import com.yandex.go.zone.dto.objects.SummaryCardPromo;
import defpackage.fev0;
import defpackage.g050;
import defpackage.hev0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.preview_card.data.SummaryCardPromoStateAppearanceRepository$update$2", f = "SummaryCardPromoStateAppearanceRepository.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryCardPromoStateAppearanceRepository$update$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    final /* synthetic */ hev0 $stateAppearance;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryCardPromoStateAppearanceRepository$update$2(hev0 hev0Var, a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$stateAppearance = hev0Var;
        this.this$0 = aVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryCardPromoStateAppearanceRepository$update$2(this.$stateAppearance, this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryCardPromoStateAppearanceRepository$update$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        SummaryCardPromo.ShowPolicy showPolicy;
        a aVar;
        hev0 hev0Var;
        int i2;
        g050 g050Var;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        zy11 zy11Var = zy11.a;
        if (i3 == 0) {
            b.b(obj);
            hev0 hev0Var2 = this.$stateAppearance;
            i = hev0Var2.c;
            SummaryCardPromo summaryCardPromo = hev0Var2.d;
            if (summaryCardPromo == null || (showPolicy = summaryCardPromo.g) == null) {
                return zy11Var;
            }
            int i4 = showPolicy.b;
            aVar = this.this$0;
            kotlinx.coroutines.sync.a aVar2 = aVar.e;
            String str2 = this.$id;
            this.L$0 = aVar2;
            this.L$1 = aVar;
            this.L$2 = str2;
            this.L$3 = hev0Var2;
            this.I$0 = i;
            this.I$1 = i4;
            this.label = 1;
            if (aVar2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            hev0Var = hev0Var2;
            i2 = i4;
            g050Var = aVar2;
            str = str2;
        } else {
            if (i3 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$1;
            i = this.I$0;
            hev0Var = (hev0) this.L$3;
            str = (String) this.L$2;
            aVar = (a) this.L$1;
            g050Var = (g050) this.L$0;
            b.b(obj);
        }
        try {
            ConcurrentHashMap concurrentHashMap = aVar.c;
            fev0 fev0Var = aVar.a;
            concurrentHashMap.put(str, hev0Var);
            tje.N(fev0Var.b, null, null, new SummaryCardPromoShowPolicyDataSource$setShowCount$1(fev0Var, str, i, null), 3);
            tje.N(fev0Var.b, null, null, new SummaryCardPromoShowPolicyDataSource$setMaxShowCount$1(fev0Var, str, i2, null), 3);
            return zy11Var;
        } finally {
            g050Var.d(null);
        }
    }
}
